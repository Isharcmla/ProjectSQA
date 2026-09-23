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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexSolver_isPhase1Solved_369876463111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54664;
     Object term54786;

    public SimplexSolver_isPhase1Solved_369876463111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54664 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term54786 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term54888 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term54786, term54786.getClass(), "numArtificialVariables", 8192);
        setIntField(term54888, term54888.getClass(), "columnDimension", 4);
        setField(term54786, term54786.getClass(), "tableau", term54888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term54786;
        callMethod(klass, "isPhase1Solved", argTypes, term54664, args);
    }

};


