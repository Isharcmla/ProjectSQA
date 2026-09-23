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

public class Fraction_reduce_3355035251344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393038;
     Object term393805;
     Object term393802;

    public Fraction_reduce_3355035251344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393038 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term393038, term393038.getClass(), "numerator", -637423550);
        setIntField(term393038, term393038.getClass(), "denominator", 2089294663);
        term393805 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term393805, term393805.getClass(), "numerator", -637423550);
        setIntField(term393805, term393805.getClass(), "denominator", 2089294663);
        setField(term393805, term393805.getClass(), "toString", null);
        setField(term393805, term393805.getClass(), "toProperString", null);
        term393802 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term393802, term393802.getClass(), "numerator", -637423550);
        setIntField(term393802, term393802.getClass(), "denominator", 2089294663);
        setField(term393802, term393802.getClass(), "toString", null);
        setField(term393802, term393802.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term393038, args);
        assertTrue(recursiveEquals(term393038, term393805));
        assertTrue(recursiveEquals(retValue, term393802));
    }

};


