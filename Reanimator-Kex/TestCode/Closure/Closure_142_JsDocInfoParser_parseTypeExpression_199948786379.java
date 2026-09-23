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

public class JsDocInfoParser_parseTypeExpression_199948786379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25068;
     Object enum207;

    public JsDocInfoParser_parseTypeExpression_199948786379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term25125 = new HashMap();
        HashMap term25134 = new HashMap();
        Set<Object> term313642 =  ((Map) term25134).keySet();
        HashSet term25133 = new HashSet((Collection<? extends Object>) term313642);
        HashMap term25140 = new HashMap();
        Set<Object> term313643 =  ((Map) term25140).keySet();
        HashSet term25139 = new HashSet((Collection<? extends Object>) term313643);
        HashMap term25147 = new HashMap();
        Set<Object> term313644 =  ((Map) term25147).keySet();
        HashSet term25146 = new HashSet((Collection<? extends Object>) term313644);
        HashMap term25153 = new HashMap();
        HashMap term25158 = new HashMap();
        Class<? extends Object> term313666 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term313665 = ((Class) term313666).getDeclaredField((String) "PROTECTED");
        ((Field) term313665).setAccessible(true);
        Object enum205 = ((Field) term313665).get((Object) null);
        Class<? extends Object> term313950 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term313949 = ((Class) term313950).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term313949).setAccessible(true);
        Object enum206 = ((Field) term313949).get((Object) null);
        HashMap term25252 = new HashMap();
        term25068 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term25069 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term25082 = (char[]) newCharArray(6);
        int[] term25090 = (int[]) newIntArray(7);
        Object term25123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term25124 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term25179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term25193 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term25194 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term25195 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term25200 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term25201 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term25205 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term25206 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term25211 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term25224 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term25225 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term25263 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term25069, term25069.getClass(), "string", "vydWXHfFTw");
        setCharElement(term25082, 0, 'g');
        setCharElement(term25082, 1, 'E');
        setCharElement(term25082, 2, 'T');
        setCharElement(term25082, 3, 'm');
        setCharElement(term25082, 4, 'J');
        setCharElement(term25082, 5, 'M');
        setField(term25069, term25069.getClass(), "stringBuffer", term25082);
        setIntField(term25069, term25069.getClass(), "stringBufferTop", 1543091617);
        setIntElement(term25090, 0, -763166094);
        setIntElement(term25090, 1, -222941705);
        setIntElement(term25090, 2, 291864719);
        setIntElement(term25090, 3, -1549607466);
        setIntElement(term25090, 4, 853609788);
        setIntElement(term25090, 5, -197820800);
        setIntElement(term25090, 6, 723812297);
        setField(term25069, term25069.getClass(), "ungetBuffer", term25090);
        setIntField(term25069, term25069.getClass(), "ungetCursor", 1639448749);
        setBooleanField(term25069, term25069.getClass(), "hitEOF", false);
        setIntField(term25069, term25069.getClass(), "lineStart", 873659088);
        setIntField(term25069, term25069.getClass(), "lineEndChar", -975748721);
        setIntField(term25069, term25069.getClass(), "lineno", 433248783);
        setIntField(term25069, term25069.getClass(), "charno", -507944154);
        setIntField(term25069, term25069.getClass(), "initCharno", -1736183862);
        setIntField(term25069, term25069.getClass(), "initLineno", 897010381);
        setField(term25069, term25069.getClass(), "sourceString", "DRhkpDneCC");
        setIntField(term25069, term25069.getClass(), "sourceEnd", -15712667);
        setIntField(term25069, term25069.getClass(), "sourceCursor", 1964967720);
        setIntField(term25069, term25069.getClass(), "cursor", 1351900243);
        setIntField(term25069, term25069.getClass(), "tokenBeg", -330897705);
        setIntField(term25069, term25069.getClass(), "tokenEnd", 1065595802);
        setField(term25068, term25068.getClass(), "stream", term25069);
        setField(term25123, term25123.getClass(), "reporter", null);
        setField(term25123, term25123.getClass(), "nativeTypes", term25124);
        setField(term25123, term25123.getClass(), "namesToTypes", term25125);
        setField(term25123, term25123.getClass(), "namespaces", term25133);
        setField(term25123, term25123.getClass(), "enumTypeNames", term25139);
        setField(term25123, term25123.getClass(), "forwardDeclaredTypes", term25146);
        setField(term25123, term25123.getClass(), "typesIndexedByProperty", term25153);
        setField(term25123, term25123.getClass(), "greatestSubtypeByProperty", term25158);
        setField(term25123, term25123.getClass(), "interfaceToImplementors", null);
        setField(term25123, term25123.getClass(), "unresolvedNamedTypes", null);
        setField(term25123, term25123.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25123, term25123.getClass(), "lastGeneration", false);
        setField(term25123, term25123.getClass(), "templateTypeName", "dikKjYjmRO");
        setField(term25179, term25179.getClass(), "name", "GJnnMDVnEP");
        setField(term25179, term25179.getClass(), "referencedType", null);
        setBooleanField(term25179, term25179.getClass(), "visited", false);
        setField(term25194, term25194.getClass(), "baseType", null);
        setField(term25194, term25194.getClass(), "implementedInterfaces", null);
        setField(term25194, term25194.getClass(), "parameters", null);
        setField(term25194, term25194.getClass(), "thrownTypes", null);
        setField(term25194, term25194.getClass(), "templateTypeName", null);
        setField(term25194, term25194.getClass(), "description", null);
        setField(term25194, term25194.getClass(), "deprecated", null);
        setField(term25194, term25194.getClass(), "license", null);
        setField(term25194, term25194.getClass(), "suppressions", null);
        setField(term25193, term25193.getClass(), "info", term25194);
        setField(term25195, term25195.getClass(), "markers", null);
        setField(term25195, term25195.getClass(), "parameters", null);
        setField(term25195, term25195.getClass(), "throwsDescriptions", null);
        setField(term25195, term25195.getClass(), "blockDescription", null);
        setField(term25195, term25195.getClass(), "fileOverview", null);
        setField(term25195, term25195.getClass(), "returnDescription", null);
        setField(term25195, term25195.getClass(), "version", null);
        setField(term25195, term25195.getClass(), "authors", null);
        setField(term25195, term25195.getClass(), "sees", null);
        setField(term25193, term25193.getClass(), "documentation", term25195);
        setField(term25193, term25193.getClass(), "sourceName", "");
        setField(term25193, term25193.getClass(), "visibility", enum205);
        setIntField(term25193, term25193.getClass(), "bitset", 21031843);
        setField(term25200, term25200.getClass(), "root", null);
        setField(term25200, term25200.getClass(), "sourceName", null);
        setField(term25200, term25200.getClass(), "registry", null);
        setField(term25193, term25193.getClass(), "type", term25200);
        setField(term25201, term25201.getClass(), "root", null);
        setField(term25201, term25201.getClass(), "sourceName", null);
        setField(term25201, term25201.getClass(), "registry", null);
        setField(term25193, term25193.getClass(), "thisType", term25201);
        setBooleanField(term25193, term25193.getClass(), "includeDocumentation", false);
        setField(term25179, term25179.getClass(), "docInfo", term25193);
        setBooleanField(term25179, term25179.getClass(), "unknown", true);
        setBooleanField(term25179, term25179.getClass(), "resolved", true);
        setField(term25179, term25179.getClass(), "resolveResult", null);
        setField(term25179, term25179.getClass(), "registry", null);
        setField(term25123, term25123.getClass(), "templateType", term25179);
        setField(term25068, term25068.getClass(), "typeRegistry", term25123);
        setField(term25206, term25206.getClass(), "info", null);
        setField(term25206, term25206.getClass(), "documentation", null);
        setField(term25206, term25206.getClass(), "sourceName", null);
        setField(term25206, term25206.getClass(), "visibility", null);
        setIntField(term25206, term25206.getClass(), "bitset", 0);
        setField(term25206, term25206.getClass(), "type", null);
        setField(term25206, term25206.getClass(), "thisType", null);
        setBooleanField(term25206, term25206.getClass(), "includeDocumentation", false);
        setField(term25205, term25205.getClass(), "currentInfo", term25206);
        setBooleanField(term25205, term25205.getClass(), "populated", true);
        setBooleanField(term25205, term25205.getClass(), "parseDocumentation", false);
        setField(term25211, term25211.getClass(), "annotation", null);
        setField(term25211, term25211.getClass(), "name", null);
        setField(term25211, term25211.getClass(), "description", null);
        setField(term25211, term25211.getClass(), "type", null);
        setField(term25205, term25205.getClass(), "currentMarker", term25211);
        setField(term25068, term25068.getClass(), "jsdocBuilder", term25205);
        setField(term25068, term25068.getClass(), "sourceName", "PwqnuJJwjR");
        setField(term25068, term25068.getClass(), "errorReporter", null);
        setField(term25224, term25224.getClass(), "this$0", null);
        setField(term25068, term25068.getClass(), "parser", term25224);
        setField(term25225, term25225.getClass(), "info", null);
        setField(term25225, term25225.getClass(), "documentation", null);
        setField(term25225, term25225.getClass(), "sourceName", null);
        setField(term25225, term25225.getClass(), "visibility", null);
        setIntField(term25225, term25225.getClass(), "bitset", 0);
        setField(term25225, term25225.getClass(), "type", null);
        setField(term25225, term25225.getClass(), "thisType", null);
        setBooleanField(term25225, term25225.getClass(), "includeDocumentation", false);
        setField(term25068, term25068.getClass(), "fileOverviewJSDocInfo", term25225);
        setField(term25068, term25068.getClass(), "state", enum206);
        setField(term25068, term25068.getClass(), "annotationNames", term25252);
        setField(term25263, term25263.getClass(), "this$0", null);
        setField(term25068, term25068.getClass(), "fileLevelJsDocBuilder", term25263);
        setField(term25068, term25068.getClass(), "unreadToken", null);
        Class<? extends Object> term314307 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term314306 = ((Class) term314307).getDeclaredField((String) "STAR");
        ((Field) term314306).setAccessible(true);
        enum207 = ((Field) term314306).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum207;
        try {
            callMethod(klass, "parseTypeExpression", argTypes, term25068, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


