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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.linear.EqualityUtils.*;

public class SimplexTableau_equals_619292072157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84012;
     Object term84136;
     Object term84160;
     Object term84161;

    public SimplexTableau_equals_619292072157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84012 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term84012, term84012.getClass(), "restrictToNonNegative", false);
        setIntField(term84012, term84012.getClass(), "numDecisionVariables", 0);
        setIntField(term84012, term84012.getClass(), "numSlackVariables", 0);
        setIntField(term84012, term84012.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84012, term84012.getClass(), "epsilon", 4.6522982477783368E18);
        term84136 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term84136, term84136.getClass(), "restrictToNonNegative", false);
        setIntField(term84136, term84136.getClass(), "numDecisionVariables", 0);
        setIntField(term84136, term84136.getClass(), "numSlackVariables", 0);
        setIntField(term84136, term84136.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84136, term84136.getClass(), "epsilon", 9.087031959355392E15);
        term84160 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term84160, term84160.getClass(), "f", null);
        setField(term84160, term84160.getClass(), "constraints", null);
        setBooleanField(term84160, term84160.getClass(), "restrictToNonNegative", false);
        setField(term84160, term84160.getClass(), "columnLabels", null);
        setField(term84160, term84160.getClass(), "tableau", null);
        setIntField(term84160, term84160.getClass(), "numDecisionVariables", 0);
        setIntField(term84160, term84160.getClass(), "numSlackVariables", 0);
        setIntField(term84160, term84160.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84160, term84160.getClass(), "epsilon", 4.6522982477783368E18);
        setIntField(term84160, term84160.getClass(), "maxUlps", 0);
        term84161 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term84161, term84161.getClass(), "f", null);
        setField(term84161, term84161.getClass(), "constraints", null);
        setBooleanField(term84161, term84161.getClass(), "restrictToNonNegative", false);
        setField(term84161, term84161.getClass(), "columnLabels", null);
        setField(term84161, term84161.getClass(), "tableau", null);
        setIntField(term84161, term84161.getClass(), "numDecisionVariables", 0);
        setIntField(term84161, term84161.getClass(), "numSlackVariables", 0);
        setIntField(term84161, term84161.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84161, term84161.getClass(), "epsilon", 9.087031959355392E15);
        setIntField(term84161, term84161.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term84136;
        Object retValue = callMethod(klass, "equals", argTypes, term84012, args);
        assertTrue(recursiveEquals(term84012, term84160));
        assertTrue(recursiveEquals(term84136, term84161));
        assertTrue(recursiveEquals(retValue, false));
    }

};


