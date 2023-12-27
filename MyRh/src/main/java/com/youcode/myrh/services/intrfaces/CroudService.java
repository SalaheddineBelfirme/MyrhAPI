package com.youcode.myrh.services.intrfaces;

import java.util.List;

public interface CroudService<ID,ER,RS> {
   RS create(ER e);
   boolean delete(ID id);
   List<RS> getALl();
   RS update(ER e);
   RS getOne(ID id);


}
