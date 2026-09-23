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

public class SimplexTableau_equals_619292072150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82573;
     Object term82697;
     Object term82923;
     Object term82924;

    public SimplexTableau_equals_619292072150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82573 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term82573, term82573.getClass(), "restrictToNonNegative", true);
        setIntField(term82573, term82573.getClass(), "numDecisionVariables", 0);
        setIntField(term82573, term82573.getClass(), "numSlackVariables", 0);
        setIntField(term82573, term82573.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82573, term82573.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term82573, term82573.getClass(), "maxUlps", 1);
        term82697 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term82697, term82697.getClass(), "restrictToNonNegative", true);
        setIntField(term82697, term82697.getClass(), "numDecisionVariables", 0);
        setIntField(term82697, term82697.getClass(), "numSlackVariables", 0);
        setIntField(term82697, term82697.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82697, term82697.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term82697, term82697.getClass(), "maxUlps", 0);
        term82923 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term82923, term82923.getClass(), "f", null);
        setField(term82923, term82923.getClass(), "constraints", null);
        setBooleanField(term82923, term82923.getClass(), "restrictToNonNegative", true);
        setField(term82923, term82923.getClass(), "columnLabels", null);
        setField(term82923, term82923.getClass(), "tableau", null);
        setIntField(term82923, term82923.getClass(), "numDecisionVariables", 0);
        setIntField(term82923, term82923.getClass(), "numSlackVariables", 0);
        setIntField(term82923, term82923.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82923, term82923.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term82923, term82923.getClass(), "maxUlps", 1);
        term82924 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term82924, term82924.getClass(), "f", null);
        setField(term82924, term82924.getClass(), "constraints", null);
        setBooleanField(term82924, term82924.getClass(), "restrictToNonNegative", true);
        setField(term82924, term82924.getClass(), "columnLabels", null);
        setField(term82924, term82924.getClass(), "tableau", null);
        setIntField(term82924, term82924.getClass(), "numDecisionVariables", 0);
        setIntField(term82924, term82924.getClass(), "numSlackVariables", 0);
        setIntField(term82924, term82924.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82924, term82924.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term82924, term82924.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82697;
        Object retValue = callMethod(klass, "equals", argTypes, term82573, args);
        assertTrue(recursiveEquals(term82573, term82923));
        assertTrue(recursiveEquals(term82697, term82924));
        assertTrue(recursiveEquals(retValue, false));
    }

};


