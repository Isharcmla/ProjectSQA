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

public class SummaryStatistics_clear_1636977397307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161650;

    public SummaryStatistics_clear_1636977397307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161650 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term161768 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term161886 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term162004 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term162122 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term162240 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        setLongField(term161650, term161650.getClass(), "n", 0L);
        setDoubleField(term161768, term161768.getClass(), "value", 0.0);
        setLongField(term161768, term161768.getClass(), "n", 0L);
        setField(term161650, term161650.getClass(), "minImpl", term161768);
        setDoubleField(term161886, term161886.getClass(), "value", 0.0);
        setLongField(term161886, term161886.getClass(), "n", 0L);
        setField(term161650, term161650.getClass(), "maxImpl", term161886);
        setDoubleField(term162004, term162004.getClass(), "value", 0.0);
        setLongField(term162004, term162004.getClass(), "n", 0L);
        setField(term161650, term161650.getClass(), "sumImpl", term162004);
        setDoubleField(term162122, term162122.getClass(), "value", 0.0);
        setLongField(term162122, term162122.getClass(), "n", 0L);
        setField(term161650, term161650.getClass(), "sumLogImpl", term162122);
        setField(term161650, term161650.getClass(), "sumsqImpl", term162240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term161650, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


