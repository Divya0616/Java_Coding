/*
Single Threading:
--runs step by step executes one task at a time

Disadvantages:
--Takes a long time
--It waits until blocking task to get completed

MultiThreading:
--run multiple parts of the program at the same time
concurrency: one CPU: task1->task2->task1->task2(switching btw tasks 1 and 2)
parallel:

Process:
(what runs inside the process - we call thread)
--Program currently running
--Processes does not share data easily
--Creating process is CPU heavy

Thread:
--Smallest unit of process that performs task
--Thread always belongs to task
--Multiple threads can exist inside one process
-- Thread extends thread class => run
-- thread implements Runnable interface => run

run() => acts as a normal function
start() => initailize thread, it will call run() internally
 

Lifrcycle of Thread(state):
New->Runnable(block/wait)->Running(block/wait)->Terminated
Runnable -> waiting queue in CPU => before running
Running -> Thread executing on CPU

*/

public class Intro {
    public static void main(String[] args){
        task1();
        task2();
    }
    static void task1(){
        for(int i=0;i<5;i++){
            System.out.println("From task 1: " + i);
        }
    }
    static void task2(){
        for(int j=0;j<5;j++){
            System.out.println("From task 2: " + j);
        }
    }
}
