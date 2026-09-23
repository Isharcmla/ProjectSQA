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

public class JsDocInfoParser_parseRecordType_180723803298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21648;
     Object enum210;

    public JsDocInfoParser_parseRecordType_180723803298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21704 = new ArrayList();
        ((ArrayList) term21704).add((Object)null);
        ((ArrayList) term21704).add((Object)null);
        ((ArrayList) term21704).add((Object)null);
        ((ArrayList) term21704).add((Object)null);
        ((ArrayList) term21704).add((Object)null);
        ArrayList term21707 = new ArrayList();
        ((ArrayList) term21707).add((Object)null);
        ((ArrayList) term21707).add((Object)null);
        ((ArrayList) term21707).add((Object)null);
        ((ArrayList) term21707).add((Object)null);
        HashMap term21710 = new HashMap();
        ArrayList term21715 = new ArrayList();
        ((ArrayList) term21715).add((Object)null);
        ((ArrayList) term21715).add((Object)null);
        ((ArrayList) term21715).add((Object)null);
        ((ArrayList) term21715).add((Object)null);
        ((ArrayList) term21715).add((Object)null);
        ((ArrayList) term21715).add((Object)null);
        ((ArrayList) term21715).add((Object)null);
        Class<? extends Object> term117974 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term117973 = ((Class) term117974).getDeclaredField((String) "PRIVATE");
        ((Field) term117973).setAccessible(true);
        Object enum209 = ((Field) term117973).get((Object) null);
        term21648 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term21649 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term21662 = (char[]) newCharArray(5);
        int[] term21669 = (int[]) newIntArray(5);
        Object term21700 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term21701 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term21702 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term21703 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term21719 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term21720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21727 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term21728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21732 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term21733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21740 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term21741 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term21746 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term21649, term21649.getClass(), "string", "UuYWMTqWTV");
        setCharElement(term21662, 0, 'l');
        setCharElement(term21662, 1, 'i');
        setCharElement(term21662, 2, 'e');
        setCharElement(term21662, 3, 'C');
        setCharElement(term21662, 4, 'F');
        setField(term21649, term21649.getClass(), "stringBuffer", term21662);
        setIntField(term21649, term21649.getClass(), "stringBufferTop", 47118909);
        setIntElement(term21669, 0, -2093707412);
        setIntElement(term21669, 1, -680627153);
        setIntElement(term21669, 2, 722519669);
        setIntElement(term21669, 3, -40335961);
        setIntElement(term21669, 4, 175343605);
        setField(term21649, term21649.getClass(), "ungetBuffer", term21669);
        setIntField(term21649, term21649.getClass(), "ungetCursor", 1050853183);
        setBooleanField(term21649, term21649.getClass(), "hitEOF", false);
        setIntField(term21649, term21649.getClass(), "lineStart", 848428785);
        setIntField(term21649, term21649.getClass(), "lineEndChar", -1984436481);
        setIntField(term21649, term21649.getClass(), "lineno", -407582855);
        setIntField(term21649, term21649.getClass(), "charno", 1190753616);
        setIntField(term21649, term21649.getClass(), "initCharno", -752378450);
        setIntField(term21649, term21649.getClass(), "initLineno", 848907965);
        setField(term21649, term21649.getClass(), "sourceString", "DSFGlcaXUb");
        setIntField(term21649, term21649.getClass(), "sourceEnd", 1865070548);
        setIntField(term21649, term21649.getClass(), "sourceCursor", 1904515443);
        setIntField(term21649, term21649.getClass(), "cursor", 1361126430);
        setIntField(term21649, term21649.getClass(), "tokenBeg", 1728588701);
        setIntField(term21649, term21649.getClass(), "tokenEnd", -355769268);
        setField(term21648, term21648.getClass(), "stream", term21649);
        setField(term21703, term21703.getClass(), "root", null);
        setField(term21703, term21703.getClass(), "sourceName", null);
        setField(term21702, term21702.getClass(), "baseType", term21703);
        setField(term21702, term21702.getClass(), "extendedInterfaces", term21704);
        setField(term21702, term21702.getClass(), "implementedInterfaces", term21707);
        setField(term21702, term21702.getClass(), "parameters", term21710);
        setField(term21702, term21702.getClass(), "thrownTypes", term21715);
        setField(term21702, term21702.getClass(), "templateTypeNames", null);
        setField(term21702, term21702.getClass(), "classTemplateTypeNames", null);
        setField(term21702, term21702.getClass(), "description", null);
        setField(term21702, term21702.getClass(), "meaning", null);
        setField(term21702, term21702.getClass(), "deprecated", null);
        setField(term21702, term21702.getClass(), "license", null);
        setField(term21702, term21702.getClass(), "suppressions", null);
        setField(term21702, term21702.getClass(), "modifies", null);
        setField(term21702, term21702.getClass(), "lendsName", null);
        setBooleanField(term21702, term21702.getClass(), "ngInject", false);
        setField(term21701, term21701.getClass(), "info", term21702);
        setField(term21719, term21719.getClass(), "sourceComment", null);
        setField(term21719, term21719.getClass(), "markers", null);
        setField(term21719, term21719.getClass(), "parameters", null);
        setField(term21719, term21719.getClass(), "throwsDescriptions", null);
        setField(term21719, term21719.getClass(), "blockDescription", null);
        setField(term21719, term21719.getClass(), "fileOverview", null);
        setField(term21719, term21719.getClass(), "returnDescription", null);
        setField(term21719, term21719.getClass(), "version", null);
        setField(term21719, term21719.getClass(), "authors", null);
        setField(term21719, term21719.getClass(), "sees", null);
        setField(term21701, term21701.getClass(), "documentation", term21719);
        setIntField(term21720, term21720.getClass(), "type", 0);
        setField(term21720, term21720.getClass(), "next", null);
        setField(term21720, term21720.getClass(), "first", null);
        setField(term21720, term21720.getClass(), "last", null);
        setField(term21720, term21720.getClass(), "propListHead", null);
        setIntField(term21720, term21720.getClass(), "sourcePosition", 0);
        setField(term21720, term21720.getClass(), "jsType", null);
        setField(term21720, term21720.getClass(), "parent", null);
        setField(term21701, term21701.getClass(), "associatedNode", term21720);
        setField(term21701, term21701.getClass(), "visibility", enum209);
        setIntField(term21701, term21701.getClass(), "bitset", -337504086);
        setIntField(term21728, term21728.getClass(), "type", 0);
        setField(term21728, term21728.getClass(), "next", null);
        setField(term21728, term21728.getClass(), "first", null);
        setField(term21728, term21728.getClass(), "last", null);
        setField(term21728, term21728.getClass(), "propListHead", null);
        setIntField(term21728, term21728.getClass(), "sourcePosition", 0);
        setField(term21728, term21728.getClass(), "jsType", null);
        setField(term21728, term21728.getClass(), "parent", null);
        setField(term21727, term21727.getClass(), "root", term21728);
        setField(term21727, term21727.getClass(), "sourceName", "");
        setField(term21701, term21701.getClass(), "type", term21727);
        setIntField(term21733, term21733.getClass(), "type", 0);
        setField(term21733, term21733.getClass(), "next", null);
        setField(term21733, term21733.getClass(), "first", null);
        setField(term21733, term21733.getClass(), "last", null);
        setField(term21733, term21733.getClass(), "propListHead", null);
        setIntField(term21733, term21733.getClass(), "sourcePosition", 0);
        setField(term21733, term21733.getClass(), "jsType", null);
        setField(term21733, term21733.getClass(), "parent", null);
        setField(term21732, term21732.getClass(), "root", term21733);
        setField(term21732, term21732.getClass(), "sourceName", "");
        setField(term21701, term21701.getClass(), "thisType", term21732);
        setBooleanField(term21701, term21701.getClass(), "includeDocumentation", true);
        setField(term21700, term21700.getClass(), "currentInfo", term21701);
        setBooleanField(term21700, term21700.getClass(), "populated", false);
        setBooleanField(term21700, term21700.getClass(), "parseDocumentation", false);
        setField(term21741, term21741.getClass(), "item", null);
        setIntField(term21741, term21741.getClass(), "startLineno", 0);
        setIntField(term21741, term21741.getClass(), "startCharno", 0);
        setIntField(term21741, term21741.getClass(), "endLineno", 0);
        setIntField(term21741, term21741.getClass(), "endCharno", 0);
        setField(term21740, term21740.getClass(), "annotation", term21741);
        setField(term21746, term21746.getClass(), "item", null);
        setIntField(term21746, term21746.getClass(), "startLineno", 0);
        setIntField(term21746, term21746.getClass(), "startCharno", 0);
        setIntField(term21746, term21746.getClass(), "endLineno", 0);
        setIntField(term21746, term21746.getClass(), "endCharno", 0);
        setField(term21740, term21740.getClass(), "name", term21746);
        setField(term21740, term21740.getClass(), "nameNode", null);
        setField(term21740, term21740.getClass(), "description", null);
        setField(term21740, term21740.getClass(), "type", null);
        setField(term21700, term21700.getClass(), "currentMarker", term21740);
        setField(term21648, term21648.getClass(), "jsdocBuilder", term21700);
        setField(term21648, term21648.getClass(), "sourceFile", null);
        setField(term21648, term21648.getClass(), "associatedNode", term21728);
        setField(term21648, term21648.getClass(), "errorReporter", null);
        setField(term21648, term21648.getClass(), "parser", null);
        setField(term21648, term21648.getClass(), "templateNode", null);
        setField(term21648, term21648.getClass(), "fileOverviewJSDocInfo", null);
        setField(term21648, term21648.getClass(), "state", null);
        setField(term21648, term21648.getClass(), "annotationNames", null);
        setField(term21648, term21648.getClass(), "suppressionNames", null);
        setField(term21648, term21648.getClass(), "fileLevelJsDocBuilder", null);
        setField(term21648, term21648.getClass(), "unreadToken", null);
        Class<? extends Object> term118242 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term118241 = ((Class) term118242).getDeclaredField((String) "LP");
        ((Field) term118241).setAccessible(true);
        enum210 = ((Field) term118241).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum210;
        try {
            callMethod(klass, "parseRecordType", argTypes, term21648, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


