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

public class SimplexTableau_discardArtificialVariables_191429919675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58318;
     Object term58853;

    public SimplexTableau_discardArtificialVariables_191429919675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58318 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setIntField(term58318, term58318.getClass(), "numArtificialVariables", 0);
        term58853 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term58853, term58853.getClass(), "f", null);
        setField(term58853, term58853.getClass(), "constraints", null);
        setBooleanField(term58853, term58853.getClass(), "restrictToNonNegative", false);
        setField(term58853, term58853.getClass(), "tableau", null);
        setIntField(term58853, term58853.getClass(), "numDecisionVariables", 0);
        setIntField(term58853, term58853.getClass(), "numSlackVariables", 0);
        setIntField(term58853, term58853.getClass(), "numArtificialVariables", 0);
        setDoubleField(term58853, term58853.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "discardArtificialVariables", argTypes, term58318, args);
        assertTrue(recursiveEquals(term58318, term58853));
    }

};


