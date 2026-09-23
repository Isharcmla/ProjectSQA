package org.joda.time.format;

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
import java.lang.IllegalArgumentException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendSecondOfDay_1021432552109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288;
     Object term294;

    public DateTimeFormatterBuilder_appendSecondOfDay_1021432552109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term289 = new ArrayList();
        term288 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term293 = newInstance(Class.forName("java.lang.Object"));
        setField(term288, term288.getClass(), "iElementPairs", term289);
        setField(term288, term288.getClass(), "iFormatter", term293);
        term294 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term294;
        try {
            callMethod(klass, "appendSecondOfDay", argTypes, term288, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


