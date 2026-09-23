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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getNumDecisionVariables_147284326053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12062;
     Object term47185;

    public SimplexTableau_getNumDecisionVariables_147284326053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47200 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47199 = ((Class) term47200).getDeclaredField((String) "LEQ");
        ((Field) term47199).setAccessible(true);
        Object enum117 = ((Field) term47199).get((Object) null);
        Object term12067 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12067, term12067.getClass(), "coefficients", null);
        setField(term12067, term12067.getClass(), "relationship", enum117);
        setDoubleField(term12067, term12067.getClass(), "value", 0.3710067290060264);
        Class<? extends Object> term47496 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47495 = ((Class) term47496).getDeclaredField((String) "LEQ");
        ((Field) term47495).setAccessible(true);
        Object enum118 = ((Field) term47495).get((Object) null);
        Object term12071 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12071, term12071.getClass(), "coefficients", null);
        setField(term12071, term12071.getClass(), "relationship", enum118);
        setDoubleField(term12071, term12071.getClass(), "value", 0.7818620200430967);
        Class<? extends Object> term47792 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47791 = ((Class) term47792).getDeclaredField((String) "LEQ");
        ((Field) term47791).setAccessible(true);
        Object enum119 = ((Field) term47791).get((Object) null);
        Object term12075 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12075, term12075.getClass(), "coefficients", null);
        setField(term12075, term12075.getClass(), "relationship", enum119);
        setDoubleField(term12075, term12075.getClass(), "value", 0.04640022995603543);
        Object term12079 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12079, term12079.getClass(), "coefficients", null);
        setField(term12079, term12079.getClass(), "relationship", enum118);
        setDoubleField(term12079, term12079.getClass(), "value", 0.9123572866833729);
        Object term12081 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12081, term12081.getClass(), "coefficients", null);
        setField(term12081, term12081.getClass(), "relationship", enum117);
        setDoubleField(term12081, term12081.getClass(), "value", 0.40635376375558196);
        Object term12083 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12083, term12083.getClass(), "coefficients", null);
        setField(term12083, term12083.getClass(), "relationship", enum119);
        setDoubleField(term12083, term12083.getClass(), "value", 0.4772043271031934);
        Object term12085 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12085, term12085.getClass(), "coefficients", null);
        setField(term12085, term12085.getClass(), "relationship", enum119);
        setDoubleField(term12085, term12085.getClass(), "value", 0.2446504549754045);
        Object term12087 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12087, term12087.getClass(), "coefficients", null);
        setField(term12087, term12087.getClass(), "relationship", null);
        setDoubleField(term12087, term12087.getClass(), "value", 0.0);
        ArrayList term12065 = new ArrayList();
        ((ArrayList) term12065).add(term12067);
        ((ArrayList) term12065).add(term12071);
        ((ArrayList) term12065).add(term12075);
        ((ArrayList) term12065).add(term12079);
        ((ArrayList) term12065).add(term12081);
        ((ArrayList) term12065).add(term12083);
        ((ArrayList) term12065).add(term12085);
        ((ArrayList) term12065).add(term12087);
        term12062 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term12063 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term12063, term12063.getClass(), "coefficients", null);
        setDoubleField(term12063, term12063.getClass(), "constantTerm", 0.40598298281353484);
        setField(term12062, term12062.getClass(), "f", term12063);
        setField(term12062, term12062.getClass(), "constraints", term12065);
        setBooleanField(term12062, term12062.getClass(), "restrictToNonNegative", true);
        setField(term12062, term12062.getClass(), "tableau", null);
        setIntField(term12062, term12062.getClass(), "numDecisionVariables", 0);
        setIntField(term12062, term12062.getClass(), "numSlackVariables", 0);
        setIntField(term12062, term12062.getClass(), "numArtificialVariables", 0);
        setDoubleField(term12062, term12062.getClass(), "epsilon", 0.0);
        Class<? extends Object> term48088 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48087 = ((Class) term48088).getDeclaredField((String) "EQ");
        ((Field) term48087).setAccessible(true);
        Object enum120 = ((Field) term48087).get((Object) null);
        Object term47189 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term47189, term47189.getClass(), "coefficients", null);
        setField(term47189, term47189.getClass(), "relationship", enum120);
        setDoubleField(term47189, term47189.getClass(), "value", 0.3710067290060264);
        Class<? extends Object> term48381 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48380 = ((Class) term48381).getDeclaredField((String) "LEQ");
        ((Field) term48380).setAccessible(true);
        Object enum121 = ((Field) term48380).get((Object) null);
        Object term47191 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term47191, term47191.getClass(), "coefficients", null);
        setField(term47191, term47191.getClass(), "relationship", enum121);
        setDoubleField(term47191, term47191.getClass(), "value", 0.7818620200430967);
        Object term47193 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term47193, term47193.getClass(), "coefficients", null);
        setField(term47193, term47193.getClass(), "relationship", enum121);
        setDoubleField(term47193, term47193.getClass(), "value", 0.04640022995603543);
        Object term47194 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term47194, term47194.getClass(), "coefficients", null);
        setField(term47194, term47194.getClass(), "relationship", enum121);
        setDoubleField(term47194, term47194.getClass(), "value", 0.9123572866833729);
        Object term47195 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term47195, term47195.getClass(), "coefficients", null);
        setField(term47195, term47195.getClass(), "relationship", enum120);
        setDoubleField(term47195, term47195.getClass(), "value", 0.40635376375558196);
        Object term47196 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term47196, term47196.getClass(), "coefficients", null);
        setField(term47196, term47196.getClass(), "relationship", enum121);
        setDoubleField(term47196, term47196.getClass(), "value", 0.4772043271031934);
        Object term47197 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term47197, term47197.getClass(), "coefficients", null);
        setField(term47197, term47197.getClass(), "relationship", enum121);
        setDoubleField(term47197, term47197.getClass(), "value", 0.2446504549754045);
        Object term47198 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term47198, term47198.getClass(), "coefficients", null);
        setField(term47198, term47198.getClass(), "relationship", null);
        setDoubleField(term47198, term47198.getClass(), "value", 0.0);
        ArrayList term47187 = new ArrayList();
        ((ArrayList) term47187).add(term47189);
        ((ArrayList) term47187).add(term47191);
        ((ArrayList) term47187).add(term47193);
        ((ArrayList) term47187).add(term47194);
        ((ArrayList) term47187).add(term47195);
        ((ArrayList) term47187).add(term47196);
        ((ArrayList) term47187).add(term47197);
        ((ArrayList) term47187).add(term47198);
        term47185 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term47186 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term47186, term47186.getClass(), "coefficients", null);
        setDoubleField(term47186, term47186.getClass(), "constantTerm", 0.40598298281353484);
        setField(term47185, term47185.getClass(), "f", term47186);
        setField(term47185, term47185.getClass(), "constraints", term47187);
        setBooleanField(term47185, term47185.getClass(), "restrictToNonNegative", true);
        setField(term47185, term47185.getClass(), "tableau", null);
        setIntField(term47185, term47185.getClass(), "numDecisionVariables", 0);
        setIntField(term47185, term47185.getClass(), "numSlackVariables", 0);
        setIntField(term47185, term47185.getClass(), "numArtificialVariables", 0);
        setDoubleField(term47185, term47185.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumDecisionVariables", argTypes, term12062, args);
        assertTrue(recursiveEquals(term12062, term47185));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


