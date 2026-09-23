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

public class Fraction_reduce_535859131240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62442;
     Object term63328;
     Object term63325;

    public Fraction_reduce_535859131240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62442 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term62442, term62442.getClass(), "numerator", -548878718);
        setIntField(term62442, term62442.getClass(), "denominator", 1889403447);
        term63328 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term63328, term63328.getClass(), "numerator", -548878718);
        setIntField(term63328, term63328.getClass(), "denominator", 1889403447);
        setField(term63328, term63328.getClass(), "toString", null);
        setField(term63328, term63328.getClass(), "toProperString", null);
        term63325 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term63325, term63325.getClass(), "numerator", -548878718);
        setIntField(term63325, term63325.getClass(), "denominator", 1889403447);
        setField(term63325, term63325.getClass(), "toString", null);
        setField(term63325, term63325.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term62442, args);
        assertTrue(recursiveEquals(term62442, term63328));
        assertTrue(recursiveEquals(retValue, term63325));
    }

};


