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

public class JsDocInfoParser_parseResultType_83191788484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30798;
     Object enum222;

    public JsDocInfoParser_parseResultType_83191788484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term30844 = new HashMap();
        HashMap term30853 = new HashMap();
        Set<Object> term320772 =  ((Map) term30853).keySet();
        HashSet term30852 = new HashSet((Collection<? extends Object>) term320772);
        HashMap term30860 = new HashMap();
        Set<Object> term320775 =  ((Map) term30860).keySet();
        HashSet term30859 = new HashSet((Collection<? extends Object>) term320775);
        HashMap term30867 = new HashMap();
        Set<Object> term320776 =  ((Map) term30867).keySet();
        HashSet term30866 = new HashSet((Collection<? extends Object>) term320776);
        HashMap term30873 = new HashMap();
        HashMap term30878 = new HashMap();
        Class<? extends Object> term320801 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term320800 = ((Class) term320801).getDeclaredField((String) "INHERITED");
        ((Field) term320800).setAccessible(true);
        Object enum220 = ((Field) term320800).get((Object) null);
        Class<? extends Object> term321085 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term321084 = ((Class) term321085).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term321084).setAccessible(true);
        Object enum221 = ((Field) term321084).get((Object) null);
        HashMap term30971 = new HashMap();
        term30798 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term30799 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term30812 = (char[]) newCharArray(2);
        int[] term30816 = (int[]) newIntArray(0);
        Object term30842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term30843 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term30899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term30913 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term30914 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term30915 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term30920 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term30924 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term30925 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term30930 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term30943 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term30944 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term30982 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term30799, term30799.getClass(), "string", "MCMCjxXzjw");
        setCharElement(term30812, 0, 'w');
        setCharElement(term30812, 1, 'X');
        setField(term30799, term30799.getClass(), "stringBuffer", term30812);
        setIntField(term30799, term30799.getClass(), "stringBufferTop", -1415256843);
        setField(term30799, term30799.getClass(), "ungetBuffer", term30816);
        setIntField(term30799, term30799.getClass(), "ungetCursor", 612177768);
        setBooleanField(term30799, term30799.getClass(), "hitEOF", false);
        setIntField(term30799, term30799.getClass(), "lineStart", -1626451656);
        setIntField(term30799, term30799.getClass(), "lineEndChar", 173952451);
        setIntField(term30799, term30799.getClass(), "lineno", -1972033388);
        setIntField(term30799, term30799.getClass(), "charno", -1005024758);
        setIntField(term30799, term30799.getClass(), "initCharno", 2634669);
        setIntField(term30799, term30799.getClass(), "initLineno", -1912429941);
        setField(term30799, term30799.getClass(), "sourceString", "pZbbwCURge");
        setIntField(term30799, term30799.getClass(), "sourceEnd", 1801052257);
        setIntField(term30799, term30799.getClass(), "sourceCursor", -2110556060);
        setIntField(term30799, term30799.getClass(), "cursor", 313459791);
        setIntField(term30799, term30799.getClass(), "tokenBeg", 752615112);
        setIntField(term30799, term30799.getClass(), "tokenEnd", -1674430871);
        setField(term30798, term30798.getClass(), "stream", term30799);
        setField(term30842, term30842.getClass(), "reporter", null);
        setField(term30842, term30842.getClass(), "nativeTypes", term30843);
        setField(term30842, term30842.getClass(), "namesToTypes", term30844);
        setField(term30842, term30842.getClass(), "namespaces", term30852);
        setField(term30842, term30842.getClass(), "enumTypeNames", term30859);
        setField(term30842, term30842.getClass(), "forwardDeclaredTypes", term30866);
        setField(term30842, term30842.getClass(), "typesIndexedByProperty", term30873);
        setField(term30842, term30842.getClass(), "greatestSubtypeByProperty", term30878);
        setField(term30842, term30842.getClass(), "interfaceToImplementors", null);
        setField(term30842, term30842.getClass(), "unresolvedNamedTypes", null);
        setField(term30842, term30842.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term30842, term30842.getClass(), "lastGeneration", true);
        setField(term30842, term30842.getClass(), "templateTypeName", "IjprPXBDuY");
        setField(term30899, term30899.getClass(), "name", "wkqPmmFDAa");
        setField(term30899, term30899.getClass(), "referencedType", null);
        setBooleanField(term30899, term30899.getClass(), "visited", true);
        setField(term30914, term30914.getClass(), "baseType", null);
        setField(term30914, term30914.getClass(), "implementedInterfaces", null);
        setField(term30914, term30914.getClass(), "parameters", null);
        setField(term30914, term30914.getClass(), "thrownTypes", null);
        setField(term30914, term30914.getClass(), "templateTypeName", null);
        setField(term30914, term30914.getClass(), "description", null);
        setField(term30914, term30914.getClass(), "deprecated", null);
        setField(term30914, term30914.getClass(), "license", null);
        setField(term30914, term30914.getClass(), "suppressions", null);
        setField(term30913, term30913.getClass(), "info", term30914);
        setField(term30915, term30915.getClass(), "markers", null);
        setField(term30915, term30915.getClass(), "parameters", null);
        setField(term30915, term30915.getClass(), "throwsDescriptions", null);
        setField(term30915, term30915.getClass(), "blockDescription", null);
        setField(term30915, term30915.getClass(), "fileOverview", null);
        setField(term30915, term30915.getClass(), "returnDescription", null);
        setField(term30915, term30915.getClass(), "version", null);
        setField(term30915, term30915.getClass(), "authors", null);
        setField(term30915, term30915.getClass(), "sees", null);
        setField(term30913, term30913.getClass(), "documentation", term30915);
        setField(term30913, term30913.getClass(), "sourceName", "");
        setField(term30913, term30913.getClass(), "visibility", enum220);
        setIntField(term30913, term30913.getClass(), "bitset", 794352120);
        setField(term30920, term30920.getClass(), "root", null);
        setField(term30920, term30920.getClass(), "sourceName", null);
        setField(term30920, term30920.getClass(), "registry", null);
        setField(term30913, term30913.getClass(), "type", term30920);
        setField(term30913, term30913.getClass(), "thisType", term30920);
        setBooleanField(term30913, term30913.getClass(), "includeDocumentation", true);
        setField(term30899, term30899.getClass(), "docInfo", term30913);
        setBooleanField(term30899, term30899.getClass(), "unknown", false);
        setBooleanField(term30899, term30899.getClass(), "resolved", true);
        setField(term30899, term30899.getClass(), "resolveResult", null);
        setField(term30899, term30899.getClass(), "registry", null);
        setField(term30842, term30842.getClass(), "templateType", term30899);
        setField(term30798, term30798.getClass(), "typeRegistry", term30842);
        setField(term30925, term30925.getClass(), "info", null);
        setField(term30925, term30925.getClass(), "documentation", null);
        setField(term30925, term30925.getClass(), "sourceName", null);
        setField(term30925, term30925.getClass(), "visibility", null);
        setIntField(term30925, term30925.getClass(), "bitset", 0);
        setField(term30925, term30925.getClass(), "type", null);
        setField(term30925, term30925.getClass(), "thisType", null);
        setBooleanField(term30925, term30925.getClass(), "includeDocumentation", false);
        setField(term30924, term30924.getClass(), "currentInfo", term30925);
        setBooleanField(term30924, term30924.getClass(), "populated", true);
        setBooleanField(term30924, term30924.getClass(), "parseDocumentation", true);
        setField(term30930, term30930.getClass(), "annotation", null);
        setField(term30930, term30930.getClass(), "name", null);
        setField(term30930, term30930.getClass(), "description", null);
        setField(term30930, term30930.getClass(), "type", null);
        setField(term30924, term30924.getClass(), "currentMarker", term30930);
        setField(term30798, term30798.getClass(), "jsdocBuilder", term30924);
        setField(term30798, term30798.getClass(), "sourceName", "MxrhCLTMTH");
        setField(term30798, term30798.getClass(), "errorReporter", null);
        setField(term30943, term30943.getClass(), "this$0", null);
        setField(term30798, term30798.getClass(), "parser", term30943);
        setField(term30944, term30944.getClass(), "info", null);
        setField(term30944, term30944.getClass(), "documentation", null);
        setField(term30944, term30944.getClass(), "sourceName", null);
        setField(term30944, term30944.getClass(), "visibility", null);
        setIntField(term30944, term30944.getClass(), "bitset", 0);
        setField(term30944, term30944.getClass(), "type", null);
        setField(term30944, term30944.getClass(), "thisType", null);
        setBooleanField(term30944, term30944.getClass(), "includeDocumentation", false);
        setField(term30798, term30798.getClass(), "fileOverviewJSDocInfo", term30944);
        setField(term30798, term30798.getClass(), "state", enum221);
        setField(term30798, term30798.getClass(), "annotationNames", term30971);
        setField(term30982, term30982.getClass(), "this$0", null);
        setField(term30798, term30798.getClass(), "fileLevelJsDocBuilder", term30982);
        setField(term30798, term30798.getClass(), "unreadToken", null);
        Class<? extends Object> term321442 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term321441 = ((Class) term321442).getDeclaredField((String) "COMMA");
        ((Field) term321441).setAccessible(true);
        enum222 = ((Field) term321441).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum222;
        try {
            callMethod(klass, "parseResultType", argTypes, term30798, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


