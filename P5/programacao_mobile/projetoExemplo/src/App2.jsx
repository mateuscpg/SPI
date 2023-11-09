import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, TextInput } from 'react-native';
import Numeros from './components/Numeros'
import Primeiro from './components/Primeiro'
import Contador from './components/Contador';

function App () {
  return (
    <View style={styles.container}>

      {/* <Primeiro></Primeiro>

      <Numeros n1={5} n2={1}/> */}
      
      <Contador/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  form:{
    width: 200,
    backgroundColor: 'black',
    padding: 20,
    borderRadius: 6,
  },
  title_form:{
    textAlign: 'center',
    marginBottom: 10,
    color: 'white',
    fontWeight: 'bold',
    fontSize: 15,
  },
   label: {
    marginTop: 10,
     marginBottom: 10,
     color: 'white',
   },
  input: {
    padding: 5,
    backgroundColor: '#ccc',
    borderWidth: 2,
    borderColor: 'blue',
    borderRadius: 6,
  },

});
export default App;