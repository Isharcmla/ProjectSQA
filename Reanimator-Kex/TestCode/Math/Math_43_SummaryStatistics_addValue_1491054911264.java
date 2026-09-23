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
import java.lang.Double;

public class SummaryStatistics_addValue_1491054911264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60887;

    public SummaryStatistics_addValue_1491054911264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60887 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term61013 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term61123 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        setLongField(term61013, term61013.getClass(), "n", 1L);
        setDoubleField(term61013, term61013.getClass(), "m1", 0.0);
        setDoubleField(term61013, term61013.getClass(), "dev", 0.0);
        setDoubleField(term61013, term61013.getClass(), "nDev", 0.0);
        setDoubleField(term61013, term61013.getClass(), "m2", 0.0);
        setField(term60887, term60887.getClass(), "sumImpl", term61013);
        setField(term60887, term60887.getClass(), "sumsqImpl", term61123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NaN;
        try {
            callMethod(klass, "addValue", argTypes, term60887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


