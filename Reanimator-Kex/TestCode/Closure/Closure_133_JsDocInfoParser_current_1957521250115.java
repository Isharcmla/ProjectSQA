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
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class JsDocInfoParser_current_1957521250115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31053;

    public JsDocInfoParser_current_1957521250115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31106 = new ArrayList();
        ((ArrayList) term31106).add((Object)null);
        ((ArrayList) term31106).add((Object)null);
        ArrayList term31109 = new ArrayList();
        HashMap term31112 = new HashMap();
        ArrayList term31117 = new ArrayList();
        ((ArrayList) term31117).add((Object)null);
        ((ArrayList) term31117).add((Object)null);
        ((ArrayList) term31117).add((Object)null);
        Class<? extends Object> term125892 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term125891 = ((Class) term125892).getDeclaredField((String) "INHERITED");
        ((Field) term125891).setAccessible(true);
        Object enum235 = ((Field) term125891).get((Object) null);
        term31053 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term31054 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term31067 = (char[]) newCharArray(4);
        int[] term31073 = (int[]) newIntArray(3);
        Object term31102 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term31103 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term31104 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term31105 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31121 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term31122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31129 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31130 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31134 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term31135 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term31140 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term31145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31054, term31054.getClass(), "string", "BJklinBmhN");
        setCharElement(term31067, 0, 'I');
        setCharElement(term31067, 1, 'q');
        setCharElement(term31067, 2, 'C');
        setCharElement(term31067, 3, 'K');
        setField(term31054, term31054.getClass(), "stringBuffer", term31067);
        setIntField(term31054, term31054.getClass(), "stringBufferTop", 444514470);
        setIntElement(term31073, 0, -147055177);
        setIntElement(term31073, 1, 1979044375);
        setIntElement(term31073, 2, 961252909);
        setField(term31054, term31054.getClass(), "ungetBuffer", term31073);
        setIntField(term31054, term31054.getClass(), "ungetCursor", 1455842357);
        setBooleanField(term31054, term31054.getClass(), "hitEOF", true);
        setIntField(term31054, term31054.getClass(), "lineStart", 1349806561);
        setIntField(term31054, term31054.getClass(), "lineEndChar", 923905351);
        setIntField(term31054, term31054.getClass(), "lineno", 428360161);
        setIntField(term31054, term31054.getClass(), "charno", 631528579);
        setIntField(term31054, term31054.getClass(), "initCharno", -1652091834);
        setIntField(term31054, term31054.getClass(), "initLineno", -282021579);
        setField(term31054, term31054.getClass(), "sourceString", "IOddzvEWcl");
        setIntField(term31054, term31054.getClass(), "sourceEnd", -1652588127);
        setIntField(term31054, term31054.getClass(), "sourceCursor", -1902823385);
        setIntField(term31054, term31054.getClass(), "cursor", -784924879);
        setIntField(term31054, term31054.getClass(), "tokenBeg", -1062027102);
        setIntField(term31054, term31054.getClass(), "tokenEnd", 1763217806);
        setField(term31053, term31053.getClass(), "stream", term31054);
        setField(term31105, term31105.getClass(), "root", null);
        setField(term31105, term31105.getClass(), "sourceName", null);
        setField(term31104, term31104.getClass(), "baseType", term31105);
        setField(term31104, term31104.getClass(), "extendedInterfaces", term31106);
        setField(term31104, term31104.getClass(), "implementedInterfaces", term31109);
        setField(term31104, term31104.getClass(), "parameters", term31112);
        setField(term31104, term31104.getClass(), "thrownTypes", term31117);
        setField(term31104, term31104.getClass(), "templateTypeNames", null);
        setField(term31104, term31104.getClass(), "classTemplateTypeNames", null);
        setField(term31104, term31104.getClass(), "description", null);
        setField(term31104, term31104.getClass(), "meaning", null);
        setField(term31104, term31104.getClass(), "deprecated", null);
        setField(term31104, term31104.getClass(), "license", null);
        setField(term31104, term31104.getClass(), "suppressions", null);
        setField(term31104, term31104.getClass(), "modifies", null);
        setField(term31104, term31104.getClass(), "lendsName", null);
        setBooleanField(term31104, term31104.getClass(), "ngInject", false);
        setField(term31103, term31103.getClass(), "info", term31104);
        setField(term31121, term31121.getClass(), "sourceComment", null);
        setField(term31121, term31121.getClass(), "markers", null);
        setField(term31121, term31121.getClass(), "parameters", null);
        setField(term31121, term31121.getClass(), "throwsDescriptions", null);
        setField(term31121, term31121.getClass(), "blockDescription", null);
        setField(term31121, term31121.getClass(), "fileOverview", null);
        setField(term31121, term31121.getClass(), "returnDescription", null);
        setField(term31121, term31121.getClass(), "version", null);
        setField(term31121, term31121.getClass(), "authors", null);
        setField(term31121, term31121.getClass(), "sees", null);
        setField(term31103, term31103.getClass(), "documentation", term31121);
        setIntField(term31122, term31122.getClass(), "type", 0);
        setField(term31122, term31122.getClass(), "next", null);
        setField(term31122, term31122.getClass(), "first", null);
        setField(term31122, term31122.getClass(), "last", null);
        setField(term31122, term31122.getClass(), "propListHead", null);
        setIntField(term31122, term31122.getClass(), "sourcePosition", 0);
        setField(term31122, term31122.getClass(), "jsType", null);
        setField(term31122, term31122.getClass(), "parent", null);
        setField(term31103, term31103.getClass(), "associatedNode", term31122);
        setField(term31103, term31103.getClass(), "visibility", enum235);
        setIntField(term31103, term31103.getClass(), "bitset", -758778797);
        setField(term31129, term31129.getClass(), "root", null);
        setField(term31129, term31129.getClass(), "sourceName", null);
        setField(term31103, term31103.getClass(), "type", term31129);
        setField(term31130, term31130.getClass(), "root", null);
        setField(term31130, term31130.getClass(), "sourceName", null);
        setField(term31103, term31103.getClass(), "thisType", term31130);
        setBooleanField(term31103, term31103.getClass(), "includeDocumentation", true);
        setField(term31102, term31102.getClass(), "currentInfo", term31103);
        setBooleanField(term31102, term31102.getClass(), "populated", false);
        setBooleanField(term31102, term31102.getClass(), "parseDocumentation", false);
        setField(term31135, term31135.getClass(), "item", null);
        setIntField(term31135, term31135.getClass(), "startLineno", 0);
        setIntField(term31135, term31135.getClass(), "startCharno", 0);
        setIntField(term31135, term31135.getClass(), "endLineno", 0);
        setIntField(term31135, term31135.getClass(), "endCharno", 0);
        setField(term31134, term31134.getClass(), "annotation", term31135);
        setField(term31140, term31140.getClass(), "item", null);
        setIntField(term31140, term31140.getClass(), "startLineno", 0);
        setIntField(term31140, term31140.getClass(), "startCharno", 0);
        setIntField(term31140, term31140.getClass(), "endLineno", 0);
        setIntField(term31140, term31140.getClass(), "endCharno", 0);
        setField(term31134, term31134.getClass(), "name", term31140);
        setField(term31134, term31134.getClass(), "nameNode", null);
        setField(term31134, term31134.getClass(), "description", null);
        setField(term31134, term31134.getClass(), "type", null);
        setField(term31102, term31102.getClass(), "currentMarker", term31134);
        setField(term31053, term31053.getClass(), "jsdocBuilder", term31102);
        setField(term31053, term31053.getClass(), "sourceFile", null);
        setIntField(term31145, term31145.getClass(), "type", 0);
        setField(term31145, term31145.getClass(), "next", null);
        setField(term31145, term31145.getClass(), "first", null);
        setField(term31145, term31145.getClass(), "last", null);
        setField(term31145, term31145.getClass(), "propListHead", null);
        setIntField(term31145, term31145.getClass(), "sourcePosition", 0);
        setField(term31145, term31145.getClass(), "jsType", null);
        setField(term31145, term31145.getClass(), "parent", null);
        setField(term31053, term31053.getClass(), "associatedNode", term31145);
        setField(term31053, term31053.getClass(), "errorReporter", null);
        setField(term31053, term31053.getClass(), "parser", null);
        setField(term31053, term31053.getClass(), "templateNode", null);
        setField(term31053, term31053.getClass(), "fileOverviewJSDocInfo", null);
        setField(term31053, term31053.getClass(), "state", null);
        setField(term31053, term31053.getClass(), "annotationNames", null);
        setField(term31053, term31053.getClass(), "suppressionNames", null);
        setField(term31053, term31053.getClass(), "fileLevelJsDocBuilder", null);
        setField(term31053, term31053.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "current", argTypes, term31053, args);
    }

};


