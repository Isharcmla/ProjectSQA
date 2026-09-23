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

public class SummaryStatistics_equals_1846114248150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29006;
     Object term29128;

    public SummaryStatistics_equals_1846114248150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29006 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        term29128 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term29254 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setField(term29128, term29128.getClass(), "geoMeanImpl", term29254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29128;
        try {
            callMethod(klass, "equals", argTypes, term29006, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


