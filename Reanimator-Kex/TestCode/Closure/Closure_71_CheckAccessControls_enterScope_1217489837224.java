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

public class CheckAccessControls_enterScope_1217489837224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65337;
     Object term65427;

    public CheckAccessControls_enterScope_1217489837224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65337 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        ArrayList term65533 = new ArrayList();
        ArrayDeque term65481 = new ArrayDeque((Collection<? extends Object>) term65533);
        ArrayList term65639 = new ArrayList();
        ((ArrayList) term65639).add((Object)null);
        ArrayDeque term65587 = new ArrayDeque((Collection<? extends Object>) term65639);
        term65427 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term65427, term65427.getClass(), "scopes", term65481);
        setField(term65427, term65427.getClass(), "scopeRoots", term65587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term65427;
        callMethod(klass, "enterScope", argTypes, term65337, args);
    }

};


