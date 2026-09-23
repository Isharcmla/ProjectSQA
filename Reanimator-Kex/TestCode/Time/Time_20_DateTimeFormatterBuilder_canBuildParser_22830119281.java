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

public class DateTimeFormatterBuilder_canBuildParser_22830119281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term1730;

    public DateTimeFormatterBuilder_canBuildParser_22830119281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32 = new ArrayList();
        term31 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term36 = newInstance(Class.forName("java.lang.Object"));
        setField(term31, term31.getClass(), "iElementPairs", term32);
        setField(term31, term31.getClass(), "iFormatter", term36);
        ArrayList term1731 = new ArrayList();
        term1730 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term1733 = newInstance(Class.forName("java.lang.Object"));
        setField(term1730, term1730.getClass(), "iElementPairs", term1731);
        setField(term1730, term1730.getClass(), "iFormatter", term1733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildParser", argTypes, term31, args);
        assertTrue(recursiveEquals(term31, term1730));
    }

};


