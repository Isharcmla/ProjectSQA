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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MutableDateTime_init_1306924291111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21024;
     Object term21026;
     Object term21028;
     Object term21030;
     Object term21032;
     Object term21034;
     Object term21036;

    public MutableDateTime_init_1306924291111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21024 = new Integer(0);
        term21026 = new Integer(0);
        term21028 = new Integer(0);
        term21030 = new Integer(0);
        term21032 = new Integer(0);
        term21034 = new Integer(0);
        term21036 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[8];
        args[0] = term21024;
        args[1] = term21026;
        args[2] = term21028;
        args[3] = term21030;
        args[4] = term21032;
        args[5] = term21034;
        args[6] = term21036;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


