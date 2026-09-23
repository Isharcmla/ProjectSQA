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

public class Scope_undeclare_65919611733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606;
     Object term628;

    public Scope_undeclare_65919611733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term607 = new HashMap();
        term606 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term620 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term606, term606.getClass(), "vars", term607);
        setField(term620, term620.getClass(), "vars", null);
        setField(term620, term620.getClass(), "parent", null);
        setIntField(term620, term620.getClass(), "depth", 0);
        setField(term620, term620.getClass(), "rootNode", null);
        setField(term620, term620.getClass(), "thisType", null);
        setBooleanField(term620, term620.getClass(), "isBottom", false);
        setField(term606, term606.getClass(), "parent", term620);
        setIntField(term606, term606.getClass(), "depth", 1687361082);
        setIntField(term624, term624.getClass(), "type", 0);
        setField(term624, term624.getClass(), "next", null);
        setField(term624, term624.getClass(), "first", null);
        setField(term624, term624.getClass(), "last", null);
        setField(term624, term624.getClass(), "propListHead", null);
        setIntField(term624, term624.getClass(), "sourcePosition", 0);
        setField(term624, term624.getClass(), "jsType", null);
        setField(term624, term624.getClass(), "parent", null);
        setField(term606, term606.getClass(), "rootNode", term624);
        setField(term606, term606.getClass(), "thisType", null);
        setBooleanField(term606, term606.getClass(), "isBottom", false);
        term628 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term654 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term664 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term628, term628.getClass(), "name", "XOiDvlDhdc");
        setIntField(term641, term641.getClass(), "type", -1882480155);
        setIntField(term643, term643.getClass(), "type", 1152356969);
        setIntField(term645, term645.getClass(), "type", 0);
        setField(term645, term645.getClass(), "next", null);
        setField(term645, term645.getClass(), "first", null);
        setField(term645, term645.getClass(), "last", null);
        setField(term645, term645.getClass(), "propListHead", null);
        setIntField(term645, term645.getClass(), "sourcePosition", 0);
        setField(term645, term645.getClass(), "jsType", null);
        setField(term645, term645.getClass(), "parent", null);
        setField(term643, term643.getClass(), "next", term645);
        setIntField(term648, term648.getClass(), "type", 0);
        setField(term648, term648.getClass(), "next", null);
        setField(term648, term648.getClass(), "first", null);
        setField(term648, term648.getClass(), "last", null);
        setField(term648, term648.getClass(), "propListHead", null);
        setIntField(term648, term648.getClass(), "sourcePosition", 0);
        setField(term648, term648.getClass(), "jsType", null);
        setField(term648, term648.getClass(), "parent", null);
        setField(term643, term643.getClass(), "first", term648);
        setIntField(term651, term651.getClass(), "type", 0);
        setField(term651, term651.getClass(), "next", null);
        setField(term651, term651.getClass(), "first", null);
        setField(term651, term651.getClass(), "last", null);
        setField(term651, term651.getClass(), "propListHead", null);
        setIntField(term651, term651.getClass(), "sourcePosition", 0);
        setField(term651, term651.getClass(), "jsType", null);
        setField(term651, term651.getClass(), "parent", null);
        setField(term643, term643.getClass(), "last", term651);
        setField(term654, term654.getClass(), "next", null);
        setIntField(term654, term654.getClass(), "type", 0);
        setIntField(term654, term654.getClass(), "intValue", 0);
        setField(term654, term654.getClass(), "objectValue", null);
        setField(term643, term643.getClass(), "propListHead", term654);
        setIntField(term643, term643.getClass(), "sourcePosition", -1214628358);
        setField(term643, term643.getClass(), "jsType", null);
        setField(term643, term643.getClass(), "parent", null);
        setField(term641, term641.getClass(), "next", term643);
        setIntField(term658, term658.getClass(), "type", 0);
        setField(term658, term658.getClass(), "next", null);
        setField(term658, term658.getClass(), "first", null);
        setField(term658, term658.getClass(), "last", null);
        setField(term658, term658.getClass(), "propListHead", null);
        setIntField(term658, term658.getClass(), "sourcePosition", 0);
        setField(term658, term658.getClass(), "jsType", null);
        setField(term658, term658.getClass(), "parent", null);
        setField(term641, term641.getClass(), "first", term658);
        setIntField(term661, term661.getClass(), "type", 0);
        setField(term661, term661.getClass(), "next", null);
        setField(term661, term661.getClass(), "first", null);
        setField(term661, term661.getClass(), "last", null);
        setField(term661, term661.getClass(), "propListHead", null);
        setIntField(term661, term661.getClass(), "sourcePosition", 0);
        setField(term661, term661.getClass(), "jsType", null);
        setField(term661, term661.getClass(), "parent", null);
        setField(term641, term641.getClass(), "last", term661);
        setField(term664, term664.getClass(), "next", null);
        setIntField(term664, term664.getClass(), "type", 0);
        setIntField(term664, term664.getClass(), "intValue", 0);
        setField(term664, term664.getClass(), "objectValue", null);
        setField(term641, term641.getClass(), "propListHead", term664);
        setIntField(term641, term641.getClass(), "sourcePosition", 1102721075);
        setField(term641, term641.getClass(), "jsType", null);
        setField(term641, term641.getClass(), "parent", null);
        setField(term628, term628.getClass(), "nameNode", term641);
        setField(term628, term628.getClass(), "type", null);
        setField(term628, term628.getClass(), "info", null);
        setBooleanField(term628, term628.getClass(), "typeInferred", false);
        setField(term628, term628.getClass(), "input", null);
        setBooleanField(term628, term628.getClass(), "isDefine", false);
        setIntField(term628, term628.getClass(), "index", 0);
        setField(term628, term628.getClass(), "scope", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term628;
        try {
            callMethod(klass, "undeclare", argTypes, term606, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


