import React from "react";
import { StyleSheet, Text, View, TextInput } from 'react-native';



export default ({n1, n2}) => {

    let maior;
    let menor;
    let igual = false;

    if(n1 > n2){
        maior = n1;
        menor = n2; 
    }
    else if(n1 == n2){
        igual = true;
    }
    else{
        maior = n2;
        menor = n1;
    }

    return(
        igual ? <Text>Os valores {n1} e {n2} são iguais!</Text> :
        <Text>O número maior é o: {maior}, e o menor é o: {menor}</Text>
    )
}