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

public class JsDocInfoParser_reportGenericTypeSyntaxWarning_1226954606105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28668;

    public JsDocInfoParser_reportGenericTypeSyntaxWarning_1226954606105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28716 = new ArrayList();
        ((ArrayList) term28716).add((Object)null);
        ((ArrayList) term28716).add((Object)null);
        ((ArrayList) term28716).add((Object)null);
        ((ArrayList) term28716).add((Object)null);
        ((ArrayList) term28716).add((Object)null);
        ArrayList term28719 = new ArrayList();
        ((ArrayList) term28719).add((Object)null);
        ((ArrayList) term28719).add((Object)null);
        ((ArrayList) term28719).add((Object)null);
        ((ArrayList) term28719).add((Object)null);
        ((ArrayList) term28719).add((Object)null);
        ((ArrayList) term28719).add((Object)null);
        HashMap term28722 = new HashMap();
        ArrayList term28727 = new ArrayList();
        ((ArrayList) term28727).add((Object)null);
        ((ArrayList) term28727).add((Object)null);
        HashSet term28735 = new HashSet();
        HashSet term28736 = new HashSet();
        ArrayList term28740 = new ArrayList();
        ((ArrayList) term28740).add((Object)null);
        ((ArrayList) term28740).add((Object)null);
        ((ArrayList) term28740).add((Object)null);
        ((ArrayList) term28740).add((Object)null);
        ((ArrayList) term28740).add((Object)null);
        ((ArrayList) term28740).add((Object)null);
        ((ArrayList) term28740).add((Object)null);
        ((ArrayList) term28740).add((Object)null);
        HashMap term28743 = new HashMap();
        Class<? extends Object> term113073 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term113072 = ((Class) term113073).getDeclaredField((String) "PROTECTED");
        ((Field) term113072).setAccessible(true);
        Object enum224 = ((Field) term113072).get((Object) null);
        term28668 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term28669 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term28682 = (char[]) newCharArray(2);
        int[] term28686 = (int[]) newIntArray(0);
        Object term28712 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term28713 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term28714 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term28715 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term28738 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term28748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28764 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term28765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28769 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term28770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28777 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term28778 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term28783 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term28669, term28669.getClass(), "string", "QbaeHheqiP");
        setCharElement(term28682, 0, 'N');
        setCharElement(term28682, 1, 'x');
        setField(term28669, term28669.getClass(), "stringBuffer", term28682);
        setIntField(term28669, term28669.getClass(), "stringBufferTop", -1584779593);
        setField(term28669, term28669.getClass(), "ungetBuffer", term28686);
        setIntField(term28669, term28669.getClass(), "ungetCursor", 303007547);
        setBooleanField(term28669, term28669.getClass(), "hitEOF", true);
        setIntField(term28669, term28669.getClass(), "lineStart", 1498738343);
        setIntField(term28669, term28669.getClass(), "lineEndChar", -1635571857);
        setIntField(term28669, term28669.getClass(), "lineno", 1407309162);
        setIntField(term28669, term28669.getClass(), "charno", -534033672);
        setIntField(term28669, term28669.getClass(), "initCharno", -1162790806);
        setIntField(term28669, term28669.getClass(), "initLineno", -1264595049);
        setField(term28669, term28669.getClass(), "sourceString", "gASHxChKwn");
        setIntField(term28669, term28669.getClass(), "sourceEnd", -2058884635);
        setIntField(term28669, term28669.getClass(), "sourceCursor", 1064185088);
        setIntField(term28669, term28669.getClass(), "cursor", -1249782654);
        setIntField(term28669, term28669.getClass(), "tokenBeg", 399302934);
        setIntField(term28669, term28669.getClass(), "tokenEnd", -1823255084);
        setField(term28668, term28668.getClass(), "stream", term28669);
        setField(term28715, term28715.getClass(), "root", null);
        setField(term28715, term28715.getClass(), "sourceName", null);
        setField(term28714, term28714.getClass(), "baseType", term28715);
        setField(term28714, term28714.getClass(), "extendedInterfaces", term28716);
        setField(term28714, term28714.getClass(), "implementedInterfaces", term28719);
        setField(term28714, term28714.getClass(), "parameters", term28722);
        setField(term28714, term28714.getClass(), "thrownTypes", term28727);
        setField(term28714, term28714.getClass(), "templateTypeName", "");
        setField(term28714, term28714.getClass(), "description", "");
        setField(term28714, term28714.getClass(), "meaning", "");
        setField(term28714, term28714.getClass(), "deprecated", "");
        setField(term28714, term28714.getClass(), "license", "");
        setField(term28714, term28714.getClass(), "suppressions", term28735);
        setField(term28714, term28714.getClass(), "modifies", term28736);
        setField(term28714, term28714.getClass(), "lendsName", "");
        setField(term28713, term28713.getClass(), "info", term28714);
        setField(term28738, term28738.getClass(), "sourceComment", "");
        setField(term28738, term28738.getClass(), "markers", term28740);
        setField(term28738, term28738.getClass(), "parameters", term28743);
        setField(term28738, term28738.getClass(), "throwsDescriptions", null);
        setField(term28738, term28738.getClass(), "blockDescription", null);
        setField(term28738, term28738.getClass(), "fileOverview", null);
        setField(term28738, term28738.getClass(), "returnDescription", null);
        setField(term28738, term28738.getClass(), "version", null);
        setField(term28738, term28738.getClass(), "authors", null);
        setField(term28738, term28738.getClass(), "sees", null);
        setField(term28713, term28713.getClass(), "documentation", term28738);
        setIntField(term28748, term28748.getClass(), "type", -1731921726);
        setIntField(term28750, term28750.getClass(), "type", 0);
        setField(term28750, term28750.getClass(), "next", null);
        setField(term28750, term28750.getClass(), "first", null);
        setField(term28750, term28750.getClass(), "last", null);
        setField(term28750, term28750.getClass(), "propListHead", null);
        setIntField(term28750, term28750.getClass(), "sourcePosition", 0);
        setField(term28750, term28750.getClass(), "jsType", null);
        setField(term28750, term28750.getClass(), "parent", null);
        setField(term28748, term28748.getClass(), "next", term28750);
        setIntField(term28753, term28753.getClass(), "type", 0);
        setField(term28753, term28753.getClass(), "next", null);
        setField(term28753, term28753.getClass(), "first", null);
        setField(term28753, term28753.getClass(), "last", null);
        setField(term28753, term28753.getClass(), "propListHead", null);
        setIntField(term28753, term28753.getClass(), "sourcePosition", 0);
        setField(term28753, term28753.getClass(), "jsType", null);
        setField(term28753, term28753.getClass(), "parent", null);
        setField(term28748, term28748.getClass(), "first", term28753);
        setIntField(term28756, term28756.getClass(), "type", 0);
        setField(term28756, term28756.getClass(), "next", null);
        setField(term28756, term28756.getClass(), "first", null);
        setField(term28756, term28756.getClass(), "last", null);
        setField(term28756, term28756.getClass(), "propListHead", null);
        setIntField(term28756, term28756.getClass(), "sourcePosition", 0);
        setField(term28756, term28756.getClass(), "jsType", null);
        setField(term28756, term28756.getClass(), "parent", null);
        setField(term28748, term28748.getClass(), "last", term28756);
        setField(term28748, term28748.getClass(), "propListHead", null);
        setIntField(term28748, term28748.getClass(), "sourcePosition", 0);
        setField(term28748, term28748.getClass(), "jsType", null);
        setField(term28748, term28748.getClass(), "parent", null);
        setField(term28713, term28713.getClass(), "associatedNode", term28748);
        setField(term28713, term28713.getClass(), "visibility", enum224);
        setIntField(term28713, term28713.getClass(), "bitset", 919994471);
        setIntField(term28765, term28765.getClass(), "type", -2092117838);
        setField(term28765, term28765.getClass(), "next", null);
        setField(term28765, term28765.getClass(), "first", null);
        setField(term28765, term28765.getClass(), "last", term28750);
        setField(term28765, term28765.getClass(), "propListHead", null);
        setIntField(term28765, term28765.getClass(), "sourcePosition", 0);
        setField(term28765, term28765.getClass(), "jsType", null);
        setField(term28765, term28765.getClass(), "parent", null);
        setField(term28764, term28764.getClass(), "root", term28765);
        setField(term28764, term28764.getClass(), "sourceName", "");
        setField(term28713, term28713.getClass(), "type", term28764);
        setIntField(term28770, term28770.getClass(), "type", 0);
        setField(term28770, term28770.getClass(), "next", null);
        setField(term28770, term28770.getClass(), "first", null);
        setField(term28770, term28770.getClass(), "last", null);
        setField(term28770, term28770.getClass(), "propListHead", null);
        setIntField(term28770, term28770.getClass(), "sourcePosition", 0);
        setField(term28770, term28770.getClass(), "jsType", null);
        setField(term28770, term28770.getClass(), "parent", null);
        setField(term28769, term28769.getClass(), "root", term28770);
        setField(term28769, term28769.getClass(), "sourceName", "");
        setField(term28713, term28713.getClass(), "thisType", term28769);
        setBooleanField(term28713, term28713.getClass(), "includeDocumentation", false);
        setField(term28712, term28712.getClass(), "currentInfo", term28713);
        setBooleanField(term28712, term28712.getClass(), "populated", true);
        setBooleanField(term28712, term28712.getClass(), "parseDocumentation", false);
        setField(term28778, term28778.getClass(), "item", null);
        setIntField(term28778, term28778.getClass(), "startLineno", 0);
        setIntField(term28778, term28778.getClass(), "startCharno", 0);
        setIntField(term28778, term28778.getClass(), "endLineno", 0);
        setIntField(term28778, term28778.getClass(), "endCharno", 0);
        setField(term28777, term28777.getClass(), "annotation", term28778);
        setField(term28783, term28783.getClass(), "item", null);
        setIntField(term28783, term28783.getClass(), "startLineno", 0);
        setIntField(term28783, term28783.getClass(), "startCharno", 0);
        setIntField(term28783, term28783.getClass(), "endLineno", 0);
        setIntField(term28783, term28783.getClass(), "endCharno", 0);
        setField(term28777, term28777.getClass(), "name", term28783);
        setField(term28777, term28777.getClass(), "nameNode", null);
        setField(term28777, term28777.getClass(), "description", null);
        setField(term28777, term28777.getClass(), "type", null);
        setField(term28712, term28712.getClass(), "currentMarker", term28777);
        setField(term28668, term28668.getClass(), "jsdocBuilder", term28712);
        setField(term28668, term28668.getClass(), "sourceFile", null);
        setField(term28668, term28668.getClass(), "associatedNode", term28753);
        setField(term28668, term28668.getClass(), "errorReporter", null);
        setField(term28668, term28668.getClass(), "parser", null);
        setField(term28668, term28668.getClass(), "templateNode", null);
        setField(term28668, term28668.getClass(), "fileOverviewJSDocInfo", null);
        setField(term28668, term28668.getClass(), "state", null);
        setField(term28668, term28668.getClass(), "annotationNames", null);
        setField(term28668, term28668.getClass(), "suppressionNames", null);
        setField(term28668, term28668.getClass(), "fileLevelJsDocBuilder", null);
        setField(term28668, term28668.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reportGenericTypeSyntaxWarning", argTypes, term28668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


