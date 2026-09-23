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

public class Complex_readResolve_129001964767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194;
     Object term3711;
     Object term3706;

    public Complex_readResolve_129001964767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term194, term194.getClass(), "imaginary", 0.48862955528902696);
        setDoubleField(term194, term194.getClass(), "real", 0.426231085465289);
        setBooleanField(term194, term194.getClass(), "isNaN", false);
        setBooleanField(term194, term194.getClass(), "isInfinite", false);
        term3711 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3711, term3711.getClass(), "imaginary", 0.48862955528902696);
        setDoubleField(term3711, term3711.getClass(), "real", 0.426231085465289);
        setBooleanField(term3711, term3711.getClass(), "isNaN", false);
        setBooleanField(term3711, term3711.getClass(), "isInfinite", false);
        term3706 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3706, term3706.getClass(), "imaginary", 0.48862955528902696);
        setDoubleField(term3706, term3706.getClass(), "real", 0.426231085465289);
        setBooleanField(term3706, term3706.getClass(), "isNaN", false);
        setBooleanField(term3706, term3706.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term194, args);
        assertTrue(recursiveEquals(term194, term3711));
        assertTrue(recursiveEquals(retValue, term3706));
    }

};


