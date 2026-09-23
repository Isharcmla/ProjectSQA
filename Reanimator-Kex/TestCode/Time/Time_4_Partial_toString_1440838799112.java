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

public class Partial_toString_1440838799112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33499;
     Object term33585;

    public Partial_toString_1440838799112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33499 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term33438 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term33499, term33499.getClass(), "iFormatter", null);
        setField(term33499, term33499.getClass(), "iTypes", term33438);
        term33585 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term33586 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term33585, term33585.getClass(), "iChronology", null);
        setField(term33585, term33585.getClass(), "iTypes", term33586);
        setField(term33585, term33585.getClass(), "iValues", null);
        setField(term33585, term33585.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term33499, args);
        assertTrue(recursiveEquals(term33499, term33585));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


