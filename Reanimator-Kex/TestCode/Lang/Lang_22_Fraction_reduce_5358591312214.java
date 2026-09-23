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

public class Fraction_reduce_5358591312214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term720644;
     Object term721609;
     Object term721603;

    public Fraction_reduce_5358591312214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term720644 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term720644, term720644.getClass(), "numerator", -835956342);
        setIntField(term720644, term720644.getClass(), "denominator", 1561463859);
        term721609 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term721609, term721609.getClass(), "numerator", -835956342);
        setIntField(term721609, term721609.getClass(), "denominator", 1561463859);
        setField(term721609, term721609.getClass(), "toString", null);
        setField(term721609, term721609.getClass(), "toProperString", null);
        term721603 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term721603, term721603.getClass(), "numerator", -278652114);
        setIntField(term721603, term721603.getClass(), "denominator", 520487953);
        setField(term721603, term721603.getClass(), "toString", null);
        setField(term721603, term721603.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term720644, args);
        assertTrue(recursiveEquals(term720644, term721609));
        assertTrue(recursiveEquals(retValue, term721603));
    }

};


