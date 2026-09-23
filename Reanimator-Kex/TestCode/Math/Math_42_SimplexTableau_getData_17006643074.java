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

public class SimplexTableau_getData_17006643074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63930;
     Object term64160;
     Object term64151;

    public SimplexTableau_getData_17006643074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63930 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term64038 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term63930, term63930.getClass(), "tableau", term64038);
        term64160 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term64161 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term64160, term64160.getClass(), "f", null);
        setField(term64160, term64160.getClass(), "constraints", null);
        setBooleanField(term64160, term64160.getClass(), "restrictToNonNegative", false);
        setField(term64160, term64160.getClass(), "columnLabels", null);
        setField(term64161, term64161.getClass(), "data", null);
        setField(term64160, term64160.getClass(), "tableau", term64161);
        setIntField(term64160, term64160.getClass(), "numDecisionVariables", 0);
        setIntField(term64160, term64160.getClass(), "numSlackVariables", 0);
        setIntField(term64160, term64160.getClass(), "numArtificialVariables", 0);
        setDoubleField(term64160, term64160.getClass(), "epsilon", 0.0);
        setIntField(term64160, term64160.getClass(), "maxUlps", 0);
        term64151 = (Object[]) newArray("[D", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getData", argTypes, term63930, args);
        assertTrue(recursiveEquals(term63930, term64160));
        assertTrue(recursiveEquals(retValue, term64151));
    }

};


