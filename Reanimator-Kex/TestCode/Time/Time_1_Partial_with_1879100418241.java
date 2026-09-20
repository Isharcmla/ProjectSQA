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

public class Partial_with_1879100418241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150985;
     Object term153985;

    public Partial_with_1879100418241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150985 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term149805 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 180);
        Object term151105 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term151225 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term151345 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term151465 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term151585 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term151705 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term151825 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term151945 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term152065 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term152185 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term152305 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term152425 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term152545 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term152665 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term152785 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term152905 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term153025 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term153145 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term153265 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term153385 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term153505 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term153625 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term153745 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term153865 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term149805, 0, term151105);
        setElement(term149805, 2, term151225);
        setElement(term149805, 5, term151345);
        setElement(term149805, 6, term151465);
        setElement(term149805, 8, term151585);
        setElement(term149805, 11, term151705);
        setElement(term149805, 12, term151825);
        setElement(term149805, 13, term151225);
        setElement(term149805, 14, term151945);
        setElement(term149805, 16, term151825);
        setElement(term149805, 18, term151705);
        setElement(term149805, 19, term152065);
        setElement(term149805, 20, term151945);
        setElement(term149805, 22, term152185);
        setElement(term149805, 23, term151345);
        setElement(term149805, 24, term151825);
        setElement(term149805, 26, term152305);
        setElement(term149805, 30, term152425);
        setElement(term149805, 31, term152545);
        setElement(term149805, 32, term152665);
        setElement(term149805, 33, term151705);
        setElement(term149805, 34, term152185);
        setElement(term149805, 37, term152185);
        setElement(term149805, 38, term152185);
        setElement(term149805, 39, term152785);
        setElement(term149805, 42, term152905);
        setElement(term149805, 46, term151945);
        setElement(term149805, 53, term151945);
        setElement(term149805, 55, term153025);
        setElement(term149805, 56, term153145);
        setElement(term149805, 57, term153265);
        setElement(term149805, 61, term153385);
        setElement(term149805, 67, term151225);
        setElement(term149805, 70, term153505);
        setElement(term149805, 71, term153625);
        setElement(term149805, 72, term151585);
        setElement(term149805, 76, term153745);
        setElement(term149805, 77, term153865);
        setElement(term149805, 78, term152185);
        setElement(term149805, 79, term152185);
        setElement(term149805, 80, term152185);
        setElement(term149805, 81, term152185);
        setElement(term149805, 82, term152185);
        setElement(term149805, 83, term152185);
        setElement(term149805, 84, term152185);
        setElement(term149805, 85, term152185);
        setElement(term149805, 86, term151225);
        setElement(term149805, 87, term152785);
        setElement(term149805, 169, term153145);
        setElement(term149805, 171, term151585);
        setElement(term149805, 173, term152425);
        setElement(term149805, 177, term153745);
        setElement(term149805, 179, term153505);
        setField(term150985, term150985.getClass(), "iTypes", term149805);
        term153985 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term153985;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term150985, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
