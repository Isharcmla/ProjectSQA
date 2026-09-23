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

public class SimplexSolver_solvePhase1_1518945579160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68569;
     Object term68691;

    public SimplexSolver_solvePhase1_1518945579160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68569 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term68691 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term68789 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term68402 = (Object[]) newArray("[D", 114);
        setIntField(term68691, term68691.getClass(), "numArtificialVariables", -2139095040);
        setIntField(term68789, term68789.getClass(), "columns", 3);
        setIntField(term68789, term68789.getClass(), "blockColumns", -2);
        setField(term68789, term68789.getClass(), "blocks", term68402);
        setField(term68691, term68691.getClass(), "tableau", term68789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term68691;
        callMethod(klass, "solvePhase1", argTypes, term68569, args);
    }

};


