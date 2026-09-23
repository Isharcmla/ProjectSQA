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

public class MutableDateTime_init_195915085497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20970;
     Object term20972;
     Object term20974;
     Object term20976;
     Object term20978;
     Object term20980;
     Object term20982;

    public MutableDateTime_init_195915085497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20970 = new Integer(0);
        term20972 = new Integer(0);
        term20974 = new Integer(0);
        term20976 = new Integer(0);
        term20978 = new Integer(0);
        term20980 = new Integer(0);
        term20982 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term20970;
        args[1] = term20972;
        args[2] = term20974;
        args[3] = term20976;
        args[4] = term20978;
        args[5] = term20980;
        args[6] = term20982;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


