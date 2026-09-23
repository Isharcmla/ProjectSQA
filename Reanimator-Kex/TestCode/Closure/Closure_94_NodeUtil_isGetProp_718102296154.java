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

public class NodeUtil_isGetProp_718102296154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897;
     Object term8613;

    public NodeUtil_isGetProp_718102296154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term897, term897.getClass(), "type", -100825168);
        setIntField(term899, term899.getClass(), "type", -233024044);
        setIntField(term901, term901.getClass(), "type", 0);
        setField(term901, term901.getClass(), "next", null);
        setField(term901, term901.getClass(), "first", null);
        setField(term901, term901.getClass(), "last", null);
        setField(term901, term901.getClass(), "propListHead", null);
        setIntField(term901, term901.getClass(), "sourcePosition", 0);
        setField(term901, term901.getClass(), "jsType", null);
        setField(term901, term901.getClass(), "parent", null);
        setField(term899, term899.getClass(), "next", term901);
        setIntField(term904, term904.getClass(), "type", 0);
        setField(term904, term904.getClass(), "next", null);
        setField(term904, term904.getClass(), "first", null);
        setField(term904, term904.getClass(), "last", null);
        setField(term904, term904.getClass(), "propListHead", null);
        setIntField(term904, term904.getClass(), "sourcePosition", 0);
        setField(term904, term904.getClass(), "jsType", null);
        setField(term904, term904.getClass(), "parent", null);
        setField(term899, term899.getClass(), "first", term904);
        setIntField(term907, term907.getClass(), "type", 0);
        setField(term907, term907.getClass(), "next", null);
        setField(term907, term907.getClass(), "first", null);
        setField(term907, term907.getClass(), "last", null);
        setField(term907, term907.getClass(), "propListHead", null);
        setIntField(term907, term907.getClass(), "sourcePosition", 0);
        setField(term907, term907.getClass(), "jsType", null);
        setField(term907, term907.getClass(), "parent", null);
        setField(term899, term899.getClass(), "last", term907);
        setField(term910, term910.getClass(), "next", null);
        setIntField(term910, term910.getClass(), "type", 0);
        setIntField(term910, term910.getClass(), "intValue", 0);
        setField(term910, term910.getClass(), "objectValue", null);
        setField(term899, term899.getClass(), "propListHead", term910);
        setIntField(term899, term899.getClass(), "sourcePosition", -828982065);
        setField(term899, term899.getClass(), "jsType", null);
        setField(term899, term899.getClass(), "parent", null);
        setField(term897, term897.getClass(), "next", term899);
        setIntField(term914, term914.getClass(), "type", 0);
        setField(term914, term914.getClass(), "next", null);
        setField(term914, term914.getClass(), "first", null);
        setField(term914, term914.getClass(), "last", null);
        setField(term914, term914.getClass(), "propListHead", null);
        setIntField(term914, term914.getClass(), "sourcePosition", 0);
        setField(term914, term914.getClass(), "jsType", null);
        setField(term914, term914.getClass(), "parent", null);
        setField(term897, term897.getClass(), "first", term914);
        setIntField(term917, term917.getClass(), "type", 0);
        setField(term917, term917.getClass(), "next", null);
        setField(term917, term917.getClass(), "first", null);
        setField(term917, term917.getClass(), "last", null);
        setField(term917, term917.getClass(), "propListHead", null);
        setIntField(term917, term917.getClass(), "sourcePosition", 0);
        setField(term917, term917.getClass(), "jsType", null);
        setField(term917, term917.getClass(), "parent", null);
        setField(term897, term897.getClass(), "last", term917);
        setField(term920, term920.getClass(), "next", null);
        setIntField(term920, term920.getClass(), "type", 0);
        setIntField(term920, term920.getClass(), "intValue", 0);
        setField(term920, term920.getClass(), "objectValue", null);
        setField(term897, term897.getClass(), "propListHead", term920);
        setIntField(term897, term897.getClass(), "sourcePosition", 1221443226);
        setField(term897, term897.getClass(), "jsType", null);
        setField(term897, term897.getClass(), "parent", null);
        term8613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8618 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8621 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8613, term8613.getClass(), "type", -100825168);
        setIntField(term8614, term8614.getClass(), "type", -233024044);
        setIntField(term8615, term8615.getClass(), "type", 0);
        setField(term8615, term8615.getClass(), "next", null);
        setField(term8615, term8615.getClass(), "first", null);
        setField(term8615, term8615.getClass(), "last", null);
        setField(term8615, term8615.getClass(), "propListHead", null);
        setIntField(term8615, term8615.getClass(), "sourcePosition", 0);
        setField(term8615, term8615.getClass(), "jsType", null);
        setField(term8615, term8615.getClass(), "parent", null);
        setField(term8614, term8614.getClass(), "next", term8615);
        setIntField(term8616, term8616.getClass(), "type", 0);
        setField(term8616, term8616.getClass(), "next", null);
        setField(term8616, term8616.getClass(), "first", null);
        setField(term8616, term8616.getClass(), "last", null);
        setField(term8616, term8616.getClass(), "propListHead", null);
        setIntField(term8616, term8616.getClass(), "sourcePosition", 0);
        setField(term8616, term8616.getClass(), "jsType", null);
        setField(term8616, term8616.getClass(), "parent", null);
        setField(term8614, term8614.getClass(), "first", term8616);
        setIntField(term8617, term8617.getClass(), "type", 0);
        setField(term8617, term8617.getClass(), "next", null);
        setField(term8617, term8617.getClass(), "first", null);
        setField(term8617, term8617.getClass(), "last", null);
        setField(term8617, term8617.getClass(), "propListHead", null);
        setIntField(term8617, term8617.getClass(), "sourcePosition", 0);
        setField(term8617, term8617.getClass(), "jsType", null);
        setField(term8617, term8617.getClass(), "parent", null);
        setField(term8614, term8614.getClass(), "last", term8617);
        setField(term8618, term8618.getClass(), "next", null);
        setIntField(term8618, term8618.getClass(), "type", 0);
        setIntField(term8618, term8618.getClass(), "intValue", 0);
        setField(term8618, term8618.getClass(), "objectValue", null);
        setField(term8614, term8614.getClass(), "propListHead", term8618);
        setIntField(term8614, term8614.getClass(), "sourcePosition", -828982065);
        setField(term8614, term8614.getClass(), "jsType", null);
        setField(term8614, term8614.getClass(), "parent", null);
        setField(term8613, term8613.getClass(), "next", term8614);
        setIntField(term8619, term8619.getClass(), "type", 0);
        setField(term8619, term8619.getClass(), "next", null);
        setField(term8619, term8619.getClass(), "first", null);
        setField(term8619, term8619.getClass(), "last", null);
        setField(term8619, term8619.getClass(), "propListHead", null);
        setIntField(term8619, term8619.getClass(), "sourcePosition", 0);
        setField(term8619, term8619.getClass(), "jsType", null);
        setField(term8619, term8619.getClass(), "parent", null);
        setField(term8613, term8613.getClass(), "first", term8619);
        setIntField(term8620, term8620.getClass(), "type", 0);
        setField(term8620, term8620.getClass(), "next", null);
        setField(term8620, term8620.getClass(), "first", null);
        setField(term8620, term8620.getClass(), "last", null);
        setField(term8620, term8620.getClass(), "propListHead", null);
        setIntField(term8620, term8620.getClass(), "sourcePosition", 0);
        setField(term8620, term8620.getClass(), "jsType", null);
        setField(term8620, term8620.getClass(), "parent", null);
        setField(term8613, term8613.getClass(), "last", term8620);
        setField(term8621, term8621.getClass(), "next", null);
        setIntField(term8621, term8621.getClass(), "type", 0);
        setIntField(term8621, term8621.getClass(), "intValue", 0);
        setField(term8621, term8621.getClass(), "objectValue", null);
        setField(term8613, term8613.getClass(), "propListHead", term8621);
        setIntField(term8613, term8613.getClass(), "sourcePosition", 1221443226);
        setField(term8613, term8613.getClass(), "jsType", null);
        setField(term8613, term8613.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term897;
        Object retValue = callMethod(klass, "isGetProp", argTypes, null, args);
        assertTrue(recursiveEquals(term897, term8613));
        assertTrue(recursiveEquals(retValue, false));
    }

};


