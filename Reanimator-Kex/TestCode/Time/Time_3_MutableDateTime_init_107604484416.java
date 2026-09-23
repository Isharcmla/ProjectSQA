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

public class MutableDateTime_init_107604484416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;
     Object term109;
     Object term111;
     Object term113;
     Object term115;
     Object term117;
     Object term119;

    public MutableDateTime_init_107604484416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = new Integer(597278769);
        term109 = new Integer(-1685132342);
        term111 = new Integer(-1456670397);
        term113 = new Integer(1622346318);
        term115 = new Integer(1048535127);
        term117 = new Integer(-655067527);
        term119 = new Integer(-6029667);
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
        argTypes[7] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[8];
        args[0] = term107;
        args[1] = term109;
        args[2] = term111;
        args[3] = term113;
        args[4] = term115;
        args[5] = term117;
        args[6] = term119;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


