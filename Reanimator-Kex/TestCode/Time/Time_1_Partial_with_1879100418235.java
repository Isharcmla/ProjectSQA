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

public class Partial_with_1879100418235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140158;
     Object term143758;

    public Partial_with_1879100418235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140158 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term139232 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 136);
        Object term140278 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term140398 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term140518 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term140638 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term140758 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term140878 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term140998 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term141118 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term141238 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term141358 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term141478 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term141598 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term141718 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term141838 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term141958 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term142078 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term142198 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term142318 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term142438 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term142558 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term142678 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term142798 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term142918 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term143038 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term143158 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term143278 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term143398 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term143518 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term143638 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term139232, 0, term140278);
        setElement(term139232, 1, term140398);
        setElement(term139232, 2, term140518);
        setElement(term139232, 3, term140638);
        setElement(term139232, 4, term140758);
        setElement(term139232, 5, term140878);
        setElement(term139232, 6, term140998);
        setElement(term139232, 7, term141118);
        setElement(term139232, 8, term141238);
        setElement(term139232, 9, term141118);
        setElement(term139232, 10, term141358);
        setElement(term139232, 11, term140998);
        setElement(term139232, 12, term141478);
        setElement(term139232, 13, term141478);
        setElement(term139232, 14, term141598);
        setElement(term139232, 16, term141718);
        setElement(term139232, 17, term141478);
        setElement(term139232, 18, term141838);
        setElement(term139232, 19, term141958);
        setElement(term139232, 20, term140758);
        setElement(term139232, 21, term141718);
        setElement(term139232, 22, term140758);
        setElement(term139232, 23, term142078);
        setElement(term139232, 24, term140998);
        setElement(term139232, 25, term142078);
        setElement(term139232, 26, term141358);
        setElement(term139232, 27, term141358);
        setElement(term139232, 28, term141358);
        setElement(term139232, 29, term142198);
        setElement(term139232, 30, term142318);
        setElement(term139232, 31, term142438);
        setElement(term139232, 32, term142558);
        setElement(term139232, 34, term142678);
        setElement(term139232, 35, term141358);
        setElement(term139232, 36, term141358);
        setElement(term139232, 37, term141358);
        setElement(term139232, 38, term141358);
        setElement(term139232, 39, term141358);
        setElement(term139232, 40, term141358);
        setElement(term139232, 41, term141358);
        setElement(term139232, 42, term141358);
        setElement(term139232, 43, term142798);
        setElement(term139232, 44, term142198);
        setElement(term139232, 45, term140878);
        setElement(term139232, 46, term142678);
        setElement(term139232, 47, term142918);
        setElement(term139232, 48, term141958);
        setElement(term139232, 49, term143038);
        setElement(term139232, 56, term141718);
        setElement(term139232, 58, term141358);
        setElement(term139232, 59, term141358);
        setElement(term139232, 60, term141358);
        setElement(term139232, 61, term141358);
        setElement(term139232, 62, term141358);
        setElement(term139232, 64, term143158);
        setElement(term139232, 65, term141358);
        setElement(term139232, 66, term141358);
        setElement(term139232, 68, term141358);
        setElement(term139232, 69, term141358);
        setElement(term139232, 70, term141358);
        setElement(term139232, 72, term141358);
        setElement(term139232, 73, term140278);
        setElement(term139232, 74, term142078);
        setElement(term139232, 76, term142318);
        setElement(term139232, 77, term140398);
        setElement(term139232, 78, term142198);
        setElement(term139232, 80, term142918);
        setElement(term139232, 81, term143038);
        setElement(term139232, 82, term142558);
        setElement(term139232, 84, term141358);
        setElement(term139232, 85, term141358);
        setElement(term139232, 86, term141358);
        setElement(term139232, 87, term141358);
        setElement(term139232, 88, term141358);
        setElement(term139232, 89, term141358);
        setElement(term139232, 90, term140878);
        setElement(term139232, 91, term141358);
        setElement(term139232, 92, term142678);
        setElement(term139232, 93, term141358);
        setElement(term139232, 94, term141358);
        setElement(term139232, 95, term141358);
        setElement(term139232, 96, term141958);
        setElement(term139232, 97, term142558);
        setElement(term139232, 98, term141358);
        setElement(term139232, 99, term141358);
        setElement(term139232, 100, term141358);
        setElement(term139232, 101, term141358);
        setElement(term139232, 102, term143278);
        setElement(term139232, 106, term140878);
        setElement(term139232, 107, term143398);
        setElement(term139232, 108, term143398);
        setElement(term139232, 109, term143038);
        setElement(term139232, 110, term142558);
        setElement(term139232, 111, term141118);
        setElement(term139232, 112, term143518);
        setElement(term139232, 113, term141838);
        setElement(term139232, 114, term142918);
        setElement(term139232, 115, term143278);
        setElement(term139232, 119, term141838);
        setElement(term139232, 120, term142558);
        setElement(term139232, 121, term140638);
        setElement(term139232, 123, term143278);
        setElement(term139232, 127, term140638);
        setElement(term139232, 131, term142918);
        setElement(term139232, 133, term143638);
        setElement(term139232, 135, term141958);
        setField(term140158, term140158.getClass(), "iTypes", term139232);
        term143758 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term143758;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term140158, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
