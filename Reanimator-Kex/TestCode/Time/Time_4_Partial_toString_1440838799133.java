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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_toString_1440838799133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40248;

    public Partial_toString_1440838799133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40248 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term40177 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 18);
        Object term40330 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term40452 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        setField(term40330, term40330.getClass(), "iPrinter", term40452);
        setElement(term40177, 1, term40330);
        setElement(term40177, 2, term40330);
        setElement(term40177, 3, term40330);
        setElement(term40177, 4, term40330);
        setElement(term40177, 5, term40330);
        setElement(term40177, 6, term40330);
        setElement(term40177, 7, term40330);
        setElement(term40177, 8, term40330);
        setElement(term40177, 9, term40330);
        setElement(term40177, 10, term40330);
        setElement(term40177, 11, term40330);
        setElement(term40177, 12, term40330);
        setElement(term40177, 13, term40330);
        setElement(term40177, 14, term40330);
        setElement(term40177, 15, term40330);
        setElement(term40177, 16, term40330);
        setElement(term40177, 17, term40330);
        setField(term40248, term40248.getClass(), "iFormatter", term40177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term40248, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


