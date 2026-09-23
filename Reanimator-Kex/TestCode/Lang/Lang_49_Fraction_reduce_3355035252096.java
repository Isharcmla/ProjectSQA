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

public class Fraction_reduce_3355035252096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617143;
     Object term617615;
     Object term617612;

    public Fraction_reduce_3355035252096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617143 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term617143, term617143.getClass(), "numerator", 1097732386);
        setIntField(term617143, term617143.getClass(), "denominator", 549473833);
        term617615 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term617615, term617615.getClass(), "numerator", 1097732386);
        setIntField(term617615, term617615.getClass(), "denominator", 549473833);
        setField(term617615, term617615.getClass(), "toString", null);
        setField(term617615, term617615.getClass(), "toProperString", null);
        term617612 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term617612, term617612.getClass(), "numerator", 1097732386);
        setIntField(term617612, term617612.getClass(), "denominator", 549473833);
        setField(term617612, term617612.getClass(), "toString", null);
        setField(term617612, term617612.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term617143, args);
        assertTrue(recursiveEquals(term617143, term617615));
        assertTrue(recursiveEquals(retValue, term617612));
    }

};


