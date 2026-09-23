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
import java.lang.Object;

public class TypedScopeCreator_createInitialScope_76224746492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56690;
     Object term56944;

    public TypedScopeCreator_createInitialScope_76224746492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56690 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term56770 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term56874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term56690, term56690.getClass(), "compiler", term56770);
        setField(term56690, term56690.getClass(), "typeRegistry", term56874);
        term56944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56944, term56944.getClass(), "type", 77);
        setField(term56944, term56944.getClass(), "parent", null);
        setField(term57014, term57014.getClass(), "next", null);
        setIntField(term57014, term57014.getClass(), "type", 0);
        setField(term57014, term57014.getClass(), "first", null);
        setField(term56944, term56944.getClass(), "first", term57014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56944;
        callMethod(klass, "createInitialScope", argTypes, term56690, args);
    }

};


