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

public class DateTimeFormatterBuilder_isPrinter_616256218145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702;
     Object term708;
     Object term13008;
     Object term13012;

    public DateTimeFormatterBuilder_isPrinter_616256218145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term703 = new ArrayList();
        term702 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term707 = newInstance(Class.forName("java.lang.Object"));
        setField(term702, term702.getClass(), "iElementPairs", term703);
        setField(term702, term702.getClass(), "iFormatter", term707);
        term708 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term13009 = new ArrayList();
        term13008 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term13011 = newInstance(Class.forName("java.lang.Object"));
        setField(term13008, term13008.getClass(), "iElementPairs", term13009);
        setField(term13008, term13008.getClass(), "iFormatter", term13011);
        term13012 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term708;
        callMethod(klass, "isPrinter", argTypes, term702, args);
        assertTrue(recursiveEquals(term702, term13008));
        assertTrue(recursiveEquals(term708, term13012));
    }

};


