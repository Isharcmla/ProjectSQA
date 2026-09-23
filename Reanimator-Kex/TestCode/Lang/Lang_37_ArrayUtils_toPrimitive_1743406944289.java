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

public class ArrayUtils_toPrimitive_1743406944289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1299;
     Object term1308;
     Object term14707;
     Object term14692;

    public ArrayUtils_toPrimitive_1743406944289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1300 = new Boolean(true);
        Boolean term1302 = new Boolean(true);
        Boolean term1304 = new Boolean(true);
        Boolean term1306 = new Boolean(false);
        term1299 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term1299, 0, term1300);
        setElement(term1299, 1, term1302);
        setElement(term1299, 2, term1304);
        setElement(term1299, 3, term1306);
        term1308 = new Boolean(false);
        Boolean term14708 = new Boolean(true);
        Boolean term14709 = new Boolean(true);
        Boolean term14710 = new Boolean(true);
        Boolean term14711 = new Boolean(false);
        term14707 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term14707, 0, term14708);
        setElement(term14707, 1, term14709);
        setElement(term14707, 2, term14710);
        setElement(term14707, 3, term14711);
        term14692 = (boolean[]) newBooleanArray(4);
        setBooleanElement(term14692, 0, true);
        setBooleanElement(term14692, 1, true);
        setBooleanElement(term14692, 2, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1299;
        args[1] = term1308;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1299, term14707));
        assertTrue(recursiveEquals(term1308, false));
        assertTrue(recursiveEquals(retValue, term14692));
    }

};


