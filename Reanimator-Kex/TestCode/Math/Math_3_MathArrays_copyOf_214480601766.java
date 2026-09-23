package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;

public class MathArrays_copyOf_214480601766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2155;
     Object term16986;
     Object term16980;

    public MathArrays_copyOf_214480601766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2155 = (int[]) newIntArray(5);
        setIntElement(term2155, 0, 1134449235);
        setIntElement(term2155, 1, -883034806);
        setIntElement(term2155, 2, 1585847225);
        setIntElement(term2155, 3, 597278769);
        setIntElement(term2155, 4, -1685132342);
        term16986 = (int[]) newIntArray(5);
        setIntElement(term16986, 0, 1134449235);
        setIntElement(term16986, 1, -883034806);
        setIntElement(term16986, 2, 1585847225);
        setIntElement(term16986, 3, 597278769);
        setIntElement(term16986, 4, -1685132342);
        term16980 = (int[]) newIntArray(5);
        setIntElement(term16980, 0, 1134449235);
        setIntElement(term16980, 1, -883034806);
        setIntElement(term16980, 2, 1585847225);
        setIntElement(term16980, 3, 597278769);
        setIntElement(term16980, 4, -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2155;
        Object retValue = callMethod(klass, "copyOf", argTypes, null, args);
        assertTrue(recursiveEquals(term2155, term16986));
        assertTrue(recursiveEquals(retValue, term16980));
    }

};


