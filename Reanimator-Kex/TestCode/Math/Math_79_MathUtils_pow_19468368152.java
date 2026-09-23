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

public class MathUtils_pow_19468368152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;
     Object term240;

    public MathUtils_pow_19468368152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term231 = (int[]) newIntArray(4);
        setIntField(term229, term229.getClass(), "signum", 1);
        setIntElement(term231, 0, 791012385);
        setIntElement(term231, 1, 819285061);
        setIntElement(term231, 2, 1509521496);
        setIntElement(term231, 3, 1264343831);
        setField(term229, term229.getClass(), "mag", term231);
        setIntField(term229, term229.getClass(), "bitCountPlusOne", 0);
        setIntField(term229, term229.getClass(), "bitLengthPlusOne", 0);
        setIntField(term229, term229.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term229, term229.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term240 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigInteger");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term229;
        args[1] = term240;
        callMethod(klass, "pow", argTypes, null, args);
    }

};


