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

public class JsDocInfoParser_extractSingleLineBlock_146000636079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9410;

    public JsDocInfoParser_extractSingleLineBlock_146000636079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9465 = new ArrayList();
        ((ArrayList) term9465).add((Object)null);
        ((ArrayList) term9465).add((Object)null);
        ((ArrayList) term9465).add((Object)null);
        ((ArrayList) term9465).add((Object)null);
        ((ArrayList) term9465).add((Object)null);
        ((ArrayList) term9465).add((Object)null);
        ((ArrayList) term9465).add((Object)null);
        ((ArrayList) term9465).add((Object)null);
        ArrayList term9468 = new ArrayList();
        ((ArrayList) term9468).add((Object)null);
        ((ArrayList) term9468).add((Object)null);
        ((ArrayList) term9468).add((Object)null);
        ((ArrayList) term9468).add((Object)null);
        ((ArrayList) term9468).add((Object)null);
        ((ArrayList) term9468).add((Object)null);
        ((ArrayList) term9468).add((Object)null);
        ((ArrayList) term9468).add((Object)null);
        HashMap term9471 = new HashMap();
        ArrayList term9476 = new ArrayList();
        ((ArrayList) term9476).add((Object)null);
        ((ArrayList) term9476).add((Object)null);
        ((ArrayList) term9476).add((Object)null);
        ((ArrayList) term9476).add((Object)null);
        ((ArrayList) term9476).add((Object)null);
        Class<? extends Object> term95654 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term95653 = ((Class) term95654).getDeclaredField((String) "PRIVATE");
        ((Field) term95653).setAccessible(true);
        Object enum171 = ((Field) term95653).get((Object) null);
        term9410 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term9411 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term9424 = (char[]) newCharArray(4);
        int[] term9430 = (int[]) newIntArray(5);
        Object term9461 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term9462 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9463 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term9464 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9480 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term9481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9488 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9493 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9501 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term9502 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term9507 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term9512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9411, term9411.getClass(), "string", "CFyoseFGLF");
        setCharElement(term9424, 0, 'S');
        setCharElement(term9424, 1, 'z');
        setCharElement(term9424, 2, 'j');
        setCharElement(term9424, 3, 'V');
        setField(term9411, term9411.getClass(), "stringBuffer", term9424);
        setIntField(term9411, term9411.getClass(), "stringBufferTop", 1723148410);
        setIntElement(term9430, 0, -920797484);
        setIntElement(term9430, 1, -1631697577);
        setIntElement(term9430, 2, 765731371);
        setIntElement(term9430, 3, -1703035419);
        setIntElement(term9430, 4, 765766290);
        setField(term9411, term9411.getClass(), "ungetBuffer", term9430);
        setIntField(term9411, term9411.getClass(), "ungetCursor", -1284825282);
        setBooleanField(term9411, term9411.getClass(), "hitEOF", false);
        setIntField(term9411, term9411.getClass(), "lineStart", -1941343035);
        setIntField(term9411, term9411.getClass(), "lineEndChar", 947897214);
        setIntField(term9411, term9411.getClass(), "lineno", 1496340209);
        setIntField(term9411, term9411.getClass(), "charno", -1748391876);
        setIntField(term9411, term9411.getClass(), "initCharno", 43258317);
        setIntField(term9411, term9411.getClass(), "initLineno", 1707220033);
        setField(term9411, term9411.getClass(), "sourceString", "SFqCrhEWLm");
        setIntField(term9411, term9411.getClass(), "sourceEnd", -1792504217);
        setIntField(term9411, term9411.getClass(), "sourceCursor", 1824538861);
        setIntField(term9411, term9411.getClass(), "cursor", 499519708);
        setIntField(term9411, term9411.getClass(), "tokenBeg", 1501165033);
        setIntField(term9411, term9411.getClass(), "tokenEnd", 510162332);
        setField(term9410, term9410.getClass(), "stream", term9411);
        setField(term9464, term9464.getClass(), "root", null);
        setField(term9464, term9464.getClass(), "sourceName", null);
        setField(term9463, term9463.getClass(), "baseType", term9464);
        setField(term9463, term9463.getClass(), "extendedInterfaces", term9465);
        setField(term9463, term9463.getClass(), "implementedInterfaces", term9468);
        setField(term9463, term9463.getClass(), "parameters", term9471);
        setField(term9463, term9463.getClass(), "thrownTypes", term9476);
        setField(term9463, term9463.getClass(), "templateTypeNames", null);
        setField(term9463, term9463.getClass(), "classTemplateTypeNames", null);
        setField(term9463, term9463.getClass(), "description", null);
        setField(term9463, term9463.getClass(), "meaning", null);
        setField(term9463, term9463.getClass(), "deprecated", null);
        setField(term9463, term9463.getClass(), "license", null);
        setField(term9463, term9463.getClass(), "suppressions", null);
        setField(term9463, term9463.getClass(), "modifies", null);
        setField(term9463, term9463.getClass(), "lendsName", null);
        setBooleanField(term9463, term9463.getClass(), "ngInject", false);
        setField(term9462, term9462.getClass(), "info", term9463);
        setField(term9480, term9480.getClass(), "sourceComment", null);
        setField(term9480, term9480.getClass(), "markers", null);
        setField(term9480, term9480.getClass(), "parameters", null);
        setField(term9480, term9480.getClass(), "throwsDescriptions", null);
        setField(term9480, term9480.getClass(), "blockDescription", null);
        setField(term9480, term9480.getClass(), "fileOverview", null);
        setField(term9480, term9480.getClass(), "returnDescription", null);
        setField(term9480, term9480.getClass(), "version", null);
        setField(term9480, term9480.getClass(), "authors", null);
        setField(term9480, term9480.getClass(), "sees", null);
        setField(term9462, term9462.getClass(), "documentation", term9480);
        setIntField(term9481, term9481.getClass(), "type", 0);
        setField(term9481, term9481.getClass(), "next", null);
        setField(term9481, term9481.getClass(), "first", null);
        setField(term9481, term9481.getClass(), "last", null);
        setField(term9481, term9481.getClass(), "propListHead", null);
        setIntField(term9481, term9481.getClass(), "sourcePosition", 0);
        setField(term9481, term9481.getClass(), "jsType", null);
        setField(term9481, term9481.getClass(), "parent", null);
        setField(term9462, term9462.getClass(), "associatedNode", term9481);
        setField(term9462, term9462.getClass(), "visibility", enum171);
        setIntField(term9462, term9462.getClass(), "bitset", -266625190);
        setIntField(term9489, term9489.getClass(), "type", -1577069773);
        setField(term9489, term9489.getClass(), "next", null);
        setField(term9489, term9489.getClass(), "first", term9481);
        setField(term9489, term9489.getClass(), "last", null);
        setField(term9489, term9489.getClass(), "propListHead", null);
        setIntField(term9489, term9489.getClass(), "sourcePosition", 0);
        setField(term9489, term9489.getClass(), "jsType", null);
        setField(term9489, term9489.getClass(), "parent", null);
        setField(term9488, term9488.getClass(), "root", term9489);
        setField(term9488, term9488.getClass(), "sourceName", "");
        setField(term9462, term9462.getClass(), "type", term9488);
        setIntField(term9494, term9494.getClass(), "type", 200252898);
        setField(term9494, term9494.getClass(), "next", null);
        setField(term9494, term9494.getClass(), "first", null);
        setField(term9494, term9494.getClass(), "last", null);
        setField(term9494, term9494.getClass(), "propListHead", null);
        setIntField(term9494, term9494.getClass(), "sourcePosition", 0);
        setField(term9494, term9494.getClass(), "jsType", null);
        setField(term9494, term9494.getClass(), "parent", null);
        setField(term9493, term9493.getClass(), "root", term9494);
        setField(term9493, term9493.getClass(), "sourceName", "");
        setField(term9462, term9462.getClass(), "thisType", term9493);
        setBooleanField(term9462, term9462.getClass(), "includeDocumentation", false);
        setField(term9461, term9461.getClass(), "currentInfo", term9462);
        setBooleanField(term9461, term9461.getClass(), "populated", false);
        setBooleanField(term9461, term9461.getClass(), "parseDocumentation", false);
        setField(term9502, term9502.getClass(), "item", null);
        setIntField(term9502, term9502.getClass(), "startLineno", 0);
        setIntField(term9502, term9502.getClass(), "startCharno", 0);
        setIntField(term9502, term9502.getClass(), "endLineno", 0);
        setIntField(term9502, term9502.getClass(), "endCharno", 0);
        setField(term9501, term9501.getClass(), "annotation", term9502);
        setField(term9507, term9507.getClass(), "item", null);
        setIntField(term9507, term9507.getClass(), "startLineno", 0);
        setIntField(term9507, term9507.getClass(), "startCharno", 0);
        setIntField(term9507, term9507.getClass(), "endLineno", 0);
        setIntField(term9507, term9507.getClass(), "endCharno", 0);
        setField(term9501, term9501.getClass(), "name", term9507);
        setField(term9501, term9501.getClass(), "nameNode", null);
        setField(term9501, term9501.getClass(), "description", null);
        setField(term9501, term9501.getClass(), "type", null);
        setField(term9461, term9461.getClass(), "currentMarker", term9501);
        setField(term9410, term9410.getClass(), "jsdocBuilder", term9461);
        setField(term9410, term9410.getClass(), "sourceFile", null);
        setIntField(term9512, term9512.getClass(), "type", 0);
        setField(term9512, term9512.getClass(), "next", null);
        setField(term9512, term9512.getClass(), "first", null);
        setField(term9512, term9512.getClass(), "last", null);
        setField(term9512, term9512.getClass(), "propListHead", null);
        setIntField(term9512, term9512.getClass(), "sourcePosition", 0);
        setField(term9512, term9512.getClass(), "jsType", null);
        setField(term9512, term9512.getClass(), "parent", null);
        setField(term9410, term9410.getClass(), "associatedNode", term9512);
        setField(term9410, term9410.getClass(), "errorReporter", null);
        setField(term9410, term9410.getClass(), "parser", null);
        setField(term9410, term9410.getClass(), "templateNode", null);
        setField(term9410, term9410.getClass(), "fileOverviewJSDocInfo", null);
        setField(term9410, term9410.getClass(), "state", null);
        setField(term9410, term9410.getClass(), "annotationNames", null);
        setField(term9410, term9410.getClass(), "suppressionNames", null);
        setField(term9410, term9410.getClass(), "fileLevelJsDocBuilder", null);
        setField(term9410, term9410.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "extractSingleLineBlock", argTypes, term9410, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


