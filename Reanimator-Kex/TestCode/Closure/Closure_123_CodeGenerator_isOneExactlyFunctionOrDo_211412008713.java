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
     Object term9586;
     Object term9614;

    public CodeGenerator_isOneExactlyFunctionOrDo_211412008713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9587 = new HashMap();
        Class<? extends Object> term9642 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term9641 = ((Class) term9642).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term9641).setAccessible(true);
        Object enum26 = ((Field) term9641).get((Object) null);
        term9586 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term9586, term9586.getClass(), "escapedJsStrings", term9587);
        setField(term9586, term9586.getClass(), "cc", null);
        setField(term9586, term9586.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term9586, term9586.getClass(), "preferSingleQuotes", true);
        setBooleanField(term9586, term9586.getClass(), "trustedStrings", false);
        setField(term9586, term9586.getClass(), "languageMode", enum26);
        term9614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9614, term9614.getClass(), "type", 2055867847);
        setIntField(term9616, term9616.getClass(), "type", -1048298087);
        setIntField(term9618, term9618.getClass(), "type", 292681826);
        setIntField(term9620, term9620.getClass(), "type", 458147407);
        setIntField(term9622, term9622.getClass(), "type", -184153539);
        setField(term9622, term9622.getClass(), "next", null);
        setField(term9622, term9622.getClass(), "first", null);
        setField(term9622, term9622.getClass(), "last", null);
        setField(term9622, term9622.getClass(), "propListHead", null);
        setIntField(term9622, term9622.getClass(), "sourcePosition", 0);
        setField(term9622, term9622.getClass(), "jsType", null);
        setField(term9622, term9622.getClass(), "parent", null);
        setField(term9620, term9620.getClass(), "next", term9622);
        setIntField(term9625, term9625.getClass(), "type", 493620644);
        setField(term9625, term9625.getClass(), "next", null);
        setField(term9625, term9625.getClass(), "first", null);
        setField(term9625, term9625.getClass(), "last", term9622);
        setField(term9625, term9625.getClass(), "propListHead", null);
        setIntField(term9625, term9625.getClass(), "sourcePosition", 0);
        setField(term9625, term9625.getClass(), "jsType", null);
        setField(term9625, term9625.getClass(), "parent", null);
        setField(term9620, term9620.getClass(), "first", term9625);
        setField(term9620, term9620.getClass(), "last", term9618);
        setField(term9620, term9620.getClass(), "propListHead", null);
        setIntField(term9620, term9620.getClass(), "sourcePosition", 0);
        setField(term9620, term9620.getClass(), "jsType", null);
        setField(term9620, term9620.getClass(), "parent", null);
        setField(term9618, term9618.getClass(), "next", term9620);
        setField(term9618, term9618.getClass(), "first", term9622);
        setIntField(term9629, term9629.getClass(), "type", 1596070772);
        setIntField(term9631, term9631.getClass(), "type", 97029295);
        setField(term9631, term9631.getClass(), "next", null);
        setField(term9631, term9631.getClass(), "first", term9625);
        setField(term9631, term9631.getClass(), "last", term9620);
        setField(term9631, term9631.getClass(), "propListHead", null);
        setIntField(term9631, term9631.getClass(), "sourcePosition", 0);
        setField(term9631, term9631.getClass(), "jsType", null);
        setField(term9631, term9631.getClass(), "parent", null);
        setField(term9629, term9629.getClass(), "next", term9631);
        setField(term9629, term9629.getClass(), "first", term9616);
        setField(term9629, term9629.getClass(), "last", term9616);
        setField(term9629, term9629.getClass(), "propListHead", null);
        setIntField(term9629, term9629.getClass(), "sourcePosition", 0);
        setField(term9629, term9629.getClass(), "jsType", null);
        setField(term9629, term9629.getClass(), "parent", null);
        setField(term9618, term9618.getClass(), "last", term9629);
        setField(term9618, term9618.getClass(), "propListHead", null);
        setIntField(term9618, term9618.getClass(), "sourcePosition", 0);
        setField(term9618, term9618.getClass(), "jsType", null);
        setField(term9618, term9618.getClass(), "parent", null);
        setField(term9616, term9616.getClass(), "next", term9618);
        setIntField(term9636, term9636.getClass(), "type", -1371869594);
        setField(term9636, term9636.getClass(), "next", term9629);
        setField(term9636, term9636.getClass(), "first", term9631);
        setField(term9636, term9636.getClass(), "last", term9614);
        setField(term9636, term9636.getClass(), "propListHead", null);
        setIntField(term9636, term9636.getClass(), "sourcePosition", 0);
        setField(term9636, term9636.getClass(), "jsType", null);
        setField(term9636, term9636.getClass(), "parent", null);
        setField(term9616, term9616.getClass(), "first", term9636);
        setField(term9616, term9616.getClass(), "last", term9636);
        setField(term9616, term9616.getClass(), "propListHead", null);
        setIntField(term9616, term9616.getClass(), "sourcePosition", 0);
        setField(term9616, term9616.getClass(), "jsType", null);
        setField(term9616, term9616.getClass(), "parent", null);
        setField(term9614, term9614.getClass(), "next", term9616);
        setField(term9614, term9614.getClass(), "first", term9620);
        setField(term9614, term9614.getClass(), "last", term9622);
        setField(term9614, term9614.getClass(), "propListHead", null);
        setIntField(term9614, term9614.getClass(), "sourcePosition", 0);
        setField(term9614, term9614.getClass(), "jsType", null);
        setField(term9614, term9614.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9614;
        callMethod(klass, "isOneExactlyFunctionOrDo", argTypes, term9586, args);
    }

};


