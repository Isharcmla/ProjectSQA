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

public class Complex_pow_629025138197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31949;
     Object term32033;
     Object term32111;
     Object term32112;
     Object term32108;

    public Complex_pow_629025138197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31949 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term31949, term31949.getClass(), "real", 5.7646075230342349E17);
        setDoubleField(term31949, term31949.getClass(), "imaginary", 4.611686018427392E18);
        term32033 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term32033, term32033.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term32033, term32033.getClass(), "imaginary", -9.2188684369589699E18);
        term32111 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term32111, term32111.getClass(), "imaginary", 4.611686018427392E18);
        setDoubleField(term32111, term32111.getClass(), "real", 5.7646075230342349E17);
        term32112 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term32112, term32112.getClass(), "imaginary", -9.2188684369589699E18);
        setDoubleField(term32112, term32112.getClass(), "real", -9.2188684372274053E18);
        term32108 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term32108, term32108.getClass(), "imaginary", 0.0);
        setDoubleField(term32108, term32108.getClass(), "real", -0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term32033;
        Object retValue = callMethod(klass, "pow", argTypes, term31949, args);
        assertTrue(recursiveEquals(term31949, term32111));
        assertTrue(recursiveEquals(term32033, term32112));
        assertTrue(recursiveEquals(retValue, term32108));
    }

};


