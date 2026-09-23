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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SummaryStatistics_getSummary_1667812889301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158828;

    public SummaryStatistics_getSummary_1667812889301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158828 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics$AggregatingSummaryStatistics"));
        Object term158954 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term159082 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term159200 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setDoubleField(term158954, term158954.getClass(), "m2", 0.0);
        setField(term158828, term158828.getClass(), "meanImpl", term158954);
        setDoubleField(term159082, term159082.getClass(), "value", 0.0);
        setField(term158828, term158828.getClass(), "varianceImpl", term159082);
        setLongField(term158828, term158828.getClass(), "n", 0L);
        setField(term158828, term158828.getClass(), "maxImpl", term159200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSummary", argTypes, term158828, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


