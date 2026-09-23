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

public class SummaryStatistics_equals_1846114248205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46506;
     Object term46648;
     Object term47183;
     Object term47185;

    public SummaryStatistics_equals_1846114248205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46506 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term46610 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(term46506, term46506.getClass(), "geoMeanImpl", term46610);
        term46648 = newInstance(Class.forName("java.lang.Object"));
        term47183 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term47184 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        setLongField(term47183, term47183.getClass(), "n", 0L);
        setField(term47183, term47183.getClass(), "secondMoment", null);
        setField(term47183, term47183.getClass(), "sum", null);
        setField(term47183, term47183.getClass(), "sumsq", null);
        setField(term47183, term47183.getClass(), "min", null);
        setField(term47183, term47183.getClass(), "max", null);
        setField(term47183, term47183.getClass(), "sumLog", null);
        setField(term47183, term47183.getClass(), "geoMean", null);
        setField(term47183, term47183.getClass(), "mean", null);
        setField(term47183, term47183.getClass(), "variance", null);
        setField(term47183, term47183.getClass(), "sumImpl", null);
        setField(term47183, term47183.getClass(), "sumsqImpl", null);
        setField(term47183, term47183.getClass(), "minImpl", null);
        setField(term47183, term47183.getClass(), "maxImpl", null);
        setField(term47183, term47183.getClass(), "sumLogImpl", null);
        setLongField(term47184, term47184.getClass(), "n", 0L);
        setDoubleField(term47184, term47184.getClass(), "value", 0.0);
        setField(term47184, term47184.getClass(), "storedData", null);
        setField(term47183, term47183.getClass(), "geoMeanImpl", term47184);
        setField(term47183, term47183.getClass(), "meanImpl", null);
        setField(term47183, term47183.getClass(), "varianceImpl", null);
        term47185 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term46648;
        Object retValue = callMethod(klass, "equals", argTypes, term46506, args);
        assertTrue(recursiveEquals(term46506, term47183));
        assertTrue(recursiveEquals(term46648, term47185));
        assertTrue(recursiveEquals(retValue, false));
    }

};


