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

public class NodeUtil_isFunction_931954219155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1408;
     Object term8960;

    public NodeUtil_isFunction_931954219155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1431 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1408, term1408.getClass(), "type", 1470349147);
        setIntField(term1410, term1410.getClass(), "type", -728760750);
        setIntField(term1412, term1412.getClass(), "type", 0);
        setField(term1412, term1412.getClass(), "next", null);
        setField(term1412, term1412.getClass(), "first", null);
        setField(term1412, term1412.getClass(), "last", null);
        setField(term1412, term1412.getClass(), "propListHead", null);
        setIntField(term1412, term1412.getClass(), "sourcePosition", 0);
        setField(term1412, term1412.getClass(), "jsType", null);
        setField(term1412, term1412.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "next", term1412);
        setIntField(term1415, term1415.getClass(), "type", 0);
        setField(term1415, term1415.getClass(), "next", null);
        setField(term1415, term1415.getClass(), "first", null);
        setField(term1415, term1415.getClass(), "last", null);
        setField(term1415, term1415.getClass(), "propListHead", null);
        setIntField(term1415, term1415.getClass(), "sourcePosition", 0);
        setField(term1415, term1415.getClass(), "jsType", null);
        setField(term1415, term1415.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "first", term1415);
        setIntField(term1418, term1418.getClass(), "type", 0);
        setField(term1418, term1418.getClass(), "next", null);
        setField(term1418, term1418.getClass(), "first", null);
        setField(term1418, term1418.getClass(), "last", null);
        setField(term1418, term1418.getClass(), "propListHead", null);
        setIntField(term1418, term1418.getClass(), "sourcePosition", 0);
        setField(term1418, term1418.getClass(), "jsType", null);
        setField(term1418, term1418.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "last", term1418);
        setField(term1421, term1421.getClass(), "next", null);
        setIntField(term1421, term1421.getClass(), "type", 0);
        setIntField(term1421, term1421.getClass(), "intValue", 0);
        setField(term1421, term1421.getClass(), "objectValue", null);
        setField(term1410, term1410.getClass(), "propListHead", term1421);
        setIntField(term1410, term1410.getClass(), "sourcePosition", -885788574);
        setField(term1410, term1410.getClass(), "jsType", null);
        setField(term1410, term1410.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "next", term1410);
        setIntField(term1425, term1425.getClass(), "type", 0);
        setField(term1425, term1425.getClass(), "next", null);
        setField(term1425, term1425.getClass(), "first", null);
        setField(term1425, term1425.getClass(), "last", null);
        setField(term1425, term1425.getClass(), "propListHead", null);
        setIntField(term1425, term1425.getClass(), "sourcePosition", 0);
        setField(term1425, term1425.getClass(), "jsType", null);
        setField(term1425, term1425.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "first", term1425);
        setIntField(term1428, term1428.getClass(), "type", 0);
        setField(term1428, term1428.getClass(), "next", null);
        setField(term1428, term1428.getClass(), "first", null);
        setField(term1428, term1428.getClass(), "last", null);
        setField(term1428, term1428.getClass(), "propListHead", null);
        setIntField(term1428, term1428.getClass(), "sourcePosition", 0);
        setField(term1428, term1428.getClass(), "jsType", null);
        setField(term1428, term1428.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "last", term1428);
        setField(term1431, term1431.getClass(), "next", null);
        setIntField(term1431, term1431.getClass(), "type", 0);
        setIntField(term1431, term1431.getClass(), "intValue", 0);
        setField(term1431, term1431.getClass(), "objectValue", null);
        setField(term1408, term1408.getClass(), "propListHead", term1431);
        setIntField(term1408, term1408.getClass(), "sourcePosition", -865722613);
        setField(term1408, term1408.getClass(), "jsType", null);
        setField(term1408, term1408.getClass(), "parent", null);
        term8960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8965 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8968 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8960, term8960.getClass(), "type", 1470349147);
        setIntField(term8961, term8961.getClass(), "type", -728760750);
        setIntField(term8962, term8962.getClass(), "type", 0);
        setField(term8962, term8962.getClass(), "next", null);
        setField(term8962, term8962.getClass(), "first", null);
        setField(term8962, term8962.getClass(), "last", null);
        setField(term8962, term8962.getClass(), "propListHead", null);
        setIntField(term8962, term8962.getClass(), "sourcePosition", 0);
        setField(term8962, term8962.getClass(), "jsType", null);
        setField(term8962, term8962.getClass(), "parent", null);
        setField(term8961, term8961.getClass(), "next", term8962);
        setIntField(term8963, term8963.getClass(), "type", 0);
        setField(term8963, term8963.getClass(), "next", null);
        setField(term8963, term8963.getClass(), "first", null);
        setField(term8963, term8963.getClass(), "last", null);
        setField(term8963, term8963.getClass(), "propListHead", null);
        setIntField(term8963, term8963.getClass(), "sourcePosition", 0);
        setField(term8963, term8963.getClass(), "jsType", null);
        setField(term8963, term8963.getClass(), "parent", null);
        setField(term8961, term8961.getClass(), "first", term8963);
        setIntField(term8964, term8964.getClass(), "type", 0);
        setField(term8964, term8964.getClass(), "next", null);
        setField(term8964, term8964.getClass(), "first", null);
        setField(term8964, term8964.getClass(), "last", null);
        setField(term8964, term8964.getClass(), "propListHead", null);
        setIntField(term8964, term8964.getClass(), "sourcePosition", 0);
        setField(term8964, term8964.getClass(), "jsType", null);
        setField(term8964, term8964.getClass(), "parent", null);
        setField(term8961, term8961.getClass(), "last", term8964);
        setField(term8965, term8965.getClass(), "next", null);
        setIntField(term8965, term8965.getClass(), "type", 0);
        setIntField(term8965, term8965.getClass(), "intValue", 0);
        setField(term8965, term8965.getClass(), "objectValue", null);
        setField(term8961, term8961.getClass(), "propListHead", term8965);
        setIntField(term8961, term8961.getClass(), "sourcePosition", -885788574);
        setField(term8961, term8961.getClass(), "jsType", null);
        setField(term8961, term8961.getClass(), "parent", null);
        setField(term8960, term8960.getClass(), "next", term8961);
        setIntField(term8966, term8966.getClass(), "type", 0);
        setField(term8966, term8966.getClass(), "next", null);
        setField(term8966, term8966.getClass(), "first", null);
        setField(term8966, term8966.getClass(), "last", null);
        setField(term8966, term8966.getClass(), "propListHead", null);
        setIntField(term8966, term8966.getClass(), "sourcePosition", 0);
        setField(term8966, term8966.getClass(), "jsType", null);
        setField(term8966, term8966.getClass(), "parent", null);
        setField(term8960, term8960.getClass(), "first", term8966);
        setIntField(term8967, term8967.getClass(), "type", 0);
        setField(term8967, term8967.getClass(), "next", null);
        setField(term8967, term8967.getClass(), "first", null);
        setField(term8967, term8967.getClass(), "last", null);
        setField(term8967, term8967.getClass(), "propListHead", null);
        setIntField(term8967, term8967.getClass(), "sourcePosition", 0);
        setField(term8967, term8967.getClass(), "jsType", null);
        setField(term8967, term8967.getClass(), "parent", null);
        setField(term8960, term8960.getClass(), "last", term8967);
        setField(term8968, term8968.getClass(), "next", null);
        setIntField(term8968, term8968.getClass(), "type", 0);
        setIntField(term8968, term8968.getClass(), "intValue", 0);
        setField(term8968, term8968.getClass(), "objectValue", null);
        setField(term8960, term8960.getClass(), "propListHead", term8968);
        setIntField(term8960, term8960.getClass(), "sourcePosition", -865722613);
        setField(term8960, term8960.getClass(), "jsType", null);
        setField(term8960, term8960.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1408;
        Object retValue = callMethod(klass, "isFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1408, term8960));
        assertTrue(recursiveEquals(retValue, false));
    }

};


