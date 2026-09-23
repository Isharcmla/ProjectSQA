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

public class FunctionTypeBuilder_inferThisType_149864577085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52651;
     Object term52899;

    public FunctionTypeBuilder_inferThisType_149864577085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52651 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term52755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term52829 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term52651, term52651.getClass(), "typeRegistry", term52755);
        setField(term52651, term52651.getClass(), "scope", term52829);
        setField(term52651, term52651.getClass(), "sourceName", null);
        term52899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52899, term52899.getClass(), "type", 0);
        setIntField(term52899, term52899.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term52899;
        try {
            callMethod(klass, "inferThisType", argTypes, term52651, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


