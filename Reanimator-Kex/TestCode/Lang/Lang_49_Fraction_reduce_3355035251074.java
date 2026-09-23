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

public class Fraction_reduce_3355035251074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310156;
     Object term310965;
     Object term310962;

    public Fraction_reduce_3355035251074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310156 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term310156, term310156.getClass(), "numerator", -1758728394);
        setIntField(term310156, term310156.getClass(), "denominator", 1375553533);
        term310965 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term310965, term310965.getClass(), "numerator", -1758728394);
        setIntField(term310965, term310965.getClass(), "denominator", 1375553533);
        setField(term310965, term310965.getClass(), "toString", null);
        setField(term310965, term310965.getClass(), "toProperString", null);
        term310962 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term310962, term310962.getClass(), "numerator", -1758728394);
        setIntField(term310962, term310962.getClass(), "denominator", 1375553533);
        setField(term310962, term310962.getClass(), "toString", null);
        setField(term310962, term310962.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term310156, args);
        assertTrue(recursiveEquals(term310156, term310965));
        assertTrue(recursiveEquals(retValue, term310962));
    }

};


