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

public class Fraction_reduce_535859131507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154751;
     Object term155364;
     Object term155358;

    public Fraction_reduce_535859131507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154751 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term154751, term154751.getClass(), "numerator", 1098336386);
        setIntField(term154751, term154751.getClass(), "denominator", 1746141481);
        term155364 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term155364, term155364.getClass(), "numerator", 1098336386);
        setIntField(term155364, term155364.getClass(), "denominator", 1746141481);
        setField(term155364, term155364.getClass(), "toString", null);
        setField(term155364, term155364.getClass(), "toProperString", null);
        term155358 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term155358, term155358.getClass(), "numerator", 156905198);
        setIntField(term155358, term155358.getClass(), "denominator", 249448783);
        setField(term155358, term155358.getClass(), "toString", null);
        setField(term155358, term155358.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term154751, args);
        assertTrue(recursiveEquals(term154751, term155364));
        assertTrue(recursiveEquals(retValue, term155358));
    }

};


