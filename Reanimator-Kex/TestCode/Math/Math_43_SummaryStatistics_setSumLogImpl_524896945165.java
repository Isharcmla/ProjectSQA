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

public class SummaryStatistics_setSumLogImpl_524896945165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35019;
     Object term35379;

    public SummaryStatistics_setSumLogImpl_524896945165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35019 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term35123 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term35251 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        setLongField(term35019, term35019.getClass(), "n", 0L);
        setField(term35019, term35019.getClass(), "sumLogImpl", term35123);
        setField(term35019, term35019.getClass(), "geoMean", term35251);
        term35379 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = term35379;
        try {
            callMethod(klass, "setSumLogImpl", argTypes, term35019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


