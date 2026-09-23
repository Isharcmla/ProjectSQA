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

public class Partial_toString_703545626138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91755;
     Object term135968;

    public Partial_toString_703545626138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91755 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term91688 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        Object[] term91689 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term91755, term91755.getClass(), "iFormatter", term91688);
        setField(term91755, term91755.getClass(), "iTypes", term91689);
        term135968 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term135969 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        Object[] term135970 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        setField(term135968, term135968.getClass(), "iChronology", null);
        setField(term135968, term135968.getClass(), "iTypes", term135969);
        setField(term135968, term135968.getClass(), "iValues", null);
        setField(term135968, term135968.getClass(), "iFormatter", term135970);
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
        Object retValue = callMethod(klass, "toString", argTypes, term91755, args);
        assertTrue(recursiveEquals(term91755, term135968));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


