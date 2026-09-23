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

public class SimplexTableau_divideRow_36310438246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7129;
     Object term7198;
     Object term7200;

    public SimplexTableau_divideRow_36310438246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40988 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term40987 = ((Class) term40988).getDeclaredField((String) "LEQ");
        ((Field) term40987).setAccessible(true);
        Object enum88 = ((Field) term40987).get((Object) null);
        Object term7134 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term7134, term7134.getClass(), "coefficients", null);
        setField(term7134, term7134.getClass(), "relationship", enum88);
        setDoubleField(term7134, term7134.getClass(), "value", 0.32554480512985284);
        Class<? extends Object> term41289 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term41288 = ((Class) term41289).getDeclaredField((String) "GEQ");
        ((Field) term41288).setAccessible(true);
        Object enum89 = ((Field) term41288).get((Object) null);
        Object term7138 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term7138, term7138.getClass(), "coefficients", null);
        setField(term7138, term7138.getClass(), "relationship", enum89);
        setDoubleField(term7138, term7138.getClass(), "value", 0.8924855581421237);
        Class<? extends Object> term41590 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term41589 = ((Class) term41590).getDeclaredField((String) "GEQ");
        ((Field) term41589).setAccessible(true);
        Object enum90 = ((Field) term41589).get((Object) null);
        Object term7142 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term7142, term7142.getClass(), "coefficients", null);
        setField(term7142, term7142.getClass(), "relationship", enum90);
        setDoubleField(term7142, term7142.getClass(), "value", 0.32237559209193944);
        Object term7146 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term7146, term7146.getClass(), "coefficients", null);
        setField(term7146, term7146.getClass(), "relationship", enum88);
        setDoubleField(term7146, term7146.getClass(), "value", 0.53094494792755);
        Object term7148 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term7148, term7148.getClass(), "coefficients", null);
        setField(term7148, term7148.getClass(), "relationship", enum89);
        setDoubleField(term7148, term7148.getClass(), "value", 0.146431486357265);
        ArrayList term7132 = new ArrayList();
        ((ArrayList) term7132).add(term7134);
        ((ArrayList) term7132).add(term7138);
        ((ArrayList) term7132).add(term7142);
        ((ArrayList) term7132).add(term7146);
        ((ArrayList) term7132).add(term7148);
        ArrayList term7153 = new ArrayList();
        ((ArrayList) term7153).add("UlajhuVLaP");
        ((ArrayList) term7153).add("gGSMzuGICf");
        ((ArrayList) term7153).add("hxCBltsObl");
        term7129 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term7130 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term7130, term7130.getClass(), "coefficients", null);
        setDoubleField(term7130, term7130.getClass(), "constantTerm", 0.29874017652881824);
        setField(term7129, term7129.getClass(), "f", term7130);
        setField(term7129, term7129.getClass(), "constraints", term7132);
        setBooleanField(term7129, term7129.getClass(), "restrictToNonNegative", false);
        setField(term7129, term7129.getClass(), "columnLabels", term7153);
        setField(term7129, term7129.getClass(), "tableau", null);
        setIntField(term7129, term7129.getClass(), "numDecisionVariables", 767834723);
        setIntField(term7129, term7129.getClass(), "numSlackVariables", -602026508);
        setIntField(term7129, term7129.getClass(), "numArtificialVariables", -157887805);
        setDoubleField(term7129, term7129.getClass(), "epsilon", 0.24259014218848696);
        setIntField(term7129, term7129.getClass(), "maxUlps", 1876565163);
        term7198 = new Integer(-817164822);
        term7200 = new Double(0.1544348383112728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term7198;
        args[1] = term7200;
        try {
            callMethod(klass, "divideRow", argTypes, term7129, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


