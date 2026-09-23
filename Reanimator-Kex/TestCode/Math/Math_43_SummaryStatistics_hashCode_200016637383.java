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

public class SummaryStatistics_hashCode_200016637383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3713;

    public SummaryStatistics_hashCode_200016637383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3713 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term3713, term3713.getClass(), "n", 0L);
        setField(term3713, term3713.getClass(), "secondMoment", null);
        setField(term3713, term3713.getClass(), "sum", null);
        setField(term3713, term3713.getClass(), "sumsq", null);
        setField(term3713, term3713.getClass(), "min", null);
        setField(term3713, term3713.getClass(), "max", null);
        setField(term3713, term3713.getClass(), "sumLog", null);
        setField(term3713, term3713.getClass(), "geoMean", null);
        setField(term3713, term3713.getClass(), "mean", null);
        setField(term3713, term3713.getClass(), "variance", null);
        setField(term3713, term3713.getClass(), "sumImpl", null);
        setField(term3713, term3713.getClass(), "sumsqImpl", null);
        setField(term3713, term3713.getClass(), "minImpl", null);
        setField(term3713, term3713.getClass(), "maxImpl", null);
        setField(term3713, term3713.getClass(), "sumLogImpl", null);
        setField(term3713, term3713.getClass(), "geoMeanImpl", null);
        setField(term3713, term3713.getClass(), "meanImpl", null);
        setField(term3713, term3713.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term3713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


