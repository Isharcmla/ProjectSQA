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
import java.lang.Integer;

public class NodeUtil_containsTypeInOuterScope_362749108174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920;
     Object term1947;
     Object term10960;

    public NodeUtil_containsTypeInOuterScope_362749108174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1933 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1943 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1920, term1920.getClass(), "type", -1576584269);
        setIntField(term1922, term1922.getClass(), "type", 722787672);
        setIntField(term1924, term1924.getClass(), "type", 0);
        setField(term1924, term1924.getClass(), "next", null);
        setField(term1924, term1924.getClass(), "first", null);
        setField(term1924, term1924.getClass(), "last", null);
        setField(term1924, term1924.getClass(), "propListHead", null);
        setIntField(term1924, term1924.getClass(), "sourcePosition", 0);
        setField(term1924, term1924.getClass(), "jsType", null);
        setField(term1924, term1924.getClass(), "parent", null);
        setField(term1922, term1922.getClass(), "next", term1924);
        setIntField(term1927, term1927.getClass(), "type", 0);
        setField(term1927, term1927.getClass(), "next", null);
        setField(term1927, term1927.getClass(), "first", null);
        setField(term1927, term1927.getClass(), "last", null);
        setField(term1927, term1927.getClass(), "propListHead", null);
        setIntField(term1927, term1927.getClass(), "sourcePosition", 0);
        setField(term1927, term1927.getClass(), "jsType", null);
        setField(term1927, term1927.getClass(), "parent", null);
        setField(term1922, term1922.getClass(), "first", term1927);
        setIntField(term1930, term1930.getClass(), "type", 0);
        setField(term1930, term1930.getClass(), "next", null);
        setField(term1930, term1930.getClass(), "first", null);
        setField(term1930, term1930.getClass(), "last", null);
        setField(term1930, term1930.getClass(), "propListHead", null);
        setIntField(term1930, term1930.getClass(), "sourcePosition", 0);
        setField(term1930, term1930.getClass(), "jsType", null);
        setField(term1930, term1930.getClass(), "parent", null);
        setField(term1922, term1922.getClass(), "last", term1930);
        setField(term1933, term1933.getClass(), "next", null);
        setIntField(term1933, term1933.getClass(), "type", 0);
        setIntField(term1933, term1933.getClass(), "intValue", 0);
        setField(term1933, term1933.getClass(), "objectValue", null);
        setField(term1922, term1922.getClass(), "propListHead", term1933);
        setIntField(term1922, term1922.getClass(), "sourcePosition", 47118909);
        setField(term1922, term1922.getClass(), "jsType", null);
        setField(term1922, term1922.getClass(), "parent", null);
        setField(term1920, term1920.getClass(), "next", term1922);
        setIntField(term1937, term1937.getClass(), "type", 0);
        setField(term1937, term1937.getClass(), "next", null);
        setField(term1937, term1937.getClass(), "first", null);
        setField(term1937, term1937.getClass(), "last", null);
        setField(term1937, term1937.getClass(), "propListHead", null);
        setIntField(term1937, term1937.getClass(), "sourcePosition", 0);
        setField(term1937, term1937.getClass(), "jsType", null);
        setField(term1937, term1937.getClass(), "parent", null);
        setField(term1920, term1920.getClass(), "first", term1937);
        setIntField(term1940, term1940.getClass(), "type", 0);
        setField(term1940, term1940.getClass(), "next", null);
        setField(term1940, term1940.getClass(), "first", null);
        setField(term1940, term1940.getClass(), "last", null);
        setField(term1940, term1940.getClass(), "propListHead", null);
        setIntField(term1940, term1940.getClass(), "sourcePosition", 0);
        setField(term1940, term1940.getClass(), "jsType", null);
        setField(term1940, term1940.getClass(), "parent", null);
        setField(term1920, term1920.getClass(), "last", term1940);
        setField(term1943, term1943.getClass(), "next", null);
        setIntField(term1943, term1943.getClass(), "type", 0);
        setIntField(term1943, term1943.getClass(), "intValue", 0);
        setField(term1943, term1943.getClass(), "objectValue", null);
        setField(term1920, term1920.getClass(), "propListHead", term1943);
        setIntField(term1920, term1920.getClass(), "sourcePosition", -2093707412);
        setField(term1920, term1920.getClass(), "jsType", null);
        setField(term1920, term1920.getClass(), "parent", null);
        term1947 = new Integer(-680627153);
        term10960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10965 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10968 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10960, term10960.getClass(), "type", -1576584269);
        setIntField(term10961, term10961.getClass(), "type", 722787672);
        setIntField(term10962, term10962.getClass(), "type", 0);
        setField(term10962, term10962.getClass(), "next", null);
        setField(term10962, term10962.getClass(), "first", null);
        setField(term10962, term10962.getClass(), "last", null);
        setField(term10962, term10962.getClass(), "propListHead", null);
        setIntField(term10962, term10962.getClass(), "sourcePosition", 0);
        setField(term10962, term10962.getClass(), "jsType", null);
        setField(term10962, term10962.getClass(), "parent", null);
        setField(term10961, term10961.getClass(), "next", term10962);
        setIntField(term10963, term10963.getClass(), "type", 0);
        setField(term10963, term10963.getClass(), "next", null);
        setField(term10963, term10963.getClass(), "first", null);
        setField(term10963, term10963.getClass(), "last", null);
        setField(term10963, term10963.getClass(), "propListHead", null);
        setIntField(term10963, term10963.getClass(), "sourcePosition", 0);
        setField(term10963, term10963.getClass(), "jsType", null);
        setField(term10963, term10963.getClass(), "parent", null);
        setField(term10961, term10961.getClass(), "first", term10963);
        setIntField(term10964, term10964.getClass(), "type", 0);
        setField(term10964, term10964.getClass(), "next", null);
        setField(term10964, term10964.getClass(), "first", null);
        setField(term10964, term10964.getClass(), "last", null);
        setField(term10964, term10964.getClass(), "propListHead", null);
        setIntField(term10964, term10964.getClass(), "sourcePosition", 0);
        setField(term10964, term10964.getClass(), "jsType", null);
        setField(term10964, term10964.getClass(), "parent", null);
        setField(term10961, term10961.getClass(), "last", term10964);
        setField(term10965, term10965.getClass(), "next", null);
        setIntField(term10965, term10965.getClass(), "type", 0);
        setIntField(term10965, term10965.getClass(), "intValue", 0);
        setField(term10965, term10965.getClass(), "objectValue", null);
        setField(term10961, term10961.getClass(), "propListHead", term10965);
        setIntField(term10961, term10961.getClass(), "sourcePosition", 47118909);
        setField(term10961, term10961.getClass(), "jsType", null);
        setField(term10961, term10961.getClass(), "parent", null);
        setField(term10960, term10960.getClass(), "next", term10961);
        setIntField(term10966, term10966.getClass(), "type", 0);
        setField(term10966, term10966.getClass(), "next", null);
        setField(term10966, term10966.getClass(), "first", null);
        setField(term10966, term10966.getClass(), "last", null);
        setField(term10966, term10966.getClass(), "propListHead", null);
        setIntField(term10966, term10966.getClass(), "sourcePosition", 0);
        setField(term10966, term10966.getClass(), "jsType", null);
        setField(term10966, term10966.getClass(), "parent", null);
        setField(term10960, term10960.getClass(), "first", term10966);
        setIntField(term10967, term10967.getClass(), "type", 0);
        setField(term10967, term10967.getClass(), "next", null);
        setField(term10967, term10967.getClass(), "first", null);
        setField(term10967, term10967.getClass(), "last", null);
        setField(term10967, term10967.getClass(), "propListHead", null);
        setIntField(term10967, term10967.getClass(), "sourcePosition", 0);
        setField(term10967, term10967.getClass(), "jsType", null);
        setField(term10967, term10967.getClass(), "parent", null);
        setField(term10960, term10960.getClass(), "last", term10967);
        setField(term10968, term10968.getClass(), "next", null);
        setIntField(term10968, term10968.getClass(), "type", 0);
        setIntField(term10968, term10968.getClass(), "intValue", 0);
        setField(term10968, term10968.getClass(), "objectValue", null);
        setField(term10960, term10960.getClass(), "propListHead", term10968);
        setIntField(term10960, term10960.getClass(), "sourcePosition", -2093707412);
        setField(term10960, term10960.getClass(), "jsType", null);
        setField(term10960, term10960.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1920;
        args[1] = term1947;
        callMethod(klass, "containsTypeInOuterScope", argTypes, null, args);
        assertTrue(recursiveEquals(term1920, -680627153));
        assertTrue(recursiveEquals(term1947, term10960));
    }

};


