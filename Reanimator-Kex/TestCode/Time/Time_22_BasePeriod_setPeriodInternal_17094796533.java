package org.joda.time.base;

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
import java.lang.NullPointerException;
import static org.joda.time.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BasePeriod_setPeriodInternal_17094796533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term67;
     Object term69;
     Object term71;
     Object term73;
     Object term75;
     Object term77;
     Object term79;

    public BasePeriod_setPeriodInternal_17094796533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = new Integer(454281060);
        term67 = new Integer(-1786399638);
        term69 = new Integer(2055867847);
        term71 = new Integer(-1048298087);
        term73 = new Integer(292681826);
        term75 = new Integer(458147407);
        term77 = new Integer(-184153539);
        term79 = new Integer(493620644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BasePeriod");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term65;
        args[1] = term67;
        args[2] = term69;
        args[3] = term71;
        args[4] = term73;
        args[5] = term75;
        args[6] = term77;
        args[7] = term79;
        try {
            callMethod(klass, "setPeriodInternal", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


