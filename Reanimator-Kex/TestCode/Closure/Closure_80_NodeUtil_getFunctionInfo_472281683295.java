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
import java.lang.Object;

public class NodeUtil_getFunctionInfo_472281683295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4214;

    public NodeUtil_getFunctionInfo_472281683295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4227 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4237 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4214, term4214.getClass(), "type", 1232105469);
        setIntField(term4216, term4216.getClass(), "type", 1266192397);
        setIntField(term4218, term4218.getClass(), "type", 0);
        setField(term4218, term4218.getClass(), "next", null);
        setField(term4218, term4218.getClass(), "first", null);
        setField(term4218, term4218.getClass(), "last", null);
        setField(term4218, term4218.getClass(), "propListHead", null);
        setIntField(term4218, term4218.getClass(), "sourcePosition", 0);
        setField(term4218, term4218.getClass(), "jsType", null);
        setField(term4218, term4218.getClass(), "parent", null);
        setField(term4216, term4216.getClass(), "next", term4218);
        setIntField(term4221, term4221.getClass(), "type", 0);
        setField(term4221, term4221.getClass(), "next", null);
        setField(term4221, term4221.getClass(), "first", null);
        setField(term4221, term4221.getClass(), "last", null);
        setField(term4221, term4221.getClass(), "propListHead", null);
        setIntField(term4221, term4221.getClass(), "sourcePosition", 0);
        setField(term4221, term4221.getClass(), "jsType", null);
        setField(term4221, term4221.getClass(), "parent", null);
        setField(term4216, term4216.getClass(), "first", term4221);
        setIntField(term4224, term4224.getClass(), "type", 0);
        setField(term4224, term4224.getClass(), "next", null);
        setField(term4224, term4224.getClass(), "first", null);
        setField(term4224, term4224.getClass(), "last", null);
        setField(term4224, term4224.getClass(), "propListHead", null);
        setIntField(term4224, term4224.getClass(), "sourcePosition", 0);
        setField(term4224, term4224.getClass(), "jsType", null);
        setField(term4224, term4224.getClass(), "parent", null);
        setField(term4216, term4216.getClass(), "last", term4224);
        setField(term4227, term4227.getClass(), "next", null);
        setIntField(term4227, term4227.getClass(), "type", 0);
        setIntField(term4227, term4227.getClass(), "intValue", 0);
        setField(term4227, term4227.getClass(), "objectValue", null);
        setField(term4216, term4216.getClass(), "propListHead", term4227);
        setIntField(term4216, term4216.getClass(), "sourcePosition", -1419341969);
        setField(term4216, term4216.getClass(), "jsType", null);
        setField(term4216, term4216.getClass(), "parent", null);
        setField(term4214, term4214.getClass(), "next", term4216);
        setIntField(term4231, term4231.getClass(), "type", 0);
        setField(term4231, term4231.getClass(), "next", null);
        setField(term4231, term4231.getClass(), "first", null);
        setField(term4231, term4231.getClass(), "last", null);
        setField(term4231, term4231.getClass(), "propListHead", null);
        setIntField(term4231, term4231.getClass(), "sourcePosition", 0);
        setField(term4231, term4231.getClass(), "jsType", null);
        setField(term4231, term4231.getClass(), "parent", null);
        setField(term4214, term4214.getClass(), "first", term4231);
        setIntField(term4234, term4234.getClass(), "type", 0);
        setField(term4234, term4234.getClass(), "next", null);
        setField(term4234, term4234.getClass(), "first", null);
        setField(term4234, term4234.getClass(), "last", null);
        setField(term4234, term4234.getClass(), "propListHead", null);
        setIntField(term4234, term4234.getClass(), "sourcePosition", 0);
        setField(term4234, term4234.getClass(), "jsType", null);
        setField(term4234, term4234.getClass(), "parent", null);
        setField(term4214, term4214.getClass(), "last", term4234);
        setField(term4237, term4237.getClass(), "next", null);
        setIntField(term4237, term4237.getClass(), "type", 0);
        setIntField(term4237, term4237.getClass(), "intValue", 0);
        setField(term4237, term4237.getClass(), "objectValue", null);
        setField(term4214, term4214.getClass(), "propListHead", term4237);
        setIntField(term4214, term4214.getClass(), "sourcePosition", -89522625);
        setField(term4214, term4214.getClass(), "jsType", null);
        setField(term4214, term4214.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4214;
        try {
            callMethod(klass, "getFunctionInfo", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


