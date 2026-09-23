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

public class JsDocInfoParser_parseTypeNameAnnotation_127072410376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21681;
     Object enum198;

    public JsDocInfoParser_parseTypeNameAnnotation_127072410376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21725 = new HashMap();
        HashMap term21734 = new HashMap();
        Set<Object> term309713 =  ((Map) term21734).keySet();
        HashSet term21733 = new HashSet((Collection<? extends Object>) term309713);
        HashMap term21741 = new HashMap();
        Set<Object> term309714 =  ((Map) term21741).keySet();
        HashSet term21740 = new HashSet((Collection<? extends Object>) term309714);
        HashMap term21748 = new HashMap();
        Set<Object> term309715 =  ((Map) term21748).keySet();
        HashSet term21747 = new HashSet((Collection<? extends Object>) term309715);
        HashMap term21754 = new HashMap();
        HashMap term21759 = new HashMap();
        Class<? extends Object> term309737 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term309736 = ((Class) term309737).getDeclaredField((String) "PROTECTED");
        ((Field) term309736).setAccessible(true);
        Object enum196 = ((Field) term309736).get((Object) null);
        Class<? extends Object> term310021 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term310020 = ((Class) term310021).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term310020).setAccessible(true);
        Object enum197 = ((Field) term310020).get((Object) null);
        HashMap term21850 = new HashMap();
        term21681 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term21682 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term21695 = (char[]) newCharArray(0);
        int[] term21697 = (int[]) newIntArray(0);
        Object term21723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term21724 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term21780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term21794 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term21795 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term21796 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term21801 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term21802 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term21806 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term21807 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term21812 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term21825 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term21826 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term21861 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term21682, term21682.getClass(), "string", "SvGTualQPa");
        setField(term21682, term21682.getClass(), "stringBuffer", term21695);
        setIntField(term21682, term21682.getClass(), "stringBufferTop", 1501165033);
        setField(term21682, term21682.getClass(), "ungetBuffer", term21697);
        setIntField(term21682, term21682.getClass(), "ungetCursor", 510162332);
        setBooleanField(term21682, term21682.getClass(), "hitEOF", true);
        setIntField(term21682, term21682.getClass(), "lineStart", 888506903);
        setIntField(term21682, term21682.getClass(), "lineEndChar", 200252898);
        setIntField(term21682, term21682.getClass(), "lineno", -1831826725);
        setIntField(term21682, term21682.getClass(), "charno", 752152965);
        setIntField(term21682, term21682.getClass(), "initCharno", -1577069773);
        setIntField(term21682, term21682.getClass(), "initLineno", -266625190);
        setField(term21682, term21682.getClass(), "sourceString", "mdxcgZwsaP");
        setIntField(term21682, term21682.getClass(), "sourceEnd", 489201218);
        setIntField(term21682, term21682.getClass(), "sourceCursor", 464181937);
        setIntField(term21682, term21682.getClass(), "cursor", -1455526612);
        setIntField(term21682, term21682.getClass(), "tokenBeg", -941356098);
        setIntField(term21682, term21682.getClass(), "tokenEnd", -201517446);
        setField(term21681, term21681.getClass(), "stream", term21682);
        setField(term21723, term21723.getClass(), "reporter", null);
        setField(term21723, term21723.getClass(), "nativeTypes", term21724);
        setField(term21723, term21723.getClass(), "namesToTypes", term21725);
        setField(term21723, term21723.getClass(), "namespaces", term21733);
        setField(term21723, term21723.getClass(), "enumTypeNames", term21740);
        setField(term21723, term21723.getClass(), "forwardDeclaredTypes", term21747);
        setField(term21723, term21723.getClass(), "typesIndexedByProperty", term21754);
        setField(term21723, term21723.getClass(), "greatestSubtypeByProperty", term21759);
        setField(term21723, term21723.getClass(), "interfaceToImplementors", null);
        setField(term21723, term21723.getClass(), "unresolvedNamedTypes", null);
        setField(term21723, term21723.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term21723, term21723.getClass(), "lastGeneration", false);
        setField(term21723, term21723.getClass(), "templateTypeName", "rOfPCPHmtJ");
        setField(term21780, term21780.getClass(), "name", "EnmiAvfpJv");
        setField(term21780, term21780.getClass(), "referencedType", null);
        setBooleanField(term21780, term21780.getClass(), "visited", true);
        setField(term21795, term21795.getClass(), "baseType", null);
        setField(term21795, term21795.getClass(), "implementedInterfaces", null);
        setField(term21795, term21795.getClass(), "parameters", null);
        setField(term21795, term21795.getClass(), "thrownTypes", null);
        setField(term21795, term21795.getClass(), "templateTypeName", null);
        setField(term21795, term21795.getClass(), "description", null);
        setField(term21795, term21795.getClass(), "deprecated", null);
        setField(term21795, term21795.getClass(), "license", null);
        setField(term21795, term21795.getClass(), "suppressions", null);
        setField(term21794, term21794.getClass(), "info", term21795);
        setField(term21796, term21796.getClass(), "markers", null);
        setField(term21796, term21796.getClass(), "parameters", null);
        setField(term21796, term21796.getClass(), "throwsDescriptions", null);
        setField(term21796, term21796.getClass(), "blockDescription", null);
        setField(term21796, term21796.getClass(), "fileOverview", null);
        setField(term21796, term21796.getClass(), "returnDescription", null);
        setField(term21796, term21796.getClass(), "version", null);
        setField(term21796, term21796.getClass(), "authors", null);
        setField(term21796, term21796.getClass(), "sees", null);
        setField(term21794, term21794.getClass(), "documentation", term21796);
        setField(term21794, term21794.getClass(), "sourceName", "");
        setField(term21794, term21794.getClass(), "visibility", enum196);
        setIntField(term21794, term21794.getClass(), "bitset", -97742366);
        setField(term21801, term21801.getClass(), "root", null);
        setField(term21801, term21801.getClass(), "sourceName", null);
        setField(term21801, term21801.getClass(), "registry", null);
        setField(term21794, term21794.getClass(), "type", term21801);
        setField(term21802, term21802.getClass(), "root", null);
        setField(term21802, term21802.getClass(), "sourceName", null);
        setField(term21802, term21802.getClass(), "registry", null);
        setField(term21794, term21794.getClass(), "thisType", term21802);
        setBooleanField(term21794, term21794.getClass(), "includeDocumentation", true);
        setField(term21780, term21780.getClass(), "docInfo", term21794);
        setBooleanField(term21780, term21780.getClass(), "unknown", false);
        setBooleanField(term21780, term21780.getClass(), "resolved", false);
        setField(term21780, term21780.getClass(), "resolveResult", null);
        setField(term21780, term21780.getClass(), "registry", null);
        setField(term21723, term21723.getClass(), "templateType", term21780);
        setField(term21681, term21681.getClass(), "typeRegistry", term21723);
        setField(term21807, term21807.getClass(), "info", null);
        setField(term21807, term21807.getClass(), "documentation", null);
        setField(term21807, term21807.getClass(), "sourceName", null);
        setField(term21807, term21807.getClass(), "visibility", null);
        setIntField(term21807, term21807.getClass(), "bitset", 0);
        setField(term21807, term21807.getClass(), "type", null);
        setField(term21807, term21807.getClass(), "thisType", null);
        setBooleanField(term21807, term21807.getClass(), "includeDocumentation", false);
        setField(term21806, term21806.getClass(), "currentInfo", term21807);
        setBooleanField(term21806, term21806.getClass(), "populated", true);
        setBooleanField(term21806, term21806.getClass(), "parseDocumentation", false);
        setField(term21812, term21812.getClass(), "annotation", null);
        setField(term21812, term21812.getClass(), "name", null);
        setField(term21812, term21812.getClass(), "description", null);
        setField(term21812, term21812.getClass(), "type", null);
        setField(term21806, term21806.getClass(), "currentMarker", term21812);
        setField(term21681, term21681.getClass(), "jsdocBuilder", term21806);
        setField(term21681, term21681.getClass(), "sourceName", "JptuwlirlS");
        setField(term21681, term21681.getClass(), "errorReporter", null);
        setField(term21825, term21825.getClass(), "this$0", null);
        setField(term21681, term21681.getClass(), "parser", term21825);
        setField(term21826, term21826.getClass(), "info", null);
        setField(term21826, term21826.getClass(), "documentation", null);
        setField(term21826, term21826.getClass(), "sourceName", null);
        setField(term21826, term21826.getClass(), "visibility", null);
        setIntField(term21826, term21826.getClass(), "bitset", 0);
        setField(term21826, term21826.getClass(), "type", null);
        setField(term21826, term21826.getClass(), "thisType", null);
        setBooleanField(term21826, term21826.getClass(), "includeDocumentation", false);
        setField(term21681, term21681.getClass(), "fileOverviewJSDocInfo", term21826);
        setField(term21681, term21681.getClass(), "state", enum197);
        setField(term21681, term21681.getClass(), "annotationNames", term21850);
        setField(term21861, term21861.getClass(), "this$0", null);
        setField(term21681, term21681.getClass(), "fileLevelJsDocBuilder", term21861);
        setField(term21681, term21681.getClass(), "unreadToken", null);
        Class<? extends Object> term310369 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term310368 = ((Class) term310369).getDeclaredField((String) "BANG");
        ((Field) term310368).setAccessible(true);
        enum198 = ((Field) term310368).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum198;
        try {
            callMethod(klass, "parseTypeNameAnnotation", argTypes, term21681, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


