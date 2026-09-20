package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Partial_toString_703545626185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82690;
     Object term83300;

    public Partial_toString_703545626185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82690 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term82628 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term82690, term82690.getClass(), "iFormatter", null);
        setField(term82690, term82690.getClass(), "iTypes", term82628);
        term83300 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term83301 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term83300, term83300.getClass(), "iChronology", null);
        setField(term83300, term83300.getClass(), "iTypes", term83301);
        setField(term83300, term83300.getClass(), "iValues", null);
        setField(term83300, term83300.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "toString", argTypes, term82690, args);
        assertTrue(recursiveEquals(term82690, term83300));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};
