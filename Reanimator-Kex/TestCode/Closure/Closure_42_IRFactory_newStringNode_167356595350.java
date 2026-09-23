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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class IRFactory_newStringNode_167356595350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12419;
     Object term40238;
     Object term39130;

    public IRFactory_newStringNode_167356595350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12447 = new HashMap();
        HashMap term12456 = new HashMap();
        Set<Object> term40283 =  ((Map) term12456).keySet();
        HashSet term12455 = new HashSet((Collection<? extends Object>) term40283);
        Class<? extends Object> term40285 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term40284 = ((Class) term40285).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term40284).setAccessible(true);
        Object enum78 = ((Field) term40284).get((Object) null);
        HashMap term12480 = new HashMap();
        Set<Object> term40604 =  ((Map) term12480).keySet();
        HashSet term12479 = new HashSet((Collection<? extends Object>) term40604);
        HashMap term12499 = new HashMap();
        Set<Object> term40605 =  ((Map) term12499).keySet();
        HashSet term12498 = new HashSet((Collection<? extends Object>) term40605);
        HashMap term12512 = new HashMap();
        Set<Object> term40606 =  ((Map) term12512).keySet();
        HashSet term12511 = new HashSet((Collection<? extends Object>) term40606);
        term12419 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term12444 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term12478 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term12524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12527 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term12528 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12419, term12419.getClass(), "sourceString", "WXcZEtUKlI");
        setField(term12419, term12419.getClass(), "sourceFile", null);
        setField(term12419, term12419.getClass(), "sourceName", "IkpjUOuWQU");
        setBooleanField(term12444, term12444.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term12444, term12444.getClass(), "isIdeMode", false);
        setField(term12444, term12444.getClass(), "annotationNames", term12447);
        setField(term12444, term12444.getClass(), "suppressionNames", term12455);
        setField(term12444, term12444.getClass(), "languageMode", enum78);
        setBooleanField(term12444, term12444.getClass(), "acceptConstKeyword", false);
        setField(term12419, term12419.getClass(), "config", term12444);
        setField(term12419, term12419.getClass(), "errorReporter", null);
        setField(term12478, term12478.getClass(), "this$0", null);
        setField(term12419, term12419.getClass(), "transformDispatcher", term12478);
        setField(term12419, term12419.getClass(), "ALLOWED_DIRECTIVES", term12479);
        setField(term12419, term12419.getClass(), "reservedKeywords", term12498);
        setField(term12419, term12419.getClass(), "parsedComments", term12511);
        setIntField(term12524, term12524.getClass(), "type", 0);
        setField(term12524, term12524.getClass(), "next", null);
        setField(term12524, term12524.getClass(), "first", null);
        setField(term12524, term12524.getClass(), "last", null);
        setField(term12524, term12524.getClass(), "propListHead", null);
        setIntField(term12524, term12524.getClass(), "sourcePosition", 0);
        setField(term12524, term12524.getClass(), "jsType", null);
        setField(term12524, term12524.getClass(), "parent", null);
        setField(term12419, term12419.getClass(), "rootNodeJsDocHolder", term12524);
        setField(term12527, term12527.getClass(), "this$0", null);
        setField(term12419, term12419.getClass(), "fileLevelJsDocBuilder", term12527);
        setField(term12528, term12528.getClass(), "info", null);
        setField(term12528, term12528.getClass(), "documentation", null);
        setField(term12528, term12528.getClass(), "associatedNode", null);
        setField(term12528, term12528.getClass(), "visibility", null);
        setIntField(term12528, term12528.getClass(), "bitset", 0);
        setField(term12528, term12528.getClass(), "type", null);
        setField(term12528, term12528.getClass(), "thisType", null);
        setBooleanField(term12528, term12528.getClass(), "includeDocumentation", false);
        setField(term12419, term12419.getClass(), "fileOverviewInfo", term12528);
        setIntField(term12531, term12531.getClass(), "type", 0);
        setField(term12531, term12531.getClass(), "next", null);
        setField(term12531, term12531.getClass(), "first", null);
        setField(term12531, term12531.getClass(), "last", null);
        setField(term12531, term12531.getClass(), "propListHead", null);
        setIntField(term12531, term12531.getClass(), "sourcePosition", 0);
        setField(term12531, term12531.getClass(), "jsType", null);
        setField(term12531, term12531.getClass(), "parent", null);
        setField(term12419, term12419.getClass(), "templateNode", term12531);
        HashMap term40244 = new HashMap();
        HashMap term40246 = new HashMap();
        Set<Object> term40637 =  ((Map) term40246).keySet();
        HashSet term40245 = new HashSet((Collection<? extends Object>) term40637);
        Class<? extends Object> term40639 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term40638 = ((Class) term40639).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term40638).setAccessible(true);
        Object enum79 = ((Field) term40638).get((Object) null);
        HashMap term40252 = new HashMap();
        Set<Object> term40958 =  ((Map) term40252).keySet();
        HashSet term40251 = new HashSet((Collection<? extends Object>) term40958);
        HashMap term40254 = new HashMap();
        Set<Object> term40959 =  ((Map) term40254).keySet();
        HashSet term40253 = new HashSet((Collection<? extends Object>) term40959);
        HashMap term40256 = new HashMap();
        Set<Object> term40960 =  ((Map) term40256).keySet();
        HashSet term40255 = new HashSet((Collection<? extends Object>) term40960);
        term40238 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term40243 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term40250 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term40257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40258 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term40259 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term40260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40238, term40238.getClass(), "sourceString", "WXcZEtUKlI");
        setField(term40238, term40238.getClass(), "sourceFile", null);
        setField(term40238, term40238.getClass(), "sourceName", "IkpjUOuWQU");
        setBooleanField(term40243, term40243.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term40243, term40243.getClass(), "isIdeMode", false);
        setField(term40243, term40243.getClass(), "annotationNames", term40244);
        setField(term40243, term40243.getClass(), "suppressionNames", term40245);
        setField(term40243, term40243.getClass(), "languageMode", enum79);
        setBooleanField(term40243, term40243.getClass(), "acceptConstKeyword", false);
        setField(term40238, term40238.getClass(), "config", term40243);
        setField(term40238, term40238.getClass(), "errorReporter", null);
        setField(term40250, term40250.getClass(), "this$0", null);
        setField(term40238, term40238.getClass(), "transformDispatcher", term40250);
        setField(term40238, term40238.getClass(), "ALLOWED_DIRECTIVES", term40251);
        setField(term40238, term40238.getClass(), "reservedKeywords", term40253);
        setField(term40238, term40238.getClass(), "parsedComments", term40255);
        setIntField(term40257, term40257.getClass(), "type", 0);
        setField(term40257, term40257.getClass(), "next", null);
        setField(term40257, term40257.getClass(), "first", null);
        setField(term40257, term40257.getClass(), "last", null);
        setField(term40257, term40257.getClass(), "propListHead", null);
        setIntField(term40257, term40257.getClass(), "sourcePosition", 0);
        setField(term40257, term40257.getClass(), "jsType", null);
        setField(term40257, term40257.getClass(), "parent", null);
        setField(term40238, term40238.getClass(), "rootNodeJsDocHolder", term40257);
        setField(term40258, term40258.getClass(), "this$0", null);
        setField(term40238, term40238.getClass(), "fileLevelJsDocBuilder", term40258);
        setField(term40259, term40259.getClass(), "info", null);
        setField(term40259, term40259.getClass(), "documentation", null);
        setField(term40259, term40259.getClass(), "associatedNode", null);
        setField(term40259, term40259.getClass(), "visibility", null);
        setIntField(term40259, term40259.getClass(), "bitset", 0);
        setField(term40259, term40259.getClass(), "type", null);
        setField(term40259, term40259.getClass(), "thisType", null);
        setBooleanField(term40259, term40259.getClass(), "includeDocumentation", false);
        setField(term40238, term40238.getClass(), "fileOverviewInfo", term40259);
        setIntField(term40260, term40260.getClass(), "type", 0);
        setField(term40260, term40260.getClass(), "next", null);
        setField(term40260, term40260.getClass(), "first", null);
        setField(term40260, term40260.getClass(), "last", null);
        setField(term40260, term40260.getClass(), "propListHead", null);
        setIntField(term40260, term40260.getClass(), "sourcePosition", 0);
        setField(term40260, term40260.getClass(), "jsType", null);
        setField(term40260, term40260.getClass(), "parent", null);
        setField(term40238, term40238.getClass(), "templateNode", term40260);
        term39130 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term39130, term39130.getClass(), "str", "KAORSSPSeV");
        setIntField(term39130, term39130.getClass(), "type", 40);
        setField(term39130, term39130.getClass(), "next", null);
        setField(term39130, term39130.getClass(), "first", null);
        setField(term39130, term39130.getClass(), "last", null);
        setField(term39130, term39130.getClass(), "propListHead", null);
        setIntField(term39130, term39130.getClass(), "sourcePosition", -1);
        setField(term39130, term39130.getClass(), "jsType", null);
        setField(term39130, term39130.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KAORSSPSeV";
        Object retValue = callMethod(klass, "newStringNode", argTypes, term12419, args);
        assertTrue(recursiveEquals(term12419, term40238));
        assertTrue(recursiveEquals(retValue, term39130));
    }

};


