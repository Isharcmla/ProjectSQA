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

public class Partial_toString_1288585676163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49489;

    public Partial_toString_1288585676163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49489 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term49425 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 10);
        Object term49571 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setElement(term49425, 1, term49571);
        setElement(term49425, 2, term49571);
        setElement(term49425, 3, term49571);
        setElement(term49425, 4, term49571);
        setElement(term49425, 5, term49571);
        setElement(term49425, 6, term49571);
        setElement(term49425, 7, term49571);
        setElement(term49425, 8, term49571);
        setElement(term49425, 9, term49571);
        setField(term49489, term49489.getClass(), "iFormatter", term49425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "toString", argTypes, term49489, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


