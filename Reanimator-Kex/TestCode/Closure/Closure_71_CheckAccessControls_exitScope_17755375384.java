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
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class CheckAccessControls_exitScope_17755375384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23578;
     Object term23668;

    public CheckAccessControls_exitScope_17755375384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23578 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        ArrayList term23774 = new ArrayList();
        ArrayDeque term23722 = new ArrayDeque((Collection<? extends Object>) term23774);
        ArrayList term23880 = new ArrayList();
        ((ArrayList) term23880).add((Object)null);
        ArrayDeque term23828 = new ArrayDeque((Collection<? extends Object>) term23880);
        term23668 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term23668, term23668.getClass(), "scopes", term23722);
        setField(term23668, term23668.getClass(), "scopeRoots", term23828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term23668;
        callMethod(klass, "exitScope", argTypes, term23578, args);
    }

};


