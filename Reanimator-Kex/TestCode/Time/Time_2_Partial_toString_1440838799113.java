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

public class Partial_toString_1440838799113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30816;
     Object term61379;

    public Partial_toString_1440838799113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30816 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term30750 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        Object[] term30751 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term30816, term30816.getClass(), "iFormatter", term30750);
        setField(term30816, term30816.getClass(), "iTypes", term30751);
        term61379 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term61380 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        Object[] term61381 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        setField(term61379, term61379.getClass(), "iChronology", null);
        setField(term61379, term61379.getClass(), "iTypes", term61380);
        setField(term61379, term61379.getClass(), "iValues", null);
        setField(term61379, term61379.getClass(), "iFormatter", term61381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term30816, args);
        assertTrue(recursiveEquals(term30816, term61379));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


