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

public class Partial_toString_1288585676115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45228;
     Object term61657;

    public Partial_toString_1288585676115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45228 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term45166 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term45228, term45228.getClass(), "iFormatter", null);
        setField(term45228, term45228.getClass(), "iTypes", term45166);
        term61657 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term61658 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term61657, term61657.getClass(), "iChronology", null);
        setField(term61657, term61657.getClass(), "iTypes", term61658);
        setField(term61657, term61657.getClass(), "iValues", null);
        setField(term61657, term61657.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "toString", argTypes, term45228, args);
        assertTrue(recursiveEquals(term45228, term61657));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


