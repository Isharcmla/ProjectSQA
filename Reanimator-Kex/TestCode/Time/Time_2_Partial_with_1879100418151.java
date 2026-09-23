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

public class Partial_with_1879100418151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653990;
     Object term657470;

    public Partial_with_1879100418151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653990 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term653144 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 123);
        Object term654110 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term654230 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term654350 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term654470 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term654590 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term654710 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term654830 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term654950 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term655070 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term655190 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term655310 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term655430 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term655550 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term655670 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term655790 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term655910 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term656030 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term656150 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term656270 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term656390 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term656510 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term656630 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term656750 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term656870 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term656990 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term657110 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term657230 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term657350 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term653144, 0, term654110);
        setElement(term653144, 1, term654230);
        setElement(term653144, 2, term654350);
        setElement(term653144, 3, term654470);
        setElement(term653144, 4, term654590);
        setElement(term653144, 5, term654710);
        setElement(term653144, 6, term654830);
        setElement(term653144, 7, term654470);
        setElement(term653144, 8, term654950);
        setElement(term653144, 9, term654350);
        setElement(term653144, 10, term654590);
        setElement(term653144, 11, term655070);
        setElement(term653144, 12, term655190);
        setElement(term653144, 13, term655310);
        setElement(term653144, 14, term655430);
        setElement(term653144, 15, term655550);
        setElement(term653144, 16, term655670);
        setElement(term653144, 17, term655790);
        setElement(term653144, 18, term655910);
        setElement(term653144, 19, term655190);
        setElement(term653144, 20, term655430);
        setElement(term653144, 23, term656030);
        setElement(term653144, 24, term656150);
        setElement(term653144, 25, term655430);
        setElement(term653144, 26, term655910);
        setElement(term653144, 27, term655430);
        setElement(term653144, 28, term655430);
        setElement(term653144, 29, term655430);
        setElement(term653144, 30, term655430);
        setElement(term653144, 31, term655430);
        setElement(term653144, 32, term655070);
        setElement(term653144, 33, term655430);
        setElement(term653144, 34, term655430);
        setElement(term653144, 35, term655430);
        setElement(term653144, 36, term655430);
        setElement(term653144, 37, term654350);
        setElement(term653144, 38, term655430);
        setElement(term653144, 39, term655430);
        setElement(term653144, 40, term654710);
        setElement(term653144, 41, term655430);
        setElement(term653144, 42, term655430);
        setElement(term653144, 43, term655430);
        setElement(term653144, 44, term656270);
        setElement(term653144, 45, term656390);
        setElement(term653144, 46, term654110);
        setElement(term653144, 47, term654830);
        setElement(term653144, 48, term655670);
        setElement(term653144, 49, term655910);
        setElement(term653144, 50, term654470);
        setElement(term653144, 51, term655550);
        setElement(term653144, 52, term656510);
        setElement(term653144, 53, term655430);
        setElement(term653144, 55, term655430);
        setElement(term653144, 56, term656630);
        setElement(term653144, 57, term655430);
        setElement(term653144, 58, term655430);
        setElement(term653144, 59, term655430);
        setElement(term653144, 60, term655430);
        setElement(term653144, 61, term655430);
        setElement(term653144, 62, term655430);
        setElement(term653144, 63, term655430);
        setElement(term653144, 64, term655430);
        setElement(term653144, 65, term656750);
        setElement(term653144, 66, term656750);
        setElement(term653144, 67, term655430);
        setElement(term653144, 68, term655430);
        setElement(term653144, 69, term655430);
        setElement(term653144, 70, term655430);
        setElement(term653144, 71, term655430);
        setElement(term653144, 72, term655430);
        setElement(term653144, 73, term655430);
        setElement(term653144, 74, term655430);
        setElement(term653144, 75, term655430);
        setElement(term653144, 76, term655430);
        setElement(term653144, 77, term655430);
        setElement(term653144, 78, term655430);
        setElement(term653144, 79, term655430);
        setElement(term653144, 80, term655430);
        setElement(term653144, 81, term655430);
        setElement(term653144, 82, term655430);
        setElement(term653144, 83, term655430);
        setElement(term653144, 84, term655430);
        setElement(term653144, 85, term655430);
        setElement(term653144, 86, term655430);
        setElement(term653144, 87, term655430);
        setElement(term653144, 88, term655430);
        setElement(term653144, 89, term655430);
        setElement(term653144, 90, term655430);
        setElement(term653144, 91, term655430);
        setElement(term653144, 92, term655430);
        setElement(term653144, 93, term655430);
        setElement(term653144, 94, term655430);
        setElement(term653144, 95, term655430);
        setElement(term653144, 96, term655430);
        setElement(term653144, 97, term655430);
        setElement(term653144, 98, term655430);
        setElement(term653144, 99, term655430);
        setElement(term653144, 100, term655430);
        setElement(term653144, 101, term655430);
        setElement(term653144, 102, term655430);
        setElement(term653144, 103, term655430);
        setElement(term653144, 104, term655430);
        setElement(term653144, 105, term654110);
        setElement(term653144, 106, term654590);
        setElement(term653144, 107, term654590);
        setElement(term653144, 108, term656510);
        setElement(term653144, 109, term656870);
        setElement(term653144, 110, term656990);
        setElement(term653144, 111, term655190);
        setElement(term653144, 114, term657110);
        setElement(term653144, 115, term657230);
        setElement(term653144, 116, term656630);
        setElement(term653144, 117, term656510);
        setElement(term653144, 118, term654350);
        setElement(term653144, 119, term654350);
        setElement(term653144, 120, term655190);
        setElement(term653144, 121, term657230);
        setElement(term653144, 122, term657350);
        setField(term653990, term653990.getClass(), "iTypes", term653144);
        term657470 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term657470;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term653990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


