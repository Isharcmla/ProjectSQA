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

public class SimplexTableau_subtractRow_170658765273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57335;
     Object term61039;

    public SimplexTableau_subtractRow_170658765273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57335 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term57433 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(term57335, term57335.getClass(), "tableau", term57433);
        term61039 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term61040 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(term61039, term61039.getClass(), "f", null);
        setField(term61039, term61039.getClass(), "constraints", null);
        setBooleanField(term61039, term61039.getClass(), "restrictToNonNegative", false);
        setField(term61040, term61040.getClass(), "blocks", null);
        setIntField(term61040, term61040.getClass(), "rows", 0);
        setIntField(term61040, term61040.getClass(), "columns", 0);
        setIntField(term61040, term61040.getClass(), "blockRows", 0);
        setIntField(term61040, term61040.getClass(), "blockColumns", 0);
        setField(term61040, term61040.getClass(), "lu", null);
        setField(term61039, term61039.getClass(), "tableau", term61040);
        setIntField(term61039, term61039.getClass(), "numDecisionVariables", 0);
        setIntField(term61039, term61039.getClass(), "numSlackVariables", 0);
        setIntField(term61039, term61039.getClass(), "numArtificialVariables", 0);
        setDoubleField(term61039, term61039.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0.0;
        callMethod(klass, "subtractRow", argTypes, term57335, args);
        assertTrue(recursiveEquals(term57335, term61039));
    }

};


