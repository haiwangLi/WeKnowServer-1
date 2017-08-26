package cn.edu.cqut.weknow.po.mapper;

import cn.edu.cqut.weknow.po.Feedbacks;
import cn.edu.cqut.weknow.po.FeedbacksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbacksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    int countByExample(FeedbacksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    int deleteByExample(FeedbacksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    int insert(Feedbacks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    int insertSelective(Feedbacks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    List<Feedbacks> selectByExample(FeedbacksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    Feedbacks selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    int updateByExampleSelective(@Param("record") Feedbacks record, @Param("example") FeedbacksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    int updateByExample(@Param("record") Feedbacks record, @Param("example") FeedbacksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    int updateByPrimaryKeySelective(Feedbacks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbacks
     *
     * @mbggenerated Wed Aug 23 09:33:29 CST 2017
     */
    int updateByPrimaryKey(Feedbacks record);
}