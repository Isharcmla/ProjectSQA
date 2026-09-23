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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_isNull_1536879334193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049;
     Object term10734;

    public NodeUtil_isNull_1536879334193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1062 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1072 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1049, term1049.getClass(), "type", 499519708);
        setIntField(term1051, term1051.getClass(), "type", 200252898);
        setIntField(term1053, term1053.getClass(), "type", 0);
        setField(term1053, term1053.getClass(), "next", null);
        setField(term1053, term1053.getClass(), "first", null);
        setField(term1053, term1053.getClass(), "last", null);
        setField(term1053, term1053.getClass(), "propListHead", null);
        setIntField(term1053, term1053.getClass(), "sourcePosition", 0);
        setField(term1053, term1053.getClass(), "jsType", null);
        setField(term1053, term1053.getClass(), "parent", null);
        setField(term1051, term1051.getClass(), "next", term1053);
        setIntField(term1056, term1056.getClass(), "type", 0);
        setField(term1056, term1056.getClass(), "next", null);
        setField(term1056, term1056.getClass(), "first", null);
        setField(term1056, term1056.getClass(), "last", null);
        setField(term1056, term1056.getClass(), "propListHead", null);
        setIntField(term1056, term1056.getClass(), "sourcePosition", 0);
        setField(term1056, term1056.getClass(), "jsType", null);
        setField(term1056, term1056.getClass(), "parent", null);
        setField(term1051, term1051.getClass(), "first", term1056);
        setIntField(term1059, term1059.getClass(), "type", 0);
        setField(term1059, term1059.getClass(), "next", null);
        setField(term1059, term1059.getClass(), "first", null);
        setField(term1059, term1059.getClass(), "last", null);
        setField(term1059, term1059.getClass(), "propListHead", null);
        setIntField(term1059, term1059.getClass(), "sourcePosition", 0);
        setField(term1059, term1059.getClass(), "jsType", null);
        setField(term1059, term1059.getClass(), "parent", null);
        setField(term1051, term1051.getClass(), "last", term1059);
        setField(term1062, term1062.getClass(), "next", null);
        setIntField(term1062, term1062.getClass(), "type", 0);
        setIntField(term1062, term1062.getClass(), "intValue", 0);
        setField(term1062, term1062.getClass(), "objectValue", null);
        setField(term1051, term1051.getClass(), "propListHead", term1062);
        setIntField(term1051, term1051.getClass(), "sourcePosition", -1577069773);
        setField(term1051, term1051.getClass(), "jsType", null);
        setField(term1051, term1051.getClass(), "parent", null);
        setField(term1049, term1049.getClass(), "next", term1051);
        setIntField(term1066, term1066.getClass(), "type", 0);
        setField(term1066, term1066.getClass(), "next", null);
        setField(term1066, term1066.getClass(), "first", null);
        setField(term1066, term1066.getClass(), "last", null);
        setField(term1066, term1066.getClass(), "propListHead", null);
        setIntField(term1066, term1066.getClass(), "sourcePosition", 0);
        setField(term1066, term1066.getClass(), "jsType", null);
        setField(term1066, term1066.getClass(), "parent", null);
        setField(term1049, term1049.getClass(), "first", term1066);
        setIntField(term1069, term1069.getClass(), "type", 0);
        setField(term1069, term1069.getClass(), "next", null);
        setField(term1069, term1069.getClass(), "first", null);
        setField(term1069, term1069.getClass(), "last", null);
        setField(term1069, term1069.getClass(), "propListHead", null);
        setIntField(term1069, term1069.getClass(), "sourcePosition", 0);
        setField(term1069, term1069.getClass(), "jsType", null);
        setField(term1069, term1069.getClass(), "parent", null);
        setField(term1049, term1049.getClass(), "last", term1069);
        setField(term1072, term1072.getClass(), "next", null);
        setIntField(term1072, term1072.getClass(), "type", 0);
        setIntField(term1072, term1072.getClass(), "intValue", 0);
        setField(term1072, term1072.getClass(), "objectValue", null);
        setField(term1049, term1049.getClass(), "propListHead", term1072);
        setIntField(term1049, term1049.getClass(), "sourcePosition", -266625190);
        setField(term1049, term1049.getClass(), "jsType", null);
        setField(term1049, term1049.getClass(), "parent", null);
        term10734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10739 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10742 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10734, term10734.getClass(), "type", 499519708);
        setIntField(term10735, term10735.getClass(), "type", 200252898);
        setIntField(term10736, term10736.getClass(), "type", 0);
        setField(term10736, term10736.getClass(), "next", null);
        setField(term10736, term10736.getClass(), "first", null);
        setField(term10736, term10736.getClass(), "last", null);
        setField(term10736, term10736.getClass(), "propListHead", null);
        setIntField(term10736, term10736.getClass(), "sourcePosition", 0);
        setField(term10736, term10736.getClass(), "jsType", null);
        setField(term10736, term10736.getClass(), "parent", null);
        setField(term10735, term10735.getClass(), "next", term10736);
        setIntField(term10737, term10737.getClass(), "type", 0);
        setField(term10737, term10737.getClass(), "next", null);
        setField(term10737, term10737.getClass(), "first", null);
        setField(term10737, term10737.getClass(), "last", null);
        setField(term10737, term10737.getClass(), "propListHead", null);
        setIntField(term10737, term10737.getClass(), "sourcePosition", 0);
        setField(term10737, term10737.getClass(), "jsType", null);
        setField(term10737, term10737.getClass(), "parent", null);
        setField(term10735, term10735.getClass(), "first", term10737);
        setIntField(term10738, term10738.getClass(), "type", 0);
        setField(term10738, term10738.getClass(), "next", null);
        setField(term10738, term10738.getClass(), "first", null);
        setField(term10738, term10738.getClass(), "last", null);
        setField(term10738, term10738.getClass(), "propListHead", null);
        setIntField(term10738, term10738.getClass(), "sourcePosition", 0);
        setField(term10738, term10738.getClass(), "jsType", null);
        setField(term10738, term10738.getClass(), "parent", null);
        setField(term10735, term10735.getClass(), "last", term10738);
        setField(term10739, term10739.getClass(), "next", null);
        setIntField(term10739, term10739.getClass(), "type", 0);
        setIntField(term10739, term10739.getClass(), "intValue", 0);
        setField(term10739, term10739.getClass(), "objectValue", null);
        setField(term10735, term10735.getClass(), "propListHead", term10739);
        setIntField(term10735, term10735.getClass(), "sourcePosition", -1577069773);
        setField(term10735, term10735.getClass(), "jsType", null);
        setField(term10735, term10735.getClass(), "parent", null);
        setField(term10734, term10734.getClass(), "next", term10735);
        setIntField(term10740, term10740.getClass(), "type", 0);
        setField(term10740, term10740.getClass(), "next", null);
        setField(term10740, term10740.getClass(), "first", null);
        setField(term10740, term10740.getClass(), "last", null);
        setField(term10740, term10740.getClass(), "propListHead", null);
        setIntField(term10740, term10740.getClass(), "sourcePosition", 0);
        setField(term10740, term10740.getClass(), "jsType", null);
        setField(term10740, term10740.getClass(), "parent", null);
        setField(term10734, term10734.getClass(), "first", term10740);
        setIntField(term10741, term10741.getClass(), "type", 0);
        setField(term10741, term10741.getClass(), "next", null);
        setField(term10741, term10741.getClass(), "first", null);
        setField(term10741, term10741.getClass(), "last", null);
        setField(term10741, term10741.getClass(), "propListHead", null);
        setIntField(term10741, term10741.getClass(), "sourcePosition", 0);
        setField(term10741, term10741.getClass(), "jsType", null);
        setField(term10741, term10741.getClass(), "parent", null);
        setField(term10734, term10734.getClass(), "last", term10741);
        setField(term10742, term10742.getClass(), "next", null);
        setIntField(term10742, term10742.getClass(), "type", 0);
        setIntField(term10742, term10742.getClass(), "intValue", 0);
        setField(term10742, term10742.getClass(), "objectValue", null);
        setField(term10734, term10734.getClass(), "propListHead", term10742);
        setIntField(term10734, term10734.getClass(), "sourcePosition", -266625190);
        setField(term10734, term10734.getClass(), "jsType", null);
        setField(term10734, term10734.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1049;
        Object retValue = callMethod(klass, "isNull", argTypes, null, args);
        assertTrue(recursiveEquals(term1049, term10734));
        assertTrue(recursiveEquals(retValue, false));
    }

};


