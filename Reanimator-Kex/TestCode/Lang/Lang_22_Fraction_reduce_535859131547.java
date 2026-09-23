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

public class Fraction_reduce_535859131547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168003;
     Object term168967;
     Object term168964;

    public Fraction_reduce_535859131547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168003 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term168003, term168003.getClass(), "numerator", 468459170);
        setIntField(term168003, term168003.getClass(), "denominator", 1615391881);
        term168967 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term168967, term168967.getClass(), "numerator", 468459170);
        setIntField(term168967, term168967.getClass(), "denominator", 1615391881);
        setField(term168967, term168967.getClass(), "toString", null);
        setField(term168967, term168967.getClass(), "toProperString", null);
        term168964 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term168964, term168964.getClass(), "numerator", 468459170);
        setIntField(term168964, term168964.getClass(), "denominator", 1615391881);
        setField(term168964, term168964.getClass(), "toString", null);
        setField(term168964, term168964.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term168003, args);
        assertTrue(recursiveEquals(term168003, term168967));
        assertTrue(recursiveEquals(retValue, term168964));
    }

};


