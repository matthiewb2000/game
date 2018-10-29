import javafx.scene.control.Button;
public class team
{
  private String name;
  private int rank;
  Button tBut;
  private String accro;
  public team()
  {
      name=" ";
      rank=0;
      tBut.setText(" ");
      tBut.setTranslateX(0);
      tBut.setTranslateY(0);
      tBut.setVisible(false);
      accro=" ";
  }
  public team(String n, int r, Button t, String a)
  {
      this.name=n;
      this.rank=r;
      this.tBut=t;
      this.accro=a;
  }
  public String getName()
  {
    return name;
  }
  public int getRank()
  {
    return rank;  
  }
  public Button getTBut()
  {
    return tBut;
  }
  public String getAccro()
  {
    return accro;
  }
  public void setName(String n)
  {
    name=n;
  }
  public void setRank(int r)
  {
    rank=r;
  }
  public void setTBut(Button t)
  {
    tBut=t;
  }
  public void setAccro(String a)
  {
    accro=a;
  }
  public String toString()
  {
    return name+" "+accro+rank;
  }
}
