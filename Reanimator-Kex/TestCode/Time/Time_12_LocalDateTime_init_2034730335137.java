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

public class LocalDateTime_init_2034730335137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38234;
     Object term38236;
     Object term38238;
     Object term38240;
     Object term38242;

    public LocalDateTime_init_2034730335137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38234 = new Integer(0);
        term38236 = new Integer(0);
        term38238 = new Integer(0);
        term38240 = new Integer(0);
        term38242 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDateTime");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term38234;
        args[1] = term38236;
        args[2] = term38238;
        args[3] = term38240;
        args[4] = term38242;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


