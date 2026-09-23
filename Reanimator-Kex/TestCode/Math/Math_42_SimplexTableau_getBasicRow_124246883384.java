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

public class SimplexTableau_getBasicRow_124246883384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64788;
     Object term67020;

    public SimplexTableau_getBasicRow_124246883384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64788 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term64886 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term64788, term64788.getClass(), "tableau", term64886);
        term67020 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term67021 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term67020, term67020.getClass(), "f", null);
        setField(term67020, term67020.getClass(), "constraints", null);
        setBooleanField(term67020, term67020.getClass(), "restrictToNonNegative", false);
        setField(term67020, term67020.getClass(), "columnLabels", null);
        setField(term67021, term67021.getClass(), "blocks", null);
        setIntField(term67021, term67021.getClass(), "rows", 0);
        setIntField(term67021, term67021.getClass(), "columns", 0);
        setIntField(term67021, term67021.getClass(), "blockRows", 0);
        setIntField(term67021, term67021.getClass(), "blockColumns", 0);
        setField(term67020, term67020.getClass(), "tableau", term67021);
        setIntField(term67020, term67020.getClass(), "numDecisionVariables", 0);
        setIntField(term67020, term67020.getClass(), "numSlackVariables", 0);
        setIntField(term67020, term67020.getClass(), "numArtificialVariables", 0);
        setDoubleField(term67020, term67020.getClass(), "epsilon", 0.0);
        setIntField(term67020, term67020.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getBasicRow", argTypes, term64788, args);
        assertTrue(recursiveEquals(term64788, term67020));
        assertTrue(recursiveEquals(retValue, null));
    }

};


