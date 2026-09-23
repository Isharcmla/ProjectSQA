package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.lang.Boolean;

public class ArrayUtils_toPrimitive_1743406944291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310;
     Object term1319;
     Object term14753;
     Object term14738;

    public ArrayUtils_toPrimitive_1743406944291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1311 = new Boolean(true);
        Boolean term1313 = new Boolean(true);
        Boolean term1315 = new Boolean(true);
        Boolean term1317 = new Boolean(false);
        term1310 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term1310, 0, term1311);
        setElement(term1310, 1, term1313);
        setElement(term1310, 2, term1315);
        setElement(term1310, 3, term1317);
        term1319 = new Boolean(false);
        Boolean term14754 = new Boolean(true);
        Boolean term14755 = new Boolean(true);
        Boolean term14756 = new Boolean(true);
        Boolean term14757 = new Boolean(false);
        term14753 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term14753, 0, term14754);
        setElement(term14753, 1, term14755);
        setElement(term14753, 2, term14756);
        setElement(term14753, 3, term14757);
        term14738 = (boolean[]) newBooleanArray(4);
        setBooleanElement(term14738, 0, true);
        setBooleanElement(term14738, 1, true);
        setBooleanElement(term14738, 2, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1310;
        args[1] = term1319;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1310, term14753));
        assertTrue(recursiveEquals(term1319, false));
        assertTrue(recursiveEquals(retValue, term14738));
    }

};


