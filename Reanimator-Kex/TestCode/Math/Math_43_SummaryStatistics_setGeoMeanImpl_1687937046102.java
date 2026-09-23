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

public class SummaryStatistics_setGeoMeanImpl_1687937046102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15634;
     Object term15888;

    public SummaryStatistics_setGeoMeanImpl_1687937046102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15634 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term15634, term15634.getClass(), "n", 0L);
        term15888 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term15888, term15888.getClass(), "n", 0L);
        setField(term15888, term15888.getClass(), "secondMoment", null);
        setField(term15888, term15888.getClass(), "sum", null);
        setField(term15888, term15888.getClass(), "sumsq", null);
        setField(term15888, term15888.getClass(), "min", null);
        setField(term15888, term15888.getClass(), "max", null);
        setField(term15888, term15888.getClass(), "sumLog", null);
        setField(term15888, term15888.getClass(), "geoMean", null);
        setField(term15888, term15888.getClass(), "mean", null);
        setField(term15888, term15888.getClass(), "variance", null);
        setField(term15888, term15888.getClass(), "sumImpl", null);
        setField(term15888, term15888.getClass(), "sumsqImpl", null);
        setField(term15888, term15888.getClass(), "minImpl", null);
        setField(term15888, term15888.getClass(), "maxImpl", null);
        setField(term15888, term15888.getClass(), "sumLogImpl", null);
        setField(term15888, term15888.getClass(), "geoMeanImpl", null);
        setField(term15888, term15888.getClass(), "meanImpl", null);
        setField(term15888, term15888.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGeoMeanImpl", argTypes, term15634, args);
        assertTrue(recursiveEquals(term15634, term15888));
    }

};


