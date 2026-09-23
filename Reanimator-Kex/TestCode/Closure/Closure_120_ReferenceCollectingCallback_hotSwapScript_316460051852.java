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
import java.lang.Object;

public class ReferenceCollectingCallback_hotSwapScript_316460051852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345727;
     Object term345991;

    public ReferenceCollectingCallback_hotSwapScript_316460051852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345727 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term345807 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term345899 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term345899, term345899.getClass(), "inLoop", true);
        setField(term345899, term345899.getClass(), "jsRoot", null);
        setField(term345807, term345807.getClass(), "phaseOptimizer", term345899);
        setField(term345727, term345727.getClass(), "compiler", term345807);
        term345991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term345991, term345991.getClass(), "type", 132);
        setField(term345991, term345991.getClass(), "propListHead", null);
        setField(term345991, term345991.getClass(), "parent", term345991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term345991;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term345727, args);
    }

};


