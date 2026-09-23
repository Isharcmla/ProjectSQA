package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;

public class GnuParser_flatten_140485421215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6350;
     Object term6198;
     Object term6451;
     Object term6452;
     Object term6435;

    public GnuParser_flatten_140485421215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6350 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        term6198 = (Object[]) newArray("java.lang.String", 2);
        setElement(term6198, 0, "--");
        setElement(term6198, 1, "");
        term6451 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        setField(term6451, term6451.getClass(), "cmd", null);
        setField(term6451, term6451.getClass(), "options", null);
        setField(term6451, term6451.getClass(), "requiredOptions", null);
        term6452 = (Object[]) newArray("java.lang.String", 2);
        setElement(term6452, 0, "--");
        setElement(term6452, 1, "");
        term6435 = (Object[]) newArray("java.lang.String", 2);
        setElement(term6435, 0, "--");
        setElement(term6435, 1, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.GnuParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term6198;
        args[2] = false;
        Object retValue = callMethod(klass, "flatten", argTypes, term6350, args);
        assertTrue(recursiveEquals(term6350, term6451));
        assertTrue(recursiveEquals(term6198, term6452));
        assertTrue(recursiveEquals(retValue, term6435));
    }

};


