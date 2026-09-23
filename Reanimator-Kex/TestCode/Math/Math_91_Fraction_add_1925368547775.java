package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291734;
     Object term291822;

    public Fraction_add_1925368547775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291734 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term291734, term291734.getClass(), "numerator", -2147483648);
        setIntField(term291734, term291734.getClass(), "denominator", -326005023);
        term291822 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term291822, term291822.getClass(), "numerator", 8388608);
        setIntField(term291822, term291822.getClass(), "denominator", 1116175149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term291822;
        callMethod(klass, "add", argTypes, term291734, args);
    }

};


