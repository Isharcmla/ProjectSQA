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
import java.util.ArrayList;
import java.lang.Object;

public class SimplexTableau_initializeColumnLabels_1346305290221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133514;

    public SimplexTableau_initializeColumnLabels_1346305290221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term133566 = new ArrayList();
        term133514 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term133706 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term133798 = newInstance(Class.forName("org.apache.commons.math.linear.RealVector$2"));
        Object term133900 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setIntField(term133514, term133514.getClass(), "numArtificialVariables", 1);
        setField(term133514, term133514.getClass(), "columnLabels", term133566);
        setField(term133798, term133798.getClass(), "val$v", term133900);
        setField(term133706, term133706.getClass(), "coefficients", term133798);
        setField(term133514, term133514.getClass(), "f", term133706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeColumnLabels", argTypes, term133514, args);
    }

};


