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

public class JsDocInfoParser_parseTypeExpressionList_121498987778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23928;
     Object enum204;

    public JsDocInfoParser_parseTypeExpressionList_121498987778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23976 = new HashMap();
        HashMap term23985 = new HashMap();
        Set<Object> term312302 =  ((Map) term23985).keySet();
        HashSet term23984 = new HashSet((Collection<? extends Object>) term312302);
        HashMap term23991 = new HashMap();
        Set<Object> term312303 =  ((Map) term23991).keySet();
        HashSet term23990 = new HashSet((Collection<? extends Object>) term312303);
        HashMap term23998 = new HashMap();
        Set<Object> term312304 =  ((Map) term23998).keySet();
        HashSet term23997 = new HashSet((Collection<? extends Object>) term312304);
        HashMap term24004 = new HashMap();
        HashMap term24009 = new HashMap();
        Class<? extends Object> term312326 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term312325 = ((Class) term312326).getDeclaredField((String) "PUBLIC");
        ((Field) term312325).setAccessible(true);
        Object enum202 = ((Field) term312325).get((Object) null);
        Class<? extends Object> term312601 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term312600 = ((Class) term312601).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term312600).setAccessible(true);
        Object enum203 = ((Field) term312600).get((Object) null);
        HashMap term24102 = new HashMap();
        term23928 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term23929 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term23942 = (char[]) newCharArray(2);
        int[] term23946 = (int[]) newIntArray(2);
        Object term23974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term23975 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term24030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term24044 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term24045 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term24046 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term24051 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term24055 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term24056 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term24061 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term24074 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term24075 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term24113 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term23929, term23929.getClass(), "string", "DddqUYfomL");
        setCharElement(term23942, 0, 'P');
        setCharElement(term23942, 1, 'i');
        setField(term23929, term23929.getClass(), "stringBuffer", term23942);
        setIntField(term23929, term23929.getClass(), "stringBufferTop", -1840305774);
        setIntElement(term23946, 0, 1365087144);
        setIntElement(term23946, 1, -1537255112);
        setField(term23929, term23929.getClass(), "ungetBuffer", term23946);
        setIntField(term23929, term23929.getClass(), "ungetCursor", 934477462);
        setBooleanField(term23929, term23929.getClass(), "hitEOF", true);
        setIntField(term23929, term23929.getClass(), "lineStart", 4900410);
        setIntField(term23929, term23929.getClass(), "lineEndChar", -1252345779);
        setIntField(term23929, term23929.getClass(), "lineno", -2063365430);
        setIntField(term23929, term23929.getClass(), "charno", 812570053);
        setIntField(term23929, term23929.getClass(), "initCharno", -1488938905);
        setIntField(term23929, term23929.getClass(), "initLineno", 1916544127);
        setField(term23929, term23929.getClass(), "sourceString", "YQwoogpPyi");
        setIntField(term23929, term23929.getClass(), "sourceEnd", -1133405894);
        setIntField(term23929, term23929.getClass(), "sourceCursor", 1289741214);
        setIntField(term23929, term23929.getClass(), "cursor", 243280944);
        setIntField(term23929, term23929.getClass(), "tokenBeg", -726681073);
        setIntField(term23929, term23929.getClass(), "tokenEnd", -1724487863);
        setField(term23928, term23928.getClass(), "stream", term23929);
        setField(term23974, term23974.getClass(), "reporter", null);
        setField(term23974, term23974.getClass(), "nativeTypes", term23975);
        setField(term23974, term23974.getClass(), "namesToTypes", term23976);
        setField(term23974, term23974.getClass(), "namespaces", term23984);
        setField(term23974, term23974.getClass(), "enumTypeNames", term23990);
        setField(term23974, term23974.getClass(), "forwardDeclaredTypes", term23997);
        setField(term23974, term23974.getClass(), "typesIndexedByProperty", term24004);
        setField(term23974, term23974.getClass(), "greatestSubtypeByProperty", term24009);
        setField(term23974, term23974.getClass(), "interfaceToImplementors", null);
        setField(term23974, term23974.getClass(), "unresolvedNamedTypes", null);
        setField(term23974, term23974.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term23974, term23974.getClass(), "lastGeneration", false);
        setField(term23974, term23974.getClass(), "templateTypeName", "rfqJDkDppz");
        setField(term24030, term24030.getClass(), "name", "MGorMVGauT");
        setField(term24030, term24030.getClass(), "referencedType", null);
        setBooleanField(term24030, term24030.getClass(), "visited", false);
        setField(term24045, term24045.getClass(), "baseType", null);
        setField(term24045, term24045.getClass(), "implementedInterfaces", null);
        setField(term24045, term24045.getClass(), "parameters", null);
        setField(term24045, term24045.getClass(), "thrownTypes", null);
        setField(term24045, term24045.getClass(), "templateTypeName", null);
        setField(term24045, term24045.getClass(), "description", null);
        setField(term24045, term24045.getClass(), "deprecated", null);
        setField(term24045, term24045.getClass(), "license", null);
        setField(term24045, term24045.getClass(), "suppressions", null);
        setField(term24044, term24044.getClass(), "info", term24045);
        setField(term24046, term24046.getClass(), "markers", null);
        setField(term24046, term24046.getClass(), "parameters", null);
        setField(term24046, term24046.getClass(), "throwsDescriptions", null);
        setField(term24046, term24046.getClass(), "blockDescription", null);
        setField(term24046, term24046.getClass(), "fileOverview", null);
        setField(term24046, term24046.getClass(), "returnDescription", null);
        setField(term24046, term24046.getClass(), "version", null);
        setField(term24046, term24046.getClass(), "authors", null);
        setField(term24046, term24046.getClass(), "sees", null);
        setField(term24044, term24044.getClass(), "documentation", term24046);
        setField(term24044, term24044.getClass(), "sourceName", "");
        setField(term24044, term24044.getClass(), "visibility", enum202);
        setIntField(term24044, term24044.getClass(), "bitset", -128490829);
        setField(term24051, term24051.getClass(), "root", null);
        setField(term24051, term24051.getClass(), "sourceName", null);
        setField(term24051, term24051.getClass(), "registry", null);
        setField(term24044, term24044.getClass(), "type", term24051);
        setField(term24044, term24044.getClass(), "thisType", term24051);
        setBooleanField(term24044, term24044.getClass(), "includeDocumentation", true);
        setField(term24030, term24030.getClass(), "docInfo", term24044);
        setBooleanField(term24030, term24030.getClass(), "unknown", true);
        setBooleanField(term24030, term24030.getClass(), "resolved", true);
        setField(term24030, term24030.getClass(), "resolveResult", null);
        setField(term24030, term24030.getClass(), "registry", null);
        setField(term23974, term23974.getClass(), "templateType", term24030);
        setField(term23928, term23928.getClass(), "typeRegistry", term23974);
        setField(term24056, term24056.getClass(), "info", null);
        setField(term24056, term24056.getClass(), "documentation", null);
        setField(term24056, term24056.getClass(), "sourceName", null);
        setField(term24056, term24056.getClass(), "visibility", null);
        setIntField(term24056, term24056.getClass(), "bitset", 0);
        setField(term24056, term24056.getClass(), "type", null);
        setField(term24056, term24056.getClass(), "thisType", null);
        setBooleanField(term24056, term24056.getClass(), "includeDocumentation", false);
        setField(term24055, term24055.getClass(), "currentInfo", term24056);
        setBooleanField(term24055, term24055.getClass(), "populated", true);
        setBooleanField(term24055, term24055.getClass(), "parseDocumentation", false);
        setField(term24061, term24061.getClass(), "annotation", null);
        setField(term24061, term24061.getClass(), "name", null);
        setField(term24061, term24061.getClass(), "description", null);
        setField(term24061, term24061.getClass(), "type", null);
        setField(term24055, term24055.getClass(), "currentMarker", term24061);
        setField(term23928, term23928.getClass(), "jsdocBuilder", term24055);
        setField(term23928, term23928.getClass(), "sourceName", "pOuFRlHmbK");
        setField(term23928, term23928.getClass(), "errorReporter", null);
        setField(term24074, term24074.getClass(), "this$0", null);
        setField(term23928, term23928.getClass(), "parser", term24074);
        setField(term24075, term24075.getClass(), "info", null);
        setField(term24075, term24075.getClass(), "documentation", null);
        setField(term24075, term24075.getClass(), "sourceName", null);
        setField(term24075, term24075.getClass(), "visibility", null);
        setIntField(term24075, term24075.getClass(), "bitset", 0);
        setField(term24075, term24075.getClass(), "type", null);
        setField(term24075, term24075.getClass(), "thisType", null);
        setBooleanField(term24075, term24075.getClass(), "includeDocumentation", false);
        setField(term23928, term23928.getClass(), "fileOverviewJSDocInfo", term24075);
        setField(term23928, term23928.getClass(), "state", enum203);
        setField(term23928, term23928.getClass(), "annotationNames", term24102);
        setField(term24113, term24113.getClass(), "this$0", null);
        setField(term23928, term23928.getClass(), "fileLevelJsDocBuilder", term24113);
        setField(term23928, term23928.getClass(), "unreadToken", null);
        Class<? extends Object> term312958 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term312957 = ((Class) term312958).getDeclaredField((String) "COLON");
        ((Field) term312957).setAccessible(true);
        enum204 = ((Field) term312957).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum204;
        try {
            callMethod(klass, "parseTypeExpressionList", argTypes, term23928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


