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

public class SimplexSolver_solvePhase1_1518945579125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56996;
     Object term57118;

    public SimplexSolver_solvePhase1_1518945579125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56996 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term57118 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term57216 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term57118, term57118.getClass(), "numArtificialVariables", -2147483648);
        setIntField(term57216, term57216.getClass(), "columns", 3);
        setField(term57118, term57118.getClass(), "tableau", term57216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term57118;
        try {
            callMethod(klass, "solvePhase1", argTypes, term56996, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


