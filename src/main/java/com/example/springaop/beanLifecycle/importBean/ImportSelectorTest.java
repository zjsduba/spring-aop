package com.example.springaop.beanLifecycle.importBean;

import com.example.springaop.beanLifecycle.bean.Blue;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: lsp
 * @Date: 2020/12/3 17:16
 * @Version 1.0
 * @Description:
 */
public class ImportSelectorTest implements ImportSelector {
    /**
     * Select and return the names of which class(es) should be imported based on
     * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
     *
     * @param importingClassMetadata
     * @return the class names, or an empty array if none
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Blue.class.getName()};
    }
}
