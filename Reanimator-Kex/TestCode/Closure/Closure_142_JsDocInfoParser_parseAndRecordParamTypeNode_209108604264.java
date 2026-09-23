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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parseAndRecordParamTypeNode_209108604264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9441;
     Object enum165;

    public JsDocInfoParser_parseAndRecordParamTypeNode_209108604264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9492 = new HashMap();
        HashMap term9501 = new HashMap();
        Set<Object> term295622 =  ((Map) term9501).keySet();
        HashSet term9500 = new HashSet((Collection<? extends Object>) term295622);
        HashMap term9508 = new HashMap();
        Set<Object> term295623 =  ((Map) term9508).keySet();
        HashSet term9507 = new HashSet((Collection<? extends Object>) term295623);
        HashMap term9515 = new HashMap();
        Set<Object> term295624 =  ((Map) term9515).keySet();
        HashSet term9514 = new HashSet((Collection<? extends Object>) term295624);
        HashMap term9521 = new HashMap();
        HashMap term9526 = new HashMap();
        Class<? extends Object> term295646 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term295645 = ((Class) term295646).getDeclaredField((String) "PROTECTED");
        ((Field) term295645).setAccessible(true);
        Object enum163 = ((Field) term295645).get((Object) null);
        Class<? extends Object> term295930 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term295929 = ((Class) term295930).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term295929).setAccessible(true);
        Object enum164 = ((Field) term295929).get((Object) null);
        HashMap term9620 = new HashMap();
        term9441 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term9442 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term9455 = (char[]) newCharArray(2);
        int[] term9459 = (int[]) newIntArray(5);
        Object term9490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9491 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term9547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term9561 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9562 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term9563 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term9568 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9569 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9573 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term9574 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9579 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term9592 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term9593 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9631 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term9442, term9442.getClass(), "string", "JeZFtaqkzW");
        setCharElement(term9455, 0, 'Z');
        setCharElement(term9455, 1, 'p');
        setField(term9442, term9442.getClass(), "stringBuffer", term9455);
        setIntField(term9442, term9442.getClass(), "stringBufferTop", 197109649);
        setIntElement(term9459, 0, -1239406390);
        setIntElement(term9459, 1, 1557431527);
        setIntElement(term9459, 2, -1504890659);
        setIntElement(term9459, 3, 1358829571);
        setIntElement(term9459, 4, 991356662);
        setField(term9442, term9442.getClass(), "ungetBuffer", term9459);
        setIntField(term9442, term9442.getClass(), "ungetCursor", -506958186);
        setBooleanField(term9442, term9442.getClass(), "hitEOF", false);
        setIntField(term9442, term9442.getClass(), "lineStart", -507387516);
        setIntField(term9442, term9442.getClass(), "lineEndChar", -1970452551);
        setIntField(term9442, term9442.getClass(), "lineno", -1896376975);
        setIntField(term9442, term9442.getClass(), "charno", 729658803);
        setIntField(term9442, term9442.getClass(), "initCharno", 114754804);
        setIntField(term9442, term9442.getClass(), "initLineno", 1687361082);
        setField(term9442, term9442.getClass(), "sourceString", "vOVuNSCCLe");
        setIntField(term9442, term9442.getClass(), "sourceEnd", 584893196);
        setIntField(term9442, term9442.getClass(), "sourceCursor", 497269071);
        setIntField(term9442, term9442.getClass(), "cursor", -1899301124);
        setIntField(term9442, term9442.getClass(), "tokenBeg", -1882480155);
        setIntField(term9442, term9442.getClass(), "tokenEnd", -1410220680);
        setField(term9441, term9441.getClass(), "stream", term9442);
        setField(term9490, term9490.getClass(), "reporter", null);
        setField(term9490, term9490.getClass(), "nativeTypes", term9491);
        setField(term9490, term9490.getClass(), "namesToTypes", term9492);
        setField(term9490, term9490.getClass(), "namespaces", term9500);
        setField(term9490, term9490.getClass(), "enumTypeNames", term9507);
        setField(term9490, term9490.getClass(), "forwardDeclaredTypes", term9514);
        setField(term9490, term9490.getClass(), "typesIndexedByProperty", term9521);
        setField(term9490, term9490.getClass(), "greatestSubtypeByProperty", term9526);
        setField(term9490, term9490.getClass(), "interfaceToImplementors", null);
        setField(term9490, term9490.getClass(), "unresolvedNamedTypes", null);
        setField(term9490, term9490.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9490, term9490.getClass(), "lastGeneration", true);
        setField(term9490, term9490.getClass(), "templateTypeName", "MeTmRZXErV");
        setField(term9547, term9547.getClass(), "name", "jNxbVmoZgq");
        setField(term9547, term9547.getClass(), "referencedType", null);
        setBooleanField(term9547, term9547.getClass(), "visited", false);
        setField(term9562, term9562.getClass(), "baseType", null);
        setField(term9562, term9562.getClass(), "implementedInterfaces", null);
        setField(term9562, term9562.getClass(), "parameters", null);
        setField(term9562, term9562.getClass(), "thrownTypes", null);
        setField(term9562, term9562.getClass(), "templateTypeName", null);
        setField(term9562, term9562.getClass(), "description", null);
        setField(term9562, term9562.getClass(), "deprecated", null);
        setField(term9562, term9562.getClass(), "license", null);
        setField(term9562, term9562.getClass(), "suppressions", null);
        setField(term9561, term9561.getClass(), "info", term9562);
        setField(term9563, term9563.getClass(), "markers", null);
        setField(term9563, term9563.getClass(), "parameters", null);
        setField(term9563, term9563.getClass(), "throwsDescriptions", null);
        setField(term9563, term9563.getClass(), "blockDescription", null);
        setField(term9563, term9563.getClass(), "fileOverview", null);
        setField(term9563, term9563.getClass(), "returnDescription", null);
        setField(term9563, term9563.getClass(), "version", null);
        setField(term9563, term9563.getClass(), "authors", null);
        setField(term9563, term9563.getClass(), "sees", null);
        setField(term9561, term9561.getClass(), "documentation", term9563);
        setField(term9561, term9561.getClass(), "sourceName", "");
        setField(term9561, term9561.getClass(), "visibility", enum163);
        setIntField(term9561, term9561.getClass(), "bitset", 389427431);
        setField(term9568, term9568.getClass(), "root", null);
        setField(term9568, term9568.getClass(), "sourceName", null);
        setField(term9568, term9568.getClass(), "registry", null);
        setField(term9561, term9561.getClass(), "type", term9568);
        setField(term9569, term9569.getClass(), "root", null);
        setField(term9569, term9569.getClass(), "sourceName", null);
        setField(term9569, term9569.getClass(), "registry", null);
        setField(term9561, term9561.getClass(), "thisType", term9569);
        setBooleanField(term9561, term9561.getClass(), "includeDocumentation", false);
        setField(term9547, term9547.getClass(), "docInfo", term9561);
        setBooleanField(term9547, term9547.getClass(), "unknown", true);
        setBooleanField(term9547, term9547.getClass(), "resolved", false);
        setField(term9547, term9547.getClass(), "resolveResult", null);
        setField(term9547, term9547.getClass(), "registry", null);
        setField(term9490, term9490.getClass(), "templateType", term9547);
        setField(term9441, term9441.getClass(), "typeRegistry", term9490);
        setField(term9574, term9574.getClass(), "info", null);
        setField(term9574, term9574.getClass(), "documentation", null);
        setField(term9574, term9574.getClass(), "sourceName", null);
        setField(term9574, term9574.getClass(), "visibility", null);
        setIntField(term9574, term9574.getClass(), "bitset", 0);
        setField(term9574, term9574.getClass(), "type", null);
        setField(term9574, term9574.getClass(), "thisType", null);
        setBooleanField(term9574, term9574.getClass(), "includeDocumentation", false);
        setField(term9573, term9573.getClass(), "currentInfo", term9574);
        setBooleanField(term9573, term9573.getClass(), "populated", false);
        setBooleanField(term9573, term9573.getClass(), "parseDocumentation", true);
        setField(term9579, term9579.getClass(), "annotation", null);
        setField(term9579, term9579.getClass(), "name", null);
        setField(term9579, term9579.getClass(), "description", null);
        setField(term9579, term9579.getClass(), "type", null);
        setField(term9573, term9573.getClass(), "currentMarker", term9579);
        setField(term9441, term9441.getClass(), "jsdocBuilder", term9573);
        setField(term9441, term9441.getClass(), "sourceName", "lBOokzEPfe");
        setField(term9441, term9441.getClass(), "errorReporter", null);
        setField(term9592, term9592.getClass(), "this$0", null);
        setField(term9441, term9441.getClass(), "parser", term9592);
        setField(term9593, term9593.getClass(), "info", null);
        setField(term9593, term9593.getClass(), "documentation", null);
        setField(term9593, term9593.getClass(), "sourceName", null);
        setField(term9593, term9593.getClass(), "visibility", null);
        setIntField(term9593, term9593.getClass(), "bitset", 0);
        setField(term9593, term9593.getClass(), "type", null);
        setField(term9593, term9593.getClass(), "thisType", null);
        setBooleanField(term9593, term9593.getClass(), "includeDocumentation", false);
        setField(term9441, term9441.getClass(), "fileOverviewJSDocInfo", term9593);
        setField(term9441, term9441.getClass(), "state", enum164);
        setField(term9441, term9441.getClass(), "annotationNames", term9620);
        setField(term9631, term9631.getClass(), "this$0", null);
        setField(term9441, term9441.getClass(), "fileLevelJsDocBuilder", term9631);
        setField(term9441, term9441.getClass(), "unreadToken", null);
        Class<? extends Object> term296287 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term296286 = ((Class) term296287).getDeclaredField((String) "LB");
        ((Field) term296286).setAccessible(true);
        enum165 = ((Field) term296286).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum165;
        try {
            callMethod(klass, "parseAndRecordParamTypeNode", argTypes, term9441, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


