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

public class SimplexTableau_getRhsOffset_71900858854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12143;

    public SimplexTableau_getRhsOffset_71900858854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48082 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term48081 = ((Class) term48082).getDeclaredField((String) "EQ");
        ((Field) term48081).setAccessible(true);
        Object enum105 = ((Field) term48081).get((Object) null);
        Object term12148 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term12148, term12148.getClass(), "coefficients", null);
        setField(term12148, term12148.getClass(), "relationship", enum105);
        setDoubleField(term12148, term12148.getClass(), "value", 0.19625398866403143);
        Object term12152 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term12152, term12152.getClass(), "coefficients", null);
        setField(term12152, term12152.getClass(), "relationship", enum105);
        setDoubleField(term12152, term12152.getClass(), "value", 0.45069204793711093);
        Object term12154 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term12154, term12154.getClass(), "coefficients", null);
        setField(term12154, term12154.getClass(), "relationship", enum105);
        setDoubleField(term12154, term12154.getClass(), "value", 0.9341364461850963);
        Class<? extends Object> term48380 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term48379 = ((Class) term48380).getDeclaredField((String) "LEQ");
        ((Field) term48379).setAccessible(true);
        Object enum106 = ((Field) term48379).get((Object) null);
        Object term12156 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term12156, term12156.getClass(), "coefficients", null);
        setField(term12156, term12156.getClass(), "relationship", enum106);
        setDoubleField(term12156, term12156.getClass(), "value", 0.9022041121474429);
        Object term12160 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term12160, term12160.getClass(), "coefficients", null);
        setField(term12160, term12160.getClass(), "relationship", enum106);
        setDoubleField(term12160, term12160.getClass(), "value", 0.6512870939318848);
        Class<? extends Object> term48681 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term48680 = ((Class) term48681).getDeclaredField((String) "GEQ");
        ((Field) term48680).setAccessible(true);
        Object enum107 = ((Field) term48680).get((Object) null);
        Object term12162 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term12162, term12162.getClass(), "coefficients", null);
        setField(term12162, term12162.getClass(), "relationship", enum107);
        setDoubleField(term12162, term12162.getClass(), "value", 0.8777038609128434);
        Object term12166 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term12166, term12166.getClass(), "coefficients", null);
        setField(term12166, term12166.getClass(), "relationship", enum105);
        setDoubleField(term12166, term12166.getClass(), "value", 0.008025683154629148);
        ArrayList term12146 = new ArrayList();
        ((ArrayList) term12146).add(term12148);
        ((ArrayList) term12146).add(term12152);
        ((ArrayList) term12146).add(term12154);
        ((ArrayList) term12146).add(term12156);
        ((ArrayList) term12146).add(term12160);
        ((ArrayList) term12146).add(term12162);
        ((ArrayList) term12146).add(term12166);
        ArrayList term12171 = new ArrayList();
        ((ArrayList) term12171).add("TJmVBGfTML");
        ((ArrayList) term12171).add("tPlsykYBqO");
        term12143 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term12144 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term12144, term12144.getClass(), "coefficients", null);
        setDoubleField(term12144, term12144.getClass(), "constantTerm", 0.34010089048558567);
        setField(term12143, term12143.getClass(), "f", term12144);
        setField(term12143, term12143.getClass(), "constraints", term12146);
        setBooleanField(term12143, term12143.getClass(), "restrictToNonNegative", true);
        setField(term12143, term12143.getClass(), "columnLabels", term12171);
        setField(term12143, term12143.getClass(), "tableau", null);
        setIntField(term12143, term12143.getClass(), "numDecisionVariables", -2027534003);
        setIntField(term12143, term12143.getClass(), "numSlackVariables", 1063420942);
        setIntField(term12143, term12143.getClass(), "numArtificialVariables", 1375330971);
        setDoubleField(term12143, term12143.getClass(), "epsilon", 0.40598298281353484);
        setIntField(term12143, term12143.getClass(), "maxUlps", -478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRhsOffset", argTypes, term12143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


