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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_toString_177164964467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12625;
     Object enum173;

    public JsDocInfoParser_toString_177164964467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12673 = new HashMap();
        HashMap term12682 = new HashMap();
        Set<Object> term299084 =  ((Map) term12682).keySet();
        HashSet term12681 = new HashSet((Collection<? extends Object>) term299084);
        HashMap term12689 = new HashMap();
        Set<Object> term299085 =  ((Map) term12689).keySet();
        HashSet term12688 = new HashSet((Collection<? extends Object>) term299085);
        HashMap term12696 = new HashMap();
        Set<Object> term299086 =  ((Map) term12696).keySet();
        HashSet term12695 = new HashSet((Collection<? extends Object>) term299086);
        HashMap term12702 = new HashMap();
        HashMap term12707 = new HashMap();
        Class<? extends Object> term299108 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term299107 = ((Class) term299108).getDeclaredField((String) "PUBLIC");
        ((Field) term299107).setAccessible(true);
        Object enum171 = ((Field) term299107).get((Object) null);
        Class<? extends Object> term299383 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term299382 = ((Class) term299383).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term299382).setAccessible(true);
        Object enum172 = ((Field) term299382).get((Object) null);
        HashMap term12801 = new HashMap();
        term12625 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term12626 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term12639 = (char[]) newCharArray(3);
        int[] term12644 = (int[]) newIntArray(1);
        Object term12671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12672 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term12728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12742 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12743 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12744 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12749 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12750 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12754 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term12755 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12760 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term12773 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term12774 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12812 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term12626, term12626.getClass(), "string", "FlHzxEfFzI");
        setCharElement(term12639, 0, 'b');
        setCharElement(term12639, 1, 'S');
        setCharElement(term12639, 2, 'z');
        setField(term12626, term12626.getClass(), "stringBuffer", term12639);
        setIntField(term12626, term12626.getClass(), "stringBufferTop", 1935707624);
        setIntElement(term12644, 0, 1507074215);
        setField(term12626, term12626.getClass(), "ungetBuffer", term12644);
        setIntField(term12626, term12626.getClass(), "ungetCursor", -282881827);
        setBooleanField(term12626, term12626.getClass(), "hitEOF", true);
        setIntField(term12626, term12626.getClass(), "lineStart", -1183353915);
        setIntField(term12626, term12626.getClass(), "lineEndChar", -420030135);
        setIntField(term12626, term12626.getClass(), "lineno", 267763294);
        setIntField(term12626, term12626.getClass(), "charno", -1497710478);
        setIntField(term12626, term12626.getClass(), "initCharno", 49950830);
        setIntField(term12626, term12626.getClass(), "initLineno", -525257914);
        setField(term12626, term12626.getClass(), "sourceString", "aSATgQUpoe");
        setIntField(term12626, term12626.getClass(), "sourceEnd", 147209682);
        setIntField(term12626, term12626.getClass(), "sourceCursor", 34470066);
        setIntField(term12626, term12626.getClass(), "cursor", 2058711405);
        setIntField(term12626, term12626.getClass(), "tokenBeg", 1743683601);
        setIntField(term12626, term12626.getClass(), "tokenEnd", -945116798);
        setField(term12625, term12625.getClass(), "stream", term12626);
        setField(term12671, term12671.getClass(), "reporter", null);
        setField(term12671, term12671.getClass(), "nativeTypes", term12672);
        setField(term12671, term12671.getClass(), "namesToTypes", term12673);
        setField(term12671, term12671.getClass(), "namespaces", term12681);
        setField(term12671, term12671.getClass(), "enumTypeNames", term12688);
        setField(term12671, term12671.getClass(), "forwardDeclaredTypes", term12695);
        setField(term12671, term12671.getClass(), "typesIndexedByProperty", term12702);
        setField(term12671, term12671.getClass(), "greatestSubtypeByProperty", term12707);
        setField(term12671, term12671.getClass(), "interfaceToImplementors", null);
        setField(term12671, term12671.getClass(), "unresolvedNamedTypes", null);
        setField(term12671, term12671.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12671, term12671.getClass(), "lastGeneration", false);
        setField(term12671, term12671.getClass(), "templateTypeName", "UuYWMTqWTV");
        setField(term12728, term12728.getClass(), "name", "DSFGlcaXUb");
        setField(term12728, term12728.getClass(), "referencedType", null);
        setBooleanField(term12728, term12728.getClass(), "visited", false);
        setField(term12743, term12743.getClass(), "baseType", null);
        setField(term12743, term12743.getClass(), "implementedInterfaces", null);
        setField(term12743, term12743.getClass(), "parameters", null);
        setField(term12743, term12743.getClass(), "thrownTypes", null);
        setField(term12743, term12743.getClass(), "templateTypeName", null);
        setField(term12743, term12743.getClass(), "description", null);
        setField(term12743, term12743.getClass(), "deprecated", null);
        setField(term12743, term12743.getClass(), "license", null);
        setField(term12743, term12743.getClass(), "suppressions", null);
        setField(term12742, term12742.getClass(), "info", term12743);
        setField(term12744, term12744.getClass(), "markers", null);
        setField(term12744, term12744.getClass(), "parameters", null);
        setField(term12744, term12744.getClass(), "throwsDescriptions", null);
        setField(term12744, term12744.getClass(), "blockDescription", null);
        setField(term12744, term12744.getClass(), "fileOverview", null);
        setField(term12744, term12744.getClass(), "returnDescription", null);
        setField(term12744, term12744.getClass(), "version", null);
        setField(term12744, term12744.getClass(), "authors", null);
        setField(term12744, term12744.getClass(), "sees", null);
        setField(term12742, term12742.getClass(), "documentation", term12744);
        setField(term12742, term12742.getClass(), "sourceName", "");
        setField(term12742, term12742.getClass(), "visibility", enum171);
        setIntField(term12742, term12742.getClass(), "bitset", 1593461795);
        setField(term12749, term12749.getClass(), "root", null);
        setField(term12749, term12749.getClass(), "sourceName", null);
        setField(term12749, term12749.getClass(), "registry", null);
        setField(term12742, term12742.getClass(), "type", term12749);
        setField(term12750, term12750.getClass(), "root", null);
        setField(term12750, term12750.getClass(), "sourceName", null);
        setField(term12750, term12750.getClass(), "registry", null);
        setField(term12742, term12742.getClass(), "thisType", term12750);
        setBooleanField(term12742, term12742.getClass(), "includeDocumentation", true);
        setField(term12728, term12728.getClass(), "docInfo", term12742);
        setBooleanField(term12728, term12728.getClass(), "unknown", true);
        setBooleanField(term12728, term12728.getClass(), "resolved", true);
        setField(term12728, term12728.getClass(), "resolveResult", null);
        setField(term12728, term12728.getClass(), "registry", null);
        setField(term12671, term12671.getClass(), "templateType", term12728);
        setField(term12625, term12625.getClass(), "typeRegistry", term12671);
        setField(term12755, term12755.getClass(), "info", null);
        setField(term12755, term12755.getClass(), "documentation", null);
        setField(term12755, term12755.getClass(), "sourceName", null);
        setField(term12755, term12755.getClass(), "visibility", null);
        setIntField(term12755, term12755.getClass(), "bitset", 0);
        setField(term12755, term12755.getClass(), "type", null);
        setField(term12755, term12755.getClass(), "thisType", null);
        setBooleanField(term12755, term12755.getClass(), "includeDocumentation", false);
        setField(term12754, term12754.getClass(), "currentInfo", term12755);
        setBooleanField(term12754, term12754.getClass(), "populated", false);
        setBooleanField(term12754, term12754.getClass(), "parseDocumentation", true);
        setField(term12760, term12760.getClass(), "annotation", null);
        setField(term12760, term12760.getClass(), "name", null);
        setField(term12760, term12760.getClass(), "description", null);
        setField(term12760, term12760.getClass(), "type", null);
        setField(term12754, term12754.getClass(), "currentMarker", term12760);
        setField(term12625, term12625.getClass(), "jsdocBuilder", term12754);
        setField(term12625, term12625.getClass(), "sourceName", "hIYsRyOZxk");
        setField(term12625, term12625.getClass(), "errorReporter", null);
        setField(term12773, term12773.getClass(), "this$0", null);
        setField(term12625, term12625.getClass(), "parser", term12773);
        setField(term12774, term12774.getClass(), "info", null);
        setField(term12774, term12774.getClass(), "documentation", null);
        setField(term12774, term12774.getClass(), "sourceName", null);
        setField(term12774, term12774.getClass(), "visibility", null);
        setIntField(term12774, term12774.getClass(), "bitset", 0);
        setField(term12774, term12774.getClass(), "type", null);
        setField(term12774, term12774.getClass(), "thisType", null);
        setBooleanField(term12774, term12774.getClass(), "includeDocumentation", false);
        setField(term12625, term12625.getClass(), "fileOverviewJSDocInfo", term12774);
        setField(term12625, term12625.getClass(), "state", enum172);
        setField(term12625, term12625.getClass(), "annotationNames", term12801);
        setField(term12812, term12812.getClass(), "this$0", null);
        setField(term12625, term12625.getClass(), "fileLevelJsDocBuilder", term12812);
        setField(term12625, term12625.getClass(), "unreadToken", null);
        Class<? extends Object> term299740 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term299739 = ((Class) term299740).getDeclaredField((String) "EOL");
        ((Field) term299739).setAccessible(true);
        enum173 = ((Field) term299739).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum173;
        try {
            callMethod(klass, "toString", argTypes, term12625, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


