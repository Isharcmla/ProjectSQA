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

public class JsDocInfoParser_eatTokensUntilEOL_1886658085106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29075;

    public JsDocInfoParser_eatTokensUntilEOL_1886658085106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29123 = new ArrayList();
        ((ArrayList) term29123).add((Object)null);
        ArrayList term29126 = new ArrayList();
        ((ArrayList) term29126).add((Object)null);
        HashMap term29129 = new HashMap();
        ArrayList term29134 = new ArrayList();
        ((ArrayList) term29134).add((Object)null);
        ((ArrayList) term29134).add((Object)null);
        ((ArrayList) term29134).add((Object)null);
        ((ArrayList) term29134).add((Object)null);
        ((ArrayList) term29134).add((Object)null);
        ((ArrayList) term29134).add((Object)null);
        ((ArrayList) term29134).add((Object)null);
        ((ArrayList) term29134).add((Object)null);
        HashSet term29142 = new HashSet();
        HashSet term29143 = new HashSet();
        ArrayList term29147 = new ArrayList();
        ((ArrayList) term29147).add((Object)null);
        ((ArrayList) term29147).add((Object)null);
        HashMap term29150 = new HashMap();
        Class<? extends Object> term113398 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term113397 = ((Class) term113398).getDeclaredField((String) "PROTECTED");
        ((Field) term113397).setAccessible(true);
        Object enum225 = ((Field) term113397).get((Object) null);
        term29075 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term29076 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term29089 = (char[]) newCharArray(0);
        int[] term29091 = (int[]) newIntArray(2);
        Object term29119 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term29120 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term29121 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term29122 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29145 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term29155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29162 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29167 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29172 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term29173 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term29178 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term29183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29076, term29076.getClass(), "string", "IoefPqGtaj");
        setField(term29076, term29076.getClass(), "stringBuffer", term29089);
        setIntField(term29076, term29076.getClass(), "stringBufferTop", 183531701);
        setIntElement(term29091, 0, -974923743);
        setIntElement(term29091, 1, 1876738932);
        setField(term29076, term29076.getClass(), "ungetBuffer", term29091);
        setIntField(term29076, term29076.getClass(), "ungetCursor", -1870339027);
        setBooleanField(term29076, term29076.getClass(), "hitEOF", true);
        setIntField(term29076, term29076.getClass(), "lineStart", -1549603566);
        setIntField(term29076, term29076.getClass(), "lineEndChar", 1077223540);
        setIntField(term29076, term29076.getClass(), "lineno", -1823813592);
        setIntField(term29076, term29076.getClass(), "charno", -1644358555);
        setIntField(term29076, term29076.getClass(), "initCharno", -388591034);
        setIntField(term29076, term29076.getClass(), "initLineno", -1270258033);
        setField(term29076, term29076.getClass(), "sourceString", "YMmtjELJuB");
        setIntField(term29076, term29076.getClass(), "sourceEnd", 1677994069);
        setIntField(term29076, term29076.getClass(), "sourceCursor", -439999692);
        setIntField(term29076, term29076.getClass(), "cursor", 924095007);
        setIntField(term29076, term29076.getClass(), "tokenBeg", 1302110708);
        setIntField(term29076, term29076.getClass(), "tokenEnd", 594705497);
        setField(term29075, term29075.getClass(), "stream", term29076);
        setField(term29122, term29122.getClass(), "root", null);
        setField(term29122, term29122.getClass(), "sourceName", null);
        setField(term29121, term29121.getClass(), "baseType", term29122);
        setField(term29121, term29121.getClass(), "extendedInterfaces", term29123);
        setField(term29121, term29121.getClass(), "implementedInterfaces", term29126);
        setField(term29121, term29121.getClass(), "parameters", term29129);
        setField(term29121, term29121.getClass(), "thrownTypes", term29134);
        setField(term29121, term29121.getClass(), "templateTypeName", "");
        setField(term29121, term29121.getClass(), "description", "");
        setField(term29121, term29121.getClass(), "meaning", "");
        setField(term29121, term29121.getClass(), "deprecated", "");
        setField(term29121, term29121.getClass(), "license", "");
        setField(term29121, term29121.getClass(), "suppressions", term29142);
        setField(term29121, term29121.getClass(), "modifies", term29143);
        setField(term29121, term29121.getClass(), "lendsName", "");
        setField(term29120, term29120.getClass(), "info", term29121);
        setField(term29145, term29145.getClass(), "sourceComment", "");
        setField(term29145, term29145.getClass(), "markers", term29147);
        setField(term29145, term29145.getClass(), "parameters", term29150);
        setField(term29145, term29145.getClass(), "throwsDescriptions", null);
        setField(term29145, term29145.getClass(), "blockDescription", null);
        setField(term29145, term29145.getClass(), "fileOverview", null);
        setField(term29145, term29145.getClass(), "returnDescription", null);
        setField(term29145, term29145.getClass(), "version", null);
        setField(term29145, term29145.getClass(), "authors", null);
        setField(term29145, term29145.getClass(), "sees", null);
        setField(term29120, term29120.getClass(), "documentation", term29145);
        setIntField(term29155, term29155.getClass(), "type", 0);
        setField(term29155, term29155.getClass(), "next", null);
        setField(term29155, term29155.getClass(), "first", null);
        setField(term29155, term29155.getClass(), "last", null);
        setField(term29155, term29155.getClass(), "propListHead", null);
        setIntField(term29155, term29155.getClass(), "sourcePosition", 0);
        setField(term29155, term29155.getClass(), "jsType", null);
        setField(term29155, term29155.getClass(), "parent", null);
        setField(term29120, term29120.getClass(), "associatedNode", term29155);
        setField(term29120, term29120.getClass(), "visibility", enum225);
        setIntField(term29120, term29120.getClass(), "bitset", -861014847);
        setIntField(term29163, term29163.getClass(), "type", 0);
        setField(term29163, term29163.getClass(), "next", null);
        setField(term29163, term29163.getClass(), "first", null);
        setField(term29163, term29163.getClass(), "last", null);
        setField(term29163, term29163.getClass(), "propListHead", null);
        setIntField(term29163, term29163.getClass(), "sourcePosition", 0);
        setField(term29163, term29163.getClass(), "jsType", null);
        setField(term29163, term29163.getClass(), "parent", null);
        setField(term29162, term29162.getClass(), "root", term29163);
        setField(term29162, term29162.getClass(), "sourceName", "");
        setField(term29120, term29120.getClass(), "type", term29162);
        setField(term29167, term29167.getClass(), "root", term29163);
        setField(term29167, term29167.getClass(), "sourceName", "");
        setField(term29120, term29120.getClass(), "thisType", term29167);
        setBooleanField(term29120, term29120.getClass(), "includeDocumentation", false);
        setField(term29119, term29119.getClass(), "currentInfo", term29120);
        setBooleanField(term29119, term29119.getClass(), "populated", false);
        setBooleanField(term29119, term29119.getClass(), "parseDocumentation", true);
        setField(term29173, term29173.getClass(), "item", null);
        setIntField(term29173, term29173.getClass(), "startLineno", 0);
        setIntField(term29173, term29173.getClass(), "startCharno", 0);
        setIntField(term29173, term29173.getClass(), "endLineno", 0);
        setIntField(term29173, term29173.getClass(), "endCharno", 0);
        setField(term29172, term29172.getClass(), "annotation", term29173);
        setField(term29178, term29178.getClass(), "item", null);
        setIntField(term29178, term29178.getClass(), "startLineno", 0);
        setIntField(term29178, term29178.getClass(), "startCharno", 0);
        setIntField(term29178, term29178.getClass(), "endLineno", 0);
        setIntField(term29178, term29178.getClass(), "endCharno", 0);
        setField(term29172, term29172.getClass(), "name", term29178);
        setField(term29172, term29172.getClass(), "nameNode", null);
        setField(term29172, term29172.getClass(), "description", null);
        setField(term29172, term29172.getClass(), "type", null);
        setField(term29119, term29119.getClass(), "currentMarker", term29172);
        setField(term29075, term29075.getClass(), "jsdocBuilder", term29119);
        setField(term29075, term29075.getClass(), "sourceFile", null);
        setIntField(term29183, term29183.getClass(), "type", -37129068);
        setIntField(term29185, term29185.getClass(), "type", 0);
        setField(term29185, term29185.getClass(), "next", null);
        setField(term29185, term29185.getClass(), "first", null);
        setField(term29185, term29185.getClass(), "last", null);
        setField(term29185, term29185.getClass(), "propListHead", null);
        setIntField(term29185, term29185.getClass(), "sourcePosition", 0);
        setField(term29185, term29185.getClass(), "jsType", null);
        setField(term29185, term29185.getClass(), "parent", null);
        setField(term29183, term29183.getClass(), "next", term29185);
        setIntField(term29188, term29188.getClass(), "type", 0);
        setField(term29188, term29188.getClass(), "next", null);
        setField(term29188, term29188.getClass(), "first", null);
        setField(term29188, term29188.getClass(), "last", null);
        setField(term29188, term29188.getClass(), "propListHead", null);
        setIntField(term29188, term29188.getClass(), "sourcePosition", 0);
        setField(term29188, term29188.getClass(), "jsType", null);
        setField(term29188, term29188.getClass(), "parent", null);
        setField(term29183, term29183.getClass(), "first", term29188);
        setField(term29183, term29183.getClass(), "last", term29163);
        setField(term29183, term29183.getClass(), "propListHead", null);
        setIntField(term29183, term29183.getClass(), "sourcePosition", 0);
        setField(term29183, term29183.getClass(), "jsType", null);
        setField(term29183, term29183.getClass(), "parent", null);
        setField(term29075, term29075.getClass(), "associatedNode", term29183);
        setField(term29075, term29075.getClass(), "errorReporter", null);
        setField(term29075, term29075.getClass(), "parser", null);
        setField(term29075, term29075.getClass(), "templateNode", null);
        setField(term29075, term29075.getClass(), "fileOverviewJSDocInfo", null);
        setField(term29075, term29075.getClass(), "state", null);
        setField(term29075, term29075.getClass(), "annotationNames", null);
        setField(term29075, term29075.getClass(), "suppressionNames", null);
        setField(term29075, term29075.getClass(), "fileLevelJsDocBuilder", null);
        setField(term29075, term29075.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "eatTokensUntilEOL", argTypes, term29075, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


