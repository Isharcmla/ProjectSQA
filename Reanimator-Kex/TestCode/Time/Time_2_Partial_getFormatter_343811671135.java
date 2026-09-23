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

public class Partial_getFormatter_343811671135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90688;
     Object term91684;

    public Partial_getFormatter_343811671135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90688 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term90626 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        setField(term90688, term90688.getClass(), "iFormatter", null);
        setField(term90688, term90688.getClass(), "iTypes", term90626);
        term91684 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term91685 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object[] term91686 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        setField(term91684, term91684.getClass(), "iChronology", null);
        setField(term91684, term91684.getClass(), "iTypes", term91685);
        setField(term91684, term91684.getClass(), "iValues", null);
        setField(term91684, term91684.getClass(), "iFormatter", term91686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormatter", argTypes, term90688, args);
        assertTrue(recursiveEquals(term90688, term91684));
        assertTrue(recursiveEquals(retValue, null));
    }

};


