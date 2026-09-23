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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class DevirtualizePrototypeMethods_rewriteCallSites_57703100718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;
     Object term228;

    public DevirtualizePrototypeMethods_rewriteCallSites_57703100718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term227, term227.getClass(), "compiler", null);
        HashMap term229 = new HashMap();
        term228 = newInstance(Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        setField(term228, term228.getClass(), "compiler", null);
        setField(term228, term228.getClass(), "definitionSiteMap", term229);
        setField(term228, term228.getClass(), "nameDefinitionMultimap", null);
        setField(term228, term228.getClass(), "nameUseSiteMultimap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.DefinitionsRemover$Definition");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term228;
        args[1] = null;
        args[2] = "sjlJAEtRrb";
        try {
            callMethod(klass, "rewriteCallSites", argTypes, term227, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


