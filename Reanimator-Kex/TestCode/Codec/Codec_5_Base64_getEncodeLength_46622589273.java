package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;
import java.lang.Integer;

public class Base64_getEncodeLength_46622589273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2424;
     Object term2430;
     Object term2432;
     Object term12080;
     Object term12081;

    public Base64_getEncodeLength_46622589273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2424 = (byte[]) newByteArray(5);
        setByteElement(term2424, 0, (byte) -41);
        setByteElement(term2424, 1, (byte) -88);
        setByteElement(term2424, 2, (byte) 39);
        setByteElement(term2424, 3, (byte) -1);
        setByteElement(term2424, 4, (byte) 117);
        term2430 = new Integer(-1034506028);
        term2432 = (byte[]) newByteArray(5);
        setByteElement(term2432, 0, (byte) 43);
        setByteElement(term2432, 1, (byte) -27);
        setByteElement(term2432, 2, (byte) 34);
        setByteElement(term2432, 3, (byte) -126);
        setByteElement(term2432, 4, (byte) 12);
        term12080 = (byte[]) newByteArray(5);
        setByteElement(term12080, 0, (byte) -41);
        setByteElement(term12080, 1, (byte) -88);
        setByteElement(term12080, 2, (byte) 39);
        setByteElement(term12080, 3, (byte) -1);
        setByteElement(term12080, 4, (byte) 117);
        term12081 = (byte[]) newByteArray(5);
        setByteElement(term12081, 0, (byte) 43);
        setByteElement(term12081, 1, (byte) -27);
        setByteElement(term12081, 2, (byte) 34);
        setByteElement(term12081, 3, (byte) -126);
        setByteElement(term12081, 4, (byte) 12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2424;
        args[1] = term2430;
        args[2] = term2432;
        Object retValue = callMethod(klass, "getEncodeLength", argTypes, null, args);
        assertTrue(recursiveEquals(term2424, term12080));
        assertTrue(recursiveEquals(term2430, -1034506028));
        assertTrue(recursiveEquals(term2432, term12081));
        assertTrue(recursiveEquals(retValue, 8L));
    }

};


