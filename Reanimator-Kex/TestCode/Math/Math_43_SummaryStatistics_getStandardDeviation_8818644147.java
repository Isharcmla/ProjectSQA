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

public class SummaryStatistics_getStandardDeviation_8818644147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2608;

    public SummaryStatistics_getStandardDeviation_8818644147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2608 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term2608, term2608.getClass(), "n", 0L);
        setField(term2608, term2608.getClass(), "secondMoment", null);
        setField(term2608, term2608.getClass(), "sum", null);
        setField(term2608, term2608.getClass(), "sumsq", null);
        setField(term2608, term2608.getClass(), "min", null);
        setField(term2608, term2608.getClass(), "max", null);
        setField(term2608, term2608.getClass(), "sumLog", null);
        setField(term2608, term2608.getClass(), "geoMean", null);
        setField(term2608, term2608.getClass(), "mean", null);
        setField(term2608, term2608.getClass(), "variance", null);
        setField(term2608, term2608.getClass(), "sumImpl", null);
        setField(term2608, term2608.getClass(), "sumsqImpl", null);
        setField(term2608, term2608.getClass(), "minImpl", null);
        setField(term2608, term2608.getClass(), "maxImpl", null);
        setField(term2608, term2608.getClass(), "sumLogImpl", null);
        setField(term2608, term2608.getClass(), "geoMeanImpl", null);
        setField(term2608, term2608.getClass(), "meanImpl", null);
        setField(term2608, term2608.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStandardDeviation", argTypes, term2608, args);
    }

};


