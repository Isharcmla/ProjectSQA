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

public class SummaryStatistics_setSumLogImpl_524896945226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52769;
     Object term53143;

    public SummaryStatistics_setSumLogImpl_524896945226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52769 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term52887 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Skewness"));
        Object term53015 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        setLongField(term52769, term52769.getClass(), "n", 0L);
        setField(term52769, term52769.getClass(), "sumLogImpl", term52887);
        setField(term53015, term53015.getClass(), "sumOfLogs", term53015);
        setField(term52769, term52769.getClass(), "geoMean", term53015);
        term53143 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = term53143;
        callMethod(klass, "setSumLogImpl", argTypes, term52769, args);
    }

};


