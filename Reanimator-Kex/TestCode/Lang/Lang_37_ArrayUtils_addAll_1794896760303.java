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

public class ArrayUtils_addAll_1794896760303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1450;
     Object term1457;
     Object term15040;
     Object term15041;
     Object term15025;

    public ArrayUtils_addAll_1794896760303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1450 = (byte[]) newByteArray(6);
        setByteElement(term1450, 0, (byte) -123);
        setByteElement(term1450, 1, (byte) -23);
        setByteElement(term1450, 2, (byte) 100);
        setByteElement(term1450, 3, (byte) 106);
        setByteElement(term1450, 4, (byte) -57);
        setByteElement(term1450, 5, (byte) -103);
        term1457 = (byte[]) newByteArray(0);
        term15040 = (byte[]) newByteArray(6);
        setByteElement(term15040, 0, (byte) -123);
        setByteElement(term15040, 1, (byte) -23);
        setByteElement(term15040, 2, (byte) 100);
        setByteElement(term15040, 3, (byte) 106);
        setByteElement(term15040, 4, (byte) -57);
        setByteElement(term15040, 5, (byte) -103);
        term15041 = (byte[]) newByteArray(0);
        term15025 = (byte[]) newByteArray(6);
        setByteElement(term15025, 0, (byte) -123);
        setByteElement(term15025, 1, (byte) -23);
        setByteElement(term15025, 2, (byte) 100);
        setByteElement(term15025, 3, (byte) 106);
        setByteElement(term15025, 4, (byte) -57);
        setByteElement(term15025, 5, (byte) -103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1450;
        args[1] = term1457;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1450, term15040));
        assertTrue(recursiveEquals(term1457, term15041));
        assertTrue(recursiveEquals(retValue, term15025));
    }

};


