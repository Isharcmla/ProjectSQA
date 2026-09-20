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

public class Partial_toString_1440838799156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70490;
     Object term70740;

    public Partial_toString_1440838799156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70490 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term70424 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        Object[] term70425 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term70490, term70490.getClass(), "iFormatter", term70424);
        setField(term70490, term70490.getClass(), "iTypes", term70425);
        term70740 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term70741 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        Object[] term70742 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        setField(term70740, term70740.getClass(), "iChronology", null);
        setField(term70740, term70740.getClass(), "iTypes", term70741);
        setField(term70740, term70740.getClass(), "iValues", null);
        setField(term70740, term70740.getClass(), "iFormatter", term70742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term70490, args);
        assertTrue(recursiveEquals(term70490, term70740));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};
