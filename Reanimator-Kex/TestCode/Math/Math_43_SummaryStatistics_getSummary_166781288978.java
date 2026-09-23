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

public class SummaryStatistics_getSummary_166781288978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1954;

    public SummaryStatistics_getSummary_166781288978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1954 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term1954, term1954.getClass(), "n", 0L);
        setField(term1954, term1954.getClass(), "secondMoment", null);
        setField(term1954, term1954.getClass(), "sum", null);
        setField(term1954, term1954.getClass(), "sumsq", null);
        setField(term1954, term1954.getClass(), "min", null);
        setField(term1954, term1954.getClass(), "max", null);
        setField(term1954, term1954.getClass(), "sumLog", null);
        setField(term1954, term1954.getClass(), "geoMean", null);
        setField(term1954, term1954.getClass(), "mean", null);
        setField(term1954, term1954.getClass(), "variance", null);
        setField(term1954, term1954.getClass(), "sumImpl", null);
        setField(term1954, term1954.getClass(), "sumsqImpl", null);
        setField(term1954, term1954.getClass(), "minImpl", null);
        setField(term1954, term1954.getClass(), "maxImpl", null);
        setField(term1954, term1954.getClass(), "sumLogImpl", null);
        setField(term1954, term1954.getClass(), "geoMeanImpl", null);
        setField(term1954, term1954.getClass(), "meanImpl", null);
        setField(term1954, term1954.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSummary", argTypes, term1954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


