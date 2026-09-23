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

public class TypeInference_traverseHook_73608969103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64651;
     Object term64721;

    public TypeInference_traverseHook_73608969103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64651 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term64721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64791, term64791.getClass(), "next", term64861);
        setIntField(term64791, term64791.getClass(), "type", 146);
        setField(term64721, term64721.getClass(), "first", term64791);
        setField(term64721, term64721.getClass(), "last", term64931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term64721;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term64651, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


