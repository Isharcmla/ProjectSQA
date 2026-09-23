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
import java.lang.NullPointerException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeFormatter_withLocale_540774375119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19550;
     Object term19626;

    public DateTimeFormatter_withLocale_540774375119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19550 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term19588 = newInstance(Class.forName("java.util.Locale"));
        setField(term19550, term19550.getClass(), "iLocale", term19588);
        term19626 = newInstance(Class.forName("java.util.Locale"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term19626;
        try {
            callMethod(klass, "withLocale", argTypes, term19550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


