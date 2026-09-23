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

public class NodeUtil_isExprCall_1790929530140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922;
     Object term6991;

    public NodeUtil_isExprCall_1790929530140() {
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
        term6991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6996 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6999 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6991, term6991.getClass(), "type", -1702055571);
        setIntField(term6992, term6992.getClass(), "type", 2143282300);
        setIntField(term6993, term6993.getClass(), "type", 0);
        setField(term6993, term6993.getClass(), "next", null);
        setField(term6993, term6993.getClass(), "first", null);
        setField(term6993, term6993.getClass(), "last", null);
        setField(term6993, term6993.getClass(), "propListHead", null);
        setIntField(term6993, term6993.getClass(), "sourcePosition", 0);
        setField(term6993, term6993.getClass(), "jsType", null);
        setField(term6993, term6993.getClass(), "parent", null);
        setField(term6992, term6992.getClass(), "next", term6993);
        setIntField(term6994, term6994.getClass(), "type", 0);
        setField(term6994, term6994.getClass(), "next", null);
        setField(term6994, term6994.getClass(), "first", null);
        setField(term6994, term6994.getClass(), "last", null);
        setField(term6994, term6994.getClass(), "propListHead", null);
        setIntField(term6994, term6994.getClass(), "sourcePosition", 0);
        setField(term6994, term6994.getClass(), "jsType", null);
        setField(term6994, term6994.getClass(), "parent", null);
        setField(term6992, term6992.getClass(), "first", term6994);
        setIntField(term6995, term6995.getClass(), "type", 0);
        setField(term6995, term6995.getClass(), "next", null);
        setField(term6995, term6995.getClass(), "first", null);
        setField(term6995, term6995.getClass(), "last", null);
        setField(term6995, term6995.getClass(), "propListHead", null);
        setIntField(term6995, term6995.getClass(), "sourcePosition", 0);
        setField(term6995, term6995.getClass(), "jsType", null);
        setField(term6995, term6995.getClass(), "parent", null);
        setField(term6992, term6992.getClass(), "last", term6995);
        setField(term6996, term6996.getClass(), "next", null);
        setIntField(term6996, term6996.getClass(), "type", 0);
        setIntField(term6996, term6996.getClass(), "intValue", 0);
        setField(term6996, term6996.getClass(), "objectValue", null);
        setField(term6992, term6992.getClass(), "propListHead", term6996);
        setIntField(term6992, term6992.getClass(), "sourcePosition", 301401782);
        setField(term6992, term6992.getClass(), "jsType", null);
        setField(term6992, term6992.getClass(), "parent", null);
        setField(term6991, term6991.getClass(), "next", term6992);
        setIntField(term6997, term6997.getClass(), "type", 0);
        setField(term6997, term6997.getClass(), "next", null);
        setField(term6997, term6997.getClass(), "first", null);
        setField(term6997, term6997.getClass(), "last", null);
        setField(term6997, term6997.getClass(), "propListHead", null);
        setIntField(term6997, term6997.getClass(), "sourcePosition", 0);
        setField(term6997, term6997.getClass(), "jsType", null);
        setField(term6997, term6997.getClass(), "parent", null);
        setField(term6991, term6991.getClass(), "first", term6997);
        setIntField(term6998, term6998.getClass(), "type", 0);
        setField(term6998, term6998.getClass(), "next", null);
        setField(term6998, term6998.getClass(), "first", null);
        setField(term6998, term6998.getClass(), "last", null);
        setField(term6998, term6998.getClass(), "propListHead", null);
        setIntField(term6998, term6998.getClass(), "sourcePosition", 0);
        setField(term6998, term6998.getClass(), "jsType", null);
        setField(term6998, term6998.getClass(), "parent", null);
        setField(term6991, term6991.getClass(), "last", term6998);
        setField(term6999, term6999.getClass(), "next", null);
        setIntField(term6999, term6999.getClass(), "type", 0);
        setIntField(term6999, term6999.getClass(), "intValue", 0);
        setField(term6999, term6999.getClass(), "objectValue", null);
        setField(term6991, term6991.getClass(), "propListHead", term6999);
        setIntField(term6991, term6991.getClass(), "sourcePosition", 1988605357);
        setField(term6991, term6991.getClass(), "jsType", null);
        setField(term6991, term6991.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term922;
        Object retValue = callMethod(klass, "isExprCall", argTypes, null, args);
        assertTrue(recursiveEquals(term922, term6991));
        assertTrue(recursiveEquals(retValue, false));
    }

};


