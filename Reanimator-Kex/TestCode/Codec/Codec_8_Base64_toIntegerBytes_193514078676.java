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
     Object term12580;
     Object term12552;

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
        term12580 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12581 = (int[]) newIntArray(4);
        setIntField(term12580, term12580.getClass(), "signum", 1);
        setIntElement(term12581, 0, 313747341);
        setIntElement(term12581, 1, -964936229);
        setIntElement(term12581, 2, -478647413);
        setIntElement(term12581, 3, -898923898);
        setField(term12580, term12580.getClass(), "mag", term12581);
        setIntField(term12580, term12580.getClass(), "bitCountPlusOne", 0);
        setIntField(term12580, term12580.getClass(), "bitLengthPlusOne", 126);
        setIntField(term12580, term12580.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12580, term12580.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term12552 = (byte[]) newByteArray(16);
        setByteElement(term12552, 0, (byte) 18);
        setByteElement(term12552, 1, (byte) -77);
        setByteElement(term12552, 2, (byte) 103);
        setByteElement(term12552, 3, (byte) -115);
        setByteElement(term12552, 4, (byte) -58);
        setByteElement(term12552, 5, (byte) 124);
        setByteElement(term12552, 6, (byte) 61);
        setByteElement(term12552, 7, (byte) -37);
        setByteElement(term12552, 8, (byte) -29);
        setByteElement(term12552, 9, (byte) 120);
        setByteElement(term12552, 10, (byte) 107);
        setByteElement(term12552, 11, (byte) -117);
        setByteElement(term12552, 12, (byte) -54);
        setByteElement(term12552, 13, (byte) 107);
        setByteElement(term12552, 14, (byte) -126);
        setByteElement(term12552, 15, (byte) -122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term2466;
        Object retValue = callMethod(klass, "toIntegerBytes", argTypes, null, args);
        assertTrue(recursiveEquals(term2466, term12580));
        assertTrue(recursiveEquals(retValue, term12552));
    }

};


