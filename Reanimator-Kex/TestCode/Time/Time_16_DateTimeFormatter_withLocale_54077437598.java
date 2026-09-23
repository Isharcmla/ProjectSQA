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

public class DateTimeFormatter_withLocale_54077437598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11279;
     Object term11355;

    public DateTimeFormatter_withLocale_54077437598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11279 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term11317 = newInstance(Class.forName("java.util.Locale"));
        setField(term11279, term11279.getClass(), "iLocale", term11317);
        term11355 = newInstance(Class.forName("java.util.Locale"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term11355;
        try {
            callMethod(klass, "withLocale", argTypes, term11279, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


