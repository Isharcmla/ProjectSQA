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
import java.lang.Double;

public class SimplexTableau_divideRow_119387358949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7130;
     Object term7156;
     Object term7158;

    public SimplexTableau_divideRow_119387358949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43873 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term43872 = ((Class) term43873).getDeclaredField((String) "LEQ");
        ((Field) term43872).setAccessible(true);
        Object enum107 = ((Field) term43872).get((Object) null);
        Object term7135 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7135, term7135.getClass(), "coefficients", null);
        setField(term7135, term7135.getClass(), "relationship", enum107);
        setDoubleField(term7135, term7135.getClass(), "value", 0.0027299293098262956);
        Class<? extends Object> term44169 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44168 = ((Class) term44169).getDeclaredField((String) "LEQ");
        ((Field) term44168).setAccessible(true);
        Object enum108 = ((Field) term44168).get((Object) null);
        Object term7139 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7139, term7139.getClass(), "coefficients", null);
        setField(term7139, term7139.getClass(), "relationship", enum108);
        setDoubleField(term7139, term7139.getClass(), "value", 0.29874017652881824);
        Object term7143 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7143, term7143.getClass(), "coefficients", null);
        setField(term7143, term7143.getClass(), "relationship", enum108);
        setDoubleField(term7143, term7143.getClass(), "value", 0.32554480512985284);
        Object term7145 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7145, term7145.getClass(), "coefficients", null);
        setField(term7145, term7145.getClass(), "relationship", enum108);
        setDoubleField(term7145, term7145.getClass(), "value", 0.8924855581421237);
        Object term7147 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7147, term7147.getClass(), "coefficients", null);
        setField(term7147, term7147.getClass(), "relationship", enum107);
        setDoubleField(term7147, term7147.getClass(), "value", 0.32237559209193944);
        ArrayList term7133 = new ArrayList();
        ((ArrayList) term7133).add(term7135);
        ((ArrayList) term7133).add(term7139);
        ((ArrayList) term7133).add(term7143);
        ((ArrayList) term7133).add(term7145);
        ((ArrayList) term7133).add(term7147);
        term7130 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term7131 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term7131, term7131.getClass(), "coefficients", null);
        setDoubleField(term7131, term7131.getClass(), "constantTerm", 0.426231085465289);
        setField(term7130, term7130.getClass(), "f", term7131);
        setField(term7130, term7130.getClass(), "constraints", term7133);
        setBooleanField(term7130, term7130.getClass(), "restrictToNonNegative", false);
        setField(term7130, term7130.getClass(), "tableau", null);
        setIntField(term7130, term7130.getClass(), "numDecisionVariables", 1962444399);
        setIntField(term7130, term7130.getClass(), "numSlackVariables", 767834723);
        setIntField(term7130, term7130.getClass(), "numArtificialVariables", -602026508);
        setDoubleField(term7130, term7130.getClass(), "epsilon", 0.53094494792755);
        term7156 = new Integer(-157887805);
        term7158 = new Double(0.146431486357265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term7156;
        args[1] = term7158;
        try {
            callMethod(klass, "divideRow", argTypes, term7130, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


