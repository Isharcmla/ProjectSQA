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
import java.lang.Double;

public class SummaryStatistics_addValue_1491054911297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157192;

    public SummaryStatistics_addValue_1491054911297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157192 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term157318 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term157436 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term157562 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setLongField(term157318, term157318.getClass(), "n", -4294967296L);
        setDoubleField(term157318, term157318.getClass(), "m2", 0.0);
        setDoubleField(term157318, term157318.getClass(), "m1", 0.0);
        setDoubleField(term157318, term157318.getClass(), "dev", 0.0);
        setDoubleField(term157318, term157318.getClass(), "nDev", 0.0);
        setField(term157192, term157192.getClass(), "sumImpl", term157318);
        setBooleanField(term157436, term157436.getClass(), "incMoment", false);
        setField(term157192, term157192.getClass(), "sumsqImpl", term157436);
        setLongField(term157562, term157562.getClass(), "n", 2147483648L);
        setField(term157192, term157192.getClass(), "minImpl", term157562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NaN;
        try {
            callMethod(klass, "addValue", argTypes, term157192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


