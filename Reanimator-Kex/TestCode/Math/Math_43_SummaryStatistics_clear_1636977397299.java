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

public class SummaryStatistics_clear_1636977397299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157986;

    public SummaryStatistics_clear_1636977397299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157986 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term158104 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term158222 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term158340 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        setLongField(term157986, term157986.getClass(), "n", 0L);
        setDoubleField(term158104, term158104.getClass(), "value", 0.0);
        setLongField(term158104, term158104.getClass(), "n", 0L);
        setField(term157986, term157986.getClass(), "minImpl", term158104);
        setDoubleField(term158222, term158222.getClass(), "value", 0.0);
        setLongField(term158222, term158222.getClass(), "n", 0L);
        setField(term157986, term157986.getClass(), "maxImpl", term158222);
        setField(term157986, term157986.getClass(), "sumImpl", term158104);
        setField(term157986, term157986.getClass(), "sumLogImpl", term158340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term157986, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


