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
import java.lang.Double;

public class SummaryStatistics_addValue_1491054911120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20342;

    public SummaryStatistics_addValue_1491054911120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20342 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term20452 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term20580 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term20698 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Kurtosis"));
        setDoubleField(term20452, term20452.getClass(), "value", 0.0);
        setLongField(term20452, term20452.getClass(), "n", 0L);
        setField(term20342, term20342.getClass(), "sumImpl", term20452);
        setDoubleField(term20580, term20580.getClass(), "value", 0.0);
        setLongField(term20580, term20580.getClass(), "n", 0L);
        setField(term20342, term20342.getClass(), "sumsqImpl", term20580);
        setField(term20342, term20342.getClass(), "minImpl", term20698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NaN;
        callMethod(klass, "addValue", argTypes, term20342, args);
    }

};


