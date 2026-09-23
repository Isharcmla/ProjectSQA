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
import java.lang.Integer;
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNode_106210483573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8568;
     Object enum167;
     Object term8693;
     Object term8695;
     Object term8697;
     Object term8699;

    public JsDocInfoParser_parseAndRecordTypeNode_106210483573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8618 = new ArrayList();
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ArrayList term8621 = new ArrayList();
        ((ArrayList) term8621).add((Object)null);
        ((ArrayList) term8621).add((Object)null);
        ((ArrayList) term8621).add((Object)null);
        ((ArrayList) term8621).add((Object)null);
        HashMap term8624 = new HashMap();
        ArrayList term8629 = new ArrayList();
        ((ArrayList) term8629).add((Object)null);
        ((ArrayList) term8629).add((Object)null);
        ((ArrayList) term8629).add((Object)null);
        ((ArrayList) term8629).add((Object)null);
        ((ArrayList) term8629).add((Object)null);
        ((ArrayList) term8629).add((Object)null);
        ((ArrayList) term8629).add((Object)null);
        ((ArrayList) term8629).add((Object)null);
        HashSet term8637 = new HashSet();
        HashSet term8638 = new HashSet();
        ArrayList term8642 = new ArrayList();
        ((ArrayList) term8642).add((Object)null);
        ((ArrayList) term8642).add((Object)null);
        ((ArrayList) term8642).add((Object)null);
        ((ArrayList) term8642).add((Object)null);
        HashMap term8645 = new HashMap();
        Class<? extends Object> term84834 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term84833 = ((Class) term84834).getDeclaredField((String) "INHERITED");
        ((Field) term84833).setAccessible(true);
        Object enum166 = ((Field) term84833).get((Object) null);
        term8568 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term8569 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term8582 = (char[]) newCharArray(2);
        int[] term8586 = (int[]) newIntArray(2);
        Object term8614 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term8615 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term8616 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term8617 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term8640 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term8650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8657 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term8658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8662 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term8663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8670 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term8671 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term8676 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term8681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8569, term8569.getClass(), "string", "KtuuNAqGCQ");
        setCharElement(term8582, 0, 't');
        setCharElement(term8582, 1, 'D');
        setField(term8569, term8569.getClass(), "stringBuffer", term8582);
        setIntField(term8569, term8569.getClass(), "stringBufferTop", -1127721881);
        setIntElement(term8586, 0, 1074848808);
        setIntElement(term8586, 1, -146054762);
        setField(term8569, term8569.getClass(), "ungetBuffer", term8586);
        setIntField(term8569, term8569.getClass(), "ungetCursor", 798043553);
        setBooleanField(term8569, term8569.getClass(), "hitEOF", false);
        setIntField(term8569, term8569.getClass(), "lineStart", 533197381);
        setIntField(term8569, term8569.getClass(), "lineEndChar", 1048271679);
        setIntField(term8569, term8569.getClass(), "lineno", -1529797673);
        setIntField(term8569, term8569.getClass(), "charno", -868676396);
        setIntField(term8569, term8569.getClass(), "initCharno", 1922684808);
        setIntField(term8569, term8569.getClass(), "initLineno", -2005784375);
        setField(term8569, term8569.getClass(), "sourceString", "OGQsfjmReM");
        setIntField(term8569, term8569.getClass(), "sourceEnd", -288604325);
        setIntField(term8569, term8569.getClass(), "sourceCursor", -1268314569);
        setIntField(term8569, term8569.getClass(), "cursor", 877649659);
        setIntField(term8569, term8569.getClass(), "tokenBeg", -1332748804);
        setIntField(term8569, term8569.getClass(), "tokenEnd", 1774507971);
        setField(term8568, term8568.getClass(), "stream", term8569);
        setField(term8617, term8617.getClass(), "root", null);
        setField(term8617, term8617.getClass(), "sourceName", null);
        setField(term8616, term8616.getClass(), "baseType", term8617);
        setField(term8616, term8616.getClass(), "extendedInterfaces", term8618);
        setField(term8616, term8616.getClass(), "implementedInterfaces", term8621);
        setField(term8616, term8616.getClass(), "parameters", term8624);
        setField(term8616, term8616.getClass(), "thrownTypes", term8629);
        setField(term8616, term8616.getClass(), "templateTypeName", "");
        setField(term8616, term8616.getClass(), "description", "");
        setField(term8616, term8616.getClass(), "meaning", "");
        setField(term8616, term8616.getClass(), "deprecated", "");
        setField(term8616, term8616.getClass(), "license", "");
        setField(term8616, term8616.getClass(), "suppressions", term8637);
        setField(term8616, term8616.getClass(), "modifies", term8638);
        setField(term8616, term8616.getClass(), "lendsName", "");
        setField(term8615, term8615.getClass(), "info", term8616);
        setField(term8640, term8640.getClass(), "sourceComment", "");
        setField(term8640, term8640.getClass(), "markers", term8642);
        setField(term8640, term8640.getClass(), "parameters", term8645);
        setField(term8640, term8640.getClass(), "throwsDescriptions", null);
        setField(term8640, term8640.getClass(), "blockDescription", null);
        setField(term8640, term8640.getClass(), "fileOverview", null);
        setField(term8640, term8640.getClass(), "returnDescription", null);
        setField(term8640, term8640.getClass(), "version", null);
        setField(term8640, term8640.getClass(), "authors", null);
        setField(term8640, term8640.getClass(), "sees", null);
        setField(term8615, term8615.getClass(), "documentation", term8640);
        setIntField(term8650, term8650.getClass(), "type", 0);
        setField(term8650, term8650.getClass(), "next", null);
        setField(term8650, term8650.getClass(), "first", null);
        setField(term8650, term8650.getClass(), "last", null);
        setField(term8650, term8650.getClass(), "propListHead", null);
        setIntField(term8650, term8650.getClass(), "sourcePosition", 0);
        setField(term8650, term8650.getClass(), "jsType", null);
        setField(term8650, term8650.getClass(), "parent", null);
        setField(term8615, term8615.getClass(), "associatedNode", term8650);
        setField(term8615, term8615.getClass(), "visibility", enum166);
        setIntField(term8615, term8615.getClass(), "bitset", 844222656);
        setIntField(term8658, term8658.getClass(), "type", 1272542218);
        setField(term8658, term8658.getClass(), "next", null);
        setField(term8658, term8658.getClass(), "first", null);
        setField(term8658, term8658.getClass(), "last", term8650);
        setField(term8658, term8658.getClass(), "propListHead", null);
        setIntField(term8658, term8658.getClass(), "sourcePosition", 0);
        setField(term8658, term8658.getClass(), "jsType", null);
        setField(term8658, term8658.getClass(), "parent", null);
        setField(term8657, term8657.getClass(), "root", term8658);
        setField(term8657, term8657.getClass(), "sourceName", "");
        setField(term8615, term8615.getClass(), "type", term8657);
        setIntField(term8663, term8663.getClass(), "type", 0);
        setField(term8663, term8663.getClass(), "next", null);
        setField(term8663, term8663.getClass(), "first", null);
        setField(term8663, term8663.getClass(), "last", null);
        setField(term8663, term8663.getClass(), "propListHead", null);
        setIntField(term8663, term8663.getClass(), "sourcePosition", 0);
        setField(term8663, term8663.getClass(), "jsType", null);
        setField(term8663, term8663.getClass(), "parent", null);
        setField(term8662, term8662.getClass(), "root", term8663);
        setField(term8662, term8662.getClass(), "sourceName", "");
        setField(term8615, term8615.getClass(), "thisType", term8662);
        setBooleanField(term8615, term8615.getClass(), "includeDocumentation", true);
        setField(term8614, term8614.getClass(), "currentInfo", term8615);
        setBooleanField(term8614, term8614.getClass(), "populated", false);
        setBooleanField(term8614, term8614.getClass(), "parseDocumentation", true);
        setField(term8671, term8671.getClass(), "item", null);
        setIntField(term8671, term8671.getClass(), "startLineno", 0);
        setIntField(term8671, term8671.getClass(), "startCharno", 0);
        setIntField(term8671, term8671.getClass(), "endLineno", 0);
        setIntField(term8671, term8671.getClass(), "endCharno", 0);
        setField(term8670, term8670.getClass(), "annotation", term8671);
        setField(term8676, term8676.getClass(), "item", null);
        setIntField(term8676, term8676.getClass(), "startLineno", 0);
        setIntField(term8676, term8676.getClass(), "startCharno", 0);
        setIntField(term8676, term8676.getClass(), "endLineno", 0);
        setIntField(term8676, term8676.getClass(), "endCharno", 0);
        setField(term8670, term8670.getClass(), "name", term8676);
        setField(term8670, term8670.getClass(), "nameNode", null);
        setField(term8670, term8670.getClass(), "description", null);
        setField(term8670, term8670.getClass(), "type", null);
        setField(term8614, term8614.getClass(), "currentMarker", term8670);
        setField(term8568, term8568.getClass(), "jsdocBuilder", term8614);
        setField(term8568, term8568.getClass(), "sourceFile", null);
        setIntField(term8681, term8681.getClass(), "type", 0);
        setField(term8681, term8681.getClass(), "next", null);
        setField(term8681, term8681.getClass(), "first", null);
        setField(term8681, term8681.getClass(), "last", null);
        setField(term8681, term8681.getClass(), "propListHead", null);
        setIntField(term8681, term8681.getClass(), "sourcePosition", 0);
        setField(term8681, term8681.getClass(), "jsType", null);
        setField(term8681, term8681.getClass(), "parent", null);
        setField(term8568, term8568.getClass(), "associatedNode", term8681);
        setField(term8568, term8568.getClass(), "errorReporter", null);
        setField(term8568, term8568.getClass(), "parser", null);
        setField(term8568, term8568.getClass(), "templateNode", null);
        setField(term8568, term8568.getClass(), "fileOverviewJSDocInfo", null);
        setField(term8568, term8568.getClass(), "state", null);
        setField(term8568, term8568.getClass(), "annotationNames", null);
        setField(term8568, term8568.getClass(), "suppressionNames", null);
        setField(term8568, term8568.getClass(), "fileLevelJsDocBuilder", null);
        setField(term8568, term8568.getClass(), "unreadToken", null);
        Class<? extends Object> term85108 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term85107 = ((Class) term85108).getDeclaredField((String) "COLON");
        ((Field) term85107).setAccessible(true);
        enum167 = ((Field) term85107).get((Object) null);
        term8693 = new Integer(-18216811);
        term8695 = new Integer(-1813280137);
        term8697 = new Boolean(false);
        term8699 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = enum167;
        args[1] = term8693;
        args[2] = term8695;
        args[3] = term8697;
        args[4] = term8699;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term8568, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


