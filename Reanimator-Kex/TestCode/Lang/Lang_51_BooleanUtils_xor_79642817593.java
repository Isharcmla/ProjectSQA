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

public class BooleanUtils_xor_79642817593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3187;
     Object term3374;
     Object term3372;

    public BooleanUtils_xor_79642817593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3325 = new Boolean(false);
        term3187 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term3187, 0, term3325);
        setElement(term3187, 1, term3325);
        setElement(term3187, 2, term3325);
        setElement(term3187, 3, term3325);
        Boolean term3375 = new Boolean(false);
        Boolean term3376 = new Boolean(false);
        Boolean term3377 = new Boolean(false);
        Boolean term3378 = new Boolean(false);
        term3374 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term3374, 0, term3375);
        setElement(term3374, 1, term3376);
        setElement(term3374, 2, term3377);
        setElement(term3374, 3, term3378);
        term3372 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3187;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term3187, term3374));
        assertTrue(recursiveEquals(retValue, term3372));
    }

};


