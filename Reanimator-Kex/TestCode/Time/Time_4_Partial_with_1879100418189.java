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

public class Partial_with_1879100418189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95601;
     Object term95841;

    public Partial_with_1879100418189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95601 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term95422 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 20);
        Object term95721 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term95422, 0, term95721);
        setElement(term95422, 1, term95721);
        setElement(term95422, 2, term95721);
        setElement(term95422, 3, term95721);
        setElement(term95422, 4, term95721);
        setElement(term95422, 5, term95721);
        setElement(term95422, 6, term95721);
        setElement(term95422, 7, term95721);
        setElement(term95422, 8, term95721);
        setElement(term95422, 9, term95721);
        setElement(term95422, 10, term95721);
        setElement(term95422, 11, term95721);
        setElement(term95422, 12, term95721);
        setElement(term95422, 13, term95721);
        setElement(term95422, 14, term95721);
        setElement(term95422, 15, term95721);
        setElement(term95422, 16, term95721);
        setElement(term95422, 17, term95721);
        setElement(term95422, 18, term95721);
        setElement(term95422, 19, term95721);
        setField(term95601, term95601.getClass(), "iTypes", term95422);
        term95841 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term95841;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term95601, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


