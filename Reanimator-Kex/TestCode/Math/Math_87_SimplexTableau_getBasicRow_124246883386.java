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

public class SimplexTableau_getBasicRow_124246883386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63707;
     Object term64770;

    public SimplexTableau_getBasicRow_124246883386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63707 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term63809 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term63707, term63707.getClass(), "numArtificialVariables", 0);
        setField(term63707, term63707.getClass(), "tableau", term63809);
        term64770 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term64771 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term64770, term64770.getClass(), "f", null);
        setField(term64770, term64770.getClass(), "constraints", null);
        setBooleanField(term64770, term64770.getClass(), "restrictToNonNegative", false);
        setIntField(term64771, term64771.getClass(), "rowDimension", 0);
        setIntField(term64771, term64771.getClass(), "columnDimension", 0);
        setField(term64771, term64771.getClass(), "entries", null);
        setField(term64771, term64771.getClass(), "lu", null);
        setField(term64770, term64770.getClass(), "tableau", term64771);
        setIntField(term64770, term64770.getClass(), "numDecisionVariables", 0);
        setIntField(term64770, term64770.getClass(), "numSlackVariables", 0);
        setIntField(term64770, term64770.getClass(), "numArtificialVariables", 0);
        setDoubleField(term64770, term64770.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getBasicRow", argTypes, term63707, args);
        assertTrue(recursiveEquals(term63707, term64770));
        assertTrue(recursiveEquals(retValue, null));
    }

};


