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

public class SimplexTableau_getArtificialVariableOffset_212069912056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12058;
     Object term50807;

    public SimplexTableau_getArtificialVariableOffset_212069912056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50822 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50821 = ((Class) term50822).getDeclaredField((String) "EQ");
        ((Field) term50821).setAccessible(true);
        Object enum126 = ((Field) term50821).get((Object) null);
        Object term12063 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12063, term12063.getClass(), "coefficients", null);
        setField(term12063, term12063.getClass(), "relationship", enum126);
        setDoubleField(term12063, term12063.getClass(), "value", 0.008025683154629148);
        Class<? extends Object> term51115 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51114 = ((Class) term51115).getDeclaredField((String) "GEQ");
        ((Field) term51114).setAccessible(true);
        Object enum127 = ((Field) term51114).get((Object) null);
        Object term12067 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12067, term12067.getClass(), "coefficients", null);
        setField(term12067, term12067.getClass(), "relationship", enum127);
        setDoubleField(term12067, term12067.getClass(), "value", 0.40598298281353484);
        Class<? extends Object> term51411 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51410 = ((Class) term51411).getDeclaredField((String) "LEQ");
        ((Field) term51410).setAccessible(true);
        Object enum128 = ((Field) term51410).get((Object) null);
        Object term12071 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12071, term12071.getClass(), "coefficients", null);
        setField(term12071, term12071.getClass(), "relationship", enum128);
        setDoubleField(term12071, term12071.getClass(), "value", 0.3710067290060264);
        Object term12075 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12075, term12075.getClass(), "coefficients", null);
        setField(term12075, term12075.getClass(), "relationship", enum127);
        setDoubleField(term12075, term12075.getClass(), "value", 0.7818620200430967);
        Object term12077 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12077, term12077.getClass(), "coefficients", null);
        setField(term12077, term12077.getClass(), "relationship", enum126);
        setDoubleField(term12077, term12077.getClass(), "value", 0.04640022995603543);
        Object term12079 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12079, term12079.getClass(), "coefficients", null);
        setField(term12079, term12079.getClass(), "relationship", enum128);
        setDoubleField(term12079, term12079.getClass(), "value", 0.9123572866833729);
        Object term12081 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12081, term12081.getClass(), "coefficients", null);
        setField(term12081, term12081.getClass(), "relationship", enum128);
        setDoubleField(term12081, term12081.getClass(), "value", 0.40635376375558196);
        Object term12083 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12083, term12083.getClass(), "coefficients", null);
        setField(term12083, term12083.getClass(), "relationship", null);
        setDoubleField(term12083, term12083.getClass(), "value", 0.0);
        ArrayList term12061 = new ArrayList();
        ((ArrayList) term12061).add(term12063);
        ((ArrayList) term12061).add(term12067);
        ((ArrayList) term12061).add(term12071);
        ((ArrayList) term12061).add(term12075);
        ((ArrayList) term12061).add(term12077);
        ((ArrayList) term12061).add(term12079);
        ((ArrayList) term12061).add(term12081);
        ((ArrayList) term12061).add(term12083);
        term12058 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term12059 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term12059, term12059.getClass(), "coefficients", null);
        setDoubleField(term12059, term12059.getClass(), "constantTerm", 0.8777038609128434);
        setField(term12058, term12058.getClass(), "f", term12059);
        setField(term12058, term12058.getClass(), "constraints", term12061);
        setBooleanField(term12058, term12058.getClass(), "restrictToNonNegative", true);
        setField(term12058, term12058.getClass(), "tableau", null);
        setIntField(term12058, term12058.getClass(), "numDecisionVariables", 0);
        setIntField(term12058, term12058.getClass(), "numSlackVariables", 0);
        setIntField(term12058, term12058.getClass(), "numArtificialVariables", 0);
        setDoubleField(term12058, term12058.getClass(), "epsilon", 0.0);
        Class<? extends Object> term51707 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51706 = ((Class) term51707).getDeclaredField((String) "EQ");
        ((Field) term51706).setAccessible(true);
        Object enum129 = ((Field) term51706).get((Object) null);
        Object term50811 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50811, term50811.getClass(), "coefficients", null);
        setField(term50811, term50811.getClass(), "relationship", enum129);
        setDoubleField(term50811, term50811.getClass(), "value", 0.008025683154629148);
        Class<? extends Object> term52000 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51999 = ((Class) term52000).getDeclaredField((String) "GEQ");
        ((Field) term51999).setAccessible(true);
        Object enum130 = ((Field) term51999).get((Object) null);
        Object term50813 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50813, term50813.getClass(), "coefficients", null);
        setField(term50813, term50813.getClass(), "relationship", enum130);
        setDoubleField(term50813, term50813.getClass(), "value", 0.40598298281353484);
        Object term50815 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50815, term50815.getClass(), "coefficients", null);
        setField(term50815, term50815.getClass(), "relationship", enum130);
        setDoubleField(term50815, term50815.getClass(), "value", 0.3710067290060264);
        Object term50816 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50816, term50816.getClass(), "coefficients", null);
        setField(term50816, term50816.getClass(), "relationship", enum130);
        setDoubleField(term50816, term50816.getClass(), "value", 0.7818620200430967);
        Object term50817 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50817, term50817.getClass(), "coefficients", null);
        setField(term50817, term50817.getClass(), "relationship", enum129);
        setDoubleField(term50817, term50817.getClass(), "value", 0.04640022995603543);
        Object term50818 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50818, term50818.getClass(), "coefficients", null);
        setField(term50818, term50818.getClass(), "relationship", enum130);
        setDoubleField(term50818, term50818.getClass(), "value", 0.9123572866833729);
        Object term50819 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50819, term50819.getClass(), "coefficients", null);
        setField(term50819, term50819.getClass(), "relationship", enum130);
        setDoubleField(term50819, term50819.getClass(), "value", 0.40635376375558196);
        Object term50820 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50820, term50820.getClass(), "coefficients", null);
        setField(term50820, term50820.getClass(), "relationship", null);
        setDoubleField(term50820, term50820.getClass(), "value", 0.0);
        ArrayList term50809 = new ArrayList();
        ((ArrayList) term50809).add(term50811);
        ((ArrayList) term50809).add(term50813);
        ((ArrayList) term50809).add(term50815);
        ((ArrayList) term50809).add(term50816);
        ((ArrayList) term50809).add(term50817);
        ((ArrayList) term50809).add(term50818);
        ((ArrayList) term50809).add(term50819);
        ((ArrayList) term50809).add(term50820);
        term50807 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term50808 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term50808, term50808.getClass(), "coefficients", null);
        setDoubleField(term50808, term50808.getClass(), "constantTerm", 0.8777038609128434);
        setField(term50807, term50807.getClass(), "f", term50808);
        setField(term50807, term50807.getClass(), "constraints", term50809);
        setBooleanField(term50807, term50807.getClass(), "restrictToNonNegative", true);
        setField(term50807, term50807.getClass(), "tableau", null);
        setIntField(term50807, term50807.getClass(), "numDecisionVariables", 0);
        setIntField(term50807, term50807.getClass(), "numSlackVariables", 0);
        setIntField(term50807, term50807.getClass(), "numArtificialVariables", 0);
        setDoubleField(term50807, term50807.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArtificialVariableOffset", argTypes, term12058, args);
        assertTrue(recursiveEquals(term12058, term50807));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


