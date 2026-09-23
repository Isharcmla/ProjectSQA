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

public class SimplexTableau_hashCode_100137460461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17489;

    public SimplexTableau_hashCode_100137460461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54136 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term54135 = ((Class) term54136).getDeclaredField((String) "EQ");
        ((Field) term54135).setAccessible(true);
        Object enum129 = ((Field) term54135).get((Object) null);
        Object term17494 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17494, term17494.getClass(), "coefficients", null);
        setField(term17494, term17494.getClass(), "relationship", enum129);
        setDoubleField(term17494, term17494.getClass(), "value", 0.5179319342588155);
        Class<? extends Object> term54429 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term54428 = ((Class) term54429).getDeclaredField((String) "EQ");
        ((Field) term54428).setAccessible(true);
        Object enum130 = ((Field) term54428).get((Object) null);
        Object term17498 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17498, term17498.getClass(), "coefficients", null);
        setField(term17498, term17498.getClass(), "relationship", enum130);
        setDoubleField(term17498, term17498.getClass(), "value", 0.25025774487844066);
        Object term17502 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17502, term17502.getClass(), "coefficients", null);
        setField(term17502, term17502.getClass(), "relationship", enum129);
        setDoubleField(term17502, term17502.getClass(), "value", 0.1858089882752998);
        Object term17504 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17504, term17504.getClass(), "coefficients", null);
        setField(term17504, term17504.getClass(), "relationship", enum129);
        setDoubleField(term17504, term17504.getClass(), "value", 0.2440697646709713);
        Object term17506 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17506, term17506.getClass(), "coefficients", null);
        setField(term17506, term17506.getClass(), "relationship", enum130);
        setDoubleField(term17506, term17506.getClass(), "value", 0.7977455176064363);
        Object term17508 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17508, term17508.getClass(), "coefficients", null);
        setField(term17508, term17508.getClass(), "relationship", enum130);
        setDoubleField(term17508, term17508.getClass(), "value", 0.5329919447422633);
        Object term17510 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17510, term17510.getClass(), "coefficients", null);
        setField(term17510, term17510.getClass(), "relationship", enum130);
        setDoubleField(term17510, term17510.getClass(), "value", 0.7046974927834232);
        ArrayList term17492 = new ArrayList();
        ((ArrayList) term17492).add(term17494);
        ((ArrayList) term17492).add(term17498);
        ((ArrayList) term17492).add(term17502);
        ((ArrayList) term17492).add(term17504);
        ((ArrayList) term17492).add(term17506);
        ((ArrayList) term17492).add(term17508);
        ((ArrayList) term17492).add(term17510);
        ArrayList term17515 = new ArrayList();
        term17489 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term17490 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term17490, term17490.getClass(), "coefficients", null);
        setDoubleField(term17490, term17490.getClass(), "constantTerm", 0.9485929668765458);
        setField(term17489, term17489.getClass(), "f", term17490);
        setField(term17489, term17489.getClass(), "constraints", term17492);
        setBooleanField(term17489, term17489.getClass(), "restrictToNonNegative", false);
        setField(term17489, term17489.getClass(), "columnLabels", term17515);
        setField(term17489, term17489.getClass(), "tableau", null);
        setIntField(term17489, term17489.getClass(), "numDecisionVariables", -268815336);
        setIntField(term17489, term17489.getClass(), "numSlackVariables", -1210583429);
        setIntField(term17489, term17489.getClass(), "numArtificialVariables", -663691365);
        setDoubleField(term17489, term17489.getClass(), "epsilon", 0.6896952303224777);
        setIntField(term17489, term17489.getClass(), "maxUlps", 339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term17489, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


