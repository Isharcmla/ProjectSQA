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

public class JsDocInfoParser_extractBlockComment_97418284172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18214;
     Object enum189;

    public JsDocInfoParser_extractBlockComment_97418284172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18268 = new HashMap();
        HashMap term18277 = new HashMap();
        Set<Object> term305940 =  ((Map) term18277).keySet();
        HashSet term18276 = new HashSet((Collection<? extends Object>) term305940);
        HashMap term18284 = new HashMap();
        Set<Object> term305941 =  ((Map) term18284).keySet();
        HashSet term18283 = new HashSet((Collection<? extends Object>) term305941);
        HashMap term18291 = new HashMap();
        Set<Object> term305942 =  ((Map) term18291).keySet();
        HashSet term18290 = new HashSet((Collection<? extends Object>) term305942);
        HashMap term18297 = new HashMap();
        HashMap term18302 = new HashMap();
        Class<? extends Object> term305964 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term305963 = ((Class) term305964).getDeclaredField((String) "PUBLIC");
        ((Field) term305963).setAccessible(true);
        Object enum187 = ((Field) term305963).get((Object) null);
        Class<? extends Object> term306239 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term306238 = ((Class) term306239).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term306238).setAccessible(true);
        Object enum188 = ((Field) term306238).get((Object) null);
        HashMap term18393 = new HashMap();
        term18214 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term18215 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term18228 = (char[]) newCharArray(4);
        int[] term18234 = (int[]) newIntArray(6);
        Object term18266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term18267 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term18323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term18337 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term18338 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term18339 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term18344 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18345 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18349 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term18350 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term18355 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term18368 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term18369 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term18404 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term18215, term18215.getClass(), "string", "HqoTWlkbwF");
        setCharElement(term18228, 0, 'S');
        setCharElement(term18228, 1, 'z');
        setCharElement(term18228, 2, 'Y');
        setCharElement(term18228, 3, 'Y');
        setField(term18215, term18215.getClass(), "stringBuffer", term18228);
        setIntField(term18215, term18215.getClass(), "stringBufferTop", -942194446);
        setIntElement(term18234, 0, -938508470);
        setIntElement(term18234, 1, 1242676024);
        setIntElement(term18234, 2, -1865023308);
        setIntElement(term18234, 3, 1698510819);
        setIntElement(term18234, 4, -1553893255);
        setIntElement(term18234, 5, 1303442927);
        setField(term18215, term18215.getClass(), "ungetBuffer", term18234);
        setIntField(term18215, term18215.getClass(), "ungetCursor", 794568325);
        setBooleanField(term18215, term18215.getClass(), "hitEOF", false);
        setIntField(term18215, term18215.getClass(), "lineStart", -434468428);
        setIntField(term18215, term18215.getClass(), "lineEndChar", 1559605714);
        setIntField(term18215, term18215.getClass(), "lineno", 1146601902);
        setIntField(term18215, term18215.getClass(), "charno", -1938881385);
        setIntField(term18215, term18215.getClass(), "initCharno", -1629418973);
        setIntField(term18215, term18215.getClass(), "initLineno", -100825168);
        setField(term18215, term18215.getClass(), "sourceString", "CwNELDTAPP");
        setIntField(term18215, term18215.getClass(), "sourceEnd", 768407648);
        setIntField(term18215, term18215.getClass(), "sourceCursor", -350454594);
        setIntField(term18215, term18215.getClass(), "cursor", -1148142995);
        setIntField(term18215, term18215.getClass(), "tokenBeg", -233024044);
        setIntField(term18215, term18215.getClass(), "tokenEnd", 1820784228);
        setField(term18214, term18214.getClass(), "stream", term18215);
        setField(term18266, term18266.getClass(), "reporter", null);
        setField(term18266, term18266.getClass(), "nativeTypes", term18267);
        setField(term18266, term18266.getClass(), "namesToTypes", term18268);
        setField(term18266, term18266.getClass(), "namespaces", term18276);
        setField(term18266, term18266.getClass(), "enumTypeNames", term18283);
        setField(term18266, term18266.getClass(), "forwardDeclaredTypes", term18290);
        setField(term18266, term18266.getClass(), "typesIndexedByProperty", term18297);
        setField(term18266, term18266.getClass(), "greatestSubtypeByProperty", term18302);
        setField(term18266, term18266.getClass(), "interfaceToImplementors", null);
        setField(term18266, term18266.getClass(), "unresolvedNamedTypes", null);
        setField(term18266, term18266.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term18266, term18266.getClass(), "lastGeneration", true);
        setField(term18266, term18266.getClass(), "templateTypeName", "wgRGBNrTGP");
        setField(term18323, term18323.getClass(), "name", "FIdNVptZpW");
        setField(term18323, term18323.getClass(), "referencedType", null);
        setBooleanField(term18323, term18323.getClass(), "visited", false);
        setField(term18338, term18338.getClass(), "baseType", null);
        setField(term18338, term18338.getClass(), "implementedInterfaces", null);
        setField(term18338, term18338.getClass(), "parameters", null);
        setField(term18338, term18338.getClass(), "thrownTypes", null);
        setField(term18338, term18338.getClass(), "templateTypeName", null);
        setField(term18338, term18338.getClass(), "description", null);
        setField(term18338, term18338.getClass(), "deprecated", null);
        setField(term18338, term18338.getClass(), "license", null);
        setField(term18338, term18338.getClass(), "suppressions", null);
        setField(term18337, term18337.getClass(), "info", term18338);
        setField(term18339, term18339.getClass(), "markers", null);
        setField(term18339, term18339.getClass(), "parameters", null);
        setField(term18339, term18339.getClass(), "throwsDescriptions", null);
        setField(term18339, term18339.getClass(), "blockDescription", null);
        setField(term18339, term18339.getClass(), "fileOverview", null);
        setField(term18339, term18339.getClass(), "returnDescription", null);
        setField(term18339, term18339.getClass(), "version", null);
        setField(term18339, term18339.getClass(), "authors", null);
        setField(term18339, term18339.getClass(), "sees", null);
        setField(term18337, term18337.getClass(), "documentation", term18339);
        setField(term18337, term18337.getClass(), "sourceName", "");
        setField(term18337, term18337.getClass(), "visibility", enum187);
        setIntField(term18337, term18337.getClass(), "bitset", 1390820006);
        setField(term18344, term18344.getClass(), "root", null);
        setField(term18344, term18344.getClass(), "sourceName", null);
        setField(term18344, term18344.getClass(), "registry", null);
        setField(term18337, term18337.getClass(), "type", term18344);
        setField(term18345, term18345.getClass(), "root", null);
        setField(term18345, term18345.getClass(), "sourceName", null);
        setField(term18345, term18345.getClass(), "registry", null);
        setField(term18337, term18337.getClass(), "thisType", term18345);
        setBooleanField(term18337, term18337.getClass(), "includeDocumentation", false);
        setField(term18323, term18323.getClass(), "docInfo", term18337);
        setBooleanField(term18323, term18323.getClass(), "unknown", true);
        setBooleanField(term18323, term18323.getClass(), "resolved", false);
        setField(term18323, term18323.getClass(), "resolveResult", null);
        setField(term18323, term18323.getClass(), "registry", null);
        setField(term18266, term18266.getClass(), "templateType", term18323);
        setField(term18214, term18214.getClass(), "typeRegistry", term18266);
        setField(term18350, term18350.getClass(), "info", null);
        setField(term18350, term18350.getClass(), "documentation", null);
        setField(term18350, term18350.getClass(), "sourceName", null);
        setField(term18350, term18350.getClass(), "visibility", null);
        setIntField(term18350, term18350.getClass(), "bitset", 0);
        setField(term18350, term18350.getClass(), "type", null);
        setField(term18350, term18350.getClass(), "thisType", null);
        setBooleanField(term18350, term18350.getClass(), "includeDocumentation", false);
        setField(term18349, term18349.getClass(), "currentInfo", term18350);
        setBooleanField(term18349, term18349.getClass(), "populated", false);
        setBooleanField(term18349, term18349.getClass(), "parseDocumentation", false);
        setField(term18355, term18355.getClass(), "annotation", null);
        setField(term18355, term18355.getClass(), "name", null);
        setField(term18355, term18355.getClass(), "description", null);
        setField(term18355, term18355.getClass(), "type", null);
        setField(term18349, term18349.getClass(), "currentMarker", term18355);
        setField(term18214, term18214.getClass(), "jsdocBuilder", term18349);
        setField(term18214, term18214.getClass(), "sourceName", "lLiSiPCciB");
        setField(term18214, term18214.getClass(), "errorReporter", null);
        setField(term18368, term18368.getClass(), "this$0", null);
        setField(term18214, term18214.getClass(), "parser", term18368);
        setField(term18369, term18369.getClass(), "info", null);
        setField(term18369, term18369.getClass(), "documentation", null);
        setField(term18369, term18369.getClass(), "sourceName", null);
        setField(term18369, term18369.getClass(), "visibility", null);
        setIntField(term18369, term18369.getClass(), "bitset", 0);
        setField(term18369, term18369.getClass(), "type", null);
        setField(term18369, term18369.getClass(), "thisType", null);
        setBooleanField(term18369, term18369.getClass(), "includeDocumentation", false);
        setField(term18214, term18214.getClass(), "fileOverviewJSDocInfo", term18369);
        setField(term18214, term18214.getClass(), "state", enum188);
        setField(term18214, term18214.getClass(), "annotationNames", term18393);
        setField(term18404, term18404.getClass(), "this$0", null);
        setField(term18214, term18214.getClass(), "fileLevelJsDocBuilder", term18404);
        setField(term18214, term18214.getClass(), "unreadToken", null);
        Class<? extends Object> term306587 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term306586 = ((Class) term306587).getDeclaredField((String) "STAR");
        ((Field) term306586).setAccessible(true);
        enum189 = ((Field) term306586).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum189;
        try {
            callMethod(klass, "extractBlockComment", argTypes, term18214, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


