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

public class Partial_toString_1440838799154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70422;
     Object term70508;

    public Partial_toString_1440838799154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70422 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term70361 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term70422, term70422.getClass(), "iFormatter", null);
        setField(term70422, term70422.getClass(), "iTypes", term70361);
        term70508 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term70509 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term70508, term70508.getClass(), "iChronology", null);
        setField(term70508, term70508.getClass(), "iTypes", term70509);
        setField(term70508, term70508.getClass(), "iValues", null);
        setField(term70508, term70508.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term70422, args);
        assertTrue(recursiveEquals(term70422, term70508));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};
