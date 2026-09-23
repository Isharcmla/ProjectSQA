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

public class TypeCheck_visit_8595247841286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387841;
     Object term388015;

    public TypeCheck_visit_8595247841286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term387841 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term387945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term387841, term387841.getClass(), "typeRegistry", term387945);
        term388015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term388085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term388015, term388015.getClass(), "type", 15);
        setField(term388085, term388085.getClass(), "jsType", null);
        setField(term388015, term388015.getClass(), "first", term388085);
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
        args[1] = term388015;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term387841, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


