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
     Object term43523;

    public SimplexTableau_getSlackVariableOffset_81328163850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43534 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term43533 = ((Class) term43534).getDeclaredField((String) "LEQ");
        ((Field) term43533).setAccessible(true);
        Object enum108 = ((Field) term43533).get((Object) null);
        Object term10229 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10229, term10229.getClass(), "coefficients", null);
        setField(term10229, term10229.getClass(), "relationship", enum108);
        setDoubleField(term10229, term10229.getClass(), "value", 0.7618164754425794);
        Class<? extends Object> term43830 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term43829 = ((Class) term43830).getDeclaredField((String) "GEQ");
        ((Field) term43829).setAccessible(true);
        Object enum109 = ((Field) term43829).get((Object) null);
        Object term10233 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10233, term10233.getClass(), "coefficients", null);
        setField(term10233, term10233.getClass(), "relationship", enum109);
        setDoubleField(term10233, term10233.getClass(), "value", 0.7385589312559342);
        Class<? extends Object> term44126 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44125 = ((Class) term44126).getDeclaredField((String) "GEQ");
        ((Field) term44125).setAccessible(true);
        Object enum110 = ((Field) term44125).get((Object) null);
        Object term10237 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10237, term10237.getClass(), "coefficients", null);
        setField(term10237, term10237.getClass(), "relationship", enum110);
        setDoubleField(term10237, term10237.getClass(), "value", 0.7080134263823477);
        Object term10241 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10241, term10241.getClass(), "coefficients", null);
        setField(term10241, term10241.getClass(), "relationship", enum109);
        setDoubleField(term10241, term10241.getClass(), "value", 0.6059734092898602);
        Object term10243 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10243, term10243.getClass(), "coefficients", null);
        setField(term10243, term10243.getClass(), "relationship", enum110);
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
        Class<? extends Object> term44422 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44421 = ((Class) term44422).getDeclaredField((String) "LEQ");
        ((Field) term44421).setAccessible(true);
        Object enum111 = ((Field) term44421).get((Object) null);
        Object term43527 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term43527, term43527.getClass(), "coefficients", null);
        setField(term43527, term43527.getClass(), "relationship", enum111);
        setDoubleField(term43527, term43527.getClass(), "value", 0.7618164754425794);
        Object term43529 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term43529, term43529.getClass(), "coefficients", null);
        setField(term43529, term43529.getClass(), "relationship", enum111);
        setDoubleField(term43529, term43529.getClass(), "value", 0.7385589312559342);
        Object term43530 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term43530, term43530.getClass(), "coefficients", null);
        setField(term43530, term43530.getClass(), "relationship", enum111);
        setDoubleField(term43530, term43530.getClass(), "value", 0.7080134263823477);
        Object term43531 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term43531, term43531.getClass(), "coefficients", null);
        setField(term43531, term43531.getClass(), "relationship", enum111);
        setDoubleField(term43531, term43531.getClass(), "value", 0.6059734092898602);
        Object term43532 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term43532, term43532.getClass(), "coefficients", null);
        setField(term43532, term43532.getClass(), "relationship", enum111);
        setDoubleField(term43532, term43532.getClass(), "value", 0.3074693824288357);
        ArrayList term43525 = new ArrayList();
        ((ArrayList) term43525).add(term43527);
        ((ArrayList) term43525).add(term43529);
        ((ArrayList) term43525).add(term43530);
        ((ArrayList) term43525).add(term43531);
        ((ArrayList) term43525).add(term43532);
        term43523 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term43524 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term43524, term43524.getClass(), "coefficients", null);
        setDoubleField(term43524, term43524.getClass(), "constantTerm", 0.7330178886612495);
        setField(term43523, term43523.getClass(), "f", term43524);
        setField(term43523, term43523.getClass(), "constraints", term43525);
        setBooleanField(term43523, term43523.getClass(), "restrictToNonNegative", false);
        setField(term43523, term43523.getClass(), "tableau", null);
        setIntField(term43523, term43523.getClass(), "numDecisionVariables", -184153539);
        setIntField(term43523, term43523.getClass(), "numSlackVariables", 493620644);
        setIntField(term43523, term43523.getClass(), "numArtificialVariables", 1328271830);
        setDoubleField(term43523, term43523.getClass(), "epsilon", 0.1245258965512791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSlackVariableOffset", argTypes, term10224, args);
        assertTrue(recursiveEquals(term10224, term43523));
        assertTrue(recursiveEquals(retValue, -184153537));
    }

};


