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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexTableau_subtractRow_1706587652204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117393;

    public SimplexTableau_subtractRow_1706587652204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117393 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term117491 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setIntField(term117491, term117491.getClass(), "columns", 1);
        setIntField(term117491, term117491.getClass(), "blockColumns", 1);
        setField(term117393, term117393.getClass(), "tableau", term117491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0.0;
        try {
            callMethod(klass, "subtractRow", argTypes, term117393, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


