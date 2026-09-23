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
import static org.apache.commons.math.stat.descriptive.EqualityUtils.*;

public class SummaryStatistics_setSumsqImpl_91726531595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14847;
     Object term14857;

    public SummaryStatistics_setSumsqImpl_91726531595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14847 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term14847, term14847.getClass(), "n", 0L);
        term14857 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term14857, term14857.getClass(), "n", 0L);
        setField(term14857, term14857.getClass(), "secondMoment", null);
        setField(term14857, term14857.getClass(), "sum", null);
        setField(term14857, term14857.getClass(), "sumsq", null);
        setField(term14857, term14857.getClass(), "min", null);
        setField(term14857, term14857.getClass(), "max", null);
        setField(term14857, term14857.getClass(), "sumLog", null);
        setField(term14857, term14857.getClass(), "geoMean", null);
        setField(term14857, term14857.getClass(), "mean", null);
        setField(term14857, term14857.getClass(), "variance", null);
        setField(term14857, term14857.getClass(), "sumImpl", null);
        setField(term14857, term14857.getClass(), "sumsqImpl", null);
        setField(term14857, term14857.getClass(), "minImpl", null);
        setField(term14857, term14857.getClass(), "maxImpl", null);
        setField(term14857, term14857.getClass(), "sumLogImpl", null);
        setField(term14857, term14857.getClass(), "geoMeanImpl", null);
        setField(term14857, term14857.getClass(), "meanImpl", null);
        setField(term14857, term14857.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSumsqImpl", argTypes, term14847, args);
        assertTrue(recursiveEquals(term14847, term14857));
    }

};


