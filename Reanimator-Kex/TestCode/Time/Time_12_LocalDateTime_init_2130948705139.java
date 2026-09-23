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

public class LocalDateTime_init_2130948705139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38256;
     Object term38258;
     Object term38260;
     Object term38262;
     Object term38264;
     Object term38266;
     Object term38268;

    public LocalDateTime_init_2130948705139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38256 = new Integer(0);
        term38258 = new Integer(0);
        term38260 = new Integer(0);
        term38262 = new Integer(0);
        term38264 = new Integer(0);
        term38266 = new Integer(0);
        term38268 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDateTime");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term38256;
        args[1] = term38258;
        args[2] = term38260;
        args[3] = term38262;
        args[4] = term38264;
        args[5] = term38266;
        args[6] = term38268;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


