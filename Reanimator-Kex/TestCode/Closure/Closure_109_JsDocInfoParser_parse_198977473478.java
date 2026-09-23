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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parse_198977473478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3414;

    public JsDocInfoParser_parse_198977473478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3469 = new ArrayList();
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        ArrayList term3472 = new ArrayList();
        ((ArrayList) term3472).add((Object)null);
        ((ArrayList) term3472).add((Object)null);
        ((ArrayList) term3472).add((Object)null);
        ((ArrayList) term3472).add((Object)null);
        ((ArrayList) term3472).add((Object)null);
        ((ArrayList) term3472).add((Object)null);
        ((ArrayList) term3472).add((Object)null);
        ((ArrayList) term3472).add((Object)null);
        HashMap term3475 = new HashMap();
        ArrayList term3480 = new ArrayList();
        HashSet term3483 = new HashSet();
        HashSet term3488 = new HashSet();
        HashSet term3489 = new HashSet();
        ArrayList term3498 = new ArrayList();
        ((ArrayList) term3498).add((Object)null);
        ((ArrayList) term3498).add((Object)null);
        ((ArrayList) term3498).add((Object)null);
        ((ArrayList) term3498).add((Object)null);
        ((ArrayList) term3498).add((Object)null);
        ((ArrayList) term3498).add((Object)null);
        ((ArrayList) term3498).add((Object)null);
        HashMap term3501 = new HashMap();
        Class<? extends Object> term120253 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term120252 = ((Class) term120253).getDeclaredField((String) "PRIVATE");
        ((Field) term120252).setAccessible(true);
        Object enum171 = ((Field) term120252).get((Object) null);
        term3414 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term3415 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term3428 = (char[]) newCharArray(0);
        int[] term3430 = (int[]) newIntArray(9);
        Object term3465 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term3466 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term3467 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term3468 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3496 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term3506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3522 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3524 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3533 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term3534 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term3539 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term3415, term3415.getClass(), "string", "FwPbDZcHmB");
        setField(term3415, term3415.getClass(), "stringBuffer", term3428);
        setIntField(term3415, term3415.getClass(), "stringBufferTop", -1731761810);
        setIntElement(term3430, 0, 197109649);
        setIntElement(term3430, 1, -1239406390);
        setIntElement(term3430, 2, 1557431527);
        setIntElement(term3430, 3, -1504890659);
        setIntElement(term3430, 4, 1358829571);
        setIntElement(term3430, 5, 991356662);
        setIntElement(term3430, 6, -506958186);
        setIntElement(term3430, 7, -507387516);
        setIntElement(term3430, 8, -1970452551);
        setField(term3415, term3415.getClass(), "ungetBuffer", term3430);
        setIntField(term3415, term3415.getClass(), "ungetCursor", -1896376975);
        setBooleanField(term3415, term3415.getClass(), "hitEOF", false);
        setIntField(term3415, term3415.getClass(), "lineStart", 729658803);
        setIntField(term3415, term3415.getClass(), "lineEndChar", 114754804);
        setIntField(term3415, term3415.getClass(), "lineno", 1687361082);
        setIntField(term3415, term3415.getClass(), "charno", 584893196);
        setIntField(term3415, term3415.getClass(), "initCharno", 497269071);
        setIntField(term3415, term3415.getClass(), "initLineno", -1899301124);
        setField(term3415, term3415.getClass(), "sourceString", "hOncybyCAH");
        setIntField(term3415, term3415.getClass(), "sourceEnd", -1882480155);
        setIntField(term3415, term3415.getClass(), "sourceCursor", -1410220680);
        setIntField(term3415, term3415.getClass(), "cursor", 389427431);
        setIntField(term3415, term3415.getClass(), "tokenBeg", -1945706126);
        setIntField(term3415, term3415.getClass(), "tokenEnd", 1152356969);
        setField(term3414, term3414.getClass(), "stream", term3415);
        setField(term3468, term3468.getClass(), "root", null);
        setField(term3468, term3468.getClass(), "sourceName", null);
        setField(term3467, term3467.getClass(), "baseType", term3468);
        setField(term3467, term3467.getClass(), "extendedInterfaces", term3469);
        setField(term3467, term3467.getClass(), "implementedInterfaces", term3472);
        setField(term3467, term3467.getClass(), "parameters", term3475);
        setField(term3467, term3467.getClass(), "thrownTypes", term3480);
        setField(term3467, term3467.getClass(), "templateTypeNames", null);
        setField(term3467, term3467.getClass(), "disposedParameters", term3483);
        setField(term3467, term3467.getClass(), "description", "");
        setField(term3467, term3467.getClass(), "meaning", "");
        setField(term3467, term3467.getClass(), "deprecated", "");
        setField(term3467, term3467.getClass(), "license", "");
        setField(term3467, term3467.getClass(), "suppressions", term3488);
        setField(term3467, term3467.getClass(), "modifies", term3489);
        setField(term3467, term3467.getClass(), "lendsName", "");
        setBooleanField(term3467, term3467.getClass(), "ngInject", true);
        setBooleanField(term3467, term3467.getClass(), "wizaction", false);
        setBooleanField(term3467, term3467.getClass(), "jaggerInject", false);
        setBooleanField(term3467, term3467.getClass(), "jaggerProvide", false);
        setBooleanField(term3467, term3467.getClass(), "jaggerModule", false);
        setField(term3466, term3466.getClass(), "info", term3467);
        setField(term3496, term3496.getClass(), "sourceComment", "");
        setField(term3496, term3496.getClass(), "markers", term3498);
        setField(term3496, term3496.getClass(), "parameters", term3501);
        setField(term3496, term3496.getClass(), "throwsDescriptions", null);
        setField(term3496, term3496.getClass(), "blockDescription", null);
        setField(term3496, term3496.getClass(), "fileOverview", null);
        setField(term3496, term3496.getClass(), "returnDescription", null);
        setField(term3496, term3496.getClass(), "version", null);
        setField(term3496, term3496.getClass(), "authors", null);
        setField(term3496, term3496.getClass(), "sees", null);
        setField(term3466, term3466.getClass(), "documentation", term3496);
        setIntField(term3506, term3506.getClass(), "type", -1222614956);
        setIntField(term3508, term3508.getClass(), "type", 0);
        setField(term3508, term3508.getClass(), "next", null);
        setField(term3508, term3508.getClass(), "first", null);
        setField(term3508, term3508.getClass(), "last", null);
        setField(term3508, term3508.getClass(), "propListHead", null);
        setIntField(term3508, term3508.getClass(), "sourcePosition", 0);
        setField(term3508, term3508.getClass(), "jsType", null);
        setField(term3508, term3508.getClass(), "parent", null);
        setField(term3506, term3506.getClass(), "next", term3508);
        setIntField(term3511, term3511.getClass(), "type", 0);
        setField(term3511, term3511.getClass(), "next", null);
        setField(term3511, term3511.getClass(), "first", null);
        setField(term3511, term3511.getClass(), "last", null);
        setField(term3511, term3511.getClass(), "propListHead", null);
        setIntField(term3511, term3511.getClass(), "sourcePosition", 0);
        setField(term3511, term3511.getClass(), "jsType", null);
        setField(term3511, term3511.getClass(), "parent", null);
        setField(term3506, term3506.getClass(), "first", term3511);
        setIntField(term3514, term3514.getClass(), "type", 0);
        setField(term3514, term3514.getClass(), "next", null);
        setField(term3514, term3514.getClass(), "first", null);
        setField(term3514, term3514.getClass(), "last", null);
        setField(term3514, term3514.getClass(), "propListHead", null);
        setIntField(term3514, term3514.getClass(), "sourcePosition", 0);
        setField(term3514, term3514.getClass(), "jsType", null);
        setField(term3514, term3514.getClass(), "parent", null);
        setField(term3506, term3506.getClass(), "last", term3514);
        setField(term3506, term3506.getClass(), "propListHead", null);
        setIntField(term3506, term3506.getClass(), "sourcePosition", 0);
        setField(term3506, term3506.getClass(), "jsType", null);
        setField(term3506, term3506.getClass(), "parent", null);
        setField(term3466, term3466.getClass(), "associatedNode", term3506);
        setField(term3466, term3466.getClass(), "visibility", enum171);
        setIntField(term3466, term3466.getClass(), "bitset", -1870495012);
        setField(term3522, term3522.getClass(), "root", term3514);
        setField(term3522, term3522.getClass(), "sourceName", "");
        setField(term3466, term3466.getClass(), "type", term3522);
        setIntField(term3525, term3525.getClass(), "type", -1214628358);
        setField(term3525, term3525.getClass(), "next", null);
        setField(term3525, term3525.getClass(), "first", null);
        setField(term3525, term3525.getClass(), "last", term3508);
        setField(term3525, term3525.getClass(), "propListHead", null);
        setIntField(term3525, term3525.getClass(), "sourcePosition", 0);
        setField(term3525, term3525.getClass(), "jsType", null);
        setField(term3525, term3525.getClass(), "parent", null);
        setField(term3524, term3524.getClass(), "root", term3525);
        setField(term3524, term3524.getClass(), "sourceName", "");
        setField(term3466, term3466.getClass(), "thisType", term3524);
        setBooleanField(term3466, term3466.getClass(), "includeDocumentation", true);
        setIntField(term3466, term3466.getClass(), "originalCommentPosition", -1310015129);
        setField(term3465, term3465.getClass(), "currentInfo", term3466);
        setBooleanField(term3465, term3465.getClass(), "populated", true);
        setBooleanField(term3465, term3465.getClass(), "parseDocumentation", false);
        setField(term3534, term3534.getClass(), "item", null);
        setIntField(term3534, term3534.getClass(), "startLineno", 0);
        setIntField(term3534, term3534.getClass(), "startCharno", 0);
        setIntField(term3534, term3534.getClass(), "endLineno", 0);
        setIntField(term3534, term3534.getClass(), "endCharno", 0);
        setField(term3533, term3533.getClass(), "annotation", term3534);
        setField(term3539, term3539.getClass(), "item", null);
        setIntField(term3539, term3539.getClass(), "startLineno", 0);
        setIntField(term3539, term3539.getClass(), "startCharno", 0);
        setIntField(term3539, term3539.getClass(), "endLineno", 0);
        setIntField(term3539, term3539.getClass(), "endCharno", 0);
        setField(term3533, term3533.getClass(), "name", term3539);
        setField(term3533, term3533.getClass(), "nameNode", null);
        setField(term3533, term3533.getClass(), "description", null);
        setField(term3533, term3533.getClass(), "type", null);
        setField(term3465, term3465.getClass(), "currentMarker", term3533);
        setField(term3414, term3414.getClass(), "jsdocBuilder", term3465);
        setField(term3414, term3414.getClass(), "sourceFile", null);
        setField(term3414, term3414.getClass(), "associatedNode", term3511);
        setField(term3414, term3414.getClass(), "errorReporter", null);
        setField(term3414, term3414.getClass(), "parser", null);
        setField(term3414, term3414.getClass(), "templateNode", null);
        setField(term3414, term3414.getClass(), "fileOverviewJSDocInfo", null);
        setField(term3414, term3414.getClass(), "state", null);
        setField(term3414, term3414.getClass(), "annotationNames", null);
        setField(term3414, term3414.getClass(), "suppressionNames", null);
        setField(term3414, term3414.getClass(), "fileLevelJsDocBuilder", null);
        setField(term3414, term3414.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term3414, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


