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

public class Partial_toString_1440838799211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95142;

    public Partial_toString_1440838799211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95142 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term94541 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 20);
        Object[] term94542 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        Object term95262 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term95382 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term95142, term95142.getClass(), "iFormatter", term94541);
        setElement(term94542, 0, term95262);
        setElement(term94542, 1, term95382);
        setField(term95142, term95142.getClass(), "iTypes", term94542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term95142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
