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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class SourceMap_setStartingPosition_186594119014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;
     Object term204;
     Object term206;

    public SourceMap_setStartingPosition_186594119014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term189 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term189, term189.getClass(), "prefix", "");
        setField(term189, term189.getClass(), "replacement", "");
        ArrayList term187 = new ArrayList();
        ((ArrayList) term187).add(term189);
        HashMap term194 = new HashMap();
        term186 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term186, term186.getClass(), "generator", null);
        setField(term186, term186.getClass(), "prefixMappings", term187);
        setField(term186, term186.getClass(), "sourceLocationFixupCache", term194);
        term204 = new Integer(1585847225);
        term206 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term204;
        args[1] = term206;
        try {
            callMethod(klass, "setStartingPosition", argTypes, term186, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


