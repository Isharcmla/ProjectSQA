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

public class SimplexTableau_equals_1450061279166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103508;
     Object term103770;
     Object term103800;
     Object term103802;

    public SimplexTableau_equals_1450061279166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103508 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term103648 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setBooleanField(term103508, term103508.getClass(), "restrictToNonNegative", true);
        setIntField(term103508, term103508.getClass(), "numDecisionVariables", 0);
        setIntField(term103508, term103508.getClass(), "numSlackVariables", 0);
        setIntField(term103508, term103508.getClass(), "numArtificialVariables", 0);
        setDoubleField(term103508, term103508.getClass(), "epsilon", -9.2166166374137201E18);
        setField(term103508, term103508.getClass(), "f", term103648);
        term103770 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term103770, term103770.getClass(), "restrictToNonNegative", true);
        setIntField(term103770, term103770.getClass(), "numDecisionVariables", 0);
        setIntField(term103770, term103770.getClass(), "numSlackVariables", 0);
        setIntField(term103770, term103770.getClass(), "numArtificialVariables", 0);
        setDoubleField(term103770, term103770.getClass(), "epsilon", -9.2166166374137201E18);
        setField(term103770, term103770.getClass(), "f", null);
        term103800 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term103801 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term103801, term103801.getClass(), "coefficients", null);
        setDoubleField(term103801, term103801.getClass(), "constantTerm", 0.0);
        setField(term103800, term103800.getClass(), "f", term103801);
        setField(term103800, term103800.getClass(), "constraints", null);
        setBooleanField(term103800, term103800.getClass(), "restrictToNonNegative", true);
        setField(term103800, term103800.getClass(), "tableau", null);
        setIntField(term103800, term103800.getClass(), "numDecisionVariables", 0);
        setIntField(term103800, term103800.getClass(), "numSlackVariables", 0);
        setIntField(term103800, term103800.getClass(), "numArtificialVariables", 0);
        setDoubleField(term103800, term103800.getClass(), "epsilon", -9.2166166374137201E18);
        term103802 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term103802, term103802.getClass(), "f", null);
        setField(term103802, term103802.getClass(), "constraints", null);
        setBooleanField(term103802, term103802.getClass(), "restrictToNonNegative", true);
        setField(term103802, term103802.getClass(), "tableau", null);
        setIntField(term103802, term103802.getClass(), "numDecisionVariables", 0);
        setIntField(term103802, term103802.getClass(), "numSlackVariables", 0);
        setIntField(term103802, term103802.getClass(), "numArtificialVariables", 0);
        setDoubleField(term103802, term103802.getClass(), "epsilon", -9.2166166374137201E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term103770;
        Object retValue = callMethod(klass, "equals", argTypes, term103508, args);
        assertTrue(recursiveEquals(term103508, term103800));
        assertTrue(recursiveEquals(term103770, term103802));
        assertTrue(recursiveEquals(retValue, false));
    }

};


