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
     Object term33672;
     Object term33695;

    public Partial_toString_1288585676115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33672 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term33610 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term33672, term33672.getClass(), "iFormatter", null);
        setField(term33672, term33672.getClass(), "iTypes", term33610);
        term33695 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term33696 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term33695, term33695.getClass(), "iChronology", null);
        setField(term33695, term33695.getClass(), "iTypes", term33696);
        setField(term33695, term33695.getClass(), "iValues", null);
        setField(term33695, term33695.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "toString", argTypes, term33672, args);
        assertTrue(recursiveEquals(term33672, term33695));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


