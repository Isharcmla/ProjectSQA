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
import java.lang.Object;

public class DevirtualizePrototypeMethods_isEligibleDefinition_209337946934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3696;
     Object term3788;
     Object term6531;
     Object term6532;

    public DevirtualizePrototypeMethods_isEligibleDefinition_209337946934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3696 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        term3788 = newInstance(Class.forName("com.google.javascript.jscomp.DefinitionSite"));
        Object term3952 = newInstance(Class.forName("com.google.javascript.jscomp.DefinitionsRemover$ObjectLiteralPropertyDefinition"));
        setField(term3788, term3788.getClass(), "definition", term3952);
        setField(term3788, term3788.getClass(), "module", null);
        term6531 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term6531, term6531.getClass(), "compiler", null);
        term6532 = newInstance(Class.forName("com.google.javascript.jscomp.DefinitionSite"));
        Object term6533 = newInstance(Class.forName("com.google.javascript.jscomp.DefinitionsRemover$ObjectLiteralPropertyDefinition"));
        setField(term6532, term6532.getClass(), "node", null);
        setField(term6533, term6533.getClass(), "literal", null);
        setField(term6533, term6533.getClass(), "name", null);
        setField(term6533, term6533.getClass(), "value", null);
        setField(term6532, term6532.getClass(), "definition", term6533);
        setField(term6532, term6532.getClass(), "module", null);
        setBooleanField(term6532, term6532.getClass(), "inGlobalScope", false);
        setBooleanField(term6532, term6532.getClass(), "inExterns", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.DefinitionSite");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3788;
        Object retValue = callMethod(klass, "isEligibleDefinition", argTypes, term3696, args);
        assertTrue(recursiveEquals(term3696, term6531));
        assertTrue(recursiveEquals(term3788, term6532));
        assertTrue(recursiveEquals(retValue, false));
    }

};


