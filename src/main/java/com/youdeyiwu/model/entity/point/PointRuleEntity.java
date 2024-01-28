package com.youdeyiwu.model.entity.point;

import com.youdeyiwu.enums.point.RuleNameEnum;
import com.youdeyiwu.model.entity.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * point rule.
 *
 * @author dafengzhen
 */
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@Entity
public class PointRuleEntity extends AbstractEntity {

  /**
   * rule name (The name of the rule for manually managing points, which can be considered proactive).
   */
  @Enumerated(EnumType.STRING)
  @Column(unique = true)
  private RuleNameEnum ruleName;

  /**
   * required points.
   */
  private Integer requiredPoints = 0;

}