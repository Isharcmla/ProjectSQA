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

public class Partial_with_1879100418191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96581;
     Object term97301;

    public Partial_with_1879100418191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96581 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term96208 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 51);
        Object term96701 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term96821 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term96941 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term97061 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term97181 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term96208, 0, term96701);
        setElement(term96208, 1, term96821);
        setElement(term96208, 2, term96941);
        setElement(term96208, 3, term96941);
        setElement(term96208, 4, term97061);
        setElement(term96208, 5, term96941);
        setElement(term96208, 6, term96941);
        setElement(term96208, 7, term96941);
        setElement(term96208, 8, term96941);
        setElement(term96208, 9, term97181);
        setElement(term96208, 10, term96941);
        setElement(term96208, 11, term97061);
        setElement(term96208, 12, term96941);
        setElement(term96208, 13, term96941);
        setElement(term96208, 14, term96941);
        setElement(term96208, 15, term96941);
        setElement(term96208, 16, term96941);
        setElement(term96208, 17, term96941);
        setElement(term96208, 18, term96701);
        setElement(term96208, 19, term96941);
        setElement(term96208, 20, term97061);
        setElement(term96208, 21, term96941);
        setElement(term96208, 22, term96941);
        setElement(term96208, 23, term96941);
        setElement(term96208, 24, term96941);
        setElement(term96208, 25, term96941);
        setElement(term96208, 26, term96941);
        setElement(term96208, 27, term96941);
        setElement(term96208, 28, term96941);
        setElement(term96208, 29, term96941);
        setElement(term96208, 30, term96941);
        setElement(term96208, 31, term96941);
        setElement(term96208, 32, term96941);
        setElement(term96208, 33, term96941);
        setElement(term96208, 34, term96941);
        setElement(term96208, 35, term96941);
        setElement(term96208, 36, term96941);
        setElement(term96208, 37, term96941);
        setElement(term96208, 38, term96941);
        setElement(term96208, 39, term96941);
        setElement(term96208, 40, term96941);
        setElement(term96208, 41, term96941);
        setElement(term96208, 42, term96941);
        setElement(term96208, 43, term96941);
        setElement(term96208, 44, term96941);
        setElement(term96208, 45, term96941);
        setElement(term96208, 46, term96941);
        setElement(term96208, 47, term96941);
        setElement(term96208, 48, term96941);
        setElement(term96208, 49, term96941);
        setElement(term96208, 50, term96941);
        setField(term96581, term96581.getClass(), "iTypes", term96208);
        term97301 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term97301;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term96581, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


