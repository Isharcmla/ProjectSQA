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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNameNode_18260829663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8302;
     Object enum162;
     Object term8501;
     Object term8503;
     Object term8505;

    public JsDocInfoParser_parseAndRecordTypeNameNode_18260829663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8354 = new HashMap();
        HashMap term8363 = new HashMap();
        Set<Object> term294407 =  ((Map) term8363).keySet();
        HashSet term8362 = new HashSet((Collection<? extends Object>) term294407);
        HashMap term8370 = new HashMap();
        Set<Object> term294408 =  ((Map) term8370).keySet();
        HashSet term8369 = new HashSet((Collection<? extends Object>) term294408);
        HashMap term8377 = new HashMap();
        Set<Object> term294409 =  ((Map) term8377).keySet();
        HashSet term8376 = new HashSet((Collection<? extends Object>) term294409);
        HashMap term8383 = new HashMap();
        HashMap term8388 = new HashMap();
        Class<? extends Object> term294431 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term294430 = ((Class) term294431).getDeclaredField((String) "PRIVATE");
        ((Field) term294430).setAccessible(true);
        Object enum160 = ((Field) term294430).get((Object) null);
        Class<? extends Object> term294709 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term294708 = ((Class) term294709).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term294708).setAccessible(true);
        Object enum161 = ((Field) term294708).get((Object) null);
        HashMap term8482 = new HashMap();
        term8302 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term8303 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term8316 = (char[]) newCharArray(6);
        int[] term8324 = (int[]) newIntArray(2);
        Object term8352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8353 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term8409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term8423 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term8424 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term8425 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term8430 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term8431 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term8435 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term8436 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term8441 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term8454 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term8455 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term8493 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term8303, term8303.getClass(), "string", "PXdVZyoJyC");
        setCharElement(term8316, 0, 'Y');
        setCharElement(term8316, 1, 'F');
        setCharElement(term8316, 2, 's');
        setCharElement(term8316, 3, 'j');
        setCharElement(term8316, 4, 'J');
        setCharElement(term8316, 5, 'C');
        setField(term8303, term8303.getClass(), "stringBuffer", term8316);
        setIntField(term8303, term8303.getClass(), "stringBufferTop", 1953277050);
        setIntElement(term8324, 0, 1283079251);
        setIntElement(term8324, 1, -523949691);
        setField(term8303, term8303.getClass(), "ungetBuffer", term8324);
        setIntField(term8303, term8303.getClass(), "ungetCursor", 1398204340);
        setBooleanField(term8303, term8303.getClass(), "hitEOF", true);
        setIntField(term8303, term8303.getClass(), "lineStart", 229204365);
        setIntField(term8303, term8303.getClass(), "lineEndChar", -461771056);
        setIntField(term8303, term8303.getClass(), "lineno", -243422082);
        setIntField(term8303, term8303.getClass(), "charno", 1384592638);
        setIntField(term8303, term8303.getClass(), "initCharno", -1002370457);
        setIntField(term8303, term8303.getClass(), "initLineno", -2014576105);
        setField(term8303, term8303.getClass(), "sourceString", "vLerpqavFM");
        setIntField(term8303, term8303.getClass(), "sourceEnd", 1296895584);
        setIntField(term8303, term8303.getClass(), "sourceCursor", 628918458);
        setIntField(term8303, term8303.getClass(), "cursor", -1274456137);
        setIntField(term8303, term8303.getClass(), "tokenBeg", 1041916673);
        setIntField(term8303, term8303.getClass(), "tokenEnd", -601863069);
        setField(term8302, term8302.getClass(), "stream", term8303);
        setField(term8352, term8352.getClass(), "reporter", null);
        setField(term8352, term8352.getClass(), "nativeTypes", term8353);
        setField(term8352, term8352.getClass(), "namesToTypes", term8354);
        setField(term8352, term8352.getClass(), "namespaces", term8362);
        setField(term8352, term8352.getClass(), "enumTypeNames", term8369);
        setField(term8352, term8352.getClass(), "forwardDeclaredTypes", term8376);
        setField(term8352, term8352.getClass(), "typesIndexedByProperty", term8383);
        setField(term8352, term8352.getClass(), "greatestSubtypeByProperty", term8388);
        setField(term8352, term8352.getClass(), "interfaceToImplementors", null);
        setField(term8352, term8352.getClass(), "unresolvedNamedTypes", null);
        setField(term8352, term8352.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8352, term8352.getClass(), "lastGeneration", true);
        setField(term8352, term8352.getClass(), "templateTypeName", "nRvKihUSPj");
        setField(term8409, term8409.getClass(), "name", "BbNeQJpYPr");
        setField(term8409, term8409.getClass(), "referencedType", null);
        setBooleanField(term8409, term8409.getClass(), "visited", true);
        setField(term8424, term8424.getClass(), "baseType", null);
        setField(term8424, term8424.getClass(), "implementedInterfaces", null);
        setField(term8424, term8424.getClass(), "parameters", null);
        setField(term8424, term8424.getClass(), "thrownTypes", null);
        setField(term8424, term8424.getClass(), "templateTypeName", null);
        setField(term8424, term8424.getClass(), "description", null);
        setField(term8424, term8424.getClass(), "deprecated", null);
        setField(term8424, term8424.getClass(), "license", null);
        setField(term8424, term8424.getClass(), "suppressions", null);
        setField(term8423, term8423.getClass(), "info", term8424);
        setField(term8425, term8425.getClass(), "markers", null);
        setField(term8425, term8425.getClass(), "parameters", null);
        setField(term8425, term8425.getClass(), "throwsDescriptions", null);
        setField(term8425, term8425.getClass(), "blockDescription", null);
        setField(term8425, term8425.getClass(), "fileOverview", null);
        setField(term8425, term8425.getClass(), "returnDescription", null);
        setField(term8425, term8425.getClass(), "version", null);
        setField(term8425, term8425.getClass(), "authors", null);
        setField(term8425, term8425.getClass(), "sees", null);
        setField(term8423, term8423.getClass(), "documentation", term8425);
        setField(term8423, term8423.getClass(), "sourceName", "");
        setField(term8423, term8423.getClass(), "visibility", enum160);
        setIntField(term8423, term8423.getClass(), "bitset", 663292551);
        setField(term8430, term8430.getClass(), "root", null);
        setField(term8430, term8430.getClass(), "sourceName", null);
        setField(term8430, term8430.getClass(), "registry", null);
        setField(term8423, term8423.getClass(), "type", term8430);
        setField(term8431, term8431.getClass(), "root", null);
        setField(term8431, term8431.getClass(), "sourceName", null);
        setField(term8431, term8431.getClass(), "registry", null);
        setField(term8423, term8423.getClass(), "thisType", term8431);
        setBooleanField(term8423, term8423.getClass(), "includeDocumentation", false);
        setField(term8409, term8409.getClass(), "docInfo", term8423);
        setBooleanField(term8409, term8409.getClass(), "unknown", false);
        setBooleanField(term8409, term8409.getClass(), "resolved", false);
        setField(term8409, term8409.getClass(), "resolveResult", null);
        setField(term8409, term8409.getClass(), "registry", null);
        setField(term8352, term8352.getClass(), "templateType", term8409);
        setField(term8302, term8302.getClass(), "typeRegistry", term8352);
        setField(term8436, term8436.getClass(), "info", null);
        setField(term8436, term8436.getClass(), "documentation", null);
        setField(term8436, term8436.getClass(), "sourceName", null);
        setField(term8436, term8436.getClass(), "visibility", null);
        setIntField(term8436, term8436.getClass(), "bitset", 0);
        setField(term8436, term8436.getClass(), "type", null);
        setField(term8436, term8436.getClass(), "thisType", null);
        setBooleanField(term8436, term8436.getClass(), "includeDocumentation", false);
        setField(term8435, term8435.getClass(), "currentInfo", term8436);
        setBooleanField(term8435, term8435.getClass(), "populated", false);
        setBooleanField(term8435, term8435.getClass(), "parseDocumentation", false);
        setField(term8441, term8441.getClass(), "annotation", null);
        setField(term8441, term8441.getClass(), "name", null);
        setField(term8441, term8441.getClass(), "description", null);
        setField(term8441, term8441.getClass(), "type", null);
        setField(term8435, term8435.getClass(), "currentMarker", term8441);
        setField(term8302, term8302.getClass(), "jsdocBuilder", term8435);
        setField(term8302, term8302.getClass(), "sourceName", "RCOqfVsRHt");
        setField(term8302, term8302.getClass(), "errorReporter", null);
        setField(term8454, term8454.getClass(), "this$0", null);
        setField(term8302, term8302.getClass(), "parser", term8454);
        setField(term8455, term8455.getClass(), "info", null);
        setField(term8455, term8455.getClass(), "documentation", null);
        setField(term8455, term8455.getClass(), "sourceName", null);
        setField(term8455, term8455.getClass(), "visibility", null);
        setIntField(term8455, term8455.getClass(), "bitset", 0);
        setField(term8455, term8455.getClass(), "type", null);
        setField(term8455, term8455.getClass(), "thisType", null);
        setBooleanField(term8455, term8455.getClass(), "includeDocumentation", false);
        setField(term8302, term8302.getClass(), "fileOverviewJSDocInfo", term8455);
        setField(term8302, term8302.getClass(), "state", enum161);
        setField(term8302, term8302.getClass(), "annotationNames", term8482);
        setField(term8493, term8493.getClass(), "this$0", null);
        setField(term8302, term8302.getClass(), "fileLevelJsDocBuilder", term8493);
        setField(term8302, term8302.getClass(), "unreadToken", null);
        Class<? extends Object> term295066 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term295065 = ((Class) term295066).getDeclaredField((String) "EOL");
        ((Field) term295065).setAccessible(true);
        enum162 = ((Field) term295065).get((Object) null);
        term8501 = new Integer(-2066804303);
        term8503 = new Integer(-1731761810);
        term8505 = new Boolean(false);
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
        args[0] = enum162;
        args[1] = term8501;
        args[2] = term8503;
        args[3] = term8505;
        try {
            callMethod(klass, "parseAndRecordTypeNameNode", argTypes, term8302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


