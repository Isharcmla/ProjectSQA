package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1905304068270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65888;
     Object term65936;

    public BasicMonthOfYearDateTimeField_add_1905304068270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65888 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term65936 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term65764 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term65936, term65936.getClass(), "iTypes", term65764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term65936;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term65888, args);
    }

};


