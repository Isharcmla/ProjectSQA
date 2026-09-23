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

public class Fraction_reduce_3355035251289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377171;
     Object term377545;
     Object term377542;

    public Fraction_reduce_3355035251289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377171 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term377171, term377171.getClass(), "numerator", -451768494);
        setIntField(term377171, term377171.getClass(), "denominator", 1728119743);
        term377545 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term377545, term377545.getClass(), "numerator", -451768494);
        setIntField(term377545, term377545.getClass(), "denominator", 1728119743);
        setField(term377545, term377545.getClass(), "toString", null);
        setField(term377545, term377545.getClass(), "toProperString", null);
        term377542 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term377542, term377542.getClass(), "numerator", -451768494);
        setIntField(term377542, term377542.getClass(), "denominator", 1728119743);
        setField(term377542, term377542.getClass(), "toString", null);
        setField(term377542, term377542.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term377171, args);
        assertTrue(recursiveEquals(term377171, term377545));
        assertTrue(recursiveEquals(retValue, term377542));
    }

};


