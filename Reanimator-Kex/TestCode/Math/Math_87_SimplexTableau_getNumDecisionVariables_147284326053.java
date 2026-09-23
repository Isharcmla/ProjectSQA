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
     Object term46520;

    public SimplexTableau_getNumDecisionVariables_147284326053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46535 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term46534 = ((Class) term46535).getDeclaredField((String) "LEQ");
        ((Field) term46534).setAccessible(true);
        Object enum117 = ((Field) term46534).get((Object) null);
        Object term12067 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12067, term12067.getClass(), "coefficients", null);
        setField(term12067, term12067.getClass(), "relationship", enum117);
        setDoubleField(term12067, term12067.getClass(), "value", 0.3710067290060264);
        Class<? extends Object> term46831 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term46830 = ((Class) term46831).getDeclaredField((String) "LEQ");
        ((Field) term46830).setAccessible(true);
        Object enum118 = ((Field) term46830).get((Object) null);
        Object term12071 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12071, term12071.getClass(), "coefficients", null);
        setField(term12071, term12071.getClass(), "relationship", enum118);
        setDoubleField(term12071, term12071.getClass(), "value", 0.7818620200430967);
        Class<? extends Object> term47127 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47126 = ((Class) term47127).getDeclaredField((String) "LEQ");
        ((Field) term47126).setAccessible(true);
        Object enum119 = ((Field) term47126).get((Object) null);
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
        Class<? extends Object> term47423 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47422 = ((Class) term47423).getDeclaredField((String) "EQ");
        ((Field) term47422).setAccessible(true);
        Object enum120 = ((Field) term47422).get((Object) null);
        Object term46524 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term46524, term46524.getClass(), "coefficients", null);
        setField(term46524, term46524.getClass(), "relationship", enum120);
        setDoubleField(term46524, term46524.getClass(), "value", 0.3710067290060264);
        Class<? extends Object> term47716 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47715 = ((Class) term47716).getDeclaredField((String) "LEQ");
        ((Field) term47715).setAccessible(true);
        Object enum121 = ((Field) term47715).get((Object) null);
        Object term46526 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term46526, term46526.getClass(), "coefficients", null);
        setField(term46526, term46526.getClass(), "relationship", enum121);
        setDoubleField(term46526, term46526.getClass(), "value", 0.7818620200430967);
        Object term46528 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term46528, term46528.getClass(), "coefficients", null);
        setField(term46528, term46528.getClass(), "relationship", enum121);
        setDoubleField(term46528, term46528.getClass(), "value", 0.04640022995603543);
        Object term46529 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term46529, term46529.getClass(), "coefficients", null);
        setField(term46529, term46529.getClass(), "relationship", enum121);
        setDoubleField(term46529, term46529.getClass(), "value", 0.9123572866833729);
        Object term46530 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term46530, term46530.getClass(), "coefficients", null);
        setField(term46530, term46530.getClass(), "relationship", enum120);
        setDoubleField(term46530, term46530.getClass(), "value", 0.40635376375558196);
        Object term46531 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term46531, term46531.getClass(), "coefficients", null);
        setField(term46531, term46531.getClass(), "relationship", enum121);
        setDoubleField(term46531, term46531.getClass(), "value", 0.4772043271031934);
        Object term46532 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term46532, term46532.getClass(), "coefficients", null);
        setField(term46532, term46532.getClass(), "relationship", enum121);
        setDoubleField(term46532, term46532.getClass(), "value", 0.2446504549754045);
        Object term46533 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term46533, term46533.getClass(), "coefficients", null);
        setField(term46533, term46533.getClass(), "relationship", null);
        setDoubleField(term46533, term46533.getClass(), "value", 0.0);
        ArrayList term46522 = new ArrayList();
        ((ArrayList) term46522).add(term46524);
        ((ArrayList) term46522).add(term46526);
        ((ArrayList) term46522).add(term46528);
        ((ArrayList) term46522).add(term46529);
        ((ArrayList) term46522).add(term46530);
        ((ArrayList) term46522).add(term46531);
        ((ArrayList) term46522).add(term46532);
        ((ArrayList) term46522).add(term46533);
        term46520 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term46521 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term46521, term46521.getClass(), "coefficients", null);
        setDoubleField(term46521, term46521.getClass(), "constantTerm", 0.40598298281353484);
        setField(term46520, term46520.getClass(), "f", term46521);
        setField(term46520, term46520.getClass(), "constraints", term46522);
        setBooleanField(term46520, term46520.getClass(), "restrictToNonNegative", true);
        setField(term46520, term46520.getClass(), "tableau", null);
        setIntField(term46520, term46520.getClass(), "numDecisionVariables", 0);
        setIntField(term46520, term46520.getClass(), "numSlackVariables", 0);
        setIntField(term46520, term46520.getClass(), "numArtificialVariables", 0);
        setDoubleField(term46520, term46520.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumDecisionVariables", argTypes, term12062, args);
        assertTrue(recursiveEquals(term12062, term46520));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


