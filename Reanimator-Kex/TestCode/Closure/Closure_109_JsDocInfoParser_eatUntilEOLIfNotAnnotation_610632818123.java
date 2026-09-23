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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_eatUntilEOLIfNotAnnotation_610632818123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31723;

    public JsDocInfoParser_eatUntilEOLIfNotAnnotation_610632818123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31776 = new ArrayList();
        ((ArrayList) term31776).add((Object)null);
        ((ArrayList) term31776).add((Object)null);
        ((ArrayList) term31776).add((Object)null);
        ArrayList term31779 = new ArrayList();
        ((ArrayList) term31779).add((Object)null);
        ((ArrayList) term31779).add((Object)null);
        ((ArrayList) term31779).add((Object)null);
        ((ArrayList) term31779).add((Object)null);
        ((ArrayList) term31779).add((Object)null);
        HashMap term31782 = new HashMap();
        ArrayList term31787 = new ArrayList();
        ((ArrayList) term31787).add((Object)null);
        ((ArrayList) term31787).add((Object)null);
        ((ArrayList) term31787).add((Object)null);
        ((ArrayList) term31787).add((Object)null);
        ((ArrayList) term31787).add((Object)null);
        ((ArrayList) term31787).add((Object)null);
        ((ArrayList) term31787).add((Object)null);
        ((ArrayList) term31787).add((Object)null);
        ((ArrayList) term31787).add((Object)null);
        HashSet term31790 = new HashSet();
        HashSet term31795 = new HashSet();
        HashSet term31796 = new HashSet();
        ArrayList term31805 = new ArrayList();
        ((ArrayList) term31805).add((Object)null);
        ((ArrayList) term31805).add((Object)null);
        ((ArrayList) term31805).add((Object)null);
        ((ArrayList) term31805).add((Object)null);
        HashMap term31808 = new HashMap();
        Class<? extends Object> term160838 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term160837 = ((Class) term160838).getDeclaredField((String) "PUBLIC");
        ((Field) term160837).setAccessible(true);
        Object enum254 = ((Field) term160837).get((Object) null);
        term31723 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term31724 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term31737 = (char[]) newCharArray(0);
        int[] term31739 = (int[]) newIntArray(7);
        Object term31772 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term31773 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term31774 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term31775 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31803 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term31813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31820 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31825 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31834 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term31835 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term31840 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term31845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31724, term31724.getClass(), "string", "jgywFOzBDw");
        setField(term31724, term31724.getClass(), "stringBuffer", term31737);
        setIntField(term31724, term31724.getClass(), "stringBufferTop", -91068927);
        setIntElement(term31739, 0, 680714112);
        setIntElement(term31739, 1, 385297023);
        setIntElement(term31739, 2, -134092543);
        setIntElement(term31739, 3, -1703642288);
        setIntElement(term31739, 4, 2075139747);
        setIntElement(term31739, 5, 2092881418);
        setIntElement(term31739, 6, 1732410866);
        setField(term31724, term31724.getClass(), "ungetBuffer", term31739);
        setIntField(term31724, term31724.getClass(), "ungetCursor", 1084102599);
        setBooleanField(term31724, term31724.getClass(), "hitEOF", true);
        setIntField(term31724, term31724.getClass(), "lineStart", -1743503755);
        setIntField(term31724, term31724.getClass(), "lineEndChar", 1641342112);
        setIntField(term31724, term31724.getClass(), "lineno", -1551790945);
        setIntField(term31724, term31724.getClass(), "charno", 2039538484);
        setIntField(term31724, term31724.getClass(), "initCharno", 1235736068);
        setIntField(term31724, term31724.getClass(), "initLineno", 329424176);
        setField(term31724, term31724.getClass(), "sourceString", "yKIXLtCWYi");
        setIntField(term31724, term31724.getClass(), "sourceEnd", -1897199214);
        setIntField(term31724, term31724.getClass(), "sourceCursor", -1016478729);
        setIntField(term31724, term31724.getClass(), "cursor", -206889003);
        setIntField(term31724, term31724.getClass(), "tokenBeg", 638046409);
        setIntField(term31724, term31724.getClass(), "tokenEnd", 427274898);
        setField(term31723, term31723.getClass(), "stream", term31724);
        setField(term31775, term31775.getClass(), "root", null);
        setField(term31775, term31775.getClass(), "sourceName", null);
        setField(term31774, term31774.getClass(), "baseType", term31775);
        setField(term31774, term31774.getClass(), "extendedInterfaces", term31776);
        setField(term31774, term31774.getClass(), "implementedInterfaces", term31779);
        setField(term31774, term31774.getClass(), "parameters", term31782);
        setField(term31774, term31774.getClass(), "thrownTypes", term31787);
        setField(term31774, term31774.getClass(), "templateTypeNames", null);
        setField(term31774, term31774.getClass(), "disposedParameters", term31790);
        setField(term31774, term31774.getClass(), "description", "");
        setField(term31774, term31774.getClass(), "meaning", "");
        setField(term31774, term31774.getClass(), "deprecated", "");
        setField(term31774, term31774.getClass(), "license", "");
        setField(term31774, term31774.getClass(), "suppressions", term31795);
        setField(term31774, term31774.getClass(), "modifies", term31796);
        setField(term31774, term31774.getClass(), "lendsName", "");
        setBooleanField(term31774, term31774.getClass(), "ngInject", true);
        setBooleanField(term31774, term31774.getClass(), "wizaction", false);
        setBooleanField(term31774, term31774.getClass(), "jaggerInject", false);
        setBooleanField(term31774, term31774.getClass(), "jaggerProvide", false);
        setBooleanField(term31774, term31774.getClass(), "jaggerModule", false);
        setField(term31773, term31773.getClass(), "info", term31774);
        setField(term31803, term31803.getClass(), "sourceComment", "");
        setField(term31803, term31803.getClass(), "markers", term31805);
        setField(term31803, term31803.getClass(), "parameters", term31808);
        setField(term31803, term31803.getClass(), "throwsDescriptions", null);
        setField(term31803, term31803.getClass(), "blockDescription", null);
        setField(term31803, term31803.getClass(), "fileOverview", null);
        setField(term31803, term31803.getClass(), "returnDescription", null);
        setField(term31803, term31803.getClass(), "version", null);
        setField(term31803, term31803.getClass(), "authors", null);
        setField(term31803, term31803.getClass(), "sees", null);
        setField(term31773, term31773.getClass(), "documentation", term31803);
        setIntField(term31813, term31813.getClass(), "type", 0);
        setField(term31813, term31813.getClass(), "next", null);
        setField(term31813, term31813.getClass(), "first", null);
        setField(term31813, term31813.getClass(), "last", null);
        setField(term31813, term31813.getClass(), "propListHead", null);
        setIntField(term31813, term31813.getClass(), "sourcePosition", 0);
        setField(term31813, term31813.getClass(), "jsType", null);
        setField(term31813, term31813.getClass(), "parent", null);
        setField(term31773, term31773.getClass(), "associatedNode", term31813);
        setField(term31773, term31773.getClass(), "visibility", enum254);
        setIntField(term31773, term31773.getClass(), "bitset", -1100497683);
        setIntField(term31821, term31821.getClass(), "type", 1397781598);
        setField(term31821, term31821.getClass(), "next", null);
        setField(term31821, term31821.getClass(), "first", null);
        setField(term31821, term31821.getClass(), "last", term31813);
        setField(term31821, term31821.getClass(), "propListHead", null);
        setIntField(term31821, term31821.getClass(), "sourcePosition", 0);
        setField(term31821, term31821.getClass(), "jsType", null);
        setField(term31821, term31821.getClass(), "parent", null);
        setField(term31820, term31820.getClass(), "root", term31821);
        setField(term31820, term31820.getClass(), "sourceName", "");
        setField(term31773, term31773.getClass(), "type", term31820);
        setIntField(term31826, term31826.getClass(), "type", 0);
        setField(term31826, term31826.getClass(), "next", null);
        setField(term31826, term31826.getClass(), "first", null);
        setField(term31826, term31826.getClass(), "last", null);
        setField(term31826, term31826.getClass(), "propListHead", null);
        setIntField(term31826, term31826.getClass(), "sourcePosition", 0);
        setField(term31826, term31826.getClass(), "jsType", null);
        setField(term31826, term31826.getClass(), "parent", null);
        setField(term31825, term31825.getClass(), "root", term31826);
        setField(term31825, term31825.getClass(), "sourceName", "");
        setField(term31773, term31773.getClass(), "thisType", term31825);
        setBooleanField(term31773, term31773.getClass(), "includeDocumentation", false);
        setIntField(term31773, term31773.getClass(), "originalCommentPosition", 155423433);
        setField(term31772, term31772.getClass(), "currentInfo", term31773);
        setBooleanField(term31772, term31772.getClass(), "populated", true);
        setBooleanField(term31772, term31772.getClass(), "parseDocumentation", false);
        setField(term31835, term31835.getClass(), "item", null);
        setIntField(term31835, term31835.getClass(), "startLineno", 0);
        setIntField(term31835, term31835.getClass(), "startCharno", 0);
        setIntField(term31835, term31835.getClass(), "endLineno", 0);
        setIntField(term31835, term31835.getClass(), "endCharno", 0);
        setField(term31834, term31834.getClass(), "annotation", term31835);
        setField(term31840, term31840.getClass(), "item", null);
        setIntField(term31840, term31840.getClass(), "startLineno", 0);
        setIntField(term31840, term31840.getClass(), "startCharno", 0);
        setIntField(term31840, term31840.getClass(), "endLineno", 0);
        setIntField(term31840, term31840.getClass(), "endCharno", 0);
        setField(term31834, term31834.getClass(), "name", term31840);
        setField(term31834, term31834.getClass(), "nameNode", null);
        setField(term31834, term31834.getClass(), "description", null);
        setField(term31834, term31834.getClass(), "type", null);
        setField(term31772, term31772.getClass(), "currentMarker", term31834);
        setField(term31723, term31723.getClass(), "jsdocBuilder", term31772);
        setField(term31723, term31723.getClass(), "sourceFile", null);
        setIntField(term31845, term31845.getClass(), "type", 0);
        setField(term31845, term31845.getClass(), "next", null);
        setField(term31845, term31845.getClass(), "first", null);
        setField(term31845, term31845.getClass(), "last", null);
        setField(term31845, term31845.getClass(), "propListHead", null);
        setIntField(term31845, term31845.getClass(), "sourcePosition", 0);
        setField(term31845, term31845.getClass(), "jsType", null);
        setField(term31845, term31845.getClass(), "parent", null);
        setField(term31723, term31723.getClass(), "associatedNode", term31845);
        setField(term31723, term31723.getClass(), "errorReporter", null);
        setField(term31723, term31723.getClass(), "parser", null);
        setField(term31723, term31723.getClass(), "templateNode", null);
        setField(term31723, term31723.getClass(), "fileOverviewJSDocInfo", null);
        setField(term31723, term31723.getClass(), "state", null);
        setField(term31723, term31723.getClass(), "annotationNames", null);
        setField(term31723, term31723.getClass(), "suppressionNames", null);
        setField(term31723, term31723.getClass(), "fileLevelJsDocBuilder", null);
        setField(term31723, term31723.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "eatUntilEOLIfNotAnnotation", argTypes, term31723, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


