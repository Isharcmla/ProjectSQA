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

public class TypeCheck_check_233062943176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85305;
     Object term85529;

    public TypeCheck_check_233062943176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85305 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term85385 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term85459 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term85305, term85305.getClass(), "compiler", term85385);
        setField(term85305, term85305.getClass(), "scopeCreator", null);
        setBooleanField(term85305, term85305.getClass(), "inExterns", false);
        setField(term85459, term85459.getClass(), "parent", null);
        setField(term85305, term85305.getClass(), "topScope", term85459);
        term85529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85529, term85529.getClass(), "type", 0);
        setField(term85599, term85599.getClass(), "next", term85669);
        setIntField(term85599, term85599.getClass(), "type", 70);
        setField(term85599, term85599.getClass(), "first", null);
        setField(term85529, term85529.getClass(), "first", term85599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term85529;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term85305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


