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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class Compiler_initInputsByNameMap_1230046040156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972619;

    public Compiler_initInputsByNameMap_1230046040156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term972667 = new HashMap();
        Object term972809 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term972809, term972809.getClass(), "name", null);
        ArrayList term972719 = new ArrayList();
        ((ArrayList) term972719).add(term972809);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        ((ArrayList) term972719).add((Object)null);
        term972619 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term972619, term972619.getClass(), "inputsByName", term972667);
        setField(term972619, term972619.getClass(), "externs", term972719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initInputsByNameMap", argTypes, term972619, args);
    }

};


