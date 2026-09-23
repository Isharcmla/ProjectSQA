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

public class SimplexSolver_solvePhase1_151894557997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44788;
     Object term44910;

    public SimplexSolver_solvePhase1_151894557997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44788 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term44910 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term45012 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term45120 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term44910, term44910.getClass(), "numArtificialVariables", -2147483648);
        setIntField(term45012, term45012.getClass(), "columnDimension", 1073743232);
        setIntField(term45012, term45012.getClass(), "rowDimension", 1);
        setField(term45012, term45012.getClass(), "entries", term45120);
        setField(term44910, term44910.getClass(), "tableau", term45012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term44910;
        try {
            callMethod(klass, "solvePhase1", argTypes, term44788, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


