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

public class Fraction_reduce_5358591312677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877855;
     Object term878704;
     Object term878701;

    public Fraction_reduce_5358591312677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term877855 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term877855, term877855.getClass(), "numerator", -1073425594);
        setIntField(term877855, term877855.getClass(), "denominator", 1234180133);
        term878704 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term878704, term878704.getClass(), "numerator", -1073425594);
        setIntField(term878704, term878704.getClass(), "denominator", 1234180133);
        setField(term878704, term878704.getClass(), "toString", null);
        setField(term878704, term878704.getClass(), "toProperString", null);
        term878701 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term878701, term878701.getClass(), "numerator", -1073425594);
        setIntField(term878701, term878701.getClass(), "denominator", 1234180133);
        setField(term878701, term878701.getClass(), "toString", null);
        setField(term878701, term878701.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term877855, args);
        assertTrue(recursiveEquals(term877855, term878704));
        assertTrue(recursiveEquals(retValue, term878701));
    }

};


