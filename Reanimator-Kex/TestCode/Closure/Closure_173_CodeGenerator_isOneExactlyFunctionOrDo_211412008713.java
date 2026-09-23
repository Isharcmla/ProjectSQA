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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_isOneExactlyFunctionOrDo_211412008713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9589;
     Object term9617;

    public CodeGenerator_isOneExactlyFunctionOrDo_211412008713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9590 = new HashMap();
        Class<? extends Object> term9645 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term9644 = ((Class) term9645).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term9644).setAccessible(true);
        Object enum26 = ((Field) term9644).get((Object) null);
        term9589 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term9589, term9589.getClass(), "escapedJsStrings", term9590);
        setField(term9589, term9589.getClass(), "cc", null);
        setField(term9589, term9589.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term9589, term9589.getClass(), "preferSingleQuotes", false);
        setBooleanField(term9589, term9589.getClass(), "trustedStrings", true);
        setField(term9589, term9589.getClass(), "languageMode", enum26);
        term9617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9617, term9617.getClass(), "type", 2055867847);
        setIntField(term9619, term9619.getClass(), "type", -1048298087);
        setIntField(term9621, term9621.getClass(), "type", 292681826);
        setIntField(term9623, term9623.getClass(), "type", 458147407);
        setIntField(term9625, term9625.getClass(), "type", -184153539);
        setField(term9625, term9625.getClass(), "next", null);
        setField(term9625, term9625.getClass(), "first", null);
        setField(term9625, term9625.getClass(), "last", null);
        setField(term9625, term9625.getClass(), "propListHead", null);
        setIntField(term9625, term9625.getClass(), "sourcePosition", 0);
        setField(term9625, term9625.getClass(), "jsType", null);
        setField(term9625, term9625.getClass(), "parent", null);
        setField(term9623, term9623.getClass(), "next", term9625);
        setIntField(term9628, term9628.getClass(), "type", 493620644);
        setField(term9628, term9628.getClass(), "next", null);
        setField(term9628, term9628.getClass(), "first", null);
        setField(term9628, term9628.getClass(), "last", term9625);
        setField(term9628, term9628.getClass(), "propListHead", null);
        setIntField(term9628, term9628.getClass(), "sourcePosition", 0);
        setField(term9628, term9628.getClass(), "jsType", null);
        setField(term9628, term9628.getClass(), "parent", null);
        setField(term9623, term9623.getClass(), "first", term9628);
        setField(term9623, term9623.getClass(), "last", term9621);
        setField(term9623, term9623.getClass(), "propListHead", null);
        setIntField(term9623, term9623.getClass(), "sourcePosition", 0);
        setField(term9623, term9623.getClass(), "jsType", null);
        setField(term9623, term9623.getClass(), "parent", null);
        setField(term9621, term9621.getClass(), "next", term9623);
        setField(term9621, term9621.getClass(), "first", term9625);
        setIntField(term9632, term9632.getClass(), "type", 1596070772);
        setIntField(term9634, term9634.getClass(), "type", 97029295);
        setField(term9634, term9634.getClass(), "next", null);
        setField(term9634, term9634.getClass(), "first", term9628);
        setField(term9634, term9634.getClass(), "last", term9623);
        setField(term9634, term9634.getClass(), "propListHead", null);
        setIntField(term9634, term9634.getClass(), "sourcePosition", 0);
        setField(term9634, term9634.getClass(), "jsType", null);
        setField(term9634, term9634.getClass(), "parent", null);
        setField(term9632, term9632.getClass(), "next", term9634);
        setField(term9632, term9632.getClass(), "first", term9619);
        setField(term9632, term9632.getClass(), "last", term9619);
        setField(term9632, term9632.getClass(), "propListHead", null);
        setIntField(term9632, term9632.getClass(), "sourcePosition", 0);
        setField(term9632, term9632.getClass(), "jsType", null);
        setField(term9632, term9632.getClass(), "parent", null);
        setField(term9621, term9621.getClass(), "last", term9632);
        setField(term9621, term9621.getClass(), "propListHead", null);
        setIntField(term9621, term9621.getClass(), "sourcePosition", 0);
        setField(term9621, term9621.getClass(), "jsType", null);
        setField(term9621, term9621.getClass(), "parent", null);
        setField(term9619, term9619.getClass(), "next", term9621);
        setIntField(term9639, term9639.getClass(), "type", -1371869594);
        setField(term9639, term9639.getClass(), "next", term9632);
        setField(term9639, term9639.getClass(), "first", term9634);
        setField(term9639, term9639.getClass(), "last", term9617);
        setField(term9639, term9639.getClass(), "propListHead", null);
        setIntField(term9639, term9639.getClass(), "sourcePosition", 0);
        setField(term9639, term9639.getClass(), "jsType", null);
        setField(term9639, term9639.getClass(), "parent", null);
        setField(term9619, term9619.getClass(), "first", term9639);
        setField(term9619, term9619.getClass(), "last", term9639);
        setField(term9619, term9619.getClass(), "propListHead", null);
        setIntField(term9619, term9619.getClass(), "sourcePosition", 0);
        setField(term9619, term9619.getClass(), "jsType", null);
        setField(term9619, term9619.getClass(), "parent", null);
        setField(term9617, term9617.getClass(), "next", term9619);
        setField(term9617, term9617.getClass(), "first", term9623);
        setField(term9617, term9617.getClass(), "last", term9625);
        setField(term9617, term9617.getClass(), "propListHead", null);
        setIntField(term9617, term9617.getClass(), "sourcePosition", 0);
        setField(term9617, term9617.getClass(), "jsType", null);
        setField(term9617, term9617.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9617;
        callMethod(klass, "isOneExactlyFunctionOrDo", argTypes, term9589, args);
    }

};


