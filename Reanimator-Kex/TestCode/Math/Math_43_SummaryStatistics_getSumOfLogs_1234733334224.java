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
import java.lang.Object;

public class SummaryStatistics_getSumOfLogs_1234733334224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51948;
     Object term52599;

    public SummaryStatistics_getSumOfLogs_1234733334224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51948 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term52052 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(term51948, term51948.getClass(), "sumLogImpl", term52052);
        term52599 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term52600 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        setLongField(term52599, term52599.getClass(), "n", 0L);
        setField(term52599, term52599.getClass(), "secondMoment", null);
        setField(term52599, term52599.getClass(), "sum", null);
        setField(term52599, term52599.getClass(), "sumsq", null);
        setField(term52599, term52599.getClass(), "min", null);
        setField(term52599, term52599.getClass(), "max", null);
        setField(term52599, term52599.getClass(), "sumLog", null);
        setField(term52599, term52599.getClass(), "geoMean", null);
        setField(term52599, term52599.getClass(), "mean", null);
        setField(term52599, term52599.getClass(), "variance", null);
        setField(term52599, term52599.getClass(), "sumImpl", null);
        setField(term52599, term52599.getClass(), "sumsqImpl", null);
        setField(term52599, term52599.getClass(), "minImpl", null);
        setField(term52599, term52599.getClass(), "maxImpl", null);
        setLongField(term52600, term52600.getClass(), "n", 0L);
        setDoubleField(term52600, term52600.getClass(), "value", 0.0);
        setField(term52600, term52600.getClass(), "storedData", null);
        setField(term52599, term52599.getClass(), "sumLogImpl", term52600);
        setField(term52599, term52599.getClass(), "geoMeanImpl", null);
        setField(term52599, term52599.getClass(), "meanImpl", null);
        setField(term52599, term52599.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSumOfLogs", argTypes, term51948, args);
        assertTrue(recursiveEquals(term51948, term52599));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


