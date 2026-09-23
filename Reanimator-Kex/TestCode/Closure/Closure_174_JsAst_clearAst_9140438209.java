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

public class JsAst_clearAst_9140438209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;
     Object term1635;

    public JsAst_clearAst_9140438209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term228 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term241 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term267 = (int[]) newIntArray(3);
        Object term295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term228, term228.getClass(), "id", "hRNSzYYIrc");
        setField(term227, term227.getClass(), "inputId", term228);
        setField(term241, term241.getClass(), "fileName", "RMFIsYGgne");
        setBooleanField(term241, term241.getClass(), "isExternFile", false);
        setField(term241, term241.getClass(), "originalPath", "NRdvgJlhkX");
        setIntElement(term267, 0, 1622346318);
        setIntElement(term267, 1, 1048535127);
        setIntElement(term267, 2, -655067527);
        setField(term241, term241.getClass(), "lineOffsets", term267);
        setField(term241, term241.getClass(), "code", "uuaPigETmJ");
        setField(term227, term227.getClass(), "sourceFile", term241);
        setField(term227, term227.getClass(), "fileName", "MxlszYVzRf");
        setIntField(term295, term295.getClass(), "type", -6029667);
        setIntField(term297, term297.getClass(), "type", -2068769794);
        setIntField(term299, term299.getClass(), "type", -117576464);
        setIntField(term301, term301.getClass(), "type", -1007160944);
        setField(term301, term301.getClass(), "next", null);
        setField(term301, term301.getClass(), "first", null);
        setField(term301, term301.getClass(), "last", null);
        setField(term301, term301.getClass(), "propListHead", null);
        setIntField(term301, term301.getClass(), "sourcePosition", 0);
        setField(term301, term301.getClass(), "jsType", null);
        setField(term301, term301.getClass(), "parent", null);
        setField(term299, term299.getClass(), "next", term301);
        setIntField(term304, term304.getClass(), "type", -1275173084);
        setField(term304, term304.getClass(), "next", null);
        setField(term304, term304.getClass(), "first", term295);
        setField(term304, term304.getClass(), "last", null);
        setField(term304, term304.getClass(), "propListHead", null);
        setIntField(term304, term304.getClass(), "sourcePosition", 0);
        setField(term304, term304.getClass(), "jsType", null);
        setField(term304, term304.getClass(), "parent", null);
        setField(term299, term299.getClass(), "first", term304);
        setIntField(term307, term307.getClass(), "type", 590364439);
        setField(term307, term307.getClass(), "next", null);
        setField(term307, term307.getClass(), "first", term297);
        setField(term307, term307.getClass(), "last", null);
        setField(term307, term307.getClass(), "propListHead", null);
        setIntField(term307, term307.getClass(), "sourcePosition", 0);
        setField(term307, term307.getClass(), "jsType", null);
        setField(term307, term307.getClass(), "parent", null);
        setField(term299, term299.getClass(), "last", term307);
        setField(term299, term299.getClass(), "propListHead", null);
        setIntField(term299, term299.getClass(), "sourcePosition", 0);
        setField(term299, term299.getClass(), "jsType", null);
        setField(term299, term299.getClass(), "parent", null);
        setField(term297, term297.getClass(), "next", term299);
        setField(term297, term297.getClass(), "first", term299);
        setIntField(term311, term311.getClass(), "type", 1135664017);
        setField(term311, term311.getClass(), "next", term307);
        setField(term311, term311.getClass(), "first", term304);
        setField(term311, term311.getClass(), "last", term304);
        setField(term311, term311.getClass(), "propListHead", null);
        setIntField(term311, term311.getClass(), "sourcePosition", 0);
        setField(term311, term311.getClass(), "jsType", null);
        setField(term311, term311.getClass(), "parent", null);
        setField(term297, term297.getClass(), "last", term311);
        setField(term297, term297.getClass(), "propListHead", null);
        setIntField(term297, term297.getClass(), "sourcePosition", 0);
        setField(term297, term297.getClass(), "jsType", null);
        setField(term297, term297.getClass(), "parent", null);
        setField(term295, term295.getClass(), "next", term297);
        setField(term295, term295.getClass(), "first", term304);
        setIntField(term315, term315.getClass(), "type", 0);
        setField(term315, term315.getClass(), "next", null);
        setField(term315, term315.getClass(), "first", null);
        setField(term315, term315.getClass(), "last", null);
        setField(term315, term315.getClass(), "propListHead", null);
        setIntField(term315, term315.getClass(), "sourcePosition", 0);
        setField(term315, term315.getClass(), "jsType", null);
        setField(term315, term315.getClass(), "parent", null);
        setField(term295, term295.getClass(), "last", term315);
        setField(term295, term295.getClass(), "propListHead", null);
        setIntField(term295, term295.getClass(), "sourcePosition", 0);
        setField(term295, term295.getClass(), "jsType", null);
        setField(term295, term295.getClass(), "parent", null);
        setField(term227, term227.getClass(), "root", term295);
        term1635 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term1636 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term1639 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term1644 = (int[]) newIntArray(3);
        setField(term1636, term1636.getClass(), "id", "hRNSzYYIrc");
        setField(term1635, term1635.getClass(), "inputId", term1636);
        setField(term1639, term1639.getClass(), "fileName", "RMFIsYGgne");
        setBooleanField(term1639, term1639.getClass(), "isExternFile", false);
        setField(term1639, term1639.getClass(), "originalPath", "NRdvgJlhkX");
        setIntElement(term1644, 0, 1622346318);
        setIntElement(term1644, 1, 1048535127);
        setIntElement(term1644, 2, -655067527);
        setField(term1639, term1639.getClass(), "lineOffsets", term1644);
        setField(term1639, term1639.getClass(), "code", "uuaPigETmJ");
        setField(term1635, term1635.getClass(), "sourceFile", term1639);
        setField(term1635, term1635.getClass(), "fileName", "MxlszYVzRf");
        setField(term1635, term1635.getClass(), "root", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearAst", argTypes, term227, args);
        assertTrue(recursiveEquals(term227, term1635));
    }

};


