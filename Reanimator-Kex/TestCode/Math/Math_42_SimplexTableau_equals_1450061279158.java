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

public class SimplexTableau_equals_1450061279158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87982;
     Object term88104;
     Object term88524;
     Object term88525;

    public SimplexTableau_equals_1450061279158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87982 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term87982, term87982.getClass(), "restrictToNonNegative", false);
        setIntField(term87982, term87982.getClass(), "numDecisionVariables", 0);
        setIntField(term87982, term87982.getClass(), "numSlackVariables", 0);
        setIntField(term87982, term87982.getClass(), "numArtificialVariables", 0);
        setDoubleField(term87982, term87982.getClass(), "epsilon", 4.6522982477783368E18);
        term88104 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term88104, term88104.getClass(), "restrictToNonNegative", false);
        setIntField(term88104, term88104.getClass(), "numDecisionVariables", 0);
        setIntField(term88104, term88104.getClass(), "numSlackVariables", 0);
        setIntField(term88104, term88104.getClass(), "numArtificialVariables", 0);
        setDoubleField(term88104, term88104.getClass(), "epsilon", 9.087031959355392E15);
        term88524 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term88524, term88524.getClass(), "f", null);
        setField(term88524, term88524.getClass(), "constraints", null);
        setBooleanField(term88524, term88524.getClass(), "restrictToNonNegative", false);
        setField(term88524, term88524.getClass(), "columnLabels", null);
        setField(term88524, term88524.getClass(), "tableau", null);
        setIntField(term88524, term88524.getClass(), "numDecisionVariables", 0);
        setIntField(term88524, term88524.getClass(), "numSlackVariables", 0);
        setIntField(term88524, term88524.getClass(), "numArtificialVariables", 0);
        setDoubleField(term88524, term88524.getClass(), "epsilon", 4.6522982477783368E18);
        setIntField(term88524, term88524.getClass(), "maxUlps", 0);
        term88525 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term88525, term88525.getClass(), "f", null);
        setField(term88525, term88525.getClass(), "constraints", null);
        setBooleanField(term88525, term88525.getClass(), "restrictToNonNegative", false);
        setField(term88525, term88525.getClass(), "columnLabels", null);
        setField(term88525, term88525.getClass(), "tableau", null);
        setIntField(term88525, term88525.getClass(), "numDecisionVariables", 0);
        setIntField(term88525, term88525.getClass(), "numSlackVariables", 0);
        setIntField(term88525, term88525.getClass(), "numArtificialVariables", 0);
        setDoubleField(term88525, term88525.getClass(), "epsilon", 9.087031959355392E15);
        setIntField(term88525, term88525.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term88104;
        Object retValue = callMethod(klass, "equals", argTypes, term87982, args);
        assertTrue(recursiveEquals(term87982, term88524));
        assertTrue(recursiveEquals(term88104, term88525));
        assertTrue(recursiveEquals(retValue, false));
    }

};


