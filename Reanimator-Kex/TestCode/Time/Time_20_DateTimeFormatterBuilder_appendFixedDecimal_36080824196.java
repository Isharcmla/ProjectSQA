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

public class DateTimeFormatterBuilder_appendFixedDecimal_36080824196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;
     Object term182;

    public DateTimeFormatterBuilder_appendFixedDecimal_36080824196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term177 = new ArrayList();
        term176 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term181 = newInstance(Class.forName("java.lang.Object"));
        setField(term176, term176.getClass(), "iElementPairs", term177);
        setField(term176, term176.getClass(), "iFormatter", term181);
        term182 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term182;
        try {
            callMethod(klass, "appendFixedDecimal", argTypes, term176, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


