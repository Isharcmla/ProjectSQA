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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_add_135852843041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6596;
     Object term6624;
     Object enum79;

    public CodeGenerator_add_135852843041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6597 = new HashMap();
        Class<? extends Object> term28544 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term28543 = ((Class) term28544).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term28543).setAccessible(true);
        Object enum78 = ((Field) term28543).get((Object) null);
        term6596 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6596, term6596.getClass(), "escapedJsStrings", term6597);
        setField(term6596, term6596.getClass(), "cc", null);
        setField(term6596, term6596.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6596, term6596.getClass(), "preferSingleQuotes", false);
        setBooleanField(term6596, term6596.getClass(), "trustedStrings", false);
        setField(term6596, term6596.getClass(), "languageMode", enum78);
        term6624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6624, term6624.getClass(), "type", 1725571209);
        setIntField(term6626, term6626.getClass(), "type", -522618178);
        setIntField(term6628, term6628.getClass(), "type", 1134449235);
        setIntField(term6630, term6630.getClass(), "type", -883034806);
        setIntField(term6632, term6632.getClass(), "type", 1585847225);
        setField(term6632, term6632.getClass(), "next", null);
        setField(term6632, term6632.getClass(), "first", null);
        setField(term6632, term6632.getClass(), "last", null);
        setField(term6632, term6632.getClass(), "propListHead", null);
        setIntField(term6632, term6632.getClass(), "sourcePosition", 0);
        setField(term6632, term6632.getClass(), "jsType", null);
        setField(term6632, term6632.getClass(), "parent", null);
        setField(term6630, term6630.getClass(), "next", term6632);
        setIntField(term6635, term6635.getClass(), "type", 597278769);
        setField(term6635, term6635.getClass(), "next", null);
        setField(term6635, term6635.getClass(), "first", null);
        setField(term6635, term6635.getClass(), "last", term6632);
        setField(term6635, term6635.getClass(), "propListHead", null);
        setIntField(term6635, term6635.getClass(), "sourcePosition", 0);
        setField(term6635, term6635.getClass(), "jsType", null);
        setField(term6635, term6635.getClass(), "parent", null);
        setField(term6630, term6630.getClass(), "first", term6635);
        setField(term6630, term6630.getClass(), "last", term6628);
        setField(term6630, term6630.getClass(), "propListHead", null);
        setIntField(term6630, term6630.getClass(), "sourcePosition", 0);
        setField(term6630, term6630.getClass(), "jsType", null);
        setField(term6630, term6630.getClass(), "parent", null);
        setField(term6628, term6628.getClass(), "next", term6630);
        setField(term6628, term6628.getClass(), "first", term6632);
        setIntField(term6639, term6639.getClass(), "type", -1456670397);
        setIntField(term6641, term6641.getClass(), "type", 1622346318);
        setField(term6641, term6641.getClass(), "next", null);
        setField(term6641, term6641.getClass(), "first", term6635);
        setField(term6641, term6641.getClass(), "last", term6630);
        setField(term6641, term6641.getClass(), "propListHead", null);
        setIntField(term6641, term6641.getClass(), "sourcePosition", 0);
        setField(term6641, term6641.getClass(), "jsType", null);
        setField(term6641, term6641.getClass(), "parent", null);
        setField(term6639, term6639.getClass(), "next", term6641);
        setField(term6639, term6639.getClass(), "first", term6626);
        setField(term6639, term6639.getClass(), "last", term6626);
        setField(term6639, term6639.getClass(), "propListHead", null);
        setIntField(term6639, term6639.getClass(), "sourcePosition", 0);
        setField(term6639, term6639.getClass(), "jsType", null);
        setField(term6639, term6639.getClass(), "parent", null);
        setField(term6628, term6628.getClass(), "last", term6639);
        setField(term6628, term6628.getClass(), "propListHead", null);
        setIntField(term6628, term6628.getClass(), "sourcePosition", 0);
        setField(term6628, term6628.getClass(), "jsType", null);
        setField(term6628, term6628.getClass(), "parent", null);
        setField(term6626, term6626.getClass(), "next", term6628);
        setIntField(term6646, term6646.getClass(), "type", 1048535127);
        setField(term6646, term6646.getClass(), "next", term6639);
        setField(term6646, term6646.getClass(), "first", term6641);
        setField(term6646, term6646.getClass(), "last", term6624);
        setField(term6646, term6646.getClass(), "propListHead", null);
        setIntField(term6646, term6646.getClass(), "sourcePosition", 0);
        setField(term6646, term6646.getClass(), "jsType", null);
        setField(term6646, term6646.getClass(), "parent", null);
        setField(term6626, term6626.getClass(), "first", term6646);
        setField(term6626, term6626.getClass(), "last", term6646);
        setField(term6626, term6626.getClass(), "propListHead", null);
        setIntField(term6626, term6626.getClass(), "sourcePosition", 0);
        setField(term6626, term6626.getClass(), "jsType", null);
        setField(term6626, term6626.getClass(), "parent", null);
        setField(term6624, term6624.getClass(), "next", term6626);
        setField(term6624, term6624.getClass(), "first", term6630);
        setField(term6624, term6624.getClass(), "last", term6632);
        setField(term6624, term6624.getClass(), "propListHead", null);
        setIntField(term6624, term6624.getClass(), "sourcePosition", 0);
        setField(term6624, term6624.getClass(), "jsType", null);
        setField(term6624, term6624.getClass(), "parent", null);
        Class<? extends Object> term28869 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term28868 = ((Class) term28869).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term28868).setAccessible(true);
        enum79 = ((Field) term28868).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[2];
        args[0] = term6624;
        args[1] = enum79;
        try {
            callMethod(klass, "add", argTypes, term6596, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


