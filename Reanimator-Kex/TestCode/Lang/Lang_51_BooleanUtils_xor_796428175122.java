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
import java.lang.Object;
import java.lang.Boolean;

public class BooleanUtils_xor_796428175122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13033;
     Object term13263;
     Object term13261;

    public BooleanUtils_xor_796428175122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term13165 = new Boolean(false);
        Boolean term13213 = new Boolean(true);
        term13033 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term13033, 0, term13165);
        setElement(term13033, 1, term13213);
        setElement(term13033, 2, term13213);
        setElement(term13033, 3, term13213);
        Boolean term13264 = new Boolean(false);
        Boolean term13265 = new Boolean(true);
        Boolean term13266 = new Boolean(true);
        Boolean term13267 = new Boolean(true);
        term13263 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term13263, 0, term13264);
        setElement(term13263, 1, term13265);
        setElement(term13263, 2, term13266);
        setElement(term13263, 3, term13267);
        term13261 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term13033;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term13033, term13263));
        assertTrue(recursiveEquals(retValue, term13261));
    }

};


