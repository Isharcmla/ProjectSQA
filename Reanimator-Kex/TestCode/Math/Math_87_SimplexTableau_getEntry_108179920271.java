package org.apache.commons.math.optimization.linear;

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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexTableau_getEntry_108179920271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56569;

    public SimplexTableau_getEntry_108179920271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56569 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term56671 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term56569, term56569.getClass(), "tableau", term56671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        try {
            callMethod(klass, "getEntry", argTypes, term56569, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


