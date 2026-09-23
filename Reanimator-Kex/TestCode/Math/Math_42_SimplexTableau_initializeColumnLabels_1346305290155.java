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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SimplexTableau_initializeColumnLabels_1346305290155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87087;

    public SimplexTableau_initializeColumnLabels_1346305290155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term87139 = new ArrayList();
        ((ArrayList) term87139).add((Object)null);
        ((ArrayList) term87139).add((Object)null);
        term87087 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term87279 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setIntField(term87087, term87087.getClass(), "numArtificialVariables", 0);
        setField(term87087, term87087.getClass(), "columnLabels", term87139);
        setField(term87087, term87087.getClass(), "f", term87279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeColumnLabels", argTypes, term87087, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


