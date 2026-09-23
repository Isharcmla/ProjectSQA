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
     Object term30748;
     Object term61360;

    public Partial_toString_1440838799112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30748 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term30687 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term30748, term30748.getClass(), "iFormatter", null);
        setField(term30748, term30748.getClass(), "iTypes", term30687);
        term61360 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term61361 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term61360, term61360.getClass(), "iChronology", null);
        setField(term61360, term61360.getClass(), "iTypes", term61361);
        setField(term61360, term61360.getClass(), "iValues", null);
        setField(term61360, term61360.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term30748, args);
        assertTrue(recursiveEquals(term30748, term61360));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


