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

public class Fraction_multiplyBy_457422138125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26792;
     Object term26801;
     Object term26802;
     Object term26795;

    public Fraction_multiplyBy_457422138125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26792 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term26792, term26792.getClass(), "numerator", 0);
        term26801 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term26801, term26801.getClass(), "numerator", 0);
        setIntField(term26801, term26801.getClass(), "denominator", 0);
        setField(term26801, term26801.getClass(), "toString", null);
        setField(term26801, term26801.getClass(), "toProperString", null);
        term26802 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term26802, term26802.getClass(), "numerator", 0);
        setIntField(term26802, term26802.getClass(), "denominator", 0);
        setField(term26802, term26802.getClass(), "toString", null);
        setField(term26802, term26802.getClass(), "toProperString", null);
        term26795 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term26795, term26795.getClass(), "numerator", 0);
        setIntField(term26795, term26795.getClass(), "denominator", 1);
        setField(term26795, term26795.getClass(), "toString", null);
        setField(term26795, term26795.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term26792;
        Object retValue = callMethod(klass, "multiplyBy", argTypes, term26792, args);
        assertTrue(recursiveEquals(term26792, term26801));
        assertTrue(recursiveEquals(term26792, term26802));
        assertTrue(recursiveEquals(retValue, term26795));
    }

};


