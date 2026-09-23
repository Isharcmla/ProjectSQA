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

public class Partial_with_1879100418173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64900;
     Object term68140;

    public Partial_with_1879100418173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64900 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term64087 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 118);
        Object term65020 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term65140 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term65260 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term65380 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term65500 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term65620 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term65740 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term65860 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term65980 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term66100 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term66220 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term66340 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term66460 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term66580 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term66700 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term66820 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term66940 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term67060 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term67180 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term67300 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term67420 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term67540 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term67660 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term67780 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term67900 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term68020 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term64087, 0, term65020);
        setElement(term64087, 1, term65140);
        setElement(term64087, 2, term65260);
        setElement(term64087, 3, term65380);
        setElement(term64087, 5, term65500);
        setElement(term64087, 6, term65620);
        setElement(term64087, 10, term65740);
        setElement(term64087, 12, term65620);
        setElement(term64087, 13, term65500);
        setElement(term64087, 14, term65860);
        setElement(term64087, 15, term65980);
        setElement(term64087, 16, term66100);
        setElement(term64087, 17, term66220);
        setElement(term64087, 18, term66100);
        setElement(term64087, 19, term66340);
        setElement(term64087, 20, term66100);
        setElement(term64087, 21, term66460);
        setElement(term64087, 22, term65740);
        setElement(term64087, 23, term65740);
        setElement(term64087, 24, term66580);
        setElement(term64087, 25, term66700);
        setElement(term64087, 26, term66100);
        setElement(term64087, 27, term66820);
        setElement(term64087, 29, term66100);
        setElement(term64087, 30, term66100);
        setElement(term64087, 31, term66940);
        setElement(term64087, 32, term65500);
        setElement(term64087, 33, term65860);
        setElement(term64087, 34, term66100);
        setElement(term64087, 35, term67060);
        setElement(term64087, 37, term65980);
        setElement(term64087, 38, term66100);
        setElement(term64087, 39, term66100);
        setElement(term64087, 41, term66100);
        setElement(term64087, 42, term66100);
        setElement(term64087, 43, term66100);
        setElement(term64087, 44, term66100);
        setElement(term64087, 45, term66100);
        setElement(term64087, 46, term65380);
        setElement(term64087, 47, term67180);
        setElement(term64087, 48, term67300);
        setElement(term64087, 49, term67420);
        setElement(term64087, 50, term66580);
        setElement(term64087, 51, term67540);
        setElement(term64087, 52, term66820);
        setElement(term64087, 53, term66100);
        setElement(term64087, 54, term65500);
        setElement(term64087, 55, term66100);
        setElement(term64087, 57, term66100);
        setElement(term64087, 58, term66100);
        setElement(term64087, 59, term66100);
        setElement(term64087, 61, term66100);
        setElement(term64087, 62, term66100);
        setElement(term64087, 63, term66100);
        setElement(term64087, 65, term66100);
        setElement(term64087, 69, term66100);
        setElement(term64087, 71, term66100);
        setElement(term64087, 73, term66100);
        setElement(term64087, 77, term66100);
        setElement(term64087, 78, term66100);
        setElement(term64087, 80, term66100);
        setElement(term64087, 82, term66100);
        setElement(term64087, 84, term66100);
        setElement(term64087, 85, term67660);
        setElement(term64087, 86, term67780);
        setElement(term64087, 87, term66100);
        setElement(term64087, 88, term66100);
        setElement(term64087, 90, term66100);
        setElement(term64087, 91, term66100);
        setElement(term64087, 92, term66100);
        setElement(term64087, 93, term66100);
        setElement(term64087, 94, term66100);
        setElement(term64087, 95, term66100);
        setElement(term64087, 96, term66100);
        setElement(term64087, 97, term66100);
        setElement(term64087, 98, term66100);
        setElement(term64087, 99, term66100);
        setElement(term64087, 100, term66100);
        setElement(term64087, 101, term66100);
        setElement(term64087, 102, term66100);
        setElement(term64087, 103, term66100);
        setElement(term64087, 104, term66100);
        setElement(term64087, 105, term66100);
        setElement(term64087, 106, term66460);
        setElement(term64087, 107, term66100);
        setElement(term64087, 108, term65500);
        setElement(term64087, 109, term67900);
        setElement(term64087, 110, term65740);
        setElement(term64087, 112, term65740);
        setElement(term64087, 116, term66220);
        setElement(term64087, 117, term68020);
        setField(term64900, term64900.getClass(), "iTypes", term64087);
        term68140 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term68140;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term64900, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


