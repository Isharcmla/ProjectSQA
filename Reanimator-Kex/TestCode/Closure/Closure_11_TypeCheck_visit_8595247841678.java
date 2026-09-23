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

public class TypeCheck_visit_8595247841678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543562;
     Object term543736;

    public TypeCheck_visit_8595247841678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543562 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term543666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term543562, term543562.getClass(), "typeRegistry", term543666);
        term543736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term543806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term543736, term543736.getClass(), "type", 90);
        setField(term543806, term543806.getClass(), "jsType", null);
        setField(term543736, term543736.getClass(), "first", term543806);
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
        args[1] = term543736;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term543562, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


