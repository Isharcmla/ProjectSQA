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

public class JsDocInfoParser_parseBasicTypeExpression_93029017580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26223;
     Object enum210;

    public JsDocInfoParser_parseBasicTypeExpression_93029017580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term26276 = new HashMap();
        HashMap term26285 = new HashMap();
        Set<Object> term314932 =  ((Map) term26285).keySet();
        HashSet term26284 = new HashSet((Collection<? extends Object>) term314932);
        HashMap term26292 = new HashMap();
        Set<Object> term314933 =  ((Map) term26292).keySet();
        HashSet term26291 = new HashSet((Collection<? extends Object>) term314933);
        HashMap term26299 = new HashMap();
        Set<Object> term314934 =  ((Map) term26299).keySet();
        HashSet term26298 = new HashSet((Collection<? extends Object>) term314934);
        HashMap term26305 = new HashMap();
        HashMap term26310 = new HashMap();
        Class<? extends Object> term314956 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term314955 = ((Class) term314956).getDeclaredField((String) "INHERITED");
        ((Field) term314955).setAccessible(true);
        Object enum208 = ((Field) term314955).get((Object) null);
        Class<? extends Object> term315240 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term315239 = ((Class) term315240).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term315239).setAccessible(true);
        Object enum209 = ((Field) term315239).get((Object) null);
        HashMap term26401 = new HashMap();
        term26223 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term26224 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term26237 = (char[]) newCharArray(5);
        int[] term26244 = (int[]) newIntArray(4);
        Object term26274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term26275 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term26331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term26345 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term26346 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term26347 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term26352 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26353 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26357 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term26358 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term26363 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term26376 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term26377 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term26412 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term26224, term26224.getClass(), "string", "tlRvilQyjJ");
        setCharElement(term26237, 0, 'x');
        setCharElement(term26237, 1, 'l');
        setCharElement(term26237, 2, 's');
        setCharElement(term26237, 3, 'z');
        setCharElement(term26237, 4, 'Y');
        setField(term26224, term26224.getClass(), "stringBuffer", term26237);
        setIntField(term26224, term26224.getClass(), "stringBufferTop", 319853052);
        setIntElement(term26244, 0, -1097563716);
        setIntElement(term26244, 1, 1572907769);
        setIntElement(term26244, 2, 1608016787);
        setIntElement(term26244, 3, -516303035);
        setField(term26224, term26224.getClass(), "ungetBuffer", term26244);
        setIntField(term26224, term26224.getClass(), "ungetCursor", -2143043890);
        setBooleanField(term26224, term26224.getClass(), "hitEOF", true);
        setIntField(term26224, term26224.getClass(), "lineStart", -2138825831);
        setIntField(term26224, term26224.getClass(), "lineEndChar", 1454781562);
        setIntField(term26224, term26224.getClass(), "lineno", -27944011);
        setIntField(term26224, term26224.getClass(), "charno", -20614472);
        setIntField(term26224, term26224.getClass(), "initCharno", 1126618861);
        setIntField(term26224, term26224.getClass(), "initLineno", 947449400);
        setField(term26224, term26224.getClass(), "sourceString", "gwTUlYNpjM");
        setIntField(term26224, term26224.getClass(), "sourceEnd", -763799087);
        setIntField(term26224, term26224.getClass(), "sourceCursor", 1207142014);
        setIntField(term26224, term26224.getClass(), "cursor", -876426634);
        setIntField(term26224, term26224.getClass(), "tokenBeg", 213831054);
        setIntField(term26224, term26224.getClass(), "tokenEnd", 330043745);
        setField(term26223, term26223.getClass(), "stream", term26224);
        setField(term26274, term26274.getClass(), "reporter", null);
        setField(term26274, term26274.getClass(), "nativeTypes", term26275);
        setField(term26274, term26274.getClass(), "namesToTypes", term26276);
        setField(term26274, term26274.getClass(), "namespaces", term26284);
        setField(term26274, term26274.getClass(), "enumTypeNames", term26291);
        setField(term26274, term26274.getClass(), "forwardDeclaredTypes", term26298);
        setField(term26274, term26274.getClass(), "typesIndexedByProperty", term26305);
        setField(term26274, term26274.getClass(), "greatestSubtypeByProperty", term26310);
        setField(term26274, term26274.getClass(), "interfaceToImplementors", null);
        setField(term26274, term26274.getClass(), "unresolvedNamedTypes", null);
        setField(term26274, term26274.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term26274, term26274.getClass(), "lastGeneration", false);
        setField(term26274, term26274.getClass(), "templateTypeName", "qMKmSzOQXg");
        setField(term26331, term26331.getClass(), "name", "CURQCMkqbZ");
        setField(term26331, term26331.getClass(), "referencedType", null);
        setBooleanField(term26331, term26331.getClass(), "visited", true);
        setField(term26346, term26346.getClass(), "baseType", null);
        setField(term26346, term26346.getClass(), "implementedInterfaces", null);
        setField(term26346, term26346.getClass(), "parameters", null);
        setField(term26346, term26346.getClass(), "thrownTypes", null);
        setField(term26346, term26346.getClass(), "templateTypeName", null);
        setField(term26346, term26346.getClass(), "description", null);
        setField(term26346, term26346.getClass(), "deprecated", null);
        setField(term26346, term26346.getClass(), "license", null);
        setField(term26346, term26346.getClass(), "suppressions", null);
        setField(term26345, term26345.getClass(), "info", term26346);
        setField(term26347, term26347.getClass(), "markers", null);
        setField(term26347, term26347.getClass(), "parameters", null);
        setField(term26347, term26347.getClass(), "throwsDescriptions", null);
        setField(term26347, term26347.getClass(), "blockDescription", null);
        setField(term26347, term26347.getClass(), "fileOverview", null);
        setField(term26347, term26347.getClass(), "returnDescription", null);
        setField(term26347, term26347.getClass(), "version", null);
        setField(term26347, term26347.getClass(), "authors", null);
        setField(term26347, term26347.getClass(), "sees", null);
        setField(term26345, term26345.getClass(), "documentation", term26347);
        setField(term26345, term26345.getClass(), "sourceName", "");
        setField(term26345, term26345.getClass(), "visibility", enum208);
        setIntField(term26345, term26345.getClass(), "bitset", -509349195);
        setField(term26352, term26352.getClass(), "root", null);
        setField(term26352, term26352.getClass(), "sourceName", null);
        setField(term26352, term26352.getClass(), "registry", null);
        setField(term26345, term26345.getClass(), "type", term26352);
        setField(term26353, term26353.getClass(), "root", null);
        setField(term26353, term26353.getClass(), "sourceName", null);
        setField(term26353, term26353.getClass(), "registry", null);
        setField(term26345, term26345.getClass(), "thisType", term26353);
        setBooleanField(term26345, term26345.getClass(), "includeDocumentation", true);
        setField(term26331, term26331.getClass(), "docInfo", term26345);
        setBooleanField(term26331, term26331.getClass(), "unknown", false);
        setBooleanField(term26331, term26331.getClass(), "resolved", true);
        setField(term26331, term26331.getClass(), "resolveResult", null);
        setField(term26331, term26331.getClass(), "registry", null);
        setField(term26274, term26274.getClass(), "templateType", term26331);
        setField(term26223, term26223.getClass(), "typeRegistry", term26274);
        setField(term26358, term26358.getClass(), "info", null);
        setField(term26358, term26358.getClass(), "documentation", null);
        setField(term26358, term26358.getClass(), "sourceName", null);
        setField(term26358, term26358.getClass(), "visibility", null);
        setIntField(term26358, term26358.getClass(), "bitset", 0);
        setField(term26358, term26358.getClass(), "type", null);
        setField(term26358, term26358.getClass(), "thisType", null);
        setBooleanField(term26358, term26358.getClass(), "includeDocumentation", false);
        setField(term26357, term26357.getClass(), "currentInfo", term26358);
        setBooleanField(term26357, term26357.getClass(), "populated", true);
        setBooleanField(term26357, term26357.getClass(), "parseDocumentation", true);
        setField(term26363, term26363.getClass(), "annotation", null);
        setField(term26363, term26363.getClass(), "name", null);
        setField(term26363, term26363.getClass(), "description", null);
        setField(term26363, term26363.getClass(), "type", null);
        setField(term26357, term26357.getClass(), "currentMarker", term26363);
        setField(term26223, term26223.getClass(), "jsdocBuilder", term26357);
        setField(term26223, term26223.getClass(), "sourceName", "HegRNsidFg");
        setField(term26223, term26223.getClass(), "errorReporter", null);
        setField(term26376, term26376.getClass(), "this$0", null);
        setField(term26223, term26223.getClass(), "parser", term26376);
        setField(term26377, term26377.getClass(), "info", null);
        setField(term26377, term26377.getClass(), "documentation", null);
        setField(term26377, term26377.getClass(), "sourceName", null);
        setField(term26377, term26377.getClass(), "visibility", null);
        setIntField(term26377, term26377.getClass(), "bitset", 0);
        setField(term26377, term26377.getClass(), "type", null);
        setField(term26377, term26377.getClass(), "thisType", null);
        setBooleanField(term26377, term26377.getClass(), "includeDocumentation", false);
        setField(term26223, term26223.getClass(), "fileOverviewJSDocInfo", term26377);
        setField(term26223, term26223.getClass(), "state", enum209);
        setField(term26223, term26223.getClass(), "annotationNames", term26401);
        setField(term26412, term26412.getClass(), "this$0", null);
        setField(term26223, term26223.getClass(), "fileLevelJsDocBuilder", term26412);
        setField(term26223, term26223.getClass(), "unreadToken", null);
        Class<? extends Object> term315588 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term315587 = ((Class) term315588).getDeclaredField((String) "LT");
        ((Field) term315587).setAccessible(true);
        enum210 = ((Field) term315587).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum210;
        try {
            callMethod(klass, "parseBasicTypeExpression", argTypes, term26223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


