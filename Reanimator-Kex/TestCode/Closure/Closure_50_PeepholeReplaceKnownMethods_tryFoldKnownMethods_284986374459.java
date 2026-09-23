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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3217420;
     Object term3217512;
     Object term3219221;
     Object term3219222;
     Object term3218963;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3217420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3217512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3217604 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3217696 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3217788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3217918 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3217604, term3217604.getClass(), "type", 35);
        setIntField(term3217788, term3217788.getClass(), "type", 40);
        setField(term3217788, term3217788.getClass(), "str", "charAt");
        setField(term3217696, term3217696.getClass(), "next", term3217788);
        setIntField(term3217696, term3217696.getClass(), "type", 40);
        setField(term3217604, term3217604.getClass(), "first", term3217696);
        setIntField(term3217918, term3217918.getClass(), "type", 40);
        setField(term3217604, term3217604.getClass(), "next", term3217918);
        setField(term3217512, term3217512.getClass(), "first", term3217604);
        setIntField(term3217512, term3217512.getClass(), "type", 37);
        term3219221 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3219221, term3219221.getClass(), "currentTraversal", null);
        term3219222 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219223 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219225 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219226 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3219222, term3219222.getClass(), "str", null);
        setIntField(term3219222, term3219222.getClass(), "type", 37);
        setField(term3219222, term3219222.getClass(), "next", null);
        setField(term3219223, term3219223.getClass(), "str", null);
        setIntField(term3219223, term3219223.getClass(), "type", 35);
        setField(term3219224, term3219224.getClass(), "str", null);
        setIntField(term3219224, term3219224.getClass(), "type", 40);
        setField(term3219224, term3219224.getClass(), "next", null);
        setField(term3219224, term3219224.getClass(), "first", null);
        setField(term3219224, term3219224.getClass(), "last", null);
        setField(term3219224, term3219224.getClass(), "propListHead", null);
        setIntField(term3219224, term3219224.getClass(), "sourcePosition", 0);
        setField(term3219224, term3219224.getClass(), "jsType", null);
        setField(term3219224, term3219224.getClass(), "parent", null);
        setField(term3219223, term3219223.getClass(), "next", term3219224);
        setField(term3219225, term3219225.getClass(), "str", null);
        setIntField(term3219225, term3219225.getClass(), "type", 40);
        setField(term3219226, term3219226.getClass(), "str", "");
        setIntField(term3219226, term3219226.getClass(), "type", 40);
        setField(term3219226, term3219226.getClass(), "next", null);
        setField(term3219226, term3219226.getClass(), "first", null);
        setField(term3219226, term3219226.getClass(), "last", null);
        setField(term3219226, term3219226.getClass(), "propListHead", null);
        setIntField(term3219226, term3219226.getClass(), "sourcePosition", 0);
        setField(term3219226, term3219226.getClass(), "jsType", null);
        setField(term3219226, term3219226.getClass(), "parent", null);
        setField(term3219225, term3219225.getClass(), "next", term3219226);
        setField(term3219225, term3219225.getClass(), "first", null);
        setField(term3219225, term3219225.getClass(), "last", null);
        setField(term3219225, term3219225.getClass(), "propListHead", null);
        setIntField(term3219225, term3219225.getClass(), "sourcePosition", 0);
        setField(term3219225, term3219225.getClass(), "jsType", null);
        setField(term3219225, term3219225.getClass(), "parent", null);
        setField(term3219223, term3219223.getClass(), "first", term3219225);
        setField(term3219223, term3219223.getClass(), "last", null);
        setField(term3219223, term3219223.getClass(), "propListHead", null);
        setIntField(term3219223, term3219223.getClass(), "sourcePosition", 0);
        setField(term3219223, term3219223.getClass(), "jsType", null);
        setField(term3219223, term3219223.getClass(), "parent", null);
        setField(term3219222, term3219222.getClass(), "first", term3219223);
        setField(term3219222, term3219222.getClass(), "last", null);
        setField(term3219222, term3219222.getClass(), "propListHead", null);
        setIntField(term3219222, term3219222.getClass(), "sourcePosition", 0);
        setField(term3219222, term3219222.getClass(), "jsType", null);
        setField(term3219222, term3219222.getClass(), "parent", null);
        term3218963 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3218965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3218967 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3218970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3218972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3218963, term3218963.getClass(), "str", null);
        setIntField(term3218963, term3218963.getClass(), "type", 37);
        setField(term3218963, term3218963.getClass(), "next", null);
        setField(term3218965, term3218965.getClass(), "str", null);
        setIntField(term3218965, term3218965.getClass(), "type", 35);
        setField(term3218967, term3218967.getClass(), "str", null);
        setIntField(term3218967, term3218967.getClass(), "type", 40);
        setField(term3218967, term3218967.getClass(), "next", null);
        setField(term3218967, term3218967.getClass(), "first", null);
        setField(term3218967, term3218967.getClass(), "last", null);
        setField(term3218967, term3218967.getClass(), "propListHead", null);
        setIntField(term3218967, term3218967.getClass(), "sourcePosition", 0);
        setField(term3218967, term3218967.getClass(), "jsType", null);
        setField(term3218967, term3218967.getClass(), "parent", null);
        setField(term3218965, term3218965.getClass(), "next", term3218967);
        setField(term3218970, term3218970.getClass(), "str", null);
        setIntField(term3218970, term3218970.getClass(), "type", 40);
        setField(term3218972, term3218972.getClass(), "str", "");
        setIntField(term3218972, term3218972.getClass(), "type", 40);
        setField(term3218972, term3218972.getClass(), "next", null);
        setField(term3218972, term3218972.getClass(), "first", null);
        setField(term3218972, term3218972.getClass(), "last", null);
        setField(term3218972, term3218972.getClass(), "propListHead", null);
        setIntField(term3218972, term3218972.getClass(), "sourcePosition", 0);
        setField(term3218972, term3218972.getClass(), "jsType", null);
        setField(term3218972, term3218972.getClass(), "parent", null);
        setField(term3218970, term3218970.getClass(), "next", term3218972);
        setField(term3218970, term3218970.getClass(), "first", null);
        setField(term3218970, term3218970.getClass(), "last", null);
        setField(term3218970, term3218970.getClass(), "propListHead", null);
        setIntField(term3218970, term3218970.getClass(), "sourcePosition", 0);
        setField(term3218970, term3218970.getClass(), "jsType", null);
        setField(term3218970, term3218970.getClass(), "parent", null);
        setField(term3218965, term3218965.getClass(), "first", term3218970);
        setField(term3218965, term3218965.getClass(), "last", null);
        setField(term3218965, term3218965.getClass(), "propListHead", null);
        setIntField(term3218965, term3218965.getClass(), "sourcePosition", 0);
        setField(term3218965, term3218965.getClass(), "jsType", null);
        setField(term3218965, term3218965.getClass(), "parent", null);
        setField(term3218963, term3218963.getClass(), "first", term3218965);
        setField(term3218963, term3218963.getClass(), "last", null);
        setField(term3218963, term3218963.getClass(), "propListHead", null);
        setIntField(term3218963, term3218963.getClass(), "sourcePosition", 0);
        setField(term3218963, term3218963.getClass(), "jsType", null);
        setField(term3218963, term3218963.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3217512;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3217420, args);
        assertTrue(recursiveEquals(term3217420, term3219221));
        assertTrue(recursiveEquals(term3217512, term3219222));
        assertTrue(recursiveEquals(retValue, term3218963));
    }

};


