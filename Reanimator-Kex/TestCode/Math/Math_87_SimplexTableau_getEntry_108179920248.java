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
import java.lang.Integer;

public class SimplexTableau_getEntry_108179920248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8682;
     Object term8714;
     Object term8716;

    public SimplexTableau_getEntry_108179920248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42364 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term42363 = ((Class) term42364).getDeclaredField((String) "EQ");
        ((Field) term42363).setAccessible(true);
        Object enum105 = ((Field) term42363).get((Object) null);
        Object term8687 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8687, term8687.getClass(), "coefficients", null);
        setField(term8687, term8687.getClass(), "relationship", enum105);
        setDoubleField(term8687, term8687.getClass(), "value", 0.268304014379393);
        Class<? extends Object> term42657 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term42656 = ((Class) term42657).getDeclaredField((String) "LEQ");
        ((Field) term42656).setAccessible(true);
        Object enum106 = ((Field) term42656).get((Object) null);
        Object term8691 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8691, term8691.getClass(), "coefficients", null);
        setField(term8691, term8691.getClass(), "relationship", enum106);
        setDoubleField(term8691, term8691.getClass(), "value", 0.7171972879282721);
        Class<? extends Object> term42953 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term42952 = ((Class) term42953).getDeclaredField((String) "GEQ");
        ((Field) term42952).setAccessible(true);
        Object enum107 = ((Field) term42952).get((Object) null);
        Object term8695 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8695, term8695.getClass(), "coefficients", null);
        setField(term8695, term8695.getClass(), "relationship", enum107);
        setDoubleField(term8695, term8695.getClass(), "value", 0.9006361024877096);
        Object term8699 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8699, term8699.getClass(), "coefficients", null);
        setField(term8699, term8699.getClass(), "relationship", enum105);
        setDoubleField(term8699, term8699.getClass(), "value", 0.5644914462415626);
        Object term8701 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8701, term8701.getClass(), "coefficients", null);
        setField(term8701, term8701.getClass(), "relationship", enum105);
        setDoubleField(term8701, term8701.getClass(), "value", 0.509895859167191);
        Object term8703 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8703, term8703.getClass(), "coefficients", null);
        setField(term8703, term8703.getClass(), "relationship", enum107);
        setDoubleField(term8703, term8703.getClass(), "value", 0.07417792024383196);
        Object term8705 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8705, term8705.getClass(), "coefficients", null);
        setField(term8705, term8705.getClass(), "relationship", enum107);
        setDoubleField(term8705, term8705.getClass(), "value", 0.686293604788188);
        ArrayList term8685 = new ArrayList();
        ((ArrayList) term8685).add(term8687);
        ((ArrayList) term8685).add(term8691);
        ((ArrayList) term8685).add(term8695);
        ((ArrayList) term8685).add(term8699);
        ((ArrayList) term8685).add(term8701);
        ((ArrayList) term8685).add(term8703);
        ((ArrayList) term8685).add(term8705);
        term8682 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term8683 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term8683, term8683.getClass(), "coefficients", null);
        setDoubleField(term8683, term8683.getClass(), "constantTerm", 0.09067063848644474);
        setField(term8682, term8682.getClass(), "f", term8683);
        setField(term8682, term8682.getClass(), "constraints", term8685);
        setBooleanField(term8682, term8682.getClass(), "restrictToNonNegative", true);
        setField(term8682, term8682.getClass(), "tableau", null);
        setIntField(term8682, term8682.getClass(), "numDecisionVariables", -1968847291);
        setIntField(term8682, term8682.getClass(), "numSlackVariables", 579005622);
        setIntField(term8682, term8682.getClass(), "numArtificialVariables", -14890619);
        setDoubleField(term8682, term8682.getClass(), "epsilon", 0.12764449157430724);
        term8714 = new Integer(1632125673);
        term8716 = new Integer(454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8714;
        args[1] = term8716;
        try {
            callMethod(klass, "getEntry", argTypes, term8682, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


