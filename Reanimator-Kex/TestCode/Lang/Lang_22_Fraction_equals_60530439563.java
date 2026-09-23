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

public class Fraction_equals_60530439563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1148;
     Object term1175;
     Object term6803;
     Object term6808;

    public Fraction_equals_60530439563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1148 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term1148, term1148.getClass(), "numerator", -556405712);
        setIntField(term1148, term1148.getClass(), "denominator", -1772434990);
        setField(term1148, term1148.getClass(), "toString", "LvtrsXUliU");
        setField(term1148, term1148.getClass(), "toProperString", "xLbjWUgOIL");
        term1175 = newInstance(Class.forName("java.lang.Object"));
        term6803 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term6803, term6803.getClass(), "numerator", -556405712);
        setIntField(term6803, term6803.getClass(), "denominator", -1772434990);
        setField(term6803, term6803.getClass(), "toString", "LvtrsXUliU");
        setField(term6803, term6803.getClass(), "toProperString", "xLbjWUgOIL");
        term6808 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1175;
        Object retValue = callMethod(klass, "equals", argTypes, term1148, args);
        assertTrue(recursiveEquals(term1148, term6803));
        assertTrue(recursiveEquals(term1175, term6808));
        assertTrue(recursiveEquals(retValue, false));
    }

};


