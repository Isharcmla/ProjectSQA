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

public class JsDocInfoParser_reportGenericTypeSyntaxWarning_1226954606108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26896;

    public JsDocInfoParser_reportGenericTypeSyntaxWarning_1226954606108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26944 = new ArrayList();
        ((ArrayList) term26944).add((Object)null);
        ((ArrayList) term26944).add((Object)null);
        ((ArrayList) term26944).add((Object)null);
        ((ArrayList) term26944).add((Object)null);
        ((ArrayList) term26944).add((Object)null);
        ((ArrayList) term26944).add((Object)null);
        ArrayList term26947 = new ArrayList();
        ((ArrayList) term26947).add((Object)null);
        ((ArrayList) term26947).add((Object)null);
        HashMap term26950 = new HashMap();
        ArrayList term26955 = new ArrayList();
        ((ArrayList) term26955).add((Object)null);
        ((ArrayList) term26955).add((Object)null);
        ((ArrayList) term26955).add((Object)null);
        ((ArrayList) term26955).add((Object)null);
        ((ArrayList) term26955).add((Object)null);
        ((ArrayList) term26955).add((Object)null);
        ((ArrayList) term26955).add((Object)null);
        ((ArrayList) term26955).add((Object)null);
        Class<? extends Object> term122301 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term122300 = ((Class) term122301).getDeclaredField((String) "PROTECTED");
        ((Field) term122300).setAccessible(true);
        Object enum223 = ((Field) term122300).get((Object) null);
        term26896 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term26897 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term26910 = (char[]) newCharArray(0);
        int[] term26912 = (int[]) newIntArray(2);
        Object term26940 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term26941 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term26942 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term26943 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26959 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term26960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26967 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26972 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26980 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term26981 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term26986 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term26897, term26897.getClass(), "string", "IVacFDAZcj");
        setField(term26897, term26897.getClass(), "stringBuffer", term26910);
        setIntField(term26897, term26897.getClass(), "stringBufferTop", -1186882318);
        setIntElement(term26912, 0, 1077647088);
        setIntElement(term26912, 1, -705176810);
        setField(term26897, term26897.getClass(), "ungetBuffer", term26912);
        setIntField(term26897, term26897.getClass(), "ungetCursor", -1584779593);
        setBooleanField(term26897, term26897.getClass(), "hitEOF", true);
        setIntField(term26897, term26897.getClass(), "lineStart", 303007547);
        setIntField(term26897, term26897.getClass(), "lineEndChar", 1498738343);
        setIntField(term26897, term26897.getClass(), "lineno", -1635571857);
        setIntField(term26897, term26897.getClass(), "charno", 1407309162);
        setIntField(term26897, term26897.getClass(), "initCharno", -534033672);
        setIntField(term26897, term26897.getClass(), "initLineno", -1162790806);
        setField(term26897, term26897.getClass(), "sourceString", "EEYmuwyVDP");
        setIntField(term26897, term26897.getClass(), "sourceEnd", -1264595049);
        setIntField(term26897, term26897.getClass(), "sourceCursor", -2058884635);
        setIntField(term26897, term26897.getClass(), "cursor", 1064185088);
        setIntField(term26897, term26897.getClass(), "tokenBeg", -1249782654);
        setIntField(term26897, term26897.getClass(), "tokenEnd", 399302934);
        setField(term26896, term26896.getClass(), "stream", term26897);
        setField(term26943, term26943.getClass(), "root", null);
        setField(term26943, term26943.getClass(), "sourceName", null);
        setField(term26942, term26942.getClass(), "baseType", term26943);
        setField(term26942, term26942.getClass(), "extendedInterfaces", term26944);
        setField(term26942, term26942.getClass(), "implementedInterfaces", term26947);
        setField(term26942, term26942.getClass(), "parameters", term26950);
        setField(term26942, term26942.getClass(), "thrownTypes", term26955);
        setField(term26942, term26942.getClass(), "templateTypeNames", null);
        setField(term26942, term26942.getClass(), "classTemplateTypeNames", null);
        setField(term26942, term26942.getClass(), "description", null);
        setField(term26942, term26942.getClass(), "meaning", null);
        setField(term26942, term26942.getClass(), "deprecated", null);
        setField(term26942, term26942.getClass(), "license", null);
        setField(term26942, term26942.getClass(), "suppressions", null);
        setField(term26942, term26942.getClass(), "modifies", null);
        setField(term26942, term26942.getClass(), "lendsName", null);
        setBooleanField(term26942, term26942.getClass(), "ngInject", false);
        setField(term26941, term26941.getClass(), "info", term26942);
        setField(term26959, term26959.getClass(), "sourceComment", null);
        setField(term26959, term26959.getClass(), "markers", null);
        setField(term26959, term26959.getClass(), "parameters", null);
        setField(term26959, term26959.getClass(), "throwsDescriptions", null);
        setField(term26959, term26959.getClass(), "blockDescription", null);
        setField(term26959, term26959.getClass(), "fileOverview", null);
        setField(term26959, term26959.getClass(), "returnDescription", null);
        setField(term26959, term26959.getClass(), "version", null);
        setField(term26959, term26959.getClass(), "authors", null);
        setField(term26959, term26959.getClass(), "sees", null);
        setField(term26941, term26941.getClass(), "documentation", term26959);
        setIntField(term26960, term26960.getClass(), "type", 0);
        setField(term26960, term26960.getClass(), "next", null);
        setField(term26960, term26960.getClass(), "first", null);
        setField(term26960, term26960.getClass(), "last", null);
        setField(term26960, term26960.getClass(), "propListHead", null);
        setIntField(term26960, term26960.getClass(), "sourcePosition", 0);
        setField(term26960, term26960.getClass(), "jsType", null);
        setField(term26960, term26960.getClass(), "parent", null);
        setField(term26941, term26941.getClass(), "associatedNode", term26960);
        setField(term26941, term26941.getClass(), "visibility", enum223);
        setIntField(term26941, term26941.getClass(), "bitset", -1731921726);
        setIntField(term26968, term26968.getClass(), "type", 0);
        setField(term26968, term26968.getClass(), "next", null);
        setField(term26968, term26968.getClass(), "first", null);
        setField(term26968, term26968.getClass(), "last", null);
        setField(term26968, term26968.getClass(), "propListHead", null);
        setIntField(term26968, term26968.getClass(), "sourcePosition", 0);
        setField(term26968, term26968.getClass(), "jsType", null);
        setField(term26968, term26968.getClass(), "parent", null);
        setField(term26967, term26967.getClass(), "root", term26968);
        setField(term26967, term26967.getClass(), "sourceName", "");
        setField(term26941, term26941.getClass(), "type", term26967);
        setIntField(term26973, term26973.getClass(), "type", 0);
        setField(term26973, term26973.getClass(), "next", null);
        setField(term26973, term26973.getClass(), "first", null);
        setField(term26973, term26973.getClass(), "last", null);
        setField(term26973, term26973.getClass(), "propListHead", null);
        setIntField(term26973, term26973.getClass(), "sourcePosition", 0);
        setField(term26973, term26973.getClass(), "jsType", null);
        setField(term26973, term26973.getClass(), "parent", null);
        setField(term26972, term26972.getClass(), "root", term26973);
        setField(term26972, term26972.getClass(), "sourceName", "");
        setField(term26941, term26941.getClass(), "thisType", term26972);
        setBooleanField(term26941, term26941.getClass(), "includeDocumentation", false);
        setField(term26940, term26940.getClass(), "currentInfo", term26941);
        setBooleanField(term26940, term26940.getClass(), "populated", false);
        setBooleanField(term26940, term26940.getClass(), "parseDocumentation", true);
        setField(term26981, term26981.getClass(), "item", null);
        setIntField(term26981, term26981.getClass(), "startLineno", 0);
        setIntField(term26981, term26981.getClass(), "startCharno", 0);
        setIntField(term26981, term26981.getClass(), "endLineno", 0);
        setIntField(term26981, term26981.getClass(), "endCharno", 0);
        setField(term26980, term26980.getClass(), "annotation", term26981);
        setField(term26986, term26986.getClass(), "item", null);
        setIntField(term26986, term26986.getClass(), "startLineno", 0);
        setIntField(term26986, term26986.getClass(), "startCharno", 0);
        setIntField(term26986, term26986.getClass(), "endLineno", 0);
        setIntField(term26986, term26986.getClass(), "endCharno", 0);
        setField(term26980, term26980.getClass(), "name", term26986);
        setField(term26980, term26980.getClass(), "nameNode", null);
        setField(term26980, term26980.getClass(), "description", null);
        setField(term26980, term26980.getClass(), "type", null);
        setField(term26940, term26940.getClass(), "currentMarker", term26980);
        setField(term26896, term26896.getClass(), "jsdocBuilder", term26940);
        setField(term26896, term26896.getClass(), "sourceFile", null);
        setField(term26896, term26896.getClass(), "associatedNode", term26968);
        setField(term26896, term26896.getClass(), "errorReporter", null);
        setField(term26896, term26896.getClass(), "parser", null);
        setField(term26896, term26896.getClass(), "templateNode", null);
        setField(term26896, term26896.getClass(), "fileOverviewJSDocInfo", null);
        setField(term26896, term26896.getClass(), "state", null);
        setField(term26896, term26896.getClass(), "annotationNames", null);
        setField(term26896, term26896.getClass(), "suppressionNames", null);
        setField(term26896, term26896.getClass(), "fileLevelJsDocBuilder", null);
        setField(term26896, term26896.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reportGenericTypeSyntaxWarning", argTypes, term26896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


