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

public class SimplexTableau_getBasicRow_207323804041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3169;
     Object term3216;

    public SimplexTableau_getBasicRow_207323804041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34711 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term34710 = ((Class) term34711).getDeclaredField((String) "LEQ");
        ((Field) term34710).setAccessible(true);
        Object enum72 = ((Field) term34710).get((Object) null);
        Object term3174 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3174, term3174.getClass(), "coefficients", null);
        setField(term3174, term3174.getClass(), "relationship", enum72);
        setDoubleField(term3174, term3174.getClass(), "value", 0.6300849762307866);
        Object term3178 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3178, term3178.getClass(), "coefficients", null);
        setField(term3178, term3178.getClass(), "relationship", enum72);
        setDoubleField(term3178, term3178.getClass(), "value", 0.9737083944266686);
        Class<? extends Object> term35012 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term35011 = ((Class) term35012).getDeclaredField((String) "LEQ");
        ((Field) term35011).setAccessible(true);
        Object enum73 = ((Field) term35011).get((Object) null);
        Object term3180 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3180, term3180.getClass(), "coefficients", null);
        setField(term3180, term3180.getClass(), "relationship", enum73);
        setDoubleField(term3180, term3180.getClass(), "value", 0.0668892744806211);
        Object term3184 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3184, term3184.getClass(), "coefficients", null);
        setField(term3184, term3184.getClass(), "relationship", enum73);
        setDoubleField(term3184, term3184.getClass(), "value", 0.3587267442738795);
        Object term3186 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3186, term3186.getClass(), "coefficients", null);
        setField(term3186, term3186.getClass(), "relationship", enum72);
        setDoubleField(term3186, term3186.getClass(), "value", 0.07802449704920456);
        Object term3188 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3188, term3188.getClass(), "coefficients", null);
        setField(term3188, term3188.getClass(), "relationship", enum72);
        setDoubleField(term3188, term3188.getClass(), "value", 0.5279279537140873);
        Object term3190 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3190, term3190.getClass(), "coefficients", null);
        setField(term3190, term3190.getClass(), "relationship", enum73);
        setDoubleField(term3190, term3190.getClass(), "value", 0.3202192021706908);
        ArrayList term3172 = new ArrayList();
        ((ArrayList) term3172).add(term3174);
        ((ArrayList) term3172).add(term3178);
        ((ArrayList) term3172).add(term3180);
        ((ArrayList) term3172).add(term3184);
        ((ArrayList) term3172).add(term3186);
        ((ArrayList) term3172).add(term3188);
        ((ArrayList) term3172).add(term3190);
        ArrayList term3195 = new ArrayList();
        ((ArrayList) term3195).add("hNxWaHcfhY");
        term3169 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term3170 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term3170, term3170.getClass(), "coefficients", null);
        setDoubleField(term3170, term3170.getClass(), "constantTerm", 0.2852810965221698);
        setField(term3169, term3169.getClass(), "f", term3170);
        setField(term3169, term3169.getClass(), "constraints", term3172);
        setBooleanField(term3169, term3169.getClass(), "restrictToNonNegative", true);
        setField(term3169, term3169.getClass(), "columnLabels", term3195);
        setField(term3169, term3169.getClass(), "tableau", null);
        setIntField(term3169, term3169.getClass(), "numDecisionVariables", -1007160944);
        setIntField(term3169, term3169.getClass(), "numSlackVariables", 1135664017);
        setIntField(term3169, term3169.getClass(), "numArtificialVariables", 590364439);
        setDoubleField(term3169, term3169.getClass(), "epsilon", 0.22651340641904605);
        setIntField(term3169, term3169.getClass(), "maxUlps", 865208305);
        term3216 = new Integer(-1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3216;
        try {
            callMethod(klass, "getBasicRow", argTypes, term3169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


