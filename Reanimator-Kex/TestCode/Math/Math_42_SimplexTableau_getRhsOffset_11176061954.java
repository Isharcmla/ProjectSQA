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

public class SimplexTableau_getRhsOffset_11176061954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11973;

    public SimplexTableau_getRhsOffset_11176061954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46943 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term46942 = ((Class) term46943).getDeclaredField((String) "EQ");
        ((Field) term46942).setAccessible(true);
        Object enum107 = ((Field) term46942).get((Object) null);
        Object term11978 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11978, term11978.getClass(), "coefficients", null);
        setField(term11978, term11978.getClass(), "relationship", enum107);
        setDoubleField(term11978, term11978.getClass(), "value", 0.19625398866403143);
        Object term11982 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11982, term11982.getClass(), "coefficients", null);
        setField(term11982, term11982.getClass(), "relationship", enum107);
        setDoubleField(term11982, term11982.getClass(), "value", 0.45069204793711093);
        Object term11984 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11984, term11984.getClass(), "coefficients", null);
        setField(term11984, term11984.getClass(), "relationship", enum107);
        setDoubleField(term11984, term11984.getClass(), "value", 0.9341364461850963);
        Class<? extends Object> term47236 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47235 = ((Class) term47236).getDeclaredField((String) "LEQ");
        ((Field) term47235).setAccessible(true);
        Object enum108 = ((Field) term47235).get((Object) null);
        Object term11986 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11986, term11986.getClass(), "coefficients", null);
        setField(term11986, term11986.getClass(), "relationship", enum108);
        setDoubleField(term11986, term11986.getClass(), "value", 0.9022041121474429);
        Object term11990 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11990, term11990.getClass(), "coefficients", null);
        setField(term11990, term11990.getClass(), "relationship", enum108);
        setDoubleField(term11990, term11990.getClass(), "value", 0.6512870939318848);
        Class<? extends Object> term47532 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47531 = ((Class) term47532).getDeclaredField((String) "GEQ");
        ((Field) term47531).setAccessible(true);
        Object enum109 = ((Field) term47531).get((Object) null);
        Object term11992 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11992, term11992.getClass(), "coefficients", null);
        setField(term11992, term11992.getClass(), "relationship", enum109);
        setDoubleField(term11992, term11992.getClass(), "value", 0.8777038609128434);
        Object term11996 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11996, term11996.getClass(), "coefficients", null);
        setField(term11996, term11996.getClass(), "relationship", enum107);
        setDoubleField(term11996, term11996.getClass(), "value", 0.008025683154629148);
        ArrayList term11976 = new ArrayList();
        ((ArrayList) term11976).add(term11978);
        ((ArrayList) term11976).add(term11982);
        ((ArrayList) term11976).add(term11984);
        ((ArrayList) term11976).add(term11986);
        ((ArrayList) term11976).add(term11990);
        ((ArrayList) term11976).add(term11992);
        ((ArrayList) term11976).add(term11996);
        ArrayList term12001 = new ArrayList();
        ((ArrayList) term12001).add("TJmVBGfTML");
        ((ArrayList) term12001).add("tPlsykYBqO");
        term11973 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term11974 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term11974, term11974.getClass(), "coefficients", null);
        setDoubleField(term11974, term11974.getClass(), "constantTerm", 0.34010089048558567);
        setField(term11973, term11973.getClass(), "f", term11974);
        setField(term11973, term11973.getClass(), "constraints", term11976);
        setBooleanField(term11973, term11973.getClass(), "restrictToNonNegative", true);
        setField(term11973, term11973.getClass(), "columnLabels", term12001);
        setField(term11973, term11973.getClass(), "tableau", null);
        setIntField(term11973, term11973.getClass(), "numDecisionVariables", -2027534003);
        setIntField(term11973, term11973.getClass(), "numSlackVariables", 1063420942);
        setIntField(term11973, term11973.getClass(), "numArtificialVariables", 1375330971);
        setDoubleField(term11973, term11973.getClass(), "epsilon", 0.40598298281353484);
        setIntField(term11973, term11973.getClass(), "maxUlps", -478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRhsOffset", argTypes, term11973, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


