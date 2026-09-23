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
import java.util.HashSet;
import java.lang.String;
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNode_135080465370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6538;
     Object enum161;
     Object term6662;

    public JsDocInfoParser_parseAndRecordTypeNode_135080465370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6593 = new ArrayList();
        ((ArrayList) term6593).add((Object)null);
        ((ArrayList) term6593).add((Object)null);
        ((ArrayList) term6593).add((Object)null);
        ((ArrayList) term6593).add((Object)null);
        ((ArrayList) term6593).add((Object)null);
        ((ArrayList) term6593).add((Object)null);
        ((ArrayList) term6593).add((Object)null);
        ((ArrayList) term6593).add((Object)null);
        ArrayList term6596 = new ArrayList();
        ((ArrayList) term6596).add((Object)null);
        ((ArrayList) term6596).add((Object)null);
        ((ArrayList) term6596).add((Object)null);
        ((ArrayList) term6596).add((Object)null);
        ((ArrayList) term6596).add((Object)null);
        ((ArrayList) term6596).add((Object)null);
        ((ArrayList) term6596).add((Object)null);
        ((ArrayList) term6596).add((Object)null);
        ((ArrayList) term6596).add((Object)null);
        HashMap term6599 = new HashMap();
        ArrayList term6604 = new ArrayList();
        ((ArrayList) term6604).add((Object)null);
        ((ArrayList) term6604).add((Object)null);
        ((ArrayList) term6604).add((Object)null);
        ((ArrayList) term6604).add((Object)null);
        ((ArrayList) term6604).add((Object)null);
        ((ArrayList) term6604).add((Object)null);
        ((ArrayList) term6604).add((Object)null);
        HashSet term6612 = new HashSet();
        HashSet term6613 = new HashSet();
        ArrayList term6617 = new ArrayList();
        ((ArrayList) term6617).add((Object)null);
        ((ArrayList) term6617).add((Object)null);
        ((ArrayList) term6617).add((Object)null);
        ((ArrayList) term6617).add((Object)null);
        ((ArrayList) term6617).add((Object)null);
        ((ArrayList) term6617).add((Object)null);
        ((ArrayList) term6617).add((Object)null);
        HashMap term6620 = new HashMap();
        Class<? extends Object> term82271 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term82270 = ((Class) term82271).getDeclaredField((String) "INHERITED");
        ((Field) term82270).setAccessible(true);
        Object enum160 = ((Field) term82270).get((Object) null);
        term6538 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term6539 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term6552 = (char[]) newCharArray(9);
        int[] term6563 = (int[]) newIntArray(0);
        Object term6589 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term6590 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6591 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6592 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6615 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6632 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6637 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6645 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term6646 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term6651 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term6539, term6539.getClass(), "string", "VVNNlAePXF");
        setCharElement(term6552, 0, 'j');
        setCharElement(term6552, 1, 'J');
        setCharElement(term6552, 2, 'C');
        setCharElement(term6552, 3, 'Z');
        setCharElement(term6552, 4, 'p');
        setCharElement(term6552, 5, 'V');
        setCharElement(term6552, 6, 'm');
        setCharElement(term6552, 7, 'a');
        setCharElement(term6552, 8, 'n');
        setField(term6539, term6539.getClass(), "stringBuffer", term6552);
        setIntField(term6539, term6539.getClass(), "stringBufferTop", -936895502);
        setField(term6539, term6539.getClass(), "ungetBuffer", term6563);
        setIntField(term6539, term6539.getClass(), "ungetCursor", -129547140);
        setBooleanField(term6539, term6539.getClass(), "hitEOF", true);
        setIntField(term6539, term6539.getClass(), "lineStart", 199287428);
        setIntField(term6539, term6539.getClass(), "lineEndChar", -1195339592);
        setIntField(term6539, term6539.getClass(), "lineno", -376422566);
        setIntField(term6539, term6539.getClass(), "charno", 306847454);
        setIntField(term6539, term6539.getClass(), "initCharno", 1745276158);
        setIntField(term6539, term6539.getClass(), "initLineno", 2009020256);
        setField(term6539, term6539.getClass(), "sourceString", "jnwVnmKAFv");
        setIntField(term6539, term6539.getClass(), "sourceEnd", 2049577015);
        setIntField(term6539, term6539.getClass(), "sourceCursor", 1236004505);
        setIntField(term6539, term6539.getClass(), "cursor", 1050765721);
        setIntField(term6539, term6539.getClass(), "tokenBeg", 474518942);
        setIntField(term6539, term6539.getClass(), "tokenEnd", -1656687479);
        setField(term6538, term6538.getClass(), "stream", term6539);
        setField(term6592, term6592.getClass(), "root", null);
        setField(term6592, term6592.getClass(), "sourceName", null);
        setField(term6591, term6591.getClass(), "baseType", term6592);
        setField(term6591, term6591.getClass(), "extendedInterfaces", term6593);
        setField(term6591, term6591.getClass(), "implementedInterfaces", term6596);
        setField(term6591, term6591.getClass(), "parameters", term6599);
        setField(term6591, term6591.getClass(), "thrownTypes", term6604);
        setField(term6591, term6591.getClass(), "templateTypeName", "");
        setField(term6591, term6591.getClass(), "description", "");
        setField(term6591, term6591.getClass(), "meaning", "");
        setField(term6591, term6591.getClass(), "deprecated", "");
        setField(term6591, term6591.getClass(), "license", "");
        setField(term6591, term6591.getClass(), "suppressions", term6612);
        setField(term6591, term6591.getClass(), "modifies", term6613);
        setField(term6591, term6591.getClass(), "lendsName", "");
        setField(term6590, term6590.getClass(), "info", term6591);
        setField(term6615, term6615.getClass(), "sourceComment", "");
        setField(term6615, term6615.getClass(), "markers", term6617);
        setField(term6615, term6615.getClass(), "parameters", term6620);
        setField(term6615, term6615.getClass(), "throwsDescriptions", null);
        setField(term6615, term6615.getClass(), "blockDescription", null);
        setField(term6615, term6615.getClass(), "fileOverview", null);
        setField(term6615, term6615.getClass(), "returnDescription", null);
        setField(term6615, term6615.getClass(), "version", null);
        setField(term6615, term6615.getClass(), "authors", null);
        setField(term6615, term6615.getClass(), "sees", null);
        setField(term6590, term6590.getClass(), "documentation", term6615);
        setIntField(term6625, term6625.getClass(), "type", 0);
        setField(term6625, term6625.getClass(), "next", null);
        setField(term6625, term6625.getClass(), "first", null);
        setField(term6625, term6625.getClass(), "last", null);
        setField(term6625, term6625.getClass(), "propListHead", null);
        setIntField(term6625, term6625.getClass(), "sourcePosition", 0);
        setField(term6625, term6625.getClass(), "jsType", null);
        setField(term6625, term6625.getClass(), "parent", null);
        setField(term6590, term6590.getClass(), "associatedNode", term6625);
        setField(term6590, term6590.getClass(), "visibility", enum160);
        setIntField(term6590, term6590.getClass(), "bitset", -919416536);
        setIntField(term6633, term6633.getClass(), "type", -916335264);
        setField(term6633, term6633.getClass(), "next", term6625);
        setField(term6633, term6633.getClass(), "first", null);
        setField(term6633, term6633.getClass(), "last", null);
        setField(term6633, term6633.getClass(), "propListHead", null);
        setIntField(term6633, term6633.getClass(), "sourcePosition", 0);
        setField(term6633, term6633.getClass(), "jsType", null);
        setField(term6633, term6633.getClass(), "parent", null);
        setField(term6632, term6632.getClass(), "root", term6633);
        setField(term6632, term6632.getClass(), "sourceName", "");
        setField(term6590, term6590.getClass(), "type", term6632);
        setIntField(term6638, term6638.getClass(), "type", -519881101);
        setField(term6638, term6638.getClass(), "next", null);
        setField(term6638, term6638.getClass(), "first", null);
        setField(term6638, term6638.getClass(), "last", null);
        setField(term6638, term6638.getClass(), "propListHead", null);
        setIntField(term6638, term6638.getClass(), "sourcePosition", 0);
        setField(term6638, term6638.getClass(), "jsType", null);
        setField(term6638, term6638.getClass(), "parent", null);
        setField(term6637, term6637.getClass(), "root", term6638);
        setField(term6637, term6637.getClass(), "sourceName", "");
        setField(term6590, term6590.getClass(), "thisType", term6637);
        setBooleanField(term6590, term6590.getClass(), "includeDocumentation", true);
        setField(term6589, term6589.getClass(), "currentInfo", term6590);
        setBooleanField(term6589, term6589.getClass(), "populated", false);
        setBooleanField(term6589, term6589.getClass(), "parseDocumentation", false);
        setField(term6646, term6646.getClass(), "item", null);
        setIntField(term6646, term6646.getClass(), "startLineno", 0);
        setIntField(term6646, term6646.getClass(), "startCharno", 0);
        setIntField(term6646, term6646.getClass(), "endLineno", 0);
        setIntField(term6646, term6646.getClass(), "endCharno", 0);
        setField(term6645, term6645.getClass(), "annotation", term6646);
        setField(term6651, term6651.getClass(), "item", null);
        setIntField(term6651, term6651.getClass(), "startLineno", 0);
        setIntField(term6651, term6651.getClass(), "startCharno", 0);
        setIntField(term6651, term6651.getClass(), "endLineno", 0);
        setIntField(term6651, term6651.getClass(), "endCharno", 0);
        setField(term6645, term6645.getClass(), "name", term6651);
        setField(term6645, term6645.getClass(), "nameNode", null);
        setField(term6645, term6645.getClass(), "description", null);
        setField(term6645, term6645.getClass(), "type", null);
        setField(term6589, term6589.getClass(), "currentMarker", term6645);
        setField(term6538, term6538.getClass(), "jsdocBuilder", term6589);
        setField(term6538, term6538.getClass(), "sourceFile", null);
        setField(term6538, term6538.getClass(), "associatedNode", term6633);
        setField(term6538, term6538.getClass(), "errorReporter", null);
        setField(term6538, term6538.getClass(), "parser", null);
        setField(term6538, term6538.getClass(), "templateNode", null);
        setField(term6538, term6538.getClass(), "fileOverviewJSDocInfo", null);
        setField(term6538, term6538.getClass(), "state", null);
        setField(term6538, term6538.getClass(), "annotationNames", null);
        setField(term6538, term6538.getClass(), "suppressionNames", null);
        setField(term6538, term6538.getClass(), "fileLevelJsDocBuilder", null);
        setField(term6538, term6538.getClass(), "unreadToken", null);
        Class<? extends Object> term82545 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term82544 = ((Class) term82545).getDeclaredField((String) "RP");
        ((Field) term82544).setAccessible(true);
        enum161 = ((Field) term82544).get((Object) null);
        term6662 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = enum161;
        args[1] = term6662;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term6538, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


