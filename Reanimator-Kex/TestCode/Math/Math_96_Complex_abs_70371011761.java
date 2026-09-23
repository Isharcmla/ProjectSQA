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

public class Complex_abs_70371011761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1969;
     Object term2011;

    public Complex_abs_70371011761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1969 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1969, term1969.getClass(), "real", -8.6456440973992868E18);
        setDoubleField(term1969, term1969.getClass(), "imaginary", 5.7772793945548864E17);
        term2011 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2011, term2011.getClass(), "imaginary", 5.7772793945548864E17);
        setDoubleField(term2011, term2011.getClass(), "real", -8.6456440973992868E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term1969, args);
        assertTrue(recursiveEquals(term1969, term2011));
        assertTrue(recursiveEquals(retValue, 8.664925356338772E18));
    }

};


