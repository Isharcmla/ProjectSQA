package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_asin_1415968746141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19617;
     Object term19828;
     Object term19825;

    public Complex_asin_1415968746141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19617 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19617, term19617.getClass(), "real", 5.7871255211710874E17);
        setDoubleField(term19617, term19617.getClass(), "imaginary", -9.2188684372274053E18);
        term19828 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19828, term19828.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term19828, term19828.getClass(), "real", 5.7871255211710874E17);
        term19825 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19825, term19825.getClass(), "imaginary", -44.36289762055753);
        setDoubleField(term19825, term19825.getClass(), "real", 0.06269252845447333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term19617, args);
        assertTrue(recursiveEquals(term19617, term19828));
        assertTrue(recursiveEquals(retValue, term19825));
    }

};


