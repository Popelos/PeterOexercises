/**
 *
 * @author popelos
 */
public class Pets {
    
    String nickName;
    String type;

    public Pets() {
    }
    public Pets(String nickName, String type) {
        this.nickName = nickName;
        this.type = type;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pets{" + "nickName= " + nickName + ", type= " + type + '}';
    }
    
    
}
