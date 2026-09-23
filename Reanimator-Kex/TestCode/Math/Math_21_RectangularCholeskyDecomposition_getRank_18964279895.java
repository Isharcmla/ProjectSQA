package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.linear.EqualityUtils.*;

public class RectangularCholeskyDecomposition_getRank_18964279895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term369;

    public RectangularCholeskyDecomposition_getRank_18964279895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        setField(term5, term5.getClass(), "root", null);
        setIntField(term5, term5.getClass(), "rank", 1162663216);
        term369 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        setField(term369, term369.getClass(), "root", null);
        setIntField(term369, term369.getClass(), "rank", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRank", argTypes, term5, args);
        assertTrue(recursiveEquals(term5, term369));
        assertTrue(recursiveEquals(retValue, 1162663216));
    }

};


