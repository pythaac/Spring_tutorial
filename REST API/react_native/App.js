import React, { useState } from 'react';
import { View, Text, Button, StyleSheet } from 'react-native';

const App = () => {
  const [count, setCount] = useState(0);
  const [txt, setTxt] = useState('');
  const ip = ''; // Fill server ip out

  const getText = () => {
    fetch(`http://${ip}:8080/restTest?str=${count}`)
      //.then((response) => response.json())
      .then(response => response.text())
      .then(text => setTxt(text))
      .then(setCount(count + 1));
  };

  return (
    <View style={styles.container}>
      <Text>{txt}</Text>
      <Button
        onPress={getText}
        title="Click Me!"
      />
    </View>
  );
};

// React Native Styles
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center'
  }
});


export default App;
