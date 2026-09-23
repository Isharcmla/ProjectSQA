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
import java.lang.String;

public class JsDocInfoParser_eatTokensUntilEOL_1389978967110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27679;
     Object enum226;

    public JsDocInfoParser_eatTokensUntilEOL_1389978967110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27731 = new ArrayList();
        ((ArrayList) term27731).add((Object)null);
        ArrayList term27734 = new ArrayList();
        ((ArrayList) term27734).add((Object)null);
        ((ArrayList) term27734).add((Object)null);
        ((ArrayList) term27734).add((Object)null);
        ((ArrayList) term27734).add((Object)null);
        ((ArrayList) term27734).add((Object)null);
        ((ArrayList) term27734).add((Object)null);
        HashMap term27737 = new HashMap();
        ArrayList term27742 = new ArrayList();
        ((ArrayList) term27742).add((Object)null);
        ((ArrayList) term27742).add((Object)null);
        ((ArrayList) term27742).add((Object)null);
        ((ArrayList) term27742).add((Object)null);
        ((ArrayList) term27742).add((Object)null);
        ((ArrayList) term27742).add((Object)null);
        ((ArrayList) term27742).add((Object)null);
        ((ArrayList) term27742).add((Object)null);
        Class<? extends Object> term122965 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term122964 = ((Class) term122965).getDeclaredField((String) "PUBLIC");
        ((Field) term122964).setAccessible(true);
        Object enum225 = ((Field) term122964).get((Object) null);
        term27679 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term27680 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term27693 = (char[]) newCharArray(2);
        int[] term27697 = (int[]) newIntArray(4);
        Object term27727 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term27728 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term27729 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term27730 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27746 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term27747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27763 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27771 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term27772 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term27777 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term27782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27680, term27680.getClass(), "string", "GSzQdbHLHw");
        setCharElement(term27693, 0, 'h');
        setCharElement(term27693, 1, 'Y');
        setField(term27680, term27680.getClass(), "stringBuffer", term27693);
        setIntField(term27680, term27680.getClass(), "stringBufferTop", -1261824381);
        setIntElement(term27697, 0, 1594426218);
        setIntElement(term27697, 1, -2060535464);
        setIntElement(term27697, 2, -1242946317);
        setIntElement(term27697, 3, -1541566235);
        setField(term27680, term27680.getClass(), "ungetBuffer", term27697);
        setIntField(term27680, term27680.getClass(), "ungetCursor", -189738995);
        setBooleanField(term27680, term27680.getClass(), "hitEOF", false);
        setIntField(term27680, term27680.getClass(), "lineStart", 1943019963);
        setIntField(term27680, term27680.getClass(), "lineEndChar", 186472650);
        setIntField(term27680, term27680.getClass(), "lineno", 279675992);
        setIntField(term27680, term27680.getClass(), "charno", -1626074989);
        setIntField(term27680, term27680.getClass(), "initCharno", -552272253);
        setIntField(term27680, term27680.getClass(), "initLineno", -633523956);
        setField(term27680, term27680.getClass(), "sourceString", "IkfarsYNJO");
        setIntField(term27680, term27680.getClass(), "sourceEnd", 1761540885);
        setIntField(term27680, term27680.getClass(), "sourceCursor", -168498989);
        setIntField(term27680, term27680.getClass(), "cursor", 388247095);
        setIntField(term27680, term27680.getClass(), "tokenBeg", -1320402633);
        setIntField(term27680, term27680.getClass(), "tokenEnd", 919602316);
        setField(term27679, term27679.getClass(), "stream", term27680);
        setField(term27730, term27730.getClass(), "root", null);
        setField(term27730, term27730.getClass(), "sourceName", null);
        setField(term27729, term27729.getClass(), "baseType", term27730);
        setField(term27729, term27729.getClass(), "extendedInterfaces", term27731);
        setField(term27729, term27729.getClass(), "implementedInterfaces", term27734);
        setField(term27729, term27729.getClass(), "parameters", term27737);
        setField(term27729, term27729.getClass(), "thrownTypes", term27742);
        setField(term27729, term27729.getClass(), "templateTypeNames", null);
        setField(term27729, term27729.getClass(), "classTemplateTypeNames", null);
        setField(term27729, term27729.getClass(), "description", null);
        setField(term27729, term27729.getClass(), "meaning", null);
        setField(term27729, term27729.getClass(), "deprecated", null);
        setField(term27729, term27729.getClass(), "license", null);
        setField(term27729, term27729.getClass(), "suppressions", null);
        setField(term27729, term27729.getClass(), "modifies", null);
        setField(term27729, term27729.getClass(), "lendsName", null);
        setBooleanField(term27729, term27729.getClass(), "ngInject", false);
        setField(term27728, term27728.getClass(), "info", term27729);
        setField(term27746, term27746.getClass(), "sourceComment", null);
        setField(term27746, term27746.getClass(), "markers", null);
        setField(term27746, term27746.getClass(), "parameters", null);
        setField(term27746, term27746.getClass(), "throwsDescriptions", null);
        setField(term27746, term27746.getClass(), "blockDescription", null);
        setField(term27746, term27746.getClass(), "fileOverview", null);
        setField(term27746, term27746.getClass(), "returnDescription", null);
        setField(term27746, term27746.getClass(), "version", null);
        setField(term27746, term27746.getClass(), "authors", null);
        setField(term27746, term27746.getClass(), "sees", null);
        setField(term27728, term27728.getClass(), "documentation", term27746);
        setIntField(term27747, term27747.getClass(), "type", -706222608);
        setIntField(term27749, term27749.getClass(), "type", -2003607923);
        setField(term27749, term27749.getClass(), "next", null);
        setField(term27749, term27749.getClass(), "first", null);
        setField(term27749, term27749.getClass(), "last", null);
        setField(term27749, term27749.getClass(), "propListHead", null);
        setIntField(term27749, term27749.getClass(), "sourcePosition", 0);
        setField(term27749, term27749.getClass(), "jsType", null);
        setField(term27749, term27749.getClass(), "parent", null);
        setField(term27747, term27747.getClass(), "next", term27749);
        setIntField(term27752, term27752.getClass(), "type", 1833713431);
        setField(term27752, term27752.getClass(), "next", term27747);
        setField(term27752, term27752.getClass(), "first", null);
        setField(term27752, term27752.getClass(), "last", term27747);
        setField(term27752, term27752.getClass(), "propListHead", null);
        setIntField(term27752, term27752.getClass(), "sourcePosition", 0);
        setField(term27752, term27752.getClass(), "jsType", null);
        setField(term27752, term27752.getClass(), "parent", null);
        setField(term27747, term27747.getClass(), "first", term27752);
        setIntField(term27755, term27755.getClass(), "type", 0);
        setField(term27755, term27755.getClass(), "next", null);
        setField(term27755, term27755.getClass(), "first", null);
        setField(term27755, term27755.getClass(), "last", null);
        setField(term27755, term27755.getClass(), "propListHead", null);
        setIntField(term27755, term27755.getClass(), "sourcePosition", 0);
        setField(term27755, term27755.getClass(), "jsType", null);
        setField(term27755, term27755.getClass(), "parent", null);
        setField(term27747, term27747.getClass(), "last", term27755);
        setField(term27747, term27747.getClass(), "propListHead", null);
        setIntField(term27747, term27747.getClass(), "sourcePosition", 0);
        setField(term27747, term27747.getClass(), "jsType", null);
        setField(term27747, term27747.getClass(), "parent", null);
        setField(term27728, term27728.getClass(), "associatedNode", term27747);
        setField(term27728, term27728.getClass(), "visibility", enum225);
        setIntField(term27728, term27728.getClass(), "bitset", -179937218);
        setIntField(term27764, term27764.getClass(), "type", 0);
        setField(term27764, term27764.getClass(), "next", null);
        setField(term27764, term27764.getClass(), "first", null);
        setField(term27764, term27764.getClass(), "last", null);
        setField(term27764, term27764.getClass(), "propListHead", null);
        setIntField(term27764, term27764.getClass(), "sourcePosition", 0);
        setField(term27764, term27764.getClass(), "jsType", null);
        setField(term27764, term27764.getClass(), "parent", null);
        setField(term27763, term27763.getClass(), "root", term27764);
        setField(term27763, term27763.getClass(), "sourceName", "");
        setField(term27728, term27728.getClass(), "type", term27763);
        setField(term27728, term27728.getClass(), "thisType", term27763);
        setBooleanField(term27728, term27728.getClass(), "includeDocumentation", false);
        setField(term27727, term27727.getClass(), "currentInfo", term27728);
        setBooleanField(term27727, term27727.getClass(), "populated", false);
        setBooleanField(term27727, term27727.getClass(), "parseDocumentation", false);
        setField(term27772, term27772.getClass(), "item", null);
        setIntField(term27772, term27772.getClass(), "startLineno", 0);
        setIntField(term27772, term27772.getClass(), "startCharno", 0);
        setIntField(term27772, term27772.getClass(), "endLineno", 0);
        setIntField(term27772, term27772.getClass(), "endCharno", 0);
        setField(term27771, term27771.getClass(), "annotation", term27772);
        setField(term27777, term27777.getClass(), "item", null);
        setIntField(term27777, term27777.getClass(), "startLineno", 0);
        setIntField(term27777, term27777.getClass(), "startCharno", 0);
        setIntField(term27777, term27777.getClass(), "endLineno", 0);
        setIntField(term27777, term27777.getClass(), "endCharno", 0);
        setField(term27771, term27771.getClass(), "name", term27777);
        setField(term27771, term27771.getClass(), "nameNode", null);
        setField(term27771, term27771.getClass(), "description", null);
        setField(term27771, term27771.getClass(), "type", null);
        setField(term27727, term27727.getClass(), "currentMarker", term27771);
        setField(term27679, term27679.getClass(), "jsdocBuilder", term27727);
        setField(term27679, term27679.getClass(), "sourceFile", null);
        setIntField(term27782, term27782.getClass(), "type", 0);
        setField(term27782, term27782.getClass(), "next", null);
        setField(term27782, term27782.getClass(), "first", null);
        setField(term27782, term27782.getClass(), "last", null);
        setField(term27782, term27782.getClass(), "propListHead", null);
        setIntField(term27782, term27782.getClass(), "sourcePosition", 0);
        setField(term27782, term27782.getClass(), "jsType", null);
        setField(term27782, term27782.getClass(), "parent", null);
        setField(term27679, term27679.getClass(), "associatedNode", term27782);
        setField(term27679, term27679.getClass(), "errorReporter", null);
        setField(term27679, term27679.getClass(), "parser", null);
        setField(term27679, term27679.getClass(), "templateNode", null);
        setField(term27679, term27679.getClass(), "fileOverviewJSDocInfo", null);
        setField(term27679, term27679.getClass(), "state", null);
        setField(term27679, term27679.getClass(), "annotationNames", null);
        setField(term27679, term27679.getClass(), "suppressionNames", null);
        setField(term27679, term27679.getClass(), "fileLevelJsDocBuilder", null);
        setField(term27679, term27679.getClass(), "unreadToken", null);
        Class<? extends Object> term123230 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term123229 = ((Class) term123230).getDeclaredField((String) "EQUALS");
        ((Field) term123229).setAccessible(true);
        enum226 = ((Field) term123229).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum226;
        try {
            callMethod(klass, "eatTokensUntilEOL", argTypes, term27679, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


