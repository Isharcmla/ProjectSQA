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

public class ReferenceCollectingCallback_exitScope_127262624157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9116;

    public ReferenceCollectingCallback_exitScope_127262624157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9222 = new ArrayList();
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ((ArrayList) term9222).add((Object)null);
        ArrayDeque term9170 = new ArrayDeque((Collection<? extends Object>) term9222);
        HashMap term9430 = new HashMap();
        term9116 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term9382 = newInstance(Class.forName("com.google.javascript.jscomp.VariableReferenceCheck$ReferenceCheckingBehavior"));
        setField(term9116, term9116.getClass(), "blockStack", term9170);
        setField(term9116, term9116.getClass(), "behavior", term9382);
        setField(term9116, term9116.getClass(), "referenceMap", term9430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "exitScope", argTypes, term9116, args);
    }

};


