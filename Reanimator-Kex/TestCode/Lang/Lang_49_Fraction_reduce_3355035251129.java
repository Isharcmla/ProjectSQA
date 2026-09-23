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

public class Fraction_reduce_3355035251129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326715;
     Object term327592;
     Object term327589;

    public Fraction_reduce_3355035251129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326715 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term326715, term326715.getClass(), "numerator", -1681934306);
        setIntField(term326715, term326715.getClass(), "denominator", 1210456041);
        term327592 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term327592, term327592.getClass(), "numerator", -1681934306);
        setIntField(term327592, term327592.getClass(), "denominator", 1210456041);
        setField(term327592, term327592.getClass(), "toString", null);
        setField(term327592, term327592.getClass(), "toProperString", null);
        term327589 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term327589, term327589.getClass(), "numerator", -1681934306);
        setIntField(term327589, term327589.getClass(), "denominator", 1210456041);
        setField(term327589, term327589.getClass(), "toString", null);
        setField(term327589, term327589.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term326715, args);
        assertTrue(recursiveEquals(term326715, term327592));
        assertTrue(recursiveEquals(retValue, term327589));
    }

};


