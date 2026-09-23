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

public class Complex_acos_1430561531304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62068;
     Object term63111;
     Object term63108;

    public Complex_acos_1430561531304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62068 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term62068, term62068.getClass(), "real", 2.3058430092137103E18);
        setDoubleField(term62068, term62068.getClass(), "imaginary", 4194304.0);
        term63111 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term63111, term63111.getClass(), "imaginary", 4194304.0);
        setDoubleField(term63111, term63111.getClass(), "real", 2.3058430092137103E18);
        term63108 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term63108, term63108.getClass(), "imaginary", -42.97512519471662);
        setDoubleField(term63108, term63108.getClass(), "real", 1.8189894035458436E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term62068, args);
        assertTrue(recursiveEquals(term62068, term63111));
        assertTrue(recursiveEquals(retValue, term63108));
    }

};


