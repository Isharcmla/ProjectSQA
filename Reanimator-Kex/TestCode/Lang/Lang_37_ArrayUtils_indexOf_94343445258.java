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
import java.lang.Float;
import java.lang.Integer;

public class ArrayUtils_indexOf_94343445258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term970;
     Object term978;
     Object term980;
     Object term13721;

    public ArrayUtils_indexOf_94343445258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term970 = (float[]) newFloatArray(7);
        setFloatElement(term970, 0, 0.7031006F);
        setFloatElement(term970, 1, 0.9431611F);
        setFloatElement(term970, 2, 0.95272815F);
        setFloatElement(term970, 3, 0.7254646F);
        setFloatElement(term970, 4, 0.9828442F);
        setFloatElement(term970, 5, 0.9472605F);
        setFloatElement(term970, 6, 0.27797186F);
        term978 = new Float(0.7467328F);
        term980 = new Integer(-478195677);
        term13721 = (float[]) newFloatArray(7);
        setFloatElement(term13721, 0, 0.7031006F);
        setFloatElement(term13721, 1, 0.9431611F);
        setFloatElement(term13721, 2, 0.95272815F);
        setFloatElement(term13721, 3, 0.7254646F);
        setFloatElement(term13721, 4, 0.9828442F);
        setFloatElement(term13721, 5, 0.9472605F);
        setFloatElement(term13721, 6, 0.27797186F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = float.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term970;
        args[1] = term978;
        args[2] = term980;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term970, term13721));
        assertTrue(recursiveEquals(term978, 0.7467328F));
        assertTrue(recursiveEquals(term980, -478195677));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


