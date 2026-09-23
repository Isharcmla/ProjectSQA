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

public class JsDocInfoParser_extractMultilineTextualBlock_177116617070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15557;
     Object enum182;

    public JsDocInfoParser_extractMultilineTextualBlock_177116617070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15607 = new HashMap();
        HashMap term15616 = new HashMap();
        Set<Object> term302940 =  ((Map) term15616).keySet();
        HashSet term15615 = new HashSet((Collection<? extends Object>) term302940);
        HashMap term15623 = new HashMap();
        Set<Object> term302941 =  ((Map) term15623).keySet();
        HashSet term15622 = new HashSet((Collection<? extends Object>) term302941);
        HashMap term15630 = new HashMap();
        Set<Object> term302942 =  ((Map) term15630).keySet();
        HashSet term15629 = new HashSet((Collection<? extends Object>) term302942);
        HashMap term15636 = new HashMap();
        HashMap term15641 = new HashMap();
        Class<? extends Object> term302964 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term302963 = ((Class) term302964).getDeclaredField((String) "INHERITED");
        ((Field) term302963).setAccessible(true);
        Object enum180 = ((Field) term302963).get((Object) null);
        Class<? extends Object> term303248 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term303247 = ((Class) term303248).getDeclaredField((String) "NEXT_IS_ANNOTATION");
        ((Field) term303247).setAccessible(true);
        Object enum181 = ((Field) term303247).get((Object) null);
        HashMap term15733 = new HashMap();
        term15557 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term15558 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term15571 = (char[]) newCharArray(3);
        int[] term15576 = (int[]) newIntArray(3);
        Object term15605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term15606 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        Object term15662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term15676 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15677 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term15678 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term15683 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15684 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15688 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term15689 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15694 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term15707 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term15708 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15744 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term15558, term15558.getClass(), "string", "bEmHScVZaQ");
        setCharElement(term15571, 0, 'Y');
        setCharElement(term15571, 1, 'S');
        setCharElement(term15571, 2, 'R');
        setField(term15558, term15558.getClass(), "stringBuffer", term15571);
        setIntField(term15558, term15558.getClass(), "stringBufferTop", 1295839803);
        setIntElement(term15576, 0, -1891015523);
        setIntElement(term15576, 1, -1560631747);
        setIntElement(term15576, 2, 1215150180);
        setField(term15558, term15558.getClass(), "ungetBuffer", term15576);
        setIntField(term15558, term15558.getClass(), "ungetCursor", -1422859977);
        setBooleanField(term15558, term15558.getClass(), "hitEOF", false);
        setIntField(term15558, term15558.getClass(), "lineStart", -1972436591);
        setIntField(term15558, term15558.getClass(), "lineEndChar", 68922753);
        setIntField(term15558, term15558.getClass(), "lineno", -220791533);
        setIntField(term15558, term15558.getClass(), "charno", 1741500243);
        setIntField(term15558, term15558.getClass(), "initCharno", -2070466617);
        setIntField(term15558, term15558.getClass(), "initLineno", -1127721881);
        setField(term15558, term15558.getClass(), "sourceString", "TcuXODkzBV");
        setIntField(term15558, term15558.getClass(), "sourceEnd", 1074848808);
        setIntField(term15558, term15558.getClass(), "sourceCursor", -146054762);
        setIntField(term15558, term15558.getClass(), "cursor", 798043553);
        setIntField(term15558, term15558.getClass(), "tokenBeg", 533197381);
        setIntField(term15558, term15558.getClass(), "tokenEnd", 1048271679);
        setField(term15557, term15557.getClass(), "stream", term15558);
        setField(term15605, term15605.getClass(), "reporter", null);
        setField(term15605, term15605.getClass(), "nativeTypes", term15606);
        setField(term15605, term15605.getClass(), "namesToTypes", term15607);
        setField(term15605, term15605.getClass(), "namespaces", term15615);
        setField(term15605, term15605.getClass(), "enumTypeNames", term15622);
        setField(term15605, term15605.getClass(), "forwardDeclaredTypes", term15629);
        setField(term15605, term15605.getClass(), "typesIndexedByProperty", term15636);
        setField(term15605, term15605.getClass(), "greatestSubtypeByProperty", term15641);
        setField(term15605, term15605.getClass(), "interfaceToImplementors", null);
        setField(term15605, term15605.getClass(), "unresolvedNamedTypes", null);
        setField(term15605, term15605.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15605, term15605.getClass(), "lastGeneration", true);
        setField(term15605, term15605.getClass(), "templateTypeName", "lbmSGBwIiV");
        setField(term15662, term15662.getClass(), "name", "DAxyHoTLzZ");
        setField(term15662, term15662.getClass(), "referencedType", null);
        setBooleanField(term15662, term15662.getClass(), "visited", false);
        setField(term15677, term15677.getClass(), "baseType", null);
        setField(term15677, term15677.getClass(), "implementedInterfaces", null);
        setField(term15677, term15677.getClass(), "parameters", null);
        setField(term15677, term15677.getClass(), "thrownTypes", null);
        setField(term15677, term15677.getClass(), "templateTypeName", null);
        setField(term15677, term15677.getClass(), "description", null);
        setField(term15677, term15677.getClass(), "deprecated", null);
        setField(term15677, term15677.getClass(), "license", null);
        setField(term15677, term15677.getClass(), "suppressions", null);
        setField(term15676, term15676.getClass(), "info", term15677);
        setField(term15678, term15678.getClass(), "markers", null);
        setField(term15678, term15678.getClass(), "parameters", null);
        setField(term15678, term15678.getClass(), "throwsDescriptions", null);
        setField(term15678, term15678.getClass(), "blockDescription", null);
        setField(term15678, term15678.getClass(), "fileOverview", null);
        setField(term15678, term15678.getClass(), "returnDescription", null);
        setField(term15678, term15678.getClass(), "version", null);
        setField(term15678, term15678.getClass(), "authors", null);
        setField(term15678, term15678.getClass(), "sees", null);
        setField(term15676, term15676.getClass(), "documentation", term15678);
        setField(term15676, term15676.getClass(), "sourceName", "");
        setField(term15676, term15676.getClass(), "visibility", enum180);
        setIntField(term15676, term15676.getClass(), "bitset", -1529797673);
        setField(term15683, term15683.getClass(), "root", null);
        setField(term15683, term15683.getClass(), "sourceName", null);
        setField(term15683, term15683.getClass(), "registry", null);
        setField(term15676, term15676.getClass(), "type", term15683);
        setField(term15684, term15684.getClass(), "root", null);
        setField(term15684, term15684.getClass(), "sourceName", null);
        setField(term15684, term15684.getClass(), "registry", null);
        setField(term15676, term15676.getClass(), "thisType", term15684);
        setBooleanField(term15676, term15676.getClass(), "includeDocumentation", false);
        setField(term15662, term15662.getClass(), "docInfo", term15676);
        setBooleanField(term15662, term15662.getClass(), "unknown", true);
        setBooleanField(term15662, term15662.getClass(), "resolved", true);
        setField(term15662, term15662.getClass(), "resolveResult", null);
        setField(term15662, term15662.getClass(), "registry", null);
        setField(term15605, term15605.getClass(), "templateType", term15662);
        setField(term15557, term15557.getClass(), "typeRegistry", term15605);
        setField(term15689, term15689.getClass(), "info", null);
        setField(term15689, term15689.getClass(), "documentation", null);
        setField(term15689, term15689.getClass(), "sourceName", null);
        setField(term15689, term15689.getClass(), "visibility", null);
        setIntField(term15689, term15689.getClass(), "bitset", 0);
        setField(term15689, term15689.getClass(), "type", null);
        setField(term15689, term15689.getClass(), "thisType", null);
        setBooleanField(term15689, term15689.getClass(), "includeDocumentation", false);
        setField(term15688, term15688.getClass(), "currentInfo", term15689);
        setBooleanField(term15688, term15688.getClass(), "populated", false);
        setBooleanField(term15688, term15688.getClass(), "parseDocumentation", false);
        setField(term15694, term15694.getClass(), "annotation", null);
        setField(term15694, term15694.getClass(), "name", null);
        setField(term15694, term15694.getClass(), "description", null);
        setField(term15694, term15694.getClass(), "type", null);
        setField(term15688, term15688.getClass(), "currentMarker", term15694);
        setField(term15557, term15557.getClass(), "jsdocBuilder", term15688);
        setField(term15557, term15557.getClass(), "sourceName", "mvfDtZNEHr");
        setField(term15557, term15557.getClass(), "errorReporter", null);
        setField(term15707, term15707.getClass(), "this$0", null);
        setField(term15557, term15557.getClass(), "parser", term15707);
        setField(term15708, term15708.getClass(), "info", null);
        setField(term15708, term15708.getClass(), "documentation", null);
        setField(term15708, term15708.getClass(), "sourceName", null);
        setField(term15708, term15708.getClass(), "visibility", null);
        setIntField(term15708, term15708.getClass(), "bitset", 0);
        setField(term15708, term15708.getClass(), "type", null);
        setField(term15708, term15708.getClass(), "thisType", null);
        setBooleanField(term15708, term15708.getClass(), "includeDocumentation", false);
        setField(term15557, term15557.getClass(), "fileOverviewJSDocInfo", term15708);
        setField(term15557, term15557.getClass(), "state", enum181);
        setField(term15557, term15557.getClass(), "annotationNames", term15733);
        setField(term15744, term15744.getClass(), "this$0", null);
        setField(term15557, term15557.getClass(), "fileLevelJsDocBuilder", term15744);
        setField(term15557, term15557.getClass(), "unreadToken", null);
        Class<? extends Object> term303599 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term303598 = ((Class) term303599).getDeclaredField((String) "RP");
        ((Field) term303598).setAccessible(true);
        enum182 = ((Field) term303598).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum182;
        try {
            callMethod(klass, "extractMultilineTextualBlock", argTypes, term15557, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


