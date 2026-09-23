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

public class PeepholeFoldConstants_tryFoldComparison_848443179570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150025;
     Object term150117;
     Object term150209;
     Object term150301;
     Object term150369;
     Object term150370;
     Object term150371;
     Object term150372;
     Object term150350;

    public PeepholeFoldConstants_tryFoldComparison_848443179570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term150117 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term150117, term150117.getClass(), "type", 16);
        term150209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term150209, term150209.getClass(), "type", 16);
        term150301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term150369 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term150369, term150369.getClass(), "currentTraversal", null);
        term150370 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term150370, term150370.getClass(), "str", null);
        setIntField(term150370, term150370.getClass(), "type", 16);
        setField(term150370, term150370.getClass(), "next", null);
        setField(term150370, term150370.getClass(), "first", null);
        setField(term150370, term150370.getClass(), "last", null);
        setField(term150370, term150370.getClass(), "propListHead", null);
        setIntField(term150370, term150370.getClass(), "sourcePosition", 0);
        setField(term150370, term150370.getClass(), "jsType", null);
        setField(term150370, term150370.getClass(), "parent", null);
        term150371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term150371, term150371.getClass(), "str", null);
        setIntField(term150371, term150371.getClass(), "type", 16);
        setField(term150371, term150371.getClass(), "next", null);
        setField(term150371, term150371.getClass(), "first", null);
        setField(term150371, term150371.getClass(), "last", null);
        setField(term150371, term150371.getClass(), "propListHead", null);
        setIntField(term150371, term150371.getClass(), "sourcePosition", 0);
        setField(term150371, term150371.getClass(), "jsType", null);
        setField(term150371, term150371.getClass(), "parent", null);
        term150372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term150372, term150372.getClass(), "number", 0.0);
        setIntField(term150372, term150372.getClass(), "type", 0);
        setField(term150372, term150372.getClass(), "next", null);
        setField(term150372, term150372.getClass(), "first", null);
        setField(term150372, term150372.getClass(), "last", null);
        setField(term150372, term150372.getClass(), "propListHead", null);
        setIntField(term150372, term150372.getClass(), "sourcePosition", 0);
        setField(term150372, term150372.getClass(), "jsType", null);
        setField(term150372, term150372.getClass(), "parent", null);
        term150350 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term150350, term150350.getClass(), "str", null);
        setIntField(term150350, term150350.getClass(), "type", 16);
        setField(term150350, term150350.getClass(), "next", null);
        setField(term150350, term150350.getClass(), "first", null);
        setField(term150350, term150350.getClass(), "last", null);
        setField(term150350, term150350.getClass(), "propListHead", null);
        setIntField(term150350, term150350.getClass(), "sourcePosition", 0);
        setField(term150350, term150350.getClass(), "jsType", null);
        setField(term150350, term150350.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term150117;
        args[1] = term150209;
        args[2] = term150301;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term150025, args);
        assertTrue(recursiveEquals(term150025, term150369));
        assertTrue(recursiveEquals(term150117, term150370));
        assertTrue(recursiveEquals(term150209, term150371));
        assertTrue(recursiveEquals(term150301, term150372));
        assertTrue(recursiveEquals(retValue, term150350));
    }

};


