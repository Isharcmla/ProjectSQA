package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_53585913148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419;
     Object term3219;
     Object term3192;

    public Fraction_reduce_53585913148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term419, term419.getClass(), "numerator", -226514366);
        setIntField(term419, term419.getClass(), "denominator", 1193880199);
        setField(term419, term419.getClass(), "toString", "tbcdzjIfER");
        setField(term419, term419.getClass(), "toProperString", "HyxfbSQYBe");
        term3219 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term3219, term3219.getClass(), "numerator", -226514366);
        setIntField(term3219, term3219.getClass(), "denominator", 1193880199);
        setField(term3219, term3219.getClass(), "toString", "tbcdzjIfER");
        setField(term3219, term3219.getClass(), "toProperString", "HyxfbSQYBe");
        term3192 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term3192, term3192.getClass(), "numerator", -226514366);
        setIntField(term3192, term3192.getClass(), "denominator", 1193880199);
        setField(term3192, term3192.getClass(), "toString", "tbcdzjIfER");
        setField(term3192, term3192.getClass(), "toProperString", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term419, args);
        assertTrue(recursiveEquals(term419, term3219));
        assertTrue(recursiveEquals(retValue, term3192));
    }

};


