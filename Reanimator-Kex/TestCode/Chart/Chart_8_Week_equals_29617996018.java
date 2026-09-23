package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Week_equals_29617996018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2013;
     Object term2018;

    public Week_equals_29617996018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2013 = newInstance(Class.forName("org.jfree.data.time.Week"));
        setShortField(term2013, term2013.getClass(), "year", (short) 2026);
        setByteField(term2013, term2013.getClass(), "week", (byte) 39);
        setLongField(term2013, term2013.getClass(), "firstMillisecond", 1789887600000L);
        setLongField(term2013, term2013.getClass(), "lastMillisecond", 1790492399999L);
        term2018 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.Week");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2018;
        callMethod(klass, "equals", argTypes, term2013, args);
    }

};


