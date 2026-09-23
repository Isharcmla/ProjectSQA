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
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parseUnionType_704035480109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23782;
     Object enum235;

    public JsDocInfoParser_parseUnionType_704035480109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23838 = new ArrayList();
        ((ArrayList) term23838).add((Object)null);
        ArrayList term23841 = new ArrayList();
        ((ArrayList) term23841).add((Object)null);
        ((ArrayList) term23841).add((Object)null);
        ((ArrayList) term23841).add((Object)null);
        ((ArrayList) term23841).add((Object)null);
        HashMap term23844 = new HashMap();
        ArrayList term23849 = new ArrayList();
        HashSet term23852 = new HashSet();
        HashSet term23857 = new HashSet();
        HashSet term23858 = new HashSet();
        ArrayList term23867 = new ArrayList();
        ((ArrayList) term23867).add((Object)null);
        ((ArrayList) term23867).add((Object)null);
        ((ArrayList) term23867).add((Object)null);
        ((ArrayList) term23867).add((Object)null);
        ((ArrayList) term23867).add((Object)null);
        HashMap term23870 = new HashMap();
        Class<? extends Object> term154781 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term154780 = ((Class) term154781).getDeclaredField((String) "PRIVATE");
        ((Field) term154780).setAccessible(true);
        Object enum234 = ((Field) term154780).get((Object) null);
        term23782 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term23783 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term23796 = (char[]) newCharArray(1);
        int[] term23799 = (int[]) newIntArray(9);
        Object term23834 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term23835 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term23836 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term23837 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23865 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term23875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23882 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23883 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23888 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term23889 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term23894 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term23899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23783, term23783.getClass(), "string", "dVHfxjbMRK");
        setCharElement(term23796, 0, 'T');
        setField(term23783, term23783.getClass(), "stringBuffer", term23796);
        setIntField(term23783, term23783.getClass(), "stringBufferTop", 1782600602);
        setIntElement(term23799, 0, -185892708);
        setIntElement(term23799, 1, -203163250);
        setIntElement(term23799, 2, 498473526);
        setIntElement(term23799, 3, 1186917020);
        setIntElement(term23799, 4, 1670041824);
        setIntElement(term23799, 5, 2140388634);
        setIntElement(term23799, 6, 21095258);
        setIntElement(term23799, 7, -1793997256);
        setIntElement(term23799, 8, -1271598018);
        setField(term23783, term23783.getClass(), "ungetBuffer", term23799);
        setIntField(term23783, term23783.getClass(), "ungetCursor", 157967613);
        setBooleanField(term23783, term23783.getClass(), "hitEOF", true);
        setIntField(term23783, term23783.getClass(), "lineStart", 811839399);
        setIntField(term23783, term23783.getClass(), "lineEndChar", 593962063);
        setIntField(term23783, term23783.getClass(), "lineno", -1485826786);
        setIntField(term23783, term23783.getClass(), "charno", -1549952664);
        setIntField(term23783, term23783.getClass(), "initCharno", 148394188);
        setIntField(term23783, term23783.getClass(), "initLineno", 504525721);
        setField(term23783, term23783.getClass(), "sourceString", "LzwyLxKJpw");
        setIntField(term23783, term23783.getClass(), "sourceEnd", 1835568392);
        setIntField(term23783, term23783.getClass(), "sourceCursor", 457470807);
        setIntField(term23783, term23783.getClass(), "cursor", -994742871);
        setIntField(term23783, term23783.getClass(), "tokenBeg", -222412326);
        setIntField(term23783, term23783.getClass(), "tokenEnd", -299497261);
        setField(term23782, term23782.getClass(), "stream", term23783);
        setField(term23837, term23837.getClass(), "root", null);
        setField(term23837, term23837.getClass(), "sourceName", null);
        setField(term23836, term23836.getClass(), "baseType", term23837);
        setField(term23836, term23836.getClass(), "extendedInterfaces", term23838);
        setField(term23836, term23836.getClass(), "implementedInterfaces", term23841);
        setField(term23836, term23836.getClass(), "parameters", term23844);
        setField(term23836, term23836.getClass(), "thrownTypes", term23849);
        setField(term23836, term23836.getClass(), "templateTypeNames", null);
        setField(term23836, term23836.getClass(), "disposedParameters", term23852);
        setField(term23836, term23836.getClass(), "description", "");
        setField(term23836, term23836.getClass(), "meaning", "");
        setField(term23836, term23836.getClass(), "deprecated", "");
        setField(term23836, term23836.getClass(), "license", "");
        setField(term23836, term23836.getClass(), "suppressions", term23857);
        setField(term23836, term23836.getClass(), "modifies", term23858);
        setField(term23836, term23836.getClass(), "lendsName", "");
        setBooleanField(term23836, term23836.getClass(), "ngInject", false);
        setBooleanField(term23836, term23836.getClass(), "wizaction", true);
        setBooleanField(term23836, term23836.getClass(), "jaggerInject", true);
        setBooleanField(term23836, term23836.getClass(), "jaggerProvide", false);
        setBooleanField(term23836, term23836.getClass(), "jaggerModule", true);
        setField(term23835, term23835.getClass(), "info", term23836);
        setField(term23865, term23865.getClass(), "sourceComment", "");
        setField(term23865, term23865.getClass(), "markers", term23867);
        setField(term23865, term23865.getClass(), "parameters", term23870);
        setField(term23865, term23865.getClass(), "throwsDescriptions", null);
        setField(term23865, term23865.getClass(), "blockDescription", null);
        setField(term23865, term23865.getClass(), "fileOverview", null);
        setField(term23865, term23865.getClass(), "returnDescription", null);
        setField(term23865, term23865.getClass(), "version", null);
        setField(term23865, term23865.getClass(), "authors", null);
        setField(term23865, term23865.getClass(), "sees", null);
        setField(term23835, term23835.getClass(), "documentation", term23865);
        setIntField(term23875, term23875.getClass(), "type", 0);
        setField(term23875, term23875.getClass(), "next", null);
        setField(term23875, term23875.getClass(), "first", null);
        setField(term23875, term23875.getClass(), "last", null);
        setField(term23875, term23875.getClass(), "propListHead", null);
        setIntField(term23875, term23875.getClass(), "sourcePosition", 0);
        setField(term23875, term23875.getClass(), "jsType", null);
        setField(term23875, term23875.getClass(), "parent", null);
        setField(term23835, term23835.getClass(), "associatedNode", term23875);
        setField(term23835, term23835.getClass(), "visibility", enum234);
        setIntField(term23835, term23835.getClass(), "bitset", -691164974);
        setField(term23882, term23882.getClass(), "root", null);
        setField(term23882, term23882.getClass(), "sourceName", null);
        setField(term23835, term23835.getClass(), "type", term23882);
        setField(term23883, term23883.getClass(), "root", null);
        setField(term23883, term23883.getClass(), "sourceName", null);
        setField(term23835, term23835.getClass(), "thisType", term23883);
        setBooleanField(term23835, term23835.getClass(), "includeDocumentation", false);
        setIntField(term23835, term23835.getClass(), "originalCommentPosition", -761675396);
        setField(term23834, term23834.getClass(), "currentInfo", term23835);
        setBooleanField(term23834, term23834.getClass(), "populated", true);
        setBooleanField(term23834, term23834.getClass(), "parseDocumentation", true);
        setField(term23889, term23889.getClass(), "item", null);
        setIntField(term23889, term23889.getClass(), "startLineno", 0);
        setIntField(term23889, term23889.getClass(), "startCharno", 0);
        setIntField(term23889, term23889.getClass(), "endLineno", 0);
        setIntField(term23889, term23889.getClass(), "endCharno", 0);
        setField(term23888, term23888.getClass(), "annotation", term23889);
        setField(term23894, term23894.getClass(), "item", null);
        setIntField(term23894, term23894.getClass(), "startLineno", 0);
        setIntField(term23894, term23894.getClass(), "startCharno", 0);
        setIntField(term23894, term23894.getClass(), "endLineno", 0);
        setIntField(term23894, term23894.getClass(), "endCharno", 0);
        setField(term23888, term23888.getClass(), "name", term23894);
        setField(term23888, term23888.getClass(), "nameNode", null);
        setField(term23888, term23888.getClass(), "description", null);
        setField(term23888, term23888.getClass(), "type", null);
        setField(term23834, term23834.getClass(), "currentMarker", term23888);
        setField(term23782, term23782.getClass(), "jsdocBuilder", term23834);
        setField(term23782, term23782.getClass(), "sourceFile", null);
        setIntField(term23899, term23899.getClass(), "type", 0);
        setField(term23899, term23899.getClass(), "next", null);
        setField(term23899, term23899.getClass(), "first", null);
        setField(term23899, term23899.getClass(), "last", null);
        setField(term23899, term23899.getClass(), "propListHead", null);
        setIntField(term23899, term23899.getClass(), "sourcePosition", 0);
        setField(term23899, term23899.getClass(), "jsType", null);
        setField(term23899, term23899.getClass(), "parent", null);
        setField(term23782, term23782.getClass(), "associatedNode", term23899);
        setField(term23782, term23782.getClass(), "errorReporter", null);
        setField(term23782, term23782.getClass(), "parser", null);
        setField(term23782, term23782.getClass(), "templateNode", null);
        setField(term23782, term23782.getClass(), "fileOverviewJSDocInfo", null);
        setField(term23782, term23782.getClass(), "state", null);
        setField(term23782, term23782.getClass(), "annotationNames", null);
        setField(term23782, term23782.getClass(), "suppressionNames", null);
        setField(term23782, term23782.getClass(), "fileLevelJsDocBuilder", null);
        setField(term23782, term23782.getClass(), "unreadToken", null);
        Class<? extends Object> term155049 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term155048 = ((Class) term155049).getDeclaredField((String) "GT");
        ((Field) term155048).setAccessible(true);
        enum235 = ((Field) term155048).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum235;
        try {
            callMethod(klass, "parseUnionType", argTypes, term23782, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


