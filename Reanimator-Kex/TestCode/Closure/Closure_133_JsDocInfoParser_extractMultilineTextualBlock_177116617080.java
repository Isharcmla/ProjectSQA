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
import java.lang.String;

public class JsDocInfoParser_extractMultilineTextualBlock_177116617080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9818;
     Object enum173;

    public JsDocInfoParser_extractMultilineTextualBlock_177116617080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9875 = new ArrayList();
        ((ArrayList) term9875).add((Object)null);
        ((ArrayList) term9875).add((Object)null);
        ((ArrayList) term9875).add((Object)null);
        ((ArrayList) term9875).add((Object)null);
        ((ArrayList) term9875).add((Object)null);
        ((ArrayList) term9875).add((Object)null);
        ((ArrayList) term9875).add((Object)null);
        ArrayList term9878 = new ArrayList();
        HashMap term9881 = new HashMap();
        ArrayList term9886 = new ArrayList();
        ((ArrayList) term9886).add((Object)null);
        ((ArrayList) term9886).add((Object)null);
        ((ArrayList) term9886).add((Object)null);
        ((ArrayList) term9886).add((Object)null);
        ((ArrayList) term9886).add((Object)null);
        ((ArrayList) term9886).add((Object)null);
        ((ArrayList) term9886).add((Object)null);
        ((ArrayList) term9886).add((Object)null);
        ((ArrayList) term9886).add((Object)null);
        Class<? extends Object> term96342 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term96341 = ((Class) term96342).getDeclaredField((String) "PRIVATE");
        ((Field) term96341).setAccessible(true);
        Object enum172 = ((Field) term96341).get((Object) null);
        term9818 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term9819 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term9832 = (char[]) newCharArray(9);
        int[] term9843 = (int[]) newIntArray(2);
        Object term9871 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term9872 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9873 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term9874 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9890 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term9891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9898 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9903 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9911 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term9912 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term9917 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term9819, term9819.getClass(), "string", "xvkbvaEGYd");
        setCharElement(term9832, 0, 'p');
        setCharElement(term9832, 1, 'O');
        setCharElement(term9832, 2, 'Q');
        setCharElement(term9832, 3, 'T');
        setCharElement(term9832, 4, 'y');
        setCharElement(term9832, 5, 'S');
        setCharElement(term9832, 6, 'M');
        setCharElement(term9832, 7, 'j');
        setCharElement(term9832, 8, 'G');
        setField(term9819, term9819.getClass(), "stringBuffer", term9832);
        setIntField(term9819, term9819.getClass(), "stringBufferTop", 489201218);
        setIntElement(term9843, 0, 464181937);
        setIntElement(term9843, 1, -1455526612);
        setField(term9819, term9819.getClass(), "ungetBuffer", term9843);
        setIntField(term9819, term9819.getClass(), "ungetCursor", -941356098);
        setBooleanField(term9819, term9819.getClass(), "hitEOF", false);
        setIntField(term9819, term9819.getClass(), "lineStart", -201517446);
        setIntField(term9819, term9819.getClass(), "lineEndChar", -97742366);
        setIntField(term9819, term9819.getClass(), "lineno", 1638851942);
        setIntField(term9819, term9819.getClass(), "charno", 1374790203);
        setIntField(term9819, term9819.getClass(), "initCharno", 1160010161);
        setIntField(term9819, term9819.getClass(), "initLineno", -423900705);
        setField(term9819, term9819.getClass(), "sourceString", "HBGNxdNURv");
        setIntField(term9819, term9819.getClass(), "sourceEnd", -525570815);
        setIntField(term9819, term9819.getClass(), "sourceCursor", 754055848);
        setIntField(term9819, term9819.getClass(), "cursor", -19246901);
        setIntField(term9819, term9819.getClass(), "tokenBeg", -370828664);
        setIntField(term9819, term9819.getClass(), "tokenEnd", 1168633950);
        setField(term9818, term9818.getClass(), "stream", term9819);
        setField(term9874, term9874.getClass(), "root", null);
        setField(term9874, term9874.getClass(), "sourceName", null);
        setField(term9873, term9873.getClass(), "baseType", term9874);
        setField(term9873, term9873.getClass(), "extendedInterfaces", term9875);
        setField(term9873, term9873.getClass(), "implementedInterfaces", term9878);
        setField(term9873, term9873.getClass(), "parameters", term9881);
        setField(term9873, term9873.getClass(), "thrownTypes", term9886);
        setField(term9873, term9873.getClass(), "templateTypeNames", null);
        setField(term9873, term9873.getClass(), "classTemplateTypeNames", null);
        setField(term9873, term9873.getClass(), "description", null);
        setField(term9873, term9873.getClass(), "meaning", null);
        setField(term9873, term9873.getClass(), "deprecated", null);
        setField(term9873, term9873.getClass(), "license", null);
        setField(term9873, term9873.getClass(), "suppressions", null);
        setField(term9873, term9873.getClass(), "modifies", null);
        setField(term9873, term9873.getClass(), "lendsName", null);
        setBooleanField(term9873, term9873.getClass(), "ngInject", false);
        setField(term9872, term9872.getClass(), "info", term9873);
        setField(term9890, term9890.getClass(), "sourceComment", null);
        setField(term9890, term9890.getClass(), "markers", null);
        setField(term9890, term9890.getClass(), "parameters", null);
        setField(term9890, term9890.getClass(), "throwsDescriptions", null);
        setField(term9890, term9890.getClass(), "blockDescription", null);
        setField(term9890, term9890.getClass(), "fileOverview", null);
        setField(term9890, term9890.getClass(), "returnDescription", null);
        setField(term9890, term9890.getClass(), "version", null);
        setField(term9890, term9890.getClass(), "authors", null);
        setField(term9890, term9890.getClass(), "sees", null);
        setField(term9872, term9872.getClass(), "documentation", term9890);
        setIntField(term9891, term9891.getClass(), "type", 0);
        setField(term9891, term9891.getClass(), "next", null);
        setField(term9891, term9891.getClass(), "first", null);
        setField(term9891, term9891.getClass(), "last", null);
        setField(term9891, term9891.getClass(), "propListHead", null);
        setIntField(term9891, term9891.getClass(), "sourcePosition", 0);
        setField(term9891, term9891.getClass(), "jsType", null);
        setField(term9891, term9891.getClass(), "parent", null);
        setField(term9872, term9872.getClass(), "associatedNode", term9891);
        setField(term9872, term9872.getClass(), "visibility", enum172);
        setIntField(term9872, term9872.getClass(), "bitset", -645429025);
        setIntField(term9899, term9899.getClass(), "type", 0);
        setField(term9899, term9899.getClass(), "next", null);
        setField(term9899, term9899.getClass(), "first", null);
        setField(term9899, term9899.getClass(), "last", null);
        setField(term9899, term9899.getClass(), "propListHead", null);
        setIntField(term9899, term9899.getClass(), "sourcePosition", 0);
        setField(term9899, term9899.getClass(), "jsType", null);
        setField(term9899, term9899.getClass(), "parent", null);
        setField(term9898, term9898.getClass(), "root", term9899);
        setField(term9898, term9898.getClass(), "sourceName", "");
        setField(term9872, term9872.getClass(), "type", term9898);
        setIntField(term9904, term9904.getClass(), "type", 0);
        setField(term9904, term9904.getClass(), "next", null);
        setField(term9904, term9904.getClass(), "first", null);
        setField(term9904, term9904.getClass(), "last", null);
        setField(term9904, term9904.getClass(), "propListHead", null);
        setIntField(term9904, term9904.getClass(), "sourcePosition", 0);
        setField(term9904, term9904.getClass(), "jsType", null);
        setField(term9904, term9904.getClass(), "parent", null);
        setField(term9903, term9903.getClass(), "root", term9904);
        setField(term9903, term9903.getClass(), "sourceName", "");
        setField(term9872, term9872.getClass(), "thisType", term9903);
        setBooleanField(term9872, term9872.getClass(), "includeDocumentation", false);
        setField(term9871, term9871.getClass(), "currentInfo", term9872);
        setBooleanField(term9871, term9871.getClass(), "populated", false);
        setBooleanField(term9871, term9871.getClass(), "parseDocumentation", true);
        setField(term9912, term9912.getClass(), "item", null);
        setIntField(term9912, term9912.getClass(), "startLineno", 0);
        setIntField(term9912, term9912.getClass(), "startCharno", 0);
        setIntField(term9912, term9912.getClass(), "endLineno", 0);
        setIntField(term9912, term9912.getClass(), "endCharno", 0);
        setField(term9911, term9911.getClass(), "annotation", term9912);
        setField(term9917, term9917.getClass(), "item", null);
        setIntField(term9917, term9917.getClass(), "startLineno", 0);
        setIntField(term9917, term9917.getClass(), "startCharno", 0);
        setIntField(term9917, term9917.getClass(), "endLineno", 0);
        setIntField(term9917, term9917.getClass(), "endCharno", 0);
        setField(term9911, term9911.getClass(), "name", term9917);
        setField(term9911, term9911.getClass(), "nameNode", null);
        setField(term9911, term9911.getClass(), "description", null);
        setField(term9911, term9911.getClass(), "type", null);
        setField(term9871, term9871.getClass(), "currentMarker", term9911);
        setField(term9818, term9818.getClass(), "jsdocBuilder", term9871);
        setField(term9818, term9818.getClass(), "sourceFile", null);
        setField(term9818, term9818.getClass(), "associatedNode", term9899);
        setField(term9818, term9818.getClass(), "errorReporter", null);
        setField(term9818, term9818.getClass(), "parser", null);
        setField(term9818, term9818.getClass(), "templateNode", null);
        setField(term9818, term9818.getClass(), "fileOverviewJSDocInfo", null);
        setField(term9818, term9818.getClass(), "state", null);
        setField(term9818, term9818.getClass(), "annotationNames", null);
        setField(term9818, term9818.getClass(), "suppressionNames", null);
        setField(term9818, term9818.getClass(), "fileLevelJsDocBuilder", null);
        setField(term9818, term9818.getClass(), "unreadToken", null);
        Class<? extends Object> term96610 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term96609 = ((Class) term96610).getDeclaredField((String) "COLON");
        ((Field) term96609).setAccessible(true);
        enum173 = ((Field) term96609).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum173;
        try {
            callMethod(klass, "extractMultilineTextualBlock", argTypes, term9818, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


