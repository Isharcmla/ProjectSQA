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

public class DateTimeFormatterBuilder_append_5806145887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term98;

    public DateTimeFormatterBuilder_append_5806145887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term93 = new ArrayList();
        term92 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term97 = newInstance(Class.forName("java.lang.Object"));
        setField(term92, term92.getClass(), "iElementPairs", term93);
        setField(term92, term92.getClass(), "iFormatter", term97);
        term98 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term98;
        try {
            callMethod(klass, "append", argTypes, term92, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


