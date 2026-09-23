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

public class LocalDateTime_init_1450890335138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38244;
     Object term38246;
     Object term38248;
     Object term38250;
     Object term38252;
     Object term38254;

    public LocalDateTime_init_1450890335138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38244 = new Integer(0);
        term38246 = new Integer(0);
        term38248 = new Integer(0);
        term38250 = new Integer(0);
        term38252 = new Integer(0);
        term38254 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDateTime");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term38244;
        args[1] = term38246;
        args[2] = term38248;
        args[3] = term38250;
        args[4] = term38252;
        args[5] = term38254;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


