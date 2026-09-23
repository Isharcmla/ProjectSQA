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

public class BasePeriod_setPeriod_38897815032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term51;
     Object term53;
     Object term55;
     Object term57;
     Object term59;
     Object term61;
     Object term63;

    public BasePeriod_setPeriod_38897815032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = new Integer(-157887805);
        term51 = new Integer(1876565163);
        term53 = new Integer(-817164822);
        term55 = new Integer(-1016503459);
        term57 = new Integer(-1968847291);
        term59 = new Integer(579005622);
        term61 = new Integer(-14890619);
        term63 = new Integer(1632125673);
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
        args[0] = term49;
        args[1] = term51;
        args[2] = term53;
        args[3] = term55;
        args[4] = term57;
        args[5] = term59;
        args[6] = term61;
        args[7] = term63;
        try {
            callMethod(klass, "setPeriod", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


