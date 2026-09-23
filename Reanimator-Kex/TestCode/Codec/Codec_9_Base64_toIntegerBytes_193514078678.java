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

public class Base64_toIntegerBytes_193514078678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2337;
     Object term12528;
     Object term12500;

    public Base64_toIntegerBytes_193514078678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2337 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2339 = (int[]) newIntArray(4);
        setIntField(term2337, term2337.getClass(), "signum", 1);
        setIntElement(term2339, 0, 313747341);
        setIntElement(term2339, 1, -964936229);
        setIntElement(term2339, 2, -478647413);
        setIntElement(term2339, 3, -898923898);
        setField(term2337, term2337.getClass(), "mag", term2339);
        setIntField(term2337, term2337.getClass(), "bitCountPlusOne", 0);
        setIntField(term2337, term2337.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2337, term2337.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2337, term2337.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term12528 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12529 = (int[]) newIntArray(4);
        setIntField(term12528, term12528.getClass(), "signum", 1);
        setIntElement(term12529, 0, 313747341);
        setIntElement(term12529, 1, -964936229);
        setIntElement(term12529, 2, -478647413);
        setIntElement(term12529, 3, -898923898);
        setField(term12528, term12528.getClass(), "mag", term12529);
        setIntField(term12528, term12528.getClass(), "bitCountPlusOne", 0);
        setIntField(term12528, term12528.getClass(), "bitLengthPlusOne", 126);
        setIntField(term12528, term12528.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12528, term12528.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term12500 = (byte[]) newByteArray(16);
        setByteElement(term12500, 0, (byte) 18);
        setByteElement(term12500, 1, (byte) -77);
        setByteElement(term12500, 2, (byte) 103);
        setByteElement(term12500, 3, (byte) -115);
        setByteElement(term12500, 4, (byte) -58);
        setByteElement(term12500, 5, (byte) 124);
        setByteElement(term12500, 6, (byte) 61);
        setByteElement(term12500, 7, (byte) -37);
        setByteElement(term12500, 8, (byte) -29);
        setByteElement(term12500, 9, (byte) 120);
        setByteElement(term12500, 10, (byte) 107);
        setByteElement(term12500, 11, (byte) -117);
        setByteElement(term12500, 12, (byte) -54);
        setByteElement(term12500, 13, (byte) 107);
        setByteElement(term12500, 14, (byte) -126);
        setByteElement(term12500, 15, (byte) -122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term2337;
        Object retValue = callMethod(klass, "toIntegerBytes", argTypes, null, args);
        assertTrue(recursiveEquals(term2337, term12528));
        assertTrue(recursiveEquals(retValue, term12500));
    }

};


