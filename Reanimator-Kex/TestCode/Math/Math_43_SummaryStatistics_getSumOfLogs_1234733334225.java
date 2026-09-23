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

public class SummaryStatistics_getSumOfLogs_1234733334225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52462;
     Object term52623;

    public SummaryStatistics_getSumOfLogs_1234733334225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52462 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term52588 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setField(term52462, term52462.getClass(), "sumLogImpl", term52588);
        term52623 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term52624 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setLongField(term52623, term52623.getClass(), "n", 0L);
        setField(term52623, term52623.getClass(), "secondMoment", null);
        setField(term52623, term52623.getClass(), "sum", null);
        setField(term52623, term52623.getClass(), "sumsq", null);
        setField(term52623, term52623.getClass(), "min", null);
        setField(term52623, term52623.getClass(), "max", null);
        setField(term52623, term52623.getClass(), "sumLog", null);
        setField(term52623, term52623.getClass(), "geoMean", null);
        setField(term52623, term52623.getClass(), "mean", null);
        setField(term52623, term52623.getClass(), "variance", null);
        setField(term52623, term52623.getClass(), "sumImpl", null);
        setField(term52623, term52623.getClass(), "sumsqImpl", null);
        setField(term52623, term52623.getClass(), "minImpl", null);
        setField(term52623, term52623.getClass(), "maxImpl", null);
        setDoubleField(term52624, term52624.getClass(), "m4", 0.0);
        setDoubleField(term52624, term52624.getClass(), "m3", 0.0);
        setDoubleField(term52624, term52624.getClass(), "nDevSq", 0.0);
        setDoubleField(term52624, term52624.getClass(), "m2", 0.0);
        setLongField(term52624, term52624.getClass(), "n", 0L);
        setDoubleField(term52624, term52624.getClass(), "m1", 0.0);
        setDoubleField(term52624, term52624.getClass(), "dev", 0.0);
        setDoubleField(term52624, term52624.getClass(), "nDev", 0.0);
        setField(term52624, term52624.getClass(), "storedData", null);
        setField(term52623, term52623.getClass(), "sumLogImpl", term52624);
        setField(term52623, term52623.getClass(), "geoMeanImpl", null);
        setField(term52623, term52623.getClass(), "meanImpl", null);
        setField(term52623, term52623.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSumOfLogs", argTypes, term52462, args);
        assertTrue(recursiveEquals(term52462, term52623));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


