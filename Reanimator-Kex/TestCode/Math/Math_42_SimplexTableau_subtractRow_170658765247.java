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

public class SimplexTableau_subtractRow_170658765247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8017;
     Object term8038;
     Object term8040;
     Object term8042;

    public SimplexTableau_subtractRow_170658765247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40416 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term40415 = ((Class) term40416).getDeclaredField((String) "GEQ");
        ((Field) term40415).setAccessible(true);
        Object enum93 = ((Field) term40415).get((Object) null);
        Object term8022 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8022, term8022.getClass(), "coefficients", null);
        setField(term8022, term8022.getClass(), "relationship", enum93);
        setDoubleField(term8022, term8022.getClass(), "value", 0.045893173090043815);
        ArrayList term8020 = new ArrayList();
        ((ArrayList) term8020).add(term8022);
        ArrayList term8029 = new ArrayList();
        term8017 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term8018 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term8018, term8018.getClass(), "coefficients", null);
        setDoubleField(term8018, term8018.getClass(), "constantTerm", 0.5187846213101265);
        setField(term8017, term8017.getClass(), "f", term8018);
        setField(term8017, term8017.getClass(), "constraints", term8020);
        setBooleanField(term8017, term8017.getClass(), "restrictToNonNegative", true);
        setField(term8017, term8017.getClass(), "columnLabels", term8029);
        setField(term8017, term8017.getClass(), "tableau", null);
        setIntField(term8017, term8017.getClass(), "numDecisionVariables", -1016503459);
        setIntField(term8017, term8017.getClass(), "numSlackVariables", -1968847291);
        setIntField(term8017, term8017.getClass(), "numArtificialVariables", 579005622);
        setDoubleField(term8017, term8017.getClass(), "epsilon", 0.3626177854778667);
        setIntField(term8017, term8017.getClass(), "maxUlps", -14890619);
        term8038 = new Integer(1632125673);
        term8040 = new Integer(454281060);
        term8042 = new Double(0.3163771663728089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term8038;
        args[1] = term8040;
        args[2] = term8042;
        try {
            callMethod(klass, "subtractRow", argTypes, term8017, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


