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

public class JsDocInfoParser_parseTopLevelTypeExpression_204703391477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22790;
     Object enum201;

    public JsDocInfoParser_parseTopLevelTypeExpression_204703391477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22848 = new HashMap();
        HashMap term22857 = new HashMap();
        Set<Object> term311036 =  ((Map) term22857).keySet();
        HashSet term22856 = new HashSet((Collection<? extends Object>) term311036);
        HashMap term22864 = new HashMap();
        Set<Object> term311037 =  ((Map) term22864).keySet();
        HashSet term22863 = new HashSet((Collection<? extends Object>) term311037);
        HashMap term22871 = new HashMap();
        Set<Object> term311038 =  ((Map) term22871).keySet();
        HashSet term22870 = new HashSet((Collection<? extends Object>) term311038);
        HashMap term22877 = new HashMap();
        HashMap term22882 = new HashMap();
        Class<? extends Object> term311060 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term311059 = ((Class) term311060).getDeclaredField((String) "PROTECTED");
        ((Field) term311059).setAccessible(true);
        Object enum199 = ((Field) term311059).get((Object) null);
        Class<? extends Object> term311344 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term311343 = ((Class) term311344).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term311343).setAccessible(true);
        Object enum200 = ((Field) term311343).get((Object) null);
        HashMap term22973 = new HashMap();
        term22790 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term22791 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term22804 = (char[]) newCharArray(9);
        int[] term22815 = (int[]) newIntArray(5);
        Object term22846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term22847 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term22903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term22917 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term22918 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term22919 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term22924 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term22925 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term22929 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term22930 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term22935 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term22948 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term22949 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term22984 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term22791, term22791.getClass(), "string", "YcTbglHiUq");
        setCharElement(term22804, 0, 'g');
        setCharElement(term22804, 1, 'J');
        setCharElement(term22804, 2, 'l');
        setCharElement(term22804, 3, 'h');
        setCharElement(term22804, 4, 'k');
        setCharElement(term22804, 5, 'X');
        setCharElement(term22804, 6, 'u');
        setCharElement(term22804, 7, 'u');
        setCharElement(term22804, 8, 'a');
        setField(term22791, term22791.getClass(), "stringBuffer", term22804);
        setIntField(term22791, term22791.getClass(), "stringBufferTop", 1374790203);
        setIntElement(term22815, 0, 1160010161);
        setIntElement(term22815, 1, -423900705);
        setIntElement(term22815, 2, -525570815);
        setIntElement(term22815, 3, 754055848);
        setIntElement(term22815, 4, -19246901);
        setField(term22791, term22791.getClass(), "ungetBuffer", term22815);
        setIntField(term22791, term22791.getClass(), "ungetCursor", -370828664);
        setBooleanField(term22791, term22791.getClass(), "hitEOF", true);
        setIntField(term22791, term22791.getClass(), "lineStart", 1168633950);
        setIntField(term22791, term22791.getClass(), "lineEndChar", 1607082164);
        setIntField(term22791, term22791.getClass(), "lineno", 1890399366);
        setIntField(term22791, term22791.getClass(), "charno", -1867239125);
        setIntField(term22791, term22791.getClass(), "initCharno", 952869601);
        setIntField(term22791, term22791.getClass(), "initLineno", 91958879);
        setField(term22791, term22791.getClass(), "sourceString", "TiUqHrjoEU");
        setIntField(term22791, term22791.getClass(), "sourceEnd", -645429025);
        setIntField(term22791, term22791.getClass(), "sourceCursor", -688213483);
        setIntField(term22791, term22791.getClass(), "cursor", 644154104);
        setIntField(term22791, term22791.getClass(), "tokenBeg", 76650923);
        setIntField(term22791, term22791.getClass(), "tokenEnd", 1003743923);
        setField(term22790, term22790.getClass(), "stream", term22791);
        setField(term22846, term22846.getClass(), "reporter", null);
        setField(term22846, term22846.getClass(), "nativeTypes", term22847);
        setField(term22846, term22846.getClass(), "namesToTypes", term22848);
        setField(term22846, term22846.getClass(), "namespaces", term22856);
        setField(term22846, term22846.getClass(), "enumTypeNames", term22863);
        setField(term22846, term22846.getClass(), "forwardDeclaredTypes", term22870);
        setField(term22846, term22846.getClass(), "typesIndexedByProperty", term22877);
        setField(term22846, term22846.getClass(), "greatestSubtypeByProperty", term22882);
        setField(term22846, term22846.getClass(), "interfaceToImplementors", null);
        setField(term22846, term22846.getClass(), "unresolvedNamedTypes", null);
        setField(term22846, term22846.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term22846, term22846.getClass(), "lastGeneration", false);
        setField(term22846, term22846.getClass(), "templateTypeName", "ubaBUfLolu");
        setField(term22903, term22903.getClass(), "name", "itAUCFhZhq");
        setField(term22903, term22903.getClass(), "referencedType", null);
        setBooleanField(term22903, term22903.getClass(), "visited", true);
        setField(term22918, term22918.getClass(), "baseType", null);
        setField(term22918, term22918.getClass(), "implementedInterfaces", null);
        setField(term22918, term22918.getClass(), "parameters", null);
        setField(term22918, term22918.getClass(), "thrownTypes", null);
        setField(term22918, term22918.getClass(), "templateTypeName", null);
        setField(term22918, term22918.getClass(), "description", null);
        setField(term22918, term22918.getClass(), "deprecated", null);
        setField(term22918, term22918.getClass(), "license", null);
        setField(term22918, term22918.getClass(), "suppressions", null);
        setField(term22917, term22917.getClass(), "info", term22918);
        setField(term22919, term22919.getClass(), "markers", null);
        setField(term22919, term22919.getClass(), "parameters", null);
        setField(term22919, term22919.getClass(), "throwsDescriptions", null);
        setField(term22919, term22919.getClass(), "blockDescription", null);
        setField(term22919, term22919.getClass(), "fileOverview", null);
        setField(term22919, term22919.getClass(), "returnDescription", null);
        setField(term22919, term22919.getClass(), "version", null);
        setField(term22919, term22919.getClass(), "authors", null);
        setField(term22919, term22919.getClass(), "sees", null);
        setField(term22917, term22917.getClass(), "documentation", term22919);
        setField(term22917, term22917.getClass(), "sourceName", "");
        setField(term22917, term22917.getClass(), "visibility", enum199);
        setIntField(term22917, term22917.getClass(), "bitset", 1887772522);
        setField(term22924, term22924.getClass(), "root", null);
        setField(term22924, term22924.getClass(), "sourceName", null);
        setField(term22924, term22924.getClass(), "registry", null);
        setField(term22917, term22917.getClass(), "type", term22924);
        setField(term22925, term22925.getClass(), "root", null);
        setField(term22925, term22925.getClass(), "sourceName", null);
        setField(term22925, term22925.getClass(), "registry", null);
        setField(term22917, term22917.getClass(), "thisType", term22925);
        setBooleanField(term22917, term22917.getClass(), "includeDocumentation", true);
        setField(term22903, term22903.getClass(), "docInfo", term22917);
        setBooleanField(term22903, term22903.getClass(), "unknown", true);
        setBooleanField(term22903, term22903.getClass(), "resolved", false);
        setField(term22903, term22903.getClass(), "resolveResult", null);
        setField(term22903, term22903.getClass(), "registry", null);
        setField(term22846, term22846.getClass(), "templateType", term22903);
        setField(term22790, term22790.getClass(), "typeRegistry", term22846);
        setField(term22930, term22930.getClass(), "info", null);
        setField(term22930, term22930.getClass(), "documentation", null);
        setField(term22930, term22930.getClass(), "sourceName", null);
        setField(term22930, term22930.getClass(), "visibility", null);
        setIntField(term22930, term22930.getClass(), "bitset", 0);
        setField(term22930, term22930.getClass(), "type", null);
        setField(term22930, term22930.getClass(), "thisType", null);
        setBooleanField(term22930, term22930.getClass(), "includeDocumentation", false);
        setField(term22929, term22929.getClass(), "currentInfo", term22930);
        setBooleanField(term22929, term22929.getClass(), "populated", true);
        setBooleanField(term22929, term22929.getClass(), "parseDocumentation", false);
        setField(term22935, term22935.getClass(), "annotation", null);
        setField(term22935, term22935.getClass(), "name", null);
        setField(term22935, term22935.getClass(), "description", null);
        setField(term22935, term22935.getClass(), "type", null);
        setField(term22929, term22929.getClass(), "currentMarker", term22935);
        setField(term22790, term22790.getClass(), "jsdocBuilder", term22929);
        setField(term22790, term22790.getClass(), "sourceName", "JKGueoHesL");
        setField(term22790, term22790.getClass(), "errorReporter", null);
        setField(term22948, term22948.getClass(), "this$0", null);
        setField(term22790, term22790.getClass(), "parser", term22948);
        setField(term22949, term22949.getClass(), "info", null);
        setField(term22949, term22949.getClass(), "documentation", null);
        setField(term22949, term22949.getClass(), "sourceName", null);
        setField(term22949, term22949.getClass(), "visibility", null);
        setIntField(term22949, term22949.getClass(), "bitset", 0);
        setField(term22949, term22949.getClass(), "type", null);
        setField(term22949, term22949.getClass(), "thisType", null);
        setBooleanField(term22949, term22949.getClass(), "includeDocumentation", false);
        setField(term22790, term22790.getClass(), "fileOverviewJSDocInfo", term22949);
        setField(term22790, term22790.getClass(), "state", enum200);
        setField(term22790, term22790.getClass(), "annotationNames", term22973);
        setField(term22984, term22984.getClass(), "this$0", null);
        setField(term22790, term22790.getClass(), "fileLevelJsDocBuilder", term22984);
        setField(term22790, term22790.getClass(), "unreadToken", null);
        Class<? extends Object> term311692 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term311691 = ((Class) term311692).getDeclaredField((String) "LC");
        ((Field) term311691).setAccessible(true);
        enum201 = ((Field) term311691).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum201;
        try {
            callMethod(klass, "parseTopLevelTypeExpression", argTypes, term22790, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


