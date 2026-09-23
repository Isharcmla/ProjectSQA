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

public class JsDocInfoParser_parseParametersType_28333511383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29637;
     Object enum219;

    public JsDocInfoParser_parseParametersType_28333511383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term29689 = new HashMap();
        HashMap term29698 = new HashMap();
        Set<Object> term319112 =  ((Map) term29698).keySet();
        HashSet term29697 = new HashSet((Collection<? extends Object>) term319112);
        HashMap term29705 = new HashMap();
        Set<Object> term319113 =  ((Map) term29705).keySet();
        HashSet term29704 = new HashSet((Collection<? extends Object>) term319113);
        HashMap term29712 = new HashMap();
        Set<Object> term319114 =  ((Map) term29712).keySet();
        HashSet term29711 = new HashSet((Collection<? extends Object>) term319114);
        HashMap term29718 = new HashMap();
        HashMap term29723 = new HashMap();
        Class<? extends Object> term319136 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term319135 = ((Class) term319136).getDeclaredField((String) "PUBLIC");
        ((Field) term319135).setAccessible(true);
        Object enum217 = ((Field) term319135).get((Object) null);
        Class<? extends Object> term319411 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term319410 = ((Class) term319411).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term319410).setAccessible(true);
        Object enum218 = ((Field) term319410).get((Object) null);
        HashMap term29817 = new HashMap();
        term29637 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term29638 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term29651 = (char[]) newCharArray(6);
        int[] term29659 = (int[]) newIntArray(2);
        Object term29687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term29688 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term29744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term29758 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term29759 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term29760 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term29765 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29766 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29770 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term29771 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term29776 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term29789 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term29790 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term29828 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term29638, term29638.getClass(), "string", "vjNPcTSqmS");
        setCharElement(term29651, 0, 'Q');
        setCharElement(term29651, 1, 'F');
        setCharElement(term29651, 2, 'p');
        setCharElement(term29651, 3, 'a');
        setCharElement(term29651, 4, 'H');
        setCharElement(term29651, 5, 'E');
        setField(term29638, term29638.getClass(), "stringBuffer", term29651);
        setIntField(term29638, term29638.getClass(), "stringBufferTop", 1973060703);
        setIntElement(term29659, 0, -138239905);
        setIntElement(term29659, 1, 1709474063);
        setField(term29638, term29638.getClass(), "ungetBuffer", term29659);
        setIntField(term29638, term29638.getClass(), "ungetCursor", 1406617209);
        setBooleanField(term29638, term29638.getClass(), "hitEOF", false);
        setIntField(term29638, term29638.getClass(), "lineStart", 1706047059);
        setIntField(term29638, term29638.getClass(), "lineEndChar", 590451710);
        setIntField(term29638, term29638.getClass(), "lineno", -1999787419);
        setIntField(term29638, term29638.getClass(), "charno", -1224443634);
        setIntField(term29638, term29638.getClass(), "initCharno", 1048451946);
        setIntField(term29638, term29638.getClass(), "initLineno", 5603560);
        setField(term29638, term29638.getClass(), "sourceString", "fFhdWuJbdC");
        setIntField(term29638, term29638.getClass(), "sourceEnd", -1079020032);
        setIntField(term29638, term29638.getClass(), "sourceCursor", -1973791064);
        setIntField(term29638, term29638.getClass(), "cursor", -2072158633);
        setIntField(term29638, term29638.getClass(), "tokenBeg", -355469363);
        setIntField(term29638, term29638.getClass(), "tokenEnd", 1465188553);
        setField(term29637, term29637.getClass(), "stream", term29638);
        setField(term29687, term29687.getClass(), "reporter", null);
        setField(term29687, term29687.getClass(), "nativeTypes", term29688);
        setField(term29687, term29687.getClass(), "namesToTypes", term29689);
        setField(term29687, term29687.getClass(), "namespaces", term29697);
        setField(term29687, term29687.getClass(), "enumTypeNames", term29704);
        setField(term29687, term29687.getClass(), "forwardDeclaredTypes", term29711);
        setField(term29687, term29687.getClass(), "typesIndexedByProperty", term29718);
        setField(term29687, term29687.getClass(), "greatestSubtypeByProperty", term29723);
        setField(term29687, term29687.getClass(), "interfaceToImplementors", null);
        setField(term29687, term29687.getClass(), "unresolvedNamedTypes", null);
        setField(term29687, term29687.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term29687, term29687.getClass(), "lastGeneration", true);
        setField(term29687, term29687.getClass(), "templateTypeName", "YfgYGgzYER");
        setField(term29744, term29744.getClass(), "name", "IDClvDZuqE");
        setField(term29744, term29744.getClass(), "referencedType", null);
        setBooleanField(term29744, term29744.getClass(), "visited", true);
        setField(term29759, term29759.getClass(), "baseType", null);
        setField(term29759, term29759.getClass(), "implementedInterfaces", null);
        setField(term29759, term29759.getClass(), "parameters", null);
        setField(term29759, term29759.getClass(), "thrownTypes", null);
        setField(term29759, term29759.getClass(), "templateTypeName", null);
        setField(term29759, term29759.getClass(), "description", null);
        setField(term29759, term29759.getClass(), "deprecated", null);
        setField(term29759, term29759.getClass(), "license", null);
        setField(term29759, term29759.getClass(), "suppressions", null);
        setField(term29758, term29758.getClass(), "info", term29759);
        setField(term29760, term29760.getClass(), "markers", null);
        setField(term29760, term29760.getClass(), "parameters", null);
        setField(term29760, term29760.getClass(), "throwsDescriptions", null);
        setField(term29760, term29760.getClass(), "blockDescription", null);
        setField(term29760, term29760.getClass(), "fileOverview", null);
        setField(term29760, term29760.getClass(), "returnDescription", null);
        setField(term29760, term29760.getClass(), "version", null);
        setField(term29760, term29760.getClass(), "authors", null);
        setField(term29760, term29760.getClass(), "sees", null);
        setField(term29758, term29758.getClass(), "documentation", term29760);
        setField(term29758, term29758.getClass(), "sourceName", "");
        setField(term29758, term29758.getClass(), "visibility", enum217);
        setIntField(term29758, term29758.getClass(), "bitset", 1633913667);
        setField(term29765, term29765.getClass(), "root", null);
        setField(term29765, term29765.getClass(), "sourceName", null);
        setField(term29765, term29765.getClass(), "registry", null);
        setField(term29758, term29758.getClass(), "type", term29765);
        setField(term29766, term29766.getClass(), "root", null);
        setField(term29766, term29766.getClass(), "sourceName", null);
        setField(term29766, term29766.getClass(), "registry", null);
        setField(term29758, term29758.getClass(), "thisType", term29766);
        setBooleanField(term29758, term29758.getClass(), "includeDocumentation", true);
        setField(term29744, term29744.getClass(), "docInfo", term29758);
        setBooleanField(term29744, term29744.getClass(), "unknown", true);
        setBooleanField(term29744, term29744.getClass(), "resolved", false);
        setField(term29744, term29744.getClass(), "resolveResult", null);
        setField(term29744, term29744.getClass(), "registry", null);
        setField(term29687, term29687.getClass(), "templateType", term29744);
        setField(term29637, term29637.getClass(), "typeRegistry", term29687);
        setField(term29771, term29771.getClass(), "info", null);
        setField(term29771, term29771.getClass(), "documentation", null);
        setField(term29771, term29771.getClass(), "sourceName", null);
        setField(term29771, term29771.getClass(), "visibility", null);
        setIntField(term29771, term29771.getClass(), "bitset", 0);
        setField(term29771, term29771.getClass(), "type", null);
        setField(term29771, term29771.getClass(), "thisType", null);
        setBooleanField(term29771, term29771.getClass(), "includeDocumentation", false);
        setField(term29770, term29770.getClass(), "currentInfo", term29771);
        setBooleanField(term29770, term29770.getClass(), "populated", false);
        setBooleanField(term29770, term29770.getClass(), "parseDocumentation", true);
        setField(term29776, term29776.getClass(), "annotation", null);
        setField(term29776, term29776.getClass(), "name", null);
        setField(term29776, term29776.getClass(), "description", null);
        setField(term29776, term29776.getClass(), "type", null);
        setField(term29770, term29770.getClass(), "currentMarker", term29776);
        setField(term29637, term29637.getClass(), "jsdocBuilder", term29770);
        setField(term29637, term29637.getClass(), "sourceName", "lMUBBGRjfY");
        setField(term29637, term29637.getClass(), "errorReporter", null);
        setField(term29789, term29789.getClass(), "this$0", null);
        setField(term29637, term29637.getClass(), "parser", term29789);
        setField(term29790, term29790.getClass(), "info", null);
        setField(term29790, term29790.getClass(), "documentation", null);
        setField(term29790, term29790.getClass(), "sourceName", null);
        setField(term29790, term29790.getClass(), "visibility", null);
        setIntField(term29790, term29790.getClass(), "bitset", 0);
        setField(term29790, term29790.getClass(), "type", null);
        setField(term29790, term29790.getClass(), "thisType", null);
        setBooleanField(term29790, term29790.getClass(), "includeDocumentation", false);
        setField(term29637, term29637.getClass(), "fileOverviewJSDocInfo", term29790);
        setField(term29637, term29637.getClass(), "state", enum218);
        setField(term29637, term29637.getClass(), "annotationNames", term29817);
        setField(term29828, term29828.getClass(), "this$0", null);
        setField(term29637, term29637.getClass(), "fileLevelJsDocBuilder", term29828);
        setField(term29637, term29637.getClass(), "unreadToken", null);
        Class<? extends Object> term319768 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term319767 = ((Class) term319768).getDeclaredField((String) "ANNOTATION");
        ((Field) term319767).setAccessible(true);
        enum219 = ((Field) term319767).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum219;
        try {
            callMethod(klass, "parseParametersType", argTypes, term29637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


