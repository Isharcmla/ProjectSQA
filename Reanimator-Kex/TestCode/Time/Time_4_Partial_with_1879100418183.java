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

public class Partial_with_1879100418183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81037;
     Object term83917;

    public Partial_with_1879100418183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81037 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term80276 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 110);
        Object term81157 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term81277 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term81397 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term81517 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term81637 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term81757 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term81877 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term81997 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term82117 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term82237 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term82357 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term82477 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term82597 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term82717 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term82837 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term82957 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term83077 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term83197 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term83317 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term83437 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term83557 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term83677 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term83797 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term80276, 0, term81157);
        setElement(term80276, 1, term81277);
        setElement(term80276, 2, term81397);
        setElement(term80276, 3, term81397);
        setElement(term80276, 4, term81517);
        setElement(term80276, 5, term81637);
        setElement(term80276, 6, term81757);
        setElement(term80276, 7, term81877);
        setElement(term80276, 8, term81997);
        setElement(term80276, 9, term82117);
        setElement(term80276, 10, term82237);
        setElement(term80276, 11, term81277);
        setElement(term80276, 12, term82357);
        setElement(term80276, 13, term82477);
        setElement(term80276, 14, term82597);
        setElement(term80276, 15, term82717);
        setElement(term80276, 16, term82837);
        setElement(term80276, 17, term81397);
        setElement(term80276, 19, term81637);
        setElement(term80276, 20, term81277);
        setElement(term80276, 21, term82957);
        setElement(term80276, 22, term81397);
        setElement(term80276, 23, term81397);
        setElement(term80276, 24, term81397);
        setElement(term80276, 25, term81397);
        setElement(term80276, 26, term81397);
        setElement(term80276, 27, term83077);
        setElement(term80276, 28, term81397);
        setElement(term80276, 29, term83197);
        setElement(term80276, 30, term81397);
        setElement(term80276, 31, term81397);
        setElement(term80276, 32, term82237);
        setElement(term80276, 33, term83317);
        setElement(term80276, 34, term81397);
        setElement(term80276, 35, term81397);
        setElement(term80276, 36, term81397);
        setElement(term80276, 37, term81397);
        setElement(term80276, 38, term81397);
        setElement(term80276, 39, term81397);
        setElement(term80276, 40, term81397);
        setElement(term80276, 41, term81397);
        setElement(term80276, 42, term81277);
        setElement(term80276, 43, term81397);
        setElement(term80276, 44, term81397);
        setElement(term80276, 45, term81997);
        setElement(term80276, 46, term82717);
        setElement(term80276, 47, term83437);
        setElement(term80276, 48, term81757);
        setElement(term80276, 49, term82837);
        setElement(term80276, 51, term81397);
        setElement(term80276, 52, term81397);
        setElement(term80276, 53, term81397);
        setElement(term80276, 55, term81397);
        setElement(term80276, 56, term81397);
        setElement(term80276, 57, term81397);
        setElement(term80276, 59, term81397);
        setElement(term80276, 60, term81397);
        setElement(term80276, 61, term81397);
        setElement(term80276, 62, term81397);
        setElement(term80276, 63, term81397);
        setElement(term80276, 64, term81397);
        setElement(term80276, 65, term81397);
        setElement(term80276, 67, term83557);
        setElement(term80276, 68, term81397);
        setElement(term80276, 69, term81397);
        setElement(term80276, 71, term81397);
        setElement(term80276, 72, term81397);
        setElement(term80276, 73, term81397);
        setElement(term80276, 75, term81397);
        setElement(term80276, 76, term81397);
        setElement(term80276, 77, term81397);
        setElement(term80276, 78, term83197);
        setElement(term80276, 79, term81397);
        setElement(term80276, 80, term81397);
        setElement(term80276, 81, term81397);
        setElement(term80276, 83, term81397);
        setElement(term80276, 84, term81397);
        setElement(term80276, 85, term81397);
        setElement(term80276, 86, term81397);
        setElement(term80276, 87, term81397);
        setElement(term80276, 88, term81397);
        setElement(term80276, 89, term81397);
        setElement(term80276, 90, term81397);
        setElement(term80276, 91, term81397);
        setElement(term80276, 92, term81397);
        setElement(term80276, 93, term81397);
        setElement(term80276, 94, term81397);
        setElement(term80276, 95, term83557);
        setElement(term80276, 96, term81397);
        setElement(term80276, 97, term81397);
        setElement(term80276, 98, term81397);
        setElement(term80276, 99, term81397);
        setElement(term80276, 100, term81397);
        setElement(term80276, 101, term81397);
        setElement(term80276, 102, term81397);
        setElement(term80276, 103, term81397);
        setElement(term80276, 104, term81397);
        setElement(term80276, 105, term83677);
        setElement(term80276, 106, term83197);
        setElement(term80276, 107, term83797);
        setElement(term80276, 108, term83557);
        setElement(term80276, 109, term83677);
        setField(term81037, term81037.getClass(), "iTypes", term80276);
        term83917 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term83917;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term81037, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


