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

public class SimplexTableau_getBasicRowForSolution_1028492829156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97666;
     Object term97788;

    public SimplexTableau_getBasicRowForSolution_1028492829156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97666 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term97768 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term97666, term97666.getClass(), "numArtificialVariables", 1);
        setField(term97666, term97666.getClass(), "tableau", term97768);
        term97788 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term97789 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term97788, term97788.getClass(), "f", null);
        setField(term97788, term97788.getClass(), "constraints", null);
        setBooleanField(term97788, term97788.getClass(), "restrictToNonNegative", false);
        setIntField(term97789, term97789.getClass(), "rowDimension", 0);
        setIntField(term97789, term97789.getClass(), "columnDimension", 0);
        setField(term97789, term97789.getClass(), "entries", null);
        setField(term97789, term97789.getClass(), "lu", null);
        setField(term97788, term97788.getClass(), "tableau", term97789);
        setIntField(term97788, term97788.getClass(), "numDecisionVariables", 0);
        setIntField(term97788, term97788.getClass(), "numSlackVariables", 0);
        setIntField(term97788, term97788.getClass(), "numArtificialVariables", 1);
        setDoubleField(term97788, term97788.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getBasicRowForSolution", argTypes, term97666, args);
        assertTrue(recursiveEquals(term97666, term97788));
        assertTrue(recursiveEquals(retValue, null));
    }

};


