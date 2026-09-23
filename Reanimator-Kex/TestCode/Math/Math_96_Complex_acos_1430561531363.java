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

public class Complex_acos_1430561531363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83899;
     Object term84326;
     Object term84323;

    public Complex_acos_1430561531363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83899 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term83899, term83899.getClass(), "real", 1.1540474045136896E18);
        setDoubleField(term83899, term83899.getClass(), "imaginary", 5.7871255211710874E17);
        term84326 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term84326, term84326.getClass(), "imaginary", 5.7871255211710874E17);
        setDoubleField(term84326, term84326.getClass(), "real", 1.1540474045136896E18);
        term84323 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term84323, term84323.getClass(), "imaginary", -42.395111754885015);
        setDoubleField(term84323, term84323.getClass(), "real", 0.4648176552687436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term83899, args);
        assertTrue(recursiveEquals(term83899, term84326));
        assertTrue(recursiveEquals(retValue, term84323));
    }

};


