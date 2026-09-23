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

public class Complex_acos_1430561531107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11726;
     Object term11929;
     Object term11926;

    public Complex_acos_1430561531107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11726 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11726, term11726.getClass(), "real", 9.024791440785408E15);
        setDoubleField(term11726, term11726.getClass(), "imaginary", -9.205356538833666E18);
        term11929 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11929, term11929.getClass(), "imaginary", -9.205356538833666E18);
        setDoubleField(term11929, term11929.getClass(), "real", 9.024791440785408E15);
        term11926 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11926, term11926.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term11926, term11926.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term11726, args);
        assertTrue(recursiveEquals(term11726, term11929));
        assertTrue(recursiveEquals(retValue, term11926));
    }

};


