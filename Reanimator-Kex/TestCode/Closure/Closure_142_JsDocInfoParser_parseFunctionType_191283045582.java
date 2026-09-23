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

public class JsDocInfoParser_parseFunctionType_191283045582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28502;
     Object enum216;

    public JsDocInfoParser_parseFunctionType_191283045582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28551 = new HashMap();
        HashMap term28560 = new HashMap();
        Set<Object> term317484 =  ((Map) term28560).keySet();
        HashSet term28559 = new HashSet((Collection<? extends Object>) term317484);
        HashMap term28567 = new HashMap();
        Set<Object> term317485 =  ((Map) term28567).keySet();
        HashSet term28566 = new HashSet((Collection<? extends Object>) term317485);
        HashMap term28574 = new HashMap();
        Set<Object> term317486 =  ((Map) term28574).keySet();
        HashSet term28573 = new HashSet((Collection<? extends Object>) term317486);
        HashMap term28580 = new HashMap();
        HashMap term28585 = new HashMap();
        Class<? extends Object> term317508 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term317507 = ((Class) term317508).getDeclaredField((String) "PRIVATE");
        ((Field) term317507).setAccessible(true);
        Object enum214 = ((Field) term317507).get((Object) null);
        Class<? extends Object> term317786 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term317785 = ((Class) term317786).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term317785).setAccessible(true);
        Object enum215 = ((Field) term317785).get((Object) null);
        HashMap term28679 = new HashMap();
        term28502 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term28503 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term28516 = (char[]) newCharArray(0);
        int[] term28518 = (int[]) newIntArray(5);
        Object term28549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term28550 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term28606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term28620 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term28621 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term28622 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term28627 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term28628 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term28632 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term28633 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term28638 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term28651 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term28652 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term28690 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term28503, term28503.getClass(), "string", "aOIvTQtXiv");
        setField(term28503, term28503.getClass(), "stringBuffer", term28516);
        setIntField(term28503, term28503.getClass(), "stringBufferTop", -1945635750);
        setIntElement(term28518, 0, -1622760744);
        setIntElement(term28518, 1, 2068435279);
        setIntElement(term28518, 2, -1556527718);
        setIntElement(term28518, 3, 895255351);
        setIntElement(term28518, 4, -1317044799);
        setField(term28503, term28503.getClass(), "ungetBuffer", term28518);
        setIntField(term28503, term28503.getClass(), "ungetCursor", -1428063820);
        setBooleanField(term28503, term28503.getClass(), "hitEOF", true);
        setIntField(term28503, term28503.getClass(), "lineStart", -1271375703);
        setIntField(term28503, term28503.getClass(), "lineEndChar", 1136208236);
        setIntField(term28503, term28503.getClass(), "lineno", -1220630391);
        setIntField(term28503, term28503.getClass(), "charno", -995822131);
        setIntField(term28503, term28503.getClass(), "initCharno", -687282231);
        setIntField(term28503, term28503.getClass(), "initLineno", 1200440315);
        setField(term28503, term28503.getClass(), "sourceString", "IyjDiknqhA");
        setIntField(term28503, term28503.getClass(), "sourceEnd", 40571662);
        setIntField(term28503, term28503.getClass(), "sourceCursor", 1863910269);
        setIntField(term28503, term28503.getClass(), "cursor", 864645689);
        setIntField(term28503, term28503.getClass(), "tokenBeg", 279384872);
        setIntField(term28503, term28503.getClass(), "tokenEnd", 1427305953);
        setField(term28502, term28502.getClass(), "stream", term28503);
        setField(term28549, term28549.getClass(), "reporter", null);
        setField(term28549, term28549.getClass(), "nativeTypes", term28550);
        setField(term28549, term28549.getClass(), "namesToTypes", term28551);
        setField(term28549, term28549.getClass(), "namespaces", term28559);
        setField(term28549, term28549.getClass(), "enumTypeNames", term28566);
        setField(term28549, term28549.getClass(), "forwardDeclaredTypes", term28573);
        setField(term28549, term28549.getClass(), "typesIndexedByProperty", term28580);
        setField(term28549, term28549.getClass(), "greatestSubtypeByProperty", term28585);
        setField(term28549, term28549.getClass(), "interfaceToImplementors", null);
        setField(term28549, term28549.getClass(), "unresolvedNamedTypes", null);
        setField(term28549, term28549.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term28549, term28549.getClass(), "lastGeneration", false);
        setField(term28549, term28549.getClass(), "templateTypeName", "ceGeARYMoa");
        setField(term28606, term28606.getClass(), "name", "fFWllaiFvh");
        setField(term28606, term28606.getClass(), "referencedType", null);
        setBooleanField(term28606, term28606.getClass(), "visited", false);
        setField(term28621, term28621.getClass(), "baseType", null);
        setField(term28621, term28621.getClass(), "implementedInterfaces", null);
        setField(term28621, term28621.getClass(), "parameters", null);
        setField(term28621, term28621.getClass(), "thrownTypes", null);
        setField(term28621, term28621.getClass(), "templateTypeName", null);
        setField(term28621, term28621.getClass(), "description", null);
        setField(term28621, term28621.getClass(), "deprecated", null);
        setField(term28621, term28621.getClass(), "license", null);
        setField(term28621, term28621.getClass(), "suppressions", null);
        setField(term28620, term28620.getClass(), "info", term28621);
        setField(term28622, term28622.getClass(), "markers", null);
        setField(term28622, term28622.getClass(), "parameters", null);
        setField(term28622, term28622.getClass(), "throwsDescriptions", null);
        setField(term28622, term28622.getClass(), "blockDescription", null);
        setField(term28622, term28622.getClass(), "fileOverview", null);
        setField(term28622, term28622.getClass(), "returnDescription", null);
        setField(term28622, term28622.getClass(), "version", null);
        setField(term28622, term28622.getClass(), "authors", null);
        setField(term28622, term28622.getClass(), "sees", null);
        setField(term28620, term28620.getClass(), "documentation", term28622);
        setField(term28620, term28620.getClass(), "sourceName", "");
        setField(term28620, term28620.getClass(), "visibility", enum214);
        setIntField(term28620, term28620.getClass(), "bitset", -781832877);
        setField(term28627, term28627.getClass(), "root", null);
        setField(term28627, term28627.getClass(), "sourceName", null);
        setField(term28627, term28627.getClass(), "registry", null);
        setField(term28620, term28620.getClass(), "type", term28627);
        setField(term28628, term28628.getClass(), "root", null);
        setField(term28628, term28628.getClass(), "sourceName", null);
        setField(term28628, term28628.getClass(), "registry", null);
        setField(term28620, term28620.getClass(), "thisType", term28628);
        setBooleanField(term28620, term28620.getClass(), "includeDocumentation", true);
        setField(term28606, term28606.getClass(), "docInfo", term28620);
        setBooleanField(term28606, term28606.getClass(), "unknown", true);
        setBooleanField(term28606, term28606.getClass(), "resolved", false);
        setField(term28606, term28606.getClass(), "resolveResult", null);
        setField(term28606, term28606.getClass(), "registry", null);
        setField(term28549, term28549.getClass(), "templateType", term28606);
        setField(term28502, term28502.getClass(), "typeRegistry", term28549);
        setField(term28633, term28633.getClass(), "info", null);
        setField(term28633, term28633.getClass(), "documentation", null);
        setField(term28633, term28633.getClass(), "sourceName", null);
        setField(term28633, term28633.getClass(), "visibility", null);
        setIntField(term28633, term28633.getClass(), "bitset", 0);
        setField(term28633, term28633.getClass(), "type", null);
        setField(term28633, term28633.getClass(), "thisType", null);
        setBooleanField(term28633, term28633.getClass(), "includeDocumentation", false);
        setField(term28632, term28632.getClass(), "currentInfo", term28633);
        setBooleanField(term28632, term28632.getClass(), "populated", false);
        setBooleanField(term28632, term28632.getClass(), "parseDocumentation", false);
        setField(term28638, term28638.getClass(), "annotation", null);
        setField(term28638, term28638.getClass(), "name", null);
        setField(term28638, term28638.getClass(), "description", null);
        setField(term28638, term28638.getClass(), "type", null);
        setField(term28632, term28632.getClass(), "currentMarker", term28638);
        setField(term28502, term28502.getClass(), "jsdocBuilder", term28632);
        setField(term28502, term28502.getClass(), "sourceName", "YEkxWsWaUl");
        setField(term28502, term28502.getClass(), "errorReporter", null);
        setField(term28651, term28651.getClass(), "this$0", null);
        setField(term28502, term28502.getClass(), "parser", term28651);
        setField(term28652, term28652.getClass(), "info", null);
        setField(term28652, term28652.getClass(), "documentation", null);
        setField(term28652, term28652.getClass(), "sourceName", null);
        setField(term28652, term28652.getClass(), "visibility", null);
        setIntField(term28652, term28652.getClass(), "bitset", 0);
        setField(term28652, term28652.getClass(), "type", null);
        setField(term28652, term28652.getClass(), "thisType", null);
        setBooleanField(term28652, term28652.getClass(), "includeDocumentation", false);
        setField(term28502, term28502.getClass(), "fileOverviewJSDocInfo", term28652);
        setField(term28502, term28502.getClass(), "state", enum215);
        setField(term28502, term28502.getClass(), "annotationNames", term28679);
        setField(term28690, term28690.getClass(), "this$0", null);
        setField(term28502, term28502.getClass(), "fileLevelJsDocBuilder", term28690);
        setField(term28502, term28502.getClass(), "unreadToken", null);
        Class<? extends Object> term318143 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term318142 = ((Class) term318143).getDeclaredField((String) "QMARK");
        ((Field) term318142).setAccessible(true);
        enum216 = ((Field) term318142).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum216;
        try {
            callMethod(klass, "parseFunctionType", argTypes, term28502, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


