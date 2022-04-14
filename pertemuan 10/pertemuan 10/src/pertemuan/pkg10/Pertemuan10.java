package pertemuan.pkg10;

import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pertemuan10 {

    public static void main(String[] args) {
    List<CRD> cd = new Array List<CRD>();
for(int io=0; io<4; io++)
{
for(int qp=2; qp<15; qp++)
{
cd.add(new CRD (io,qp));
}
}

Collections.shuffle(cd, new Random());
Linked List<CRD> dck = new Linked List<CRD>();
Linked List<CRD> dck1 = new Linked List<CRD>();

dck.add All(cd.sub List(0, 25));
dck1.add All(cd.sub List(26, cd.size()));

while(true){
CRD pCrd = dck.pop();
CRD pCrd1 = dck1.pop();
System.out.println ("Player 1 plays card is " + pCrd.to String());
System.out.println ("Player 2 plays card is " + pCrd1.to String());
if(pCrd.get CRD() > pCrd1.get CRD()){
dck.add Last(pCrd);
dck.add Last(pCrd1);
System.out.println ("PLayer 1 wins the round");
}

else if(p Crd.get CRD() < p Crd1.get CRD()){
dck1.add Last(pCrd);
dck1.add Last(pCrd1);
System.out.println ("Player 2 wins the round");
}

else if(dck.size() == 0 )
{
System.out.println ("game over\ nPlayer 1 wins the game");
break;
}

else if(dck1.size() == 0)
{
System.out.println ("game over\nPlayer 2 wins the game");
break;
}
}
    }

}