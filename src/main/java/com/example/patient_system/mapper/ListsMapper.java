//このインターフェースは、アルバムエンティティ（Album）のデータベース操作を定義するマッピングインターフェースとして機能します。MyBatisの注釈を使用してSQLクエリを定義します
//アルバムの作成、読み取り、更新、削除（CRUD）操作を定義します。
//アルバムと関連する音楽の数を取得する複合クエリを定義します。
package com.example.patient_system.mapper;
//entity.Albumをインポート
import com.example.patient_system.entity.Lists;
//Delate,Insert,Mapper,Options,Select,Update,AlbumViewModelをインポート
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//Listをインポート
import java.util.List;

//このインターフェースがMyBatisのMapperであることを示します。
@Mapper
public interface ListsMapper {

    //すべてのアルバムを取得します
    @Select("SELECT * FROM lists")
   List<Lists> selectAllLists();
} 

