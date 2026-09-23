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

public class SummaryStatistics_getSummary_1667812889269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67840;

    public SummaryStatistics_getSummary_1667812889269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67840 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term67950 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term68078 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        setDoubleField(term67950, term67950.getClass(), "value", 0.0);
        setField(term67840, term67840.getClass(), "meanImpl", term67950);
        setField(term67840, term67840.getClass(), "varianceImpl", term68078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSummary", argTypes, term67840, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


