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
import java.util.MissingResourceException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class IRFactory_createJsDocInfoParser_69488838329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4084;
     Object term4183;

    public IRFactory_createJsDocInfoParser_69488838329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4112 = new HashMap();
        HashMap term4121 = new HashMap();
        Set<Object> term17876 =  ((Map) term4121).keySet();
        HashSet term4120 = new HashSet((Collection<? extends Object>) term17876);
        HashMap term4131 = new HashMap();
        Set<Object> term17877 =  ((Map) term4131).keySet();
        HashSet term4130 = new HashSet((Collection<? extends Object>) term17877);
        term4084 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term4109 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term4129 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term4149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4162 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4172 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4176 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term4177 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4084, term4084.getClass(), "sourceString", "XYtryyobou");
        setField(term4084, term4084.getClass(), "sourceName", "OYbzXylRWW");
        setBooleanField(term4109, term4109.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term4109, term4109.getClass(), "isIdeMode", false);
        setField(term4109, term4109.getClass(), "annotationNames", term4112);
        setField(term4109, term4109.getClass(), "suppressionNames", term4120);
        setBooleanField(term4109, term4109.getClass(), "acceptES5", true);
        setBooleanField(term4109, term4109.getClass(), "acceptConstKeyword", false);
        setField(term4084, term4084.getClass(), "config", term4109);
        setField(term4084, term4084.getClass(), "errorReporter", null);
        setField(term4129, term4129.getClass(), "this$0", null);
        setField(term4084, term4084.getClass(), "transformDispatcher", term4129);
        setField(term4084, term4084.getClass(), "ALLOWED_DIRECTIVES", term4130);
        setIntField(term4149, term4149.getClass(), "type", 1555897383);
        setIntField(term4151, term4151.getClass(), "type", -1697741339);
        setIntField(term4153, term4153.getClass(), "type", 0);
        setField(term4153, term4153.getClass(), "next", null);
        setField(term4153, term4153.getClass(), "first", null);
        setField(term4153, term4153.getClass(), "last", null);
        setField(term4153, term4153.getClass(), "propListHead", null);
        setIntField(term4153, term4153.getClass(), "sourcePosition", 0);
        setField(term4153, term4153.getClass(), "jsType", null);
        setField(term4153, term4153.getClass(), "parent", null);
        setField(term4151, term4151.getClass(), "next", term4153);
        setIntField(term4156, term4156.getClass(), "type", 0);
        setField(term4156, term4156.getClass(), "next", null);
        setField(term4156, term4156.getClass(), "first", null);
        setField(term4156, term4156.getClass(), "last", null);
        setField(term4156, term4156.getClass(), "propListHead", null);
        setIntField(term4156, term4156.getClass(), "sourcePosition", 0);
        setField(term4156, term4156.getClass(), "jsType", null);
        setField(term4156, term4156.getClass(), "parent", null);
        setField(term4151, term4151.getClass(), "first", term4156);
        setIntField(term4159, term4159.getClass(), "type", 0);
        setField(term4159, term4159.getClass(), "next", null);
        setField(term4159, term4159.getClass(), "first", null);
        setField(term4159, term4159.getClass(), "last", null);
        setField(term4159, term4159.getClass(), "propListHead", null);
        setIntField(term4159, term4159.getClass(), "sourcePosition", 0);
        setField(term4159, term4159.getClass(), "jsType", null);
        setField(term4159, term4159.getClass(), "parent", null);
        setField(term4151, term4151.getClass(), "last", term4159);
        setField(term4162, term4162.getClass(), "next", null);
        setIntField(term4162, term4162.getClass(), "type", 0);
        setIntField(term4162, term4162.getClass(), "intValue", 0);
        setField(term4162, term4162.getClass(), "objectValue", null);
        setField(term4151, term4151.getClass(), "propListHead", term4162);
        setIntField(term4151, term4151.getClass(), "sourcePosition", 98922530);
        setField(term4151, term4151.getClass(), "jsType", null);
        setField(term4151, term4151.getClass(), "parent", null);
        setField(term4149, term4149.getClass(), "next", term4151);
        setIntField(term4166, term4166.getClass(), "type", 0);
        setField(term4166, term4166.getClass(), "next", null);
        setField(term4166, term4166.getClass(), "first", null);
        setField(term4166, term4166.getClass(), "last", null);
        setField(term4166, term4166.getClass(), "propListHead", null);
        setIntField(term4166, term4166.getClass(), "sourcePosition", 0);
        setField(term4166, term4166.getClass(), "jsType", null);
        setField(term4166, term4166.getClass(), "parent", null);
        setField(term4149, term4149.getClass(), "first", term4166);
        setIntField(term4169, term4169.getClass(), "type", 0);
        setField(term4169, term4169.getClass(), "next", null);
        setField(term4169, term4169.getClass(), "first", null);
        setField(term4169, term4169.getClass(), "last", null);
        setField(term4169, term4169.getClass(), "propListHead", null);
        setIntField(term4169, term4169.getClass(), "sourcePosition", 0);
        setField(term4169, term4169.getClass(), "jsType", null);
        setField(term4169, term4169.getClass(), "parent", null);
        setField(term4149, term4149.getClass(), "last", term4169);
        setField(term4172, term4172.getClass(), "next", null);
        setIntField(term4172, term4172.getClass(), "type", 0);
        setIntField(term4172, term4172.getClass(), "intValue", 0);
        setField(term4172, term4172.getClass(), "objectValue", null);
        setField(term4149, term4149.getClass(), "propListHead", term4172);
        setIntField(term4149, term4149.getClass(), "sourcePosition", -1388471422);
        setField(term4149, term4149.getClass(), "jsType", null);
        setField(term4149, term4149.getClass(), "parent", null);
        setField(term4084, term4084.getClass(), "rootNodeJsDocHolder", term4149);
        setField(term4176, term4176.getClass(), "this$0", null);
        setField(term4084, term4084.getClass(), "fileLevelJsDocBuilder", term4176);
        setField(term4177, term4177.getClass(), "info", null);
        setField(term4177, term4177.getClass(), "documentation", null);
        setField(term4177, term4177.getClass(), "sourceName", null);
        setField(term4177, term4177.getClass(), "visibility", null);
        setIntField(term4177, term4177.getClass(), "bitset", 0);
        setField(term4177, term4177.getClass(), "type", null);
        setField(term4177, term4177.getClass(), "thisType", null);
        setBooleanField(term4177, term4177.getClass(), "includeDocumentation", false);
        setField(term4084, term4084.getClass(), "fileOverviewInfo", term4177);
        setIntField(term4180, term4180.getClass(), "type", 0);
        setField(term4180, term4180.getClass(), "next", null);
        setField(term4180, term4180.getClass(), "first", null);
        setField(term4180, term4180.getClass(), "last", null);
        setField(term4180, term4180.getClass(), "propListHead", null);
        setIntField(term4180, term4180.getClass(), "sourcePosition", 0);
        setField(term4180, term4180.getClass(), "jsType", null);
        setField(term4180, term4180.getClass(), "parent", null);
        setField(term4084, term4084.getClass(), "templateNode", term4180);
        Class<? extends Object> term17889 = Class.forName((String) "com.google.javascript.jscomp.mozilla.rhino.Token$CommentType");
        Field term17888 = ((Class) term17889).getDeclaredField((String) "LINE");
        ((Field) term17888).setAccessible(true);
        Object enum22 = ((Field) term17888).get((Object) null);
        term4183 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object term4208 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term4210 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term4213 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term4216 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term4220 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem"));
        Object term4223 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term4226 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term4230 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem"));
        setField(term4183, term4183.getClass(), "value", "kVEZMHmRtR");
        setField(term4183, term4183.getClass(), "commentType", enum22);
        setBooleanField(term4183, term4183.getClass(), "parsed", false);
        setIntField(term4183, term4183.getClass(), "position", -1498296052);
        setIntField(term4183, term4183.getClass(), "length", 2098647989);
        setField(term4183, term4183.getClass(), "parent", null);
        setIntField(term4183, term4183.getClass(), "type", 11724947);
        setIntField(term4208, term4208.getClass(), "type", 1398204340);
        setIntField(term4210, term4210.getClass(), "type", 0);
        setField(term4210, term4210.getClass(), "next", null);
        setField(term4210, term4210.getClass(), "first", null);
        setField(term4210, term4210.getClass(), "last", null);
        setIntField(term4210, term4210.getClass(), "lineno", 0);
        setField(term4210, term4210.getClass(), "propListHead", null);
        setField(term4208, term4208.getClass(), "next", term4210);
        setIntField(term4213, term4213.getClass(), "type", 0);
        setField(term4213, term4213.getClass(), "next", null);
        setField(term4213, term4213.getClass(), "first", null);
        setField(term4213, term4213.getClass(), "last", null);
        setIntField(term4213, term4213.getClass(), "lineno", 0);
        setField(term4213, term4213.getClass(), "propListHead", null);
        setField(term4208, term4208.getClass(), "first", term4213);
        setIntField(term4216, term4216.getClass(), "type", 0);
        setField(term4216, term4216.getClass(), "next", null);
        setField(term4216, term4216.getClass(), "first", null);
        setField(term4216, term4216.getClass(), "last", null);
        setIntField(term4216, term4216.getClass(), "lineno", 0);
        setField(term4216, term4216.getClass(), "propListHead", null);
        setField(term4208, term4208.getClass(), "last", term4216);
        setIntField(term4208, term4208.getClass(), "lineno", -461771056);
        setField(term4220, term4220.getClass(), "next", null);
        setIntField(term4220, term4220.getClass(), "type", 0);
        setIntField(term4220, term4220.getClass(), "intValue", 0);
        setField(term4220, term4220.getClass(), "objectValue", null);
        setField(term4208, term4208.getClass(), "propListHead", term4220);
        setField(term4183, term4183.getClass(), "next", term4208);
        setIntField(term4223, term4223.getClass(), "type", 0);
        setField(term4223, term4223.getClass(), "next", null);
        setField(term4223, term4223.getClass(), "first", null);
        setField(term4223, term4223.getClass(), "last", null);
        setIntField(term4223, term4223.getClass(), "lineno", 0);
        setField(term4223, term4223.getClass(), "propListHead", null);
        setField(term4183, term4183.getClass(), "first", term4223);
        setIntField(term4226, term4226.getClass(), "type", 0);
        setField(term4226, term4226.getClass(), "next", null);
        setField(term4226, term4226.getClass(), "first", null);
        setField(term4226, term4226.getClass(), "last", null);
        setIntField(term4226, term4226.getClass(), "lineno", 0);
        setField(term4226, term4226.getClass(), "propListHead", null);
        setField(term4183, term4183.getClass(), "last", term4226);
        setIntField(term4183, term4183.getClass(), "lineno", 1384592638);
        setField(term4230, term4230.getClass(), "next", null);
        setIntField(term4230, term4230.getClass(), "type", 0);
        setIntField(term4230, term4230.getClass(), "intValue", 0);
        setField(term4230, term4230.getClass(), "objectValue", null);
        setField(term4183, term4183.getClass(), "propListHead", term4230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term4183;
        try {
            callMethod(klass, "createJsDocInfoParser", argTypes, term4084, args);
            assertTrue(false);
        }
        catch (MissingResourceException e) {
        }

    }

};


