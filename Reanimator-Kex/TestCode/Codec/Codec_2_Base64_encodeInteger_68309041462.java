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

public class Base64_encodeInteger_68309041462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2050;
     Object term9963;
     Object term9938;

    public Base64_encodeInteger_68309041462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2050 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2052 = (int[]) newIntArray(4);
        setIntField(term2050, term2050.getClass(), "signum", 1);
        setIntElement(term2052, 0, 791012385);
        setIntElement(term2052, 1, 819285061);
        setIntElement(term2052, 2, 1509521496);
        setIntElement(term2052, 3, 1264343831);
        setField(term2050, term2050.getClass(), "mag", term2052);
        setIntField(term2050, term2050.getClass(), "bitCountPlusOne", 0);
        setIntField(term2050, term2050.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2050, term2050.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2050, term2050.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term9963 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9964 = (int[]) newIntArray(4);
        setIntField(term9963, term9963.getClass(), "signum", 1);
        setIntElement(term9964, 0, 791012385);
        setIntElement(term9964, 1, 819285061);
        setIntElement(term9964, 2, 1509521496);
        setIntElement(term9964, 3, 1264343831);
        setField(term9963, term9963.getClass(), "mag", term9964);
        setIntField(term9963, term9963.getClass(), "bitCountPlusOne", 0);
        setIntField(term9963, term9963.getClass(), "bitLengthPlusOne", 127);
        setIntField(term9963, term9963.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9963, term9963.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term9938 = (byte[]) newByteArray(24);
        setByteElement(term9938, 0, (byte) 76);
        setByteElement(term9938, 1, (byte) 121);
        setByteElement(term9938, 2, (byte) 88);
        setByteElement(term9938, 3, (byte) 107);
        setByteElement(term9938, 4, (byte) 73);
        setByteElement(term9938, 5, (byte) 84);
        setByteElement(term9938, 6, (byte) 68);
        setByteElement(term9938, 7, (byte) 86);
        setByteElement(term9938, 8, (byte) 84);
        setByteElement(term9938, 9, (byte) 69);
        setByteElement(term9938, 10, (byte) 86);
        setByteElement(term9938, 11, (byte) 90);
        setByteElement(term9938, 12, (byte) 43);
        setByteElement(term9938, 13, (byte) 88);
        setByteElement(term9938, 14, (byte) 104);
        setByteElement(term9938, 15, (byte) 89);
        setByteElement(term9938, 16, (byte) 83);
        setByteElement(term9938, 17, (byte) 49);
        setByteElement(term9938, 18, (byte) 120);
        setByteElement(term9938, 19, (byte) 98);
        setByteElement(term9938, 20, (byte) 70);
        setByteElement(term9938, 21, (byte) 119);
        setByteElement(term9938, 22, (byte) 61);
        setByteElement(term9938, 23, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term2050;
        Object retValue = callMethod(klass, "encodeInteger", argTypes, null, args);
        assertTrue(recursiveEquals(term2050, term9963));
        assertTrue(recursiveEquals(retValue, term9938));
    }

};


