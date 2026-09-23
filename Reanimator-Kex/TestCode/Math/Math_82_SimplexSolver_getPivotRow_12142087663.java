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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class SimplexSolver_getPivotRow_12142087663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258;
     Object term1295;
     Object term1297;

    public SimplexSolver_getPivotRow_12142087663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1310 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term1309 = ((Class) term1310).getDeclaredField((String) "EQ");
        ((Field) term1309).setAccessible(true);
        Object enum4 = ((Field) term1309).get((Object) null);
        Object term1266 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1266, term1266.getClass(), "coefficients", null);
        setField(term1266, term1266.getClass(), "relationship", enum4);
        setDoubleField(term1266, term1266.getClass(), "value", 0.7031006357544823);
        Class<? extends Object> term1603 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term1602 = ((Class) term1603).getDeclaredField((String) "LEQ");
        ((Field) term1602).setAccessible(true);
        Object enum5 = ((Field) term1602).get((Object) null);
        Object term1270 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1270, term1270.getClass(), "coefficients", null);
        setField(term1270, term1270.getClass(), "relationship", enum5);
        setDoubleField(term1270, term1270.getClass(), "value", 0.9527281779865117);
        Object term1274 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1274, term1274.getClass(), "coefficients", null);
        setField(term1274, term1274.getClass(), "relationship", enum4);
        setDoubleField(term1274, term1274.getClass(), "value", 0.9828442029246764);
        Object term1276 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1276, term1276.getClass(), "coefficients", null);
        setField(term1276, term1276.getClass(), "relationship", enum5);
        setDoubleField(term1276, term1276.getClass(), "value", 0.2779719046761513);
        Object term1278 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1278, term1278.getClass(), "coefficients", null);
        setField(term1278, term1278.getClass(), "relationship", enum4);
        setDoubleField(term1278, term1278.getClass(), "value", 0.6436713023569729);
        ArrayList term1264 = new ArrayList();
        ((ArrayList) term1264).add(term1266);
        ((ArrayList) term1264).add(term1270);
        ((ArrayList) term1264).add(term1274);
        ((ArrayList) term1264).add(term1276);
        ((ArrayList) term1264).add(term1278);
        Class<? extends Object> term1899 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term1898 = ((Class) term1899).getDeclaredField((String) "MAXIMIZE");
        ((Field) term1898).setAccessible(true);
        Object enum6 = ((Field) term1898).get((Object) null);
        term1258 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        Object term1262 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term1258, term1258.getClass(), "epsilon", 1.0E-6);
        setIntField(term1258, term1258.getClass(), "maxIterations", 100);
        setIntField(term1258, term1258.getClass(), "iterations", -1922583790);
        setField(term1262, term1262.getClass(), "coefficients", null);
        setDoubleField(term1262, term1262.getClass(), "constantTerm", 0.1374549299694151);
        setField(term1258, term1258.getClass(), "f", term1262);
        setField(term1258, term1258.getClass(), "constraints", term1264);
        setField(term1258, term1258.getClass(), "goalType", enum6);
        setBooleanField(term1258, term1258.getClass(), "restrictToNonNegative", false);
        term1295 = new Integer(-616727354);
        ArrayList term1300 = new ArrayList();
        term1297 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term1298 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term1298, term1298.getClass(), "coefficients", null);
        setDoubleField(term1298, term1298.getClass(), "constantTerm", 0.7332741045694002);
        setField(term1297, term1297.getClass(), "f", term1298);
        setField(term1297, term1297.getClass(), "constraints", term1300);
        setBooleanField(term1297, term1297.getClass(), "restrictToNonNegative", false);
        setField(term1297, term1297.getClass(), "tableau", null);
        setIntField(term1297, term1297.getClass(), "numDecisionVariables", -1955890973);
        setIntField(term1297, term1297.getClass(), "numSlackVariables", -2038273078);
        setIntField(term1297, term1297.getClass(), "numArtificialVariables", 1227103734);
        setDoubleField(term1297, term1297.getClass(), "epsilon", 0.4569171842750229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[2];
        args[0] = term1295;
        args[1] = term1297;
        callMethod(klass, "getPivotRow", argTypes, term1258, args);
    }

};


