package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeValidator_mismatch_1145070107309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102169;
     Object term102259;
     Object term102391;
     Object term102501;

    public TypeValidator_mismatch_1145070107309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102169 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term102169, term102169.getClass(), "shouldReport", false);
        term102259 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term102259, term102259.getClass(), "sourceName", null);
        term102391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term102501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = term102259;
        args[1] = null;
        args[2] = "{0}\nfound   : {1}\nrequired: {2}";
        args[3] = term102391;
        args[4] = term102501;
        callMethod(klass, "mismatch", argTypes, term102169, args);
    }

};


