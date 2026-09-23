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

public class NodeUtil_isExprCall_1790929530141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922;
     Object term7019;

    public NodeUtil_isExprCall_1790929530141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term935 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term945 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term922, term922.getClass(), "type", -1702055571);
        setIntField(term924, term924.getClass(), "type", 2143282300);
        setIntField(term926, term926.getClass(), "type", 0);
        setField(term926, term926.getClass(), "next", null);
        setField(term926, term926.getClass(), "first", null);
        setField(term926, term926.getClass(), "last", null);
        setField(term926, term926.getClass(), "propListHead", null);
        setIntField(term926, term926.getClass(), "sourcePosition", 0);
        setField(term926, term926.getClass(), "jsType", null);
        setField(term926, term926.getClass(), "parent", null);
        setField(term924, term924.getClass(), "next", term926);
        setIntField(term929, term929.getClass(), "type", 0);
        setField(term929, term929.getClass(), "next", null);
        setField(term929, term929.getClass(), "first", null);
        setField(term929, term929.getClass(), "last", null);
        setField(term929, term929.getClass(), "propListHead", null);
        setIntField(term929, term929.getClass(), "sourcePosition", 0);
        setField(term929, term929.getClass(), "jsType", null);
        setField(term929, term929.getClass(), "parent", null);
        setField(term924, term924.getClass(), "first", term929);
        setIntField(term932, term932.getClass(), "type", 0);
        setField(term932, term932.getClass(), "next", null);
        setField(term932, term932.getClass(), "first", null);
        setField(term932, term932.getClass(), "last", null);
        setField(term932, term932.getClass(), "propListHead", null);
        setIntField(term932, term932.getClass(), "sourcePosition", 0);
        setField(term932, term932.getClass(), "jsType", null);
        setField(term932, term932.getClass(), "parent", null);
        setField(term924, term924.getClass(), "last", term932);
        setField(term935, term935.getClass(), "next", null);
        setIntField(term935, term935.getClass(), "type", 0);
        setIntField(term935, term935.getClass(), "intValue", 0);
        setField(term935, term935.getClass(), "objectValue", null);
        setField(term924, term924.getClass(), "propListHead", term935);
        setIntField(term924, term924.getClass(), "sourcePosition", 301401782);
        setField(term924, term924.getClass(), "jsType", null);
        setField(term924, term924.getClass(), "parent", null);
        setField(term922, term922.getClass(), "next", term924);
        setIntField(term939, term939.getClass(), "type", 0);
        setField(term939, term939.getClass(), "next", null);
        setField(term939, term939.getClass(), "first", null);
        setField(term939, term939.getClass(), "last", null);
        setField(term939, term939.getClass(), "propListHead", null);
        setIntField(term939, term939.getClass(), "sourcePosition", 0);
        setField(term939, term939.getClass(), "jsType", null);
        setField(term939, term939.getClass(), "parent", null);
        setField(term922, term922.getClass(), "first", term939);
        setIntField(term942, term942.getClass(), "type", 0);
        setField(term942, term942.getClass(), "next", null);
        setField(term942, term942.getClass(), "first", null);
        setField(term942, term942.getClass(), "last", null);
        setField(term942, term942.getClass(), "propListHead", null);
        setIntField(term942, term942.getClass(), "sourcePosition", 0);
        setField(term942, term942.getClass(), "jsType", null);
        setField(term942, term942.getClass(), "parent", null);
        setField(term922, term922.getClass(), "last", term942);
        setField(term945, term945.getClass(), "next", null);
        setIntField(term945, term945.getClass(), "type", 0);
        setIntField(term945, term945.getClass(), "intValue", 0);
        setField(term945, term945.getClass(), "objectValue", null);
        setField(term922, term922.getClass(), "propListHead", term945);
        setIntField(term922, term922.getClass(), "sourcePosition", 1988605357);
        setField(term922, term922.getClass(), "jsType", null);
        setField(term922, term922.getClass(), "parent", null);
        term7019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7024 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7027 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7019, term7019.getClass(), "type", -1702055571);
        setIntField(term7020, term7020.getClass(), "type", 2143282300);
        setIntField(term7021, term7021.getClass(), "type", 0);
        setField(term7021, term7021.getClass(), "next", null);
        setField(term7021, term7021.getClass(), "first", null);
        setField(term7021, term7021.getClass(), "last", null);
        setField(term7021, term7021.getClass(), "propListHead", null);
        setIntField(term7021, term7021.getClass(), "sourcePosition", 0);
        setField(term7021, term7021.getClass(), "jsType", null);
        setField(term7021, term7021.getClass(), "parent", null);
        setField(term7020, term7020.getClass(), "next", term7021);
        setIntField(term7022, term7022.getClass(), "type", 0);
        setField(term7022, term7022.getClass(), "next", null);
        setField(term7022, term7022.getClass(), "first", null);
        setField(term7022, term7022.getClass(), "last", null);
        setField(term7022, term7022.getClass(), "propListHead", null);
        setIntField(term7022, term7022.getClass(), "sourcePosition", 0);
        setField(term7022, term7022.getClass(), "jsType", null);
        setField(term7022, term7022.getClass(), "parent", null);
        setField(term7020, term7020.getClass(), "first", term7022);
        setIntField(term7023, term7023.getClass(), "type", 0);
        setField(term7023, term7023.getClass(), "next", null);
        setField(term7023, term7023.getClass(), "first", null);
        setField(term7023, term7023.getClass(), "last", null);
        setField(term7023, term7023.getClass(), "propListHead", null);
        setIntField(term7023, term7023.getClass(), "sourcePosition", 0);
        setField(term7023, term7023.getClass(), "jsType", null);
        setField(term7023, term7023.getClass(), "parent", null);
        setField(term7020, term7020.getClass(), "last", term7023);
        setField(term7024, term7024.getClass(), "next", null);
        setIntField(term7024, term7024.getClass(), "type", 0);
        setIntField(term7024, term7024.getClass(), "intValue", 0);
        setField(term7024, term7024.getClass(), "objectValue", null);
        setField(term7020, term7020.getClass(), "propListHead", term7024);
        setIntField(term7020, term7020.getClass(), "sourcePosition", 301401782);
        setField(term7020, term7020.getClass(), "jsType", null);
        setField(term7020, term7020.getClass(), "parent", null);
        setField(term7019, term7019.getClass(), "next", term7020);
        setIntField(term7025, term7025.getClass(), "type", 0);
        setField(term7025, term7025.getClass(), "next", null);
        setField(term7025, term7025.getClass(), "first", null);
        setField(term7025, term7025.getClass(), "last", null);
        setField(term7025, term7025.getClass(), "propListHead", null);
        setIntField(term7025, term7025.getClass(), "sourcePosition", 0);
        setField(term7025, term7025.getClass(), "jsType", null);
        setField(term7025, term7025.getClass(), "parent", null);
        setField(term7019, term7019.getClass(), "first", term7025);
        setIntField(term7026, term7026.getClass(), "type", 0);
        setField(term7026, term7026.getClass(), "next", null);
        setField(term7026, term7026.getClass(), "first", null);
        setField(term7026, term7026.getClass(), "last", null);
        setField(term7026, term7026.getClass(), "propListHead", null);
        setIntField(term7026, term7026.getClass(), "sourcePosition", 0);
        setField(term7026, term7026.getClass(), "jsType", null);
        setField(term7026, term7026.getClass(), "parent", null);
        setField(term7019, term7019.getClass(), "last", term7026);
        setField(term7027, term7027.getClass(), "next", null);
        setIntField(term7027, term7027.getClass(), "type", 0);
        setIntField(term7027, term7027.getClass(), "intValue", 0);
        setField(term7027, term7027.getClass(), "objectValue", null);
        setField(term7019, term7019.getClass(), "propListHead", term7027);
        setIntField(term7019, term7019.getClass(), "sourcePosition", 1988605357);
        setField(term7019, term7019.getClass(), "jsType", null);
        setField(term7019, term7019.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term922;
        Object retValue = callMethod(klass, "isExprCall", argTypes, null, args);
        assertTrue(recursiveEquals(term922, term7019));
        assertTrue(recursiveEquals(retValue, false));
    }

};


