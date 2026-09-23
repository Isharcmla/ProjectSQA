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
import org.apache.commons.math.exception.MathIllegalStateException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SummaryStatistics_setVarianceImpl_1386401367134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24106;

    public SummaryStatistics_setVarianceImpl_1386401367134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24106 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term24106, term24106.getClass(), "n", 1073741824L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setVarianceImpl", argTypes, term24106, args);
            assertTrue(false);
        }
        catch (MathIllegalStateException e) {
        }

    }

};


