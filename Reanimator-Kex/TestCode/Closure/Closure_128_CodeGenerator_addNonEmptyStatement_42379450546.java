package com.google.javascript.jscomp;

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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class CodeGenerator_addNonEmptyStatement_42379450546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6008;
     Object term6021;
     Object enum50;
     Object term6057;

    public CodeGenerator_addNonEmptyStatement_42379450546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6009 = new HashMap();
        term6008 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6008, term6008.getClass(), "ESCAPED_JS_STRINGS", term6009);
        setField(term6008, term6008.getClass(), "cc", null);
        setField(term6008, term6008.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6008, term6008.getClass(), "preferSingleQuotes", true);
        setBooleanField(term6008, term6008.getClass(), "trustedStrings", false);
        term6021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6021, term6021.getClass(), "type", -157887805);
        setIntField(term6023, term6023.getClass(), "type", 1876565163);
        setIntField(term6025, term6025.getClass(), "type", -817164822);
        setIntField(term6027, term6027.getClass(), "type", -1016503459);
        setIntField(term6029, term6029.getClass(), "type", -1968847291);
        setField(term6029, term6029.getClass(), "next", null);
        setField(term6029, term6029.getClass(), "first", null);
        setField(term6029, term6029.getClass(), "last", null);
        setField(term6029, term6029.getClass(), "propListHead", null);
        setIntField(term6029, term6029.getClass(), "sourcePosition", 0);
        setField(term6029, term6029.getClass(), "jsType", null);
        setField(term6029, term6029.getClass(), "parent", null);
        setField(term6027, term6027.getClass(), "next", term6029);
        setIntField(term6032, term6032.getClass(), "type", 579005622);
        setField(term6032, term6032.getClass(), "next", null);
        setField(term6032, term6032.getClass(), "first", null);
        setField(term6032, term6032.getClass(), "last", term6029);
        setField(term6032, term6032.getClass(), "propListHead", null);
        setIntField(term6032, term6032.getClass(), "sourcePosition", 0);
        setField(term6032, term6032.getClass(), "jsType", null);
        setField(term6032, term6032.getClass(), "parent", null);
        setField(term6027, term6027.getClass(), "first", term6032);
        setField(term6027, term6027.getClass(), "last", term6025);
        setField(term6027, term6027.getClass(), "propListHead", null);
        setIntField(term6027, term6027.getClass(), "sourcePosition", 0);
        setField(term6027, term6027.getClass(), "jsType", null);
        setField(term6027, term6027.getClass(), "parent", null);
        setField(term6025, term6025.getClass(), "next", term6027);
        setField(term6025, term6025.getClass(), "first", term6029);
        setIntField(term6036, term6036.getClass(), "type", 1632125673);
        setIntField(term6038, term6038.getClass(), "type", 454281060);
        setField(term6038, term6038.getClass(), "next", null);
        setField(term6038, term6038.getClass(), "first", term6032);
        setField(term6038, term6038.getClass(), "last", term6027);
        setField(term6038, term6038.getClass(), "propListHead", null);
        setIntField(term6038, term6038.getClass(), "sourcePosition", 0);
        setField(term6038, term6038.getClass(), "jsType", null);
        setField(term6038, term6038.getClass(), "parent", null);
        setField(term6036, term6036.getClass(), "next", term6038);
        setField(term6036, term6036.getClass(), "first", term6023);
        setField(term6036, term6036.getClass(), "last", term6023);
        setField(term6036, term6036.getClass(), "propListHead", null);
        setIntField(term6036, term6036.getClass(), "sourcePosition", 0);
        setField(term6036, term6036.getClass(), "jsType", null);
        setField(term6036, term6036.getClass(), "parent", null);
        setField(term6025, term6025.getClass(), "last", term6036);
        setField(term6025, term6025.getClass(), "propListHead", null);
        setIntField(term6025, term6025.getClass(), "sourcePosition", 0);
        setField(term6025, term6025.getClass(), "jsType", null);
        setField(term6025, term6025.getClass(), "parent", null);
        setField(term6023, term6023.getClass(), "next", term6025);
        setIntField(term6043, term6043.getClass(), "type", -1786399638);
        setField(term6043, term6043.getClass(), "next", term6036);
        setField(term6043, term6043.getClass(), "first", term6038);
        setField(term6043, term6043.getClass(), "last", term6021);
        setField(term6043, term6043.getClass(), "propListHead", null);
        setIntField(term6043, term6043.getClass(), "sourcePosition", 0);
        setField(term6043, term6043.getClass(), "jsType", null);
        setField(term6043, term6043.getClass(), "parent", null);
        setField(term6023, term6023.getClass(), "first", term6043);
        setField(term6023, term6023.getClass(), "last", term6043);
        setField(term6023, term6023.getClass(), "propListHead", null);
        setIntField(term6023, term6023.getClass(), "sourcePosition", 0);
        setField(term6023, term6023.getClass(), "jsType", null);
        setField(term6023, term6023.getClass(), "parent", null);
        setField(term6021, term6021.getClass(), "next", term6023);
        setField(term6021, term6021.getClass(), "first", term6027);
        setField(term6021, term6021.getClass(), "last", term6029);
        setField(term6021, term6021.getClass(), "propListHead", null);
        setIntField(term6021, term6021.getClass(), "sourcePosition", 0);
        setField(term6021, term6021.getClass(), "jsType", null);
        setField(term6021, term6021.getClass(), "parent", null);
        Class<? extends Object> term19258 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term19257 = ((Class) term19258).getDeclaredField((String) "OTHER");
        ((Field) term19257).setAccessible(true);
        enum50 = ((Field) term19257).get((Object) null);
        term6057 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term6021;
        args[1] = enum50;
        args[2] = term6057;
        try {
            callMethod(klass, "addNonEmptyStatement", argTypes, term6008, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


