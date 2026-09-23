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

public class JsDocInfoParser_eatTokensUntilEOL_188665808597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44327;

    public JsDocInfoParser_eatTokensUntilEOL_188665808597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term44382 = new HashMap();
        HashMap term44391 = new HashMap();
        Set<Object> term335733 =  ((Map) term44391).keySet();
        HashSet term44390 = new HashSet((Collection<? extends Object>) term335733);
        HashMap term44398 = new HashMap();
        Set<Object> term335734 =  ((Map) term44398).keySet();
        HashSet term44397 = new HashSet((Collection<? extends Object>) term335734);
        HashMap term44405 = new HashMap();
        Set<Object> term335735 =  ((Map) term44405).keySet();
        HashSet term44404 = new HashSet((Collection<? extends Object>) term335735);
        HashMap term44411 = new HashMap();
        HashMap term44416 = new HashMap();
        Class<? extends Object> term335757 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term335756 = ((Class) term335757).getDeclaredField((String) "PROTECTED");
        ((Field) term335756).setAccessible(true);
        Object enum254 = ((Field) term335756).get((Object) null);
        Class<? extends Object> term336041 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term336040 = ((Class) term336041).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term336040).setAccessible(true);
        Object enum255 = ((Field) term336040).get((Object) null);
        HashMap term44507 = new HashMap();
        term44327 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term44328 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term44341 = (char[]) newCharArray(2);
        int[] term44345 = (int[]) newIntArray(9);
        Object term44380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term44381 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term44437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term44451 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term44452 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term44453 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term44458 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term44459 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term44463 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term44464 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term44469 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term44482 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term44483 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term44518 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term44328, term44328.getClass(), "string", "OATNwRncsv");
        setCharElement(term44341, 0, 'x');
        setCharElement(term44341, 1, 'f');
        setField(term44328, term44328.getClass(), "stringBuffer", term44341);
        setIntField(term44328, term44328.getClass(), "stringBufferTop", 804070622);
        setIntElement(term44345, 0, 1850364894);
        setIntElement(term44345, 1, 915367534);
        setIntElement(term44345, 2, 1949983666);
        setIntElement(term44345, 3, 154111854);
        setIntElement(term44345, 4, 710986341);
        setIntElement(term44345, 5, -873958002);
        setIntElement(term44345, 6, -1780848958);
        setIntElement(term44345, 7, 1235045850);
        setIntElement(term44345, 8, -75143033);
        setField(term44328, term44328.getClass(), "ungetBuffer", term44345);
        setIntField(term44328, term44328.getClass(), "ungetCursor", 797015478);
        setBooleanField(term44328, term44328.getClass(), "hitEOF", false);
        setIntField(term44328, term44328.getClass(), "lineStart", 717574276);
        setIntField(term44328, term44328.getClass(), "lineEndChar", 1795369860);
        setIntField(term44328, term44328.getClass(), "lineno", -570164389);
        setIntField(term44328, term44328.getClass(), "charno", 43200329);
        setIntField(term44328, term44328.getClass(), "initCharno", 998679955);
        setIntField(term44328, term44328.getClass(), "initLineno", 953741504);
        setField(term44328, term44328.getClass(), "sourceString", "rACmzcmIPm");
        setIntField(term44328, term44328.getClass(), "sourceEnd", 1389452261);
        setIntField(term44328, term44328.getClass(), "sourceCursor", 1615957955);
        setIntField(term44328, term44328.getClass(), "cursor", 1779370220);
        setIntField(term44328, term44328.getClass(), "tokenBeg", -1716046610);
        setIntField(term44328, term44328.getClass(), "tokenEnd", 65264024);
        setField(term44327, term44327.getClass(), "stream", term44328);
        setField(term44380, term44380.getClass(), "reporter", null);
        setField(term44380, term44380.getClass(), "nativeTypes", term44381);
        setField(term44380, term44380.getClass(), "namesToTypes", term44382);
        setField(term44380, term44380.getClass(), "namespaces", term44390);
        setField(term44380, term44380.getClass(), "enumTypeNames", term44397);
        setField(term44380, term44380.getClass(), "forwardDeclaredTypes", term44404);
        setField(term44380, term44380.getClass(), "typesIndexedByProperty", term44411);
        setField(term44380, term44380.getClass(), "greatestSubtypeByProperty", term44416);
        setField(term44380, term44380.getClass(), "interfaceToImplementors", null);
        setField(term44380, term44380.getClass(), "unresolvedNamedTypes", null);
        setField(term44380, term44380.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term44380, term44380.getClass(), "lastGeneration", true);
        setField(term44380, term44380.getClass(), "templateTypeName", "nwKkzNpzyC");
        setField(term44437, term44437.getClass(), "name", "CwrsdYnHpH");
        setField(term44437, term44437.getClass(), "referencedType", null);
        setBooleanField(term44437, term44437.getClass(), "visited", false);
        setField(term44452, term44452.getClass(), "baseType", null);
        setField(term44452, term44452.getClass(), "implementedInterfaces", null);
        setField(term44452, term44452.getClass(), "parameters", null);
        setField(term44452, term44452.getClass(), "thrownTypes", null);
        setField(term44452, term44452.getClass(), "templateTypeName", null);
        setField(term44452, term44452.getClass(), "description", null);
        setField(term44452, term44452.getClass(), "deprecated", null);
        setField(term44452, term44452.getClass(), "license", null);
        setField(term44452, term44452.getClass(), "suppressions", null);
        setField(term44451, term44451.getClass(), "info", term44452);
        setField(term44453, term44453.getClass(), "markers", null);
        setField(term44453, term44453.getClass(), "parameters", null);
        setField(term44453, term44453.getClass(), "throwsDescriptions", null);
        setField(term44453, term44453.getClass(), "blockDescription", null);
        setField(term44453, term44453.getClass(), "fileOverview", null);
        setField(term44453, term44453.getClass(), "returnDescription", null);
        setField(term44453, term44453.getClass(), "version", null);
        setField(term44453, term44453.getClass(), "authors", null);
        setField(term44453, term44453.getClass(), "sees", null);
        setField(term44451, term44451.getClass(), "documentation", term44453);
        setField(term44451, term44451.getClass(), "sourceName", "");
        setField(term44451, term44451.getClass(), "visibility", enum254);
        setIntField(term44451, term44451.getClass(), "bitset", -252449812);
        setField(term44458, term44458.getClass(), "root", null);
        setField(term44458, term44458.getClass(), "sourceName", null);
        setField(term44458, term44458.getClass(), "registry", null);
        setField(term44451, term44451.getClass(), "type", term44458);
        setField(term44459, term44459.getClass(), "root", null);
        setField(term44459, term44459.getClass(), "sourceName", null);
        setField(term44459, term44459.getClass(), "registry", null);
        setField(term44451, term44451.getClass(), "thisType", term44459);
        setBooleanField(term44451, term44451.getClass(), "includeDocumentation", true);
        setField(term44437, term44437.getClass(), "docInfo", term44451);
        setBooleanField(term44437, term44437.getClass(), "unknown", true);
        setBooleanField(term44437, term44437.getClass(), "resolved", false);
        setField(term44437, term44437.getClass(), "resolveResult", null);
        setField(term44437, term44437.getClass(), "registry", null);
        setField(term44380, term44380.getClass(), "templateType", term44437);
        setField(term44327, term44327.getClass(), "typeRegistry", term44380);
        setField(term44464, term44464.getClass(), "info", null);
        setField(term44464, term44464.getClass(), "documentation", null);
        setField(term44464, term44464.getClass(), "sourceName", null);
        setField(term44464, term44464.getClass(), "visibility", null);
        setIntField(term44464, term44464.getClass(), "bitset", 0);
        setField(term44464, term44464.getClass(), "type", null);
        setField(term44464, term44464.getClass(), "thisType", null);
        setBooleanField(term44464, term44464.getClass(), "includeDocumentation", false);
        setField(term44463, term44463.getClass(), "currentInfo", term44464);
        setBooleanField(term44463, term44463.getClass(), "populated", true);
        setBooleanField(term44463, term44463.getClass(), "parseDocumentation", false);
        setField(term44469, term44469.getClass(), "annotation", null);
        setField(term44469, term44469.getClass(), "name", null);
        setField(term44469, term44469.getClass(), "description", null);
        setField(term44469, term44469.getClass(), "type", null);
        setField(term44463, term44463.getClass(), "currentMarker", term44469);
        setField(term44327, term44327.getClass(), "jsdocBuilder", term44463);
        setField(term44327, term44327.getClass(), "sourceName", "ltWBKZaXwJ");
        setField(term44327, term44327.getClass(), "errorReporter", null);
        setField(term44482, term44482.getClass(), "this$0", null);
        setField(term44327, term44327.getClass(), "parser", term44482);
        setField(term44483, term44483.getClass(), "info", null);
        setField(term44483, term44483.getClass(), "documentation", null);
        setField(term44483, term44483.getClass(), "sourceName", null);
        setField(term44483, term44483.getClass(), "visibility", null);
        setIntField(term44483, term44483.getClass(), "bitset", 0);
        setField(term44483, term44483.getClass(), "type", null);
        setField(term44483, term44483.getClass(), "thisType", null);
        setBooleanField(term44483, term44483.getClass(), "includeDocumentation", false);
        setField(term44327, term44327.getClass(), "fileOverviewJSDocInfo", term44483);
        setField(term44327, term44327.getClass(), "state", enum255);
        setField(term44327, term44327.getClass(), "annotationNames", term44507);
        setField(term44518, term44518.getClass(), "this$0", null);
        setField(term44327, term44327.getClass(), "fileLevelJsDocBuilder", term44518);
        setField(term44327, term44327.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "eatTokensUntilEOL", argTypes, term44327, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


