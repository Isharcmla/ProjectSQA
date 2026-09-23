package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class ArrayUtils_isEmpty_889798796297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1364;
     Object term14861;

    public ArrayUtils_isEmpty_889798796297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1364 = (double[]) newDoubleArray(8);
        setDoubleElement(term1364, 0, 0.0027299293098262956);
        setDoubleElement(term1364, 1, 0.29874017652881824);
        setDoubleElement(term1364, 2, 0.32554480512985284);
        setDoubleElement(term1364, 3, 0.8924855581421237);
        setDoubleElement(term1364, 4, 0.32237559209193944);
        setDoubleElement(term1364, 5, 0.53094494792755);
        setDoubleElement(term1364, 6, 0.146431486357265);
        setDoubleElement(term1364, 7, 0.24259014218848696);
        term14861 = (double[]) newDoubleArray(8);
        setDoubleElement(term14861, 0, 0.0027299293098262956);
        setDoubleElement(term14861, 1, 0.29874017652881824);
        setDoubleElement(term14861, 2, 0.32554480512985284);
        setDoubleElement(term14861, 3, 0.8924855581421237);
        setDoubleElement(term14861, 4, 0.32237559209193944);
        setDoubleElement(term14861, 5, 0.53094494792755);
        setDoubleElement(term14861, 6, 0.146431486357265);
        setDoubleElement(term14861, 7, 0.24259014218848696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1364;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1364, term14861));
        assertTrue(recursiveEquals(retValue, false));
    }

};


