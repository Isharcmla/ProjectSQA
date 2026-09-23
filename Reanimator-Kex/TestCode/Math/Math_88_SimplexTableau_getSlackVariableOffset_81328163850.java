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
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getSlackVariableOffset_81328163850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10224;
     Object term44119;

    public SimplexTableau_getSlackVariableOffset_81328163850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44130 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44129 = ((Class) term44130).getDeclaredField((String) "GEQ");
        ((Field) term44129).setAccessible(true);
        Object enum110 = ((Field) term44129).get((Object) null);
        Object term10229 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10229, term10229.getClass(), "coefficients", null);
        setField(term10229, term10229.getClass(), "relationship", enum110);
        setDoubleField(term10229, term10229.getClass(), "value", 0.7618164754425794);
        Class<? extends Object> term44426 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44425 = ((Class) term44426).getDeclaredField((String) "LEQ");
        ((Field) term44425).setAccessible(true);
        Object enum111 = ((Field) term44425).get((Object) null);
        Object term10233 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10233, term10233.getClass(), "coefficients", null);
        setField(term10233, term10233.getClass(), "relationship", enum111);
        setDoubleField(term10233, term10233.getClass(), "value", 0.7385589312559342);
        Class<? extends Object> term44722 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44721 = ((Class) term44722).getDeclaredField((String) "GEQ");
        ((Field) term44721).setAccessible(true);
        Object enum112 = ((Field) term44721).get((Object) null);
        Object term10237 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10237, term10237.getClass(), "coefficients", null);
        setField(term10237, term10237.getClass(), "relationship", enum112);
        setDoubleField(term10237, term10237.getClass(), "value", 0.7080134263823477);
        Object term10241 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10241, term10241.getClass(), "coefficients", null);
        setField(term10241, term10241.getClass(), "relationship", enum111);
        setDoubleField(term10241, term10241.getClass(), "value", 0.6059734092898602);
        Object term10243 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10243, term10243.getClass(), "coefficients", null);
        setField(term10243, term10243.getClass(), "relationship", enum112);
        setDoubleField(term10243, term10243.getClass(), "value", 0.3074693824288357);
        ArrayList term10227 = new ArrayList();
        ((ArrayList) term10227).add(term10229);
        ((ArrayList) term10227).add(term10233);
        ((ArrayList) term10227).add(term10237);
        ((ArrayList) term10227).add(term10241);
        ((ArrayList) term10227).add(term10243);
        term10224 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term10225 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term10225, term10225.getClass(), "coefficients", null);
        setDoubleField(term10225, term10225.getClass(), "constantTerm", 0.7330178886612495);
        setField(term10224, term10224.getClass(), "f", term10225);
        setField(term10224, term10224.getClass(), "constraints", term10227);
        setBooleanField(term10224, term10224.getClass(), "restrictToNonNegative", false);
        setField(term10224, term10224.getClass(), "tableau", null);
        setIntField(term10224, term10224.getClass(), "numDecisionVariables", -184153539);
        setIntField(term10224, term10224.getClass(), "numSlackVariables", 493620644);
        setIntField(term10224, term10224.getClass(), "numArtificialVariables", 1328271830);
        setDoubleField(term10224, term10224.getClass(), "epsilon", 0.1245258965512791);
        Class<? extends Object> term45018 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45017 = ((Class) term45018).getDeclaredField((String) "EQ");
        ((Field) term45017).setAccessible(true);
        Object enum113 = ((Field) term45017).get((Object) null);
        Object term44123 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44123, term44123.getClass(), "coefficients", null);
        setField(term44123, term44123.getClass(), "relationship", enum113);
        setDoubleField(term44123, term44123.getClass(), "value", 0.7618164754425794);
        Object term44125 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44125, term44125.getClass(), "coefficients", null);
        setField(term44125, term44125.getClass(), "relationship", enum113);
        setDoubleField(term44125, term44125.getClass(), "value", 0.7385589312559342);
        Object term44126 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44126, term44126.getClass(), "coefficients", null);
        setField(term44126, term44126.getClass(), "relationship", enum113);
        setDoubleField(term44126, term44126.getClass(), "value", 0.7080134263823477);
        Object term44127 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44127, term44127.getClass(), "coefficients", null);
        setField(term44127, term44127.getClass(), "relationship", enum113);
        setDoubleField(term44127, term44127.getClass(), "value", 0.6059734092898602);
        Object term44128 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44128, term44128.getClass(), "coefficients", null);
        setField(term44128, term44128.getClass(), "relationship", enum113);
        setDoubleField(term44128, term44128.getClass(), "value", 0.3074693824288357);
        ArrayList term44121 = new ArrayList();
        ((ArrayList) term44121).add(term44123);
        ((ArrayList) term44121).add(term44125);
        ((ArrayList) term44121).add(term44126);
        ((ArrayList) term44121).add(term44127);
        ((ArrayList) term44121).add(term44128);
        term44119 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term44120 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term44120, term44120.getClass(), "coefficients", null);
        setDoubleField(term44120, term44120.getClass(), "constantTerm", 0.7330178886612495);
        setField(term44119, term44119.getClass(), "f", term44120);
        setField(term44119, term44119.getClass(), "constraints", term44121);
        setBooleanField(term44119, term44119.getClass(), "restrictToNonNegative", false);
        setField(term44119, term44119.getClass(), "tableau", null);
        setIntField(term44119, term44119.getClass(), "numDecisionVariables", -184153539);
        setIntField(term44119, term44119.getClass(), "numSlackVariables", 493620644);
        setIntField(term44119, term44119.getClass(), "numArtificialVariables", 1328271830);
        setDoubleField(term44119, term44119.getClass(), "epsilon", 0.1245258965512791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSlackVariableOffset", argTypes, term10224, args);
        assertTrue(recursiveEquals(term10224, term44119));
        assertTrue(recursiveEquals(retValue, -184153537));
    }

};


