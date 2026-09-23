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

public class NodeUtil_isNumericResultHelper_1608168361189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941;
     Object term10545;

    public NodeUtil_isNumericResultHelper_1608168361189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term954 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term964 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term941, term941.getClass(), "type", -100825168);
        setIntField(term943, term943.getClass(), "type", -233024044);
        setIntField(term945, term945.getClass(), "type", 0);
        setField(term945, term945.getClass(), "next", null);
        setField(term945, term945.getClass(), "first", null);
        setField(term945, term945.getClass(), "last", null);
        setField(term945, term945.getClass(), "propListHead", null);
        setIntField(term945, term945.getClass(), "sourcePosition", 0);
        setField(term945, term945.getClass(), "jsType", null);
        setField(term945, term945.getClass(), "parent", null);
        setField(term943, term943.getClass(), "next", term945);
        setIntField(term948, term948.getClass(), "type", 0);
        setField(term948, term948.getClass(), "next", null);
        setField(term948, term948.getClass(), "first", null);
        setField(term948, term948.getClass(), "last", null);
        setField(term948, term948.getClass(), "propListHead", null);
        setIntField(term948, term948.getClass(), "sourcePosition", 0);
        setField(term948, term948.getClass(), "jsType", null);
        setField(term948, term948.getClass(), "parent", null);
        setField(term943, term943.getClass(), "first", term948);
        setIntField(term951, term951.getClass(), "type", 0);
        setField(term951, term951.getClass(), "next", null);
        setField(term951, term951.getClass(), "first", null);
        setField(term951, term951.getClass(), "last", null);
        setField(term951, term951.getClass(), "propListHead", null);
        setIntField(term951, term951.getClass(), "sourcePosition", 0);
        setField(term951, term951.getClass(), "jsType", null);
        setField(term951, term951.getClass(), "parent", null);
        setField(term943, term943.getClass(), "last", term951);
        setField(term954, term954.getClass(), "next", null);
        setIntField(term954, term954.getClass(), "type", 0);
        setIntField(term954, term954.getClass(), "intValue", 0);
        setField(term954, term954.getClass(), "objectValue", null);
        setField(term943, term943.getClass(), "propListHead", term954);
        setIntField(term943, term943.getClass(), "sourcePosition", -828982065);
        setField(term943, term943.getClass(), "jsType", null);
        setField(term943, term943.getClass(), "parent", null);
        setField(term941, term941.getClass(), "next", term943);
        setIntField(term958, term958.getClass(), "type", 0);
        setField(term958, term958.getClass(), "next", null);
        setField(term958, term958.getClass(), "first", null);
        setField(term958, term958.getClass(), "last", null);
        setField(term958, term958.getClass(), "propListHead", null);
        setIntField(term958, term958.getClass(), "sourcePosition", 0);
        setField(term958, term958.getClass(), "jsType", null);
        setField(term958, term958.getClass(), "parent", null);
        setField(term941, term941.getClass(), "first", term958);
        setIntField(term961, term961.getClass(), "type", 0);
        setField(term961, term961.getClass(), "next", null);
        setField(term961, term961.getClass(), "first", null);
        setField(term961, term961.getClass(), "last", null);
        setField(term961, term961.getClass(), "propListHead", null);
        setIntField(term961, term961.getClass(), "sourcePosition", 0);
        setField(term961, term961.getClass(), "jsType", null);
        setField(term961, term961.getClass(), "parent", null);
        setField(term941, term941.getClass(), "last", term961);
        setField(term964, term964.getClass(), "next", null);
        setIntField(term964, term964.getClass(), "type", 0);
        setIntField(term964, term964.getClass(), "intValue", 0);
        setField(term964, term964.getClass(), "objectValue", null);
        setField(term941, term941.getClass(), "propListHead", term964);
        setIntField(term941, term941.getClass(), "sourcePosition", 1221443226);
        setField(term941, term941.getClass(), "jsType", null);
        setField(term941, term941.getClass(), "parent", null);
        term10545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10550 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10553 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10545, term10545.getClass(), "type", -100825168);
        setIntField(term10546, term10546.getClass(), "type", -233024044);
        setIntField(term10547, term10547.getClass(), "type", 0);
        setField(term10547, term10547.getClass(), "next", null);
        setField(term10547, term10547.getClass(), "first", null);
        setField(term10547, term10547.getClass(), "last", null);
        setField(term10547, term10547.getClass(), "propListHead", null);
        setIntField(term10547, term10547.getClass(), "sourcePosition", 0);
        setField(term10547, term10547.getClass(), "jsType", null);
        setField(term10547, term10547.getClass(), "parent", null);
        setField(term10546, term10546.getClass(), "next", term10547);
        setIntField(term10548, term10548.getClass(), "type", 0);
        setField(term10548, term10548.getClass(), "next", null);
        setField(term10548, term10548.getClass(), "first", null);
        setField(term10548, term10548.getClass(), "last", null);
        setField(term10548, term10548.getClass(), "propListHead", null);
        setIntField(term10548, term10548.getClass(), "sourcePosition", 0);
        setField(term10548, term10548.getClass(), "jsType", null);
        setField(term10548, term10548.getClass(), "parent", null);
        setField(term10546, term10546.getClass(), "first", term10548);
        setIntField(term10549, term10549.getClass(), "type", 0);
        setField(term10549, term10549.getClass(), "next", null);
        setField(term10549, term10549.getClass(), "first", null);
        setField(term10549, term10549.getClass(), "last", null);
        setField(term10549, term10549.getClass(), "propListHead", null);
        setIntField(term10549, term10549.getClass(), "sourcePosition", 0);
        setField(term10549, term10549.getClass(), "jsType", null);
        setField(term10549, term10549.getClass(), "parent", null);
        setField(term10546, term10546.getClass(), "last", term10549);
        setField(term10550, term10550.getClass(), "next", null);
        setIntField(term10550, term10550.getClass(), "type", 0);
        setIntField(term10550, term10550.getClass(), "intValue", 0);
        setField(term10550, term10550.getClass(), "objectValue", null);
        setField(term10546, term10546.getClass(), "propListHead", term10550);
        setIntField(term10546, term10546.getClass(), "sourcePosition", -828982065);
        setField(term10546, term10546.getClass(), "jsType", null);
        setField(term10546, term10546.getClass(), "parent", null);
        setField(term10545, term10545.getClass(), "next", term10546);
        setIntField(term10551, term10551.getClass(), "type", 0);
        setField(term10551, term10551.getClass(), "next", null);
        setField(term10551, term10551.getClass(), "first", null);
        setField(term10551, term10551.getClass(), "last", null);
        setField(term10551, term10551.getClass(), "propListHead", null);
        setIntField(term10551, term10551.getClass(), "sourcePosition", 0);
        setField(term10551, term10551.getClass(), "jsType", null);
        setField(term10551, term10551.getClass(), "parent", null);
        setField(term10545, term10545.getClass(), "first", term10551);
        setIntField(term10552, term10552.getClass(), "type", 0);
        setField(term10552, term10552.getClass(), "next", null);
        setField(term10552, term10552.getClass(), "first", null);
        setField(term10552, term10552.getClass(), "last", null);
        setField(term10552, term10552.getClass(), "propListHead", null);
        setIntField(term10552, term10552.getClass(), "sourcePosition", 0);
        setField(term10552, term10552.getClass(), "jsType", null);
        setField(term10552, term10552.getClass(), "parent", null);
        setField(term10545, term10545.getClass(), "last", term10552);
        setField(term10553, term10553.getClass(), "next", null);
        setIntField(term10553, term10553.getClass(), "type", 0);
        setIntField(term10553, term10553.getClass(), "intValue", 0);
        setField(term10553, term10553.getClass(), "objectValue", null);
        setField(term10545, term10545.getClass(), "propListHead", term10553);
        setIntField(term10545, term10545.getClass(), "sourcePosition", 1221443226);
        setField(term10545, term10545.getClass(), "jsType", null);
        setField(term10545, term10545.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term941;
        Object retValue = callMethod(klass, "isNumericResultHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term941, term10545));
        assertTrue(recursiveEquals(retValue, false));
    }

};


