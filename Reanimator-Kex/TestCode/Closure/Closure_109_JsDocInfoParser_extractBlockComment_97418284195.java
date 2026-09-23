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

public class JsDocInfoParser_extractBlockComment_97418284195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14780;
     Object enum209;

    public JsDocInfoParser_extractBlockComment_97418284195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14836 = new ArrayList();
        ((ArrayList) term14836).add((Object)null);
        ((ArrayList) term14836).add((Object)null);
        ((ArrayList) term14836).add((Object)null);
        ((ArrayList) term14836).add((Object)null);
        ((ArrayList) term14836).add((Object)null);
        ((ArrayList) term14836).add((Object)null);
        ArrayList term14839 = new ArrayList();
        ((ArrayList) term14839).add((Object)null);
        ((ArrayList) term14839).add((Object)null);
        ((ArrayList) term14839).add((Object)null);
        HashMap term14842 = new HashMap();
        ArrayList term14847 = new ArrayList();
        ((ArrayList) term14847).add((Object)null);
        ((ArrayList) term14847).add((Object)null);
        ((ArrayList) term14847).add((Object)null);
        ((ArrayList) term14847).add((Object)null);
        ((ArrayList) term14847).add((Object)null);
        ((ArrayList) term14847).add((Object)null);
        HashSet term14850 = new HashSet();
        HashSet term14855 = new HashSet();
        HashSet term14856 = new HashSet();
        ArrayList term14865 = new ArrayList();
        ((ArrayList) term14865).add((Object)null);
        ((ArrayList) term14865).add((Object)null);
        ((ArrayList) term14865).add((Object)null);
        ((ArrayList) term14865).add((Object)null);
        HashMap term14868 = new HashMap();
        Class<? extends Object> term145622 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term145621 = ((Class) term145622).getDeclaredField((String) "INHERITED");
        ((Field) term145621).setAccessible(true);
        Object enum208 = ((Field) term145621).get((Object) null);
        term14780 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term14781 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term14794 = (char[]) newCharArray(6);
        int[] term14802 = (int[]) newIntArray(4);
        Object term14832 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term14833 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14834 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term14835 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14863 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term14873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14880 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14885 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14894 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term14895 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term14900 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term14781, term14781.getClass(), "string", "OFTJwdPiTG");
        setCharElement(term14794, 0, 'N');
        setCharElement(term14794, 1, 'R');
        setCharElement(term14794, 2, 'd');
        setCharElement(term14794, 3, 'v');
        setCharElement(term14794, 4, 'g');
        setCharElement(term14794, 5, 'J');
        setField(term14781, term14781.getClass(), "stringBuffer", term14794);
        setIntField(term14781, term14781.getClass(), "stringBufferTop", -146564963);
        setIntElement(term14802, 0, -83178716);
        setIntElement(term14802, 1, -1292704466);
        setIntElement(term14802, 2, 1991858584);
        setIntElement(term14802, 3, -1300947782);
        setField(term14781, term14781.getClass(), "ungetBuffer", term14802);
        setIntField(term14781, term14781.getClass(), "ungetCursor", 188512644);
        setBooleanField(term14781, term14781.getClass(), "hitEOF", false);
        setIntField(term14781, term14781.getClass(), "lineStart", 1851127634);
        setIntField(term14781, term14781.getClass(), "lineEndChar", 783730213);
        setIntField(term14781, term14781.getClass(), "lineno", 1815951606);
        setIntField(term14781, term14781.getClass(), "charno", 1105016932);
        setIntField(term14781, term14781.getClass(), "initCharno", -365784998);
        setIntField(term14781, term14781.getClass(), "initLineno", -1893236300);
        setField(term14781, term14781.getClass(), "sourceString", "QiUprSEluR");
        setIntField(term14781, term14781.getClass(), "sourceEnd", -1858909368);
        setIntField(term14781, term14781.getClass(), "sourceCursor", -280113263);
        setIntField(term14781, term14781.getClass(), "cursor", 529625347);
        setIntField(term14781, term14781.getClass(), "tokenBeg", 1409095253);
        setIntField(term14781, term14781.getClass(), "tokenEnd", 315179039);
        setField(term14780, term14780.getClass(), "stream", term14781);
        setField(term14835, term14835.getClass(), "root", null);
        setField(term14835, term14835.getClass(), "sourceName", null);
        setField(term14834, term14834.getClass(), "baseType", term14835);
        setField(term14834, term14834.getClass(), "extendedInterfaces", term14836);
        setField(term14834, term14834.getClass(), "implementedInterfaces", term14839);
        setField(term14834, term14834.getClass(), "parameters", term14842);
        setField(term14834, term14834.getClass(), "thrownTypes", term14847);
        setField(term14834, term14834.getClass(), "templateTypeNames", null);
        setField(term14834, term14834.getClass(), "disposedParameters", term14850);
        setField(term14834, term14834.getClass(), "description", "");
        setField(term14834, term14834.getClass(), "meaning", "");
        setField(term14834, term14834.getClass(), "deprecated", "");
        setField(term14834, term14834.getClass(), "license", "");
        setField(term14834, term14834.getClass(), "suppressions", term14855);
        setField(term14834, term14834.getClass(), "modifies", term14856);
        setField(term14834, term14834.getClass(), "lendsName", "");
        setBooleanField(term14834, term14834.getClass(), "ngInject", true);
        setBooleanField(term14834, term14834.getClass(), "wizaction", false);
        setBooleanField(term14834, term14834.getClass(), "jaggerInject", false);
        setBooleanField(term14834, term14834.getClass(), "jaggerProvide", true);
        setBooleanField(term14834, term14834.getClass(), "jaggerModule", true);
        setField(term14833, term14833.getClass(), "info", term14834);
        setField(term14863, term14863.getClass(), "sourceComment", "");
        setField(term14863, term14863.getClass(), "markers", term14865);
        setField(term14863, term14863.getClass(), "parameters", term14868);
        setField(term14863, term14863.getClass(), "throwsDescriptions", null);
        setField(term14863, term14863.getClass(), "blockDescription", null);
        setField(term14863, term14863.getClass(), "fileOverview", null);
        setField(term14863, term14863.getClass(), "returnDescription", null);
        setField(term14863, term14863.getClass(), "version", null);
        setField(term14863, term14863.getClass(), "authors", null);
        setField(term14863, term14863.getClass(), "sees", null);
        setField(term14833, term14833.getClass(), "documentation", term14863);
        setIntField(term14873, term14873.getClass(), "type", 0);
        setField(term14873, term14873.getClass(), "next", null);
        setField(term14873, term14873.getClass(), "first", null);
        setField(term14873, term14873.getClass(), "last", null);
        setField(term14873, term14873.getClass(), "propListHead", null);
        setIntField(term14873, term14873.getClass(), "sourcePosition", 0);
        setField(term14873, term14873.getClass(), "jsType", null);
        setField(term14873, term14873.getClass(), "parent", null);
        setField(term14833, term14833.getClass(), "associatedNode", term14873);
        setField(term14833, term14833.getClass(), "visibility", enum208);
        setIntField(term14833, term14833.getClass(), "bitset", -2023791789);
        setIntField(term14881, term14881.getClass(), "type", 0);
        setField(term14881, term14881.getClass(), "next", null);
        setField(term14881, term14881.getClass(), "first", null);
        setField(term14881, term14881.getClass(), "last", null);
        setField(term14881, term14881.getClass(), "propListHead", null);
        setIntField(term14881, term14881.getClass(), "sourcePosition", 0);
        setField(term14881, term14881.getClass(), "jsType", null);
        setField(term14881, term14881.getClass(), "parent", null);
        setField(term14880, term14880.getClass(), "root", term14881);
        setField(term14880, term14880.getClass(), "sourceName", "");
        setField(term14833, term14833.getClass(), "type", term14880);
        setIntField(term14886, term14886.getClass(), "type", 0);
        setField(term14886, term14886.getClass(), "next", null);
        setField(term14886, term14886.getClass(), "first", null);
        setField(term14886, term14886.getClass(), "last", null);
        setField(term14886, term14886.getClass(), "propListHead", null);
        setIntField(term14886, term14886.getClass(), "sourcePosition", 0);
        setField(term14886, term14886.getClass(), "jsType", null);
        setField(term14886, term14886.getClass(), "parent", null);
        setField(term14885, term14885.getClass(), "root", term14886);
        setField(term14885, term14885.getClass(), "sourceName", "");
        setField(term14833, term14833.getClass(), "thisType", term14885);
        setBooleanField(term14833, term14833.getClass(), "includeDocumentation", false);
        setIntField(term14833, term14833.getClass(), "originalCommentPosition", 353974456);
        setField(term14832, term14832.getClass(), "currentInfo", term14833);
        setBooleanField(term14832, term14832.getClass(), "populated", false);
        setBooleanField(term14832, term14832.getClass(), "parseDocumentation", false);
        setField(term14895, term14895.getClass(), "item", null);
        setIntField(term14895, term14895.getClass(), "startLineno", 0);
        setIntField(term14895, term14895.getClass(), "startCharno", 0);
        setIntField(term14895, term14895.getClass(), "endLineno", 0);
        setIntField(term14895, term14895.getClass(), "endCharno", 0);
        setField(term14894, term14894.getClass(), "annotation", term14895);
        setField(term14900, term14900.getClass(), "item", null);
        setIntField(term14900, term14900.getClass(), "startLineno", 0);
        setIntField(term14900, term14900.getClass(), "startCharno", 0);
        setIntField(term14900, term14900.getClass(), "endLineno", 0);
        setIntField(term14900, term14900.getClass(), "endCharno", 0);
        setField(term14894, term14894.getClass(), "name", term14900);
        setField(term14894, term14894.getClass(), "nameNode", null);
        setField(term14894, term14894.getClass(), "description", null);
        setField(term14894, term14894.getClass(), "type", null);
        setField(term14832, term14832.getClass(), "currentMarker", term14894);
        setField(term14780, term14780.getClass(), "jsdocBuilder", term14832);
        setField(term14780, term14780.getClass(), "sourceFile", null);
        setField(term14780, term14780.getClass(), "associatedNode", term14881);
        setField(term14780, term14780.getClass(), "errorReporter", null);
        setField(term14780, term14780.getClass(), "parser", null);
        setField(term14780, term14780.getClass(), "templateNode", null);
        setField(term14780, term14780.getClass(), "fileOverviewJSDocInfo", null);
        setField(term14780, term14780.getClass(), "state", null);
        setField(term14780, term14780.getClass(), "annotationNames", null);
        setField(term14780, term14780.getClass(), "suppressionNames", null);
        setField(term14780, term14780.getClass(), "fileLevelJsDocBuilder", null);
        setField(term14780, term14780.getClass(), "unreadToken", null);
        Class<? extends Object> term145896 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term145895 = ((Class) term145896).getDeclaredField((String) "ELLIPSIS");
        ((Field) term145895).setAccessible(true);
        enum209 = ((Field) term145895).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum209;
        try {
            callMethod(klass, "extractBlockComment", argTypes, term14780, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


