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

public class MutableDateTime_init_1076044844112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21038;
     Object term21040;
     Object term21042;
     Object term21044;
     Object term21046;
     Object term21048;
     Object term21050;

    public MutableDateTime_init_1076044844112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21038 = new Integer(0);
        term21040 = new Integer(0);
        term21042 = new Integer(0);
        term21044 = new Integer(0);
        term21046 = new Integer(0);
        term21048 = new Integer(0);
        term21050 = new Integer(0);
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
        args[0] = term21038;
        args[1] = term21040;
        args[2] = term21042;
        args[3] = term21044;
        args[4] = term21046;
        args[5] = term21048;
        args[6] = term21050;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


