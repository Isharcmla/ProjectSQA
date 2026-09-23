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

public class Fraction_reduce_535859131445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132309;
     Object term133154;
     Object term133151;

    public Fraction_reduce_535859131445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132309 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term132309, term132309.getClass(), "numerator", -1864778738);
        setIntField(term132309, term132309.getClass(), "denominator", 1215037441);
        term133154 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term133154, term133154.getClass(), "numerator", -1864778738);
        setIntField(term133154, term133154.getClass(), "denominator", 1215037441);
        setField(term133154, term133154.getClass(), "toString", null);
        setField(term133154, term133154.getClass(), "toProperString", null);
        term133151 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term133151, term133151.getClass(), "numerator", -1864778738);
        setIntField(term133151, term133151.getClass(), "denominator", 1215037441);
        setField(term133151, term133151.getClass(), "toString", null);
        setField(term133151, term133151.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term132309, args);
        assertTrue(recursiveEquals(term132309, term133154));
        assertTrue(recursiveEquals(retValue, term133151));
    }

};


