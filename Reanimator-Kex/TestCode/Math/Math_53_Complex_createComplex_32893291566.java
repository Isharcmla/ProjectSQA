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
import java.lang.Double;

public class Complex_createComplex_32893291566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;
     Object term190;
     Object term192;
     Object term3688;
     Object term3676;

    public Complex_createComplex_32893291566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term185, term185.getClass(), "imaginary", 0.36226058076369927);
        setDoubleField(term185, term185.getClass(), "real", 0.03699061125289671);
        setBooleanField(term185, term185.getClass(), "isNaN", false);
        setBooleanField(term185, term185.getClass(), "isInfinite", false);
        term190 = new Double(0.6047137830113202);
        term192 = new Double(0.6767213143579776);
        term3688 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3688, term3688.getClass(), "imaginary", 0.36226058076369927);
        setDoubleField(term3688, term3688.getClass(), "real", 0.03699061125289671);
        setBooleanField(term3688, term3688.getClass(), "isNaN", false);
        setBooleanField(term3688, term3688.getClass(), "isInfinite", false);
        term3676 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3676, term3676.getClass(), "imaginary", 0.6767213143579776);
        setDoubleField(term3676, term3676.getClass(), "real", 0.6047137830113202);
        setBooleanField(term3676, term3676.getClass(), "isNaN", false);
        setBooleanField(term3676, term3676.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term190;
        args[1] = term192;
        Object retValue = callMethod(klass, "createComplex", argTypes, term185, args);
        assertTrue(recursiveEquals(term185, term3688));
        assertTrue(recursiveEquals(term190, 0.6047137830113202));
        assertTrue(recursiveEquals(term192, 0.6767213143579776));
        assertTrue(recursiveEquals(retValue, term3676));
    }

};


