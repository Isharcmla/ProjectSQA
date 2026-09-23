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

public class Base64_toIntegerBytes_193514078676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2466;
     Object term12682;
     Object term12654;

    public Base64_toIntegerBytes_193514078676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2466 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2468 = (int[]) newIntArray(4);
        setIntField(term2466, term2466.getClass(), "signum", 1);
        setIntElement(term2468, 0, 313747341);
        setIntElement(term2468, 1, -964936229);
        setIntElement(term2468, 2, -478647413);
        setIntElement(term2468, 3, -898923898);
        setField(term2466, term2466.getClass(), "mag", term2468);
        setIntField(term2466, term2466.getClass(), "bitCountPlusOne", 0);
        setIntField(term2466, term2466.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2466, term2466.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2466, term2466.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term12682 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12683 = (int[]) newIntArray(4);
        setIntField(term12682, term12682.getClass(), "signum", 1);
        setIntElement(term12683, 0, 313747341);
        setIntElement(term12683, 1, -964936229);
        setIntElement(term12683, 2, -478647413);
        setIntElement(term12683, 3, -898923898);
        setField(term12682, term12682.getClass(), "mag", term12683);
        setIntField(term12682, term12682.getClass(), "bitCountPlusOne", 0);
        setIntField(term12682, term12682.getClass(), "bitLengthPlusOne", 126);
        setIntField(term12682, term12682.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12682, term12682.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term12654 = (byte[]) newByteArray(16);
        setByteElement(term12654, 0, (byte) 18);
        setByteElement(term12654, 1, (byte) -77);
        setByteElement(term12654, 2, (byte) 103);
        setByteElement(term12654, 3, (byte) -115);
        setByteElement(term12654, 4, (byte) -58);
        setByteElement(term12654, 5, (byte) 124);
        setByteElement(term12654, 6, (byte) 61);
        setByteElement(term12654, 7, (byte) -37);
        setByteElement(term12654, 8, (byte) -29);
        setByteElement(term12654, 9, (byte) 120);
        setByteElement(term12654, 10, (byte) 107);
        setByteElement(term12654, 11, (byte) -117);
        setByteElement(term12654, 12, (byte) -54);
        setByteElement(term12654, 13, (byte) 107);
        setByteElement(term12654, 14, (byte) -126);
        setByteElement(term12654, 15, (byte) -122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term2466;
        Object retValue = callMethod(klass, "toIntegerBytes", argTypes, null, args);
        assertTrue(recursiveEquals(term2466, term12682));
        assertTrue(recursiveEquals(retValue, term12654));
    }

};


