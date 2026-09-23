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

public class SimplexTableau_getNumDecisionVariables_147284326055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12939;
     Object term47916;

    public SimplexTableau_getNumDecisionVariables_147284326055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12942 = new ArrayList();
        ArrayList term12947 = new ArrayList();
        ((ArrayList) term12947).add("bLPjGVBhlX");
        ((ArrayList) term12947).add("whBvTVIIlC");
        ((ArrayList) term12947).add("IgRJUzaCwW");
        ((ArrayList) term12947).add("JUmudUmaaV");
        ((ArrayList) term12947).add("KoyGrUJeJW");
        ((ArrayList) term12947).add("HqBOwkVqjD");
        ((ArrayList) term12947).add("MAcUBcBckh");
        term12939 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term12940 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term12940, term12940.getClass(), "coefficients", null);
        setDoubleField(term12940, term12940.getClass(), "constantTerm", 0.3710067290060264);
        setField(term12939, term12939.getClass(), "f", term12940);
        setField(term12939, term12939.getClass(), "constraints", term12942);
        setBooleanField(term12939, term12939.getClass(), "restrictToNonNegative", true);
        setField(term12939, term12939.getClass(), "columnLabels", term12947);
        setField(term12939, term12939.getClass(), "tableau", null);
        setIntField(term12939, term12939.getClass(), "numDecisionVariables", 972867650);
        setIntField(term12939, term12939.getClass(), "numSlackVariables", 1655935355);
        setIntField(term12939, term12939.getClass(), "numArtificialVariables", -481533957);
        setDoubleField(term12939, term12939.getClass(), "epsilon", 0.7818620200430967);
        setIntField(term12939, term12939.getClass(), "maxUlps", 1240914516);
        ArrayList term47918 = new ArrayList();
        ArrayList term47920 = new ArrayList();
        ((ArrayList) term47920).add("bLPjGVBhlX");
        ((ArrayList) term47920).add("whBvTVIIlC");
        ((ArrayList) term47920).add("IgRJUzaCwW");
        ((ArrayList) term47920).add("JUmudUmaaV");
        ((ArrayList) term47920).add("KoyGrUJeJW");
        ((ArrayList) term47920).add("HqBOwkVqjD");
        ((ArrayList) term47920).add("MAcUBcBckh");
        term47916 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term47917 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term47917, term47917.getClass(), "coefficients", null);
        setDoubleField(term47917, term47917.getClass(), "constantTerm", 0.3710067290060264);
        setField(term47916, term47916.getClass(), "f", term47917);
        setField(term47916, term47916.getClass(), "constraints", term47918);
        setBooleanField(term47916, term47916.getClass(), "restrictToNonNegative", true);
        setField(term47916, term47916.getClass(), "columnLabels", term47920);
        setField(term47916, term47916.getClass(), "tableau", null);
        setIntField(term47916, term47916.getClass(), "numDecisionVariables", 972867650);
        setIntField(term47916, term47916.getClass(), "numSlackVariables", 1655935355);
        setIntField(term47916, term47916.getClass(), "numArtificialVariables", -481533957);
        setDoubleField(term47916, term47916.getClass(), "epsilon", 0.7818620200430967);
        setIntField(term47916, term47916.getClass(), "maxUlps", 1240914516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumDecisionVariables", argTypes, term12939, args);
        assertTrue(recursiveEquals(term12939, term47916));
        assertTrue(recursiveEquals(retValue, 972867650));
    }

};


