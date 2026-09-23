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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class IRFactory_handleJsDoc_115506682731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6606;

    public IRFactory_handleJsDoc_115506682731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6634 = new HashMap();
        HashMap term6643 = new HashMap();
        Set<Object> term26035 =  ((Map) term6643).keySet();
        HashSet term6642 = new HashSet((Collection<? extends Object>) term26035);
        Class<? extends Object> term26037 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term26036 = ((Class) term26037).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term26036).setAccessible(true);
        Object enum46 = ((Field) term26036).get((Object) null);
        HashMap term6667 = new HashMap();
        Set<Object> term26356 =  ((Map) term6667).keySet();
        HashSet term6666 = new HashSet((Collection<? extends Object>) term26356);
        HashMap term6678 = new HashMap();
        Set<Object> term26357 =  ((Map) term6678).keySet();
        HashSet term6677 = new HashSet((Collection<? extends Object>) term26357);
        term6606 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term6631 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term6665 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term6698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6711 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6721 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6725 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term6726 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6606, term6606.getClass(), "sourceString", "igCAtimmYB");
        setField(term6606, term6606.getClass(), "sourceName", "DyiXbeYIaN");
        setBooleanField(term6631, term6631.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term6631, term6631.getClass(), "isIdeMode", true);
        setField(term6631, term6631.getClass(), "annotationNames", term6634);
        setField(term6631, term6631.getClass(), "suppressionNames", term6642);
        setField(term6631, term6631.getClass(), "languageMode", enum46);
        setBooleanField(term6631, term6631.getClass(), "acceptConstKeyword", true);
        setField(term6606, term6606.getClass(), "config", term6631);
        setField(term6606, term6606.getClass(), "errorReporter", null);
        setField(term6665, term6665.getClass(), "this$0", null);
        setField(term6606, term6606.getClass(), "transformDispatcher", term6665);
        setField(term6606, term6606.getClass(), "ALLOWED_DIRECTIVES", term6666);
        setField(term6606, term6606.getClass(), "reservedKeywords", term6677);
        setIntField(term6698, term6698.getClass(), "type", -375014958);
        setIntField(term6700, term6700.getClass(), "type", -2015854073);
        setIntField(term6702, term6702.getClass(), "type", 0);
        setField(term6702, term6702.getClass(), "next", null);
        setField(term6702, term6702.getClass(), "first", null);
        setField(term6702, term6702.getClass(), "last", null);
        setField(term6702, term6702.getClass(), "propListHead", null);
        setIntField(term6702, term6702.getClass(), "sourcePosition", 0);
        setField(term6702, term6702.getClass(), "jsType", null);
        setField(term6702, term6702.getClass(), "parent", null);
        setField(term6700, term6700.getClass(), "next", term6702);
        setIntField(term6705, term6705.getClass(), "type", 0);
        setField(term6705, term6705.getClass(), "next", null);
        setField(term6705, term6705.getClass(), "first", null);
        setField(term6705, term6705.getClass(), "last", null);
        setField(term6705, term6705.getClass(), "propListHead", null);
        setIntField(term6705, term6705.getClass(), "sourcePosition", 0);
        setField(term6705, term6705.getClass(), "jsType", null);
        setField(term6705, term6705.getClass(), "parent", null);
        setField(term6700, term6700.getClass(), "first", term6705);
        setIntField(term6708, term6708.getClass(), "type", 0);
        setField(term6708, term6708.getClass(), "next", null);
        setField(term6708, term6708.getClass(), "first", null);
        setField(term6708, term6708.getClass(), "last", null);
        setField(term6708, term6708.getClass(), "propListHead", null);
        setIntField(term6708, term6708.getClass(), "sourcePosition", 0);
        setField(term6708, term6708.getClass(), "jsType", null);
        setField(term6708, term6708.getClass(), "parent", null);
        setField(term6700, term6700.getClass(), "last", term6708);
        setField(term6711, term6711.getClass(), "next", null);
        setIntField(term6711, term6711.getClass(), "type", 0);
        setIntField(term6711, term6711.getClass(), "intValue", 0);
        setField(term6711, term6711.getClass(), "objectValue", null);
        setField(term6700, term6700.getClass(), "propListHead", term6711);
        setIntField(term6700, term6700.getClass(), "sourcePosition", 538259104);
        setField(term6700, term6700.getClass(), "jsType", null);
        setField(term6700, term6700.getClass(), "parent", null);
        setField(term6698, term6698.getClass(), "next", term6700);
        setIntField(term6715, term6715.getClass(), "type", 0);
        setField(term6715, term6715.getClass(), "next", null);
        setField(term6715, term6715.getClass(), "first", null);
        setField(term6715, term6715.getClass(), "last", null);
        setField(term6715, term6715.getClass(), "propListHead", null);
        setIntField(term6715, term6715.getClass(), "sourcePosition", 0);
        setField(term6715, term6715.getClass(), "jsType", null);
        setField(term6715, term6715.getClass(), "parent", null);
        setField(term6698, term6698.getClass(), "first", term6715);
        setIntField(term6718, term6718.getClass(), "type", 0);
        setField(term6718, term6718.getClass(), "next", null);
        setField(term6718, term6718.getClass(), "first", null);
        setField(term6718, term6718.getClass(), "last", null);
        setField(term6718, term6718.getClass(), "propListHead", null);
        setIntField(term6718, term6718.getClass(), "sourcePosition", 0);
        setField(term6718, term6718.getClass(), "jsType", null);
        setField(term6718, term6718.getClass(), "parent", null);
        setField(term6698, term6698.getClass(), "last", term6718);
        setField(term6721, term6721.getClass(), "next", null);
        setIntField(term6721, term6721.getClass(), "type", 0);
        setIntField(term6721, term6721.getClass(), "intValue", 0);
        setField(term6721, term6721.getClass(), "objectValue", null);
        setField(term6698, term6698.getClass(), "propListHead", term6721);
        setIntField(term6698, term6698.getClass(), "sourcePosition", 96566506);
        setField(term6698, term6698.getClass(), "jsType", null);
        setField(term6698, term6698.getClass(), "parent", null);
        setField(term6606, term6606.getClass(), "rootNodeJsDocHolder", term6698);
        setField(term6725, term6725.getClass(), "this$0", null);
        setField(term6606, term6606.getClass(), "fileLevelJsDocBuilder", term6725);
        setField(term6726, term6726.getClass(), "info", null);
        setField(term6726, term6726.getClass(), "documentation", null);
        setField(term6726, term6726.getClass(), "sourceName", null);
        setField(term6726, term6726.getClass(), "visibility", null);
        setIntField(term6726, term6726.getClass(), "bitset", 0);
        setField(term6726, term6726.getClass(), "type", null);
        setField(term6726, term6726.getClass(), "thisType", null);
        setBooleanField(term6726, term6726.getClass(), "includeDocumentation", false);
        setField(term6606, term6606.getClass(), "fileOverviewInfo", term6726);
        setIntField(term6729, term6729.getClass(), "type", 0);
        setField(term6729, term6729.getClass(), "next", null);
        setField(term6729, term6729.getClass(), "first", null);
        setField(term6729, term6729.getClass(), "last", null);
        setField(term6729, term6729.getClass(), "propListHead", null);
        setIntField(term6729, term6729.getClass(), "sourcePosition", 0);
        setField(term6729, term6729.getClass(), "jsType", null);
        setField(term6729, term6729.getClass(), "parent", null);
        setField(term6606, term6606.getClass(), "templateNode", term6729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "handleJsDoc", argTypes, term6606, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


