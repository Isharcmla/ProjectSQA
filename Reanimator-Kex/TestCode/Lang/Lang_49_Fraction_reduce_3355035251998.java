package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_3355035251998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587446;
     Object term587841;
     Object term587838;

    public Fraction_reduce_3355035251998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term587446 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term587446, term587446.getClass(), "numerator", -1476395070);
        setIntField(term587446, term587446.getClass(), "denominator", 1073741863);
        term587841 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term587841, term587841.getClass(), "numerator", -1476395070);
        setIntField(term587841, term587841.getClass(), "denominator", 1073741863);
        setField(term587841, term587841.getClass(), "toString", null);
        setField(term587841, term587841.getClass(), "toProperString", null);
        term587838 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term587838, term587838.getClass(), "numerator", -1476395070);
        setIntField(term587838, term587838.getClass(), "denominator", 1073741863);
        setField(term587838, term587838.getClass(), "toString", null);
        setField(term587838, term587838.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term587446, args);
        assertTrue(recursiveEquals(term587446, term587841));
        assertTrue(recursiveEquals(retValue, term587838));
    }

};


