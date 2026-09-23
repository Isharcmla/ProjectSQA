package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Boolean;

public class ArchiveUtils_isEqual_142889665421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term113;
     Object term115;
     Object term117;
     Object term124;
     Object term126;
     Object term128;
     Object term1288;
     Object term1289;

    public ArchiveUtils_isEqual_142889665421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = (byte[]) newByteArray(1);
        setByteElement(term111, 0, (byte) -54);
        term113 = new Integer(-1922583790);
        term115 = new Integer(-616727354);
        term117 = (byte[]) newByteArray(6);
        setByteElement(term117, 0, (byte) 67);
        setByteElement(term117, 1, (byte) 78);
        setByteElement(term117, 2, (byte) 87);
        setByteElement(term117, 3, (byte) 121);
        setByteElement(term117, 4, (byte) -99);
        setByteElement(term117, 5, (byte) -2);
        term124 = new Integer(-1955890973);
        term126 = new Integer(-2038273078);
        term128 = new Boolean(false);
        term1288 = (byte[]) newByteArray(1);
        setByteElement(term1288, 0, (byte) -54);
        term1289 = (byte[]) newByteArray(6);
        setByteElement(term1289, 0, (byte) 67);
        setByteElement(term1289, 1, (byte) 78);
        setByteElement(term1289, 2, (byte) 87);
        setByteElement(term1289, 3, (byte) 121);
        setByteElement(term1289, 4, (byte) -99);
        setByteElement(term1289, 5, (byte) -2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ArchiveUtils");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term111;
        args[1] = term113;
        args[2] = term115;
        args[3] = term117;
        args[4] = term124;
        args[5] = term126;
        args[6] = term128;
        Object retValue = callMethod(klass, "isEqual", argTypes, null, args);
        assertTrue(recursiveEquals(term111, term1288));
        assertTrue(recursiveEquals(term113, -1922583790));
        assertTrue(recursiveEquals(term115, -616727354));
        assertTrue(recursiveEquals(term117, term1289));
        assertTrue(recursiveEquals(term124, -1955890973));
        assertTrue(recursiveEquals(term126, -2038273078));
        assertTrue(recursiveEquals(term128, false));
        assertTrue(recursiveEquals(retValue, false));
    }

};


