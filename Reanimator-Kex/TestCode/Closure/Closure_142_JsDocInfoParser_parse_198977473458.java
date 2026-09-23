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

public class JsDocInfoParser_parse_198977473458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2734;

    public JsDocInfoParser_parse_198977473458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2786 = new HashMap();
        HashMap term2795 = new HashMap();
        Set<Object> term288332 =  ((Map) term2795).keySet();
        HashSet term2794 = new HashSet((Collection<? extends Object>) term288332);
        HashMap term2801 = new HashMap();
        Set<Object> term288333 =  ((Map) term2801).keySet();
        HashSet term2800 = new HashSet((Collection<? extends Object>) term288333);
        HashMap term2808 = new HashMap();
        Set<Object> term288334 =  ((Map) term2808).keySet();
        HashSet term2807 = new HashSet((Collection<? extends Object>) term288334);
        HashMap term2814 = new HashMap();
        HashMap term2819 = new HashMap();
        Class<? extends Object> term288356 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term288355 = ((Class) term288356).getDeclaredField((String) "PRIVATE");
        ((Field) term288355).setAccessible(true);
        Object enum146 = ((Field) term288355).get((Object) null);
        Class<? extends Object> term288634 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term288633 = ((Class) term288634).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term288633).setAccessible(true);
        Object enum147 = ((Field) term288633).get((Object) null);
        HashMap term2910 = new HashMap();
        term2734 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term2735 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term2748 = (char[]) newCharArray(0);
        int[] term2750 = (int[]) newIntArray(8);
        Object term2784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2785 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term2840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2854 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2855 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2856 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2861 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2862 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2866 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term2867 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2872 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term2885 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term2886 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2921 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term2735, term2735.getClass(), "string", "EYtfuJaxiM");
        setField(term2735, term2735.getClass(), "stringBuffer", term2748);
        setIntField(term2735, term2735.getClass(), "stringBufferTop", -1588772968);
        setIntElement(term2750, 0, -93135961);
        setIntElement(term2750, 1, -112921587);
        setIntElement(term2750, 2, 933028652);
        setIntElement(term2750, 3, 287287233);
        setIntElement(term2750, 4, 962840079);
        setIntElement(term2750, 5, 1540719661);
        setIntElement(term2750, 6, 1265463001);
        setIntElement(term2750, 7, 335112684);
        setField(term2735, term2735.getClass(), "ungetBuffer", term2750);
        setIntField(term2735, term2735.getClass(), "ungetCursor", 1551099402);
        setBooleanField(term2735, term2735.getClass(), "hitEOF", false);
        setIntField(term2735, term2735.getClass(), "lineStart", -2027534003);
        setIntField(term2735, term2735.getClass(), "lineEndChar", 1063420942);
        setIntField(term2735, term2735.getClass(), "lineno", 1375330971);
        setIntField(term2735, term2735.getClass(), "charno", -478195677);
        setIntField(term2735, term2735.getClass(), "initCharno", 972867650);
        setIntField(term2735, term2735.getClass(), "initLineno", 1655935355);
        setField(term2735, term2735.getClass(), "sourceString", "gCWtLVKVVe");
        setIntField(term2735, term2735.getClass(), "sourceEnd", -481533957);
        setIntField(term2735, term2735.getClass(), "sourceCursor", 1240914516);
        setIntField(term2735, term2735.getClass(), "cursor", -1465035361);
        setIntField(term2735, term2735.getClass(), "tokenBeg", 1090617576);
        setIntField(term2735, term2735.getClass(), "tokenEnd", -1547384488);
        setField(term2734, term2734.getClass(), "stream", term2735);
        setField(term2784, term2784.getClass(), "reporter", null);
        setField(term2784, term2784.getClass(), "nativeTypes", term2785);
        setField(term2784, term2784.getClass(), "namesToTypes", term2786);
        setField(term2784, term2784.getClass(), "namespaces", term2794);
        setField(term2784, term2784.getClass(), "enumTypeNames", term2800);
        setField(term2784, term2784.getClass(), "forwardDeclaredTypes", term2807);
        setField(term2784, term2784.getClass(), "typesIndexedByProperty", term2814);
        setField(term2784, term2784.getClass(), "greatestSubtypeByProperty", term2819);
        setField(term2784, term2784.getClass(), "interfaceToImplementors", null);
        setField(term2784, term2784.getClass(), "unresolvedNamedTypes", null);
        setField(term2784, term2784.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2784, term2784.getClass(), "lastGeneration", false);
        setField(term2784, term2784.getClass(), "templateTypeName", "pXOkjyeIRb");
        setField(term2840, term2840.getClass(), "name", "GgZWSjxjyE");
        setField(term2840, term2840.getClass(), "referencedType", null);
        setBooleanField(term2840, term2840.getClass(), "visited", false);
        setField(term2855, term2855.getClass(), "baseType", null);
        setField(term2855, term2855.getClass(), "implementedInterfaces", null);
        setField(term2855, term2855.getClass(), "parameters", null);
        setField(term2855, term2855.getClass(), "thrownTypes", null);
        setField(term2855, term2855.getClass(), "templateTypeName", null);
        setField(term2855, term2855.getClass(), "description", null);
        setField(term2855, term2855.getClass(), "deprecated", null);
        setField(term2855, term2855.getClass(), "license", null);
        setField(term2855, term2855.getClass(), "suppressions", null);
        setField(term2854, term2854.getClass(), "info", term2855);
        setField(term2856, term2856.getClass(), "markers", null);
        setField(term2856, term2856.getClass(), "parameters", null);
        setField(term2856, term2856.getClass(), "throwsDescriptions", null);
        setField(term2856, term2856.getClass(), "blockDescription", null);
        setField(term2856, term2856.getClass(), "fileOverview", null);
        setField(term2856, term2856.getClass(), "returnDescription", null);
        setField(term2856, term2856.getClass(), "version", null);
        setField(term2856, term2856.getClass(), "authors", null);
        setField(term2856, term2856.getClass(), "sees", null);
        setField(term2854, term2854.getClass(), "documentation", term2856);
        setField(term2854, term2854.getClass(), "sourceName", "");
        setField(term2854, term2854.getClass(), "visibility", enum146);
        setIntField(term2854, term2854.getClass(), "bitset", 1442160736);
        setField(term2861, term2861.getClass(), "root", null);
        setField(term2861, term2861.getClass(), "sourceName", null);
        setField(term2861, term2861.getClass(), "registry", null);
        setField(term2854, term2854.getClass(), "type", term2861);
        setField(term2862, term2862.getClass(), "root", null);
        setField(term2862, term2862.getClass(), "sourceName", null);
        setField(term2862, term2862.getClass(), "registry", null);
        setField(term2854, term2854.getClass(), "thisType", term2862);
        setBooleanField(term2854, term2854.getClass(), "includeDocumentation", true);
        setField(term2840, term2840.getClass(), "docInfo", term2854);
        setBooleanField(term2840, term2840.getClass(), "unknown", true);
        setBooleanField(term2840, term2840.getClass(), "resolved", true);
        setField(term2840, term2840.getClass(), "resolveResult", null);
        setField(term2840, term2840.getClass(), "registry", null);
        setField(term2784, term2784.getClass(), "templateType", term2840);
        setField(term2734, term2734.getClass(), "typeRegistry", term2784);
        setField(term2867, term2867.getClass(), "info", null);
        setField(term2867, term2867.getClass(), "documentation", null);
        setField(term2867, term2867.getClass(), "sourceName", null);
        setField(term2867, term2867.getClass(), "visibility", null);
        setIntField(term2867, term2867.getClass(), "bitset", 0);
        setField(term2867, term2867.getClass(), "type", null);
        setField(term2867, term2867.getClass(), "thisType", null);
        setBooleanField(term2867, term2867.getClass(), "includeDocumentation", false);
        setField(term2866, term2866.getClass(), "currentInfo", term2867);
        setBooleanField(term2866, term2866.getClass(), "populated", true);
        setBooleanField(term2866, term2866.getClass(), "parseDocumentation", true);
        setField(term2872, term2872.getClass(), "annotation", null);
        setField(term2872, term2872.getClass(), "name", null);
        setField(term2872, term2872.getClass(), "description", null);
        setField(term2872, term2872.getClass(), "type", null);
        setField(term2866, term2866.getClass(), "currentMarker", term2872);
        setField(term2734, term2734.getClass(), "jsdocBuilder", term2866);
        setField(term2734, term2734.getClass(), "sourceName", "XkIoWJRNwN");
        setField(term2734, term2734.getClass(), "errorReporter", null);
        setField(term2885, term2885.getClass(), "this$0", null);
        setField(term2734, term2734.getClass(), "parser", term2885);
        setField(term2886, term2886.getClass(), "info", null);
        setField(term2886, term2886.getClass(), "documentation", null);
        setField(term2886, term2886.getClass(), "sourceName", null);
        setField(term2886, term2886.getClass(), "visibility", null);
        setIntField(term2886, term2886.getClass(), "bitset", 0);
        setField(term2886, term2886.getClass(), "type", null);
        setField(term2886, term2886.getClass(), "thisType", null);
        setBooleanField(term2886, term2886.getClass(), "includeDocumentation", false);
        setField(term2734, term2734.getClass(), "fileOverviewJSDocInfo", term2886);
        setField(term2734, term2734.getClass(), "state", enum147);
        setField(term2734, term2734.getClass(), "annotationNames", term2910);
        setField(term2921, term2921.getClass(), "this$0", null);
        setField(term2734, term2734.getClass(), "fileLevelJsDocBuilder", term2921);
        setField(term2734, term2734.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term2734, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


