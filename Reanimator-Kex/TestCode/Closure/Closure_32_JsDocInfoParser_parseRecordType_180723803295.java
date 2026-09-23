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

public class JsDocInfoParser_parseRecordType_180723803295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23294;
     Object enum211;

    public JsDocInfoParser_parseRecordType_180723803295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23342 = new ArrayList();
        ((ArrayList) term23342).add((Object)null);
        ((ArrayList) term23342).add((Object)null);
        ((ArrayList) term23342).add((Object)null);
        ((ArrayList) term23342).add((Object)null);
        ((ArrayList) term23342).add((Object)null);
        ((ArrayList) term23342).add((Object)null);
        ((ArrayList) term23342).add((Object)null);
        ArrayList term23345 = new ArrayList();
        ((ArrayList) term23345).add((Object)null);
        ((ArrayList) term23345).add((Object)null);
        ((ArrayList) term23345).add((Object)null);
        ((ArrayList) term23345).add((Object)null);
        ((ArrayList) term23345).add((Object)null);
        ((ArrayList) term23345).add((Object)null);
        ((ArrayList) term23345).add((Object)null);
        ((ArrayList) term23345).add((Object)null);
        ((ArrayList) term23345).add((Object)null);
        HashMap term23348 = new HashMap();
        ArrayList term23353 = new ArrayList();
        ((ArrayList) term23353).add((Object)null);
        ((ArrayList) term23353).add((Object)null);
        ((ArrayList) term23353).add((Object)null);
        ((ArrayList) term23353).add((Object)null);
        ((ArrayList) term23353).add((Object)null);
        ((ArrayList) term23353).add((Object)null);
        ((ArrayList) term23353).add((Object)null);
        ((ArrayList) term23353).add((Object)null);
        HashSet term23361 = new HashSet();
        HashSet term23362 = new HashSet();
        ArrayList term23366 = new ArrayList();
        ((ArrayList) term23366).add((Object)null);
        ((ArrayList) term23366).add((Object)null);
        ((ArrayList) term23366).add((Object)null);
        HashMap term23369 = new HashMap();
        Class<? extends Object> term108794 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term108793 = ((Class) term108794).getDeclaredField((String) "PROTECTED");
        ((Field) term108793).setAccessible(true);
        Object enum210 = ((Field) term108793).get((Object) null);
        term23294 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term23295 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term23308 = (char[]) newCharArray(2);
        int[] term23312 = (int[]) newIntArray(0);
        Object term23338 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term23339 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term23340 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term23341 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23364 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term23374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23381 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23386 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23394 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term23395 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term23400 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term23295, term23295.getClass(), "string", "vbSWeJWOQh");
        setCharElement(term23308, 0, 'l');
        setCharElement(term23308, 1, 'i');
        setField(term23295, term23295.getClass(), "stringBuffer", term23308);
        setIntField(term23295, term23295.getClass(), "stringBufferTop", 1190753616);
        setField(term23295, term23295.getClass(), "ungetBuffer", term23312);
        setIntField(term23295, term23295.getClass(), "ungetCursor", -752378450);
        setBooleanField(term23295, term23295.getClass(), "hitEOF", false);
        setIntField(term23295, term23295.getClass(), "lineStart", 848907965);
        setIntField(term23295, term23295.getClass(), "lineEndChar", 1865070548);
        setIntField(term23295, term23295.getClass(), "lineno", 1904515443);
        setIntField(term23295, term23295.getClass(), "charno", 1361126430);
        setIntField(term23295, term23295.getClass(), "initCharno", 1728588701);
        setIntField(term23295, term23295.getClass(), "initLineno", -355769268);
        setField(term23295, term23295.getClass(), "sourceString", "hyvFdAvkOr");
        setIntField(term23295, term23295.getClass(), "sourceEnd", -114460662);
        setIntField(term23295, term23295.getClass(), "sourceCursor", -355376034);
        setIntField(term23295, term23295.getClass(), "cursor", 588390599);
        setIntField(term23295, term23295.getClass(), "tokenBeg", -95969566);
        setIntField(term23295, term23295.getClass(), "tokenEnd", -68615285);
        setField(term23294, term23294.getClass(), "stream", term23295);
        setField(term23341, term23341.getClass(), "root", null);
        setField(term23341, term23341.getClass(), "sourceName", null);
        setField(term23340, term23340.getClass(), "baseType", term23341);
        setField(term23340, term23340.getClass(), "extendedInterfaces", term23342);
        setField(term23340, term23340.getClass(), "implementedInterfaces", term23345);
        setField(term23340, term23340.getClass(), "parameters", term23348);
        setField(term23340, term23340.getClass(), "thrownTypes", term23353);
        setField(term23340, term23340.getClass(), "templateTypeName", "");
        setField(term23340, term23340.getClass(), "description", "");
        setField(term23340, term23340.getClass(), "meaning", "");
        setField(term23340, term23340.getClass(), "deprecated", "");
        setField(term23340, term23340.getClass(), "license", "");
        setField(term23340, term23340.getClass(), "suppressions", term23361);
        setField(term23340, term23340.getClass(), "modifies", term23362);
        setField(term23340, term23340.getClass(), "lendsName", "");
        setField(term23339, term23339.getClass(), "info", term23340);
        setField(term23364, term23364.getClass(), "sourceComment", "");
        setField(term23364, term23364.getClass(), "markers", term23366);
        setField(term23364, term23364.getClass(), "parameters", term23369);
        setField(term23364, term23364.getClass(), "throwsDescriptions", null);
        setField(term23364, term23364.getClass(), "blockDescription", null);
        setField(term23364, term23364.getClass(), "fileOverview", null);
        setField(term23364, term23364.getClass(), "returnDescription", null);
        setField(term23364, term23364.getClass(), "version", null);
        setField(term23364, term23364.getClass(), "authors", null);
        setField(term23364, term23364.getClass(), "sees", null);
        setField(term23339, term23339.getClass(), "documentation", term23364);
        setIntField(term23374, term23374.getClass(), "type", 0);
        setField(term23374, term23374.getClass(), "next", null);
        setField(term23374, term23374.getClass(), "first", null);
        setField(term23374, term23374.getClass(), "last", null);
        setField(term23374, term23374.getClass(), "propListHead", null);
        setIntField(term23374, term23374.getClass(), "sourcePosition", 0);
        setField(term23374, term23374.getClass(), "jsType", null);
        setField(term23374, term23374.getClass(), "parent", null);
        setField(term23339, term23339.getClass(), "associatedNode", term23374);
        setField(term23339, term23339.getClass(), "visibility", enum210);
        setIntField(term23339, term23339.getClass(), "bitset", 1791984446);
        setIntField(term23382, term23382.getClass(), "type", -284885486);
        setField(term23382, term23382.getClass(), "next", term23374);
        setField(term23382, term23382.getClass(), "first", null);
        setField(term23382, term23382.getClass(), "last", null);
        setField(term23382, term23382.getClass(), "propListHead", null);
        setIntField(term23382, term23382.getClass(), "sourcePosition", 0);
        setField(term23382, term23382.getClass(), "jsType", null);
        setField(term23382, term23382.getClass(), "parent", null);
        setField(term23381, term23381.getClass(), "root", term23382);
        setField(term23381, term23381.getClass(), "sourceName", "");
        setField(term23339, term23339.getClass(), "type", term23381);
        setIntField(term23387, term23387.getClass(), "type", 532588266);
        setField(term23387, term23387.getClass(), "next", null);
        setField(term23387, term23387.getClass(), "first", null);
        setField(term23387, term23387.getClass(), "last", null);
        setField(term23387, term23387.getClass(), "propListHead", null);
        setIntField(term23387, term23387.getClass(), "sourcePosition", 0);
        setField(term23387, term23387.getClass(), "jsType", null);
        setField(term23387, term23387.getClass(), "parent", null);
        setField(term23386, term23386.getClass(), "root", term23387);
        setField(term23386, term23386.getClass(), "sourceName", "");
        setField(term23339, term23339.getClass(), "thisType", term23386);
        setBooleanField(term23339, term23339.getClass(), "includeDocumentation", true);
        setField(term23338, term23338.getClass(), "currentInfo", term23339);
        setBooleanField(term23338, term23338.getClass(), "populated", true);
        setBooleanField(term23338, term23338.getClass(), "parseDocumentation", true);
        setField(term23395, term23395.getClass(), "item", null);
        setIntField(term23395, term23395.getClass(), "startLineno", 0);
        setIntField(term23395, term23395.getClass(), "startCharno", 0);
        setIntField(term23395, term23395.getClass(), "endLineno", 0);
        setIntField(term23395, term23395.getClass(), "endCharno", 0);
        setField(term23394, term23394.getClass(), "annotation", term23395);
        setField(term23400, term23400.getClass(), "item", null);
        setIntField(term23400, term23400.getClass(), "startLineno", 0);
        setIntField(term23400, term23400.getClass(), "startCharno", 0);
        setIntField(term23400, term23400.getClass(), "endLineno", 0);
        setIntField(term23400, term23400.getClass(), "endCharno", 0);
        setField(term23394, term23394.getClass(), "name", term23400);
        setField(term23394, term23394.getClass(), "nameNode", null);
        setField(term23394, term23394.getClass(), "description", null);
        setField(term23394, term23394.getClass(), "type", null);
        setField(term23338, term23338.getClass(), "currentMarker", term23394);
        setField(term23294, term23294.getClass(), "jsdocBuilder", term23338);
        setField(term23294, term23294.getClass(), "sourceFile", null);
        setField(term23294, term23294.getClass(), "associatedNode", term23382);
        setField(term23294, term23294.getClass(), "errorReporter", null);
        setField(term23294, term23294.getClass(), "parser", null);
        setField(term23294, term23294.getClass(), "templateNode", null);
        setField(term23294, term23294.getClass(), "fileOverviewJSDocInfo", null);
        setField(term23294, term23294.getClass(), "state", null);
        setField(term23294, term23294.getClass(), "annotationNames", null);
        setField(term23294, term23294.getClass(), "suppressionNames", null);
        setField(term23294, term23294.getClass(), "fileLevelJsDocBuilder", null);
        setField(term23294, term23294.getClass(), "unreadToken", null);
        Class<? extends Object> term109068 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term109067 = ((Class) term109068).getDeclaredField((String) "STRING");
        ((Field) term109067).setAccessible(true);
        enum211 = ((Field) term109067).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum211;
        try {
            callMethod(klass, "parseRecordType", argTypes, term23294, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


