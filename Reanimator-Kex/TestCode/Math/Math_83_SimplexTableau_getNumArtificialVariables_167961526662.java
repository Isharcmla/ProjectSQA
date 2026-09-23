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

public class SimplexTableau_getNumArtificialVariables_167961526662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16326;
     Object term57694;

    public SimplexTableau_getNumArtificialVariables_167961526662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16329 = new ArrayList();
        term16326 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term16327 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term16327, term16327.getClass(), "coefficients", null);
        setDoubleField(term16327, term16327.getClass(), "constantTerm", 0.5597136413549945);
        setField(term16326, term16326.getClass(), "f", term16327);
        setField(term16326, term16326.getClass(), "constraints", term16329);
        setBooleanField(term16326, term16326.getClass(), "restrictToNonNegative", true);
        setField(term16326, term16326.getClass(), "tableau", null);
        setIntField(term16326, term16326.getClass(), "numDecisionVariables", 972867650);
        setIntField(term16326, term16326.getClass(), "numSlackVariables", 1655935355);
        setIntField(term16326, term16326.getClass(), "numArtificialVariables", -481533957);
        setDoubleField(term16326, term16326.getClass(), "epsilon", 0.28292420012823627);
        ArrayList term57696 = new ArrayList();
        term57694 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term57695 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term57695, term57695.getClass(), "coefficients", null);
        setDoubleField(term57695, term57695.getClass(), "constantTerm", 0.5597136413549945);
        setField(term57694, term57694.getClass(), "f", term57695);
        setField(term57694, term57694.getClass(), "constraints", term57696);
        setBooleanField(term57694, term57694.getClass(), "restrictToNonNegative", true);
        setField(term57694, term57694.getClass(), "tableau", null);
        setIntField(term57694, term57694.getClass(), "numDecisionVariables", 972867650);
        setIntField(term57694, term57694.getClass(), "numSlackVariables", 1655935355);
        setIntField(term57694, term57694.getClass(), "numArtificialVariables", -481533957);
        setDoubleField(term57694, term57694.getClass(), "epsilon", 0.28292420012823627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumArtificialVariables", argTypes, term16326, args);
        assertTrue(recursiveEquals(term16326, term57694));
        assertTrue(recursiveEquals(retValue, -481533957));
    }

};


