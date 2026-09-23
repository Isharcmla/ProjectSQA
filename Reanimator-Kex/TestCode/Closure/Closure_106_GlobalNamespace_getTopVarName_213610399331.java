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

public class GlobalNamespace_getTopVarName_213610399331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7223;
     Object term7543;

    public GlobalNamespace_getTopVarName_213610399331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7223 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        term7543 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term7543, term7543.getClass(), "compiler", null);
        setField(term7543, term7543.getClass(), "root", null);
        setField(term7543, term7543.getClass(), "externsRoot", null);
        setBooleanField(term7543, term7543.getClass(), "inExterns", false);
        setField(term7543, term7543.getClass(), "externsScope", null);
        setBooleanField(term7543, term7543.getClass(), "generated", false);
        setField(term7543, term7543.getClass(), "globalNames", null);
        setField(term7543, term7543.getClass(), "nameMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getTopVarName", argTypes, term7223, args);
        assertTrue(recursiveEquals(term7223, term7543));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


