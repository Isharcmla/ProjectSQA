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
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getWidth_111858425551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8678;

    public SimplexTableau_getWidth_111858425551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45849 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45848 = ((Class) term45849).getDeclaredField((String) "LEQ");
        ((Field) term45848).setAccessible(true);
        Object enum112 = ((Field) term45848).get((Object) null);
        Object term8683 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8683, term8683.getClass(), "coefficients", null);
        setField(term8683, term8683.getClass(), "relationship", enum112);
        setDoubleField(term8683, term8683.getClass(), "value", 0.5617009352394552);
        Class<? extends Object> term46145 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term46144 = ((Class) term46145).getDeclaredField((String) "EQ");
        ((Field) term46144).setAccessible(true);
        Object enum113 = ((Field) term46144).get((Object) null);
        Object term8687 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8687, term8687.getClass(), "coefficients", null);
        setField(term8687, term8687.getClass(), "relationship", enum113);
        setDoubleField(term8687, term8687.getClass(), "value", 0.09067063848644474);
        Class<? extends Object> term46438 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term46437 = ((Class) term46438).getDeclaredField((String) "LEQ");
        ((Field) term46437).setAccessible(true);
        Object enum114 = ((Field) term46437).get((Object) null);
        Object term8691 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8691, term8691.getClass(), "coefficients", null);
        setField(term8691, term8691.getClass(), "relationship", enum114);
        setDoubleField(term8691, term8691.getClass(), "value", 0.268304014379393);
        Object term8695 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8695, term8695.getClass(), "coefficients", null);
        setField(term8695, term8695.getClass(), "relationship", enum112);
        setDoubleField(term8695, term8695.getClass(), "value", 0.7171972879282721);
        Object term8697 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8697, term8697.getClass(), "coefficients", null);
        setField(term8697, term8697.getClass(), "relationship", enum112);
        setDoubleField(term8697, term8697.getClass(), "value", 0.9006361024877096);
        Object term8699 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8699, term8699.getClass(), "coefficients", null);
        setField(term8699, term8699.getClass(), "relationship", enum114);
        setDoubleField(term8699, term8699.getClass(), "value", 0.5644914462415626);
        Object term8701 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8701, term8701.getClass(), "coefficients", null);
        setField(term8701, term8701.getClass(), "relationship", enum114);
        setDoubleField(term8701, term8701.getClass(), "value", 0.509895859167191);
        ArrayList term8681 = new ArrayList();
        ((ArrayList) term8681).add(term8683);
        ((ArrayList) term8681).add(term8687);
        ((ArrayList) term8681).add(term8691);
        ((ArrayList) term8681).add(term8695);
        ((ArrayList) term8681).add(term8697);
        ((ArrayList) term8681).add(term8699);
        ((ArrayList) term8681).add(term8701);
        term8678 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term8679 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term8679, term8679.getClass(), "coefficients", null);
        setDoubleField(term8679, term8679.getClass(), "constantTerm", 0.11577948268926874);
        setField(term8678, term8678.getClass(), "f", term8679);
        setField(term8678, term8678.getClass(), "constraints", term8681);
        setBooleanField(term8678, term8678.getClass(), "restrictToNonNegative", true);
        setField(term8678, term8678.getClass(), "tableau", null);
        setIntField(term8678, term8678.getClass(), "numDecisionVariables", -14890619);
        setIntField(term8678, term8678.getClass(), "numSlackVariables", 1632125673);
        setIntField(term8678, term8678.getClass(), "numArtificialVariables", 454281060);
        setDoubleField(term8678, term8678.getClass(), "epsilon", 0.07417792024383196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getWidth", argTypes, term8678, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


