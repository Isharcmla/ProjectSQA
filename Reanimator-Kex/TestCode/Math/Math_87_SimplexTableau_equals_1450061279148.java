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

public class SimplexTableau_equals_1450061279148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93289;
     Object term93411;
     Object term93433;
     Object term93434;

    public SimplexTableau_equals_1450061279148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93289 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term93289, term93289.getClass(), "restrictToNonNegative", false);
        setIntField(term93289, term93289.getClass(), "numDecisionVariables", 0);
        setIntField(term93289, term93289.getClass(), "numSlackVariables", 0);
        setIntField(term93289, term93289.getClass(), "numArtificialVariables", 0);
        setDoubleField(term93289, term93289.getClass(), "epsilon", 4.6522982477783368E18);
        term93411 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term93411, term93411.getClass(), "restrictToNonNegative", false);
        setIntField(term93411, term93411.getClass(), "numDecisionVariables", 0);
        setIntField(term93411, term93411.getClass(), "numSlackVariables", 0);
        setIntField(term93411, term93411.getClass(), "numArtificialVariables", 0);
        setDoubleField(term93411, term93411.getClass(), "epsilon", 9.087031959355392E15);
        term93433 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term93433, term93433.getClass(), "f", null);
        setField(term93433, term93433.getClass(), "constraints", null);
        setBooleanField(term93433, term93433.getClass(), "restrictToNonNegative", false);
        setField(term93433, term93433.getClass(), "tableau", null);
        setIntField(term93433, term93433.getClass(), "numDecisionVariables", 0);
        setIntField(term93433, term93433.getClass(), "numSlackVariables", 0);
        setIntField(term93433, term93433.getClass(), "numArtificialVariables", 0);
        setDoubleField(term93433, term93433.getClass(), "epsilon", 4.6522982477783368E18);
        term93434 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term93434, term93434.getClass(), "f", null);
        setField(term93434, term93434.getClass(), "constraints", null);
        setBooleanField(term93434, term93434.getClass(), "restrictToNonNegative", false);
        setField(term93434, term93434.getClass(), "tableau", null);
        setIntField(term93434, term93434.getClass(), "numDecisionVariables", 0);
        setIntField(term93434, term93434.getClass(), "numSlackVariables", 0);
        setIntField(term93434, term93434.getClass(), "numArtificialVariables", 0);
        setDoubleField(term93434, term93434.getClass(), "epsilon", 9.087031959355392E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term93411;
        Object retValue = callMethod(klass, "equals", argTypes, term93289, args);
        assertTrue(recursiveEquals(term93289, term93433));
        assertTrue(recursiveEquals(term93411, term93434));
        assertTrue(recursiveEquals(retValue, false));
    }

};


