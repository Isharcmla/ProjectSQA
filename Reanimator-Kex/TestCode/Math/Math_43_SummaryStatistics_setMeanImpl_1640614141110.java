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

public class SummaryStatistics_setMeanImpl_1640614141110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17163;
     Object term17417;

    public SummaryStatistics_setMeanImpl_1640614141110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17163 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term17163, term17163.getClass(), "n", 0L);
        term17417 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term17417, term17417.getClass(), "n", 0L);
        setField(term17417, term17417.getClass(), "secondMoment", null);
        setField(term17417, term17417.getClass(), "sum", null);
        setField(term17417, term17417.getClass(), "sumsq", null);
        setField(term17417, term17417.getClass(), "min", null);
        setField(term17417, term17417.getClass(), "max", null);
        setField(term17417, term17417.getClass(), "sumLog", null);
        setField(term17417, term17417.getClass(), "geoMean", null);
        setField(term17417, term17417.getClass(), "mean", null);
        setField(term17417, term17417.getClass(), "variance", null);
        setField(term17417, term17417.getClass(), "sumImpl", null);
        setField(term17417, term17417.getClass(), "sumsqImpl", null);
        setField(term17417, term17417.getClass(), "minImpl", null);
        setField(term17417, term17417.getClass(), "maxImpl", null);
        setField(term17417, term17417.getClass(), "sumLogImpl", null);
        setField(term17417, term17417.getClass(), "geoMeanImpl", null);
        setField(term17417, term17417.getClass(), "meanImpl", null);
        setField(term17417, term17417.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMeanImpl", argTypes, term17163, args);
        assertTrue(recursiveEquals(term17163, term17417));
    }

};


