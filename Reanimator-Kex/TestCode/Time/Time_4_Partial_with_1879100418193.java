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

public class Partial_with_1879100418193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98075;
     Object term98315;

    public Partial_with_1879100418193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98075 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term97835 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 30);
        Object term98195 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term97835, 0, term98195);
        setElement(term97835, 1, term98195);
        setElement(term97835, 2, term98195);
        setElement(term97835, 3, term98195);
        setElement(term97835, 4, term98195);
        setElement(term97835, 5, term98195);
        setElement(term97835, 6, term98195);
        setElement(term97835, 7, term98195);
        setElement(term97835, 8, term98195);
        setElement(term97835, 9, term98195);
        setElement(term97835, 10, term98195);
        setElement(term97835, 11, term98195);
        setElement(term97835, 12, term98195);
        setElement(term97835, 13, term98195);
        setElement(term97835, 14, term98195);
        setElement(term97835, 15, term98195);
        setElement(term97835, 16, term98195);
        setElement(term97835, 17, term98195);
        setElement(term97835, 18, term98195);
        setElement(term97835, 19, term98195);
        setElement(term97835, 20, term98195);
        setElement(term97835, 21, term98195);
        setElement(term97835, 22, term98195);
        setElement(term97835, 23, term98195);
        setElement(term97835, 24, term98195);
        setElement(term97835, 25, term98195);
        setElement(term97835, 26, term98195);
        setElement(term97835, 27, term98195);
        setElement(term97835, 28, term98195);
        setElement(term97835, 29, term98195);
        setField(term98075, term98075.getClass(), "iTypes", term97835);
        term98315 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term98315;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term98075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


