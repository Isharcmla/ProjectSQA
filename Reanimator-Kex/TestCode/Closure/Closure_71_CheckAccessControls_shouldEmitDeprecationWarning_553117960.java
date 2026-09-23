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

public class CheckAccessControls_shouldEmitDeprecationWarning_553117960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13350;
     Object term13440;

    public CheckAccessControls_shouldEmitDeprecationWarning_553117960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13350 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        ArrayList term13546 = new ArrayList();
        ArrayDeque term13494 = new ArrayDeque((Collection<? extends Object>) term13546);
        ArrayList term13652 = new ArrayList();
        ((ArrayList) term13652).add((Object)null);
        ArrayDeque term13600 = new ArrayDeque((Collection<? extends Object>) term13652);
        term13440 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term13440, term13440.getClass(), "scopes", term13494);
        setField(term13440, term13440.getClass(), "scopeRoots", term13600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term13440;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "shouldEmitDeprecationWarning", argTypes, term13350, args);
    }

};


