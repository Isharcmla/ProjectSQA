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
import java.util.ArrayDeque;
import java.lang.Object;

public class CoalesceVariableNames_process_4371204549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term9;
     Object term36;

    public CoalesceVariableNames_process_4371204549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4 = new ArrayDeque();
        term3 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term3, term3.getClass(), "compiler", null);
        setField(term3, term3.getClass(), "colorings", term4);
        setBooleanField(term3, term3.getClass(), "usePseudoNames", false);
        term9 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term26 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9, term9.getClass(), "type", 391863371);
        setIntField(term11, term11.getClass(), "type", -2038273078);
        setIntField(term13, term13.getClass(), "type", 0);
        setField(term13, term13.getClass(), "next", null);
        setField(term13, term13.getClass(), "first", null);
        setField(term13, term13.getClass(), "last", null);
        setField(term13, term13.getClass(), "propListHead", null);
        setIntField(term13, term13.getClass(), "sourcePosition", 0);
        setField(term13, term13.getClass(), "jsType", null);
        setField(term13, term13.getClass(), "parent", null);
        setField(term11, term11.getClass(), "next", term13);
        setIntField(term16, term16.getClass(), "type", 0);
        setField(term16, term16.getClass(), "next", null);
        setField(term16, term16.getClass(), "first", null);
        setField(term16, term16.getClass(), "last", null);
        setField(term16, term16.getClass(), "propListHead", null);
        setIntField(term16, term16.getClass(), "sourcePosition", 0);
        setField(term16, term16.getClass(), "jsType", null);
        setField(term16, term16.getClass(), "parent", null);
        setField(term11, term11.getClass(), "first", term16);
        setIntField(term19, term19.getClass(), "type", 0);
        setField(term19, term19.getClass(), "next", null);
        setField(term19, term19.getClass(), "first", null);
        setField(term19, term19.getClass(), "last", null);
        setField(term19, term19.getClass(), "propListHead", null);
        setIntField(term19, term19.getClass(), "sourcePosition", 0);
        setField(term19, term19.getClass(), "jsType", null);
        setField(term19, term19.getClass(), "parent", null);
        setField(term11, term11.getClass(), "last", term19);
        setField(term22, term22.getClass(), "next", null);
        setIntField(term22, term22.getClass(), "type", 0);
        setIntField(term22, term22.getClass(), "intValue", 0);
        setField(term22, term22.getClass(), "objectValue", null);
        setField(term11, term11.getClass(), "propListHead", term22);
        setIntField(term11, term11.getClass(), "sourcePosition", 1725571209);
        setField(term11, term11.getClass(), "jsType", null);
        setField(term11, term11.getClass(), "parent", null);
        setField(term9, term9.getClass(), "next", term11);
        setIntField(term26, term26.getClass(), "type", 0);
        setField(term26, term26.getClass(), "next", null);
        setField(term26, term26.getClass(), "first", null);
        setField(term26, term26.getClass(), "last", null);
        setField(term26, term26.getClass(), "propListHead", null);
        setIntField(term26, term26.getClass(), "sourcePosition", 0);
        setField(term26, term26.getClass(), "jsType", null);
        setField(term26, term26.getClass(), "parent", null);
        setField(term9, term9.getClass(), "first", term26);
        setIntField(term29, term29.getClass(), "type", 0);
        setField(term29, term29.getClass(), "next", null);
        setField(term29, term29.getClass(), "first", null);
        setField(term29, term29.getClass(), "last", null);
        setField(term29, term29.getClass(), "propListHead", null);
        setIntField(term29, term29.getClass(), "sourcePosition", 0);
        setField(term29, term29.getClass(), "jsType", null);
        setField(term29, term29.getClass(), "parent", null);
        setField(term9, term9.getClass(), "last", term29);
        setField(term32, term32.getClass(), "next", null);
        setIntField(term32, term32.getClass(), "type", 0);
        setIntField(term32, term32.getClass(), "intValue", 0);
        setField(term32, term32.getClass(), "objectValue", null);
        setField(term9, term9.getClass(), "propListHead", term32);
        setIntField(term9, term9.getClass(), "sourcePosition", -522618178);
        setField(term9, term9.getClass(), "jsType", null);
        setField(term9, term9.getClass(), "parent", null);
        term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term36, term36.getClass(), "type", 597278769);
        setIntField(term38, term38.getClass(), "type", 1048535127);
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
        setIntField(term38, term38.getClass(), "sourcePosition", -2068769794);
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
        setIntField(term36, term36.getClass(), "sourcePosition", -117576464);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term9;
        args[1] = term36;
        try {
            callMethod(klass, "process", argTypes, term3, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


