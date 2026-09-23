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

public class SummaryStatistics_getVariance_1922852450186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41054;
     Object term41722;

    public SummaryStatistics_getVariance_1922852450186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41054 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term41172 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        setField(term41054, term41054.getClass(), "varianceImpl", term41172);
        term41722 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term41723 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        setLongField(term41722, term41722.getClass(), "n", 0L);
        setField(term41722, term41722.getClass(), "secondMoment", null);
        setField(term41722, term41722.getClass(), "sum", null);
        setField(term41722, term41722.getClass(), "sumsq", null);
        setField(term41722, term41722.getClass(), "min", null);
        setField(term41722, term41722.getClass(), "max", null);
        setField(term41722, term41722.getClass(), "sumLog", null);
        setField(term41722, term41722.getClass(), "geoMean", null);
        setField(term41722, term41722.getClass(), "mean", null);
        setField(term41722, term41722.getClass(), "variance", null);
        setField(term41722, term41722.getClass(), "sumImpl", null);
        setField(term41722, term41722.getClass(), "sumsqImpl", null);
        setField(term41722, term41722.getClass(), "minImpl", null);
        setField(term41722, term41722.getClass(), "maxImpl", null);
        setField(term41722, term41722.getClass(), "sumLogImpl", null);
        setField(term41722, term41722.getClass(), "geoMeanImpl", null);
        setField(term41722, term41722.getClass(), "meanImpl", null);
        setLongField(term41723, term41723.getClass(), "n", 0L);
        setDoubleField(term41723, term41723.getClass(), "value", 0.0);
        setField(term41723, term41723.getClass(), "storedData", null);
        setField(term41722, term41722.getClass(), "varianceImpl", term41723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVariance", argTypes, term41054, args);
        assertTrue(recursiveEquals(term41054, term41722));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


