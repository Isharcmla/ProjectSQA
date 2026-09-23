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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_match_137427545699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46344;
     Object enum261;

    public JsDocInfoParser_match_137427545699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46393 = new HashMap();
        HashMap term46402 = new HashMap();
        Set<Object> term337382 =  ((Map) term46402).keySet();
        HashSet term46401 = new HashSet((Collection<? extends Object>) term337382);
        HashMap term46409 = new HashMap();
        Set<Object> term337383 =  ((Map) term46409).keySet();
        HashSet term46408 = new HashSet((Collection<? extends Object>) term337383);
        HashMap term46416 = new HashMap();
        Set<Object> term337384 =  ((Map) term46416).keySet();
        HashSet term46415 = new HashSet((Collection<? extends Object>) term337384);
        HashMap term46421 = new HashMap();
        HashMap term46426 = new HashMap();
        Class<? extends Object> term337406 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term337405 = ((Class) term337406).getDeclaredField((String) "PROTECTED");
        ((Field) term337405).setAccessible(true);
        Object enum259 = ((Field) term337405).get((Object) null);
        Class<? extends Object> term337690 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term337689 = ((Class) term337690).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term337689).setAccessible(true);
        Object enum260 = ((Field) term337689).get((Object) null);
        HashMap term46516 = new HashMap();
        term46344 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term46345 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term46358 = (char[]) newCharArray(5);
        int[] term46365 = (int[]) newIntArray(0);
        Object term46391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term46392 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term46447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term46461 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term46462 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term46463 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term46468 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term46472 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term46473 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term46478 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term46491 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term46492 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term46527 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term46345, term46345.getClass(), "string", "tXsfWIqIPn");
        setCharElement(term46358, 0, 'Y');
        setCharElement(term46358, 1, 'B');
        setCharElement(term46358, 2, 'e');
        setCharElement(term46358, 3, 'p');
        setCharElement(term46358, 4, 'C');
        setField(term46345, term46345.getClass(), "stringBuffer", term46358);
        setIntField(term46345, term46345.getClass(), "stringBufferTop", 836734074);
        setField(term46345, term46345.getClass(), "ungetBuffer", term46365);
        setIntField(term46345, term46345.getClass(), "ungetCursor", -1747711865);
        setBooleanField(term46345, term46345.getClass(), "hitEOF", false);
        setIntField(term46345, term46345.getClass(), "lineStart", 682812715);
        setIntField(term46345, term46345.getClass(), "lineEndChar", -1092883950);
        setIntField(term46345, term46345.getClass(), "lineno", 950385621);
        setIntField(term46345, term46345.getClass(), "charno", -232352320);
        setIntField(term46345, term46345.getClass(), "initCharno", -232333014);
        setIntField(term46345, term46345.getClass(), "initLineno", -139694079);
        setField(term46345, term46345.getClass(), "sourceString", "tDmfqEyHaN");
        setIntField(term46345, term46345.getClass(), "sourceEnd", -1602072035);
        setIntField(term46345, term46345.getClass(), "sourceCursor", 1902624392);
        setIntField(term46345, term46345.getClass(), "cursor", 904607217);
        setIntField(term46345, term46345.getClass(), "tokenBeg", 434914590);
        setIntField(term46345, term46345.getClass(), "tokenEnd", 1983756621);
        setField(term46344, term46344.getClass(), "stream", term46345);
        setField(term46391, term46391.getClass(), "reporter", null);
        setField(term46391, term46391.getClass(), "nativeTypes", term46392);
        setField(term46391, term46391.getClass(), "namesToTypes", term46393);
        setField(term46391, term46391.getClass(), "namespaces", term46401);
        setField(term46391, term46391.getClass(), "enumTypeNames", term46408);
        setField(term46391, term46391.getClass(), "forwardDeclaredTypes", term46415);
        setField(term46391, term46391.getClass(), "typesIndexedByProperty", term46421);
        setField(term46391, term46391.getClass(), "greatestSubtypeByProperty", term46426);
        setField(term46391, term46391.getClass(), "interfaceToImplementors", null);
        setField(term46391, term46391.getClass(), "unresolvedNamedTypes", null);
        setField(term46391, term46391.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term46391, term46391.getClass(), "lastGeneration", true);
        setField(term46391, term46391.getClass(), "templateTypeName", "COhzwXcfds");
        setField(term46447, term46447.getClass(), "name", "anncJTnzrg");
        setField(term46447, term46447.getClass(), "referencedType", null);
        setBooleanField(term46447, term46447.getClass(), "visited", false);
        setField(term46462, term46462.getClass(), "baseType", null);
        setField(term46462, term46462.getClass(), "implementedInterfaces", null);
        setField(term46462, term46462.getClass(), "parameters", null);
        setField(term46462, term46462.getClass(), "thrownTypes", null);
        setField(term46462, term46462.getClass(), "templateTypeName", null);
        setField(term46462, term46462.getClass(), "description", null);
        setField(term46462, term46462.getClass(), "deprecated", null);
        setField(term46462, term46462.getClass(), "license", null);
        setField(term46462, term46462.getClass(), "suppressions", null);
        setField(term46461, term46461.getClass(), "info", term46462);
        setField(term46463, term46463.getClass(), "markers", null);
        setField(term46463, term46463.getClass(), "parameters", null);
        setField(term46463, term46463.getClass(), "throwsDescriptions", null);
        setField(term46463, term46463.getClass(), "blockDescription", null);
        setField(term46463, term46463.getClass(), "fileOverview", null);
        setField(term46463, term46463.getClass(), "returnDescription", null);
        setField(term46463, term46463.getClass(), "version", null);
        setField(term46463, term46463.getClass(), "authors", null);
        setField(term46463, term46463.getClass(), "sees", null);
        setField(term46461, term46461.getClass(), "documentation", term46463);
        setField(term46461, term46461.getClass(), "sourceName", "");
        setField(term46461, term46461.getClass(), "visibility", enum259);
        setIntField(term46461, term46461.getClass(), "bitset", -2134711835);
        setField(term46468, term46468.getClass(), "root", null);
        setField(term46468, term46468.getClass(), "sourceName", null);
        setField(term46468, term46468.getClass(), "registry", null);
        setField(term46461, term46461.getClass(), "type", term46468);
        setField(term46461, term46461.getClass(), "thisType", term46468);
        setBooleanField(term46461, term46461.getClass(), "includeDocumentation", true);
        setField(term46447, term46447.getClass(), "docInfo", term46461);
        setBooleanField(term46447, term46447.getClass(), "unknown", true);
        setBooleanField(term46447, term46447.getClass(), "resolved", false);
        setField(term46447, term46447.getClass(), "resolveResult", null);
        setField(term46447, term46447.getClass(), "registry", null);
        setField(term46391, term46391.getClass(), "templateType", term46447);
        setField(term46344, term46344.getClass(), "typeRegistry", term46391);
        setField(term46473, term46473.getClass(), "info", null);
        setField(term46473, term46473.getClass(), "documentation", null);
        setField(term46473, term46473.getClass(), "sourceName", null);
        setField(term46473, term46473.getClass(), "visibility", null);
        setIntField(term46473, term46473.getClass(), "bitset", 0);
        setField(term46473, term46473.getClass(), "type", null);
        setField(term46473, term46473.getClass(), "thisType", null);
        setBooleanField(term46473, term46473.getClass(), "includeDocumentation", false);
        setField(term46472, term46472.getClass(), "currentInfo", term46473);
        setBooleanField(term46472, term46472.getClass(), "populated", false);
        setBooleanField(term46472, term46472.getClass(), "parseDocumentation", false);
        setField(term46478, term46478.getClass(), "annotation", null);
        setField(term46478, term46478.getClass(), "name", null);
        setField(term46478, term46478.getClass(), "description", null);
        setField(term46478, term46478.getClass(), "type", null);
        setField(term46472, term46472.getClass(), "currentMarker", term46478);
        setField(term46344, term46344.getClass(), "jsdocBuilder", term46472);
        setField(term46344, term46344.getClass(), "sourceName", "FTuOcSieav");
        setField(term46344, term46344.getClass(), "errorReporter", null);
        setField(term46491, term46491.getClass(), "this$0", null);
        setField(term46344, term46344.getClass(), "parser", term46491);
        setField(term46492, term46492.getClass(), "info", null);
        setField(term46492, term46492.getClass(), "documentation", null);
        setField(term46492, term46492.getClass(), "sourceName", null);
        setField(term46492, term46492.getClass(), "visibility", null);
        setIntField(term46492, term46492.getClass(), "bitset", 0);
        setField(term46492, term46492.getClass(), "type", null);
        setField(term46492, term46492.getClass(), "thisType", null);
        setBooleanField(term46492, term46492.getClass(), "includeDocumentation", false);
        setField(term46344, term46344.getClass(), "fileOverviewJSDocInfo", term46492);
        setField(term46344, term46344.getClass(), "state", enum260);
        setField(term46344, term46344.getClass(), "annotationNames", term46516);
        setField(term46527, term46527.getClass(), "this$0", null);
        setField(term46344, term46344.getClass(), "fileLevelJsDocBuilder", term46527);
        setField(term46344, term46344.getClass(), "unreadToken", null);
        Class<? extends Object> term338038 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term338037 = ((Class) term338038).getDeclaredField((String) "LP");
        ((Field) term338037).setAccessible(true);
        enum261 = ((Field) term338037).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum261;
        try {
            callMethod(klass, "match", argTypes, term46344, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


