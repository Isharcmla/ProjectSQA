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

public class Fraction_reduce_535859131666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209719;
     Object term210694;
     Object term210691;

    public Fraction_reduce_535859131666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209719 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term209719, term209719.getClass(), "numerator", -1044891866);
        setIntField(term209719, term209719.getClass(), "denominator", 1854015013);
        term210694 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term210694, term210694.getClass(), "numerator", -1044891866);
        setIntField(term210694, term210694.getClass(), "denominator", 1854015013);
        setField(term210694, term210694.getClass(), "toString", null);
        setField(term210694, term210694.getClass(), "toProperString", null);
        term210691 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term210691, term210691.getClass(), "numerator", -1044891866);
        setIntField(term210691, term210691.getClass(), "denominator", 1854015013);
        setField(term210691, term210691.getClass(), "toString", null);
        setField(term210691, term210691.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term209719, args);
        assertTrue(recursiveEquals(term209719, term210694));
        assertTrue(recursiveEquals(retValue, term210691));
    }

};


