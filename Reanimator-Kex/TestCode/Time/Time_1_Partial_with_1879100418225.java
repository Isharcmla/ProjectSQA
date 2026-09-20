package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_with_1879100418225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112488;
     Object term112728;

    public Partial_with_1879100418225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112488 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term112328 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 17);
        Object term112608 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term112328, 0, term112608);
        setElement(term112328, 1, term112608);
        setElement(term112328, 2, term112608);
        setElement(term112328, 3, term112608);
        setElement(term112328, 4, term112608);
        setElement(term112328, 5, term112608);
        setElement(term112328, 6, term112608);
        setElement(term112328, 7, term112608);
        setElement(term112328, 8, term112608);
        setElement(term112328, 9, term112608);
        setElement(term112328, 10, term112608);
        setElement(term112328, 11, term112608);
        setElement(term112328, 12, term112608);
        setElement(term112328, 13, term112608);
        setElement(term112328, 14, term112608);
        setElement(term112328, 15, term112608);
        setElement(term112328, 16, term112608);
        setField(term112488, term112488.getClass(), "iTypes", term112328);
        term112728 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term112728;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term112488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
