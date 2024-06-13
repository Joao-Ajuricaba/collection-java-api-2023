package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate,Eventos> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Eventos eventos = new Eventos(nome,atracao);
        eventosMap.put(data,new Eventos(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate , Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Eventos> values = eventosMap.values();*/
        //eventosMap.get();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData= null;
        Eventos proximoEvento=null;
        Map<LocalDate , Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate,Eventos> entry :eventosMap.entrySet() ){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData=entry.getKey();
                proximoEvento=entry.getValue();
                System.out.println("O próximo evento : "+proximaData+" acontecerá na data "+proximoEvento);
                break;
            }
        }
    }






}
