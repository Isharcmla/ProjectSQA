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

public class Base64_encodeInteger_68309041475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2451;
     Object term12802;
     Object term12777;

    public Base64_encodeInteger_68309041475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2451 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2453 = (int[]) newIntArray(4);
        setIntField(term2451, term2451.getClass(), "signum", 1);
        setIntElement(term2453, 0, 791012385);
        setIntElement(term2453, 1, 819285061);
        setIntElement(term2453, 2, 1509521496);
        setIntElement(term2453, 3, 1264343831);
        setField(term2451, term2451.getClass(), "mag", term2453);
        setIntField(term2451, term2451.getClass(), "bitCountPlusOne", 0);
        setIntField(term2451, term2451.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2451, term2451.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2451, term2451.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term12802 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12803 = (int[]) newIntArray(4);
        setIntField(term12802, term12802.getClass(), "signum", 1);
        setIntElement(term12803, 0, 791012385);
        setIntElement(term12803, 1, 819285061);
        setIntElement(term12803, 2, 1509521496);
        setIntElement(term12803, 3, 1264343831);
        setField(term12802, term12802.getClass(), "mag", term12803);
        setIntField(term12802, term12802.getClass(), "bitCountPlusOne", 0);
        setIntField(term12802, term12802.getClass(), "bitLengthPlusOne", 127);
        setIntField(term12802, term12802.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12802, term12802.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term12777 = (byte[]) newByteArray(24);
        setByteElement(term12777, 0, (byte) 76);
        setByteElement(term12777, 1, (byte) 121);
        setByteElement(term12777, 2, (byte) 88);
        setByteElement(term12777, 3, (byte) 107);
        setByteElement(term12777, 4, (byte) 73);
        setByteElement(term12777, 5, (byte) 84);
        setByteElement(term12777, 6, (byte) 68);
        setByteElement(term12777, 7, (byte) 86);
        setByteElement(term12777, 8, (byte) 84);
        setByteElement(term12777, 9, (byte) 69);
        setByteElement(term12777, 10, (byte) 86);
        setByteElement(term12777, 11, (byte) 90);
        setByteElement(term12777, 12, (byte) 43);
        setByteElement(term12777, 13, (byte) 88);
        setByteElement(term12777, 14, (byte) 104);
        setByteElement(term12777, 15, (byte) 89);
        setByteElement(term12777, 16, (byte) 83);
        setByteElement(term12777, 17, (byte) 49);
        setByteElement(term12777, 18, (byte) 120);
        setByteElement(term12777, 19, (byte) 98);
        setByteElement(term12777, 20, (byte) 70);
        setByteElement(term12777, 21, (byte) 119);
        setByteElement(term12777, 22, (byte) 61);
        setByteElement(term12777, 23, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term2451;
        Object retValue = callMethod(klass, "encodeInteger", argTypes, null, args);
        assertTrue(recursiveEquals(term2451, term12802));
        assertTrue(recursiveEquals(retValue, term12777));
    }

};


