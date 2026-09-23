package org.apache.commons.math.stat.descriptive;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.descriptive.EqualityUtils.*;

public class SummaryStatistics_setMinImpl_213160179898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14992;
     Object term15247;

    public SummaryStatistics_setMinImpl_213160179898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14992 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term14992, term14992.getClass(), "n", 0L);
        term15247 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term15247, term15247.getClass(), "n", 0L);
        setField(term15247, term15247.getClass(), "secondMoment", null);
        setField(term15247, term15247.getClass(), "sum", null);
        setField(term15247, term15247.getClass(), "sumsq", null);
        setField(term15247, term15247.getClass(), "min", null);
        setField(term15247, term15247.getClass(), "max", null);
        setField(term15247, term15247.getClass(), "sumLog", null);
        setField(term15247, term15247.getClass(), "geoMean", null);
        setField(term15247, term15247.getClass(), "mean", null);
        setField(term15247, term15247.getClass(), "variance", null);
        setField(term15247, term15247.getClass(), "sumImpl", null);
        setField(term15247, term15247.getClass(), "sumsqImpl", null);
        setField(term15247, term15247.getClass(), "minImpl", null);
        setField(term15247, term15247.getClass(), "maxImpl", null);
        setField(term15247, term15247.getClass(), "sumLogImpl", null);
        setField(term15247, term15247.getClass(), "geoMeanImpl", null);
        setField(term15247, term15247.getClass(), "meanImpl", null);
        setField(term15247, term15247.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMinImpl", argTypes, term14992, args);
        assertTrue(recursiveEquals(term14992, term15247));
    }

};


