package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class MathUtils_pow_19468467358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;
     Object term271;

    public MathUtils_pow_19468467358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term262 = (int[]) newIntArray(4);
        setIntField(term260, term260.getClass(), "signum", 1);
        setIntElement(term262, 0, 313747341);
        setIntElement(term262, 1, -964936229);
        setIntElement(term262, 2, -478647413);
        setIntElement(term262, 3, -898923898);
        setField(term260, term260.getClass(), "mag", term262);
        setIntField(term260, term260.getClass(), "bitCountPlusOne", 0);
        setIntField(term260, term260.getClass(), "bitLengthPlusOne", 0);
        setIntField(term260, term260.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term260, term260.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term271 = new Long(-6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigInteger");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term260;
        args[1] = term271;
        callMethod(klass, "pow", argTypes, null, args);
    }

};


