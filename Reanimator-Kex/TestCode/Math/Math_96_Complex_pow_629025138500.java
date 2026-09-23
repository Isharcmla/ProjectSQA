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

public class Complex_pow_629025138500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126100;
     Object term126184;
     Object term126766;
     Object term126767;
     Object term126763;

    public Complex_pow_629025138500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126100 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term126100, term126100.getClass(), "real", -9.1513144427788145E18);
        setDoubleField(term126100, term126100.getClass(), "imaginary", -9.1513144428157225E18);
        term126184 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term126184, term126184.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term126184, term126184.getClass(), "imaginary", -9.2166166374137201E18);
        term126766 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term126766, term126766.getClass(), "imaginary", -9.1513144428157225E18);
        setDoubleField(term126766, term126766.getClass(), "real", -9.1513144427788145E18);
        term126767 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term126767, term126767.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term126767, term126767.getClass(), "real", -9.2166166374137201E18);
        term126763 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term126763, term126763.getClass(), "imaginary", 0.0);
        setDoubleField(term126763, term126763.getClass(), "real", -0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term126184;
        Object retValue = callMethod(klass, "pow", argTypes, term126100, args);
        assertTrue(recursiveEquals(term126100, term126766));
        assertTrue(recursiveEquals(term126184, term126767));
        assertTrue(recursiveEquals(retValue, term126763));
    }

};


