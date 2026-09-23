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

public class SimplexTableau_getOriginalNumDecisionVariables_1137505491104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71819;
     Object term72078;

    public SimplexTableau_getOriginalNumDecisionVariables_1137505491104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71819 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term71819, term71819.getClass(), "restrictToNonNegative", false);
        term72078 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term72078, term72078.getClass(), "f", null);
        setField(term72078, term72078.getClass(), "constraints", null);
        setBooleanField(term72078, term72078.getClass(), "restrictToNonNegative", false);
        setField(term72078, term72078.getClass(), "tableau", null);
        setIntField(term72078, term72078.getClass(), "numDecisionVariables", 0);
        setIntField(term72078, term72078.getClass(), "numSlackVariables", 0);
        setIntField(term72078, term72078.getClass(), "numArtificialVariables", 0);
        setDoubleField(term72078, term72078.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOriginalNumDecisionVariables", argTypes, term71819, args);
        assertTrue(recursiveEquals(term71819, term72078));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


