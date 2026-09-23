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

public class Partial_with_1879100418197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106509;
     Object term107589;

    public Partial_with_1879100418197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106509 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term106088 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 58);
        Object term106629 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term106749 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term106869 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term106989 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term107109 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term107229 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term107349 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term107469 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term106088, 0, term106629);
        setElement(term106088, 1, term106749);
        setElement(term106088, 2, term106869);
        setElement(term106088, 3, term106989);
        setElement(term106088, 4, term106629);
        setElement(term106088, 5, term106629);
        setElement(term106088, 6, term107109);
        setElement(term106088, 7, term107229);
        setElement(term106088, 8, term107349);
        setElement(term106088, 9, term107349);
        setElement(term106088, 10, term107469);
        setElement(term106088, 11, term107469);
        setElement(term106088, 12, term107349);
        setElement(term106088, 13, term107349);
        setElement(term106088, 14, term107349);
        setElement(term106088, 15, term107469);
        setElement(term106088, 16, term107349);
        setElement(term106088, 17, term107349);
        setElement(term106088, 18, term107349);
        setElement(term106088, 19, term107349);
        setElement(term106088, 20, term107349);
        setElement(term106088, 21, term107349);
        setElement(term106088, 22, term107349);
        setElement(term106088, 23, term107349);
        setElement(term106088, 24, term107349);
        setElement(term106088, 25, term107349);
        setElement(term106088, 26, term107349);
        setElement(term106088, 27, term107349);
        setElement(term106088, 28, term107349);
        setElement(term106088, 29, term107349);
        setElement(term106088, 30, term107349);
        setElement(term106088, 31, term107349);
        setElement(term106088, 32, term107349);
        setElement(term106088, 33, term107349);
        setElement(term106088, 34, term107349);
        setElement(term106088, 35, term107349);
        setElement(term106088, 36, term107349);
        setElement(term106088, 37, term107349);
        setElement(term106088, 38, term107349);
        setElement(term106088, 39, term107349);
        setElement(term106088, 40, term107349);
        setElement(term106088, 41, term107349);
        setElement(term106088, 42, term107349);
        setElement(term106088, 43, term107349);
        setElement(term106088, 44, term107349);
        setElement(term106088, 45, term107349);
        setElement(term106088, 46, term107349);
        setElement(term106088, 47, term107349);
        setElement(term106088, 48, term107349);
        setElement(term106088, 49, term107349);
        setElement(term106088, 50, term107349);
        setElement(term106088, 51, term107349);
        setElement(term106088, 52, term107349);
        setElement(term106088, 53, term107349);
        setElement(term106088, 54, term107349);
        setElement(term106088, 55, term107349);
        setElement(term106088, 56, term107349);
        setElement(term106088, 57, term107349);
        setField(term106509, term106509.getClass(), "iTypes", term106088);
        term107589 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term107589;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term106509, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


