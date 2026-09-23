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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addList_601406049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6730;
     Object term6743;

    public CodeGenerator_addList_601406049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6731 = new HashMap();
        term6730 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6730, term6730.getClass(), "ESCAPED_JS_STRINGS", term6731);
        setField(term6730, term6730.getClass(), "cc", null);
        setField(term6730, term6730.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6730, term6730.getClass(), "preferSingleQuotes", true);
        setBooleanField(term6730, term6730.getClass(), "trustedStrings", true);
        term6743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6743, term6743.getClass(), "type", 335112684);
        setIntField(term6745, term6745.getClass(), "type", 1551099402);
        setIntField(term6747, term6747.getClass(), "type", -2027534003);
        setIntField(term6749, term6749.getClass(), "type", 1063420942);
        setIntField(term6751, term6751.getClass(), "type", 1375330971);
        setField(term6751, term6751.getClass(), "next", null);
        setField(term6751, term6751.getClass(), "first", null);
        setField(term6751, term6751.getClass(), "last", null);
        setField(term6751, term6751.getClass(), "propListHead", null);
        setIntField(term6751, term6751.getClass(), "sourcePosition", 0);
        setField(term6751, term6751.getClass(), "jsType", null);
        setField(term6751, term6751.getClass(), "parent", null);
        setField(term6749, term6749.getClass(), "next", term6751);
        setIntField(term6754, term6754.getClass(), "type", -478195677);
        setField(term6754, term6754.getClass(), "next", null);
        setField(term6754, term6754.getClass(), "first", null);
        setField(term6754, term6754.getClass(), "last", term6751);
        setField(term6754, term6754.getClass(), "propListHead", null);
        setIntField(term6754, term6754.getClass(), "sourcePosition", 0);
        setField(term6754, term6754.getClass(), "jsType", null);
        setField(term6754, term6754.getClass(), "parent", null);
        setField(term6749, term6749.getClass(), "first", term6754);
        setField(term6749, term6749.getClass(), "last", term6747);
        setField(term6749, term6749.getClass(), "propListHead", null);
        setIntField(term6749, term6749.getClass(), "sourcePosition", 0);
        setField(term6749, term6749.getClass(), "jsType", null);
        setField(term6749, term6749.getClass(), "parent", null);
        setField(term6747, term6747.getClass(), "next", term6749);
        setField(term6747, term6747.getClass(), "first", term6751);
        setIntField(term6758, term6758.getClass(), "type", 1655935355);
        setIntField(term6760, term6760.getClass(), "type", -481533957);
        setField(term6760, term6760.getClass(), "next", null);
        setField(term6760, term6760.getClass(), "first", term6754);
        setField(term6760, term6760.getClass(), "last", term6749);
        setField(term6760, term6760.getClass(), "propListHead", null);
        setIntField(term6760, term6760.getClass(), "sourcePosition", 0);
        setField(term6760, term6760.getClass(), "jsType", null);
        setField(term6760, term6760.getClass(), "parent", null);
        setField(term6758, term6758.getClass(), "next", term6760);
        setField(term6758, term6758.getClass(), "first", term6745);
        setField(term6758, term6758.getClass(), "last", term6745);
        setField(term6758, term6758.getClass(), "propListHead", null);
        setIntField(term6758, term6758.getClass(), "sourcePosition", 0);
        setField(term6758, term6758.getClass(), "jsType", null);
        setField(term6758, term6758.getClass(), "parent", null);
        setField(term6747, term6747.getClass(), "last", term6758);
        setField(term6747, term6747.getClass(), "propListHead", null);
        setIntField(term6747, term6747.getClass(), "sourcePosition", 0);
        setField(term6747, term6747.getClass(), "jsType", null);
        setField(term6747, term6747.getClass(), "parent", null);
        setField(term6745, term6745.getClass(), "next", term6747);
        setIntField(term6765, term6765.getClass(), "type", 1240914516);
        setField(term6765, term6765.getClass(), "next", term6758);
        setField(term6765, term6765.getClass(), "first", term6760);
        setField(term6765, term6765.getClass(), "last", term6743);
        setField(term6765, term6765.getClass(), "propListHead", null);
        setIntField(term6765, term6765.getClass(), "sourcePosition", 0);
        setField(term6765, term6765.getClass(), "jsType", null);
        setField(term6765, term6765.getClass(), "parent", null);
        setField(term6745, term6745.getClass(), "first", term6765);
        setField(term6745, term6745.getClass(), "last", term6765);
        setField(term6745, term6745.getClass(), "propListHead", null);
        setIntField(term6745, term6745.getClass(), "sourcePosition", 0);
        setField(term6745, term6745.getClass(), "jsType", null);
        setField(term6745, term6745.getClass(), "parent", null);
        setField(term6743, term6743.getClass(), "next", term6745);
        setField(term6743, term6743.getClass(), "first", term6749);
        setField(term6743, term6743.getClass(), "last", term6751);
        setField(term6743, term6743.getClass(), "propListHead", null);
        setIntField(term6743, term6743.getClass(), "sourcePosition", 0);
        setField(term6743, term6743.getClass(), "jsType", null);
        setField(term6743, term6743.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6743;
        try {
            callMethod(klass, "addList", argTypes, term6730, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


