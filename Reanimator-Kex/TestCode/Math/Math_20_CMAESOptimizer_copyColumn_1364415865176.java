package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.direct.EqualityUtils.*;

public class CMAESOptimizer_copyColumn_1364415865176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103970;
     Object term109023;

    public CMAESOptimizer_copyColumn_1364415865176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103970 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        term109023 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term109023, term109023.getClass(), "blocks", null);
        setIntField(term109023, term109023.getClass(), "rows", 0);
        setIntField(term109023, term109023.getClass(), "columns", 0);
        setIntField(term109023, term109023.getClass(), "blockRows", 0);
        setIntField(term109023, term109023.getClass(), "blockColumns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term103970;
        args[1] = 0;
        args[2] = null;
        args[3] = 0;
        callMethod(klass, "copyColumn", argTypes, null, args);
        assertTrue(recursiveEquals(term103970, term109023));
    }

};


