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

public class Fraction_reduce_535859131800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252827;
     Object term253627;
     Object term253624;

    public Fraction_reduce_535859131800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252827 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term252827, term252827.getClass(), "numerator", 546709778);
        setIntField(term252827, term252827.getClass(), "denominator", 1077463601);
        term253627 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term253627, term253627.getClass(), "numerator", 546709778);
        setIntField(term253627, term253627.getClass(), "denominator", 1077463601);
        setField(term253627, term253627.getClass(), "toString", null);
        setField(term253627, term253627.getClass(), "toProperString", null);
        term253624 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term253624, term253624.getClass(), "numerator", 546709778);
        setIntField(term253624, term253624.getClass(), "denominator", 1077463601);
        setField(term253624, term253624.getClass(), "toString", null);
        setField(term253624, term253624.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term252827, args);
        assertTrue(recursiveEquals(term252827, term253627));
        assertTrue(recursiveEquals(retValue, term253624));
    }

};


