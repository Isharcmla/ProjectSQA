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

public class SimplexTableau_getRhsOffset_11176061976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63511;
     Object term64748;

    public SimplexTableau_getRhsOffset_11176061976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63511 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term63613 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term63511, term63511.getClass(), "tableau", term63613);
        term64748 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term64749 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term64748, term64748.getClass(), "f", null);
        setField(term64748, term64748.getClass(), "constraints", null);
        setBooleanField(term64748, term64748.getClass(), "restrictToNonNegative", false);
        setIntField(term64749, term64749.getClass(), "rowDimension", 0);
        setIntField(term64749, term64749.getClass(), "columnDimension", 0);
        setField(term64749, term64749.getClass(), "entries", null);
        setField(term64749, term64749.getClass(), "lu", null);
        setField(term64748, term64748.getClass(), "tableau", term64749);
        setIntField(term64748, term64748.getClass(), "numDecisionVariables", 0);
        setIntField(term64748, term64748.getClass(), "numSlackVariables", 0);
        setIntField(term64748, term64748.getClass(), "numArtificialVariables", 0);
        setDoubleField(term64748, term64748.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRhsOffset", argTypes, term63511, args);
        assertTrue(recursiveEquals(term63511, term64748));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


