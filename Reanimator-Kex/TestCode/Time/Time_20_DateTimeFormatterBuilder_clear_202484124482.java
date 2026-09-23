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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_clear_202484124482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term1739;

    public DateTimeFormatterBuilder_clear_202484124482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38 = new ArrayList();
        term37 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term42 = newInstance(Class.forName("java.lang.Object"));
        setField(term37, term37.getClass(), "iElementPairs", term38);
        setField(term37, term37.getClass(), "iFormatter", term42);
        ArrayList term1740 = new ArrayList();
        term1739 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term1739, term1739.getClass(), "iElementPairs", term1740);
        setField(term1739, term1739.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term37, args);
        assertTrue(recursiveEquals(term37, term1739));
    }

};


