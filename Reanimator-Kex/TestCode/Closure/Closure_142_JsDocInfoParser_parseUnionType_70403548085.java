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

public class JsDocInfoParser_parseUnionType_70403548085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31926;
     Object enum225;

    public JsDocInfoParser_parseUnionType_70403548085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31981 = new HashMap();
        HashMap term31990 = new HashMap();
        Set<Object> term325410 =  ((Map) term31990).keySet();
        HashSet term31989 = new HashSet((Collection<? extends Object>) term325410);
        HashMap term31997 = new HashMap();
        Set<Object> term325411 =  ((Map) term31997).keySet();
        HashSet term31996 = new HashSet((Collection<? extends Object>) term325411);
        HashMap term32004 = new HashMap();
        Set<Object> term325412 =  ((Map) term32004).keySet();
        HashSet term32003 = new HashSet((Collection<? extends Object>) term325412);
        HashMap term32010 = new HashMap();
        HashMap term32015 = new HashMap();
        Class<? extends Object> term325434 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term325433 = ((Class) term325434).getDeclaredField((String) "INHERITED");
        ((Field) term325433).setAccessible(true);
        Object enum223 = ((Field) term325433).get((Object) null);
        Class<? extends Object> term325718 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term325717 = ((Class) term325718).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term325717).setAccessible(true);
        Object enum224 = ((Field) term325717).get((Object) null);
        HashMap term32106 = new HashMap();
        term31926 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term31927 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term31940 = (char[]) newCharArray(2);
        int[] term31944 = (int[]) newIntArray(9);
        Object term31979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term31980 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term32036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term32050 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term32051 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term32052 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term32057 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term32058 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term32062 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term32063 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term32068 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term32081 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term32082 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term32117 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term31927, term31927.getClass(), "string", "RhLliqMiOF");
        setCharElement(term31940, 0, 'R');
        setCharElement(term31940, 1, 'o');
        setField(term31927, term31927.getClass(), "stringBuffer", term31940);
        setIntField(term31927, term31927.getClass(), "stringBufferTop", 299791142);
        setIntElement(term31944, 0, 1862191391);
        setIntElement(term31944, 1, 1131398807);
        setIntElement(term31944, 2, -344907703);
        setIntElement(term31944, 3, 824341437);
        setIntElement(term31944, 4, -1794965320);
        setIntElement(term31944, 5, 520504102);
        setIntElement(term31944, 6, -457396133);
        setIntElement(term31944, 7, -1793950607);
        setIntElement(term31944, 8, 1091954101);
        setField(term31927, term31927.getClass(), "ungetBuffer", term31944);
        setIntField(term31927, term31927.getClass(), "ungetCursor", 1895143076);
        setBooleanField(term31927, term31927.getClass(), "hitEOF", true);
        setIntField(term31927, term31927.getClass(), "lineStart", 1981860404);
        setIntField(term31927, term31927.getClass(), "lineEndChar", 732174235);
        setIntField(term31927, term31927.getClass(), "lineno", 470895808);
        setIntField(term31927, term31927.getClass(), "charno", 1787325291);
        setIntField(term31927, term31927.getClass(), "initCharno", 1470349147);
        setIntField(term31927, term31927.getClass(), "initLineno", -255317272);
        setField(term31927, term31927.getClass(), "sourceString", "jlhonEGrJH");
        setIntField(term31927, term31927.getClass(), "sourceEnd", -706253892);
        setIntField(term31927, term31927.getClass(), "sourceCursor", -1341439819);
        setIntField(term31927, term31927.getClass(), "cursor", -728760750);
        setIntField(term31927, term31927.getClass(), "tokenBeg", -1617383807);
        setIntField(term31927, term31927.getClass(), "tokenEnd", -1244386281);
        setField(term31926, term31926.getClass(), "stream", term31927);
        setField(term31979, term31979.getClass(), "reporter", null);
        setField(term31979, term31979.getClass(), "nativeTypes", term31980);
        setField(term31979, term31979.getClass(), "namesToTypes", term31981);
        setField(term31979, term31979.getClass(), "namespaces", term31989);
        setField(term31979, term31979.getClass(), "enumTypeNames", term31996);
        setField(term31979, term31979.getClass(), "forwardDeclaredTypes", term32003);
        setField(term31979, term31979.getClass(), "typesIndexedByProperty", term32010);
        setField(term31979, term31979.getClass(), "greatestSubtypeByProperty", term32015);
        setField(term31979, term31979.getClass(), "interfaceToImplementors", null);
        setField(term31979, term31979.getClass(), "unresolvedNamedTypes", null);
        setField(term31979, term31979.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term31979, term31979.getClass(), "lastGeneration", true);
        setField(term31979, term31979.getClass(), "templateTypeName", "sbdLhVCRsw");
        setField(term32036, term32036.getClass(), "name", "soJHvZwbtF");
        setField(term32036, term32036.getClass(), "referencedType", null);
        setBooleanField(term32036, term32036.getClass(), "visited", false);
        setField(term32051, term32051.getClass(), "baseType", null);
        setField(term32051, term32051.getClass(), "implementedInterfaces", null);
        setField(term32051, term32051.getClass(), "parameters", null);
        setField(term32051, term32051.getClass(), "thrownTypes", null);
        setField(term32051, term32051.getClass(), "templateTypeName", null);
        setField(term32051, term32051.getClass(), "description", null);
        setField(term32051, term32051.getClass(), "deprecated", null);
        setField(term32051, term32051.getClass(), "license", null);
        setField(term32051, term32051.getClass(), "suppressions", null);
        setField(term32050, term32050.getClass(), "info", term32051);
        setField(term32052, term32052.getClass(), "markers", null);
        setField(term32052, term32052.getClass(), "parameters", null);
        setField(term32052, term32052.getClass(), "throwsDescriptions", null);
        setField(term32052, term32052.getClass(), "blockDescription", null);
        setField(term32052, term32052.getClass(), "fileOverview", null);
        setField(term32052, term32052.getClass(), "returnDescription", null);
        setField(term32052, term32052.getClass(), "version", null);
        setField(term32052, term32052.getClass(), "authors", null);
        setField(term32052, term32052.getClass(), "sees", null);
        setField(term32050, term32050.getClass(), "documentation", term32052);
        setField(term32050, term32050.getClass(), "sourceName", "");
        setField(term32050, term32050.getClass(), "visibility", enum223);
        setIntField(term32050, term32050.getClass(), "bitset", -885788574);
        setField(term32057, term32057.getClass(), "root", null);
        setField(term32057, term32057.getClass(), "sourceName", null);
        setField(term32057, term32057.getClass(), "registry", null);
        setField(term32050, term32050.getClass(), "type", term32057);
        setField(term32058, term32058.getClass(), "root", null);
        setField(term32058, term32058.getClass(), "sourceName", null);
        setField(term32058, term32058.getClass(), "registry", null);
        setField(term32050, term32050.getClass(), "thisType", term32058);
        setBooleanField(term32050, term32050.getClass(), "includeDocumentation", false);
        setField(term32036, term32036.getClass(), "docInfo", term32050);
        setBooleanField(term32036, term32036.getClass(), "unknown", true);
        setBooleanField(term32036, term32036.getClass(), "resolved", false);
        setField(term32036, term32036.getClass(), "resolveResult", null);
        setField(term32036, term32036.getClass(), "registry", null);
        setField(term31979, term31979.getClass(), "templateType", term32036);
        setField(term31926, term31926.getClass(), "typeRegistry", term31979);
        setField(term32063, term32063.getClass(), "info", null);
        setField(term32063, term32063.getClass(), "documentation", null);
        setField(term32063, term32063.getClass(), "sourceName", null);
        setField(term32063, term32063.getClass(), "visibility", null);
        setIntField(term32063, term32063.getClass(), "bitset", 0);
        setField(term32063, term32063.getClass(), "type", null);
        setField(term32063, term32063.getClass(), "thisType", null);
        setBooleanField(term32063, term32063.getClass(), "includeDocumentation", false);
        setField(term32062, term32062.getClass(), "currentInfo", term32063);
        setBooleanField(term32062, term32062.getClass(), "populated", false);
        setBooleanField(term32062, term32062.getClass(), "parseDocumentation", true);
        setField(term32068, term32068.getClass(), "annotation", null);
        setField(term32068, term32068.getClass(), "name", null);
        setField(term32068, term32068.getClass(), "description", null);
        setField(term32068, term32068.getClass(), "type", null);
        setField(term32062, term32062.getClass(), "currentMarker", term32068);
        setField(term31926, term31926.getClass(), "jsdocBuilder", term32062);
        setField(term31926, term31926.getClass(), "sourceName", "dPHtrzKWgf");
        setField(term31926, term31926.getClass(), "errorReporter", null);
        setField(term32081, term32081.getClass(), "this$0", null);
        setField(term31926, term31926.getClass(), "parser", term32081);
        setField(term32082, term32082.getClass(), "info", null);
        setField(term32082, term32082.getClass(), "documentation", null);
        setField(term32082, term32082.getClass(), "sourceName", null);
        setField(term32082, term32082.getClass(), "visibility", null);
        setIntField(term32082, term32082.getClass(), "bitset", 0);
        setField(term32082, term32082.getClass(), "type", null);
        setField(term32082, term32082.getClass(), "thisType", null);
        setBooleanField(term32082, term32082.getClass(), "includeDocumentation", false);
        setField(term31926, term31926.getClass(), "fileOverviewJSDocInfo", term32082);
        setField(term31926, term31926.getClass(), "state", enum224);
        setField(term31926, term31926.getClass(), "annotationNames", term32106);
        setField(term32117, term32117.getClass(), "this$0", null);
        setField(term31926, term31926.getClass(), "fileLevelJsDocBuilder", term32117);
        setField(term31926, term31926.getClass(), "unreadToken", null);
        Class<? extends Object> term326066 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term326065 = ((Class) term326066).getDeclaredField((String) "STAR");
        ((Field) term326065).setAccessible(true);
        enum225 = ((Field) term326065).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum225;
        try {
            callMethod(klass, "parseUnionType", argTypes, term31926, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


