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

public class DateTimeFormatterBuilder_appendOptional_80004788188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;

    public DateTimeFormatterBuilder_appendOptional_80004788188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term100 = new ArrayList();
        term99 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term104 = newInstance(Class.forName("java.lang.Object"));
        setField(term99, term99.getClass(), "iElementPairs", term100);
        setField(term99, term99.getClass(), "iFormatter", term104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimeParser");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendOptional", argTypes, term99, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


