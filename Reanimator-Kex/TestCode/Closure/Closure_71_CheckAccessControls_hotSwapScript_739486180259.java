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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class CheckAccessControls_hotSwapScript_739486180259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75781;
     Object term75851;
     Object term77717;
     Object term77718;

    public CheckAccessControls_hotSwapScript_739486180259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75781 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term75781, term75781.getClass(), "compiler", null);
        term75851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term75851, term75851.getClass(), "type", 0);
        setField(term75921, term75921.getClass(), "next", term75991);
        setIntField(term75921, term75921.getClass(), "type", 30);
        setField(term75921, term75921.getClass(), "first", null);
        setField(term75921, term75921.getClass(), "jsType", term76079);
        setField(term75851, term75851.getClass(), "first", term75921);
        term77717 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term77717, term77717.getClass(), "compiler", null);
        setField(term77717, term77717.getClass(), "validator", null);
        setIntField(term77717, term77717.getClass(), "deprecatedDepth", 0);
        setIntField(term77717, term77717.getClass(), "methodDepth", 0);
        setField(term77717, term77717.getClass(), "currentClass", null);
        setField(term77717, term77717.getClass(), "initializedConstantProperties", null);
        term77718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term77718, term77718.getClass(), "type", 0);
        setField(term77718, term77718.getClass(), "next", null);
        setIntField(term77719, term77719.getClass(), "type", 30);
        setIntField(term77720, term77720.getClass(), "type", 0);
        setField(term77720, term77720.getClass(), "next", null);
        setField(term77720, term77720.getClass(), "first", null);
        setField(term77720, term77720.getClass(), "last", null);
        setField(term77720, term77720.getClass(), "propListHead", null);
        setIntField(term77720, term77720.getClass(), "sourcePosition", 0);
        setField(term77720, term77720.getClass(), "jsType", null);
        setField(term77720, term77720.getClass(), "parent", null);
        setField(term77719, term77719.getClass(), "next", term77720);
        setField(term77719, term77719.getClass(), "first", null);
        setField(term77719, term77719.getClass(), "last", null);
        setField(term77719, term77719.getClass(), "propListHead", null);
        setIntField(term77719, term77719.getClass(), "sourcePosition", 0);
        setField(term77721, term77721.getClass(), "call", null);
        setField(term77721, term77721.getClass(), "prototype", null);
        setField(term77721, term77721.getClass(), "kind", null);
        setField(term77721, term77721.getClass(), "typeOfThis", null);
        setField(term77721, term77721.getClass(), "source", null);
        setField(term77721, term77721.getClass(), "implementedInterfaces", null);
        setField(term77721, term77721.getClass(), "subTypes", null);
        setField(term77721, term77721.getClass(), "templateTypeName", null);
        setField(term77721, term77721.getClass(), "className", null);
        setField(term77721, term77721.getClass(), "properties", null);
        setBooleanField(term77721, term77721.getClass(), "nativeType", false);
        setField(term77721, term77721.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term77721, term77721.getClass(), "prettyPrint", false);
        setBooleanField(term77721, term77721.getClass(), "visited", false);
        setField(term77721, term77721.getClass(), "docInfo", null);
        setBooleanField(term77721, term77721.getClass(), "unknown", false);
        setBooleanField(term77721, term77721.getClass(), "resolved", false);
        setField(term77721, term77721.getClass(), "resolveResult", null);
        setField(term77721, term77721.getClass(), "registry", null);
        setField(term77719, term77719.getClass(), "jsType", term77721);
        setField(term77719, term77719.getClass(), "parent", null);
        setField(term77718, term77718.getClass(), "first", term77719);
        setField(term77718, term77718.getClass(), "last", null);
        setField(term77718, term77718.getClass(), "propListHead", null);
        setIntField(term77718, term77718.getClass(), "sourcePosition", 0);
        setField(term77718, term77718.getClass(), "jsType", null);
        setField(term77718, term77718.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term75851;
        callMethod(klass, "hotSwapScript", argTypes, term75781, args);
        assertTrue(recursiveEquals(term75781, term77717));
        assertTrue(recursiveEquals(term75851, term77718));
    }

};


