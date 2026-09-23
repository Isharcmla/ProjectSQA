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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class JsDocInfoParser_parseParamTypeExpressionAnnotation_43368676585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12909;
     Object enum184;

    public JsDocInfoParser_parseParamTypeExpressionAnnotation_43368676585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12966 = new ArrayList();
        ((ArrayList) term12966).add((Object)null);
        ((ArrayList) term12966).add((Object)null);
        ((ArrayList) term12966).add((Object)null);
        ((ArrayList) term12966).add((Object)null);
        ((ArrayList) term12966).add((Object)null);
        ((ArrayList) term12966).add((Object)null);
        ((ArrayList) term12966).add((Object)null);
        ((ArrayList) term12966).add((Object)null);
        ((ArrayList) term12966).add((Object)null);
        ArrayList term12969 = new ArrayList();
        ((ArrayList) term12969).add((Object)null);
        ((ArrayList) term12969).add((Object)null);
        ((ArrayList) term12969).add((Object)null);
        HashMap term12972 = new HashMap();
        ArrayList term12977 = new ArrayList();
        ((ArrayList) term12977).add((Object)null);
        ((ArrayList) term12977).add((Object)null);
        ((ArrayList) term12977).add((Object)null);
        ((ArrayList) term12977).add((Object)null);
        ((ArrayList) term12977).add((Object)null);
        ((ArrayList) term12977).add((Object)null);
        ((ArrayList) term12977).add((Object)null);
        ((ArrayList) term12977).add((Object)null);
        ((ArrayList) term12977).add((Object)null);
        Class<? extends Object> term104660 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term104659 = ((Class) term104660).getDeclaredField((String) "PUBLIC");
        ((Field) term104659).setAccessible(true);
        Object enum183 = ((Field) term104659).get((Object) null);
        term12909 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term12910 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term12923 = (char[]) newCharArray(6);
        int[] term12931 = (int[]) newIntArray(5);
        Object term12962 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term12963 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12964 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12965 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12981 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12989 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12994 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13002 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term13003 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term13008 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term13013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12910, term12910.getClass(), "string", "MYWYUeLGOp");
        setCharElement(term12923, 0, 'M');
        setCharElement(term12923, 1, 'F');
        setCharElement(term12923, 2, 'I');
        setCharElement(term12923, 3, 's');
        setCharElement(term12923, 4, 'Y');
        setCharElement(term12923, 5, 'G');
        setField(term12910, term12910.getClass(), "stringBuffer", term12923);
        setIntField(term12910, term12910.getClass(), "stringBufferTop", 114279242);
        setIntElement(term12931, 0, 990883365);
        setIntElement(term12931, 1, 633598642);
        setIntElement(term12931, 2, 1862841859);
        setIntElement(term12931, 3, -1114668574);
        setIntElement(term12931, 4, 514511037);
        setField(term12910, term12910.getClass(), "ungetBuffer", term12931);
        setIntField(term12910, term12910.getClass(), "ungetCursor", 1713573821);
        setBooleanField(term12910, term12910.getClass(), "hitEOF", true);
        setIntField(term12910, term12910.getClass(), "lineStart", 1956590498);
        setIntField(term12910, term12910.getClass(), "lineEndChar", 1467356494);
        setIntField(term12910, term12910.getClass(), "lineno", -26316536);
        setIntField(term12910, term12910.getClass(), "charno", 1716165145);
        setIntField(term12910, term12910.getClass(), "initCharno", 1692937831);
        setIntField(term12910, term12910.getClass(), "initLineno", -1539747985);
        setField(term12910, term12910.getClass(), "sourceString", "tsTGdgQYUL");
        setIntField(term12910, term12910.getClass(), "sourceEnd", -1982489643);
        setIntField(term12910, term12910.getClass(), "sourceCursor", 550892835);
        setIntField(term12910, term12910.getClass(), "cursor", 1237549886);
        setIntField(term12910, term12910.getClass(), "tokenBeg", -1945635750);
        setIntField(term12910, term12910.getClass(), "tokenEnd", -1622760744);
        setField(term12909, term12909.getClass(), "stream", term12910);
        setField(term12965, term12965.getClass(), "root", null);
        setField(term12965, term12965.getClass(), "sourceName", null);
        setField(term12964, term12964.getClass(), "baseType", term12965);
        setField(term12964, term12964.getClass(), "extendedInterfaces", term12966);
        setField(term12964, term12964.getClass(), "implementedInterfaces", term12969);
        setField(term12964, term12964.getClass(), "parameters", term12972);
        setField(term12964, term12964.getClass(), "thrownTypes", term12977);
        setField(term12964, term12964.getClass(), "templateTypeNames", null);
        setField(term12964, term12964.getClass(), "classTemplateTypeNames", null);
        setField(term12964, term12964.getClass(), "description", null);
        setField(term12964, term12964.getClass(), "meaning", null);
        setField(term12964, term12964.getClass(), "deprecated", null);
        setField(term12964, term12964.getClass(), "license", null);
        setField(term12964, term12964.getClass(), "suppressions", null);
        setField(term12964, term12964.getClass(), "modifies", null);
        setField(term12964, term12964.getClass(), "lendsName", null);
        setBooleanField(term12964, term12964.getClass(), "ngInject", false);
        setField(term12963, term12963.getClass(), "info", term12964);
        setField(term12981, term12981.getClass(), "sourceComment", null);
        setField(term12981, term12981.getClass(), "markers", null);
        setField(term12981, term12981.getClass(), "parameters", null);
        setField(term12981, term12981.getClass(), "throwsDescriptions", null);
        setField(term12981, term12981.getClass(), "blockDescription", null);
        setField(term12981, term12981.getClass(), "fileOverview", null);
        setField(term12981, term12981.getClass(), "returnDescription", null);
        setField(term12981, term12981.getClass(), "version", null);
        setField(term12981, term12981.getClass(), "authors", null);
        setField(term12981, term12981.getClass(), "sees", null);
        setField(term12963, term12963.getClass(), "documentation", term12981);
        setIntField(term12982, term12982.getClass(), "type", 0);
        setField(term12982, term12982.getClass(), "next", null);
        setField(term12982, term12982.getClass(), "first", null);
        setField(term12982, term12982.getClass(), "last", null);
        setField(term12982, term12982.getClass(), "propListHead", null);
        setIntField(term12982, term12982.getClass(), "sourcePosition", 0);
        setField(term12982, term12982.getClass(), "jsType", null);
        setField(term12982, term12982.getClass(), "parent", null);
        setField(term12963, term12963.getClass(), "associatedNode", term12982);
        setField(term12963, term12963.getClass(), "visibility", enum183);
        setIntField(term12963, term12963.getClass(), "bitset", -1271375703);
        setIntField(term12990, term12990.getClass(), "type", -1428063820);
        setField(term12990, term12990.getClass(), "next", null);
        setField(term12990, term12990.getClass(), "first", term12982);
        setField(term12990, term12990.getClass(), "last", null);
        setField(term12990, term12990.getClass(), "propListHead", null);
        setIntField(term12990, term12990.getClass(), "sourcePosition", 0);
        setField(term12990, term12990.getClass(), "jsType", null);
        setField(term12990, term12990.getClass(), "parent", null);
        setField(term12989, term12989.getClass(), "root", term12990);
        setField(term12989, term12989.getClass(), "sourceName", "");
        setField(term12963, term12963.getClass(), "type", term12989);
        setIntField(term12995, term12995.getClass(), "type", -1556527718);
        setField(term12995, term12995.getClass(), "next", null);
        setField(term12995, term12995.getClass(), "first", null);
        setField(term12995, term12995.getClass(), "last", null);
        setField(term12995, term12995.getClass(), "propListHead", null);
        setIntField(term12995, term12995.getClass(), "sourcePosition", 0);
        setField(term12995, term12995.getClass(), "jsType", null);
        setField(term12995, term12995.getClass(), "parent", null);
        setField(term12994, term12994.getClass(), "root", term12995);
        setField(term12994, term12994.getClass(), "sourceName", "");
        setField(term12963, term12963.getClass(), "thisType", term12994);
        setBooleanField(term12963, term12963.getClass(), "includeDocumentation", true);
        setField(term12962, term12962.getClass(), "currentInfo", term12963);
        setBooleanField(term12962, term12962.getClass(), "populated", true);
        setBooleanField(term12962, term12962.getClass(), "parseDocumentation", true);
        setField(term13003, term13003.getClass(), "item", null);
        setIntField(term13003, term13003.getClass(), "startLineno", 0);
        setIntField(term13003, term13003.getClass(), "startCharno", 0);
        setIntField(term13003, term13003.getClass(), "endLineno", 0);
        setIntField(term13003, term13003.getClass(), "endCharno", 0);
        setField(term13002, term13002.getClass(), "annotation", term13003);
        setField(term13008, term13008.getClass(), "item", null);
        setIntField(term13008, term13008.getClass(), "startLineno", 0);
        setIntField(term13008, term13008.getClass(), "startCharno", 0);
        setIntField(term13008, term13008.getClass(), "endLineno", 0);
        setIntField(term13008, term13008.getClass(), "endCharno", 0);
        setField(term13002, term13002.getClass(), "name", term13008);
        setField(term13002, term13002.getClass(), "nameNode", null);
        setField(term13002, term13002.getClass(), "description", null);
        setField(term13002, term13002.getClass(), "type", null);
        setField(term12962, term12962.getClass(), "currentMarker", term13002);
        setField(term12909, term12909.getClass(), "jsdocBuilder", term12962);
        setField(term12909, term12909.getClass(), "sourceFile", null);
        setIntField(term13013, term13013.getClass(), "type", 0);
        setField(term13013, term13013.getClass(), "next", null);
        setField(term13013, term13013.getClass(), "first", null);
        setField(term13013, term13013.getClass(), "last", null);
        setField(term13013, term13013.getClass(), "propListHead", null);
        setIntField(term13013, term13013.getClass(), "sourcePosition", 0);
        setField(term13013, term13013.getClass(), "jsType", null);
        setField(term13013, term13013.getClass(), "parent", null);
        setField(term12909, term12909.getClass(), "associatedNode", term13013);
        setField(term12909, term12909.getClass(), "errorReporter", null);
        setField(term12909, term12909.getClass(), "parser", null);
        setField(term12909, term12909.getClass(), "templateNode", null);
        setField(term12909, term12909.getClass(), "fileOverviewJSDocInfo", null);
        setField(term12909, term12909.getClass(), "state", null);
        setField(term12909, term12909.getClass(), "annotationNames", null);
        setField(term12909, term12909.getClass(), "suppressionNames", null);
        setField(term12909, term12909.getClass(), "fileLevelJsDocBuilder", null);
        setField(term12909, term12909.getClass(), "unreadToken", null);
        Class<? extends Object> term104925 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term104924 = ((Class) term104925).getDeclaredField((String) "EOL");
        ((Field) term104924).setAccessible(true);
        enum184 = ((Field) term104924).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum184;
        try {
            callMethod(klass, "parseParamTypeExpressionAnnotation", argTypes, term12909, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


