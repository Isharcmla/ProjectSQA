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

public class SimplexTableau_equals_1450061279170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104431;
     Object term104553;
     Object term104575;
     Object term104576;

    public SimplexTableau_equals_1450061279170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104431 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term104431, term104431.getClass(), "restrictToNonNegative", false);
        setIntField(term104431, term104431.getClass(), "numDecisionVariables", 0);
        setIntField(term104431, term104431.getClass(), "numSlackVariables", 0);
        setIntField(term104431, term104431.getClass(), "numArtificialVariables", 0);
        setDoubleField(term104431, term104431.getClass(), "epsilon", 4.6522982477783368E18);
        term104553 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term104553, term104553.getClass(), "restrictToNonNegative", false);
        setIntField(term104553, term104553.getClass(), "numDecisionVariables", 0);
        setIntField(term104553, term104553.getClass(), "numSlackVariables", 0);
        setIntField(term104553, term104553.getClass(), "numArtificialVariables", 0);
        setDoubleField(term104553, term104553.getClass(), "epsilon", 9.087031959355392E15);
        term104575 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term104575, term104575.getClass(), "f", null);
        setField(term104575, term104575.getClass(), "constraints", null);
        setBooleanField(term104575, term104575.getClass(), "restrictToNonNegative", false);
        setField(term104575, term104575.getClass(), "tableau", null);
        setIntField(term104575, term104575.getClass(), "numDecisionVariables", 0);
        setIntField(term104575, term104575.getClass(), "numSlackVariables", 0);
        setIntField(term104575, term104575.getClass(), "numArtificialVariables", 0);
        setDoubleField(term104575, term104575.getClass(), "epsilon", 4.6522982477783368E18);
        term104576 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term104576, term104576.getClass(), "f", null);
        setField(term104576, term104576.getClass(), "constraints", null);
        setBooleanField(term104576, term104576.getClass(), "restrictToNonNegative", false);
        setField(term104576, term104576.getClass(), "tableau", null);
        setIntField(term104576, term104576.getClass(), "numDecisionVariables", 0);
        setIntField(term104576, term104576.getClass(), "numSlackVariables", 0);
        setIntField(term104576, term104576.getClass(), "numArtificialVariables", 0);
        setDoubleField(term104576, term104576.getClass(), "epsilon", 9.087031959355392E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term104553;
        Object retValue = callMethod(klass, "equals", argTypes, term104431, args);
        assertTrue(recursiveEquals(term104431, term104575));
        assertTrue(recursiveEquals(term104553, term104576));
        assertTrue(recursiveEquals(retValue, false));
    }

};


