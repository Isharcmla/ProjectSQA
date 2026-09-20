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

public class Partial_with_1879100418245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161110;
     Object term164110;

    public Partial_with_1879100418245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161110 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term160374 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 106);
        Object term161230 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term161350 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term161470 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term161590 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term161710 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term161830 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term161950 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term162070 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term162190 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term162310 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term162430 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term162550 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term162670 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term162790 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term162910 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term163030 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term163150 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term163270 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term163390 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term163510 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term163630 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term163750 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term163870 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term163990 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term160374, 0, term161230);
        setElement(term160374, 1, term161350);
        setElement(term160374, 2, term161470);
        setElement(term160374, 3, term161590);
        setElement(term160374, 4, term161470);
        setElement(term160374, 5, term161710);
        setElement(term160374, 6, term161830);
        setElement(term160374, 8, term161950);
        setElement(term160374, 9, term162070);
        setElement(term160374, 10, term161470);
        setElement(term160374, 11, term161470);
        setElement(term160374, 12, term161470);
        setElement(term160374, 13, term162190);
        setElement(term160374, 14, term162310);
        setElement(term160374, 15, term161470);
        setElement(term160374, 16, term161470);
        setElement(term160374, 17, term161470);
        setElement(term160374, 18, term162430);
        setElement(term160374, 19, term162550);
        setElement(term160374, 20, term162670);
        setElement(term160374, 21, term161470);
        setElement(term160374, 22, term161470);
        setElement(term160374, 23, term162790);
        setElement(term160374, 24, term162910);
        setElement(term160374, 26, term161470);
        setElement(term160374, 27, term161470);
        setElement(term160374, 28, term161470);
        setElement(term160374, 30, term161470);
        setElement(term160374, 31, term163030);
        setElement(term160374, 32, term161830);
        setElement(term160374, 33, term163150);
        setElement(term160374, 34, term161470);
        setElement(term160374, 35, term161470);
        setElement(term160374, 36, term161470);
        setElement(term160374, 37, term161470);
        setElement(term160374, 38, term161470);
        setElement(term160374, 39, term161470);
        setElement(term160374, 40, term161470);
        setElement(term160374, 41, term161470);
        setElement(term160374, 42, term163270);
        setElement(term160374, 43, term163390);
        setElement(term160374, 44, term161830);
        setElement(term160374, 45, term163150);
        setElement(term160374, 46, term161590);
        setElement(term160374, 47, term163510);
        setElement(term160374, 48, term161710);
        setElement(term160374, 50, term161470);
        setElement(term160374, 51, term161470);
        setElement(term160374, 52, term161470);
        setElement(term160374, 54, term163630);
        setElement(term160374, 55, term161470);
        setElement(term160374, 56, term161470);
        setElement(term160374, 57, term161470);
        setElement(term160374, 58, term161470);
        setElement(term160374, 59, term161470);
        setElement(term160374, 60, term161470);
        setElement(term160374, 61, term161470);
        setElement(term160374, 62, term161470);
        setElement(term160374, 63, term161470);
        setElement(term160374, 64, term161470);
        setElement(term160374, 65, term161470);
        setElement(term160374, 66, term161470);
        setElement(term160374, 67, term161470);
        setElement(term160374, 68, term161470);
        setElement(term160374, 69, term161470);
        setElement(term160374, 70, term161470);
        setElement(term160374, 71, term161470);
        setElement(term160374, 72, term161470);
        setElement(term160374, 73, term161470);
        setElement(term160374, 74, term161470);
        setElement(term160374, 75, term161470);
        setElement(term160374, 77, term161470);
        setElement(term160374, 78, term161470);
        setElement(term160374, 79, term161470);
        setElement(term160374, 81, term161470);
        setElement(term160374, 82, term161470);
        setElement(term160374, 83, term161470);
        setElement(term160374, 85, term161470);
        setElement(term160374, 86, term161470);
        setElement(term160374, 87, term161470);
        setElement(term160374, 88, term161470);
        setElement(term160374, 89, term161470);
        setElement(term160374, 90, term161470);
        setElement(term160374, 91, term163030);
        setElement(term160374, 92, term163750);
        setElement(term160374, 93, term161470);
        setElement(term160374, 94, term161470);
        setElement(term160374, 95, term161470);
        setElement(term160374, 96, term161470);
        setElement(term160374, 97, term161470);
        setElement(term160374, 98, term161470);
        setElement(term160374, 99, term161470);
        setElement(term160374, 101, term163270);
        setElement(term160374, 102, term163870);
        setElement(term160374, 103, term162190);
        setElement(term160374, 104, term162550);
        setElement(term160374, 105, term163990);
        setField(term161110, term161110.getClass(), "iTypes", term160374);
        term164110 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term164110;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term161110, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
