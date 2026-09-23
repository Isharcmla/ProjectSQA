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

public class JsDocInfoParser_parseRecordType_180723803288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35330;
     Object enum232;

    public JsDocInfoParser_parseRecordType_180723803288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term35383 = new HashMap();
        HashMap term35392 = new HashMap();
        Set<Object> term327346 =  ((Map) term35392).keySet();
        HashSet term35391 = new HashSet((Collection<? extends Object>) term327346);
        HashMap term35399 = new HashMap();
        Set<Object> term327347 =  ((Map) term35399).keySet();
        HashSet term35398 = new HashSet((Collection<? extends Object>) term327347);
        HashMap term35406 = new HashMap();
        Set<Object> term327348 =  ((Map) term35406).keySet();
        HashSet term35405 = new HashSet((Collection<? extends Object>) term327348);
        HashMap term35412 = new HashMap();
        HashMap term35417 = new HashMap();
        Class<? extends Object> term327370 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term327369 = ((Class) term327370).getDeclaredField((String) "PUBLIC");
        ((Field) term327369).setAccessible(true);
        Object enum229 = ((Field) term327369).get((Object) null);
        Class<? extends Object> term327678 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term327676 = ((Class) term327678).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term327676).setAccessible(true);
        Object enum230 = ((Field) term327676).get((Object) null);
        HashMap term35508 = new HashMap();
        term35330 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term35331 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term35344 = (char[]) newCharArray(6);
        int[] term35352 = (int[]) newIntArray(3);
        Object term35381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term35382 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term35438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term35452 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term35453 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term35454 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term35459 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term35460 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term35464 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term35465 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term35470 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term35483 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term35484 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term35519 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term35331, term35331.getClass(), "string", "sBmtvFPDso");
        setCharElement(term35344, 0, 'n');
        setCharElement(term35344, 1, 'Y');
        setCharElement(term35344, 2, 'n');
        setCharElement(term35344, 3, 'L');
        setCharElement(term35344, 4, 'W');
        setCharElement(term35344, 5, 'B');
        setField(term35331, term35331.getClass(), "stringBuffer", term35344);
        setIntField(term35331, term35331.getClass(), "stringBufferTop", -1703625118);
        setIntElement(term35352, 0, 1104108112);
        setIntElement(term35352, 1, 1648665618);
        setIntElement(term35352, 2, 633765954);
        setField(term35331, term35331.getClass(), "ungetBuffer", term35352);
        setIntField(term35331, term35331.getClass(), "ungetCursor", 269110087);
        setBooleanField(term35331, term35331.getClass(), "hitEOF", false);
        setIntField(term35331, term35331.getClass(), "lineStart", 1545119095);
        setIntField(term35331, term35331.getClass(), "lineEndChar", 1671229683);
        setIntField(term35331, term35331.getClass(), "lineno", 34167717);
        setIntField(term35331, term35331.getClass(), "charno", -514195141);
        setIntField(term35331, term35331.getClass(), "initCharno", -297946422);
        setIntField(term35331, term35331.getClass(), "initLineno", 385463636);
        setField(term35331, term35331.getClass(), "sourceString", "qsUIxrLolr");
        setIntField(term35331, term35331.getClass(), "sourceEnd", -1677599962);
        setIntField(term35331, term35331.getClass(), "sourceCursor", -1790275458);
        setIntField(term35331, term35331.getClass(), "cursor", -497534255);
        setIntField(term35331, term35331.getClass(), "tokenBeg", 1588942911);
        setIntField(term35331, term35331.getClass(), "tokenEnd", -2129828854);
        setField(term35330, term35330.getClass(), "stream", term35331);
        setField(term35381, term35381.getClass(), "reporter", null);
        setField(term35381, term35381.getClass(), "nativeTypes", term35382);
        setField(term35381, term35381.getClass(), "namesToTypes", term35383);
        setField(term35381, term35381.getClass(), "namespaces", term35391);
        setField(term35381, term35381.getClass(), "enumTypeNames", term35398);
        setField(term35381, term35381.getClass(), "forwardDeclaredTypes", term35405);
        setField(term35381, term35381.getClass(), "typesIndexedByProperty", term35412);
        setField(term35381, term35381.getClass(), "greatestSubtypeByProperty", term35417);
        setField(term35381, term35381.getClass(), "interfaceToImplementors", null);
        setField(term35381, term35381.getClass(), "unresolvedNamedTypes", null);
        setField(term35381, term35381.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term35381, term35381.getClass(), "lastGeneration", false);
        setField(term35381, term35381.getClass(), "templateTypeName", "BjJtxwsIpt");
        setField(term35438, term35438.getClass(), "name", "gUQhOyGfzF");
        setField(term35438, term35438.getClass(), "referencedType", null);
        setBooleanField(term35438, term35438.getClass(), "visited", false);
        setField(term35453, term35453.getClass(), "baseType", null);
        setField(term35453, term35453.getClass(), "implementedInterfaces", null);
        setField(term35453, term35453.getClass(), "parameters", null);
        setField(term35453, term35453.getClass(), "thrownTypes", null);
        setField(term35453, term35453.getClass(), "templateTypeName", null);
        setField(term35453, term35453.getClass(), "description", null);
        setField(term35453, term35453.getClass(), "deprecated", null);
        setField(term35453, term35453.getClass(), "license", null);
        setField(term35453, term35453.getClass(), "suppressions", null);
        setField(term35452, term35452.getClass(), "info", term35453);
        setField(term35454, term35454.getClass(), "markers", null);
        setField(term35454, term35454.getClass(), "parameters", null);
        setField(term35454, term35454.getClass(), "throwsDescriptions", null);
        setField(term35454, term35454.getClass(), "blockDescription", null);
        setField(term35454, term35454.getClass(), "fileOverview", null);
        setField(term35454, term35454.getClass(), "returnDescription", null);
        setField(term35454, term35454.getClass(), "version", null);
        setField(term35454, term35454.getClass(), "authors", null);
        setField(term35454, term35454.getClass(), "sees", null);
        setField(term35452, term35452.getClass(), "documentation", term35454);
        setField(term35452, term35452.getClass(), "sourceName", "");
        setField(term35452, term35452.getClass(), "visibility", enum229);
        setIntField(term35452, term35452.getClass(), "bitset", -47438786);
        setField(term35459, term35459.getClass(), "root", null);
        setField(term35459, term35459.getClass(), "sourceName", null);
        setField(term35459, term35459.getClass(), "registry", null);
        setField(term35452, term35452.getClass(), "type", term35459);
        setField(term35460, term35460.getClass(), "root", null);
        setField(term35460, term35460.getClass(), "sourceName", null);
        setField(term35460, term35460.getClass(), "registry", null);
        setField(term35452, term35452.getClass(), "thisType", term35460);
        setBooleanField(term35452, term35452.getClass(), "includeDocumentation", false);
        setField(term35438, term35438.getClass(), "docInfo", term35452);
        setBooleanField(term35438, term35438.getClass(), "unknown", true);
        setBooleanField(term35438, term35438.getClass(), "resolved", false);
        setField(term35438, term35438.getClass(), "resolveResult", null);
        setField(term35438, term35438.getClass(), "registry", null);
        setField(term35381, term35381.getClass(), "templateType", term35438);
        setField(term35330, term35330.getClass(), "typeRegistry", term35381);
        setField(term35465, term35465.getClass(), "info", null);
        setField(term35465, term35465.getClass(), "documentation", null);
        setField(term35465, term35465.getClass(), "sourceName", null);
        setField(term35465, term35465.getClass(), "visibility", null);
        setIntField(term35465, term35465.getClass(), "bitset", 0);
        setField(term35465, term35465.getClass(), "type", null);
        setField(term35465, term35465.getClass(), "thisType", null);
        setBooleanField(term35465, term35465.getClass(), "includeDocumentation", false);
        setField(term35464, term35464.getClass(), "currentInfo", term35465);
        setBooleanField(term35464, term35464.getClass(), "populated", false);
        setBooleanField(term35464, term35464.getClass(), "parseDocumentation", true);
        setField(term35470, term35470.getClass(), "annotation", null);
        setField(term35470, term35470.getClass(), "name", null);
        setField(term35470, term35470.getClass(), "description", null);
        setField(term35470, term35470.getClass(), "type", null);
        setField(term35464, term35464.getClass(), "currentMarker", term35470);
        setField(term35330, term35330.getClass(), "jsdocBuilder", term35464);
        setField(term35330, term35330.getClass(), "sourceName", "pNAEtppZdv");
        setField(term35330, term35330.getClass(), "errorReporter", null);
        setField(term35483, term35483.getClass(), "this$0", null);
        setField(term35330, term35330.getClass(), "parser", term35483);
        setField(term35484, term35484.getClass(), "info", null);
        setField(term35484, term35484.getClass(), "documentation", null);
        setField(term35484, term35484.getClass(), "sourceName", null);
        setField(term35484, term35484.getClass(), "visibility", null);
        setIntField(term35484, term35484.getClass(), "bitset", 0);
        setField(term35484, term35484.getClass(), "type", null);
        setField(term35484, term35484.getClass(), "thisType", null);
        setBooleanField(term35484, term35484.getClass(), "includeDocumentation", false);
        setField(term35330, term35330.getClass(), "fileOverviewJSDocInfo", term35484);
        setField(term35330, term35330.getClass(), "state", enum230);
        setField(term35330, term35330.getClass(), "annotationNames", term35508);
        setField(term35519, term35519.getClass(), "this$0", null);
        setField(term35330, term35330.getClass(), "fileLevelJsDocBuilder", term35519);
        setField(term35330, term35330.getClass(), "unreadToken", null);
        Class<? extends Object> term328102 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term328101 = ((Class) term328102).getDeclaredField((String) "EOF");
        ((Field) term328101).setAccessible(true);
        enum232 = ((Field) term328101).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum232;
        try {
            callMethod(klass, "parseRecordType", argTypes, term35330, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


