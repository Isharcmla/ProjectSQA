package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_var_43488604982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218;
     Object term245;

    public IR_var_43488604982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term218, term218.getClass(), "type", 972867650);
        setIntField(term220, term220.getClass(), "type", 1655935355);
        setIntField(term222, term222.getClass(), "type", -481533957);
        setIntField(term224, term224.getClass(), "type", 1240914516);
        setIntField(term226, term226.getClass(), "type", -1465035361);
        setField(term226, term226.getClass(), "next", null);
        setField(term226, term226.getClass(), "first", null);
        setField(term226, term226.getClass(), "last", null);
        setField(term226, term226.getClass(), "propListHead", null);
        setIntField(term226, term226.getClass(), "sourcePosition", 0);
        setField(term226, term226.getClass(), "jsType", null);
        setField(term226, term226.getClass(), "parent", null);
        setField(term224, term224.getClass(), "next", term226);
        setIntField(term229, term229.getClass(), "type", 1090617576);
        setField(term229, term229.getClass(), "next", null);
        setField(term229, term229.getClass(), "first", null);
        setField(term229, term229.getClass(), "last", term226);
        setField(term229, term229.getClass(), "propListHead", null);
        setIntField(term229, term229.getClass(), "sourcePosition", 0);
        setField(term229, term229.getClass(), "jsType", null);
        setField(term229, term229.getClass(), "parent", null);
        setField(term224, term224.getClass(), "first", term229);
        setField(term224, term224.getClass(), "last", term222);
        setField(term224, term224.getClass(), "propListHead", null);
        setIntField(term224, term224.getClass(), "sourcePosition", 0);
        setField(term224, term224.getClass(), "jsType", null);
        setField(term224, term224.getClass(), "parent", null);
        setField(term222, term222.getClass(), "next", term224);
        setField(term222, term222.getClass(), "first", term226);
        setIntField(term233, term233.getClass(), "type", 1442160736);
        setIntField(term235, term235.getClass(), "type", 1114000454);
        setField(term235, term235.getClass(), "next", null);
        setField(term235, term235.getClass(), "first", term229);
        setField(term235, term235.getClass(), "last", term224);
        setField(term235, term235.getClass(), "propListHead", null);
        setIntField(term235, term235.getClass(), "sourcePosition", 0);
        setField(term235, term235.getClass(), "jsType", null);
        setField(term235, term235.getClass(), "parent", null);
        setField(term233, term233.getClass(), "next", term235);
        setField(term233, term233.getClass(), "first", term220);
        setField(term233, term233.getClass(), "last", term220);
        setField(term233, term233.getClass(), "propListHead", null);
        setIntField(term233, term233.getClass(), "sourcePosition", 0);
        setField(term233, term233.getClass(), "jsType", null);
        setField(term233, term233.getClass(), "parent", null);
        setField(term222, term222.getClass(), "last", term233);
        setField(term222, term222.getClass(), "propListHead", null);
        setIntField(term222, term222.getClass(), "sourcePosition", 0);
        setField(term222, term222.getClass(), "jsType", null);
        setField(term222, term222.getClass(), "parent", null);
        setField(term220, term220.getClass(), "next", term222);
        setIntField(term240, term240.getClass(), "type", -556405712);
        setField(term240, term240.getClass(), "next", term233);
        setField(term240, term240.getClass(), "first", term235);
        setField(term240, term240.getClass(), "last", term218);
        setField(term240, term240.getClass(), "propListHead", null);
        setIntField(term240, term240.getClass(), "sourcePosition", 0);
        setField(term240, term240.getClass(), "jsType", null);
        setField(term240, term240.getClass(), "parent", null);
        setField(term220, term220.getClass(), "first", term240);
        setField(term220, term220.getClass(), "last", term240);
        setField(term220, term220.getClass(), "propListHead", null);
        setIntField(term220, term220.getClass(), "sourcePosition", 0);
        setField(term220, term220.getClass(), "jsType", null);
        setField(term220, term220.getClass(), "parent", null);
        setField(term218, term218.getClass(), "next", term220);
        setField(term218, term218.getClass(), "first", term224);
        setField(term218, term218.getClass(), "last", term226);
        setField(term218, term218.getClass(), "propListHead", null);
        setIntField(term218, term218.getClass(), "sourcePosition", 0);
        setField(term218, term218.getClass(), "jsType", null);
        setField(term218, term218.getClass(), "parent", null);
        term245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term245, term245.getClass(), "type", -1772434990);
        setIntField(term247, term247.getClass(), "type", -1845499264);
        setIntField(term249, term249.getClass(), "type", -505439934);
        setIntField(term251, term251.getClass(), "type", -344842608);
        setIntField(term253, term253.getClass(), "type", 941650513);
        setField(term253, term253.getClass(), "next", null);
        setField(term253, term253.getClass(), "first", null);
        setField(term253, term253.getClass(), "last", null);
        setField(term253, term253.getClass(), "propListHead", null);
        setIntField(term253, term253.getClass(), "sourcePosition", 0);
        setField(term253, term253.getClass(), "jsType", null);
        setField(term253, term253.getClass(), "parent", null);
        setField(term251, term251.getClass(), "next", term253);
        setIntField(term256, term256.getClass(), "type", 444029505);
        setField(term256, term256.getClass(), "next", null);
        setField(term256, term256.getClass(), "first", null);
        setField(term256, term256.getClass(), "last", term253);
        setField(term256, term256.getClass(), "propListHead", null);
        setIntField(term256, term256.getClass(), "sourcePosition", 0);
        setField(term256, term256.getClass(), "jsType", null);
        setField(term256, term256.getClass(), "parent", null);
        setField(term251, term251.getClass(), "first", term256);
        setField(term251, term251.getClass(), "last", term249);
        setField(term251, term251.getClass(), "propListHead", null);
        setIntField(term251, term251.getClass(), "sourcePosition", 0);
        setField(term251, term251.getClass(), "jsType", null);
        setField(term251, term251.getClass(), "parent", null);
        setField(term249, term249.getClass(), "next", term251);
        setField(term249, term249.getClass(), "first", term253);
        setIntField(term260, term260.getClass(), "type", -1263114719);
        setIntField(term262, term262.getClass(), "type", -894662986);
        setField(term262, term262.getClass(), "next", null);
        setField(term262, term262.getClass(), "first", term256);
        setField(term262, term262.getClass(), "last", term251);
        setField(term262, term262.getClass(), "propListHead", null);
        setIntField(term262, term262.getClass(), "sourcePosition", 0);
        setField(term262, term262.getClass(), "jsType", null);
        setField(term262, term262.getClass(), "parent", null);
        setField(term260, term260.getClass(), "next", term262);
        setField(term260, term260.getClass(), "first", term247);
        setField(term260, term260.getClass(), "last", term247);
        setField(term260, term260.getClass(), "propListHead", null);
        setIntField(term260, term260.getClass(), "sourcePosition", 0);
        setField(term260, term260.getClass(), "jsType", null);
        setField(term260, term260.getClass(), "parent", null);
        setField(term249, term249.getClass(), "last", term260);
        setField(term249, term249.getClass(), "propListHead", null);
        setIntField(term249, term249.getClass(), "sourcePosition", 0);
        setField(term249, term249.getClass(), "jsType", null);
        setField(term249, term249.getClass(), "parent", null);
        setField(term247, term247.getClass(), "next", term249);
        setIntField(term267, term267.getClass(), "type", 304775596);
        setField(term267, term267.getClass(), "next", term260);
        setField(term267, term267.getClass(), "first", term262);
        setField(term267, term267.getClass(), "last", term245);
        setField(term267, term267.getClass(), "propListHead", null);
        setIntField(term267, term267.getClass(), "sourcePosition", 0);
        setField(term267, term267.getClass(), "jsType", null);
        setField(term267, term267.getClass(), "parent", null);
        setField(term247, term247.getClass(), "first", term267);
        setField(term247, term247.getClass(), "last", term267);
        setField(term247, term247.getClass(), "propListHead", null);
        setIntField(term247, term247.getClass(), "sourcePosition", 0);
        setField(term247, term247.getClass(), "jsType", null);
        setField(term247, term247.getClass(), "parent", null);
        setField(term245, term245.getClass(), "next", term247);
        setField(term245, term245.getClass(), "first", term251);
        setField(term245, term245.getClass(), "last", term253);
        setField(term245, term245.getClass(), "propListHead", null);
        setIntField(term245, term245.getClass(), "sourcePosition", 0);
        setField(term245, term245.getClass(), "jsType", null);
        setField(term245, term245.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term218;
        args[1] = term245;
        try {
            callMethod(klass, "var", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


