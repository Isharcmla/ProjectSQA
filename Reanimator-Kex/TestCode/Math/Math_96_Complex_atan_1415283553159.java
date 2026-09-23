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

public class Complex_atan_1415283553159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23156;
     Object term23340;
     Object term23337;

    public Complex_atan_1415283553159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23156 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term23156, term23156.getClass(), "real", 5.7646075230342554E17);
        setDoubleField(term23156, term23156.getClass(), "imaginary", -6.9175290276389847E18);
        term23340 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term23340, term23340.getClass(), "imaginary", -6.9175290276389847E18);
        setDoubleField(term23340, term23340.getClass(), "real", 5.7646075230342554E17);
        term23337 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term23337, term23337.getClass(), "imaginary", 0.0);
        setDoubleField(term23337, term23337.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term23156, args);
        assertTrue(recursiveEquals(term23156, term23340));
        assertTrue(recursiveEquals(retValue, term23337));
    }

};


