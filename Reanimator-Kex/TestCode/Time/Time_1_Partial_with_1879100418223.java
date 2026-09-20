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

public class Partial_with_1879100418223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110452;
     Object term111652;

    public Partial_with_1879100418223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110452 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term109916 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 77);
        Object term110572 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term110692 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term110812 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term110932 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term111052 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term111172 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term111292 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term111412 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term111532 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term109916, 0, term110572);
        setElement(term109916, 1, term110692);
        setElement(term109916, 2, term110812);
        setElement(term109916, 3, term110932);
        setElement(term109916, 4, term110812);
        setElement(term109916, 5, term111052);
        setElement(term109916, 6, term111172);
        setElement(term109916, 7, term111292);
        setElement(term109916, 8, term111412);
        setElement(term109916, 9, term111412);
        setElement(term109916, 10, term111412);
        setElement(term109916, 11, term111532);
        setElement(term109916, 12, term111412);
        setElement(term109916, 13, term111412);
        setElement(term109916, 14, term111412);
        setElement(term109916, 15, term111412);
        setElement(term109916, 16, term111532);
        setElement(term109916, 17, term111412);
        setElement(term109916, 18, term111412);
        setElement(term109916, 19, term111412);
        setElement(term109916, 20, term111412);
        setElement(term109916, 21, term111532);
        setElement(term109916, 22, term111412);
        setElement(term109916, 23, term111412);
        setElement(term109916, 24, term111412);
        setElement(term109916, 25, term111412);
        setElement(term109916, 26, term111412);
        setElement(term109916, 27, term111412);
        setElement(term109916, 28, term111412);
        setElement(term109916, 29, term111412);
        setElement(term109916, 30, term111412);
        setElement(term109916, 31, term111412);
        setElement(term109916, 32, term111412);
        setElement(term109916, 33, term111412);
        setElement(term109916, 34, term111412);
        setElement(term109916, 35, term111412);
        setElement(term109916, 36, term111412);
        setElement(term109916, 37, term111412);
        setElement(term109916, 38, term111412);
        setElement(term109916, 39, term111412);
        setElement(term109916, 40, term111412);
        setElement(term109916, 41, term111412);
        setElement(term109916, 42, term111412);
        setElement(term109916, 43, term111412);
        setElement(term109916, 44, term111412);
        setElement(term109916, 45, term111412);
        setElement(term109916, 46, term111412);
        setElement(term109916, 47, term111412);
        setElement(term109916, 48, term111412);
        setElement(term109916, 49, term111412);
        setElement(term109916, 50, term111412);
        setElement(term109916, 51, term111412);
        setElement(term109916, 52, term111412);
        setElement(term109916, 53, term111412);
        setElement(term109916, 54, term111412);
        setElement(term109916, 55, term111412);
        setElement(term109916, 56, term111412);
        setElement(term109916, 57, term111412);
        setElement(term109916, 58, term111412);
        setElement(term109916, 59, term111412);
        setElement(term109916, 60, term111412);
        setElement(term109916, 61, term111412);
        setElement(term109916, 62, term111412);
        setElement(term109916, 63, term111412);
        setElement(term109916, 64, term111412);
        setElement(term109916, 65, term111412);
        setElement(term109916, 66, term111412);
        setElement(term109916, 67, term111412);
        setElement(term109916, 68, term111412);
        setElement(term109916, 69, term111412);
        setElement(term109916, 70, term111412);
        setElement(term109916, 71, term111412);
        setElement(term109916, 72, term111412);
        setElement(term109916, 73, term111412);
        setElement(term109916, 74, term111412);
        setElement(term109916, 75, term111412);
        setElement(term109916, 76, term111412);
        setField(term110452, term110452.getClass(), "iTypes", term109916);
        term111652 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term111652;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term110452, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
