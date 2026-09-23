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

public class Complex_atan_1415283553291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58383;
     Object term58567;
     Object term58564;

    public Complex_atan_1415283553291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58383 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term58383, term58383.getClass(), "real", 1.34217728E8);
        setDoubleField(term58383, term58383.getClass(), "imaginary", -9.0792568487789189E18);
        term58567 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term58567, term58567.getClass(), "imaginary", -9.0792568487789189E18);
        setDoubleField(term58567, term58567.getClass(), "real", 1.34217728E8);
        term58564 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term58564, term58564.getClass(), "imaginary", 0.0);
        setDoubleField(term58564, term58564.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term58383, args);
        assertTrue(recursiveEquals(term58383, term58567));
        assertTrue(recursiveEquals(retValue, term58564));
    }

};


