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
import java.lang.Integer;
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNameNode_18260829674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6350;
     Object enum163;
     Object term6459;
     Object term6461;
     Object term6463;

    public JsDocInfoParser_parseAndRecordTypeNameNode_18260829674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6405 = new ArrayList();
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ArrayList term6408 = new ArrayList();
        ((ArrayList) term6408).add((Object)null);
        ((ArrayList) term6408).add((Object)null);
        ((ArrayList) term6408).add((Object)null);
        ((ArrayList) term6408).add((Object)null);
        ((ArrayList) term6408).add((Object)null);
        ((ArrayList) term6408).add((Object)null);
        ((ArrayList) term6408).add((Object)null);
        ((ArrayList) term6408).add((Object)null);
        ((ArrayList) term6408).add((Object)null);
        HashMap term6411 = new HashMap();
        ArrayList term6416 = new ArrayList();
        ((ArrayList) term6416).add((Object)null);
        ((ArrayList) term6416).add((Object)null);
        ((ArrayList) term6416).add((Object)null);
        ((ArrayList) term6416).add((Object)null);
        ((ArrayList) term6416).add((Object)null);
        ((ArrayList) term6416).add((Object)null);
        ((ArrayList) term6416).add((Object)null);
        Class<? extends Object> term92157 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term92156 = ((Class) term92157).getDeclaredField((String) "PRIVATE");
        ((Field) term92156).setAccessible(true);
        Object enum162 = ((Field) term92156).get((Object) null);
        term6350 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term6351 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term6364 = (char[]) newCharArray(9);
        int[] term6375 = (int[]) newIntArray(0);
        Object term6401 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term6402 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6403 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6404 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6420 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6428 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6436 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term6437 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term6442 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term6447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6351, term6351.getClass(), "string", "aNWLJdrZMq");
        setCharElement(term6364, 0, 'Y');
        setCharElement(term6364, 1, 'F');
        setCharElement(term6364, 2, 's');
        setCharElement(term6364, 3, 'j');
        setCharElement(term6364, 4, 'J');
        setCharElement(term6364, 5, 'C');
        setCharElement(term6364, 6, 'Z');
        setCharElement(term6364, 7, 'p');
        setCharElement(term6364, 8, 'V');
        setField(term6351, term6351.getClass(), "stringBuffer", term6364);
        setIntField(term6351, term6351.getClass(), "stringBufferTop", 1166710220);
        setField(term6351, term6351.getClass(), "ungetBuffer", term6375);
        setIntField(term6351, term6351.getClass(), "ungetCursor", -1070592289);
        setBooleanField(term6351, term6351.getClass(), "hitEOF", true);
        setIntField(term6351, term6351.getClass(), "lineStart", -1464172784);
        setIntField(term6351, term6351.getClass(), "lineEndChar", 32185364);
        setIntField(term6351, term6351.getClass(), "lineno", 1768204942);
        setIntField(term6351, term6351.getClass(), "charno", 1252951645);
        setIntField(term6351, term6351.getClass(), "initCharno", 574481092);
        setIntField(term6351, term6351.getClass(), "initLineno", -310528004);
        setField(term6351, term6351.getClass(), "sourceString", "HHmNoYxIGj");
        setIntField(term6351, term6351.getClass(), "sourceEnd", -634976996);
        setIntField(term6351, term6351.getClass(), "sourceCursor", -1015274146);
        setIntField(term6351, term6351.getClass(), "cursor", -49052672);
        setIntField(term6351, term6351.getClass(), "tokenBeg", 339372704);
        setIntField(term6351, term6351.getClass(), "tokenEnd", -851097944);
        setField(term6350, term6350.getClass(), "stream", term6351);
        setField(term6404, term6404.getClass(), "root", null);
        setField(term6404, term6404.getClass(), "sourceName", null);
        setField(term6403, term6403.getClass(), "baseType", term6404);
        setField(term6403, term6403.getClass(), "extendedInterfaces", term6405);
        setField(term6403, term6403.getClass(), "implementedInterfaces", term6408);
        setField(term6403, term6403.getClass(), "parameters", term6411);
        setField(term6403, term6403.getClass(), "thrownTypes", term6416);
        setField(term6403, term6403.getClass(), "templateTypeNames", null);
        setField(term6403, term6403.getClass(), "classTemplateTypeNames", null);
        setField(term6403, term6403.getClass(), "description", null);
        setField(term6403, term6403.getClass(), "meaning", null);
        setField(term6403, term6403.getClass(), "deprecated", null);
        setField(term6403, term6403.getClass(), "license", null);
        setField(term6403, term6403.getClass(), "suppressions", null);
        setField(term6403, term6403.getClass(), "modifies", null);
        setField(term6403, term6403.getClass(), "lendsName", null);
        setBooleanField(term6403, term6403.getClass(), "ngInject", false);
        setField(term6402, term6402.getClass(), "info", term6403);
        setField(term6420, term6420.getClass(), "sourceComment", null);
        setField(term6420, term6420.getClass(), "markers", null);
        setField(term6420, term6420.getClass(), "parameters", null);
        setField(term6420, term6420.getClass(), "throwsDescriptions", null);
        setField(term6420, term6420.getClass(), "blockDescription", null);
        setField(term6420, term6420.getClass(), "fileOverview", null);
        setField(term6420, term6420.getClass(), "returnDescription", null);
        setField(term6420, term6420.getClass(), "version", null);
        setField(term6420, term6420.getClass(), "authors", null);
        setField(term6420, term6420.getClass(), "sees", null);
        setField(term6402, term6402.getClass(), "documentation", term6420);
        setIntField(term6421, term6421.getClass(), "type", 0);
        setField(term6421, term6421.getClass(), "next", null);
        setField(term6421, term6421.getClass(), "first", null);
        setField(term6421, term6421.getClass(), "last", null);
        setField(term6421, term6421.getClass(), "propListHead", null);
        setIntField(term6421, term6421.getClass(), "sourcePosition", 0);
        setField(term6421, term6421.getClass(), "jsType", null);
        setField(term6421, term6421.getClass(), "parent", null);
        setField(term6402, term6402.getClass(), "associatedNode", term6421);
        setField(term6402, term6402.getClass(), "visibility", enum162);
        setIntField(term6402, term6402.getClass(), "bitset", -1404350380);
        setIntField(term6429, term6429.getClass(), "type", -1835839814);
        setField(term6429, term6429.getClass(), "next", null);
        setField(term6429, term6429.getClass(), "first", null);
        setField(term6429, term6429.getClass(), "last", term6421);
        setField(term6429, term6429.getClass(), "propListHead", null);
        setIntField(term6429, term6429.getClass(), "sourcePosition", 0);
        setField(term6429, term6429.getClass(), "jsType", null);
        setField(term6429, term6429.getClass(), "parent", null);
        setField(term6428, term6428.getClass(), "root", term6429);
        setField(term6428, term6428.getClass(), "sourceName", "");
        setField(term6402, term6402.getClass(), "type", term6428);
        setField(term6402, term6402.getClass(), "thisType", term6428);
        setBooleanField(term6402, term6402.getClass(), "includeDocumentation", true);
        setField(term6401, term6401.getClass(), "currentInfo", term6402);
        setBooleanField(term6401, term6401.getClass(), "populated", false);
        setBooleanField(term6401, term6401.getClass(), "parseDocumentation", true);
        setField(term6437, term6437.getClass(), "item", null);
        setIntField(term6437, term6437.getClass(), "startLineno", 0);
        setIntField(term6437, term6437.getClass(), "startCharno", 0);
        setIntField(term6437, term6437.getClass(), "endLineno", 0);
        setIntField(term6437, term6437.getClass(), "endCharno", 0);
        setField(term6436, term6436.getClass(), "annotation", term6437);
        setField(term6442, term6442.getClass(), "item", null);
        setIntField(term6442, term6442.getClass(), "startLineno", 0);
        setIntField(term6442, term6442.getClass(), "startCharno", 0);
        setIntField(term6442, term6442.getClass(), "endLineno", 0);
        setIntField(term6442, term6442.getClass(), "endCharno", 0);
        setField(term6436, term6436.getClass(), "name", term6442);
        setField(term6436, term6436.getClass(), "nameNode", null);
        setField(term6436, term6436.getClass(), "description", null);
        setField(term6436, term6436.getClass(), "type", null);
        setField(term6401, term6401.getClass(), "currentMarker", term6436);
        setField(term6350, term6350.getClass(), "jsdocBuilder", term6401);
        setField(term6350, term6350.getClass(), "sourceFile", null);
        setIntField(term6447, term6447.getClass(), "type", 0);
        setField(term6447, term6447.getClass(), "next", null);
        setField(term6447, term6447.getClass(), "first", null);
        setField(term6447, term6447.getClass(), "last", null);
        setField(term6447, term6447.getClass(), "propListHead", null);
        setIntField(term6447, term6447.getClass(), "sourcePosition", 0);
        setField(term6447, term6447.getClass(), "jsType", null);
        setField(term6447, term6447.getClass(), "parent", null);
        setField(term6350, term6350.getClass(), "associatedNode", term6447);
        setField(term6350, term6350.getClass(), "errorReporter", null);
        setField(term6350, term6350.getClass(), "parser", null);
        setField(term6350, term6350.getClass(), "templateNode", null);
        setField(term6350, term6350.getClass(), "fileOverviewJSDocInfo", null);
        setField(term6350, term6350.getClass(), "state", null);
        setField(term6350, term6350.getClass(), "annotationNames", null);
        setField(term6350, term6350.getClass(), "suppressionNames", null);
        setField(term6350, term6350.getClass(), "fileLevelJsDocBuilder", null);
        setField(term6350, term6350.getClass(), "unreadToken", null);
        Class<? extends Object> term92425 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term92424 = ((Class) term92425).getDeclaredField((String) "COLON");
        ((Field) term92424).setAccessible(true);
        enum163 = ((Field) term92424).get((Object) null);
        term6459 = new Integer(-2013924238);
        term6461 = new Integer(579006268);
        term6463 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = enum163;
        args[1] = term6459;
        args[2] = term6461;
        args[3] = term6463;
        try {
            callMethod(klass, "parseAndRecordTypeNameNode", argTypes, term6350, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


