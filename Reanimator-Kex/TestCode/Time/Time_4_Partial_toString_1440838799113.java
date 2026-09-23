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

public class Partial_toString_1440838799113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33567;
     Object term33604;

    public Partial_toString_1440838799113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33567 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term33501 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        Object[] term33502 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term33567, term33567.getClass(), "iFormatter", term33501);
        setField(term33567, term33567.getClass(), "iTypes", term33502);
        term33604 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term33605 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        Object[] term33606 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        setField(term33604, term33604.getClass(), "iChronology", null);
        setField(term33604, term33604.getClass(), "iTypes", term33605);
        setField(term33604, term33604.getClass(), "iValues", null);
        setField(term33604, term33604.getClass(), "iFormatter", term33606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term33567, args);
        assertTrue(recursiveEquals(term33567, term33604));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


