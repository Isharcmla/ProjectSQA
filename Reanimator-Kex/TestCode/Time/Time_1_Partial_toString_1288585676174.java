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

public class Partial_toString_1288585676174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74091;
     Object term78310;

    public Partial_toString_1288585676174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74091 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term74029 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term74091, term74091.getClass(), "iFormatter", null);
        setField(term74091, term74091.getClass(), "iTypes", term74029);
        term78310 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term78311 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term78310, term78310.getClass(), "iChronology", null);
        setField(term78310, term78310.getClass(), "iTypes", term78311);
        setField(term78310, term78310.getClass(), "iValues", null);
        setField(term78310, term78310.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "toString", argTypes, term74091, args);
        assertTrue(recursiveEquals(term74091, term78310));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};
