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

public class Fraction_reduce_535859131632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197537;
     Object term198137;
     Object term198134;

    public Fraction_reduce_535859131632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197537 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term197537, term197537.getClass(), "numerator", -1038539742);
        setIntField(term197537, term197537.getClass(), "denominator", 942922231);
        term198137 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term198137, term198137.getClass(), "numerator", -1038539742);
        setIntField(term198137, term198137.getClass(), "denominator", 942922231);
        setField(term198137, term198137.getClass(), "toString", null);
        setField(term198137, term198137.getClass(), "toProperString", null);
        term198134 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term198134, term198134.getClass(), "numerator", -1038539742);
        setIntField(term198134, term198134.getClass(), "denominator", 942922231);
        setField(term198134, term198134.getClass(), "toString", null);
        setField(term198134, term198134.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term197537, args);
        assertTrue(recursiveEquals(term197537, term198137));
        assertTrue(recursiveEquals(retValue, term198134));
    }

};


