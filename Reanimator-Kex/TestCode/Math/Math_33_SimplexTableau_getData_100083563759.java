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

public class SimplexTableau_getData_100083563759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15699;

    public SimplexTableau_getData_100083563759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54947 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term54946 = ((Class) term54947).getDeclaredField((String) "EQ");
        ((Field) term54946).setAccessible(true);
        Object enum124 = ((Field) term54946).get((Object) null);
        Object term15704 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term15704, term15704.getClass(), "coefficients", null);
        setField(term15704, term15704.getClass(), "relationship", enum124);
        setDoubleField(term15704, term15704.getClass(), "value", 0.5335953039331021);
        Object term15708 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term15708, term15708.getClass(), "coefficients", null);
        setField(term15708, term15708.getClass(), "relationship", enum124);
        setDoubleField(term15708, term15708.getClass(), "value", 0.5725602309856443);
        Class<? extends Object> term55245 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term55244 = ((Class) term55245).getDeclaredField((String) "GEQ");
        ((Field) term55244).setAccessible(true);
        Object enum125 = ((Field) term55244).get((Object) null);
        Object term15710 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term15710, term15710.getClass(), "coefficients", null);
        setField(term15710, term15710.getClass(), "relationship", enum125);
        setDoubleField(term15710, term15710.getClass(), "value", 0.5310967137636303);
        Class<? extends Object> term55546 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term55545 = ((Class) term55546).getDeclaredField((String) "EQ");
        ((Field) term55545).setAccessible(true);
        Object enum126 = ((Field) term55545).get((Object) null);
        Object term15714 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term15714, term15714.getClass(), "coefficients", null);
        setField(term15714, term15714.getClass(), "relationship", enum126);
        setDoubleField(term15714, term15714.getClass(), "value", 0.6054109236809134);
        Object term15718 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term15718, term15718.getClass(), "coefficients", null);
        setField(term15718, term15718.getClass(), "relationship", enum126);
        setDoubleField(term15718, term15718.getClass(), "value", 0.9165240441138934);
        Object term15720 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term15720, term15720.getClass(), "coefficients", null);
        setField(term15720, term15720.getClass(), "relationship", enum124);
        setDoubleField(term15720, term15720.getClass(), "value", 0.22227423914231126);
        ArrayList term15702 = new ArrayList();
        ((ArrayList) term15702).add(term15704);
        ((ArrayList) term15702).add(term15708);
        ((ArrayList) term15702).add(term15710);
        ((ArrayList) term15702).add(term15714);
        ((ArrayList) term15702).add(term15718);
        ((ArrayList) term15702).add(term15720);
        ArrayList term15725 = new ArrayList();
        ((ArrayList) term15725).add("PHvxnGHptP");
        ((ArrayList) term15725).add("TimdotUuNC");
        ((ArrayList) term15725).add("PkWMRdJcBb");
        ((ArrayList) term15725).add("jSpAteRute");
        ((ArrayList) term15725).add("swZVeJAxjt");
        term15699 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term15700 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term15700, term15700.getClass(), "coefficients", null);
        setDoubleField(term15700, term15700.getClass(), "constantTerm", 0.18717846301066243);
        setField(term15699, term15699.getClass(), "f", term15700);
        setField(term15699, term15699.getClass(), "constraints", term15702);
        setBooleanField(term15699, term15699.getClass(), "restrictToNonNegative", false);
        setField(term15699, term15699.getClass(), "columnLabels", term15725);
        setField(term15699, term15699.getClass(), "tableau", null);
        setIntField(term15699, term15699.getClass(), "numDecisionVariables", -1034506028);
        setIntField(term15699, term15699.getClass(), "numSlackVariables", -1263114719);
        setIntField(term15699, term15699.getClass(), "numArtificialVariables", -894662986);
        setDoubleField(term15699, term15699.getClass(), "epsilon", 0.06480976831423468);
        setIntField(term15699, term15699.getClass(), "maxUlps", 304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getData", argTypes, term15699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


