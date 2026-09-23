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

public class LocalDateTime_init_213094870518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697;
     Object term699;
     Object term701;
     Object term703;
     Object term705;
     Object term707;
     Object term709;

    public LocalDateTime_init_213094870518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697 = new Integer(1134449235);
        term699 = new Integer(-883034806);
        term701 = new Integer(1585847225);
        term703 = new Integer(597278769);
        term705 = new Integer(-1685132342);
        term707 = new Integer(-1456670397);
        term709 = new Integer(1622346318);
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
        args[0] = term697;
        args[1] = term699;
        args[2] = term701;
        args[3] = term703;
        args[4] = term705;
        args[5] = term707;
        args[6] = term709;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


