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

public class Complex_acos_1430561531325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70422;
     Object term70849;
     Object term70846;

    public Complex_acos_1430561531325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70422 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term70422, term70422.getClass(), "real", 1.45241087982698496E17);
        setDoubleField(term70422, term70422.getClass(), "imaginary", 2.8823037615276032E17);
        term70849 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term70849, term70849.getClass(), "imaginary", 2.8823037615276032E17);
        setDoubleField(term70849, term70849.getClass(), "real", 1.45241087982698496E17);
        term70846 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term70846, term70846.getClass(), "imaginary", -41.00882157682944);
        setDoubleField(term70846, term70846.getClass(), "real", 1.104028603115492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term70422, args);
        assertTrue(recursiveEquals(term70422, term70849));
        assertTrue(recursiveEquals(retValue, term70846));
    }

};


