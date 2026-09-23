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

public class Week_compareTo_69757354320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2024;
     Object term2029;

    public Week_compareTo_69757354320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2024 = newInstance(Class.forName("org.jfree.data.time.Week"));
        setShortField(term2024, term2024.getClass(), "year", (short) 2026);
        setByteField(term2024, term2024.getClass(), "week", (byte) 39);
        setLongField(term2024, term2024.getClass(), "firstMillisecond", 1789887600000L);
        setLongField(term2024, term2024.getClass(), "lastMillisecond", 1790492399999L);
        term2029 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.Week");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2029;
        callMethod(klass, "compareTo", argTypes, term2024, args);
    }

};


