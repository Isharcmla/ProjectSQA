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

public class Partial_with_1879100418175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69473;
     Object term70793;

    public Partial_with_1879100418175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69473 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term69018 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 63);
        Object term69593 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term69713 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term69833 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term69953 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term70073 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term70193 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term70313 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term70433 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term70553 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term70673 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term69018, 0, term69593);
        setElement(term69018, 1, term69713);
        setElement(term69018, 2, term69833);
        setElement(term69018, 3, term69953);
        setElement(term69018, 4, term70073);
        setElement(term69018, 5, term70193);
        setElement(term69018, 6, term70313);
        setElement(term69018, 7, term70433);
        setElement(term69018, 8, term70553);
        setElement(term69018, 9, term70673);
        setElement(term69018, 10, term70553);
        setElement(term69018, 11, term70673);
        setElement(term69018, 12, term70553);
        setElement(term69018, 13, term70553);
        setElement(term69018, 14, term70553);
        setElement(term69018, 15, term70553);
        setElement(term69018, 16, term70673);
        setElement(term69018, 17, term70553);
        setElement(term69018, 18, term70553);
        setElement(term69018, 19, term70553);
        setElement(term69018, 20, term70553);
        setElement(term69018, 21, term70553);
        setElement(term69018, 22, term70553);
        setElement(term69018, 23, term70553);
        setElement(term69018, 24, term70553);
        setElement(term69018, 25, term70553);
        setElement(term69018, 26, term70553);
        setElement(term69018, 27, term70553);
        setElement(term69018, 28, term70553);
        setElement(term69018, 29, term70553);
        setElement(term69018, 30, term70553);
        setElement(term69018, 31, term70553);
        setElement(term69018, 32, term70553);
        setElement(term69018, 33, term70553);
        setElement(term69018, 34, term70553);
        setElement(term69018, 35, term70553);
        setElement(term69018, 36, term70553);
        setElement(term69018, 37, term70553);
        setElement(term69018, 38, term70553);
        setElement(term69018, 39, term70553);
        setElement(term69018, 40, term70553);
        setElement(term69018, 41, term70553);
        setElement(term69018, 42, term70553);
        setElement(term69018, 43, term70553);
        setElement(term69018, 44, term70553);
        setElement(term69018, 45, term70553);
        setElement(term69018, 46, term70553);
        setElement(term69018, 47, term70553);
        setElement(term69018, 48, term70553);
        setElement(term69018, 49, term70553);
        setElement(term69018, 50, term70553);
        setElement(term69018, 51, term70553);
        setElement(term69018, 52, term70553);
        setElement(term69018, 53, term70553);
        setElement(term69018, 54, term70553);
        setElement(term69018, 55, term70553);
        setElement(term69018, 56, term70553);
        setElement(term69018, 57, term70553);
        setElement(term69018, 58, term70553);
        setElement(term69018, 59, term70553);
        setElement(term69018, 60, term70553);
        setElement(term69018, 61, term70553);
        setElement(term69018, 62, term70553);
        setField(term69473, term69473.getClass(), "iTypes", term69018);
        term70793 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term70793;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term69473, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


