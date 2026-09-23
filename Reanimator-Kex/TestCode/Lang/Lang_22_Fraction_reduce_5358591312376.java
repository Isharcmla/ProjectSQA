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

public class Fraction_reduce_5358591312376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777116;
     Object term777586;
     Object term777580;

    public Fraction_reduce_5358591312376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term777116 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term777116, term777116.getClass(), "numerator", -2127491058);
        setIntField(term777116, term777116.getClass(), "denominator", 1151212017);
        term777586 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term777586, term777586.getClass(), "numerator", -2127491058);
        setIntField(term777586, term777586.getClass(), "denominator", 1151212017);
        setField(term777586, term777586.getClass(), "toString", null);
        setField(term777586, term777586.getClass(), "toProperString", null);
        term777580 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term777580, term777580.getClass(), "numerator", -709163686);
        setIntField(term777580, term777580.getClass(), "denominator", 383737339);
        setField(term777580, term777580.getClass(), "toString", null);
        setField(term777580, term777580.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term777116, args);
        assertTrue(recursiveEquals(term777116, term777586));
        assertTrue(recursiveEquals(retValue, term777580));
    }

};


