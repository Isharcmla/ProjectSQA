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

public class SummaryStatistics_addValue_1491054911280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73085;

    public SummaryStatistics_addValue_1491054911280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73085 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term73195 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term73323 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term73427 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term73553 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setDoubleField(term73195, term73195.getClass(), "value", 4.503600169091338E15);
        setLongField(term73195, term73195.getClass(), "n", -3L);
        setField(term73085, term73085.getClass(), "sumImpl", term73195);
        setDoubleField(term73323, term73323.getClass(), "value", 4.503600169091338E15);
        setLongField(term73323, term73323.getClass(), "n", -3L);
        setField(term73085, term73085.getClass(), "sumsqImpl", term73323);
        setDoubleField(term73427, term73427.getClass(), "value", 4.503600169091338E15);
        setLongField(term73427, term73427.getClass(), "n", -144115188075855873L);
        setField(term73085, term73085.getClass(), "minImpl", term73427);
        setLongField(term73553, term73553.getClass(), "n", 2147483648L);
        setDoubleField(term73553, term73553.getClass(), "m4", 0.0);
        setDoubleField(term73553, term73553.getClass(), "m3", 0.0);
        setDoubleField(term73553, term73553.getClass(), "m2", 0.0);
        setDoubleField(term73553, term73553.getClass(), "m1", 0.0);
        setField(term73085, term73085.getClass(), "maxImpl", term73553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 1.078223705E-314;
        try {
            callMethod(klass, "addValue", argTypes, term73085, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


