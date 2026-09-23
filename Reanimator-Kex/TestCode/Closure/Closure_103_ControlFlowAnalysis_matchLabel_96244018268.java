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

public class ControlFlowAnalysis_matchLabel_96244018268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3057;
     Object term21428;

    public ControlFlowAnalysis_matchLabel_96244018268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3070 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3080 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3057, term3057.getClass(), "type", 1734759369);
        setIntField(term3059, term3059.getClass(), "type", -1986366126);
        setIntField(term3061, term3061.getClass(), "type", 0);
        setField(term3061, term3061.getClass(), "next", null);
        setField(term3061, term3061.getClass(), "first", null);
        setField(term3061, term3061.getClass(), "last", null);
        setField(term3061, term3061.getClass(), "propListHead", null);
        setIntField(term3061, term3061.getClass(), "sourcePosition", 0);
        setField(term3061, term3061.getClass(), "jsType", null);
        setField(term3061, term3061.getClass(), "parent", null);
        setField(term3059, term3059.getClass(), "next", term3061);
        setIntField(term3064, term3064.getClass(), "type", 0);
        setField(term3064, term3064.getClass(), "next", null);
        setField(term3064, term3064.getClass(), "first", null);
        setField(term3064, term3064.getClass(), "last", null);
        setField(term3064, term3064.getClass(), "propListHead", null);
        setIntField(term3064, term3064.getClass(), "sourcePosition", 0);
        setField(term3064, term3064.getClass(), "jsType", null);
        setField(term3064, term3064.getClass(), "parent", null);
        setField(term3059, term3059.getClass(), "first", term3064);
        setIntField(term3067, term3067.getClass(), "type", 0);
        setField(term3067, term3067.getClass(), "next", null);
        setField(term3067, term3067.getClass(), "first", null);
        setField(term3067, term3067.getClass(), "last", null);
        setField(term3067, term3067.getClass(), "propListHead", null);
        setIntField(term3067, term3067.getClass(), "sourcePosition", 0);
        setField(term3067, term3067.getClass(), "jsType", null);
        setField(term3067, term3067.getClass(), "parent", null);
        setField(term3059, term3059.getClass(), "last", term3067);
        setField(term3070, term3070.getClass(), "next", null);
        setIntField(term3070, term3070.getClass(), "type", 0);
        setIntField(term3070, term3070.getClass(), "intValue", 0);
        setField(term3070, term3070.getClass(), "objectValue", null);
        setField(term3059, term3059.getClass(), "propListHead", term3070);
        setIntField(term3059, term3059.getClass(), "sourcePosition", 847207929);
        setField(term3059, term3059.getClass(), "jsType", null);
        setField(term3059, term3059.getClass(), "parent", null);
        setField(term3057, term3057.getClass(), "next", term3059);
        setIntField(term3074, term3074.getClass(), "type", 0);
        setField(term3074, term3074.getClass(), "next", null);
        setField(term3074, term3074.getClass(), "first", null);
        setField(term3074, term3074.getClass(), "last", null);
        setField(term3074, term3074.getClass(), "propListHead", null);
        setIntField(term3074, term3074.getClass(), "sourcePosition", 0);
        setField(term3074, term3074.getClass(), "jsType", null);
        setField(term3074, term3074.getClass(), "parent", null);
        setField(term3057, term3057.getClass(), "first", term3074);
        setIntField(term3077, term3077.getClass(), "type", 0);
        setField(term3077, term3077.getClass(), "next", null);
        setField(term3077, term3077.getClass(), "first", null);
        setField(term3077, term3077.getClass(), "last", null);
        setField(term3077, term3077.getClass(), "propListHead", null);
        setIntField(term3077, term3077.getClass(), "sourcePosition", 0);
        setField(term3077, term3077.getClass(), "jsType", null);
        setField(term3077, term3077.getClass(), "parent", null);
        setField(term3057, term3057.getClass(), "last", term3077);
        setField(term3080, term3080.getClass(), "next", null);
        setIntField(term3080, term3080.getClass(), "type", 0);
        setIntField(term3080, term3080.getClass(), "intValue", 0);
        setField(term3080, term3080.getClass(), "objectValue", null);
        setField(term3057, term3057.getClass(), "propListHead", term3080);
        setIntField(term3057, term3057.getClass(), "sourcePosition", -1665928103);
        setField(term3057, term3057.getClass(), "jsType", null);
        setField(term3057, term3057.getClass(), "parent", null);
        term21428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21433 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21436 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term21428, term21428.getClass(), "type", 1734759369);
        setIntField(term21429, term21429.getClass(), "type", -1986366126);
        setIntField(term21430, term21430.getClass(), "type", 0);
        setField(term21430, term21430.getClass(), "next", null);
        setField(term21430, term21430.getClass(), "first", null);
        setField(term21430, term21430.getClass(), "last", null);
        setField(term21430, term21430.getClass(), "propListHead", null);
        setIntField(term21430, term21430.getClass(), "sourcePosition", 0);
        setField(term21430, term21430.getClass(), "jsType", null);
        setField(term21430, term21430.getClass(), "parent", null);
        setField(term21429, term21429.getClass(), "next", term21430);
        setIntField(term21431, term21431.getClass(), "type", 0);
        setField(term21431, term21431.getClass(), "next", null);
        setField(term21431, term21431.getClass(), "first", null);
        setField(term21431, term21431.getClass(), "last", null);
        setField(term21431, term21431.getClass(), "propListHead", null);
        setIntField(term21431, term21431.getClass(), "sourcePosition", 0);
        setField(term21431, term21431.getClass(), "jsType", null);
        setField(term21431, term21431.getClass(), "parent", null);
        setField(term21429, term21429.getClass(), "first", term21431);
        setIntField(term21432, term21432.getClass(), "type", 0);
        setField(term21432, term21432.getClass(), "next", null);
        setField(term21432, term21432.getClass(), "first", null);
        setField(term21432, term21432.getClass(), "last", null);
        setField(term21432, term21432.getClass(), "propListHead", null);
        setIntField(term21432, term21432.getClass(), "sourcePosition", 0);
        setField(term21432, term21432.getClass(), "jsType", null);
        setField(term21432, term21432.getClass(), "parent", null);
        setField(term21429, term21429.getClass(), "last", term21432);
        setField(term21433, term21433.getClass(), "next", null);
        setIntField(term21433, term21433.getClass(), "type", 0);
        setIntField(term21433, term21433.getClass(), "intValue", 0);
        setField(term21433, term21433.getClass(), "objectValue", null);
        setField(term21429, term21429.getClass(), "propListHead", term21433);
        setIntField(term21429, term21429.getClass(), "sourcePosition", 847207929);
        setField(term21429, term21429.getClass(), "jsType", null);
        setField(term21429, term21429.getClass(), "parent", null);
        setField(term21428, term21428.getClass(), "next", term21429);
        setIntField(term21434, term21434.getClass(), "type", 0);
        setField(term21434, term21434.getClass(), "next", null);
        setField(term21434, term21434.getClass(), "first", null);
        setField(term21434, term21434.getClass(), "last", null);
        setField(term21434, term21434.getClass(), "propListHead", null);
        setIntField(term21434, term21434.getClass(), "sourcePosition", 0);
        setField(term21434, term21434.getClass(), "jsType", null);
        setField(term21434, term21434.getClass(), "parent", null);
        setField(term21428, term21428.getClass(), "first", term21434);
        setIntField(term21435, term21435.getClass(), "type", 0);
        setField(term21435, term21435.getClass(), "next", null);
        setField(term21435, term21435.getClass(), "first", null);
        setField(term21435, term21435.getClass(), "last", null);
        setField(term21435, term21435.getClass(), "propListHead", null);
        setIntField(term21435, term21435.getClass(), "sourcePosition", 0);
        setField(term21435, term21435.getClass(), "jsType", null);
        setField(term21435, term21435.getClass(), "parent", null);
        setField(term21428, term21428.getClass(), "last", term21435);
        setField(term21436, term21436.getClass(), "next", null);
        setIntField(term21436, term21436.getClass(), "type", 0);
        setIntField(term21436, term21436.getClass(), "intValue", 0);
        setField(term21436, term21436.getClass(), "objectValue", null);
        setField(term21428, term21428.getClass(), "propListHead", term21436);
        setIntField(term21428, term21428.getClass(), "sourcePosition", -1665928103);
        setField(term21428, term21428.getClass(), "jsType", null);
        setField(term21428, term21428.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3057;
        args[1] = "jJCZpVmanW";
        Object retValue = callMethod(klass, "matchLabel", argTypes, null, args);
        assertTrue(recursiveEquals(term3057, term21428));
        assertTrue(recursiveEquals(retValue, false));
    }

};


