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

public class Fraction_reduce_3355035252551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760806;
     Object term761108;
     Object term761102;

    public Fraction_reduce_3355035252551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760806 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term760806, term760806.getClass(), "numerator", 33571330);
        setIntField(term760806, term760806.getClass(), "denominator", 1895762105);
        term761108 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term761108, term761108.getClass(), "numerator", 33571330);
        setIntField(term761108, term761108.getClass(), "denominator", 1895762105);
        setField(term761108, term761108.getClass(), "toString", null);
        setField(term761108, term761108.getClass(), "toProperString", null);
        term761102 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term761102, term761102.getClass(), "numerator", 6714266);
        setIntField(term761102, term761102.getClass(), "denominator", 379152421);
        setField(term761102, term761102.getClass(), "toString", null);
        setField(term761102, term761102.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term760806, args);
        assertTrue(recursiveEquals(term760806, term761108));
        assertTrue(recursiveEquals(retValue, term761102));
    }

};


