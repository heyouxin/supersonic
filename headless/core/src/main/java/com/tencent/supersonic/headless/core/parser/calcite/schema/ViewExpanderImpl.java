package com.tencent.supersonic.headless.core.parser.calcite.schema;

import java.util.List;
import org.apache.calcite.plan.RelOptTable;
import org.apache.calcite.rel.RelRoot;
import org.apache.calcite.rel.type.RelDataType;

/**
 * customize the  ViewExpander
 */
public class ViewExpanderImpl implements RelOptTable.ViewExpander {
    public ViewExpanderImpl() {
    }

    @Override
    public RelRoot expandView(RelDataType rowType, String queryString, List<String> schemaPath,
            List<String> viewPath) {
        return null;
    }
}