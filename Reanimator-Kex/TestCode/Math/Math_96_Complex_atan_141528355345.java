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

public class Complex_atan_141528355345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term1295;
     Object term1292;

    public Complex_atan_141528355345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term63, term63.getClass(), "imaginary", 0.22651340641904605);
        setDoubleField(term63, term63.getClass(), "real", 0.8878841294187743);
        term1295 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1295, term1295.getClass(), "imaginary", 0.22651340641904605);
        setDoubleField(term1295, term1295.getClass(), "real", 0.8878841294187743);
        term1292 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1292, term1292.getClass(), "imaginary", 0.12571240055736244);
        setDoubleField(term1292, term1292.getClass(), "real", 0.7403698454604495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term63, args);
        assertTrue(recursiveEquals(term63, term1295));
        assertTrue(recursiveEquals(retValue, term1292));
    }

};


