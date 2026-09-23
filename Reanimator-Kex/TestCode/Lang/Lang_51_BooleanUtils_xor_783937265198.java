package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;

public class BooleanUtils_xor_783937265198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20391;
     Object term20473;

    public BooleanUtils_xor_783937265198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20391 = (boolean[]) newBooleanArray(4);
        setBooleanElement(term20391, 1, true);
        term20473 = (boolean[]) newBooleanArray(4);
        setBooleanElement(term20473, 1, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term20391;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term20391, term20473));
        assertTrue(recursiveEquals(retValue, true));
    }

};


