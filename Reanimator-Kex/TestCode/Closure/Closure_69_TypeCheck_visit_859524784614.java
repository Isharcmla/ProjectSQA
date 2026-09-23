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
import java.lang.Object;

public class TypeCheck_visit_859524784614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195317;
     Object term195581;

    public TypeCheck_visit_859524784614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195317 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term195407 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term195511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term195317, term195317.getClass(), "validator", term195407);
        setField(term195317, term195317.getClass(), "typeRegistry", term195511);
        term195581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term195651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term195581, term195581.getClass(), "type", 28);
        setField(term195651, term195651.getClass(), "jsType", null);
        setField(term195581, term195581.getClass(), "first", term195651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term195581;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term195317, args);
    }

};


