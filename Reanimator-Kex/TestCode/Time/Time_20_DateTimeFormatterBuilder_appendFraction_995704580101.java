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

public class DateTimeFormatterBuilder_appendFraction_995704580101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214;
     Object term220;
     Object term222;

    public DateTimeFormatterBuilder_appendFraction_995704580101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term215 = new ArrayList();
        term214 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term219 = newInstance(Class.forName("java.lang.Object"));
        setField(term214, term214.getClass(), "iElementPairs", term215);
        setField(term214, term214.getClass(), "iFormatter", term219);
        term220 = new Integer(-2038273078);
        term222 = new Integer(1227103734);
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
        args[1] = term220;
        args[2] = term222;
        try {
            callMethod(klass, "appendFraction", argTypes, term214, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


