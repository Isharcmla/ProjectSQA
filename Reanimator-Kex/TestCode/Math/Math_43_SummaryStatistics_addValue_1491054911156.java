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

public class SummaryStatistics_addValue_1491054911156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31178;

    public SummaryStatistics_addValue_1491054911156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31178 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term31288 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term31416 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term31520 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term31630 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        setDoubleField(term31288, term31288.getClass(), "value", -9.2143472454139904E18);
        setLongField(term31288, term31288.getClass(), "n", 0L);
        setField(term31178, term31178.getClass(), "sumImpl", term31288);
        setDoubleField(term31416, term31416.getClass(), "value", -9.2143472454139904E18);
        setLongField(term31416, term31416.getClass(), "n", 0L);
        setField(term31178, term31178.getClass(), "sumsqImpl", term31416);
        setDoubleField(term31520, term31520.getClass(), "value", -9.2143472454139904E18);
        setLongField(term31520, term31520.getClass(), "n", 0L);
        setField(term31178, term31178.getClass(), "minImpl", term31520);
        setField(term31178, term31178.getClass(), "maxImpl", term31630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -4.46753110653399E-308;
        try {
            callMethod(klass, "addValue", argTypes, term31178, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


