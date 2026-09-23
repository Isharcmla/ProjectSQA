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
import java.lang.Integer;
import java.lang.Double;

public class SimplexTableau_subtractRow_175761043747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8132;
     Object term8153;
     Object term8155;
     Object term8157;

    public SimplexTableau_subtractRow_175761043747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42169 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term42168 = ((Class) term42169).getDeclaredField((String) "GEQ");
        ((Field) term42168).setAccessible(true);
        Object enum91 = ((Field) term42168).get((Object) null);
        Object term8137 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8137, term8137.getClass(), "coefficients", null);
        setField(term8137, term8137.getClass(), "relationship", enum91);
        setDoubleField(term8137, term8137.getClass(), "value", 0.045893173090043815);
        ArrayList term8135 = new ArrayList();
        ((ArrayList) term8135).add(term8137);
        ArrayList term8144 = new ArrayList();
        term8132 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term8133 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term8133, term8133.getClass(), "coefficients", null);
        setDoubleField(term8133, term8133.getClass(), "constantTerm", 0.5187846213101265);
        setField(term8132, term8132.getClass(), "f", term8133);
        setField(term8132, term8132.getClass(), "constraints", term8135);
        setBooleanField(term8132, term8132.getClass(), "restrictToNonNegative", true);
        setField(term8132, term8132.getClass(), "columnLabels", term8144);
        setField(term8132, term8132.getClass(), "tableau", null);
        setIntField(term8132, term8132.getClass(), "numDecisionVariables", -1016503459);
        setIntField(term8132, term8132.getClass(), "numSlackVariables", -1968847291);
        setIntField(term8132, term8132.getClass(), "numArtificialVariables", 579005622);
        setDoubleField(term8132, term8132.getClass(), "epsilon", 0.3626177854778667);
        setIntField(term8132, term8132.getClass(), "maxUlps", -14890619);
        term8153 = new Integer(1632125673);
        term8155 = new Integer(454281060);
        term8157 = new Double(0.3163771663728089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term8153;
        args[1] = term8155;
        args[2] = term8157;
        try {
            callMethod(klass, "subtractRow", argTypes, term8132, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


