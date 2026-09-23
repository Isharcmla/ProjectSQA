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

public class MutableDateTime_init_130692429115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term95;
     Object term97;
     Object term99;
     Object term101;
     Object term103;
     Object term105;

    public MutableDateTime_init_130692429115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = new Integer(1227103734);
        term95 = new Integer(-1339778481);
        term97 = new Integer(1725571209);
        term99 = new Integer(-522618178);
        term101 = new Integer(1134449235);
        term103 = new Integer(-883034806);
        term105 = new Integer(1585847225);
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
        args[0] = term93;
        args[1] = term95;
        args[2] = term97;
        args[3] = term99;
        args[4] = term101;
        args[5] = term103;
        args[6] = term105;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


