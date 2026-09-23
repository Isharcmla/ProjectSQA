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

public class DevirtualizePrototypeMethods_rewriteDefinitionIfEligible_170166681838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7449;
     Object term7541;

    public DevirtualizePrototypeMethods_rewriteDefinitionIfEligible_170166681838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7449 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        term7541 = newInstance(Class.forName("com.google.javascript.jscomp.DefinitionSite"));
        Object term7695 = newInstance(Class.forName("com.google.javascript.jscomp.DefinitionsRemover$FunctionArgumentDefinition"));
        setBooleanField(term7541, term7541.getClass(), "inExterns", false);
        setBooleanField(term7541, term7541.getClass(), "inGlobalScope", true);
        setField(term7541, term7541.getClass(), "definition", term7695);
        setField(term7541, term7541.getClass(), "module", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DefinitionSite");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Object[] args = new Object[2];
        args[0] = term7541;
        args[1] = null;
        callMethod(klass, "rewriteDefinitionIfEligible", argTypes, term7449, args);
    }

};


