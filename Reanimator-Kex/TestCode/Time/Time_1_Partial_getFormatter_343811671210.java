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

public class Partial_getFormatter_343811671210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94539;
     Object term103577;

    public Partial_getFormatter_343811671210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94539 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term94479 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term94539, term94539.getClass(), "iFormatter", null);
        setField(term94539, term94539.getClass(), "iTypes", term94479);
        term103577 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term103578 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term103577, term103577.getClass(), "iChronology", null);
        setField(term103577, term103577.getClass(), "iTypes", term103578);
        setField(term103577, term103577.getClass(), "iValues", null);
        setField(term103577, term103577.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormatter", argTypes, term94539, args);
        assertTrue(recursiveEquals(term94539, term103577));
        assertTrue(recursiveEquals(retValue, null));
    }

};
