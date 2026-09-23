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

public class Partial_getFormatter_343811671111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30685;
     Object term61341;

    public Partial_getFormatter_343811671111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30685 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term30625 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term30685, term30685.getClass(), "iFormatter", null);
        setField(term30685, term30685.getClass(), "iTypes", term30625);
        term61341 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term61342 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term61341, term61341.getClass(), "iChronology", null);
        setField(term61341, term61341.getClass(), "iTypes", term61342);
        setField(term61341, term61341.getClass(), "iValues", null);
        setField(term61341, term61341.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormatter", argTypes, term30685, args);
        assertTrue(recursiveEquals(term30685, term61341));
        assertTrue(recursiveEquals(retValue, null));
    }

};


