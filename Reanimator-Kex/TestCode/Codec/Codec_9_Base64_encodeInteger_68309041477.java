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

public class Base64_encodeInteger_68309041477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2322;
     Object term12464;
     Object term12439;

    public Base64_encodeInteger_68309041477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2322 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2324 = (int[]) newIntArray(4);
        setIntField(term2322, term2322.getClass(), "signum", 1);
        setIntElement(term2324, 0, 791012385);
        setIntElement(term2324, 1, 819285061);
        setIntElement(term2324, 2, 1509521496);
        setIntElement(term2324, 3, 1264343831);
        setField(term2322, term2322.getClass(), "mag", term2324);
        setIntField(term2322, term2322.getClass(), "bitCountPlusOne", 0);
        setIntField(term2322, term2322.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2322, term2322.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2322, term2322.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term12464 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12465 = (int[]) newIntArray(4);
        setIntField(term12464, term12464.getClass(), "signum", 1);
        setIntElement(term12465, 0, 791012385);
        setIntElement(term12465, 1, 819285061);
        setIntElement(term12465, 2, 1509521496);
        setIntElement(term12465, 3, 1264343831);
        setField(term12464, term12464.getClass(), "mag", term12465);
        setIntField(term12464, term12464.getClass(), "bitCountPlusOne", 0);
        setIntField(term12464, term12464.getClass(), "bitLengthPlusOne", 127);
        setIntField(term12464, term12464.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12464, term12464.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term12439 = (byte[]) newByteArray(24);
        setByteElement(term12439, 0, (byte) 76);
        setByteElement(term12439, 1, (byte) 121);
        setByteElement(term12439, 2, (byte) 88);
        setByteElement(term12439, 3, (byte) 107);
        setByteElement(term12439, 4, (byte) 73);
        setByteElement(term12439, 5, (byte) 84);
        setByteElement(term12439, 6, (byte) 68);
        setByteElement(term12439, 7, (byte) 86);
        setByteElement(term12439, 8, (byte) 84);
        setByteElement(term12439, 9, (byte) 69);
        setByteElement(term12439, 10, (byte) 86);
        setByteElement(term12439, 11, (byte) 90);
        setByteElement(term12439, 12, (byte) 43);
        setByteElement(term12439, 13, (byte) 88);
        setByteElement(term12439, 14, (byte) 104);
        setByteElement(term12439, 15, (byte) 89);
        setByteElement(term12439, 16, (byte) 83);
        setByteElement(term12439, 17, (byte) 49);
        setByteElement(term12439, 18, (byte) 120);
        setByteElement(term12439, 19, (byte) 98);
        setByteElement(term12439, 20, (byte) 70);
        setByteElement(term12439, 21, (byte) 119);
        setByteElement(term12439, 22, (byte) 61);
        setByteElement(term12439, 23, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term2322;
        Object retValue = callMethod(klass, "encodeInteger", argTypes, null, args);
        assertTrue(recursiveEquals(term2322, term12464));
        assertTrue(recursiveEquals(retValue, term12439));
    }

};


