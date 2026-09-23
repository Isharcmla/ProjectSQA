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
import java.util.ArrayList;

public class SimplexTableau_getNormalizedConstraints_926573528196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116042;
     Object term116110;
     Object term116096;

    public SimplexTableau_getNormalizedConstraints_926573528196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term116094 = new ArrayList();
        term116042 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term116042, term116042.getClass(), "constraints", term116094);
        ArrayList term116111 = new ArrayList();
        term116110 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term116110, term116110.getClass(), "f", null);
        setField(term116110, term116110.getClass(), "constraints", term116111);
        setBooleanField(term116110, term116110.getClass(), "restrictToNonNegative", false);
        setField(term116110, term116110.getClass(), "tableau", null);
        setIntField(term116110, term116110.getClass(), "numDecisionVariables", 0);
        setIntField(term116110, term116110.getClass(), "numSlackVariables", 0);
        setIntField(term116110, term116110.getClass(), "numArtificialVariables", 0);
        setDoubleField(term116110, term116110.getClass(), "epsilon", 0.0);
        term116096 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormalizedConstraints", argTypes, term116042, args);
        assertTrue(recursiveEquals(term116042, term116110));
        assertTrue(recursiveEquals(retValue, term116096));
    }

};


