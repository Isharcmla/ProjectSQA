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

public class IRFactory_handleJsDoc_115506682727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3851;

    public IRFactory_handleJsDoc_115506682727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3879 = new HashMap();
        HashMap term3888 = new HashMap();
        Set<Object> term16162 =  ((Map) term3888).keySet();
        HashSet term3887 = new HashSet((Collection<? extends Object>) term16162);
        HashMap term3898 = new HashMap();
        Set<Object> term16163 =  ((Map) term3898).keySet();
        HashSet term3897 = new HashSet((Collection<? extends Object>) term16163);
        term3851 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term3876 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term3896 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term3906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3919 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3929 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3933 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term3934 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term3937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3851, term3851.getClass(), "sourceString", "UfQtPRyWRC");
        setField(term3851, term3851.getClass(), "sourceName", "FPvxVzzSvD");
        setBooleanField(term3876, term3876.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term3876, term3876.getClass(), "isIdeMode", true);
        setField(term3876, term3876.getClass(), "annotationNames", term3879);
        setField(term3876, term3876.getClass(), "suppressionNames", term3887);
        setBooleanField(term3876, term3876.getClass(), "acceptES5", true);
        setBooleanField(term3876, term3876.getClass(), "acceptConstKeyword", true);
        setField(term3851, term3851.getClass(), "config", term3876);
        setField(term3851, term3851.getClass(), "errorReporter", null);
        setField(term3896, term3896.getClass(), "this$0", null);
        setField(term3851, term3851.getClass(), "transformDispatcher", term3896);
        setField(term3851, term3851.getClass(), "ALLOWED_DIRECTIVES", term3897);
        setIntField(term3906, term3906.getClass(), "type", -375014958);
        setIntField(term3908, term3908.getClass(), "type", -2015854073);
        setIntField(term3910, term3910.getClass(), "type", 0);
        setField(term3910, term3910.getClass(), "next", null);
        setField(term3910, term3910.getClass(), "first", null);
        setField(term3910, term3910.getClass(), "last", null);
        setField(term3910, term3910.getClass(), "propListHead", null);
        setIntField(term3910, term3910.getClass(), "sourcePosition", 0);
        setField(term3910, term3910.getClass(), "jsType", null);
        setField(term3910, term3910.getClass(), "parent", null);
        setField(term3908, term3908.getClass(), "next", term3910);
        setIntField(term3913, term3913.getClass(), "type", 0);
        setField(term3913, term3913.getClass(), "next", null);
        setField(term3913, term3913.getClass(), "first", null);
        setField(term3913, term3913.getClass(), "last", null);
        setField(term3913, term3913.getClass(), "propListHead", null);
        setIntField(term3913, term3913.getClass(), "sourcePosition", 0);
        setField(term3913, term3913.getClass(), "jsType", null);
        setField(term3913, term3913.getClass(), "parent", null);
        setField(term3908, term3908.getClass(), "first", term3913);
        setIntField(term3916, term3916.getClass(), "type", 0);
        setField(term3916, term3916.getClass(), "next", null);
        setField(term3916, term3916.getClass(), "first", null);
        setField(term3916, term3916.getClass(), "last", null);
        setField(term3916, term3916.getClass(), "propListHead", null);
        setIntField(term3916, term3916.getClass(), "sourcePosition", 0);
        setField(term3916, term3916.getClass(), "jsType", null);
        setField(term3916, term3916.getClass(), "parent", null);
        setField(term3908, term3908.getClass(), "last", term3916);
        setField(term3919, term3919.getClass(), "next", null);
        setIntField(term3919, term3919.getClass(), "type", 0);
        setIntField(term3919, term3919.getClass(), "intValue", 0);
        setField(term3919, term3919.getClass(), "objectValue", null);
        setField(term3908, term3908.getClass(), "propListHead", term3919);
        setIntField(term3908, term3908.getClass(), "sourcePosition", 538259104);
        setField(term3908, term3908.getClass(), "jsType", null);
        setField(term3908, term3908.getClass(), "parent", null);
        setField(term3906, term3906.getClass(), "next", term3908);
        setIntField(term3923, term3923.getClass(), "type", 0);
        setField(term3923, term3923.getClass(), "next", null);
        setField(term3923, term3923.getClass(), "first", null);
        setField(term3923, term3923.getClass(), "last", null);
        setField(term3923, term3923.getClass(), "propListHead", null);
        setIntField(term3923, term3923.getClass(), "sourcePosition", 0);
        setField(term3923, term3923.getClass(), "jsType", null);
        setField(term3923, term3923.getClass(), "parent", null);
        setField(term3906, term3906.getClass(), "first", term3923);
        setIntField(term3926, term3926.getClass(), "type", 0);
        setField(term3926, term3926.getClass(), "next", null);
        setField(term3926, term3926.getClass(), "first", null);
        setField(term3926, term3926.getClass(), "last", null);
        setField(term3926, term3926.getClass(), "propListHead", null);
        setIntField(term3926, term3926.getClass(), "sourcePosition", 0);
        setField(term3926, term3926.getClass(), "jsType", null);
        setField(term3926, term3926.getClass(), "parent", null);
        setField(term3906, term3906.getClass(), "last", term3926);
        setField(term3929, term3929.getClass(), "next", null);
        setIntField(term3929, term3929.getClass(), "type", 0);
        setIntField(term3929, term3929.getClass(), "intValue", 0);
        setField(term3929, term3929.getClass(), "objectValue", null);
        setField(term3906, term3906.getClass(), "propListHead", term3929);
        setIntField(term3906, term3906.getClass(), "sourcePosition", 96566506);
        setField(term3906, term3906.getClass(), "jsType", null);
        setField(term3906, term3906.getClass(), "parent", null);
        setField(term3851, term3851.getClass(), "rootNodeJsDocHolder", term3906);
        setField(term3933, term3933.getClass(), "this$0", null);
        setField(term3851, term3851.getClass(), "fileLevelJsDocBuilder", term3933);
        setField(term3934, term3934.getClass(), "info", null);
        setField(term3934, term3934.getClass(), "documentation", null);
        setField(term3934, term3934.getClass(), "sourceName", null);
        setField(term3934, term3934.getClass(), "visibility", null);
        setIntField(term3934, term3934.getClass(), "bitset", 0);
        setField(term3934, term3934.getClass(), "type", null);
        setField(term3934, term3934.getClass(), "thisType", null);
        setBooleanField(term3934, term3934.getClass(), "includeDocumentation", false);
        setField(term3851, term3851.getClass(), "fileOverviewInfo", term3934);
        setIntField(term3937, term3937.getClass(), "type", 0);
        setField(term3937, term3937.getClass(), "next", null);
        setField(term3937, term3937.getClass(), "first", null);
        setField(term3937, term3937.getClass(), "last", null);
        setField(term3937, term3937.getClass(), "propListHead", null);
        setIntField(term3937, term3937.getClass(), "sourcePosition", 0);
        setField(term3937, term3937.getClass(), "jsType", null);
        setField(term3937, term3937.getClass(), "parent", null);
        setField(term3851, term3851.getClass(), "templateNode", term3937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "handleJsDoc", argTypes, term3851, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


