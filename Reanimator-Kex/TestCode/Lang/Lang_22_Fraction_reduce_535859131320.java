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

public class Fraction_reduce_535859131320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89822;
     Object term90395;
     Object term90392;

    public Fraction_reduce_535859131320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89822 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term89822, term89822.getClass(), "numerator", 1984996442);
        setIntField(term89822, term89822.getClass(), "denominator", 1706348037);
        term90395 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term90395, term90395.getClass(), "numerator", 1984996442);
        setIntField(term90395, term90395.getClass(), "denominator", 1706348037);
        setField(term90395, term90395.getClass(), "toString", null);
        setField(term90395, term90395.getClass(), "toProperString", null);
        term90392 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term90392, term90392.getClass(), "numerator", 1984996442);
        setIntField(term90392, term90392.getClass(), "denominator", 1706348037);
        setField(term90392, term90392.getClass(), "toString", null);
        setField(term90392, term90392.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term89822, args);
        assertTrue(recursiveEquals(term89822, term90395));
        assertTrue(recursiveEquals(retValue, term90392));
    }

};


