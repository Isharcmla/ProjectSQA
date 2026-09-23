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

public class SimplexTableau_getNegativeDecisionVariableOffset_105914813558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13882;
     Object term53455;

    public SimplexTableau_getNegativeDecisionVariableOffset_105914813558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53468 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term53467 = ((Class) term53468).getDeclaredField((String) "EQ");
        ((Field) term53467).setAccessible(true);
        Object enum134 = ((Field) term53467).get((Object) null);
        Object term13887 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13887, term13887.getClass(), "coefficients", null);
        setField(term13887, term13887.getClass(), "relationship", enum134);
        setDoubleField(term13887, term13887.getClass(), "value", 0.6584165706677267);
        Object term13891 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13891, term13891.getClass(), "coefficients", null);
        setField(term13891, term13891.getClass(), "relationship", enum134);
        setDoubleField(term13891, term13891.getClass(), "value", 0.44268490778872205);
        Class<? extends Object> term53761 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term53760 = ((Class) term53761).getDeclaredField((String) "LEQ");
        ((Field) term53760).setAccessible(true);
        Object enum135 = ((Field) term53760).get((Object) null);
        Object term13893 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13893, term13893.getClass(), "coefficients", null);
        setField(term13893, term13893.getClass(), "relationship", enum135);
        setDoubleField(term13893, term13893.getClass(), "value", 0.7507333108648018);
        Object term13897 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13897, term13897.getClass(), "coefficients", null);
        setField(term13897, term13897.getClass(), "relationship", enum135);
        setDoubleField(term13897, term13897.getClass(), "value", 0.007493740494434409);
        Class<? extends Object> term54057 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term54056 = ((Class) term54057).getDeclaredField((String) "LEQ");
        ((Field) term54056).setAccessible(true);
        Object enum136 = ((Field) term54056).get((Object) null);
        Object term13899 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13899, term13899.getClass(), "coefficients", null);
        setField(term13899, term13899.getClass(), "relationship", enum136);
        setDoubleField(term13899, term13899.getClass(), "value", 0.29172553321356776);
        Object term13903 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13903, term13903.getClass(), "coefficients", null);
        setField(term13903, term13903.getClass(), "relationship", enum136);
        setDoubleField(term13903, term13903.getClass(), "value", 0.9276995636844321);
        ArrayList term13885 = new ArrayList();
        ((ArrayList) term13885).add(term13887);
        ((ArrayList) term13885).add(term13891);
        ((ArrayList) term13885).add(term13893);
        ((ArrayList) term13885).add(term13897);
        ((ArrayList) term13885).add(term13899);
        ((ArrayList) term13885).add(term13903);
        term13882 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term13883 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term13883, term13883.getClass(), "coefficients", null);
        setDoubleField(term13883, term13883.getClass(), "constantTerm", 0.6428742553484879);
        setField(term13882, term13882.getClass(), "f", term13883);
        setField(term13882, term13882.getClass(), "constraints", term13885);
        setBooleanField(term13882, term13882.getClass(), "restrictToNonNegative", true);
        setField(term13882, term13882.getClass(), "tableau", null);
        setIntField(term13882, term13882.getClass(), "numDecisionVariables", -112921587);
        setIntField(term13882, term13882.getClass(), "numSlackVariables", 933028652);
        setIntField(term13882, term13882.getClass(), "numArtificialVariables", 287287233);
        setDoubleField(term13882, term13882.getClass(), "epsilon", 0.7636130748477434);
        Class<? extends Object> term54353 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term54352 = ((Class) term54353).getDeclaredField((String) "LEQ");
        ((Field) term54352).setAccessible(true);
        Object enum137 = ((Field) term54352).get((Object) null);
        Object term53459 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term53459, term53459.getClass(), "coefficients", null);
        setField(term53459, term53459.getClass(), "relationship", enum137);
        setDoubleField(term53459, term53459.getClass(), "value", 0.6584165706677267);
        Object term53461 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term53461, term53461.getClass(), "coefficients", null);
        setField(term53461, term53461.getClass(), "relationship", enum137);
        setDoubleField(term53461, term53461.getClass(), "value", 0.44268490778872205);
        Class<? extends Object> term54649 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term54648 = ((Class) term54649).getDeclaredField((String) "GEQ");
        ((Field) term54648).setAccessible(true);
        Object enum138 = ((Field) term54648).get((Object) null);
        Object term53462 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term53462, term53462.getClass(), "coefficients", null);
        setField(term53462, term53462.getClass(), "relationship", enum138);
        setDoubleField(term53462, term53462.getClass(), "value", 0.7507333108648018);
        Object term53464 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term53464, term53464.getClass(), "coefficients", null);
        setField(term53464, term53464.getClass(), "relationship", enum138);
        setDoubleField(term53464, term53464.getClass(), "value", 0.007493740494434409);
        Object term53465 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term53465, term53465.getClass(), "coefficients", null);
        setField(term53465, term53465.getClass(), "relationship", enum138);
        setDoubleField(term53465, term53465.getClass(), "value", 0.29172553321356776);
        Object term53466 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term53466, term53466.getClass(), "coefficients", null);
        setField(term53466, term53466.getClass(), "relationship", enum138);
        setDoubleField(term53466, term53466.getClass(), "value", 0.9276995636844321);
        ArrayList term53457 = new ArrayList();
        ((ArrayList) term53457).add(term53459);
        ((ArrayList) term53457).add(term53461);
        ((ArrayList) term53457).add(term53462);
        ((ArrayList) term53457).add(term53464);
        ((ArrayList) term53457).add(term53465);
        ((ArrayList) term53457).add(term53466);
        term53455 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term53456 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term53456, term53456.getClass(), "coefficients", null);
        setDoubleField(term53456, term53456.getClass(), "constantTerm", 0.6428742553484879);
        setField(term53455, term53455.getClass(), "f", term53456);
        setField(term53455, term53455.getClass(), "constraints", term53457);
        setBooleanField(term53455, term53455.getClass(), "restrictToNonNegative", true);
        setField(term53455, term53455.getClass(), "tableau", null);
        setIntField(term53455, term53455.getClass(), "numDecisionVariables", -112921587);
        setIntField(term53455, term53455.getClass(), "numSlackVariables", 933028652);
        setIntField(term53455, term53455.getClass(), "numArtificialVariables", 287287233);
        setDoubleField(term53455, term53455.getClass(), "epsilon", 0.7636130748477434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNegativeDecisionVariableOffset", argTypes, term13882, args);
        assertTrue(recursiveEquals(term13882, term53455));
        assertTrue(recursiveEquals(retValue, -112921585));
    }

};


