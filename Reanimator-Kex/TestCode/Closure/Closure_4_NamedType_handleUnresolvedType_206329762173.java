package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class NamedType_handleUnresolvedType_206329762173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42560;
     Object term42820;
     Object term42888;
     Object term42891;

    public NamedType_handleUnresolvedType_206329762173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term42664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term42664, term42664.getClass(), "lastGeneration", true);
        setField(term42560, term42560.getClass(), "registry", term42664);
        setField(term42560, term42560.getClass(), "reference", null);
        setField(term42560, term42560.getClass(), "sourceName", null);
        setIntField(term42560, term42560.getClass(), "lineno", 0);
        setIntField(term42560, term42560.getClass(), "charno", 0);
        term42820 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
        term42888 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
        term42891 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term42820;
        args[1] = false;
        callMethod(klass, "handleUnresolvedType", argTypes, term42560, args);
        assertTrue(recursiveEquals(term42560, term42888));
        assertTrue(recursiveEquals(term42820, "Bad type annotation. Unknown type null"));
    }

};


