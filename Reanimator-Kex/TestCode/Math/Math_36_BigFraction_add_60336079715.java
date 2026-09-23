package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigFraction_add_60336079715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term248;

    public BigFraction_add_60336079715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term226 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term228 = (int[]) newIntArray(4);
        Object term237 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term239 = (int[]) newIntArray(4);
        setIntField(term226, term226.getClass(), "signum", 1);
        setIntElement(term228, 0, -1226014174);
        setIntElement(term228, 1, -2050417409);
        setIntElement(term228, 2, -381532063);
        setIntElement(term228, 3, 1690768155);
        setField(term226, term226.getClass(), "mag", term228);
        setIntField(term226, term226.getClass(), "bitCountPlusOne", 0);
        setIntField(term226, term226.getClass(), "bitLengthPlusOne", 0);
        setIntField(term226, term226.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term226, term226.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term225, term225.getClass(), "numerator", term226);
        setIntField(term237, term237.getClass(), "signum", 1);
        setIntElement(term239, 0, 1790215573);
        setIntElement(term239, 1, -955413894);
        setIntElement(term239, 2, -1724021567);
        setIntElement(term239, 3, 1660449041);
        setField(term237, term237.getClass(), "mag", term239);
        setIntField(term237, term237.getClass(), "bitCountPlusOne", 0);
        setIntField(term237, term237.getClass(), "bitLengthPlusOne", 0);
        setIntField(term237, term237.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term237, term237.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term225, term225.getClass(), "denominator", term237);
        term248 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term249 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term251 = (int[]) newIntArray(4);
        Object term260 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term262 = (int[]) newIntArray(4);
        setIntField(term249, term249.getClass(), "signum", 1);
        setIntElement(term251, 0, 1338396187);
        setIntElement(term251, 1, 1024067317);
        setIntElement(term251, 2, -1542624227);
        setIntElement(term251, 3, -690934961);
        setField(term249, term249.getClass(), "mag", term251);
        setIntField(term249, term249.getClass(), "bitCountPlusOne", 0);
        setIntField(term249, term249.getClass(), "bitLengthPlusOne", 0);
        setIntField(term249, term249.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term249, term249.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term248, term248.getClass(), "numerator", term249);
        setIntField(term260, term260.getClass(), "signum", 1);
        setIntElement(term262, 0, 1947935327);
        setIntElement(term262, 1, -1349728251);
        setIntElement(term262, 2, 1726888622);
        setIntElement(term262, 3, -1978853245);
        setField(term260, term260.getClass(), "mag", term262);
        setIntField(term260, term260.getClass(), "bitCountPlusOne", 0);
        setIntField(term260, term260.getClass(), "bitLengthPlusOne", 0);
        setIntField(term260, term260.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term260, term260.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term248, term248.getClass(), "denominator", term260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term248;
        callMethod(klass, "add", argTypes, term225, args);
    }

};


