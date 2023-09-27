package jp.co.internous.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.ecsite.model.domain.MstUser;
import jp.co.internous.ecsite.model.form.LoginForm;

@Mapper
public interface MstUserMapper {
	
//	mst_userテーブルの入力されたユーザー名とパスワードのデータをMstUser方でリストにマッピング
	@Select(value="SELECT * FROM mst_user WHERE user_name = #{userName} and password = #{password}")
	MstUser findByUserNameAndPassword(LoginForm form);
	
	@Select(value="SELECT count(id) FROM mst_user WHERE user_name = #{userName}")
	int findCountByUserName(String userName);

//	DB:mst_usersのデータ全てを取得し、List<MstUser>型でリストにマッピング
	@Select(value="SELECT * FROM mst_user")
	List<MstUser> findAll();
	
//	商品名と値段をテーブルに追加
	@Insert("INSERT INTO mst_user (user_name, full_name, password) VALUES (#{userName}, #{fullName}, #{password})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	int insert(MstUser user);
	
//	テーブルから指定IDの行を削除
	@Update("DELETE FROM mst_user WHERE id = #{id}")
	int deleteById(long id);
}
