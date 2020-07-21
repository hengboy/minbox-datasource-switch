package org.minbox.framework.datasource.annotation;

import java.lang.annotation.*;

/**
 * data source switch annotation
 *
 * @author 恒宇少年
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface DataSourceSwitch {
    /**
     * data source pool name
     *
     * @return pool name
     */
    String value();
}
