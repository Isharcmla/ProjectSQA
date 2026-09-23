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

public class Fraction_reduce_535859131584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180606;
     Object term181535;
     Object term181532;

    public Fraction_reduce_535859131584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180606 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term180606, term180606.getClass(), "numerator", -1103081854);
        setIntField(term180606, term180606.getClass(), "denominator", 838869127);
        term181535 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term181535, term181535.getClass(), "numerator", -1103081854);
        setIntField(term181535, term181535.getClass(), "denominator", 838869127);
        setField(term181535, term181535.getClass(), "toString", null);
        setField(term181535, term181535.getClass(), "toProperString", null);
        term181532 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term181532, term181532.getClass(), "numerator", -1103081854);
        setIntField(term181532, term181532.getClass(), "denominator", 838869127);
        setField(term181532, term181532.getClass(), "toString", null);
        setField(term181532, term181532.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term180606, args);
        assertTrue(recursiveEquals(term180606, term181535));
        assertTrue(recursiveEquals(retValue, term181532));
    }

};


