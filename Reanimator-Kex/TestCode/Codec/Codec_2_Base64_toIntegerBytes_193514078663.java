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

public class Base64_toIntegerBytes_193514078663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2065;
     Object term10027;
     Object term9999;

    public Base64_toIntegerBytes_193514078663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2065 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2067 = (int[]) newIntArray(4);
        setIntField(term2065, term2065.getClass(), "signum", 1);
        setIntElement(term2067, 0, 313747341);
        setIntElement(term2067, 1, -964936229);
        setIntElement(term2067, 2, -478647413);
        setIntElement(term2067, 3, -898923898);
        setField(term2065, term2065.getClass(), "mag", term2067);
        setIntField(term2065, term2065.getClass(), "bitCountPlusOne", 0);
        setIntField(term2065, term2065.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2065, term2065.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2065, term2065.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term10027 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10028 = (int[]) newIntArray(4);
        setIntField(term10027, term10027.getClass(), "signum", 1);
        setIntElement(term10028, 0, 313747341);
        setIntElement(term10028, 1, -964936229);
        setIntElement(term10028, 2, -478647413);
        setIntElement(term10028, 3, -898923898);
        setField(term10027, term10027.getClass(), "mag", term10028);
        setIntField(term10027, term10027.getClass(), "bitCountPlusOne", 0);
        setIntField(term10027, term10027.getClass(), "bitLengthPlusOne", 126);
        setIntField(term10027, term10027.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10027, term10027.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term9999 = (byte[]) newByteArray(16);
        setByteElement(term9999, 0, (byte) 18);
        setByteElement(term9999, 1, (byte) -77);
        setByteElement(term9999, 2, (byte) 103);
        setByteElement(term9999, 3, (byte) -115);
        setByteElement(term9999, 4, (byte) -58);
        setByteElement(term9999, 5, (byte) 124);
        setByteElement(term9999, 6, (byte) 61);
        setByteElement(term9999, 7, (byte) -37);
        setByteElement(term9999, 8, (byte) -29);
        setByteElement(term9999, 9, (byte) 120);
        setByteElement(term9999, 10, (byte) 107);
        setByteElement(term9999, 11, (byte) -117);
        setByteElement(term9999, 12, (byte) -54);
        setByteElement(term9999, 13, (byte) 107);
        setByteElement(term9999, 14, (byte) -126);
        setByteElement(term9999, 15, (byte) -122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term2065;
        Object retValue = callMethod(klass, "toIntegerBytes", argTypes, null, args);
        assertTrue(recursiveEquals(term2065, term10027));
        assertTrue(recursiveEquals(retValue, term9999));
    }

};


