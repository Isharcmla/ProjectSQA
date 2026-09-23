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

public class DateTimeFormatterBuilder_appendDecimal_74166582595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;
     Object term172;
     Object term174;

    public DateTimeFormatterBuilder_appendDecimal_74166582595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term167 = new ArrayList();
        term166 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term171 = newInstance(Class.forName("java.lang.Object"));
        setField(term166, term166.getClass(), "iElementPairs", term167);
        setField(term166, term166.getClass(), "iFormatter", term171);
        term172 = new Integer(1162663216);
        term174 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term172;
        args[2] = term174;
        try {
            callMethod(klass, "appendDecimal", argTypes, term166, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


