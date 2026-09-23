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

public class DateTimeFormatterBuilder_checkPrinter_155483494090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;

    public DateTimeFormatterBuilder_checkPrinter_155483494090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112 = new ArrayList();
        term111 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term116 = newInstance(Class.forName("java.lang.Object"));
        setField(term111, term111.getClass(), "iElementPairs", term112);
        setField(term111, term111.getClass(), "iFormatter", term116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "checkPrinter", argTypes, term111, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


