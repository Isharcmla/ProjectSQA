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

public class SimplexTableau_equals_1450061279141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83697;
     Object term83819;
     Object term83844;
     Object term83845;

    public SimplexTableau_equals_1450061279141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83697 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term83697, term83697.getClass(), "restrictToNonNegative", true);
        setIntField(term83697, term83697.getClass(), "numDecisionVariables", 0);
        setIntField(term83697, term83697.getClass(), "numSlackVariables", 0);
        setIntField(term83697, term83697.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83697, term83697.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term83697, term83697.getClass(), "maxUlps", 1);
        term83819 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term83819, term83819.getClass(), "restrictToNonNegative", true);
        setIntField(term83819, term83819.getClass(), "numDecisionVariables", 0);
        setIntField(term83819, term83819.getClass(), "numSlackVariables", 0);
        setIntField(term83819, term83819.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83819, term83819.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term83819, term83819.getClass(), "maxUlps", 0);
        term83844 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term83844, term83844.getClass(), "f", null);
        setField(term83844, term83844.getClass(), "constraints", null);
        setBooleanField(term83844, term83844.getClass(), "restrictToNonNegative", true);
        setField(term83844, term83844.getClass(), "columnLabels", null);
        setField(term83844, term83844.getClass(), "tableau", null);
        setIntField(term83844, term83844.getClass(), "numDecisionVariables", 0);
        setIntField(term83844, term83844.getClass(), "numSlackVariables", 0);
        setIntField(term83844, term83844.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83844, term83844.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term83844, term83844.getClass(), "maxUlps", 1);
        term83845 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term83845, term83845.getClass(), "f", null);
        setField(term83845, term83845.getClass(), "constraints", null);
        setBooleanField(term83845, term83845.getClass(), "restrictToNonNegative", true);
        setField(term83845, term83845.getClass(), "columnLabels", null);
        setField(term83845, term83845.getClass(), "tableau", null);
        setIntField(term83845, term83845.getClass(), "numDecisionVariables", 0);
        setIntField(term83845, term83845.getClass(), "numSlackVariables", 0);
        setIntField(term83845, term83845.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83845, term83845.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term83845, term83845.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term83819;
        Object retValue = callMethod(klass, "equals", argTypes, term83697, args);
        assertTrue(recursiveEquals(term83697, term83844));
        assertTrue(recursiveEquals(term83819, term83845));
        assertTrue(recursiveEquals(retValue, false));
    }

};


