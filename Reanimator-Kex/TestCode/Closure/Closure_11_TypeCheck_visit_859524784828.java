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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visit_859524784828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212875;
     Object term213035;

    public TypeCheck_visit_859524784828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212875 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term212965 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term212875, term212875.getClass(), "validator", term212965);
        term213035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term213147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term213035, term213035.getClass(), "type", 28);
        setField(term213035, term213035.getClass(), "first", term213035);
        setField(term213035, term213035.getClass(), "jsType", term213147);
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
        args[1] = term213035;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term212875, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


