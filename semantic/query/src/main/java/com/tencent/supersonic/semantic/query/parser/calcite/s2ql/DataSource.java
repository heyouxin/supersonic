package com.tencent.supersonic.semantic.query.parser.calcite.s2ql;

import com.tencent.supersonic.semantic.query.parser.calcite.s2ql.Materialization.TimePartType;
import java.util.List;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class DataSource {

    private String name;

    private Long sourceId;

    private String sqlQuery;

    private String tableQuery;

    private List<Identify> identifiers;

    private List<Dimension> dimensions;

    private List<Measure> measures;

    private String aggTime;

    private TimePartType timePartType = TimePartType.None;
}