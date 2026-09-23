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

public class Partial_toString_1440838799149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609268;

    public Partial_toString_1440838799149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term609268 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term608667 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 20);
        Object[] term608668 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        Object term609388 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term609508 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term609268, term609268.getClass(), "iFormatter", term608667);
        setElement(term608668, 0, term609388);
        setElement(term608668, 1, term609508);
        setField(term609268, term609268.getClass(), "iTypes", term608668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term609268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


