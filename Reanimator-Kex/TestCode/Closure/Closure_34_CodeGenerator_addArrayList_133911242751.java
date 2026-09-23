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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addArrayList_133911242751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2567;
     Object term2578;

    public CodeGenerator_addArrayList_133911242751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2568 = new HashMap();
        term2567 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2567, term2567.getClass(), "ESCAPED_JS_STRINGS", term2568);
        setField(term2567, term2567.getClass(), "cc", null);
        setField(term2567, term2567.getClass(), "outputCharsetEncoder", null);
        term2578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2578, term2578.getClass(), "type", -268815336);
        setIntField(term2580, term2580.getClass(), "type", -1210583429);
        setIntField(term2582, term2582.getClass(), "type", -663691365);
        setIntField(term2584, term2584.getClass(), "type", 339854490);
        setIntField(term2586, term2586.getClass(), "type", -615654495);
        setField(term2586, term2586.getClass(), "next", null);
        setField(term2586, term2586.getClass(), "first", null);
        setField(term2586, term2586.getClass(), "last", null);
        setField(term2586, term2586.getClass(), "propListHead", null);
        setIntField(term2586, term2586.getClass(), "sourcePosition", 0);
        setField(term2586, term2586.getClass(), "jsType", null);
        setField(term2586, term2586.getClass(), "parent", null);
        setField(term2584, term2584.getClass(), "next", term2586);
        setIntField(term2589, term2589.getClass(), "type", -1476117762);
        setField(term2589, term2589.getClass(), "next", null);
        setField(term2589, term2589.getClass(), "first", null);
        setField(term2589, term2589.getClass(), "last", term2586);
        setField(term2589, term2589.getClass(), "propListHead", null);
        setIntField(term2589, term2589.getClass(), "sourcePosition", 0);
        setField(term2589, term2589.getClass(), "jsType", null);
        setField(term2589, term2589.getClass(), "parent", null);
        setField(term2584, term2584.getClass(), "first", term2589);
        setField(term2584, term2584.getClass(), "last", term2582);
        setField(term2584, term2584.getClass(), "propListHead", null);
        setIntField(term2584, term2584.getClass(), "sourcePosition", 0);
        setField(term2584, term2584.getClass(), "jsType", null);
        setField(term2584, term2584.getClass(), "parent", null);
        setField(term2582, term2582.getClass(), "next", term2584);
        setField(term2582, term2582.getClass(), "first", term2586);
        setIntField(term2593, term2593.getClass(), "type", 1532716628);
        setIntField(term2595, term2595.getClass(), "type", -1801760683);
        setField(term2595, term2595.getClass(), "next", null);
        setField(term2595, term2595.getClass(), "first", term2589);
        setField(term2595, term2595.getClass(), "last", term2584);
        setField(term2595, term2595.getClass(), "propListHead", null);
        setIntField(term2595, term2595.getClass(), "sourcePosition", 0);
        setField(term2595, term2595.getClass(), "jsType", null);
        setField(term2595, term2595.getClass(), "parent", null);
        setField(term2593, term2593.getClass(), "next", term2595);
        setField(term2593, term2593.getClass(), "first", term2580);
        setField(term2593, term2593.getClass(), "last", term2580);
        setField(term2593, term2593.getClass(), "propListHead", null);
        setIntField(term2593, term2593.getClass(), "sourcePosition", 0);
        setField(term2593, term2593.getClass(), "jsType", null);
        setField(term2593, term2593.getClass(), "parent", null);
        setField(term2582, term2582.getClass(), "last", term2593);
        setField(term2582, term2582.getClass(), "propListHead", null);
        setIntField(term2582, term2582.getClass(), "sourcePosition", 0);
        setField(term2582, term2582.getClass(), "jsType", null);
        setField(term2582, term2582.getClass(), "parent", null);
        setField(term2580, term2580.getClass(), "next", term2582);
        setIntField(term2600, term2600.getClass(), "type", 1141317871);
        setField(term2600, term2600.getClass(), "next", term2593);
        setField(term2600, term2600.getClass(), "first", term2595);
        setField(term2600, term2600.getClass(), "last", term2578);
        setField(term2600, term2600.getClass(), "propListHead", null);
        setIntField(term2600, term2600.getClass(), "sourcePosition", 0);
        setField(term2600, term2600.getClass(), "jsType", null);
        setField(term2600, term2600.getClass(), "parent", null);
        setField(term2580, term2580.getClass(), "first", term2600);
        setField(term2580, term2580.getClass(), "last", term2600);
        setField(term2580, term2580.getClass(), "propListHead", null);
        setIntField(term2580, term2580.getClass(), "sourcePosition", 0);
        setField(term2580, term2580.getClass(), "jsType", null);
        setField(term2580, term2580.getClass(), "parent", null);
        setField(term2578, term2578.getClass(), "next", term2580);
        setField(term2578, term2578.getClass(), "first", term2584);
        setField(term2578, term2578.getClass(), "last", term2586);
        setField(term2578, term2578.getClass(), "propListHead", null);
        setIntField(term2578, term2578.getClass(), "sourcePosition", 0);
        setField(term2578, term2578.getClass(), "jsType", null);
        setField(term2578, term2578.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2578;
        try {
            callMethod(klass, "addArrayList", argTypes, term2567, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


