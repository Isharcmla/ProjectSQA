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

public class JsDocInfoParser_parseContextTypeExpression_559794752103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19586;
     Object enum223;

    public JsDocInfoParser_parseContextTypeExpression_559794752103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19638 = new ArrayList();
        ((ArrayList) term19638).add((Object)null);
        ((ArrayList) term19638).add((Object)null);
        ((ArrayList) term19638).add((Object)null);
        ((ArrayList) term19638).add((Object)null);
        ((ArrayList) term19638).add((Object)null);
        ((ArrayList) term19638).add((Object)null);
        ArrayList term19641 = new ArrayList();
        ((ArrayList) term19641).add((Object)null);
        ((ArrayList) term19641).add((Object)null);
        ((ArrayList) term19641).add((Object)null);
        ((ArrayList) term19641).add((Object)null);
        HashMap term19644 = new HashMap();
        ArrayList term19649 = new ArrayList();
        HashSet term19652 = new HashSet();
        HashSet term19657 = new HashSet();
        HashSet term19658 = new HashSet();
        ArrayList term19667 = new ArrayList();
        ((ArrayList) term19667).add((Object)null);
        ((ArrayList) term19667).add((Object)null);
        ((ArrayList) term19667).add((Object)null);
        ((ArrayList) term19667).add((Object)null);
        ((ArrayList) term19667).add((Object)null);
        ((ArrayList) term19667).add((Object)null);
        HashMap term19670 = new HashMap();
        Class<? extends Object> term151209 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term151208 = ((Class) term151209).getDeclaredField((String) "PUBLIC");
        ((Field) term151208).setAccessible(true);
        Object enum222 = ((Field) term151208).get((Object) null);
        term19586 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term19587 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term19600 = (char[]) newCharArray(4);
        int[] term19606 = (int[]) newIntArray(2);
        Object term19634 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term19635 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19636 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term19637 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19665 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term19675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19682 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19687 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19693 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term19694 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19699 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19587, term19587.getClass(), "string", "YyojIzvxLZ");
        setCharElement(term19600, 0, 'H');
        setCharElement(term19600, 1, 'E');
        setCharElement(term19600, 2, 'w');
        setCharElement(term19600, 3, 'X');
        setField(term19587, term19587.getClass(), "stringBuffer", term19600);
        setIntField(term19587, term19587.getClass(), "stringBufferTop", -537786484);
        setIntElement(term19606, 0, 263859424);
        setIntElement(term19606, 1, 1436978289);
        setField(term19587, term19587.getClass(), "ungetBuffer", term19606);
        setIntField(term19587, term19587.getClass(), "ungetCursor", 696225243);
        setBooleanField(term19587, term19587.getClass(), "hitEOF", false);
        setIntField(term19587, term19587.getClass(), "lineStart", -1421649118);
        setIntField(term19587, term19587.getClass(), "lineEndChar", -511248284);
        setIntField(term19587, term19587.getClass(), "lineno", 788630042);
        setIntField(term19587, term19587.getClass(), "charno", 1430066560);
        setIntField(term19587, term19587.getClass(), "initCharno", 836734074);
        setIntField(term19587, term19587.getClass(), "initLineno", -1747711865);
        setField(term19587, term19587.getClass(), "sourceString", "fxapaYlZea");
        setIntField(term19587, term19587.getClass(), "sourceEnd", 682812715);
        setIntField(term19587, term19587.getClass(), "sourceCursor", -1092883950);
        setIntField(term19587, term19587.getClass(), "cursor", 950385621);
        setIntField(term19587, term19587.getClass(), "tokenBeg", -232352320);
        setIntField(term19587, term19587.getClass(), "tokenEnd", -232333014);
        setField(term19586, term19586.getClass(), "stream", term19587);
        setField(term19637, term19637.getClass(), "root", null);
        setField(term19637, term19637.getClass(), "sourceName", null);
        setField(term19636, term19636.getClass(), "baseType", term19637);
        setField(term19636, term19636.getClass(), "extendedInterfaces", term19638);
        setField(term19636, term19636.getClass(), "implementedInterfaces", term19641);
        setField(term19636, term19636.getClass(), "parameters", term19644);
        setField(term19636, term19636.getClass(), "thrownTypes", term19649);
        setField(term19636, term19636.getClass(), "templateTypeNames", null);
        setField(term19636, term19636.getClass(), "disposedParameters", term19652);
        setField(term19636, term19636.getClass(), "description", "");
        setField(term19636, term19636.getClass(), "meaning", "");
        setField(term19636, term19636.getClass(), "deprecated", "");
        setField(term19636, term19636.getClass(), "license", "");
        setField(term19636, term19636.getClass(), "suppressions", term19657);
        setField(term19636, term19636.getClass(), "modifies", term19658);
        setField(term19636, term19636.getClass(), "lendsName", "");
        setBooleanField(term19636, term19636.getClass(), "ngInject", false);
        setBooleanField(term19636, term19636.getClass(), "wizaction", false);
        setBooleanField(term19636, term19636.getClass(), "jaggerInject", false);
        setBooleanField(term19636, term19636.getClass(), "jaggerProvide", false);
        setBooleanField(term19636, term19636.getClass(), "jaggerModule", true);
        setField(term19635, term19635.getClass(), "info", term19636);
        setField(term19665, term19665.getClass(), "sourceComment", "");
        setField(term19665, term19665.getClass(), "markers", term19667);
        setField(term19665, term19665.getClass(), "parameters", term19670);
        setField(term19665, term19665.getClass(), "throwsDescriptions", null);
        setField(term19665, term19665.getClass(), "blockDescription", null);
        setField(term19665, term19665.getClass(), "fileOverview", null);
        setField(term19665, term19665.getClass(), "returnDescription", null);
        setField(term19665, term19665.getClass(), "version", null);
        setField(term19665, term19665.getClass(), "authors", null);
        setField(term19665, term19665.getClass(), "sees", null);
        setField(term19635, term19635.getClass(), "documentation", term19665);
        setIntField(term19675, term19675.getClass(), "type", 0);
        setField(term19675, term19675.getClass(), "next", null);
        setField(term19675, term19675.getClass(), "first", null);
        setField(term19675, term19675.getClass(), "last", null);
        setField(term19675, term19675.getClass(), "propListHead", null);
        setIntField(term19675, term19675.getClass(), "sourcePosition", 0);
        setField(term19675, term19675.getClass(), "jsType", null);
        setField(term19675, term19675.getClass(), "parent", null);
        setField(term19635, term19635.getClass(), "associatedNode", term19675);
        setField(term19635, term19635.getClass(), "visibility", enum222);
        setIntField(term19635, term19635.getClass(), "bitset", 1983756621);
        setIntField(term19683, term19683.getClass(), "type", 0);
        setField(term19683, term19683.getClass(), "next", null);
        setField(term19683, term19683.getClass(), "first", null);
        setField(term19683, term19683.getClass(), "last", null);
        setField(term19683, term19683.getClass(), "propListHead", null);
        setIntField(term19683, term19683.getClass(), "sourcePosition", 0);
        setField(term19683, term19683.getClass(), "jsType", null);
        setField(term19683, term19683.getClass(), "parent", null);
        setField(term19682, term19682.getClass(), "root", term19683);
        setField(term19682, term19682.getClass(), "sourceName", "");
        setField(term19635, term19635.getClass(), "type", term19682);
        setField(term19687, term19687.getClass(), "root", term19683);
        setField(term19687, term19687.getClass(), "sourceName", "");
        setField(term19635, term19635.getClass(), "thisType", term19687);
        setBooleanField(term19635, term19635.getClass(), "includeDocumentation", true);
        setIntField(term19635, term19635.getClass(), "originalCommentPosition", -2134711835);
        setField(term19634, term19634.getClass(), "currentInfo", term19635);
        setBooleanField(term19634, term19634.getClass(), "populated", false);
        setBooleanField(term19634, term19634.getClass(), "parseDocumentation", true);
        setField(term19694, term19694.getClass(), "item", null);
        setIntField(term19694, term19694.getClass(), "startLineno", 0);
        setIntField(term19694, term19694.getClass(), "startCharno", 0);
        setIntField(term19694, term19694.getClass(), "endLineno", 0);
        setIntField(term19694, term19694.getClass(), "endCharno", 0);
        setField(term19693, term19693.getClass(), "annotation", term19694);
        setField(term19699, term19699.getClass(), "item", null);
        setIntField(term19699, term19699.getClass(), "startLineno", 0);
        setIntField(term19699, term19699.getClass(), "startCharno", 0);
        setIntField(term19699, term19699.getClass(), "endLineno", 0);
        setIntField(term19699, term19699.getClass(), "endCharno", 0);
        setField(term19693, term19693.getClass(), "name", term19699);
        setField(term19693, term19693.getClass(), "nameNode", null);
        setField(term19693, term19693.getClass(), "description", null);
        setField(term19693, term19693.getClass(), "type", null);
        setField(term19634, term19634.getClass(), "currentMarker", term19693);
        setField(term19586, term19586.getClass(), "jsdocBuilder", term19634);
        setField(term19586, term19586.getClass(), "sourceFile", null);
        setIntField(term19704, term19704.getClass(), "type", 434914590);
        setIntField(term19706, term19706.getClass(), "type", 0);
        setField(term19706, term19706.getClass(), "next", null);
        setField(term19706, term19706.getClass(), "first", null);
        setField(term19706, term19706.getClass(), "last", null);
        setField(term19706, term19706.getClass(), "propListHead", null);
        setIntField(term19706, term19706.getClass(), "sourcePosition", 0);
        setField(term19706, term19706.getClass(), "jsType", null);
        setField(term19706, term19706.getClass(), "parent", null);
        setField(term19704, term19704.getClass(), "next", term19706);
        setIntField(term19709, term19709.getClass(), "type", 0);
        setField(term19709, term19709.getClass(), "next", null);
        setField(term19709, term19709.getClass(), "first", null);
        setField(term19709, term19709.getClass(), "last", null);
        setField(term19709, term19709.getClass(), "propListHead", null);
        setIntField(term19709, term19709.getClass(), "sourcePosition", 0);
        setField(term19709, term19709.getClass(), "jsType", null);
        setField(term19709, term19709.getClass(), "parent", null);
        setField(term19704, term19704.getClass(), "first", term19709);
        setField(term19704, term19704.getClass(), "last", term19683);
        setField(term19704, term19704.getClass(), "propListHead", null);
        setIntField(term19704, term19704.getClass(), "sourcePosition", 0);
        setField(term19704, term19704.getClass(), "jsType", null);
        setField(term19704, term19704.getClass(), "parent", null);
        setField(term19586, term19586.getClass(), "associatedNode", term19704);
        setField(term19586, term19586.getClass(), "errorReporter", null);
        setField(term19586, term19586.getClass(), "parser", null);
        setField(term19586, term19586.getClass(), "templateNode", null);
        setField(term19586, term19586.getClass(), "fileOverviewJSDocInfo", null);
        setField(term19586, term19586.getClass(), "state", null);
        setField(term19586, term19586.getClass(), "annotationNames", null);
        setField(term19586, term19586.getClass(), "suppressionNames", null);
        setField(term19586, term19586.getClass(), "fileLevelJsDocBuilder", null);
        setField(term19586, term19586.getClass(), "unreadToken", null);
        Class<? extends Object> term151474 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term151473 = ((Class) term151474).getDeclaredField((String) "STRING");
        ((Field) term151473).setAccessible(true);
        enum223 = ((Field) term151473).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum223;
        try {
            callMethod(klass, "parseContextTypeExpression", argTypes, term19586, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


