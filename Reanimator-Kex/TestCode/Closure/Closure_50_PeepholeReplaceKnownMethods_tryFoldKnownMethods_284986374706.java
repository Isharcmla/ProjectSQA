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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3613497;
     Object term3613589;
     Object term3614863;
     Object term3614864;
     Object term3614665;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3613497 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3613589 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3613681 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3613773 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3613865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3613995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3613681, term3613681.getClass(), "type", 35);
        setIntField(term3613865, term3613865.getClass(), "type", 40);
        setField(term3613865, term3613865.getClass(), "str", "");
        setField(term3613773, term3613773.getClass(), "next", term3613865);
        setIntField(term3613773, term3613773.getClass(), "type", 40);
        setField(term3613681, term3613681.getClass(), "first", term3613773);
        setIntField(term3613995, term3613995.getClass(), "type", 43);
        setField(term3613681, term3613681.getClass(), "next", term3613995);
        setField(term3613589, term3613589.getClass(), "first", term3613681);
        setIntField(term3613589, term3613589.getClass(), "type", 37);
        term3614863 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3614863, term3614863.getClass(), "currentTraversal", null);
        term3614864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3614865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3614866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3614867 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3614868 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3614864, term3614864.getClass(), "str", null);
        setIntField(term3614864, term3614864.getClass(), "type", 37);
        setField(term3614864, term3614864.getClass(), "next", null);
        setField(term3614865, term3614865.getClass(), "str", null);
        setIntField(term3614865, term3614865.getClass(), "type", 35);
        setDoubleField(term3614866, term3614866.getClass(), "number", 0.0);
        setIntField(term3614866, term3614866.getClass(), "type", 43);
        setField(term3614866, term3614866.getClass(), "next", null);
        setField(term3614866, term3614866.getClass(), "first", null);
        setField(term3614866, term3614866.getClass(), "last", null);
        setField(term3614866, term3614866.getClass(), "propListHead", null);
        setIntField(term3614866, term3614866.getClass(), "sourcePosition", 0);
        setField(term3614866, term3614866.getClass(), "jsType", null);
        setField(term3614866, term3614866.getClass(), "parent", null);
        setField(term3614865, term3614865.getClass(), "next", term3614866);
        setField(term3614867, term3614867.getClass(), "str", null);
        setIntField(term3614867, term3614867.getClass(), "type", 40);
        setField(term3614868, term3614868.getClass(), "str", "");
        setIntField(term3614868, term3614868.getClass(), "type", 40);
        setField(term3614868, term3614868.getClass(), "next", null);
        setField(term3614868, term3614868.getClass(), "first", null);
        setField(term3614868, term3614868.getClass(), "last", null);
        setField(term3614868, term3614868.getClass(), "propListHead", null);
        setIntField(term3614868, term3614868.getClass(), "sourcePosition", 0);
        setField(term3614868, term3614868.getClass(), "jsType", null);
        setField(term3614868, term3614868.getClass(), "parent", null);
        setField(term3614867, term3614867.getClass(), "next", term3614868);
        setField(term3614867, term3614867.getClass(), "first", null);
        setField(term3614867, term3614867.getClass(), "last", null);
        setField(term3614867, term3614867.getClass(), "propListHead", null);
        setIntField(term3614867, term3614867.getClass(), "sourcePosition", 0);
        setField(term3614867, term3614867.getClass(), "jsType", null);
        setField(term3614867, term3614867.getClass(), "parent", null);
        setField(term3614865, term3614865.getClass(), "first", term3614867);
        setField(term3614865, term3614865.getClass(), "last", null);
        setField(term3614865, term3614865.getClass(), "propListHead", null);
        setIntField(term3614865, term3614865.getClass(), "sourcePosition", 0);
        setField(term3614865, term3614865.getClass(), "jsType", null);
        setField(term3614865, term3614865.getClass(), "parent", null);
        setField(term3614864, term3614864.getClass(), "first", term3614865);
        setField(term3614864, term3614864.getClass(), "last", null);
        setField(term3614864, term3614864.getClass(), "propListHead", null);
        setIntField(term3614864, term3614864.getClass(), "sourcePosition", 0);
        setField(term3614864, term3614864.getClass(), "jsType", null);
        setField(term3614864, term3614864.getClass(), "parent", null);
        term3614665 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3614667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3614669 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3614673 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3614675 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3614665, term3614665.getClass(), "str", null);
        setIntField(term3614665, term3614665.getClass(), "type", 37);
        setField(term3614665, term3614665.getClass(), "next", null);
        setField(term3614667, term3614667.getClass(), "str", null);
        setIntField(term3614667, term3614667.getClass(), "type", 35);
        setDoubleField(term3614669, term3614669.getClass(), "number", 0.0);
        setIntField(term3614669, term3614669.getClass(), "type", 43);
        setField(term3614669, term3614669.getClass(), "next", null);
        setField(term3614669, term3614669.getClass(), "first", null);
        setField(term3614669, term3614669.getClass(), "last", null);
        setField(term3614669, term3614669.getClass(), "propListHead", null);
        setIntField(term3614669, term3614669.getClass(), "sourcePosition", 0);
        setField(term3614669, term3614669.getClass(), "jsType", null);
        setField(term3614669, term3614669.getClass(), "parent", null);
        setField(term3614667, term3614667.getClass(), "next", term3614669);
        setField(term3614673, term3614673.getClass(), "str", null);
        setIntField(term3614673, term3614673.getClass(), "type", 40);
        setField(term3614675, term3614675.getClass(), "str", "");
        setIntField(term3614675, term3614675.getClass(), "type", 40);
        setField(term3614675, term3614675.getClass(), "next", null);
        setField(term3614675, term3614675.getClass(), "first", null);
        setField(term3614675, term3614675.getClass(), "last", null);
        setField(term3614675, term3614675.getClass(), "propListHead", null);
        setIntField(term3614675, term3614675.getClass(), "sourcePosition", 0);
        setField(term3614675, term3614675.getClass(), "jsType", null);
        setField(term3614675, term3614675.getClass(), "parent", null);
        setField(term3614673, term3614673.getClass(), "next", term3614675);
        setField(term3614673, term3614673.getClass(), "first", null);
        setField(term3614673, term3614673.getClass(), "last", null);
        setField(term3614673, term3614673.getClass(), "propListHead", null);
        setIntField(term3614673, term3614673.getClass(), "sourcePosition", 0);
        setField(term3614673, term3614673.getClass(), "jsType", null);
        setField(term3614673, term3614673.getClass(), "parent", null);
        setField(term3614667, term3614667.getClass(), "first", term3614673);
        setField(term3614667, term3614667.getClass(), "last", null);
        setField(term3614667, term3614667.getClass(), "propListHead", null);
        setIntField(term3614667, term3614667.getClass(), "sourcePosition", 0);
        setField(term3614667, term3614667.getClass(), "jsType", null);
        setField(term3614667, term3614667.getClass(), "parent", null);
        setField(term3614665, term3614665.getClass(), "first", term3614667);
        setField(term3614665, term3614665.getClass(), "last", null);
        setField(term3614665, term3614665.getClass(), "propListHead", null);
        setIntField(term3614665, term3614665.getClass(), "sourcePosition", 0);
        setField(term3614665, term3614665.getClass(), "jsType", null);
        setField(term3614665, term3614665.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3613589;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3613497, args);
        assertTrue(recursiveEquals(term3613497, term3614863));
        assertTrue(recursiveEquals(term3613589, term3614864));
        assertTrue(recursiveEquals(retValue, term3614665));
    }

};


