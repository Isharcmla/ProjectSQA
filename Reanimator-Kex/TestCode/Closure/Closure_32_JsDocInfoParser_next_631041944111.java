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

public class JsDocInfoParser_next_631041944111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32940;

    public JsDocInfoParser_next_631041944111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32990 = new ArrayList();
        ArrayList term32993 = new ArrayList();
        ((ArrayList) term32993).add((Object)null);
        ((ArrayList) term32993).add((Object)null);
        ((ArrayList) term32993).add((Object)null);
        ((ArrayList) term32993).add((Object)null);
        ((ArrayList) term32993).add((Object)null);
        ((ArrayList) term32993).add((Object)null);
        HashMap term32996 = new HashMap();
        ArrayList term33001 = new ArrayList();
        ((ArrayList) term33001).add((Object)null);
        ((ArrayList) term33001).add((Object)null);
        ((ArrayList) term33001).add((Object)null);
        ((ArrayList) term33001).add((Object)null);
        ((ArrayList) term33001).add((Object)null);
        ((ArrayList) term33001).add((Object)null);
        HashSet term33009 = new HashSet();
        HashSet term33010 = new HashSet();
        ArrayList term33014 = new ArrayList();
        ((ArrayList) term33014).add((Object)null);
        ((ArrayList) term33014).add((Object)null);
        HashMap term33017 = new HashMap();
        Class<? extends Object> term116665 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term116664 = ((Class) term116665).getDeclaredField((String) "INHERITED");
        ((Field) term116664).setAccessible(true);
        Object enum236 = ((Field) term116664).get((Object) null);
        term32940 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term32941 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term32954 = (char[]) newCharArray(2);
        int[] term32958 = (int[]) newIntArray(2);
        Object term32986 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term32987 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term32988 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term32989 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term33012 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term33022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33038 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term33040 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term33041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33048 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term33049 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term33054 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term32941, term32941.getClass(), "string", "vyvpqcHTQN");
        setCharElement(term32954, 0, 'D');
        setCharElement(term32954, 1, 'U');
        setField(term32941, term32941.getClass(), "stringBuffer", term32954);
        setIntField(term32941, term32941.getClass(), "stringBufferTop", -1362132929);
        setIntElement(term32958, 0, 1267740164);
        setIntElement(term32958, 1, 1363887997);
        setField(term32941, term32941.getClass(), "ungetBuffer", term32958);
        setIntField(term32941, term32941.getClass(), "ungetCursor", -1744763945);
        setBooleanField(term32941, term32941.getClass(), "hitEOF", false);
        setIntField(term32941, term32941.getClass(), "lineStart", 852281447);
        setIntField(term32941, term32941.getClass(), "lineEndChar", 1248430530);
        setIntField(term32941, term32941.getClass(), "lineno", -1911828505);
        setIntField(term32941, term32941.getClass(), "charno", 241725499);
        setIntField(term32941, term32941.getClass(), "initCharno", 823179298);
        setIntField(term32941, term32941.getClass(), "initLineno", 1174484848);
        setField(term32941, term32941.getClass(), "sourceString", "QQcpNMSHvA");
        setIntField(term32941, term32941.getClass(), "sourceEnd", 939889496);
        setIntField(term32941, term32941.getClass(), "sourceCursor", -495242269);
        setIntField(term32941, term32941.getClass(), "cursor", 932810106);
        setIntField(term32941, term32941.getClass(), "tokenBeg", -2138801137);
        setIntField(term32941, term32941.getClass(), "tokenEnd", -1470115841);
        setField(term32940, term32940.getClass(), "stream", term32941);
        setField(term32989, term32989.getClass(), "root", null);
        setField(term32989, term32989.getClass(), "sourceName", null);
        setField(term32988, term32988.getClass(), "baseType", term32989);
        setField(term32988, term32988.getClass(), "extendedInterfaces", term32990);
        setField(term32988, term32988.getClass(), "implementedInterfaces", term32993);
        setField(term32988, term32988.getClass(), "parameters", term32996);
        setField(term32988, term32988.getClass(), "thrownTypes", term33001);
        setField(term32988, term32988.getClass(), "templateTypeName", "");
        setField(term32988, term32988.getClass(), "description", "");
        setField(term32988, term32988.getClass(), "meaning", "");
        setField(term32988, term32988.getClass(), "deprecated", "");
        setField(term32988, term32988.getClass(), "license", "");
        setField(term32988, term32988.getClass(), "suppressions", term33009);
        setField(term32988, term32988.getClass(), "modifies", term33010);
        setField(term32988, term32988.getClass(), "lendsName", "");
        setField(term32987, term32987.getClass(), "info", term32988);
        setField(term33012, term33012.getClass(), "sourceComment", "");
        setField(term33012, term33012.getClass(), "markers", term33014);
        setField(term33012, term33012.getClass(), "parameters", term33017);
        setField(term33012, term33012.getClass(), "throwsDescriptions", null);
        setField(term33012, term33012.getClass(), "blockDescription", null);
        setField(term33012, term33012.getClass(), "fileOverview", null);
        setField(term33012, term33012.getClass(), "returnDescription", null);
        setField(term33012, term33012.getClass(), "version", null);
        setField(term33012, term33012.getClass(), "authors", null);
        setField(term33012, term33012.getClass(), "sees", null);
        setField(term32987, term32987.getClass(), "documentation", term33012);
        setIntField(term33022, term33022.getClass(), "type", -132005524);
        setIntField(term33024, term33024.getClass(), "type", 0);
        setField(term33024, term33024.getClass(), "next", null);
        setField(term33024, term33024.getClass(), "first", null);
        setField(term33024, term33024.getClass(), "last", null);
        setField(term33024, term33024.getClass(), "propListHead", null);
        setIntField(term33024, term33024.getClass(), "sourcePosition", 0);
        setField(term33024, term33024.getClass(), "jsType", null);
        setField(term33024, term33024.getClass(), "parent", null);
        setField(term33022, term33022.getClass(), "next", term33024);
        setIntField(term33027, term33027.getClass(), "type", 0);
        setField(term33027, term33027.getClass(), "next", null);
        setField(term33027, term33027.getClass(), "first", null);
        setField(term33027, term33027.getClass(), "last", null);
        setField(term33027, term33027.getClass(), "propListHead", null);
        setIntField(term33027, term33027.getClass(), "sourcePosition", 0);
        setField(term33027, term33027.getClass(), "jsType", null);
        setField(term33027, term33027.getClass(), "parent", null);
        setField(term33022, term33022.getClass(), "first", term33027);
        setIntField(term33030, term33030.getClass(), "type", 0);
        setField(term33030, term33030.getClass(), "next", null);
        setField(term33030, term33030.getClass(), "first", null);
        setField(term33030, term33030.getClass(), "last", null);
        setField(term33030, term33030.getClass(), "propListHead", null);
        setIntField(term33030, term33030.getClass(), "sourcePosition", 0);
        setField(term33030, term33030.getClass(), "jsType", null);
        setField(term33030, term33030.getClass(), "parent", null);
        setField(term33022, term33022.getClass(), "last", term33030);
        setField(term33022, term33022.getClass(), "propListHead", null);
        setIntField(term33022, term33022.getClass(), "sourcePosition", 0);
        setField(term33022, term33022.getClass(), "jsType", null);
        setField(term33022, term33022.getClass(), "parent", null);
        setField(term32987, term32987.getClass(), "associatedNode", term33022);
        setField(term32987, term32987.getClass(), "visibility", enum236);
        setIntField(term32987, term32987.getClass(), "bitset", -1235127374);
        setField(term33038, term33038.getClass(), "root", term33030);
        setField(term33038, term33038.getClass(), "sourceName", "");
        setField(term32987, term32987.getClass(), "type", term33038);
        setIntField(term33041, term33041.getClass(), "type", -2024983877);
        setField(term33041, term33041.getClass(), "next", null);
        setField(term33041, term33041.getClass(), "first", null);
        setField(term33041, term33041.getClass(), "last", term33024);
        setField(term33041, term33041.getClass(), "propListHead", null);
        setIntField(term33041, term33041.getClass(), "sourcePosition", 0);
        setField(term33041, term33041.getClass(), "jsType", null);
        setField(term33041, term33041.getClass(), "parent", null);
        setField(term33040, term33040.getClass(), "root", term33041);
        setField(term33040, term33040.getClass(), "sourceName", "");
        setField(term32987, term32987.getClass(), "thisType", term33040);
        setBooleanField(term32987, term32987.getClass(), "includeDocumentation", true);
        setField(term32986, term32986.getClass(), "currentInfo", term32987);
        setBooleanField(term32986, term32986.getClass(), "populated", true);
        setBooleanField(term32986, term32986.getClass(), "parseDocumentation", true);
        setField(term33049, term33049.getClass(), "item", null);
        setIntField(term33049, term33049.getClass(), "startLineno", 0);
        setIntField(term33049, term33049.getClass(), "startCharno", 0);
        setIntField(term33049, term33049.getClass(), "endLineno", 0);
        setIntField(term33049, term33049.getClass(), "endCharno", 0);
        setField(term33048, term33048.getClass(), "annotation", term33049);
        setField(term33054, term33054.getClass(), "item", null);
        setIntField(term33054, term33054.getClass(), "startLineno", 0);
        setIntField(term33054, term33054.getClass(), "startCharno", 0);
        setIntField(term33054, term33054.getClass(), "endLineno", 0);
        setIntField(term33054, term33054.getClass(), "endCharno", 0);
        setField(term33048, term33048.getClass(), "name", term33054);
        setField(term33048, term33048.getClass(), "nameNode", null);
        setField(term33048, term33048.getClass(), "description", null);
        setField(term33048, term33048.getClass(), "type", null);
        setField(term32986, term32986.getClass(), "currentMarker", term33048);
        setField(term32940, term32940.getClass(), "jsdocBuilder", term32986);
        setField(term32940, term32940.getClass(), "sourceFile", null);
        setField(term32940, term32940.getClass(), "associatedNode", term33027);
        setField(term32940, term32940.getClass(), "errorReporter", null);
        setField(term32940, term32940.getClass(), "parser", null);
        setField(term32940, term32940.getClass(), "templateNode", null);
        setField(term32940, term32940.getClass(), "fileOverviewJSDocInfo", null);
        setField(term32940, term32940.getClass(), "state", null);
        setField(term32940, term32940.getClass(), "annotationNames", null);
        setField(term32940, term32940.getClass(), "suppressionNames", null);
        setField(term32940, term32940.getClass(), "fileLevelJsDocBuilder", null);
        setField(term32940, term32940.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "next", argTypes, term32940, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


