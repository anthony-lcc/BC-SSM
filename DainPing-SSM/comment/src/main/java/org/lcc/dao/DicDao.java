package org.lcc.dao;

import java.util.List;

import org.lcc.bean.Dic;

public interface DicDao {
    List<Dic> select(Dic dic);
}