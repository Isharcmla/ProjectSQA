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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_hashCode_17060539761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17739;

    public SimplexTableau_hashCode_17060539761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56144 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term56143 = ((Class) term56144).getDeclaredField((String) "EQ");
        ((Field) term56143).setAccessible(true);
        Object enum127 = ((Field) term56143).get((Object) null);
        Object term17744 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term17744, term17744.getClass(), "coefficients", null);
        setField(term17744, term17744.getClass(), "relationship", enum127);
        setDoubleField(term17744, term17744.getClass(), "value", 0.5179319342588155);
        Class<? extends Object> term56442 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term56441 = ((Class) term56442).getDeclaredField((String) "EQ");
        ((Field) term56441).setAccessible(true);
        Object enum128 = ((Field) term56441).get((Object) null);
        Object term17748 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term17748, term17748.getClass(), "coefficients", null);
        setField(term17748, term17748.getClass(), "relationship", enum128);
        setDoubleField(term17748, term17748.getClass(), "value", 0.25025774487844066);
        Object term17752 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term17752, term17752.getClass(), "coefficients", null);
        setField(term17752, term17752.getClass(), "relationship", enum127);
        setDoubleField(term17752, term17752.getClass(), "value", 0.1858089882752998);
        Object term17754 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term17754, term17754.getClass(), "coefficients", null);
        setField(term17754, term17754.getClass(), "relationship", enum127);
        setDoubleField(term17754, term17754.getClass(), "value", 0.2440697646709713);
        Object term17756 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term17756, term17756.getClass(), "coefficients", null);
        setField(term17756, term17756.getClass(), "relationship", enum128);
        setDoubleField(term17756, term17756.getClass(), "value", 0.7977455176064363);
        Object term17758 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term17758, term17758.getClass(), "coefficients", null);
        setField(term17758, term17758.getClass(), "relationship", enum128);
        setDoubleField(term17758, term17758.getClass(), "value", 0.5329919447422633);
        Object term17760 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term17760, term17760.getClass(), "coefficients", null);
        setField(term17760, term17760.getClass(), "relationship", enum128);
        setDoubleField(term17760, term17760.getClass(), "value", 0.7046974927834232);
        ArrayList term17742 = new ArrayList();
        ((ArrayList) term17742).add(term17744);
        ((ArrayList) term17742).add(term17748);
        ((ArrayList) term17742).add(term17752);
        ((ArrayList) term17742).add(term17754);
        ((ArrayList) term17742).add(term17756);
        ((ArrayList) term17742).add(term17758);
        ((ArrayList) term17742).add(term17760);
        ArrayList term17765 = new ArrayList();
        term17739 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term17740 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term17740, term17740.getClass(), "coefficients", null);
        setDoubleField(term17740, term17740.getClass(), "constantTerm", 0.9485929668765458);
        setField(term17739, term17739.getClass(), "f", term17740);
        setField(term17739, term17739.getClass(), "constraints", term17742);
        setBooleanField(term17739, term17739.getClass(), "restrictToNonNegative", false);
        setField(term17739, term17739.getClass(), "columnLabels", term17765);
        setField(term17739, term17739.getClass(), "tableau", null);
        setIntField(term17739, term17739.getClass(), "numDecisionVariables", -268815336);
        setIntField(term17739, term17739.getClass(), "numSlackVariables", -1210583429);
        setIntField(term17739, term17739.getClass(), "numArtificialVariables", -663691365);
        setDoubleField(term17739, term17739.getClass(), "epsilon", 0.6896952303224777);
        setIntField(term17739, term17739.getClass(), "maxUlps", 339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term17739, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


