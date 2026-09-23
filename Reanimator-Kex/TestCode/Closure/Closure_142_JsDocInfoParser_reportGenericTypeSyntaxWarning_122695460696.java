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

public class JsDocInfoParser_reportGenericTypeSyntaxWarning_122695460696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43441;

    public JsDocInfoParser_reportGenericTypeSyntaxWarning_122695460696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43495 = new HashMap();
        HashMap term43504 = new HashMap();
        Set<Object> term335001 =  ((Map) term43504).keySet();
        HashSet term43503 = new HashSet((Collection<? extends Object>) term335001);
        HashMap term43511 = new HashMap();
        Set<Object> term335002 =  ((Map) term43511).keySet();
        HashSet term43510 = new HashSet((Collection<? extends Object>) term335002);
        HashMap term43517 = new HashMap();
        Set<Object> term335003 =  ((Map) term43517).keySet();
        HashSet term43516 = new HashSet((Collection<? extends Object>) term335003);
        HashMap term43523 = new HashMap();
        HashMap term43528 = new HashMap();
        Class<? extends Object> term335025 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term335024 = ((Class) term335025).getDeclaredField((String) "PROTECTED");
        ((Field) term335024).setAccessible(true);
        Object enum252 = ((Field) term335024).get((Object) null);
        Class<? extends Object> term335309 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term335308 = ((Class) term335309).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term335308).setAccessible(true);
        Object enum253 = ((Field) term335308).get((Object) null);
        HashMap term43621 = new HashMap();
        term43441 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term43442 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term43455 = (char[]) newCharArray(3);
        int[] term43460 = (int[]) newIntArray(7);
        Object term43493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term43494 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term43549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term43563 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term43564 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term43565 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term43570 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term43574 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term43575 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term43580 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term43593 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term43594 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term43632 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term43442, term43442.getClass(), "string", "EuAshkmbna");
        setCharElement(term43455, 0, 'R');
        setCharElement(term43455, 1, 'H');
        setCharElement(term43455, 2, 'y');
        setField(term43442, term43442.getClass(), "stringBuffer", term43455);
        setIntField(term43442, term43442.getClass(), "stringBufferTop", 848428785);
        setIntElement(term43460, 0, -1984436481);
        setIntElement(term43460, 1, -407582855);
        setIntElement(term43460, 2, 1190753616);
        setIntElement(term43460, 3, -752378450);
        setIntElement(term43460, 4, 848907965);
        setIntElement(term43460, 5, 1865070548);
        setIntElement(term43460, 6, 1904515443);
        setField(term43442, term43442.getClass(), "ungetBuffer", term43460);
        setIntField(term43442, term43442.getClass(), "ungetCursor", 1361126430);
        setBooleanField(term43442, term43442.getClass(), "hitEOF", true);
        setIntField(term43442, term43442.getClass(), "lineStart", 1728588701);
        setIntField(term43442, term43442.getClass(), "lineEndChar", -355769268);
        setIntField(term43442, term43442.getClass(), "lineno", -114460662);
        setIntField(term43442, term43442.getClass(), "charno", -355376034);
        setIntField(term43442, term43442.getClass(), "initCharno", 588390599);
        setIntField(term43442, term43442.getClass(), "initLineno", -95969566);
        setField(term43442, term43442.getClass(), "sourceString", "JwQlbBbGJR");
        setIntField(term43442, term43442.getClass(), "sourceEnd", -68615285);
        setIntField(term43442, term43442.getClass(), "sourceCursor", -337504086);
        setIntField(term43442, term43442.getClass(), "cursor", 2074130991);
        setIntField(term43442, term43442.getClass(), "tokenBeg", 532588266);
        setIntField(term43442, term43442.getClass(), "tokenEnd", -1286686332);
        setField(term43441, term43441.getClass(), "stream", term43442);
        setField(term43493, term43493.getClass(), "reporter", null);
        setField(term43493, term43493.getClass(), "nativeTypes", term43494);
        setField(term43493, term43493.getClass(), "namesToTypes", term43495);
        setField(term43493, term43493.getClass(), "namespaces", term43503);
        setField(term43493, term43493.getClass(), "enumTypeNames", term43510);
        setField(term43493, term43493.getClass(), "forwardDeclaredTypes", term43516);
        setField(term43493, term43493.getClass(), "typesIndexedByProperty", term43523);
        setField(term43493, term43493.getClass(), "greatestSubtypeByProperty", term43528);
        setField(term43493, term43493.getClass(), "interfaceToImplementors", null);
        setField(term43493, term43493.getClass(), "unresolvedNamedTypes", null);
        setField(term43493, term43493.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term43493, term43493.getClass(), "lastGeneration", true);
        setField(term43493, term43493.getClass(), "templateTypeName", "IwgPFurObw");
        setField(term43549, term43549.getClass(), "name", "WLaHlrYQyz");
        setField(term43549, term43549.getClass(), "referencedType", null);
        setBooleanField(term43549, term43549.getClass(), "visited", false);
        setField(term43564, term43564.getClass(), "baseType", null);
        setField(term43564, term43564.getClass(), "implementedInterfaces", null);
        setField(term43564, term43564.getClass(), "parameters", null);
        setField(term43564, term43564.getClass(), "thrownTypes", null);
        setField(term43564, term43564.getClass(), "templateTypeName", null);
        setField(term43564, term43564.getClass(), "description", null);
        setField(term43564, term43564.getClass(), "deprecated", null);
        setField(term43564, term43564.getClass(), "license", null);
        setField(term43564, term43564.getClass(), "suppressions", null);
        setField(term43563, term43563.getClass(), "info", term43564);
        setField(term43565, term43565.getClass(), "markers", null);
        setField(term43565, term43565.getClass(), "parameters", null);
        setField(term43565, term43565.getClass(), "throwsDescriptions", null);
        setField(term43565, term43565.getClass(), "blockDescription", null);
        setField(term43565, term43565.getClass(), "fileOverview", null);
        setField(term43565, term43565.getClass(), "returnDescription", null);
        setField(term43565, term43565.getClass(), "version", null);
        setField(term43565, term43565.getClass(), "authors", null);
        setField(term43565, term43565.getClass(), "sees", null);
        setField(term43563, term43563.getClass(), "documentation", term43565);
        setField(term43563, term43563.getClass(), "sourceName", "");
        setField(term43563, term43563.getClass(), "visibility", enum252);
        setIntField(term43563, term43563.getClass(), "bitset", -284885486);
        setField(term43570, term43570.getClass(), "root", null);
        setField(term43570, term43570.getClass(), "sourceName", null);
        setField(term43570, term43570.getClass(), "registry", null);
        setField(term43563, term43563.getClass(), "type", term43570);
        setField(term43563, term43563.getClass(), "thisType", term43570);
        setBooleanField(term43563, term43563.getClass(), "includeDocumentation", true);
        setField(term43549, term43549.getClass(), "docInfo", term43563);
        setBooleanField(term43549, term43549.getClass(), "unknown", true);
        setBooleanField(term43549, term43549.getClass(), "resolved", false);
        setField(term43549, term43549.getClass(), "resolveResult", null);
        setField(term43549, term43549.getClass(), "registry", null);
        setField(term43493, term43493.getClass(), "templateType", term43549);
        setField(term43441, term43441.getClass(), "typeRegistry", term43493);
        setField(term43575, term43575.getClass(), "info", null);
        setField(term43575, term43575.getClass(), "documentation", null);
        setField(term43575, term43575.getClass(), "sourceName", null);
        setField(term43575, term43575.getClass(), "visibility", null);
        setIntField(term43575, term43575.getClass(), "bitset", 0);
        setField(term43575, term43575.getClass(), "type", null);
        setField(term43575, term43575.getClass(), "thisType", null);
        setBooleanField(term43575, term43575.getClass(), "includeDocumentation", false);
        setField(term43574, term43574.getClass(), "currentInfo", term43575);
        setBooleanField(term43574, term43574.getClass(), "populated", true);
        setBooleanField(term43574, term43574.getClass(), "parseDocumentation", true);
        setField(term43580, term43580.getClass(), "annotation", null);
        setField(term43580, term43580.getClass(), "name", null);
        setField(term43580, term43580.getClass(), "description", null);
        setField(term43580, term43580.getClass(), "type", null);
        setField(term43574, term43574.getClass(), "currentMarker", term43580);
        setField(term43441, term43441.getClass(), "jsdocBuilder", term43574);
        setField(term43441, term43441.getClass(), "sourceName", "NUUjAyqOva");
        setField(term43441, term43441.getClass(), "errorReporter", null);
        setField(term43593, term43593.getClass(), "this$0", null);
        setField(term43441, term43441.getClass(), "parser", term43593);
        setField(term43594, term43594.getClass(), "info", null);
        setField(term43594, term43594.getClass(), "documentation", null);
        setField(term43594, term43594.getClass(), "sourceName", null);
        setField(term43594, term43594.getClass(), "visibility", null);
        setIntField(term43594, term43594.getClass(), "bitset", 0);
        setField(term43594, term43594.getClass(), "type", null);
        setField(term43594, term43594.getClass(), "thisType", null);
        setBooleanField(term43594, term43594.getClass(), "includeDocumentation", false);
        setField(term43441, term43441.getClass(), "fileOverviewJSDocInfo", term43594);
        setField(term43441, term43441.getClass(), "state", enum253);
        setField(term43441, term43441.getClass(), "annotationNames", term43621);
        setField(term43632, term43632.getClass(), "this$0", null);
        setField(term43441, term43441.getClass(), "fileLevelJsDocBuilder", term43632);
        setField(term43441, term43441.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reportGenericTypeSyntaxWarning", argTypes, term43441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


