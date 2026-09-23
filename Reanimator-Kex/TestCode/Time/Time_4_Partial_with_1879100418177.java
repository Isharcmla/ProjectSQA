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

public class Partial_with_1879100418177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71994;
     Object term72954;

    public Partial_with_1879100418177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71994 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term71402 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 87);
        Object term72114 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term72234 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term72354 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term72474 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term72594 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term72714 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term72834 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term71402, 0, term72114);
        setElement(term71402, 1, term72234);
        setElement(term71402, 2, term72234);
        setElement(term71402, 3, term72354);
        setElement(term71402, 4, term72354);
        setElement(term71402, 5, term72474);
        setElement(term71402, 6, term72474);
        setElement(term71402, 7, term72474);
        setElement(term71402, 8, term72474);
        setElement(term71402, 9, term72594);
        setElement(term71402, 10, term72474);
        setElement(term71402, 11, term72714);
        setElement(term71402, 12, term72474);
        setElement(term71402, 13, term72474);
        setElement(term71402, 14, term72474);
        setElement(term71402, 15, term72474);
        setElement(term71402, 16, term72834);
        setElement(term71402, 17, term72474);
        setElement(term71402, 18, term72474);
        setElement(term71402, 19, term72474);
        setElement(term71402, 20, term72354);
        setElement(term71402, 21, term72474);
        setElement(term71402, 22, term72474);
        setElement(term71402, 23, term72474);
        setElement(term71402, 24, term72474);
        setElement(term71402, 25, term72474);
        setElement(term71402, 26, term72474);
        setElement(term71402, 27, term72474);
        setElement(term71402, 28, term72474);
        setElement(term71402, 29, term72474);
        setElement(term71402, 30, term72474);
        setElement(term71402, 31, term72474);
        setElement(term71402, 32, term72474);
        setElement(term71402, 33, term72474);
        setElement(term71402, 34, term72354);
        setElement(term71402, 35, term72474);
        setElement(term71402, 36, term72474);
        setElement(term71402, 37, term72474);
        setElement(term71402, 38, term72474);
        setElement(term71402, 39, term72474);
        setElement(term71402, 40, term72474);
        setElement(term71402, 41, term72474);
        setElement(term71402, 42, term72474);
        setElement(term71402, 43, term72474);
        setElement(term71402, 44, term72474);
        setElement(term71402, 45, term72474);
        setElement(term71402, 46, term72474);
        setElement(term71402, 47, term72474);
        setElement(term71402, 48, term72474);
        setElement(term71402, 49, term72474);
        setElement(term71402, 50, term72474);
        setElement(term71402, 51, term72474);
        setElement(term71402, 52, term72474);
        setElement(term71402, 53, term72474);
        setElement(term71402, 54, term72474);
        setElement(term71402, 55, term72474);
        setElement(term71402, 56, term72474);
        setElement(term71402, 57, term72474);
        setElement(term71402, 58, term72474);
        setElement(term71402, 59, term72474);
        setElement(term71402, 60, term72474);
        setElement(term71402, 61, term72474);
        setElement(term71402, 62, term72474);
        setElement(term71402, 63, term72474);
        setElement(term71402, 64, term72474);
        setElement(term71402, 65, term72474);
        setElement(term71402, 66, term72474);
        setElement(term71402, 67, term72474);
        setElement(term71402, 68, term72474);
        setElement(term71402, 69, term72474);
        setElement(term71402, 70, term72474);
        setElement(term71402, 71, term72474);
        setElement(term71402, 72, term72474);
        setElement(term71402, 73, term72474);
        setElement(term71402, 74, term72474);
        setElement(term71402, 75, term72474);
        setElement(term71402, 76, term72474);
        setElement(term71402, 77, term72474);
        setElement(term71402, 78, term72474);
        setElement(term71402, 79, term72474);
        setElement(term71402, 80, term72474);
        setElement(term71402, 81, term72474);
        setElement(term71402, 82, term72474);
        setElement(term71402, 83, term72474);
        setElement(term71402, 84, term72474);
        setElement(term71402, 85, term72474);
        setElement(term71402, 86, term72474);
        setField(term71994, term71994.getClass(), "iTypes", term71402);
        term72954 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term72954;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term71994, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


