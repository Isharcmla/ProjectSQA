package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class IRFactory_transformTree_165260666252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67194;
     Object term67430;
     Object term67742;

    public IRFactory_transformTree_165260666252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67194 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term67300 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term67194, term67194.getClass(), "type", 136);
        setField(term67194, term67194.getClass(), "first", null);
        setIntField(term67300, term67300.getClass(), "type", 24);
        setField(term67194, term67194.getClass(), "propListHead", term67300);
        Class<? extends Object> term67754 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term67753 = ((Class) term67754).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term67753).setAccessible(true);
        Object enum93 = ((Field) term67753).get((Object) null);
        term67430 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term67430, term67430.getClass(), "languageMode", enum93);
        term67742 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstRoot");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSourceFile");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.parsing.Config");
        argTypes[4] = Class.forName("com.google.javascript.rhino.head.ErrorReporter");
        Object[] args = new Object[5];
        args[0] = term67194;
        args[1] = null;
        args[2] = "use strict";
        args[3] = term67430;
        args[4] = term67742;
        callMethod(klass, "transformTree", argTypes, null, args);
    }

};


