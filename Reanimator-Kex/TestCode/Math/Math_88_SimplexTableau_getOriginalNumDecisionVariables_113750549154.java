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

public class SimplexTableau_getOriginalNumDecisionVariables_113750549154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12978;
     Object term48676;

    public SimplexTableau_getOriginalNumDecisionVariables_113750549154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48687 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48686 = ((Class) term48687).getDeclaredField((String) "GEQ");
        ((Field) term48686).setAccessible(true);
        Object enum122 = ((Field) term48686).get((Object) null);
        Object term12983 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12983, term12983.getClass(), "coefficients", null);
        setField(term12983, term12983.getClass(), "relationship", enum122);
        setDoubleField(term12983, term12983.getClass(), "value", 0.4355627280318103);
        Class<? extends Object> term48983 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48982 = ((Class) term48983).getDeclaredField((String) "LEQ");
        ((Field) term48982).setAccessible(true);
        Object enum123 = ((Field) term48982).get((Object) null);
        Object term12987 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12987, term12987.getClass(), "coefficients", null);
        setField(term12987, term12987.getClass(), "relationship", enum123);
        setDoubleField(term12987, term12987.getClass(), "value", 0.841460835734741);
        Object term12991 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12991, term12991.getClass(), "coefficients", null);
        setField(term12991, term12991.getClass(), "relationship", enum123);
        setDoubleField(term12991, term12991.getClass(), "value", 0.7859316615744082);
        Class<? extends Object> term49279 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49278 = ((Class) term49279).getDeclaredField((String) "EQ");
        ((Field) term49278).setAccessible(true);
        Object enum124 = ((Field) term49278).get((Object) null);
        Object term12993 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12993, term12993.getClass(), "coefficients", null);
        setField(term12993, term12993.getClass(), "relationship", enum124);
        setDoubleField(term12993, term12993.getClass(), "value", 0.6428742553484879);
        ArrayList term12981 = new ArrayList();
        ((ArrayList) term12981).add(term12983);
        ((ArrayList) term12981).add(term12987);
        ((ArrayList) term12981).add(term12991);
        ((ArrayList) term12981).add(term12993);
        term12978 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term12979 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term12979, term12979.getClass(), "coefficients", null);
        setDoubleField(term12979, term12979.getClass(), "constantTerm", 0.6142723998707854);
        setField(term12978, term12978.getClass(), "f", term12979);
        setField(term12978, term12978.getClass(), "constraints", term12981);
        setBooleanField(term12978, term12978.getClass(), "restrictToNonNegative", true);
        setField(term12978, term12978.getClass(), "tableau", null);
        setIntField(term12978, term12978.getClass(), "numDecisionVariables", -2095575670);
        setIntField(term12978, term12978.getClass(), "numSlackVariables", 1225272962);
        setIntField(term12978, term12978.getClass(), "numArtificialVariables", 1324040357);
        setDoubleField(term12978, term12978.getClass(), "epsilon", 0.6584165706677267);
        Class<? extends Object> term49572 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49571 = ((Class) term49572).getDeclaredField((String) "EQ");
        ((Field) term49571).setAccessible(true);
        Object enum125 = ((Field) term49571).get((Object) null);
        Object term48680 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48680, term48680.getClass(), "coefficients", null);
        setField(term48680, term48680.getClass(), "relationship", enum125);
        setDoubleField(term48680, term48680.getClass(), "value", 0.4355627280318103);
        Class<? extends Object> term49865 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49864 = ((Class) term49865).getDeclaredField((String) "GEQ");
        ((Field) term49864).setAccessible(true);
        Object enum126 = ((Field) term49864).get((Object) null);
        Object term48682 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48682, term48682.getClass(), "coefficients", null);
        setField(term48682, term48682.getClass(), "relationship", enum126);
        setDoubleField(term48682, term48682.getClass(), "value", 0.841460835734741);
        Object term48684 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48684, term48684.getClass(), "coefficients", null);
        setField(term48684, term48684.getClass(), "relationship", enum126);
        setDoubleField(term48684, term48684.getClass(), "value", 0.7859316615744082);
        Object term48685 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48685, term48685.getClass(), "coefficients", null);
        setField(term48685, term48685.getClass(), "relationship", enum126);
        setDoubleField(term48685, term48685.getClass(), "value", 0.6428742553484879);
        ArrayList term48678 = new ArrayList();
        ((ArrayList) term48678).add(term48680);
        ((ArrayList) term48678).add(term48682);
        ((ArrayList) term48678).add(term48684);
        ((ArrayList) term48678).add(term48685);
        term48676 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term48677 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term48677, term48677.getClass(), "coefficients", null);
        setDoubleField(term48677, term48677.getClass(), "constantTerm", 0.6142723998707854);
        setField(term48676, term48676.getClass(), "f", term48677);
        setField(term48676, term48676.getClass(), "constraints", term48678);
        setBooleanField(term48676, term48676.getClass(), "restrictToNonNegative", true);
        setField(term48676, term48676.getClass(), "tableau", null);
        setIntField(term48676, term48676.getClass(), "numDecisionVariables", -2095575670);
        setIntField(term48676, term48676.getClass(), "numSlackVariables", 1225272962);
        setIntField(term48676, term48676.getClass(), "numArtificialVariables", 1324040357);
        setDoubleField(term48676, term48676.getClass(), "epsilon", 0.6584165706677267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOriginalNumDecisionVariables", argTypes, term12978, args);
        assertTrue(recursiveEquals(term12978, term48676));
        assertTrue(recursiveEquals(retValue, -2095575670));
    }

};


