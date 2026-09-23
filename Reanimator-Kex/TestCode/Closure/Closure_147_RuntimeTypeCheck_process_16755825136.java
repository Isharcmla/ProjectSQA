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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RuntimeTypeCheck_process_16755825136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term36;
     Object term63;

    public RuntimeTypeCheck_process_16755825136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        setField(term23, term23.getClass(), "compiler", null);
        setField(term23, term23.getClass(), "logFunction", "sjlJAEtRrb");
        term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term36, term36.getClass(), "type", 391863371);
        setIntField(term38, term38.getClass(), "type", -2038273078);
        setIntField(term40, term40.getClass(), "type", 0);
        setField(term40, term40.getClass(), "next", null);
        setField(term40, term40.getClass(), "first", null);
        setField(term40, term40.getClass(), "last", null);
        setField(term40, term40.getClass(), "propListHead", null);
        setIntField(term40, term40.getClass(), "sourcePosition", 0);
        setField(term40, term40.getClass(), "jsType", null);
        setField(term40, term40.getClass(), "parent", null);
        setField(term38, term38.getClass(), "next", term40);
        setIntField(term43, term43.getClass(), "type", 0);
        setField(term43, term43.getClass(), "next", null);
        setField(term43, term43.getClass(), "first", null);
        setField(term43, term43.getClass(), "last", null);
        setField(term43, term43.getClass(), "propListHead", null);
        setIntField(term43, term43.getClass(), "sourcePosition", 0);
        setField(term43, term43.getClass(), "jsType", null);
        setField(term43, term43.getClass(), "parent", null);
        setField(term38, term38.getClass(), "first", term43);
        setIntField(term46, term46.getClass(), "type", 0);
        setField(term46, term46.getClass(), "next", null);
        setField(term46, term46.getClass(), "first", null);
        setField(term46, term46.getClass(), "last", null);
        setField(term46, term46.getClass(), "propListHead", null);
        setIntField(term46, term46.getClass(), "sourcePosition", 0);
        setField(term46, term46.getClass(), "jsType", null);
        setField(term46, term46.getClass(), "parent", null);
        setField(term38, term38.getClass(), "last", term46);
        setField(term49, term49.getClass(), "next", null);
        setIntField(term49, term49.getClass(), "type", 0);
        setIntField(term49, term49.getClass(), "intValue", 0);
        setField(term49, term49.getClass(), "objectValue", null);
        setField(term38, term38.getClass(), "propListHead", term49);
        setIntField(term38, term38.getClass(), "sourcePosition", 1725571209);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term36, term36.getClass(), "next", term38);
        setIntField(term53, term53.getClass(), "type", 0);
        setField(term53, term53.getClass(), "next", null);
        setField(term53, term53.getClass(), "first", null);
        setField(term53, term53.getClass(), "last", null);
        setField(term53, term53.getClass(), "propListHead", null);
        setIntField(term53, term53.getClass(), "sourcePosition", 0);
        setField(term53, term53.getClass(), "jsType", null);
        setField(term53, term53.getClass(), "parent", null);
        setField(term36, term36.getClass(), "first", term53);
        setIntField(term56, term56.getClass(), "type", 0);
        setField(term56, term56.getClass(), "next", null);
        setField(term56, term56.getClass(), "first", null);
        setField(term56, term56.getClass(), "last", null);
        setField(term56, term56.getClass(), "propListHead", null);
        setIntField(term56, term56.getClass(), "sourcePosition", 0);
        setField(term56, term56.getClass(), "jsType", null);
        setField(term56, term56.getClass(), "parent", null);
        setField(term36, term36.getClass(), "last", term56);
        setField(term59, term59.getClass(), "next", null);
        setIntField(term59, term59.getClass(), "type", 0);
        setIntField(term59, term59.getClass(), "intValue", 0);
        setField(term59, term59.getClass(), "objectValue", null);
        setField(term36, term36.getClass(), "propListHead", term59);
        setIntField(term36, term36.getClass(), "sourcePosition", -522618178);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        term63 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term63, term63.getClass(), "type", 597278769);
        setIntField(term65, term65.getClass(), "type", 1048535127);
        setIntField(term67, term67.getClass(), "type", 0);
        setField(term67, term67.getClass(), "next", null);
        setField(term67, term67.getClass(), "first", null);
        setField(term67, term67.getClass(), "last", null);
        setField(term67, term67.getClass(), "propListHead", null);
        setIntField(term67, term67.getClass(), "sourcePosition", 0);
        setField(term67, term67.getClass(), "jsType", null);
        setField(term67, term67.getClass(), "parent", null);
        setField(term65, term65.getClass(), "next", term67);
        setIntField(term70, term70.getClass(), "type", 0);
        setField(term70, term70.getClass(), "next", null);
        setField(term70, term70.getClass(), "first", null);
        setField(term70, term70.getClass(), "last", null);
        setField(term70, term70.getClass(), "propListHead", null);
        setIntField(term70, term70.getClass(), "sourcePosition", 0);
        setField(term70, term70.getClass(), "jsType", null);
        setField(term70, term70.getClass(), "parent", null);
        setField(term65, term65.getClass(), "first", term70);
        setIntField(term73, term73.getClass(), "type", 0);
        setField(term73, term73.getClass(), "next", null);
        setField(term73, term73.getClass(), "first", null);
        setField(term73, term73.getClass(), "last", null);
        setField(term73, term73.getClass(), "propListHead", null);
        setIntField(term73, term73.getClass(), "sourcePosition", 0);
        setField(term73, term73.getClass(), "jsType", null);
        setField(term73, term73.getClass(), "parent", null);
        setField(term65, term65.getClass(), "last", term73);
        setField(term76, term76.getClass(), "next", null);
        setIntField(term76, term76.getClass(), "type", 0);
        setIntField(term76, term76.getClass(), "intValue", 0);
        setField(term76, term76.getClass(), "objectValue", null);
        setField(term65, term65.getClass(), "propListHead", term76);
        setIntField(term65, term65.getClass(), "sourcePosition", -2068769794);
        setField(term65, term65.getClass(), "jsType", null);
        setField(term65, term65.getClass(), "parent", null);
        setField(term63, term63.getClass(), "next", term65);
        setIntField(term80, term80.getClass(), "type", 0);
        setField(term80, term80.getClass(), "next", null);
        setField(term80, term80.getClass(), "first", null);
        setField(term80, term80.getClass(), "last", null);
        setField(term80, term80.getClass(), "propListHead", null);
        setIntField(term80, term80.getClass(), "sourcePosition", 0);
        setField(term80, term80.getClass(), "jsType", null);
        setField(term80, term80.getClass(), "parent", null);
        setField(term63, term63.getClass(), "first", term80);
        setIntField(term83, term83.getClass(), "type", 0);
        setField(term83, term83.getClass(), "next", null);
        setField(term83, term83.getClass(), "first", null);
        setField(term83, term83.getClass(), "last", null);
        setField(term83, term83.getClass(), "propListHead", null);
        setIntField(term83, term83.getClass(), "sourcePosition", 0);
        setField(term83, term83.getClass(), "jsType", null);
        setField(term83, term83.getClass(), "parent", null);
        setField(term63, term63.getClass(), "last", term83);
        setField(term86, term86.getClass(), "next", null);
        setIntField(term86, term86.getClass(), "type", 0);
        setIntField(term86, term86.getClass(), "intValue", 0);
        setField(term86, term86.getClass(), "objectValue", null);
        setField(term63, term63.getClass(), "propListHead", term86);
        setIntField(term63, term63.getClass(), "sourcePosition", -117576464);
        setField(term63, term63.getClass(), "jsType", null);
        setField(term63, term63.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term36;
        args[1] = term63;
        try {
            callMethod(klass, "process", argTypes, term23, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


