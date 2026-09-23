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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class GlobalNamespace_isGlobalScope_203822180255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12961;
     Object term13035;
     Object term13047;
     Object term13048;

    public GlobalNamespace_isGlobalScope_203822180255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12961 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        term13035 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term13035, term13035.getClass(), "parent", null);
        term13047 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term13047, term13047.getClass(), "compiler", null);
        setField(term13047, term13047.getClass(), "root", null);
        setField(term13047, term13047.getClass(), "externsRoot", null);
        setBooleanField(term13047, term13047.getClass(), "inExterns", false);
        setField(term13047, term13047.getClass(), "externsScope", null);
        setBooleanField(term13047, term13047.getClass(), "generated", false);
        setIntField(term13047, term13047.getClass(), "currentPreOrderIndex", 0);
        setField(term13047, term13047.getClass(), "globalNames", null);
        setField(term13047, term13047.getClass(), "nameMap", null);
        term13048 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term13048, term13048.getClass(), "vars", null);
        setField(term13048, term13048.getClass(), "parent", null);
        setIntField(term13048, term13048.getClass(), "depth", 0);
        setField(term13048, term13048.getClass(), "rootNode", null);
        setBooleanField(term13048, term13048.getClass(), "isBottom", false);
        setField(term13048, term13048.getClass(), "arguments", null);
        setField(term13048, term13048.getClass(), "typeResolver", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[1];
        args[0] = term13035;
        Object retValue = callMethod(klass, "isGlobalScope", argTypes, term12961, args);
        assertTrue(recursiveEquals(term12961, term13047));
        assertTrue(recursiveEquals(term13035, term13048));
        assertTrue(recursiveEquals(retValue, true));
    }

};


