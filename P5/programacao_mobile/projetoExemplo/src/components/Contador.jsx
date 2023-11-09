import React, {useState} from "react";
import { Text, Button, View, StyleSheet } from "react-native";

export default ({ inicial = 0, passo = 1 }) => {

    const [numero, setNumero] = useState(inicial);

    function inc(){
       setNumero(numero + passo);
    }

    function dec(){
        setNumero(numero - passo);
    }
    function calcular(){
        
        numero % 2 == 0 ? console.warn("Par") : console.warn("Impar")
    }

    return (
        <>
            <Text style={{fontSize:50}}>
                {numero}
            </Text>
            <View style={{flexDirection: "row", gap:10}}>
                <Button
                    title="+"
                    onPress={inc}
                />
                <Button
                    title="-"
                    onPress={dec}
                />
            </View>
            <View style={{marginTop:15}}>
                <Button
                title="Calcular"
                onPress={calcular}
                />
            </View>
            
            
            
        </>
        
    )

}
 const styles = StyleSheet.create({
    
 })