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
import java.lang.UnsupportedOperationException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_toString_703545626134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90542;

    public Partial_toString_703545626134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90542 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term90478 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 10);
        Object term90624 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setElement(term90478, 1, term90624);
        setElement(term90478, 2, term90624);
        setElement(term90478, 3, term90624);
        setElement(term90478, 4, term90624);
        setElement(term90478, 5, term90624);
        setElement(term90478, 6, term90624);
        setElement(term90478, 7, term90624);
        setElement(term90478, 8, term90624);
        setElement(term90478, 9, term90624);
        setField(term90542, term90542.getClass(), "iFormatter", term90478);
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
        try {
            callMethod(klass, "toString", argTypes, term90542, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


