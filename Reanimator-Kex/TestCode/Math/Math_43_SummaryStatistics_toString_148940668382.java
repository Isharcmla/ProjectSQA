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

public class SummaryStatistics_toString_148940668382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3183;

    public SummaryStatistics_toString_148940668382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3183 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setLongField(term3183, term3183.getClass(), "n", 0L);
        setField(term3183, term3183.getClass(), "secondMoment", null);
        setField(term3183, term3183.getClass(), "sum", null);
        setField(term3183, term3183.getClass(), "sumsq", null);
        setField(term3183, term3183.getClass(), "min", null);
        setField(term3183, term3183.getClass(), "max", null);
        setField(term3183, term3183.getClass(), "sumLog", null);
        setField(term3183, term3183.getClass(), "geoMean", null);
        setField(term3183, term3183.getClass(), "mean", null);
        setField(term3183, term3183.getClass(), "variance", null);
        setField(term3183, term3183.getClass(), "sumImpl", null);
        setField(term3183, term3183.getClass(), "sumsqImpl", null);
        setField(term3183, term3183.getClass(), "minImpl", null);
        setField(term3183, term3183.getClass(), "maxImpl", null);
        setField(term3183, term3183.getClass(), "sumLogImpl", null);
        setField(term3183, term3183.getClass(), "geoMeanImpl", null);
        setField(term3183, term3183.getClass(), "meanImpl", null);
        setField(term3183, term3183.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term3183, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


