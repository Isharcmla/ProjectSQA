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

public class IRFactory_justTransform_69026590737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9978;

    public IRFactory_justTransform_69026590737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10006 = new HashMap();
        HashMap term10015 = new HashMap();
        Set<Object> term33040 =  ((Map) term10015).keySet();
        HashSet term10014 = new HashSet((Collection<? extends Object>) term33040);
        Class<? extends Object> term33042 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term33041 = ((Class) term33042).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term33041).setAccessible(true);
        Object enum60 = ((Field) term33041).get((Object) null);
        HashMap term10039 = new HashMap();
        Set<Object> term33361 =  ((Map) term10039).keySet();
        HashSet term10038 = new HashSet((Collection<? extends Object>) term33361);
        HashMap term10054 = new HashMap();
        Set<Object> term33362 =  ((Map) term10054).keySet();
        HashSet term10053 = new HashSet((Collection<? extends Object>) term33362);
        term9978 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term10003 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term10037 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term10072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10085 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10095 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10099 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term10100 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9978, term9978.getClass(), "sourceString", "THZSpzBRYP");
        setField(term9978, term9978.getClass(), "sourceName", "ZfBIVGBQOE");
        setBooleanField(term10003, term10003.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term10003, term10003.getClass(), "isIdeMode", false);
        setField(term10003, term10003.getClass(), "annotationNames", term10006);
        setField(term10003, term10003.getClass(), "suppressionNames", term10014);
        setField(term10003, term10003.getClass(), "languageMode", enum60);
        setBooleanField(term10003, term10003.getClass(), "acceptConstKeyword", true);
        setField(term9978, term9978.getClass(), "config", term10003);
        setField(term9978, term9978.getClass(), "errorReporter", null);
        setField(term10037, term10037.getClass(), "this$0", null);
        setField(term9978, term9978.getClass(), "transformDispatcher", term10037);
        setField(term9978, term9978.getClass(), "ALLOWED_DIRECTIVES", term10038);
        setField(term9978, term9978.getClass(), "reservedKeywords", term10053);
        setIntField(term10072, term10072.getClass(), "type", -159494544);
        setIntField(term10074, term10074.getClass(), "type", 388157121);
        setIntField(term10076, term10076.getClass(), "type", 0);
        setField(term10076, term10076.getClass(), "next", null);
        setField(term10076, term10076.getClass(), "first", null);
        setField(term10076, term10076.getClass(), "last", null);
        setField(term10076, term10076.getClass(), "propListHead", null);
        setIntField(term10076, term10076.getClass(), "sourcePosition", 0);
        setField(term10076, term10076.getClass(), "jsType", null);
        setField(term10076, term10076.getClass(), "parent", null);
        setField(term10074, term10074.getClass(), "next", term10076);
        setIntField(term10079, term10079.getClass(), "type", 0);
        setField(term10079, term10079.getClass(), "next", null);
        setField(term10079, term10079.getClass(), "first", null);
        setField(term10079, term10079.getClass(), "last", null);
        setField(term10079, term10079.getClass(), "propListHead", null);
        setIntField(term10079, term10079.getClass(), "sourcePosition", 0);
        setField(term10079, term10079.getClass(), "jsType", null);
        setField(term10079, term10079.getClass(), "parent", null);
        setField(term10074, term10074.getClass(), "first", term10079);
        setIntField(term10082, term10082.getClass(), "type", 0);
        setField(term10082, term10082.getClass(), "next", null);
        setField(term10082, term10082.getClass(), "first", null);
        setField(term10082, term10082.getClass(), "last", null);
        setField(term10082, term10082.getClass(), "propListHead", null);
        setIntField(term10082, term10082.getClass(), "sourcePosition", 0);
        setField(term10082, term10082.getClass(), "jsType", null);
        setField(term10082, term10082.getClass(), "parent", null);
        setField(term10074, term10074.getClass(), "last", term10082);
        setField(term10085, term10085.getClass(), "next", null);
        setIntField(term10085, term10085.getClass(), "type", 0);
        setIntField(term10085, term10085.getClass(), "intValue", 0);
        setField(term10085, term10085.getClass(), "objectValue", null);
        setField(term10074, term10074.getClass(), "propListHead", term10085);
        setIntField(term10074, term10074.getClass(), "sourcePosition", 1684998508);
        setField(term10074, term10074.getClass(), "jsType", null);
        setField(term10074, term10074.getClass(), "parent", null);
        setField(term10072, term10072.getClass(), "next", term10074);
        setIntField(term10089, term10089.getClass(), "type", 0);
        setField(term10089, term10089.getClass(), "next", null);
        setField(term10089, term10089.getClass(), "first", null);
        setField(term10089, term10089.getClass(), "last", null);
        setField(term10089, term10089.getClass(), "propListHead", null);
        setIntField(term10089, term10089.getClass(), "sourcePosition", 0);
        setField(term10089, term10089.getClass(), "jsType", null);
        setField(term10089, term10089.getClass(), "parent", null);
        setField(term10072, term10072.getClass(), "first", term10089);
        setIntField(term10092, term10092.getClass(), "type", 0);
        setField(term10092, term10092.getClass(), "next", null);
        setField(term10092, term10092.getClass(), "first", null);
        setField(term10092, term10092.getClass(), "last", null);
        setField(term10092, term10092.getClass(), "propListHead", null);
        setIntField(term10092, term10092.getClass(), "sourcePosition", 0);
        setField(term10092, term10092.getClass(), "jsType", null);
        setField(term10092, term10092.getClass(), "parent", null);
        setField(term10072, term10072.getClass(), "last", term10092);
        setField(term10095, term10095.getClass(), "next", null);
        setIntField(term10095, term10095.getClass(), "type", 0);
        setIntField(term10095, term10095.getClass(), "intValue", 0);
        setField(term10095, term10095.getClass(), "objectValue", null);
        setField(term10072, term10072.getClass(), "propListHead", term10095);
        setIntField(term10072, term10072.getClass(), "sourcePosition", -1476644457);
        setField(term10072, term10072.getClass(), "jsType", null);
        setField(term10072, term10072.getClass(), "parent", null);
        setField(term9978, term9978.getClass(), "rootNodeJsDocHolder", term10072);
        setField(term10099, term10099.getClass(), "this$0", null);
        setField(term9978, term9978.getClass(), "fileLevelJsDocBuilder", term10099);
        setField(term10100, term10100.getClass(), "info", null);
        setField(term10100, term10100.getClass(), "documentation", null);
        setField(term10100, term10100.getClass(), "sourceName", null);
        setField(term10100, term10100.getClass(), "visibility", null);
        setIntField(term10100, term10100.getClass(), "bitset", 0);
        setField(term10100, term10100.getClass(), "type", null);
        setField(term10100, term10100.getClass(), "thisType", null);
        setBooleanField(term10100, term10100.getClass(), "includeDocumentation", false);
        setField(term9978, term9978.getClass(), "fileOverviewInfo", term10100);
        setIntField(term10103, term10103.getClass(), "type", 0);
        setField(term10103, term10103.getClass(), "next", null);
        setField(term10103, term10103.getClass(), "first", null);
        setField(term10103, term10103.getClass(), "last", null);
        setField(term10103, term10103.getClass(), "propListHead", null);
        setIntField(term10103, term10103.getClass(), "sourcePosition", 0);
        setField(term10103, term10103.getClass(), "jsType", null);
        setField(term10103, term10103.getClass(), "parent", null);
        setField(term9978, term9978.getClass(), "templateNode", term10103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "justTransform", argTypes, term9978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


