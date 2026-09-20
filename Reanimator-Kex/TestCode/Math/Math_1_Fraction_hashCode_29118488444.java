package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_hashCode_29118488444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;
     Object term1727;

    public Fraction_hashCode_29118488444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term52, term52.getClass(), "denominator", -117576464);
        setIntField(term52, term52.getClass(), "numerator", -1007160944);
        term1727 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1727, term1727.getClass(), "denominator", -117576464);
        setIntField(term1727, term1727.getClass(), "numerator", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term52, args);
        assertTrue(recursiveEquals(term52, term1727));
        assertTrue(recursiveEquals(retValue, 1272197545));
    }

};
