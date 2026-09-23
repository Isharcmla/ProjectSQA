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
import java.lang.Object;

public class TypedScopeCreator_createInitialScope_76224746475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43920;
     Object term44070;

    public TypedScopeCreator_createInitialScope_76224746475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43920 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term44000 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term43920, term43920.getClass(), "compiler", term44000);
        setField(term43920, term43920.getClass(), "typeRegistry", null);
        term44070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44070, term44070.getClass(), "type", 0);
        setField(term44070, term44070.getClass(), "parent", null);
        setField(term44070, term44070.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44070;
        try {
            callMethod(klass, "createInitialScope", argTypes, term43920, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


