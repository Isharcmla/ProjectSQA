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
import java.lang.Integer;

public class Week_init_15619013262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term7;

    public Week_init_15619013262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = new Integer(1484323161);
        term7 = newInstance(Class.forName("org.jfree.data.time.Year"));
        setShortField(term7, term7.getClass(), "year", (short) 2026);
        setLongField(term7, term7.getClass(), "firstMillisecond", 1767254400000L);
        setLongField(term7, term7.getClass(), "lastMillisecond", 1798790399999L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.Week");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.jfree.data.time.Year");
        Object[] args = new Object[2];
        args[0] = term5;
        args[1] = term7;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


