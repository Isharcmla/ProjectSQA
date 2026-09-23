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

public class NodeTraversal_inGlobalScope_1419414636103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19114;

    public NodeTraversal_inGlobalScope_1419414636103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19220 = new ArrayList();
        ((ArrayList) term19220).add((Object)null);
        ArrayDeque term19168 = new ArrayDeque((Collection<? extends Object>) term19220);
        ArrayList term19326 = new ArrayList();
        ArrayDeque term19274 = new ArrayDeque((Collection<? extends Object>) term19326);
        term19114 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term19114, term19114.getClass(), "scopes", term19168);
        setField(term19114, term19114.getClass(), "scopeRoots", term19274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "inGlobalScope", argTypes, term19114, args);
    }

};


