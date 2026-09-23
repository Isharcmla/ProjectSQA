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

public class DateTimeFormatterBuilder_appendFractionOfMinute_1231622842103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234;
     Object term240;
     Object term242;

    public DateTimeFormatterBuilder_appendFractionOfMinute_1231622842103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term235 = new ArrayList();
        term234 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term239 = newInstance(Class.forName("java.lang.Object"));
        setField(term234, term234.getClass(), "iElementPairs", term235);
        setField(term234, term234.getClass(), "iFormatter", term239);
        term240 = new Integer(-522618178);
        term242 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term240;
        args[1] = term242;
        try {
            callMethod(klass, "appendFractionOfMinute", argTypes, term234, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


