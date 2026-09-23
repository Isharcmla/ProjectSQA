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

public class NodeUtil_visitPreOrder_858432265286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3944;

    public NodeUtil_visitPreOrder_858432265286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3957 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3967 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3944, term3944.getClass(), "type", -718204437);
        setIntField(term3946, term3946.getClass(), "type", 1392910876);
        setIntField(term3948, term3948.getClass(), "type", 0);
        setField(term3948, term3948.getClass(), "next", null);
        setField(term3948, term3948.getClass(), "first", null);
        setField(term3948, term3948.getClass(), "last", null);
        setField(term3948, term3948.getClass(), "propListHead", null);
        setIntField(term3948, term3948.getClass(), "sourcePosition", 0);
        setField(term3948, term3948.getClass(), "jsType", null);
        setField(term3948, term3948.getClass(), "parent", null);
        setField(term3946, term3946.getClass(), "next", term3948);
        setIntField(term3951, term3951.getClass(), "type", 0);
        setField(term3951, term3951.getClass(), "next", null);
        setField(term3951, term3951.getClass(), "first", null);
        setField(term3951, term3951.getClass(), "last", null);
        setField(term3951, term3951.getClass(), "propListHead", null);
        setIntField(term3951, term3951.getClass(), "sourcePosition", 0);
        setField(term3951, term3951.getClass(), "jsType", null);
        setField(term3951, term3951.getClass(), "parent", null);
        setField(term3946, term3946.getClass(), "first", term3951);
        setIntField(term3954, term3954.getClass(), "type", 0);
        setField(term3954, term3954.getClass(), "next", null);
        setField(term3954, term3954.getClass(), "first", null);
        setField(term3954, term3954.getClass(), "last", null);
        setField(term3954, term3954.getClass(), "propListHead", null);
        setIntField(term3954, term3954.getClass(), "sourcePosition", 0);
        setField(term3954, term3954.getClass(), "jsType", null);
        setField(term3954, term3954.getClass(), "parent", null);
        setField(term3946, term3946.getClass(), "last", term3954);
        setField(term3957, term3957.getClass(), "next", null);
        setIntField(term3957, term3957.getClass(), "type", 0);
        setIntField(term3957, term3957.getClass(), "intValue", 0);
        setField(term3957, term3957.getClass(), "objectValue", null);
        setField(term3946, term3946.getClass(), "propListHead", term3957);
        setIntField(term3946, term3946.getClass(), "sourcePosition", 1729919228);
        setField(term3946, term3946.getClass(), "jsType", null);
        setField(term3946, term3946.getClass(), "parent", null);
        setField(term3944, term3944.getClass(), "next", term3946);
        setIntField(term3961, term3961.getClass(), "type", 0);
        setField(term3961, term3961.getClass(), "next", null);
        setField(term3961, term3961.getClass(), "first", null);
        setField(term3961, term3961.getClass(), "last", null);
        setField(term3961, term3961.getClass(), "propListHead", null);
        setIntField(term3961, term3961.getClass(), "sourcePosition", 0);
        setField(term3961, term3961.getClass(), "jsType", null);
        setField(term3961, term3961.getClass(), "parent", null);
        setField(term3944, term3944.getClass(), "first", term3961);
        setIntField(term3964, term3964.getClass(), "type", 0);
        setField(term3964, term3964.getClass(), "next", null);
        setField(term3964, term3964.getClass(), "first", null);
        setField(term3964, term3964.getClass(), "last", null);
        setField(term3964, term3964.getClass(), "propListHead", null);
        setIntField(term3964, term3964.getClass(), "sourcePosition", 0);
        setField(term3964, term3964.getClass(), "jsType", null);
        setField(term3964, term3964.getClass(), "parent", null);
        setField(term3944, term3944.getClass(), "last", term3964);
        setField(term3967, term3967.getClass(), "next", null);
        setIntField(term3967, term3967.getClass(), "type", 0);
        setIntField(term3967, term3967.getClass(), "intValue", 0);
        setField(term3967, term3967.getClass(), "objectValue", null);
        setField(term3944, term3944.getClass(), "propListHead", term3967);
        setIntField(term3944, term3944.getClass(), "sourcePosition", 872351195);
        setField(term3944, term3944.getClass(), "jsType", null);
        setField(term3944, term3944.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3944;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPreOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


