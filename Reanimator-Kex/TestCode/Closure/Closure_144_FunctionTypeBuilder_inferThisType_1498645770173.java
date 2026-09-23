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

public class FunctionTypeBuilder_inferThisType_1498645770173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81716;
     Object term82012;
     Object term82082;

    public FunctionTypeBuilder_inferThisType_1498645770173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81716 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term81820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term81894 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term81716, term81716.getClass(), "typeRegistry", term81820);
        setField(term81716, term81716.getClass(), "scope", term81894);
        setField(term81716, term81716.getClass(), "sourceName", "");
        term82012 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term82012, term82012.getClass(), "thisType", null);
        setIntField(term82012, term82012.getClass(), "bitset", -1073741824);
        term82082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82082, term82082.getClass(), "type", 0);
        setIntField(term82082, term82082.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term82012;
        args[1] = term82082;
        try {
            callMethod(klass, "inferThisType", argTypes, term81716, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


