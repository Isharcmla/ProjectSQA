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

public class SummaryStatistics_addValue_1491054911281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73732;

    public SummaryStatistics_addValue_1491054911281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73732 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term73842 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term73970 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term74074 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term74184 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term74288 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        setDoubleField(term73842, term73842.getClass(), "value", 7.2059793061718176E16);
        setLongField(term73842, term73842.getClass(), "n", 0L);
        setField(term73732, term73732.getClass(), "sumImpl", term73842);
        setDoubleField(term73970, term73970.getClass(), "value", 7.2059793061718176E16);
        setLongField(term73970, term73970.getClass(), "n", 0L);
        setField(term73732, term73732.getClass(), "sumsqImpl", term73970);
        setDoubleField(term74074, term74074.getClass(), "value", 7.2059793061718176E16);
        setLongField(term74074, term74074.getClass(), "n", 0L);
        setField(term73732, term73732.getClass(), "minImpl", term74074);
        setBooleanField(term74184, term74184.getClass(), "incMoment", false);
        setField(term73732, term73732.getClass(), "maxImpl", term74184);
        setField(term73732, term73732.getClass(), "sumLogImpl", term74288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.577718159285469E-231;
        try {
            callMethod(klass, "addValue", argTypes, term73732, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


