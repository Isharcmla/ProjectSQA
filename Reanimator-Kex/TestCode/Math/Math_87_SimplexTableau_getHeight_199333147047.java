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

public class SimplexTableau_getHeight_199333147047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7762;

    public SimplexTableau_getHeight_199333147047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41231 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term41230 = ((Class) term41231).getDeclaredField((String) "EQ");
        ((Field) term41230).setAccessible(true);
        Object enum102 = ((Field) term41230).get((Object) null);
        Object term7767 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7767, term7767.getClass(), "coefficients", null);
        setField(term7767, term7767.getClass(), "relationship", enum102);
        setDoubleField(term7767, term7767.getClass(), "value", 0.3626177854778667);
        Object term7771 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7771, term7771.getClass(), "coefficients", null);
        setField(term7771, term7771.getClass(), "relationship", enum102);
        setDoubleField(term7771, term7771.getClass(), "value", 0.3163771663728089);
        Class<? extends Object> term41524 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term41523 = ((Class) term41524).getDeclaredField((String) "GEQ");
        ((Field) term41523).setAccessible(true);
        Object enum103 = ((Field) term41523).get((Object) null);
        Object term7773 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7773, term7773.getClass(), "coefficients", null);
        setField(term7773, term7773.getClass(), "relationship", enum103);
        setDoubleField(term7773, term7773.getClass(), "value", 0.8819646072665548);
        Class<? extends Object> term41820 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term41819 = ((Class) term41820).getDeclaredField((String) "LEQ");
        ((Field) term41819).setAccessible(true);
        Object enum104 = ((Field) term41819).get((Object) null);
        Object term7777 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7777, term7777.getClass(), "coefficients", null);
        setField(term7777, term7777.getClass(), "relationship", enum104);
        setDoubleField(term7777, term7777.getClass(), "value", 0.5412182593116958);
        Object term7781 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7781, term7781.getClass(), "coefficients", null);
        setField(term7781, term7781.getClass(), "relationship", enum102);
        setDoubleField(term7781, term7781.getClass(), "value", 0.16988691727397487);
        Object term7783 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7783, term7783.getClass(), "coefficients", null);
        setField(term7783, term7783.getClass(), "relationship", enum103);
        setDoubleField(term7783, term7783.getClass(), "value", 0.39286935532362843);
        Object term7785 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7785, term7785.getClass(), "coefficients", null);
        setField(term7785, term7785.getClass(), "relationship", enum104);
        setDoubleField(term7785, term7785.getClass(), "value", 0.11577948268926874);
        ArrayList term7765 = new ArrayList();
        ((ArrayList) term7765).add(term7767);
        ((ArrayList) term7765).add(term7771);
        ((ArrayList) term7765).add(term7773);
        ((ArrayList) term7765).add(term7777);
        ((ArrayList) term7765).add(term7781);
        ((ArrayList) term7765).add(term7783);
        ((ArrayList) term7765).add(term7785);
        term7762 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term7763 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term7763, term7763.getClass(), "coefficients", null);
        setDoubleField(term7763, term7763.getClass(), "constantTerm", 0.045893173090043815);
        setField(term7762, term7762.getClass(), "f", term7763);
        setField(term7762, term7762.getClass(), "constraints", term7765);
        setBooleanField(term7762, term7762.getClass(), "restrictToNonNegative", false);
        setField(term7762, term7762.getClass(), "tableau", null);
        setIntField(term7762, term7762.getClass(), "numDecisionVariables", 1876565163);
        setIntField(term7762, term7762.getClass(), "numSlackVariables", -817164822);
        setIntField(term7762, term7762.getClass(), "numArtificialVariables", -1016503459);
        setDoubleField(term7762, term7762.getClass(), "epsilon", 0.5617009352394552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getHeight", argTypes, term7762, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


