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

public class IRFactory_transform_125560633728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3962;

    public IRFactory_transform_125560633728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3990 = new HashMap();
        HashMap term3999 = new HashMap();
        Set<Object> term16432 =  ((Map) term3999).keySet();
        HashSet term3998 = new HashSet((Collection<? extends Object>) term16432);
        HashMap term4008 = new HashMap();
        Set<Object> term16433 =  ((Map) term4008).keySet();
        HashSet term4007 = new HashSet((Collection<? extends Object>) term16433);
        term3962 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term3987 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term4006 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term4028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4041 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4051 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4055 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term4056 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3962, term3962.getClass(), "sourceString", "aNWLJdrZMq");
        setField(term3962, term3962.getClass(), "sourceName", "HHmNoYxIGj");
        setBooleanField(term3987, term3987.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term3987, term3987.getClass(), "isIdeMode", true);
        setField(term3987, term3987.getClass(), "annotationNames", term3990);
        setField(term3987, term3987.getClass(), "suppressionNames", term3998);
        setBooleanField(term3987, term3987.getClass(), "acceptES5", false);
        setBooleanField(term3987, term3987.getClass(), "acceptConstKeyword", false);
        setField(term3962, term3962.getClass(), "config", term3987);
        setField(term3962, term3962.getClass(), "errorReporter", null);
        setField(term4006, term4006.getClass(), "this$0", null);
        setField(term3962, term3962.getClass(), "transformDispatcher", term4006);
        setField(term3962, term3962.getClass(), "ALLOWED_DIRECTIVES", term4007);
        setIntField(term4028, term4028.getClass(), "type", 71190297);
        setIntField(term4030, term4030.getClass(), "type", -1222006000);
        setIntField(term4032, term4032.getClass(), "type", 0);
        setField(term4032, term4032.getClass(), "next", null);
        setField(term4032, term4032.getClass(), "first", null);
        setField(term4032, term4032.getClass(), "last", null);
        setField(term4032, term4032.getClass(), "propListHead", null);
        setIntField(term4032, term4032.getClass(), "sourcePosition", 0);
        setField(term4032, term4032.getClass(), "jsType", null);
        setField(term4032, term4032.getClass(), "parent", null);
        setField(term4030, term4030.getClass(), "next", term4032);
        setIntField(term4035, term4035.getClass(), "type", 0);
        setField(term4035, term4035.getClass(), "next", null);
        setField(term4035, term4035.getClass(), "first", null);
        setField(term4035, term4035.getClass(), "last", null);
        setField(term4035, term4035.getClass(), "propListHead", null);
        setIntField(term4035, term4035.getClass(), "sourcePosition", 0);
        setField(term4035, term4035.getClass(), "jsType", null);
        setField(term4035, term4035.getClass(), "parent", null);
        setField(term4030, term4030.getClass(), "first", term4035);
        setIntField(term4038, term4038.getClass(), "type", 0);
        setField(term4038, term4038.getClass(), "next", null);
        setField(term4038, term4038.getClass(), "first", null);
        setField(term4038, term4038.getClass(), "last", null);
        setField(term4038, term4038.getClass(), "propListHead", null);
        setIntField(term4038, term4038.getClass(), "sourcePosition", 0);
        setField(term4038, term4038.getClass(), "jsType", null);
        setField(term4038, term4038.getClass(), "parent", null);
        setField(term4030, term4030.getClass(), "last", term4038);
        setField(term4041, term4041.getClass(), "next", null);
        setIntField(term4041, term4041.getClass(), "type", 0);
        setIntField(term4041, term4041.getClass(), "intValue", 0);
        setField(term4041, term4041.getClass(), "objectValue", null);
        setField(term4030, term4030.getClass(), "propListHead", term4041);
        setIntField(term4030, term4030.getClass(), "sourcePosition", 2095798786);
        setField(term4030, term4030.getClass(), "jsType", null);
        setField(term4030, term4030.getClass(), "parent", null);
        setField(term4028, term4028.getClass(), "next", term4030);
        setIntField(term4045, term4045.getClass(), "type", 0);
        setField(term4045, term4045.getClass(), "next", null);
        setField(term4045, term4045.getClass(), "first", null);
        setField(term4045, term4045.getClass(), "last", null);
        setField(term4045, term4045.getClass(), "propListHead", null);
        setIntField(term4045, term4045.getClass(), "sourcePosition", 0);
        setField(term4045, term4045.getClass(), "jsType", null);
        setField(term4045, term4045.getClass(), "parent", null);
        setField(term4028, term4028.getClass(), "first", term4045);
        setIntField(term4048, term4048.getClass(), "type", 0);
        setField(term4048, term4048.getClass(), "next", null);
        setField(term4048, term4048.getClass(), "first", null);
        setField(term4048, term4048.getClass(), "last", null);
        setField(term4048, term4048.getClass(), "propListHead", null);
        setIntField(term4048, term4048.getClass(), "sourcePosition", 0);
        setField(term4048, term4048.getClass(), "jsType", null);
        setField(term4048, term4048.getClass(), "parent", null);
        setField(term4028, term4028.getClass(), "last", term4048);
        setField(term4051, term4051.getClass(), "next", null);
        setIntField(term4051, term4051.getClass(), "type", 0);
        setIntField(term4051, term4051.getClass(), "intValue", 0);
        setField(term4051, term4051.getClass(), "objectValue", null);
        setField(term4028, term4028.getClass(), "propListHead", term4051);
        setIntField(term4028, term4028.getClass(), "sourcePosition", -1565502840);
        setField(term4028, term4028.getClass(), "jsType", null);
        setField(term4028, term4028.getClass(), "parent", null);
        setField(term3962, term3962.getClass(), "rootNodeJsDocHolder", term4028);
        setField(term4055, term4055.getClass(), "this$0", null);
        setField(term3962, term3962.getClass(), "fileLevelJsDocBuilder", term4055);
        setField(term4056, term4056.getClass(), "info", null);
        setField(term4056, term4056.getClass(), "documentation", null);
        setField(term4056, term4056.getClass(), "sourceName", null);
        setField(term4056, term4056.getClass(), "visibility", null);
        setIntField(term4056, term4056.getClass(), "bitset", 0);
        setField(term4056, term4056.getClass(), "type", null);
        setField(term4056, term4056.getClass(), "thisType", null);
        setBooleanField(term4056, term4056.getClass(), "includeDocumentation", false);
        setField(term3962, term3962.getClass(), "fileOverviewInfo", term4056);
        setIntField(term4059, term4059.getClass(), "type", 0);
        setField(term4059, term4059.getClass(), "next", null);
        setField(term4059, term4059.getClass(), "first", null);
        setField(term4059, term4059.getClass(), "last", null);
        setField(term4059, term4059.getClass(), "propListHead", null);
        setIntField(term4059, term4059.getClass(), "sourcePosition", 0);
        setField(term4059, term4059.getClass(), "jsType", null);
        setField(term4059, term4059.getClass(), "parent", null);
        setField(term3962, term3962.getClass(), "templateNode", term4059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transform", argTypes, term3962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


