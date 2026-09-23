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

public class SummaryStatistics_equals_184611424886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12519;
     Object term13035;
     Object term13036;

    public SummaryStatistics_equals_184611424886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12519 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        term13035 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term13035, term13035.getClass(), "n", 0L);
        setField(term13035, term13035.getClass(), "secondMoment", null);
        setField(term13035, term13035.getClass(), "sum", null);
        setField(term13035, term13035.getClass(), "sumsq", null);
        setField(term13035, term13035.getClass(), "min", null);
        setField(term13035, term13035.getClass(), "max", null);
        setField(term13035, term13035.getClass(), "sumLog", null);
        setField(term13035, term13035.getClass(), "geoMean", null);
        setField(term13035, term13035.getClass(), "mean", null);
        setField(term13035, term13035.getClass(), "variance", null);
        setField(term13035, term13035.getClass(), "sumImpl", null);
        setField(term13035, term13035.getClass(), "sumsqImpl", null);
        setField(term13035, term13035.getClass(), "minImpl", null);
        setField(term13035, term13035.getClass(), "maxImpl", null);
        setField(term13035, term13035.getClass(), "sumLogImpl", null);
        setField(term13035, term13035.getClass(), "geoMeanImpl", null);
        setField(term13035, term13035.getClass(), "meanImpl", null);
        setField(term13035, term13035.getClass(), "varianceImpl", null);
        term13036 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term13036, term13036.getClass(), "n", 0L);
        setField(term13036, term13036.getClass(), "secondMoment", null);
        setField(term13036, term13036.getClass(), "sum", null);
        setField(term13036, term13036.getClass(), "sumsq", null);
        setField(term13036, term13036.getClass(), "min", null);
        setField(term13036, term13036.getClass(), "max", null);
        setField(term13036, term13036.getClass(), "sumLog", null);
        setField(term13036, term13036.getClass(), "geoMean", null);
        setField(term13036, term13036.getClass(), "mean", null);
        setField(term13036, term13036.getClass(), "variance", null);
        setField(term13036, term13036.getClass(), "sumImpl", null);
        setField(term13036, term13036.getClass(), "sumsqImpl", null);
        setField(term13036, term13036.getClass(), "minImpl", null);
        setField(term13036, term13036.getClass(), "maxImpl", null);
        setField(term13036, term13036.getClass(), "sumLogImpl", null);
        setField(term13036, term13036.getClass(), "geoMeanImpl", null);
        setField(term13036, term13036.getClass(), "meanImpl", null);
        setField(term13036, term13036.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12519;
        Object retValue = callMethod(klass, "equals", argTypes, term12519, args);
        assertTrue(recursiveEquals(term12519, term13035));
        assertTrue(recursiveEquals(term12519, term13036));
        assertTrue(recursiveEquals(retValue, true));
    }

};


