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

public class SimplexTableau_getWidth_111858425546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7144;

    public SimplexTableau_getWidth_111858425546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40394 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term40393 = ((Class) term40394).getDeclaredField((String) "EQ");
        ((Field) term40393).setAccessible(true);
        Object enum100 = ((Field) term40393).get((Object) null);
        Object term7149 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7149, term7149.getClass(), "coefficients", null);
        setField(term7149, term7149.getClass(), "relationship", enum100);
        setDoubleField(term7149, term7149.getClass(), "value", 0.32237559209193944);
        Class<? extends Object> term40687 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term40686 = ((Class) term40687).getDeclaredField((String) "GEQ");
        ((Field) term40686).setAccessible(true);
        Object enum101 = ((Field) term40686).get((Object) null);
        Object term7153 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7153, term7153.getClass(), "coefficients", null);
        setField(term7153, term7153.getClass(), "relationship", enum101);
        setDoubleField(term7153, term7153.getClass(), "value", 0.53094494792755);
        Object term7157 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7157, term7157.getClass(), "coefficients", null);
        setField(term7157, term7157.getClass(), "relationship", enum101);
        setDoubleField(term7157, term7157.getClass(), "value", 0.146431486357265);
        Object term7159 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7159, term7159.getClass(), "coefficients", null);
        setField(term7159, term7159.getClass(), "relationship", enum101);
        setDoubleField(term7159, term7159.getClass(), "value", 0.24259014218848696);
        Object term7161 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7161, term7161.getClass(), "coefficients", null);
        setField(term7161, term7161.getClass(), "relationship", enum100);
        setDoubleField(term7161, term7161.getClass(), "value", 0.1544348383112728);
        ArrayList term7147 = new ArrayList();
        ((ArrayList) term7147).add(term7149);
        ((ArrayList) term7147).add(term7153);
        ((ArrayList) term7147).add(term7157);
        ((ArrayList) term7147).add(term7159);
        ((ArrayList) term7147).add(term7161);
        term7144 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term7145 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term7145, term7145.getClass(), "coefficients", null);
        setDoubleField(term7145, term7145.getClass(), "constantTerm", 0.8924855581421237);
        setField(term7144, term7144.getClass(), "f", term7145);
        setField(term7144, term7144.getClass(), "constraints", term7147);
        setBooleanField(term7144, term7144.getClass(), "restrictToNonNegative", false);
        setField(term7144, term7144.getClass(), "tableau", null);
        setIntField(term7144, term7144.getClass(), "numDecisionVariables", 767834723);
        setIntField(term7144, term7144.getClass(), "numSlackVariables", -602026508);
        setIntField(term7144, term7144.getClass(), "numArtificialVariables", -157887805);
        setDoubleField(term7144, term7144.getClass(), "epsilon", 0.5187846213101265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getWidth", argTypes, term7144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


