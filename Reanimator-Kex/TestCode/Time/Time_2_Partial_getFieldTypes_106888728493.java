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

public class Partial_getFieldTypes_106888728493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25282;
     Object term25391;
     Object term25388;

    public Partial_getFieldTypes_106888728493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25282 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term25224 = (Object[]) newArray("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", 489);
        setField(term25282, term25282.getClass(), "iTypes", term25224);
        term25391 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term25392 = (Object[]) newArray("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", 489);
        setField(term25391, term25391.getClass(), "iChronology", null);
        setField(term25391, term25391.getClass(), "iTypes", term25392);
        setField(term25391, term25391.getClass(), "iValues", null);
        setField(term25391, term25391.getClass(), "iFormatter", null);
        term25388 = (Object[]) newArray("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", 489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFieldTypes", argTypes, term25282, args);
        assertTrue(recursiveEquals(term25282, term25391));
        assertTrue(recursiveEquals(retValue, term25388));
    }

};


