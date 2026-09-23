package org.apache.commons.math3.optimization.linear;

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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class SimplexSolver_getPivotRow_12298179723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1349;
     Object term1373;
     Object term1414;

    public SimplexSolver_getPivotRow_12298179723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1354 = new ArrayList();
        Class<? extends Object> term1417 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term1416 = ((Class) term1417).getDeclaredField((String) "MAXIMIZE");
        ((Field) term1416).setAccessible(true);
        Object enum4 = ((Field) term1416).get((Object) null);
        term1349 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term1352 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term1349, term1349.getClass(), "epsilon", 1.0E-6);
        setIntField(term1349, term1349.getClass(), "maxUlps", 10);
        setField(term1352, term1352.getClass(), "coefficients", null);
        setDoubleField(term1352, term1352.getClass(), "constantTerm", 0.1374549299694151);
        setField(term1349, term1349.getClass(), "function", term1352);
        setField(term1349, term1349.getClass(), "linearConstraints", term1354);
        setField(term1349, term1349.getClass(), "goal", enum4);
        setBooleanField(term1349, term1349.getClass(), "nonNegative", false);
        setIntField(term1349, term1349.getClass(), "maxIterations", 100);
        setIntField(term1349, term1349.getClass(), "iterations", -1955890973);
        Class<? extends Object> term1678 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term1677 = ((Class) term1678).getDeclaredField((String) "LEQ");
        ((Field) term1677).setAccessible(true);
        Object enum5 = ((Field) term1677).get((Object) null);
        Object term1378 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1378, term1378.getClass(), "coefficients", null);
        setField(term1378, term1378.getClass(), "relationship", enum5);
        setDoubleField(term1378, term1378.getClass(), "value", 0.9527281779865117);
        Class<? extends Object> term1979 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term1978 = ((Class) term1979).getDeclaredField((String) "LEQ");
        ((Field) term1978).setAccessible(true);
        Object enum6 = ((Field) term1978).get((Object) null);
        Object term1382 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1382, term1382.getClass(), "coefficients", null);
        setField(term1382, term1382.getClass(), "relationship", enum6);
        setDoubleField(term1382, term1382.getClass(), "value", 0.9828442029246764);
        Object term1386 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1386, term1386.getClass(), "coefficients", null);
        setField(term1386, term1386.getClass(), "relationship", enum5);
        setDoubleField(term1386, term1386.getClass(), "value", 0.2779719046761513);
        Object term1388 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1388, term1388.getClass(), "coefficients", null);
        setField(term1388, term1388.getClass(), "relationship", enum6);
        setDoubleField(term1388, term1388.getClass(), "value", 0.6436713023569729);
        Object term1390 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1390, term1390.getClass(), "coefficients", null);
        setField(term1390, term1390.getClass(), "relationship", enum5);
        setDoubleField(term1390, term1390.getClass(), "value", 0.7332741045694002);
        Class<? extends Object> term2280 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term2279 = ((Class) term2280).getDeclaredField((String) "EQ");
        ((Field) term2279).setAccessible(true);
        Object enum7 = ((Field) term2279).get((Object) null);
        Object term1392 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1392, term1392.getClass(), "coefficients", null);
        setField(term1392, term1392.getClass(), "relationship", enum7);
        setDoubleField(term1392, term1392.getClass(), "value", 0.4569171842750229);
        Object term1396 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1396, term1396.getClass(), "coefficients", null);
        setField(term1396, term1396.getClass(), "relationship", enum6);
        setDoubleField(term1396, term1396.getClass(), "value", 0.8598297828918529);
        Object term1398 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1398, term1398.getClass(), "coefficients", null);
        setField(term1398, term1398.getClass(), "relationship", null);
        setDoubleField(term1398, term1398.getClass(), "value", 0.0);
        Object term1400 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1400, term1400.getClass(), "coefficients", null);
        setField(term1400, term1400.getClass(), "relationship", null);
        setDoubleField(term1400, term1400.getClass(), "value", 0.0);
        ArrayList term1376 = new ArrayList();
        ((ArrayList) term1376).add(term1378);
        ((ArrayList) term1376).add(term1382);
        ((ArrayList) term1376).add(term1386);
        ((ArrayList) term1376).add(term1388);
        ((ArrayList) term1376).add(term1390);
        ((ArrayList) term1376).add(term1392);
        ((ArrayList) term1376).add(term1396);
        ((ArrayList) term1376).add(term1398);
        ((ArrayList) term1376).add(term1400);
        ArrayList term1405 = new ArrayList();
        term1373 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term1374 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term1374, term1374.getClass(), "coefficients", null);
        setDoubleField(term1374, term1374.getClass(), "constantTerm", 0.7031006357544823);
        setField(term1373, term1373.getClass(), "f", term1374);
        setField(term1373, term1373.getClass(), "constraints", term1376);
        setBooleanField(term1373, term1373.getClass(), "restrictToNonNegative", false);
        setField(term1373, term1373.getClass(), "columnLabels", term1405);
        setField(term1373, term1373.getClass(), "tableau", null);
        setIntField(term1373, term1373.getClass(), "numDecisionVariables", 0);
        setIntField(term1373, term1373.getClass(), "numSlackVariables", 0);
        setIntField(term1373, term1373.getClass(), "numArtificialVariables", 0);
        setDoubleField(term1373, term1373.getClass(), "epsilon", 0.0);
        setIntField(term1373, term1373.getClass(), "maxUlps", 0);
        term1414 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1373;
        args[1] = term1414;
        callMethod(klass, "getPivotRow", argTypes, term1349, args);
    }

};


