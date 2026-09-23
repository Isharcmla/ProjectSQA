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

public class SummaryStatistics_addValue_1491054911270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68239;

    public SummaryStatistics_addValue_1491054911270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68239 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term68357 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term68483 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setDoubleField(term68357, term68357.getClass(), "value", 0.0);
        setLongField(term68357, term68357.getClass(), "n", -3L);
        setField(term68239, term68239.getClass(), "sumImpl", term68357);
        setLongField(term68483, term68483.getClass(), "n", 2147483648L);
        setDoubleField(term68483, term68483.getClass(), "m2", 0.0);
        setDoubleField(term68483, term68483.getClass(), "m1", 0.0);
        setField(term68239, term68239.getClass(), "sumsqImpl", term68483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NaN;
        try {
            callMethod(klass, "addValue", argTypes, term68239, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


