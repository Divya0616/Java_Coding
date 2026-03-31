/*
-> design locker system where user can store items securely each locker protect its internal
   data and controlled opearation 

requitements:
1) each locker has 
-lockerid
-islocked(boolean)
-pin
-storeditem

2)operation
-storitem(item,pin)
-retrieveitem(pin)
-lock()
-unlock(pin)

3) rules
-items cannot access directily
-locker opens only with crt pin 
-invalid acces should be blocked
 */
class Locker{
    private int LockerId;
    private int pin;
    private boolean isLocked;
    private String item;
    Locker(int lockerid,int pin){
        this.LockerId=lockerid;
        this.pin=pin;
        isLocked=true;
    }
    public void StoreItem(String item,int pin){
        if(this.pin==pin){
            if(!isLocked){
                this.item=item;
                System.out.println("Item Stored: "+item);
            }        
            else{
                System.out.println("Locker is Locked");
            }
        }
        else{
            System.out.println("Entered Pin is Wrong");
        }
    }
    public void retrieveItem(int pin){
        if(this.pin==pin){
            if(!isLocked && item!=null){
                System.out.println("Retrieved item: "+item);
                item=null;
            }
            else if(item==null){
                System.out.println("Locked is Empty");
            }
            else{
                System.out.println("Locker is Locked");
            }
        }
        else{
            System.out.println("The Pin is Wrong");
        }
    }
    public void Lock(){
        System.out.println("Locker is Locked");
        isLocked=true;
    }
    public void unLock(int pin){
        if(this.pin==pin){
            System.out.println("Locker is Unlocked");
            isLocked=false;
        }
        else{
            System.out.println("Wrong Pin");
        }
    }
    
}
public class LockerSystem {
    public static void main(String[] args){
        Locker lc=new Locker(101,1430);
        lc.unLock(1430);
        lc.StoreItem("lap", 1430);
        lc.retrieveItem(1430);
        lc.Lock();
    }
}
