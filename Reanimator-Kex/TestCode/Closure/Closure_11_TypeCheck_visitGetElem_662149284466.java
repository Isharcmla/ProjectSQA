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

public class TypeCheck_visitGetElem_662149284466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116103;
     Object term116367;

    public TypeCheck_visitGetElem_662149284466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116103 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term116193 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term116297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term116103, term116103.getClass(), "validator", term116193);
        setField(term116103, term116103.getClass(), "typeRegistry", term116297);
        term116367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term116437, term116437.getClass(), "jsType", null);
        setField(term116367, term116367.getClass(), "first", term116437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term116367;
        try {
            callMethod(klass, "visitGetElem", argTypes, term116103, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


