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

public class Complex_asin_141596874693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7872;
     Object term8088;
     Object term8085;

    public Complex_asin_141596874693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7872 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7872, term7872.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term7872, term7872.getClass(), "imaginary", -9.218868437226881E18);
        term8088 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8088, term8088.getClass(), "imaginary", -9.218868437226881E18);
        setDoubleField(term8088, term8088.getClass(), "real", -9.2188684372274053E18);
        term8085 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8085, term8085.getClass(), "imaginary", -44.70750474561834);
        setDoubleField(term8085, term8085.getClass(), "real", -0.7853981633974767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term7872, args);
        assertTrue(recursiveEquals(term7872, term8088));
        assertTrue(recursiveEquals(retValue, term8085));
    }

};


