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

public class Fraction_reduce_3355035251061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306720;
     Object term306825;
     Object term306822;

    public Fraction_reduce_3355035251061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306720 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term306720, term306720.getClass(), "numerator", -1865454930);
        setIntField(term306720, term306720.getClass(), "denominator", 1150270097);
        term306825 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term306825, term306825.getClass(), "numerator", -1865454930);
        setIntField(term306825, term306825.getClass(), "denominator", 1150270097);
        setField(term306825, term306825.getClass(), "toString", null);
        setField(term306825, term306825.getClass(), "toProperString", null);
        term306822 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term306822, term306822.getClass(), "numerator", -1865454930);
        setIntField(term306822, term306822.getClass(), "denominator", 1150270097);
        setField(term306822, term306822.getClass(), "toString", null);
        setField(term306822, term306822.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term306720, args);
        assertTrue(recursiveEquals(term306720, term306825));
        assertTrue(recursiveEquals(retValue, term306822));
    }

};


