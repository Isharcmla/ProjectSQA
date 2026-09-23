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

public class GlobalNamespace_getScope_7875078332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4683;
     Object term7666;

    public GlobalNamespace_getScope_7875078332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4683 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term4683, term4683.getClass(), "compiler", null);
        setField(term4683, term4683.getClass(), "root", null);
        setField(term4683, term4683.getClass(), "externsRoot", null);
        setBooleanField(term4683, term4683.getClass(), "inExterns", false);
        setField(term4683, term4683.getClass(), "externsScope", null);
        setBooleanField(term4683, term4683.getClass(), "generated", false);
        setIntField(term4683, term4683.getClass(), "currentPreOrderIndex", 0);
        setField(term4683, term4683.getClass(), "globalNames", null);
        setField(term4683, term4683.getClass(), "nameMap", null);
        term7666 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term7666, term7666.getClass(), "compiler", null);
        setField(term7666, term7666.getClass(), "root", null);
        setField(term7666, term7666.getClass(), "externsRoot", null);
        setBooleanField(term7666, term7666.getClass(), "inExterns", false);
        setField(term7666, term7666.getClass(), "externsScope", null);
        setBooleanField(term7666, term7666.getClass(), "generated", false);
        setIntField(term7666, term7666.getClass(), "currentPreOrderIndex", 0);
        setField(term7666, term7666.getClass(), "globalNames", null);
        setField(term7666, term7666.getClass(), "nameMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getScope", argTypes, term4683, args);
        assertTrue(recursiveEquals(term4683, term7666));
    }

};


