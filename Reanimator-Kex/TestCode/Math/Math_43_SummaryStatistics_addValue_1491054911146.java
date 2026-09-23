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
import java.lang.Object;

public class SummaryStatistics_addValue_1491054911146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28405;

    public SummaryStatistics_addValue_1491054911146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28405 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term28515 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term28643 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term28747 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term28865 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Kurtosis"));
        setDoubleField(term28515, term28515.getClass(), "value", 4.503599627370532E15);
        setLongField(term28515, term28515.getClass(), "n", 0L);
        setField(term28405, term28405.getClass(), "sumImpl", term28515);
        setDoubleField(term28643, term28643.getClass(), "value", 4.503599627370532E15);
        setLongField(term28643, term28643.getClass(), "n", 0L);
        setField(term28405, term28405.getClass(), "sumsqImpl", term28643);
        setDoubleField(term28747, term28747.getClass(), "value", 4.503599627370532E15);
        setLongField(term28747, term28747.getClass(), "n", 0L);
        setField(term28405, term28405.getClass(), "minImpl", term28747);
        setField(term28405, term28405.getClass(), "maxImpl", term28865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.0000000000000075;
        callMethod(klass, "addValue", argTypes, term28405, args);
    }

};


