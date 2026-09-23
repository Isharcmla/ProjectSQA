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

public class ArrayUtils_addAll_1794896760305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1458;
     Object term1465;
     Object term15079;
     Object term15080;
     Object term15064;

    public ArrayUtils_addAll_1794896760305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1458 = (byte[]) newByteArray(6);
        setByteElement(term1458, 0, (byte) -123);
        setByteElement(term1458, 1, (byte) -23);
        setByteElement(term1458, 2, (byte) 100);
        setByteElement(term1458, 3, (byte) 106);
        setByteElement(term1458, 4, (byte) -57);
        setByteElement(term1458, 5, (byte) -103);
        term1465 = (byte[]) newByteArray(0);
        term15079 = (byte[]) newByteArray(6);
        setByteElement(term15079, 0, (byte) -123);
        setByteElement(term15079, 1, (byte) -23);
        setByteElement(term15079, 2, (byte) 100);
        setByteElement(term15079, 3, (byte) 106);
        setByteElement(term15079, 4, (byte) -57);
        setByteElement(term15079, 5, (byte) -103);
        term15080 = (byte[]) newByteArray(0);
        term15064 = (byte[]) newByteArray(6);
        setByteElement(term15064, 0, (byte) -123);
        setByteElement(term15064, 1, (byte) -23);
        setByteElement(term15064, 2, (byte) 100);
        setByteElement(term15064, 3, (byte) 106);
        setByteElement(term15064, 4, (byte) -57);
        setByteElement(term15064, 5, (byte) -103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1458;
        args[1] = term1465;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1458, term15079));
        assertTrue(recursiveEquals(term1465, term15080));
        assertTrue(recursiveEquals(retValue, term15064));
    }

};


