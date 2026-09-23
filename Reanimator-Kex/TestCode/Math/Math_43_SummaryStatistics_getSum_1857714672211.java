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

public class SummaryStatistics_getSum_1857714672211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48224;
     Object term48614;

    public SummaryStatistics_getSum_1857714672211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48224 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term48352 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(term48224, term48224.getClass(), "sumImpl", term48352);
        term48614 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term48615 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setLongField(term48614, term48614.getClass(), "n", 0L);
        setField(term48614, term48614.getClass(), "secondMoment", null);
        setField(term48614, term48614.getClass(), "sum", null);
        setField(term48614, term48614.getClass(), "sumsq", null);
        setField(term48614, term48614.getClass(), "min", null);
        setField(term48614, term48614.getClass(), "max", null);
        setField(term48614, term48614.getClass(), "sumLog", null);
        setField(term48614, term48614.getClass(), "geoMean", null);
        setField(term48614, term48614.getClass(), "mean", null);
        setField(term48614, term48614.getClass(), "variance", null);
        setLongField(term48615, term48615.getClass(), "n", 0L);
        setDoubleField(term48615, term48615.getClass(), "value", 0.0);
        setField(term48615, term48615.getClass(), "storedData", null);
        setField(term48614, term48614.getClass(), "sumImpl", term48615);
        setField(term48614, term48614.getClass(), "sumsqImpl", null);
        setField(term48614, term48614.getClass(), "minImpl", null);
        setField(term48614, term48614.getClass(), "maxImpl", null);
        setField(term48614, term48614.getClass(), "sumLogImpl", null);
        setField(term48614, term48614.getClass(), "geoMeanImpl", null);
        setField(term48614, term48614.getClass(), "meanImpl", null);
        setField(term48614, term48614.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSum", argTypes, term48224, args);
        assertTrue(recursiveEquals(term48224, term48614));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


