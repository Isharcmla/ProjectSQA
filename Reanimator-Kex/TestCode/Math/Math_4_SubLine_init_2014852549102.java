package org.apache.commons.math3.geometry.euclidean.twod;

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
import static org.apache.commons.math3.geometry.euclidean.twod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubLine_init_2014852549102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36543;
     Object term36663;

    public SubLine_init_2014852549102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36423 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term36543 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term36543, term36543.getClass(), "x", 4.7547528221661594E18);
        setDoubleField(term36543, term36543.getClass(), "y", 9.2189043267376261E18);
        term36663 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term36663, term36663.getClass(), "x", -9.223372036854776E18);
        setDoubleField(term36663, term36663.getClass(), "y", 9.2193265036333875E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        argTypes[1] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Object[] args = new Object[2];
        args[0] = term36543;
        args[1] = term36663;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


