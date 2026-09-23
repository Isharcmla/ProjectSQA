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
import java.util.HashMap;

public class ReferenceCollectingCallback_exitScope_127262624134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6212;

    public ReferenceCollectingCallback_exitScope_127262624134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6318 = new ArrayList();
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ((ArrayList) term6318).add((Object)null);
        ArrayDeque term6266 = new ArrayDeque((Collection<? extends Object>) term6318);
        HashMap term6526 = new HashMap();
        term6212 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term6478 = newInstance(Class.forName("com.google.javascript.jscomp.VariableReferenceCheck$ReferenceCheckingBehavior"));
        setField(term6212, term6212.getClass(), "blockStack", term6266);
        setField(term6212, term6212.getClass(), "behavior", term6478);
        setField(term6212, term6212.getClass(), "referenceMap", term6526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "exitScope", argTypes, term6212, args);
    }

};


