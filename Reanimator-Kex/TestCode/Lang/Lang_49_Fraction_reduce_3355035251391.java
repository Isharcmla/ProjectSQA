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

public class Fraction_reduce_3355035251391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406944;
     Object term407739;
     Object term407736;

    public Fraction_reduce_3355035251391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406944 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term406944, term406944.getClass(), "numerator", 152832346);
        setIntField(term406944, term406944.getClass(), "denominator", 478281413);
        term407739 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term407739, term407739.getClass(), "numerator", 152832346);
        setIntField(term407739, term407739.getClass(), "denominator", 478281413);
        setField(term407739, term407739.getClass(), "toString", null);
        setField(term407739, term407739.getClass(), "toProperString", null);
        term407736 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term407736, term407736.getClass(), "numerator", 152832346);
        setIntField(term407736, term407736.getClass(), "denominator", 478281413);
        setField(term407736, term407736.getClass(), "toString", null);
        setField(term407736, term407736.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term406944, args);
        assertTrue(recursiveEquals(term406944, term407739));
        assertTrue(recursiveEquals(retValue, term407736));
    }

};


