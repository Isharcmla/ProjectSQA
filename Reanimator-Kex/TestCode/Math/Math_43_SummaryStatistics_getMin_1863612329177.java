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

public class SummaryStatistics_getMin_1863612329177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39261;
     Object term39404;

    public SummaryStatistics_getMin_1863612329177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39261 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term39387 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(term39261, term39261.getClass(), "minImpl", term39387);
        term39404 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term39405 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setLongField(term39404, term39404.getClass(), "n", 0L);
        setField(term39404, term39404.getClass(), "secondMoment", null);
        setField(term39404, term39404.getClass(), "sum", null);
        setField(term39404, term39404.getClass(), "sumsq", null);
        setField(term39404, term39404.getClass(), "min", null);
        setField(term39404, term39404.getClass(), "max", null);
        setField(term39404, term39404.getClass(), "sumLog", null);
        setField(term39404, term39404.getClass(), "geoMean", null);
        setField(term39404, term39404.getClass(), "mean", null);
        setField(term39404, term39404.getClass(), "variance", null);
        setField(term39404, term39404.getClass(), "sumImpl", null);
        setField(term39404, term39404.getClass(), "sumsqImpl", null);
        setDoubleField(term39405, term39405.getClass(), "m2", 0.0);
        setLongField(term39405, term39405.getClass(), "n", 0L);
        setDoubleField(term39405, term39405.getClass(), "m1", 0.0);
        setDoubleField(term39405, term39405.getClass(), "dev", 0.0);
        setDoubleField(term39405, term39405.getClass(), "nDev", 0.0);
        setField(term39405, term39405.getClass(), "storedData", null);
        setField(term39404, term39404.getClass(), "minImpl", term39405);
        setField(term39404, term39404.getClass(), "maxImpl", null);
        setField(term39404, term39404.getClass(), "sumLogImpl", null);
        setField(term39404, term39404.getClass(), "geoMeanImpl", null);
        setField(term39404, term39404.getClass(), "meanImpl", null);
        setField(term39404, term39404.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMin", argTypes, term39261, args);
        assertTrue(recursiveEquals(term39261, term39404));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


