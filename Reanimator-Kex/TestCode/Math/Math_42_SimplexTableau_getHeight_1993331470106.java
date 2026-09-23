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

public class SimplexTableau_getHeight_1993331470106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71220;
     Object term71583;

    public SimplexTableau_getHeight_1993331470106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71220 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term71318 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term71220, term71220.getClass(), "tableau", term71318);
        term71583 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term71584 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term71583, term71583.getClass(), "f", null);
        setField(term71583, term71583.getClass(), "constraints", null);
        setBooleanField(term71583, term71583.getClass(), "restrictToNonNegative", false);
        setField(term71583, term71583.getClass(), "columnLabels", null);
        setField(term71584, term71584.getClass(), "blocks", null);
        setIntField(term71584, term71584.getClass(), "rows", 0);
        setIntField(term71584, term71584.getClass(), "columns", 0);
        setIntField(term71584, term71584.getClass(), "blockRows", 0);
        setIntField(term71584, term71584.getClass(), "blockColumns", 0);
        setField(term71583, term71583.getClass(), "tableau", term71584);
        setIntField(term71583, term71583.getClass(), "numDecisionVariables", 0);
        setIntField(term71583, term71583.getClass(), "numSlackVariables", 0);
        setIntField(term71583, term71583.getClass(), "numArtificialVariables", 0);
        setDoubleField(term71583, term71583.getClass(), "epsilon", 0.0);
        setIntField(term71583, term71583.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeight", argTypes, term71220, args);
        assertTrue(recursiveEquals(term71220, term71583));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


