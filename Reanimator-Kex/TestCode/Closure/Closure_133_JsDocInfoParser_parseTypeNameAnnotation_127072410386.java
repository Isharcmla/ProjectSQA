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

public class JsDocInfoParser_parseTypeNameAnnotation_127072410386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13570;
     Object enum186;

    public JsDocInfoParser_parseTypeNameAnnotation_127072410386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13618 = new ArrayList();
        ((ArrayList) term13618).add((Object)null);
        ((ArrayList) term13618).add((Object)null);
        ((ArrayList) term13618).add((Object)null);
        ((ArrayList) term13618).add((Object)null);
        ((ArrayList) term13618).add((Object)null);
        ((ArrayList) term13618).add((Object)null);
        ArrayList term13621 = new ArrayList();
        ((ArrayList) term13621).add((Object)null);
        HashMap term13624 = new HashMap();
        ArrayList term13629 = new ArrayList();
        ((ArrayList) term13629).add((Object)null);
        ((ArrayList) term13629).add((Object)null);
        Class<? extends Object> term106303 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term106302 = ((Class) term106303).getDeclaredField((String) "INHERITED");
        ((Field) term106302).setAccessible(true);
        Object enum185 = ((Field) term106302).get((Object) null);
        term13570 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term13571 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term13584 = (char[]) newCharArray(2);
        int[] term13588 = (int[]) newIntArray(0);
        Object term13614 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term13615 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term13616 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term13617 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term13633 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term13634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13641 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term13642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13649 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term13650 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term13655 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term13660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13571, term13571.getClass(), "string", "wBGfLpNNiZ");
        setCharElement(term13584, 0, 'g');
        setCharElement(term13584, 1, 'n');
        setField(term13571, term13571.getClass(), "stringBuffer", term13584);
        setIntField(term13571, term13571.getClass(), "stringBufferTop", 1136208236);
        setField(term13571, term13571.getClass(), "ungetBuffer", term13588);
        setIntField(term13571, term13571.getClass(), "ungetCursor", -1220630391);
        setBooleanField(term13571, term13571.getClass(), "hitEOF", true);
        setIntField(term13571, term13571.getClass(), "lineStart", -995822131);
        setIntField(term13571, term13571.getClass(), "lineEndChar", -687282231);
        setIntField(term13571, term13571.getClass(), "lineno", 1200440315);
        setIntField(term13571, term13571.getClass(), "charno", 40571662);
        setIntField(term13571, term13571.getClass(), "initCharno", 1863910269);
        setIntField(term13571, term13571.getClass(), "initLineno", 864645689);
        setField(term13571, term13571.getClass(), "sourceString", "yUGCjlqgJE");
        setIntField(term13571, term13571.getClass(), "sourceEnd", 279384872);
        setIntField(term13571, term13571.getClass(), "sourceCursor", 1427305953);
        setIntField(term13571, term13571.getClass(), "cursor", -781832877);
        setIntField(term13571, term13571.getClass(), "tokenBeg", 797203987);
        setIntField(term13571, term13571.getClass(), "tokenEnd", 1973060703);
        setField(term13570, term13570.getClass(), "stream", term13571);
        setField(term13617, term13617.getClass(), "root", null);
        setField(term13617, term13617.getClass(), "sourceName", null);
        setField(term13616, term13616.getClass(), "baseType", term13617);
        setField(term13616, term13616.getClass(), "extendedInterfaces", term13618);
        setField(term13616, term13616.getClass(), "implementedInterfaces", term13621);
        setField(term13616, term13616.getClass(), "parameters", term13624);
        setField(term13616, term13616.getClass(), "thrownTypes", term13629);
        setField(term13616, term13616.getClass(), "templateTypeNames", null);
        setField(term13616, term13616.getClass(), "classTemplateTypeNames", null);
        setField(term13616, term13616.getClass(), "description", null);
        setField(term13616, term13616.getClass(), "meaning", null);
        setField(term13616, term13616.getClass(), "deprecated", null);
        setField(term13616, term13616.getClass(), "license", null);
        setField(term13616, term13616.getClass(), "suppressions", null);
        setField(term13616, term13616.getClass(), "modifies", null);
        setField(term13616, term13616.getClass(), "lendsName", null);
        setBooleanField(term13616, term13616.getClass(), "ngInject", false);
        setField(term13615, term13615.getClass(), "info", term13616);
        setField(term13633, term13633.getClass(), "sourceComment", null);
        setField(term13633, term13633.getClass(), "markers", null);
        setField(term13633, term13633.getClass(), "parameters", null);
        setField(term13633, term13633.getClass(), "throwsDescriptions", null);
        setField(term13633, term13633.getClass(), "blockDescription", null);
        setField(term13633, term13633.getClass(), "fileOverview", null);
        setField(term13633, term13633.getClass(), "returnDescription", null);
        setField(term13633, term13633.getClass(), "version", null);
        setField(term13633, term13633.getClass(), "authors", null);
        setField(term13633, term13633.getClass(), "sees", null);
        setField(term13615, term13615.getClass(), "documentation", term13633);
        setIntField(term13634, term13634.getClass(), "type", 0);
        setField(term13634, term13634.getClass(), "next", null);
        setField(term13634, term13634.getClass(), "first", null);
        setField(term13634, term13634.getClass(), "last", null);
        setField(term13634, term13634.getClass(), "propListHead", null);
        setIntField(term13634, term13634.getClass(), "sourcePosition", 0);
        setField(term13634, term13634.getClass(), "jsType", null);
        setField(term13634, term13634.getClass(), "parent", null);
        setField(term13615, term13615.getClass(), "associatedNode", term13634);
        setField(term13615, term13615.getClass(), "visibility", enum185);
        setIntField(term13615, term13615.getClass(), "bitset", -1999787419);
        setIntField(term13642, term13642.getClass(), "type", 1406617209);
        setField(term13642, term13642.getClass(), "next", null);
        setField(term13642, term13642.getClass(), "first", term13634);
        setField(term13642, term13642.getClass(), "last", null);
        setField(term13642, term13642.getClass(), "propListHead", null);
        setIntField(term13642, term13642.getClass(), "sourcePosition", 0);
        setField(term13642, term13642.getClass(), "jsType", null);
        setField(term13642, term13642.getClass(), "parent", null);
        setField(term13641, term13641.getClass(), "root", term13642);
        setField(term13641, term13641.getClass(), "sourceName", "");
        setField(term13615, term13615.getClass(), "type", term13641);
        setField(term13615, term13615.getClass(), "thisType", term13641);
        setBooleanField(term13615, term13615.getClass(), "includeDocumentation", false);
        setField(term13614, term13614.getClass(), "currentInfo", term13615);
        setBooleanField(term13614, term13614.getClass(), "populated", false);
        setBooleanField(term13614, term13614.getClass(), "parseDocumentation", true);
        setField(term13650, term13650.getClass(), "item", null);
        setIntField(term13650, term13650.getClass(), "startLineno", 0);
        setIntField(term13650, term13650.getClass(), "startCharno", 0);
        setIntField(term13650, term13650.getClass(), "endLineno", 0);
        setIntField(term13650, term13650.getClass(), "endCharno", 0);
        setField(term13649, term13649.getClass(), "annotation", term13650);
        setField(term13655, term13655.getClass(), "item", null);
        setIntField(term13655, term13655.getClass(), "startLineno", 0);
        setIntField(term13655, term13655.getClass(), "startCharno", 0);
        setIntField(term13655, term13655.getClass(), "endLineno", 0);
        setIntField(term13655, term13655.getClass(), "endCharno", 0);
        setField(term13649, term13649.getClass(), "name", term13655);
        setField(term13649, term13649.getClass(), "nameNode", null);
        setField(term13649, term13649.getClass(), "description", null);
        setField(term13649, term13649.getClass(), "type", null);
        setField(term13614, term13614.getClass(), "currentMarker", term13649);
        setField(term13570, term13570.getClass(), "jsdocBuilder", term13614);
        setField(term13570, term13570.getClass(), "sourceFile", null);
        setIntField(term13660, term13660.getClass(), "type", 1706047059);
        setIntField(term13662, term13662.getClass(), "type", 590451710);
        setIntField(term13664, term13664.getClass(), "type", 0);
        setField(term13664, term13664.getClass(), "next", null);
        setField(term13664, term13664.getClass(), "first", null);
        setField(term13664, term13664.getClass(), "last", null);
        setField(term13664, term13664.getClass(), "propListHead", null);
        setIntField(term13664, term13664.getClass(), "sourcePosition", 0);
        setField(term13664, term13664.getClass(), "jsType", null);
        setField(term13664, term13664.getClass(), "parent", null);
        setField(term13662, term13662.getClass(), "next", term13664);
        setIntField(term13667, term13667.getClass(), "type", 0);
        setField(term13667, term13667.getClass(), "next", null);
        setField(term13667, term13667.getClass(), "first", null);
        setField(term13667, term13667.getClass(), "last", null);
        setField(term13667, term13667.getClass(), "propListHead", null);
        setIntField(term13667, term13667.getClass(), "sourcePosition", 0);
        setField(term13667, term13667.getClass(), "jsType", null);
        setField(term13667, term13667.getClass(), "parent", null);
        setField(term13662, term13662.getClass(), "first", term13667);
        setField(term13662, term13662.getClass(), "last", term13634);
        setField(term13662, term13662.getClass(), "propListHead", null);
        setIntField(term13662, term13662.getClass(), "sourcePosition", 0);
        setField(term13662, term13662.getClass(), "jsType", null);
        setField(term13662, term13662.getClass(), "parent", null);
        setField(term13660, term13660.getClass(), "next", term13662);
        setIntField(term13671, term13671.getClass(), "type", 0);
        setField(term13671, term13671.getClass(), "next", null);
        setField(term13671, term13671.getClass(), "first", null);
        setField(term13671, term13671.getClass(), "last", null);
        setField(term13671, term13671.getClass(), "propListHead", null);
        setIntField(term13671, term13671.getClass(), "sourcePosition", 0);
        setField(term13671, term13671.getClass(), "jsType", null);
        setField(term13671, term13671.getClass(), "parent", null);
        setField(term13660, term13660.getClass(), "first", term13671);
        setIntField(term13674, term13674.getClass(), "type", 0);
        setField(term13674, term13674.getClass(), "next", null);
        setField(term13674, term13674.getClass(), "first", null);
        setField(term13674, term13674.getClass(), "last", null);
        setField(term13674, term13674.getClass(), "propListHead", null);
        setIntField(term13674, term13674.getClass(), "sourcePosition", 0);
        setField(term13674, term13674.getClass(), "jsType", null);
        setField(term13674, term13674.getClass(), "parent", null);
        setField(term13660, term13660.getClass(), "last", term13674);
        setField(term13660, term13660.getClass(), "propListHead", null);
        setIntField(term13660, term13660.getClass(), "sourcePosition", 0);
        setField(term13660, term13660.getClass(), "jsType", null);
        setField(term13660, term13660.getClass(), "parent", null);
        setField(term13570, term13570.getClass(), "associatedNode", term13660);
        setField(term13570, term13570.getClass(), "errorReporter", null);
        setField(term13570, term13570.getClass(), "parser", null);
        setField(term13570, term13570.getClass(), "templateNode", null);
        setField(term13570, term13570.getClass(), "fileOverviewJSDocInfo", null);
        setField(term13570, term13570.getClass(), "state", null);
        setField(term13570, term13570.getClass(), "annotationNames", null);
        setField(term13570, term13570.getClass(), "suppressionNames", null);
        setField(term13570, term13570.getClass(), "fileLevelJsDocBuilder", null);
        setField(term13570, term13570.getClass(), "unreadToken", null);
        Class<? extends Object> term106577 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term106576 = ((Class) term106577).getDeclaredField((String) "ELLIPSIS");
        ((Field) term106576).setAccessible(true);
        enum186 = ((Field) term106576).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum186;
        try {
            callMethod(klass, "parseTypeNameAnnotation", argTypes, term13570, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


