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

public class SimplexTableau_divideRow_119387358946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7029;
     Object term7098;
     Object term7100;

    public SimplexTableau_divideRow_119387358946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39250 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term39249 = ((Class) term39250).getDeclaredField((String) "LEQ");
        ((Field) term39249).setAccessible(true);
        Object enum90 = ((Field) term39249).get((Object) null);
        Object term7034 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7034, term7034.getClass(), "coefficients", null);
        setField(term7034, term7034.getClass(), "relationship", enum90);
        setDoubleField(term7034, term7034.getClass(), "value", 0.32554480512985284);
        Class<? extends Object> term39546 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term39545 = ((Class) term39546).getDeclaredField((String) "GEQ");
        ((Field) term39545).setAccessible(true);
        Object enum91 = ((Field) term39545).get((Object) null);
        Object term7038 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7038, term7038.getClass(), "coefficients", null);
        setField(term7038, term7038.getClass(), "relationship", enum91);
        setDoubleField(term7038, term7038.getClass(), "value", 0.8924855581421237);
        Class<? extends Object> term39842 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term39841 = ((Class) term39842).getDeclaredField((String) "GEQ");
        ((Field) term39841).setAccessible(true);
        Object enum92 = ((Field) term39841).get((Object) null);
        Object term7042 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7042, term7042.getClass(), "coefficients", null);
        setField(term7042, term7042.getClass(), "relationship", enum92);
        setDoubleField(term7042, term7042.getClass(), "value", 0.32237559209193944);
        Object term7046 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7046, term7046.getClass(), "coefficients", null);
        setField(term7046, term7046.getClass(), "relationship", enum90);
        setDoubleField(term7046, term7046.getClass(), "value", 0.53094494792755);
        Object term7048 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7048, term7048.getClass(), "coefficients", null);
        setField(term7048, term7048.getClass(), "relationship", enum91);
        setDoubleField(term7048, term7048.getClass(), "value", 0.146431486357265);
        ArrayList term7032 = new ArrayList();
        ((ArrayList) term7032).add(term7034);
        ((ArrayList) term7032).add(term7038);
        ((ArrayList) term7032).add(term7042);
        ((ArrayList) term7032).add(term7046);
        ((ArrayList) term7032).add(term7048);
        ArrayList term7053 = new ArrayList();
        ((ArrayList) term7053).add("UlajhuVLaP");
        ((ArrayList) term7053).add("gGSMzuGICf");
        ((ArrayList) term7053).add("hxCBltsObl");
        term7029 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term7030 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term7030, term7030.getClass(), "coefficients", null);
        setDoubleField(term7030, term7030.getClass(), "constantTerm", 0.29874017652881824);
        setField(term7029, term7029.getClass(), "f", term7030);
        setField(term7029, term7029.getClass(), "constraints", term7032);
        setBooleanField(term7029, term7029.getClass(), "restrictToNonNegative", false);
        setField(term7029, term7029.getClass(), "columnLabels", term7053);
        setField(term7029, term7029.getClass(), "tableau", null);
        setIntField(term7029, term7029.getClass(), "numDecisionVariables", 767834723);
        setIntField(term7029, term7029.getClass(), "numSlackVariables", -602026508);
        setIntField(term7029, term7029.getClass(), "numArtificialVariables", -157887805);
        setDoubleField(term7029, term7029.getClass(), "epsilon", 0.24259014218848696);
        setIntField(term7029, term7029.getClass(), "maxUlps", 1876565163);
        term7098 = new Integer(-817164822);
        term7100 = new Double(0.1544348383112728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term7098;
        args[1] = term7100;
        try {
            callMethod(klass, "divideRow", argTypes, term7029, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


