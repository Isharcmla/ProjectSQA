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

public class CodeGenerator_addAllSiblings_124279642254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12938;
     Object term12966;

    public CodeGenerator_addAllSiblings_124279642254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12939 = new HashMap();
        Class<? extends Object> term36712 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term36711 = ((Class) term36712).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term36711).setAccessible(true);
        Object enum95 = ((Field) term36711).get((Object) null);
        term12938 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term12938, term12938.getClass(), "escapedJsStrings", term12939);
        setField(term12938, term12938.getClass(), "cc", null);
        setField(term12938, term12938.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term12938, term12938.getClass(), "preferSingleQuotes", true);
        setBooleanField(term12938, term12938.getClass(), "trustedStrings", false);
        setField(term12938, term12938.getClass(), "languageMode", enum95);
        term12966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12966, term12966.getClass(), "type", 568954359);
        setIntField(term12968, term12968.getClass(), "type", 53410913);
        setIntField(term12970, term12970.getClass(), "type", -375014958);
        setIntField(term12972, term12972.getClass(), "type", 1107176718);
        setIntField(term12974, term12974.getClass(), "type", 480137250);
        setField(term12974, term12974.getClass(), "next", null);
        setField(term12974, term12974.getClass(), "first", null);
        setField(term12974, term12974.getClass(), "last", null);
        setField(term12974, term12974.getClass(), "propListHead", null);
        setIntField(term12974, term12974.getClass(), "sourcePosition", 0);
        setField(term12974, term12974.getClass(), "jsType", null);
        setField(term12974, term12974.getClass(), "parent", null);
        setField(term12972, term12972.getClass(), "next", term12974);
        setIntField(term12977, term12977.getClass(), "type", -341152642);
        setField(term12977, term12977.getClass(), "next", null);
        setField(term12977, term12977.getClass(), "first", null);
        setField(term12977, term12977.getClass(), "last", term12974);
        setField(term12977, term12977.getClass(), "propListHead", null);
        setIntField(term12977, term12977.getClass(), "sourcePosition", 0);
        setField(term12977, term12977.getClass(), "jsType", null);
        setField(term12977, term12977.getClass(), "parent", null);
        setField(term12972, term12972.getClass(), "first", term12977);
        setField(term12972, term12972.getClass(), "last", term12970);
        setField(term12972, term12972.getClass(), "propListHead", null);
        setIntField(term12972, term12972.getClass(), "sourcePosition", 0);
        setField(term12972, term12972.getClass(), "jsType", null);
        setField(term12972, term12972.getClass(), "parent", null);
        setField(term12970, term12970.getClass(), "next", term12972);
        setField(term12970, term12970.getClass(), "first", term12974);
        setIntField(term12981, term12981.getClass(), "type", 538259104);
        setIntField(term12983, term12983.getClass(), "type", 96566506);
        setField(term12983, term12983.getClass(), "next", null);
        setField(term12983, term12983.getClass(), "first", term12977);
        setField(term12983, term12983.getClass(), "last", term12972);
        setField(term12983, term12983.getClass(), "propListHead", null);
        setIntField(term12983, term12983.getClass(), "sourcePosition", 0);
        setField(term12983, term12983.getClass(), "jsType", null);
        setField(term12983, term12983.getClass(), "parent", null);
        setField(term12981, term12981.getClass(), "next", term12983);
        setField(term12981, term12981.getClass(), "first", term12968);
        setField(term12981, term12981.getClass(), "last", term12968);
        setField(term12981, term12981.getClass(), "propListHead", null);
        setIntField(term12981, term12981.getClass(), "sourcePosition", 0);
        setField(term12981, term12981.getClass(), "jsType", null);
        setField(term12981, term12981.getClass(), "parent", null);
        setField(term12970, term12970.getClass(), "last", term12981);
        setField(term12970, term12970.getClass(), "propListHead", null);
        setIntField(term12970, term12970.getClass(), "sourcePosition", 0);
        setField(term12970, term12970.getClass(), "jsType", null);
        setField(term12970, term12970.getClass(), "parent", null);
        setField(term12968, term12968.getClass(), "next", term12970);
        setIntField(term12988, term12988.getClass(), "type", -343325701);
        setField(term12988, term12988.getClass(), "next", term12981);
        setField(term12988, term12988.getClass(), "first", term12983);
        setField(term12988, term12988.getClass(), "last", term12966);
        setField(term12988, term12988.getClass(), "propListHead", null);
        setIntField(term12988, term12988.getClass(), "sourcePosition", 0);
        setField(term12988, term12988.getClass(), "jsType", null);
        setField(term12988, term12988.getClass(), "parent", null);
        setField(term12968, term12968.getClass(), "first", term12988);
        setField(term12968, term12968.getClass(), "last", term12988);
        setField(term12968, term12968.getClass(), "propListHead", null);
        setIntField(term12968, term12968.getClass(), "sourcePosition", 0);
        setField(term12968, term12968.getClass(), "jsType", null);
        setField(term12968, term12968.getClass(), "parent", null);
        setField(term12966, term12966.getClass(), "next", term12968);
        setField(term12966, term12966.getClass(), "first", term12972);
        setField(term12966, term12966.getClass(), "last", term12974);
        setField(term12966, term12966.getClass(), "propListHead", null);
        setIntField(term12966, term12966.getClass(), "sourcePosition", 0);
        setField(term12966, term12966.getClass(), "jsType", null);
        setField(term12966, term12966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12966;
        try {
            callMethod(klass, "addAllSiblings", argTypes, term12938, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


