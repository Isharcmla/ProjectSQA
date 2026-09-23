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

public class Partial_toString_703545626118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63223;
     Object term63428;

    public Partial_toString_703545626118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63223 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term63161 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term63223, term63223.getClass(), "iFormatter", null);
        setField(term63223, term63223.getClass(), "iTypes", term63161);
        term63428 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term63429 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term63428, term63428.getClass(), "iChronology", null);
        setField(term63428, term63428.getClass(), "iTypes", term63429);
        setField(term63428, term63428.getClass(), "iValues", null);
        setField(term63428, term63428.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "toString", argTypes, term63223, args);
        assertTrue(recursiveEquals(term63223, term63428));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


