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

public class BooleanUtils_xor_796428175159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17946;
     Object term18396;
     Object term18394;

    public BooleanUtils_xor_796428175159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term18039 = new Boolean(true);
        term17946 = (Object[]) newArray("java.lang.Boolean", 2);
        setElement(term17946, 0, term18039);
        setElement(term17946, 1, term18039);
        Boolean term18397 = new Boolean(true);
        Boolean term18398 = new Boolean(true);
        term18396 = (Object[]) newArray("java.lang.Boolean", 2);
        setElement(term18396, 0, term18397);
        setElement(term18396, 1, term18398);
        term18394 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term17946;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term17946, term18396));
        assertTrue(recursiveEquals(retValue, term18394));
    }

};


