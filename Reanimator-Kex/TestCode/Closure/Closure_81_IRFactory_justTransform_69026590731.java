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

public class IRFactory_justTransform_69026590731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4699;

    public IRFactory_justTransform_69026590731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4727 = new HashMap();
        HashMap term4736 = new HashMap();
        Set<Object> term20075 =  ((Map) term4736).keySet();
        HashSet term4735 = new HashSet((Collection<? extends Object>) term20075);
        HashMap term4746 = new HashMap();
        Set<Object> term20076 =  ((Map) term4746).keySet();
        HashSet term4745 = new HashSet((Collection<? extends Object>) term20076);
        term4699 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term4724 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term4744 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term4758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4771 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4781 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4785 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term4786 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4699, term4699.getClass(), "sourceString", "DhjNLmRMCu");
        setField(term4699, term4699.getClass(), "sourceName", "PgPzMSEjjX");
        setBooleanField(term4724, term4724.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term4724, term4724.getClass(), "isIdeMode", true);
        setField(term4724, term4724.getClass(), "annotationNames", term4727);
        setField(term4724, term4724.getClass(), "suppressionNames", term4735);
        setBooleanField(term4724, term4724.getClass(), "acceptES5", true);
        setBooleanField(term4724, term4724.getClass(), "acceptConstKeyword", false);
        setField(term4699, term4699.getClass(), "config", term4724);
        setField(term4699, term4699.getClass(), "errorReporter", null);
        setField(term4744, term4744.getClass(), "this$0", null);
        setField(term4699, term4699.getClass(), "transformDispatcher", term4744);
        setField(term4699, term4699.getClass(), "ALLOWED_DIRECTIVES", term4745);
        setIntField(term4758, term4758.getClass(), "type", -1504890659);
        setIntField(term4760, term4760.getClass(), "type", -507387516);
        setIntField(term4762, term4762.getClass(), "type", 0);
        setField(term4762, term4762.getClass(), "next", null);
        setField(term4762, term4762.getClass(), "first", null);
        setField(term4762, term4762.getClass(), "last", null);
        setField(term4762, term4762.getClass(), "propListHead", null);
        setIntField(term4762, term4762.getClass(), "sourcePosition", 0);
        setField(term4762, term4762.getClass(), "jsType", null);
        setField(term4762, term4762.getClass(), "parent", null);
        setField(term4760, term4760.getClass(), "next", term4762);
        setIntField(term4765, term4765.getClass(), "type", 0);
        setField(term4765, term4765.getClass(), "next", null);
        setField(term4765, term4765.getClass(), "first", null);
        setField(term4765, term4765.getClass(), "last", null);
        setField(term4765, term4765.getClass(), "propListHead", null);
        setIntField(term4765, term4765.getClass(), "sourcePosition", 0);
        setField(term4765, term4765.getClass(), "jsType", null);
        setField(term4765, term4765.getClass(), "parent", null);
        setField(term4760, term4760.getClass(), "first", term4765);
        setIntField(term4768, term4768.getClass(), "type", 0);
        setField(term4768, term4768.getClass(), "next", null);
        setField(term4768, term4768.getClass(), "first", null);
        setField(term4768, term4768.getClass(), "last", null);
        setField(term4768, term4768.getClass(), "propListHead", null);
        setIntField(term4768, term4768.getClass(), "sourcePosition", 0);
        setField(term4768, term4768.getClass(), "jsType", null);
        setField(term4768, term4768.getClass(), "parent", null);
        setField(term4760, term4760.getClass(), "last", term4768);
        setField(term4771, term4771.getClass(), "next", null);
        setIntField(term4771, term4771.getClass(), "type", 0);
        setIntField(term4771, term4771.getClass(), "intValue", 0);
        setField(term4771, term4771.getClass(), "objectValue", null);
        setField(term4760, term4760.getClass(), "propListHead", term4771);
        setIntField(term4760, term4760.getClass(), "sourcePosition", -1970452551);
        setField(term4760, term4760.getClass(), "jsType", null);
        setField(term4760, term4760.getClass(), "parent", null);
        setField(term4758, term4758.getClass(), "next", term4760);
        setIntField(term4775, term4775.getClass(), "type", 0);
        setField(term4775, term4775.getClass(), "next", null);
        setField(term4775, term4775.getClass(), "first", null);
        setField(term4775, term4775.getClass(), "last", null);
        setField(term4775, term4775.getClass(), "propListHead", null);
        setIntField(term4775, term4775.getClass(), "sourcePosition", 0);
        setField(term4775, term4775.getClass(), "jsType", null);
        setField(term4775, term4775.getClass(), "parent", null);
        setField(term4758, term4758.getClass(), "first", term4775);
        setIntField(term4778, term4778.getClass(), "type", 0);
        setField(term4778, term4778.getClass(), "next", null);
        setField(term4778, term4778.getClass(), "first", null);
        setField(term4778, term4778.getClass(), "last", null);
        setField(term4778, term4778.getClass(), "propListHead", null);
        setIntField(term4778, term4778.getClass(), "sourcePosition", 0);
        setField(term4778, term4778.getClass(), "jsType", null);
        setField(term4778, term4778.getClass(), "parent", null);
        setField(term4758, term4758.getClass(), "last", term4778);
        setField(term4781, term4781.getClass(), "next", null);
        setIntField(term4781, term4781.getClass(), "type", 0);
        setIntField(term4781, term4781.getClass(), "intValue", 0);
        setField(term4781, term4781.getClass(), "objectValue", null);
        setField(term4758, term4758.getClass(), "propListHead", term4781);
        setIntField(term4758, term4758.getClass(), "sourcePosition", -1896376975);
        setField(term4758, term4758.getClass(), "jsType", null);
        setField(term4758, term4758.getClass(), "parent", null);
        setField(term4699, term4699.getClass(), "rootNodeJsDocHolder", term4758);
        setField(term4785, term4785.getClass(), "this$0", null);
        setField(term4699, term4699.getClass(), "fileLevelJsDocBuilder", term4785);
        setField(term4786, term4786.getClass(), "info", null);
        setField(term4786, term4786.getClass(), "documentation", null);
        setField(term4786, term4786.getClass(), "sourceName", null);
        setField(term4786, term4786.getClass(), "visibility", null);
        setIntField(term4786, term4786.getClass(), "bitset", 0);
        setField(term4786, term4786.getClass(), "type", null);
        setField(term4786, term4786.getClass(), "thisType", null);
        setBooleanField(term4786, term4786.getClass(), "includeDocumentation", false);
        setField(term4699, term4699.getClass(), "fileOverviewInfo", term4786);
        setIntField(term4789, term4789.getClass(), "type", 0);
        setField(term4789, term4789.getClass(), "next", null);
        setField(term4789, term4789.getClass(), "first", null);
        setField(term4789, term4789.getClass(), "last", null);
        setField(term4789, term4789.getClass(), "propListHead", null);
        setIntField(term4789, term4789.getClass(), "sourcePosition", 0);
        setField(term4789, term4789.getClass(), "jsType", null);
        setField(term4789, term4789.getClass(), "parent", null);
        setField(term4699, term4699.getClass(), "templateNode", term4789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "justTransform", argTypes, term4699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


