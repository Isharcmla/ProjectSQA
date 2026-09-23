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

public class Complex_acos_143056153143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term900;
     Object term897;

    public Complex_acos_143056153143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term57, term57.getClass(), "imaginary", 0.3587267442738795);
        setDoubleField(term57, term57.getClass(), "real", 0.07802449704920456);
        term900 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term900, term900.getClass(), "imaginary", 0.3587267442738795);
        setDoubleField(term900, term900.getClass(), "real", 0.07802449704920456);
        term897 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term897, term897.getClass(), "imaginary", -0.3523607083929584);
        setDoubleField(term897, term897.getClass(), "real", 1.49731086409391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term57, args);
        assertTrue(recursiveEquals(term57, term900));
        assertTrue(recursiveEquals(retValue, term897));
    }

};


