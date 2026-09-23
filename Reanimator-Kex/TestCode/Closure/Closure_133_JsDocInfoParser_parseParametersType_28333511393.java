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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class JsDocInfoParser_parseParametersType_28333511393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18248;
     Object enum200;

    public JsDocInfoParser_parseParametersType_28333511393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18299 = new ArrayList();
        ((ArrayList) term18299).add((Object)null);
        ((ArrayList) term18299).add((Object)null);
        ((ArrayList) term18299).add((Object)null);
        ((ArrayList) term18299).add((Object)null);
        ((ArrayList) term18299).add((Object)null);
        ((ArrayList) term18299).add((Object)null);
        ((ArrayList) term18299).add((Object)null);
        ArrayList term18302 = new ArrayList();
        ((ArrayList) term18302).add((Object)null);
        ((ArrayList) term18302).add((Object)null);
        ((ArrayList) term18302).add((Object)null);
        ((ArrayList) term18302).add((Object)null);
        HashMap term18305 = new HashMap();
        ArrayList term18310 = new ArrayList();
        ((ArrayList) term18310).add((Object)null);
        ((ArrayList) term18310).add((Object)null);
        ((ArrayList) term18310).add((Object)null);
        ((ArrayList) term18310).add((Object)null);
        ((ArrayList) term18310).add((Object)null);
        ((ArrayList) term18310).add((Object)null);
        ((ArrayList) term18310).add((Object)null);
        ((ArrayList) term18310).add((Object)null);
        Class<? extends Object> term114784 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term114783 = ((Class) term114784).getDeclaredField((String) "PROTECTED");
        ((Field) term114783).setAccessible(true);
        Object enum198 = ((Field) term114783).get((Object) null);
        term18248 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term18249 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term18262 = (char[]) newCharArray(3);
        int[] term18267 = (int[]) newIntArray(2);
        Object term18295 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term18296 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term18297 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term18298 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18314 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term18315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18322 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18324 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18329 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term18330 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term18335 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term18340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18249, term18249.getClass(), "string", "zgKiINdgNu");
        setCharElement(term18262, 0, 's');
        setCharElement(term18262, 1, 'z');
        setCharElement(term18262, 2, 'Y');
        setField(term18249, term18249.getClass(), "stringBuffer", term18262);
        setIntField(term18249, term18249.getClass(), "stringBufferTop", 2040965507);
        setIntElement(term18267, 0, -1281083262);
        setIntElement(term18267, 1, 1059930704);
        setField(term18249, term18249.getClass(), "ungetBuffer", term18267);
        setIntField(term18249, term18249.getClass(), "ungetCursor", -1967153290);
        setBooleanField(term18249, term18249.getClass(), "hitEOF", false);
        setIntField(term18249, term18249.getClass(), "lineStart", -1397251956);
        setIntField(term18249, term18249.getClass(), "lineEndChar", -796934571);
        setIntField(term18249, term18249.getClass(), "lineno", 405295896);
        setIntField(term18249, term18249.getClass(), "charno", -814977075);
        setIntField(term18249, term18249.getClass(), "initCharno", 808614267);
        setIntField(term18249, term18249.getClass(), "initLineno", 1611734632);
        setField(term18249, term18249.getClass(), "sourceString", "zLMTXDQHYH");
        setIntField(term18249, term18249.getClass(), "sourceEnd", 868908117);
        setIntField(term18249, term18249.getClass(), "sourceCursor", 1789351397);
        setIntField(term18249, term18249.getClass(), "cursor", 2145528170);
        setIntField(term18249, term18249.getClass(), "tokenBeg", -585773976);
        setIntField(term18249, term18249.getClass(), "tokenEnd", 852806940);
        setField(term18248, term18248.getClass(), "stream", term18249);
        setField(term18298, term18298.getClass(), "root", null);
        setField(term18298, term18298.getClass(), "sourceName", null);
        setField(term18297, term18297.getClass(), "baseType", term18298);
        setField(term18297, term18297.getClass(), "extendedInterfaces", term18299);
        setField(term18297, term18297.getClass(), "implementedInterfaces", term18302);
        setField(term18297, term18297.getClass(), "parameters", term18305);
        setField(term18297, term18297.getClass(), "thrownTypes", term18310);
        setField(term18297, term18297.getClass(), "templateTypeNames", null);
        setField(term18297, term18297.getClass(), "classTemplateTypeNames", null);
        setField(term18297, term18297.getClass(), "description", null);
        setField(term18297, term18297.getClass(), "meaning", null);
        setField(term18297, term18297.getClass(), "deprecated", null);
        setField(term18297, term18297.getClass(), "license", null);
        setField(term18297, term18297.getClass(), "suppressions", null);
        setField(term18297, term18297.getClass(), "modifies", null);
        setField(term18297, term18297.getClass(), "lendsName", null);
        setBooleanField(term18297, term18297.getClass(), "ngInject", false);
        setField(term18296, term18296.getClass(), "info", term18297);
        setField(term18314, term18314.getClass(), "sourceComment", null);
        setField(term18314, term18314.getClass(), "markers", null);
        setField(term18314, term18314.getClass(), "parameters", null);
        setField(term18314, term18314.getClass(), "throwsDescriptions", null);
        setField(term18314, term18314.getClass(), "blockDescription", null);
        setField(term18314, term18314.getClass(), "fileOverview", null);
        setField(term18314, term18314.getClass(), "returnDescription", null);
        setField(term18314, term18314.getClass(), "version", null);
        setField(term18314, term18314.getClass(), "authors", null);
        setField(term18314, term18314.getClass(), "sees", null);
        setField(term18296, term18296.getClass(), "documentation", term18314);
        setIntField(term18315, term18315.getClass(), "type", 0);
        setField(term18315, term18315.getClass(), "next", null);
        setField(term18315, term18315.getClass(), "first", null);
        setField(term18315, term18315.getClass(), "last", null);
        setField(term18315, term18315.getClass(), "propListHead", null);
        setIntField(term18315, term18315.getClass(), "sourcePosition", 0);
        setField(term18315, term18315.getClass(), "jsType", null);
        setField(term18315, term18315.getClass(), "parent", null);
        setField(term18296, term18296.getClass(), "associatedNode", term18315);
        setField(term18296, term18296.getClass(), "visibility", enum198);
        setIntField(term18296, term18296.getClass(), "bitset", -146564963);
        setField(term18322, term18322.getClass(), "root", term18315);
        setField(term18322, term18322.getClass(), "sourceName", "");
        setField(term18296, term18296.getClass(), "type", term18322);
        setField(term18324, term18324.getClass(), "root", term18315);
        setField(term18324, term18324.getClass(), "sourceName", "");
        setField(term18296, term18296.getClass(), "thisType", term18324);
        setBooleanField(term18296, term18296.getClass(), "includeDocumentation", false);
        setField(term18295, term18295.getClass(), "currentInfo", term18296);
        setBooleanField(term18295, term18295.getClass(), "populated", false);
        setBooleanField(term18295, term18295.getClass(), "parseDocumentation", false);
        setField(term18330, term18330.getClass(), "item", null);
        setIntField(term18330, term18330.getClass(), "startLineno", 0);
        setIntField(term18330, term18330.getClass(), "startCharno", 0);
        setIntField(term18330, term18330.getClass(), "endLineno", 0);
        setIntField(term18330, term18330.getClass(), "endCharno", 0);
        setField(term18329, term18329.getClass(), "annotation", term18330);
        setField(term18335, term18335.getClass(), "item", null);
        setIntField(term18335, term18335.getClass(), "startLineno", 0);
        setIntField(term18335, term18335.getClass(), "startCharno", 0);
        setIntField(term18335, term18335.getClass(), "endLineno", 0);
        setIntField(term18335, term18335.getClass(), "endCharno", 0);
        setField(term18329, term18329.getClass(), "name", term18335);
        setField(term18329, term18329.getClass(), "nameNode", null);
        setField(term18329, term18329.getClass(), "description", null);
        setField(term18329, term18329.getClass(), "type", null);
        setField(term18295, term18295.getClass(), "currentMarker", term18329);
        setField(term18248, term18248.getClass(), "jsdocBuilder", term18295);
        setField(term18248, term18248.getClass(), "sourceFile", null);
        setIntField(term18340, term18340.getClass(), "type", 0);
        setField(term18340, term18340.getClass(), "next", null);
        setField(term18340, term18340.getClass(), "first", null);
        setField(term18340, term18340.getClass(), "last", null);
        setField(term18340, term18340.getClass(), "propListHead", null);
        setIntField(term18340, term18340.getClass(), "sourcePosition", 0);
        setField(term18340, term18340.getClass(), "jsType", null);
        setField(term18340, term18340.getClass(), "parent", null);
        setField(term18248, term18248.getClass(), "associatedNode", term18340);
        setField(term18248, term18248.getClass(), "errorReporter", null);
        setField(term18248, term18248.getClass(), "parser", null);
        setField(term18248, term18248.getClass(), "templateNode", null);
        setField(term18248, term18248.getClass(), "fileOverviewJSDocInfo", null);
        setField(term18248, term18248.getClass(), "state", null);
        setField(term18248, term18248.getClass(), "annotationNames", null);
        setField(term18248, term18248.getClass(), "suppressionNames", null);
        setField(term18248, term18248.getClass(), "fileLevelJsDocBuilder", null);
        setField(term18248, term18248.getClass(), "unreadToken", null);
        Class<? extends Object> term115301 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term115299 = ((Class) term115301).getDeclaredField((String) "STRING");
        ((Field) term115299).setAccessible(true);
        enum200 = ((Field) term115299).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum200;
        try {
            callMethod(klass, "parseParametersType", argTypes, term18248, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


