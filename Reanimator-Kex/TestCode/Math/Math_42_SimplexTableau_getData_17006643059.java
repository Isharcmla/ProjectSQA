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

public class SimplexTableau_getData_17006643059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15479;

    public SimplexTableau_getData_17006643059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49894 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49893 = ((Class) term49894).getDeclaredField((String) "GEQ");
        ((Field) term49893).setAccessible(true);
        Object enum116 = ((Field) term49893).get((Object) null);
        Object term15484 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15484, term15484.getClass(), "coefficients", null);
        setField(term15484, term15484.getClass(), "relationship", enum116);
        setDoubleField(term15484, term15484.getClass(), "value", 0.5335953039331021);
        Object term15488 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15488, term15488.getClass(), "coefficients", null);
        setField(term15488, term15488.getClass(), "relationship", enum116);
        setDoubleField(term15488, term15488.getClass(), "value", 0.5725602309856443);
        Class<? extends Object> term50460 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50459 = ((Class) term50460).getDeclaredField((String) "GEQ");
        ((Field) term50459).setAccessible(true);
        Object enum119 = ((Field) term50459).get((Object) null);
        Object term15490 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15490, term15490.getClass(), "coefficients", null);
        setField(term15490, term15490.getClass(), "relationship", enum119);
        setDoubleField(term15490, term15490.getClass(), "value", 0.5310967137636303);
        Class<? extends Object> term51112 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51111 = ((Class) term51112).getDeclaredField((String) "EQ");
        ((Field) term51111).setAccessible(true);
        Object enum120 = ((Field) term51111).get((Object) null);
        Object term15494 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15494, term15494.getClass(), "coefficients", null);
        setField(term15494, term15494.getClass(), "relationship", enum120);
        setDoubleField(term15494, term15494.getClass(), "value", 0.6054109236809134);
        Object term15498 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15498, term15498.getClass(), "coefficients", null);
        setField(term15498, term15498.getClass(), "relationship", enum120);
        setDoubleField(term15498, term15498.getClass(), "value", 0.9165240441138934);
        Object term15500 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15500, term15500.getClass(), "coefficients", null);
        setField(term15500, term15500.getClass(), "relationship", enum116);
        setDoubleField(term15500, term15500.getClass(), "value", 0.22227423914231126);
        ArrayList term15482 = new ArrayList();
        ((ArrayList) term15482).add(term15484);
        ((ArrayList) term15482).add(term15488);
        ((ArrayList) term15482).add(term15490);
        ((ArrayList) term15482).add(term15494);
        ((ArrayList) term15482).add(term15498);
        ((ArrayList) term15482).add(term15500);
        ArrayList term15505 = new ArrayList();
        ((ArrayList) term15505).add("PHvxnGHptP");
        ((ArrayList) term15505).add("TimdotUuNC");
        ((ArrayList) term15505).add("PkWMRdJcBb");
        ((ArrayList) term15505).add("jSpAteRute");
        ((ArrayList) term15505).add("swZVeJAxjt");
        term15479 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term15480 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term15480, term15480.getClass(), "coefficients", null);
        setDoubleField(term15480, term15480.getClass(), "constantTerm", 0.18717846301066243);
        setField(term15479, term15479.getClass(), "f", term15480);
        setField(term15479, term15479.getClass(), "constraints", term15482);
        setBooleanField(term15479, term15479.getClass(), "restrictToNonNegative", false);
        setField(term15479, term15479.getClass(), "columnLabels", term15505);
        setField(term15479, term15479.getClass(), "tableau", null);
        setIntField(term15479, term15479.getClass(), "numDecisionVariables", -1034506028);
        setIntField(term15479, term15479.getClass(), "numSlackVariables", -1263114719);
        setIntField(term15479, term15479.getClass(), "numArtificialVariables", -894662986);
        setDoubleField(term15479, term15479.getClass(), "epsilon", 0.06480976831423468);
        setIntField(term15479, term15479.getClass(), "maxUlps", 304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getData", argTypes, term15479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


