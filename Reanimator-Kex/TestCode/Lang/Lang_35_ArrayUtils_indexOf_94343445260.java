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

public class ArrayUtils_indexOf_94343445260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term981;
     Object term989;
     Object term991;
     Object term13767;

    public ArrayUtils_indexOf_94343445260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term981 = (float[]) newFloatArray(7);
        setFloatElement(term981, 0, 0.7031006F);
        setFloatElement(term981, 1, 0.9431611F);
        setFloatElement(term981, 2, 0.95272815F);
        setFloatElement(term981, 3, 0.7254646F);
        setFloatElement(term981, 4, 0.9828442F);
        setFloatElement(term981, 5, 0.9472605F);
        setFloatElement(term981, 6, 0.27797186F);
        term989 = new Float(0.7467328F);
        term991 = new Integer(-478195677);
        term13767 = (float[]) newFloatArray(7);
        setFloatElement(term13767, 0, 0.7031006F);
        setFloatElement(term13767, 1, 0.9431611F);
        setFloatElement(term13767, 2, 0.95272815F);
        setFloatElement(term13767, 3, 0.7254646F);
        setFloatElement(term13767, 4, 0.9828442F);
        setFloatElement(term13767, 5, 0.9472605F);
        setFloatElement(term13767, 6, 0.27797186F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = float.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term981;
        args[1] = term989;
        args[2] = term991;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term981, term13767));
        assertTrue(recursiveEquals(term989, 0.7467328F));
        assertTrue(recursiveEquals(term991, -478195677));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


