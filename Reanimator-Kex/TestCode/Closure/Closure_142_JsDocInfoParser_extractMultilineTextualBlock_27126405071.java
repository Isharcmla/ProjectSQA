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

public class JsDocInfoParser_extractMultilineTextualBlock_27126405071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16683;
     Object enum185;
     Object enum186;

    public JsDocInfoParser_extractMultilineTextualBlock_27126405071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16739 = new HashMap();
        HashMap term16748 = new HashMap();
        Set<Object> term304265 =  ((Map) term16748).keySet();
        HashSet term16747 = new HashSet((Collection<? extends Object>) term304265);
        HashMap term16755 = new HashMap();
        Set<Object> term304266 =  ((Map) term16755).keySet();
        HashSet term16754 = new HashSet((Collection<? extends Object>) term304266);
        HashMap term16761 = new HashMap();
        Set<Object> term304267 =  ((Map) term16761).keySet();
        HashSet term16760 = new HashSet((Collection<? extends Object>) term304267);
        HashMap term16767 = new HashMap();
        HashMap term16772 = new HashMap();
        Class<? extends Object> term304289 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term304288 = ((Class) term304289).getDeclaredField((String) "PUBLIC");
        ((Field) term304288).setAccessible(true);
        Object enum183 = ((Field) term304288).get((Object) null);
        Class<? extends Object> term304564 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term304563 = ((Class) term304564).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term304563).setAccessible(true);
        Object enum184 = ((Field) term304563).get((Object) null);
        HashMap term16863 = new HashMap();
        term16683 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term16684 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term16697 = (char[]) newCharArray(7);
        int[] term16706 = (int[]) newIntArray(5);
        Object term16737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term16738 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term16793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term16807 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16808 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term16809 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term16814 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16815 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16819 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term16820 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16825 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term16838 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term16839 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16874 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term16684, term16684.getClass(), "string", "XMHwbfiHRl");
        setCharElement(term16697, 0, 'K');
        setCharElement(term16697, 1, 'T');
        setCharElement(term16697, 2, 'N');
        setCharElement(term16697, 3, 'F');
        setCharElement(term16697, 4, 'h');
        setCharElement(term16697, 5, 'R');
        setCharElement(term16697, 6, 'N');
        setField(term16684, term16684.getClass(), "stringBuffer", term16697);
        setIntField(term16684, term16684.getClass(), "stringBufferTop", 1922684808);
        setIntElement(term16706, 0, -2005784375);
        setIntElement(term16706, 1, -288604325);
        setIntElement(term16706, 2, -1268314569);
        setIntElement(term16706, 3, 877649659);
        setIntElement(term16706, 4, -1332748804);
        setField(term16684, term16684.getClass(), "ungetBuffer", term16706);
        setIntField(term16684, term16684.getClass(), "ungetCursor", 1774507971);
        setBooleanField(term16684, term16684.getClass(), "hitEOF", true);
        setIntField(term16684, term16684.getClass(), "lineStart", -1420269858);
        setIntField(term16684, term16684.getClass(), "lineEndChar", -2119545015);
        setIntField(term16684, term16684.getClass(), "lineno", 1272542218);
        setIntField(term16684, term16684.getClass(), "charno", 1209799204);
        setIntField(term16684, term16684.getClass(), "initCharno", 1094107751);
        setIntField(term16684, term16684.getClass(), "initLineno", 844222656);
        setField(term16684, term16684.getClass(), "sourceString", "bucTnYicnp");
        setIntField(term16684, term16684.getClass(), "sourceEnd", -18216811);
        setIntField(term16684, term16684.getClass(), "sourceCursor", -1813280137);
        setIntField(term16684, term16684.getClass(), "cursor", 719656595);
        setIntField(term16684, term16684.getClass(), "tokenBeg", -1516995753);
        setIntField(term16684, term16684.getClass(), "tokenEnd", -390501023);
        setField(term16683, term16683.getClass(), "stream", term16684);
        setField(term16737, term16737.getClass(), "reporter", null);
        setField(term16737, term16737.getClass(), "nativeTypes", term16738);
        setField(term16737, term16737.getClass(), "namesToTypes", term16739);
        setField(term16737, term16737.getClass(), "namespaces", term16747);
        setField(term16737, term16737.getClass(), "enumTypeNames", term16754);
        setField(term16737, term16737.getClass(), "forwardDeclaredTypes", term16760);
        setField(term16737, term16737.getClass(), "typesIndexedByProperty", term16767);
        setField(term16737, term16737.getClass(), "greatestSubtypeByProperty", term16772);
        setField(term16737, term16737.getClass(), "interfaceToImplementors", null);
        setField(term16737, term16737.getClass(), "unresolvedNamedTypes", null);
        setField(term16737, term16737.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16737, term16737.getClass(), "lastGeneration", false);
        setField(term16737, term16737.getClass(), "templateTypeName", "EWFbEDAVrE");
        setField(term16793, term16793.getClass(), "name", "EMiMtYgfvr");
        setField(term16793, term16793.getClass(), "referencedType", null);
        setBooleanField(term16793, term16793.getClass(), "visited", true);
        setField(term16808, term16808.getClass(), "baseType", null);
        setField(term16808, term16808.getClass(), "implementedInterfaces", null);
        setField(term16808, term16808.getClass(), "parameters", null);
        setField(term16808, term16808.getClass(), "thrownTypes", null);
        setField(term16808, term16808.getClass(), "templateTypeName", null);
        setField(term16808, term16808.getClass(), "description", null);
        setField(term16808, term16808.getClass(), "deprecated", null);
        setField(term16808, term16808.getClass(), "license", null);
        setField(term16808, term16808.getClass(), "suppressions", null);
        setField(term16807, term16807.getClass(), "info", term16808);
        setField(term16809, term16809.getClass(), "markers", null);
        setField(term16809, term16809.getClass(), "parameters", null);
        setField(term16809, term16809.getClass(), "throwsDescriptions", null);
        setField(term16809, term16809.getClass(), "blockDescription", null);
        setField(term16809, term16809.getClass(), "fileOverview", null);
        setField(term16809, term16809.getClass(), "returnDescription", null);
        setField(term16809, term16809.getClass(), "version", null);
        setField(term16809, term16809.getClass(), "authors", null);
        setField(term16809, term16809.getClass(), "sees", null);
        setField(term16807, term16807.getClass(), "documentation", term16809);
        setField(term16807, term16807.getClass(), "sourceName", "");
        setField(term16807, term16807.getClass(), "visibility", enum183);
        setIntField(term16807, term16807.getClass(), "bitset", -1667482829);
        setField(term16814, term16814.getClass(), "root", null);
        setField(term16814, term16814.getClass(), "sourceName", null);
        setField(term16814, term16814.getClass(), "registry", null);
        setField(term16807, term16807.getClass(), "type", term16814);
        setField(term16815, term16815.getClass(), "root", null);
        setField(term16815, term16815.getClass(), "sourceName", null);
        setField(term16815, term16815.getClass(), "registry", null);
        setField(term16807, term16807.getClass(), "thisType", term16815);
        setBooleanField(term16807, term16807.getClass(), "includeDocumentation", false);
        setField(term16793, term16793.getClass(), "docInfo", term16807);
        setBooleanField(term16793, term16793.getClass(), "unknown", false);
        setBooleanField(term16793, term16793.getClass(), "resolved", true);
        setField(term16793, term16793.getClass(), "resolveResult", null);
        setField(term16793, term16793.getClass(), "registry", null);
        setField(term16737, term16737.getClass(), "templateType", term16793);
        setField(term16683, term16683.getClass(), "typeRegistry", term16737);
        setField(term16820, term16820.getClass(), "info", null);
        setField(term16820, term16820.getClass(), "documentation", null);
        setField(term16820, term16820.getClass(), "sourceName", null);
        setField(term16820, term16820.getClass(), "visibility", null);
        setIntField(term16820, term16820.getClass(), "bitset", 0);
        setField(term16820, term16820.getClass(), "type", null);
        setField(term16820, term16820.getClass(), "thisType", null);
        setBooleanField(term16820, term16820.getClass(), "includeDocumentation", false);
        setField(term16819, term16819.getClass(), "currentInfo", term16820);
        setBooleanField(term16819, term16819.getClass(), "populated", true);
        setBooleanField(term16819, term16819.getClass(), "parseDocumentation", true);
        setField(term16825, term16825.getClass(), "annotation", null);
        setField(term16825, term16825.getClass(), "name", null);
        setField(term16825, term16825.getClass(), "description", null);
        setField(term16825, term16825.getClass(), "type", null);
        setField(term16819, term16819.getClass(), "currentMarker", term16825);
        setField(term16683, term16683.getClass(), "jsdocBuilder", term16819);
        setField(term16683, term16683.getClass(), "sourceName", "uWqXrwAsDU");
        setField(term16683, term16683.getClass(), "errorReporter", null);
        setField(term16838, term16838.getClass(), "this$0", null);
        setField(term16683, term16683.getClass(), "parser", term16838);
        setField(term16839, term16839.getClass(), "info", null);
        setField(term16839, term16839.getClass(), "documentation", null);
        setField(term16839, term16839.getClass(), "sourceName", null);
        setField(term16839, term16839.getClass(), "visibility", null);
        setIntField(term16839, term16839.getClass(), "bitset", 0);
        setField(term16839, term16839.getClass(), "type", null);
        setField(term16839, term16839.getClass(), "thisType", null);
        setBooleanField(term16839, term16839.getClass(), "includeDocumentation", false);
        setField(term16683, term16683.getClass(), "fileOverviewJSDocInfo", term16839);
        setField(term16683, term16683.getClass(), "state", enum184);
        setField(term16683, term16683.getClass(), "annotationNames", term16863);
        setField(term16874, term16874.getClass(), "this$0", null);
        setField(term16683, term16683.getClass(), "fileLevelJsDocBuilder", term16874);
        setField(term16683, term16683.getClass(), "unreadToken", null);
        Class<? extends Object> term304912 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term304911 = ((Class) term304912).getDeclaredField((String) "LP");
        ((Field) term304911).setAccessible(true);
        enum185 = ((Field) term304911).get((Object) null);
        Class<? extends Object> term305160 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption");
        Field term305159 = ((Class) term305160).getDeclaredField((String) "TRIM");
        ((Field) term305159).setAccessible(true);
        enum186 = ((Field) term305159).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption");
        Object[] args = new Object[2];
        args[0] = enum185;
        args[1] = enum186;
        try {
            callMethod(klass, "extractMultilineTextualBlock", argTypes, term16683, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


