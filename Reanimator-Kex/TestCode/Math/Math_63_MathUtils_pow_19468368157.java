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
import java.lang.Integer;

public class MathUtils_pow_19468368157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;
     Object term254;

    public MathUtils_pow_19468368157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term245 = (int[]) newIntArray(4);
        setIntField(term243, term243.getClass(), "signum", 1);
        setIntElement(term245, 0, 791012385);
        setIntElement(term245, 1, 819285061);
        setIntElement(term245, 2, 1509521496);
        setIntElement(term245, 3, 1264343831);
        setField(term243, term243.getClass(), "mag", term245);
        setIntField(term243, term243.getClass(), "bitCountPlusOne", 0);
        setIntField(term243, term243.getClass(), "bitLengthPlusOne", 0);
        setIntField(term243, term243.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term243, term243.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term254 = new Integer(-469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigInteger");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term243;
        args[1] = term254;
        callMethod(klass, "pow", argTypes, null, args);
    }

};


