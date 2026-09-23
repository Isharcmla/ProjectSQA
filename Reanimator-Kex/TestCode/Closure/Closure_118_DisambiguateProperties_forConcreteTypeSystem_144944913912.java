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
import java.util.LinkedHashMap;

public class DisambiguateProperties_forConcreteTypeSystem_144944913912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term82;

    public DisambiguateProperties_forConcreteTypeSystem_144944913912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term70 = new HashMap();
        term69 = newInstance(Class.forName("com.google.javascript.jscomp.TightenTypes"));
        setField(term69, term69.getClass(), "compiler", null);
        setField(term69, term69.getClass(), "functionFromDeclaration", term70);
        setField(term69, term69.getClass(), "functionFromJSType", null);
        setField(term69, term69.getClass(), "instanceFromJSType", null);
        setField(term69, term69.getClass(), "typeIntersectionMemos", null);
        setField(term69, term69.getClass(), "topScope", null);
        setField(term69, term69.getClass(), "allInstantiatedTypes", null);
        term82 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.TightenTypes");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term69;
        args[2] = term82;
        try {
            callMethod(klass, "forConcreteTypeSystem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


