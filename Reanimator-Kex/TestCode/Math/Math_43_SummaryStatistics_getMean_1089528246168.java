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

public class SummaryStatistics_getMean_1089528246168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36037;
     Object term36411;

    public SummaryStatistics_getMean_1089528246168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36037 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term36155 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        setField(term36037, term36037.getClass(), "meanImpl", term36155);
        term36411 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term36412 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        setLongField(term36411, term36411.getClass(), "n", 0L);
        setField(term36411, term36411.getClass(), "secondMoment", null);
        setField(term36411, term36411.getClass(), "sum", null);
        setField(term36411, term36411.getClass(), "sumsq", null);
        setField(term36411, term36411.getClass(), "min", null);
        setField(term36411, term36411.getClass(), "max", null);
        setField(term36411, term36411.getClass(), "sumLog", null);
        setField(term36411, term36411.getClass(), "geoMean", null);
        setField(term36411, term36411.getClass(), "mean", null);
        setField(term36411, term36411.getClass(), "variance", null);
        setField(term36411, term36411.getClass(), "sumImpl", null);
        setField(term36411, term36411.getClass(), "sumsqImpl", null);
        setField(term36411, term36411.getClass(), "minImpl", null);
        setField(term36411, term36411.getClass(), "maxImpl", null);
        setField(term36411, term36411.getClass(), "sumLogImpl", null);
        setField(term36411, term36411.getClass(), "geoMeanImpl", null);
        setLongField(term36412, term36412.getClass(), "n", 0L);
        setDoubleField(term36412, term36412.getClass(), "value", 0.0);
        setField(term36412, term36412.getClass(), "storedData", null);
        setField(term36411, term36411.getClass(), "meanImpl", term36412);
        setField(term36411, term36411.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMean", argTypes, term36037, args);
        assertTrue(recursiveEquals(term36037, term36411));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


