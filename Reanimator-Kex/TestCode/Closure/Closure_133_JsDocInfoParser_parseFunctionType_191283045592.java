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
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class JsDocInfoParser_parseFunctionType_191283045592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17584;
     Object enum199;

    public JsDocInfoParser_parseFunctionType_191283045592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17636 = new ArrayList();
        ((ArrayList) term17636).add((Object)null);
        ((ArrayList) term17636).add((Object)null);
        ArrayList term17639 = new ArrayList();
        ((ArrayList) term17639).add((Object)null);
        ((ArrayList) term17639).add((Object)null);
        ((ArrayList) term17639).add((Object)null);
        HashMap term17642 = new HashMap();
        ArrayList term17647 = new ArrayList();
        ((ArrayList) term17647).add((Object)null);
        Class<? extends Object> term114495 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term114494 = ((Class) term114495).getDeclaredField((String) "PUBLIC");
        ((Field) term114494).setAccessible(true);
        Object enum197 = ((Field) term114494).get((Object) null);
        term17584 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term17585 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term17598 = (char[]) newCharArray(1);
        int[] term17601 = (int[]) newIntArray(5);
        Object term17632 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term17633 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term17634 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term17635 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term17651 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term17652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17659 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term17660 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term17664 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term17665 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term17670 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term17675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17585, term17585.getClass(), "string", "dtGZCsKXbW");
        setCharElement(term17598, 0, 'l');
        setField(term17585, term17585.getClass(), "stringBuffer", term17598);
        setIntField(term17585, term17585.getClass(), "stringBufferTop", -751079123);
        setIntElement(term17601, 0, -110837188);
        setIntElement(term17601, 1, -271094506);
        setIntElement(term17601, 2, 455632030);
        setIntElement(term17601, 3, -1632929393);
        setIntElement(term17601, 4, -431440129);
        setField(term17585, term17585.getClass(), "ungetBuffer", term17601);
        setIntField(term17585, term17585.getClass(), "ungetCursor", -763576148);
        setBooleanField(term17585, term17585.getClass(), "hitEOF", true);
        setIntField(term17585, term17585.getClass(), "lineStart", 1568948514);
        setIntField(term17585, term17585.getClass(), "lineEndChar", -1511130237);
        setIntField(term17585, term17585.getClass(), "lineno", 452088587);
        setIntField(term17585, term17585.getClass(), "charno", -1630069454);
        setIntField(term17585, term17585.getClass(), "initCharno", 1499735894);
        setIntField(term17585, term17585.getClass(), "initLineno", 716486048);
        setField(term17585, term17585.getClass(), "sourceString", "bdyhHbDAmJ");
        setIntField(term17585, term17585.getClass(), "sourceEnd", -466708718);
        setIntField(term17585, term17585.getClass(), "sourceCursor", 1038029515);
        setIntField(term17585, term17585.getClass(), "cursor", 1137154606);
        setIntField(term17585, term17585.getClass(), "tokenBeg", -100681578);
        setIntField(term17585, term17585.getClass(), "tokenEnd", 296568835);
        setField(term17584, term17584.getClass(), "stream", term17585);
        setField(term17635, term17635.getClass(), "root", null);
        setField(term17635, term17635.getClass(), "sourceName", null);
        setField(term17634, term17634.getClass(), "baseType", term17635);
        setField(term17634, term17634.getClass(), "extendedInterfaces", term17636);
        setField(term17634, term17634.getClass(), "implementedInterfaces", term17639);
        setField(term17634, term17634.getClass(), "parameters", term17642);
        setField(term17634, term17634.getClass(), "thrownTypes", term17647);
        setField(term17634, term17634.getClass(), "templateTypeNames", null);
        setField(term17634, term17634.getClass(), "classTemplateTypeNames", null);
        setField(term17634, term17634.getClass(), "description", null);
        setField(term17634, term17634.getClass(), "meaning", null);
        setField(term17634, term17634.getClass(), "deprecated", null);
        setField(term17634, term17634.getClass(), "license", null);
        setField(term17634, term17634.getClass(), "suppressions", null);
        setField(term17634, term17634.getClass(), "modifies", null);
        setField(term17634, term17634.getClass(), "lendsName", null);
        setBooleanField(term17634, term17634.getClass(), "ngInject", false);
        setField(term17633, term17633.getClass(), "info", term17634);
        setField(term17651, term17651.getClass(), "sourceComment", null);
        setField(term17651, term17651.getClass(), "markers", null);
        setField(term17651, term17651.getClass(), "parameters", null);
        setField(term17651, term17651.getClass(), "throwsDescriptions", null);
        setField(term17651, term17651.getClass(), "blockDescription", null);
        setField(term17651, term17651.getClass(), "fileOverview", null);
        setField(term17651, term17651.getClass(), "returnDescription", null);
        setField(term17651, term17651.getClass(), "version", null);
        setField(term17651, term17651.getClass(), "authors", null);
        setField(term17651, term17651.getClass(), "sees", null);
        setField(term17633, term17633.getClass(), "documentation", term17651);
        setIntField(term17652, term17652.getClass(), "type", 0);
        setField(term17652, term17652.getClass(), "next", null);
        setField(term17652, term17652.getClass(), "first", null);
        setField(term17652, term17652.getClass(), "last", null);
        setField(term17652, term17652.getClass(), "propListHead", null);
        setIntField(term17652, term17652.getClass(), "sourcePosition", 0);
        setField(term17652, term17652.getClass(), "jsType", null);
        setField(term17652, term17652.getClass(), "parent", null);
        setField(term17633, term17633.getClass(), "associatedNode", term17652);
        setField(term17633, term17633.getClass(), "visibility", enum197);
        setIntField(term17633, term17633.getClass(), "bitset", 2107679041);
        setField(term17659, term17659.getClass(), "root", null);
        setField(term17659, term17659.getClass(), "sourceName", null);
        setField(term17633, term17633.getClass(), "type", term17659);
        setField(term17660, term17660.getClass(), "root", null);
        setField(term17660, term17660.getClass(), "sourceName", null);
        setField(term17633, term17633.getClass(), "thisType", term17660);
        setBooleanField(term17633, term17633.getClass(), "includeDocumentation", false);
        setField(term17632, term17632.getClass(), "currentInfo", term17633);
        setBooleanField(term17632, term17632.getClass(), "populated", false);
        setBooleanField(term17632, term17632.getClass(), "parseDocumentation", false);
        setField(term17665, term17665.getClass(), "item", null);
        setIntField(term17665, term17665.getClass(), "startLineno", 0);
        setIntField(term17665, term17665.getClass(), "startCharno", 0);
        setIntField(term17665, term17665.getClass(), "endLineno", 0);
        setIntField(term17665, term17665.getClass(), "endCharno", 0);
        setField(term17664, term17664.getClass(), "annotation", term17665);
        setField(term17670, term17670.getClass(), "item", null);
        setIntField(term17670, term17670.getClass(), "startLineno", 0);
        setIntField(term17670, term17670.getClass(), "startCharno", 0);
        setIntField(term17670, term17670.getClass(), "endLineno", 0);
        setIntField(term17670, term17670.getClass(), "endCharno", 0);
        setField(term17664, term17664.getClass(), "name", term17670);
        setField(term17664, term17664.getClass(), "nameNode", null);
        setField(term17664, term17664.getClass(), "description", null);
        setField(term17664, term17664.getClass(), "type", null);
        setField(term17632, term17632.getClass(), "currentMarker", term17664);
        setField(term17584, term17584.getClass(), "jsdocBuilder", term17632);
        setField(term17584, term17584.getClass(), "sourceFile", null);
        setIntField(term17675, term17675.getClass(), "type", -896473214);
        setIntField(term17677, term17677.getClass(), "type", 401203924);
        setIntField(term17679, term17679.getClass(), "type", -1212399479);
        setField(term17679, term17679.getClass(), "next", term17652);
        setIntField(term17681, term17681.getClass(), "type", 0);
        setField(term17681, term17681.getClass(), "next", null);
        setField(term17681, term17681.getClass(), "first", null);
        setField(term17681, term17681.getClass(), "last", null);
        setField(term17681, term17681.getClass(), "propListHead", null);
        setIntField(term17681, term17681.getClass(), "sourcePosition", 0);
        setField(term17681, term17681.getClass(), "jsType", null);
        setField(term17681, term17681.getClass(), "parent", null);
        setField(term17679, term17679.getClass(), "first", term17681);
        setIntField(term17684, term17684.getClass(), "type", 0);
        setField(term17684, term17684.getClass(), "next", null);
        setField(term17684, term17684.getClass(), "first", null);
        setField(term17684, term17684.getClass(), "last", null);
        setField(term17684, term17684.getClass(), "propListHead", null);
        setIntField(term17684, term17684.getClass(), "sourcePosition", 0);
        setField(term17684, term17684.getClass(), "jsType", null);
        setField(term17684, term17684.getClass(), "parent", null);
        setField(term17679, term17679.getClass(), "last", term17684);
        setField(term17679, term17679.getClass(), "propListHead", null);
        setIntField(term17679, term17679.getClass(), "sourcePosition", 0);
        setField(term17679, term17679.getClass(), "jsType", null);
        setField(term17679, term17679.getClass(), "parent", null);
        setField(term17677, term17677.getClass(), "next", term17679);
        setIntField(term17688, term17688.getClass(), "type", 0);
        setField(term17688, term17688.getClass(), "next", null);
        setField(term17688, term17688.getClass(), "first", null);
        setField(term17688, term17688.getClass(), "last", null);
        setField(term17688, term17688.getClass(), "propListHead", null);
        setIntField(term17688, term17688.getClass(), "sourcePosition", 0);
        setField(term17688, term17688.getClass(), "jsType", null);
        setField(term17688, term17688.getClass(), "parent", null);
        setField(term17677, term17677.getClass(), "first", term17688);
        setIntField(term17691, term17691.getClass(), "type", 0);
        setField(term17691, term17691.getClass(), "next", null);
        setField(term17691, term17691.getClass(), "first", null);
        setField(term17691, term17691.getClass(), "last", null);
        setField(term17691, term17691.getClass(), "propListHead", null);
        setIntField(term17691, term17691.getClass(), "sourcePosition", 0);
        setField(term17691, term17691.getClass(), "jsType", null);
        setField(term17691, term17691.getClass(), "parent", null);
        setField(term17677, term17677.getClass(), "last", term17691);
        setField(term17677, term17677.getClass(), "propListHead", null);
        setIntField(term17677, term17677.getClass(), "sourcePosition", 0);
        setField(term17677, term17677.getClass(), "jsType", null);
        setField(term17677, term17677.getClass(), "parent", null);
        setField(term17675, term17675.getClass(), "next", term17677);
        setField(term17675, term17675.getClass(), "first", term17684);
        setField(term17675, term17675.getClass(), "last", term17688);
        setField(term17675, term17675.getClass(), "propListHead", null);
        setIntField(term17675, term17675.getClass(), "sourcePosition", 0);
        setField(term17675, term17675.getClass(), "jsType", null);
        setField(term17675, term17675.getClass(), "parent", null);
        setField(term17584, term17584.getClass(), "associatedNode", term17675);
        setField(term17584, term17584.getClass(), "errorReporter", null);
        setField(term17584, term17584.getClass(), "parser", null);
        setField(term17584, term17584.getClass(), "templateNode", null);
        setField(term17584, term17584.getClass(), "fileOverviewJSDocInfo", null);
        setField(term17584, term17584.getClass(), "state", null);
        setField(term17584, term17584.getClass(), "annotationNames", null);
        setField(term17584, term17584.getClass(), "suppressionNames", null);
        setField(term17584, term17584.getClass(), "fileLevelJsDocBuilder", null);
        setField(term17584, term17584.getClass(), "unreadToken", null);
        Class<? extends Object> term115058 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term115057 = ((Class) term115058).getDeclaredField((String) "EOL");
        ((Field) term115057).setAccessible(true);
        enum199 = ((Field) term115057).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum199;
        try {
            callMethod(klass, "parseFunctionType", argTypes, term17584, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


