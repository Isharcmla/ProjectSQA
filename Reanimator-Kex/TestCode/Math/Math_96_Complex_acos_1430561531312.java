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

public class Complex_acos_1430561531312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65305;
     Object term65919;
     Object term65916;

    public Complex_acos_1430561531312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65305 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term65305, term65305.getClass(), "real", 3.5184372088832E13);
        setDoubleField(term65305, term65305.getClass(), "imaginary", 7.0368744177664E13);
        term65919 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term65919, term65919.getClass(), "imaginary", 7.0368744177664E13);
        setDoubleField(term65919, term65919.getClass(), "real", 3.5184372088832E13);
        term65916 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term65916, term65916.getClass(), "imaginary", -32.689489261974536);
        setDoubleField(term65916, term65916.getClass(), "real", 1.1071487177940904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term65305, args);
        assertTrue(recursiveEquals(term65305, term65919));
        assertTrue(recursiveEquals(retValue, term65916));
    }

};


