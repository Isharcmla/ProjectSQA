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

public class Partial_with_1879100418181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79699;
     Object term79939;

    public Partial_with_1879100418181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79699 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term79557 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 14);
        Object term79819 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term79557, 0, term79819);
        setElement(term79557, 1, term79819);
        setElement(term79557, 2, term79819);
        setElement(term79557, 3, term79819);
        setElement(term79557, 4, term79819);
        setElement(term79557, 5, term79819);
        setElement(term79557, 6, term79819);
        setElement(term79557, 7, term79819);
        setElement(term79557, 8, term79819);
        setElement(term79557, 9, term79819);
        setElement(term79557, 10, term79819);
        setElement(term79557, 11, term79819);
        setElement(term79557, 12, term79819);
        setElement(term79557, 13, term79819);
        setField(term79699, term79699.getClass(), "iTypes", term79557);
        term79939 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term79939;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term79699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


