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

public class NodeUtil_isEmptyBlock_2055709421113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term4141;

    public NodeUtil_isEmptyBlock_2055709421113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term226 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term236 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term213, term213.getClass(), "type", 1442160736);
        setIntField(term215, term215.getClass(), "type", -1845499264);
        setIntField(term217, term217.getClass(), "type", 0);
        setField(term217, term217.getClass(), "next", null);
        setField(term217, term217.getClass(), "first", null);
        setField(term217, term217.getClass(), "last", null);
        setField(term217, term217.getClass(), "propListHead", null);
        setIntField(term217, term217.getClass(), "sourcePosition", 0);
        setField(term217, term217.getClass(), "jsType", null);
        setField(term217, term217.getClass(), "parent", null);
        setField(term215, term215.getClass(), "next", term217);
        setIntField(term220, term220.getClass(), "type", 0);
        setField(term220, term220.getClass(), "next", null);
        setField(term220, term220.getClass(), "first", null);
        setField(term220, term220.getClass(), "last", null);
        setField(term220, term220.getClass(), "propListHead", null);
        setIntField(term220, term220.getClass(), "sourcePosition", 0);
        setField(term220, term220.getClass(), "jsType", null);
        setField(term220, term220.getClass(), "parent", null);
        setField(term215, term215.getClass(), "first", term220);
        setIntField(term223, term223.getClass(), "type", 0);
        setField(term223, term223.getClass(), "next", null);
        setField(term223, term223.getClass(), "first", null);
        setField(term223, term223.getClass(), "last", null);
        setField(term223, term223.getClass(), "propListHead", null);
        setIntField(term223, term223.getClass(), "sourcePosition", 0);
        setField(term223, term223.getClass(), "jsType", null);
        setField(term223, term223.getClass(), "parent", null);
        setField(term215, term215.getClass(), "last", term223);
        setField(term226, term226.getClass(), "next", null);
        setIntField(term226, term226.getClass(), "type", 0);
        setIntField(term226, term226.getClass(), "intValue", 0);
        setField(term226, term226.getClass(), "objectValue", null);
        setField(term215, term215.getClass(), "propListHead", term226);
        setIntField(term215, term215.getClass(), "sourcePosition", 941650513);
        setField(term215, term215.getClass(), "jsType", null);
        setField(term215, term215.getClass(), "parent", null);
        setField(term213, term213.getClass(), "next", term215);
        setIntField(term230, term230.getClass(), "type", 0);
        setField(term230, term230.getClass(), "next", null);
        setField(term230, term230.getClass(), "first", null);
        setField(term230, term230.getClass(), "last", null);
        setField(term230, term230.getClass(), "propListHead", null);
        setIntField(term230, term230.getClass(), "sourcePosition", 0);
        setField(term230, term230.getClass(), "jsType", null);
        setField(term230, term230.getClass(), "parent", null);
        setField(term213, term213.getClass(), "first", term230);
        setIntField(term233, term233.getClass(), "type", 0);
        setField(term233, term233.getClass(), "next", null);
        setField(term233, term233.getClass(), "first", null);
        setField(term233, term233.getClass(), "last", null);
        setField(term233, term233.getClass(), "propListHead", null);
        setIntField(term233, term233.getClass(), "sourcePosition", 0);
        setField(term233, term233.getClass(), "jsType", null);
        setField(term233, term233.getClass(), "parent", null);
        setField(term213, term213.getClass(), "last", term233);
        setField(term236, term236.getClass(), "next", null);
        setIntField(term236, term236.getClass(), "type", 0);
        setIntField(term236, term236.getClass(), "intValue", 0);
        setField(term236, term236.getClass(), "objectValue", null);
        setField(term213, term213.getClass(), "propListHead", term236);
        setIntField(term213, term213.getClass(), "sourcePosition", 444029505);
        setField(term213, term213.getClass(), "jsType", null);
        setField(term213, term213.getClass(), "parent", null);
        term4141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4146 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4149 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4141, term4141.getClass(), "type", 1442160736);
        setIntField(term4142, term4142.getClass(), "type", -1845499264);
        setIntField(term4143, term4143.getClass(), "type", 0);
        setField(term4143, term4143.getClass(), "next", null);
        setField(term4143, term4143.getClass(), "first", null);
        setField(term4143, term4143.getClass(), "last", null);
        setField(term4143, term4143.getClass(), "propListHead", null);
        setIntField(term4143, term4143.getClass(), "sourcePosition", 0);
        setField(term4143, term4143.getClass(), "jsType", null);
        setField(term4143, term4143.getClass(), "parent", null);
        setField(term4142, term4142.getClass(), "next", term4143);
        setIntField(term4144, term4144.getClass(), "type", 0);
        setField(term4144, term4144.getClass(), "next", null);
        setField(term4144, term4144.getClass(), "first", null);
        setField(term4144, term4144.getClass(), "last", null);
        setField(term4144, term4144.getClass(), "propListHead", null);
        setIntField(term4144, term4144.getClass(), "sourcePosition", 0);
        setField(term4144, term4144.getClass(), "jsType", null);
        setField(term4144, term4144.getClass(), "parent", null);
        setField(term4142, term4142.getClass(), "first", term4144);
        setIntField(term4145, term4145.getClass(), "type", 0);
        setField(term4145, term4145.getClass(), "next", null);
        setField(term4145, term4145.getClass(), "first", null);
        setField(term4145, term4145.getClass(), "last", null);
        setField(term4145, term4145.getClass(), "propListHead", null);
        setIntField(term4145, term4145.getClass(), "sourcePosition", 0);
        setField(term4145, term4145.getClass(), "jsType", null);
        setField(term4145, term4145.getClass(), "parent", null);
        setField(term4142, term4142.getClass(), "last", term4145);
        setField(term4146, term4146.getClass(), "next", null);
        setIntField(term4146, term4146.getClass(), "type", 0);
        setIntField(term4146, term4146.getClass(), "intValue", 0);
        setField(term4146, term4146.getClass(), "objectValue", null);
        setField(term4142, term4142.getClass(), "propListHead", term4146);
        setIntField(term4142, term4142.getClass(), "sourcePosition", 941650513);
        setField(term4142, term4142.getClass(), "jsType", null);
        setField(term4142, term4142.getClass(), "parent", null);
        setField(term4141, term4141.getClass(), "next", term4142);
        setIntField(term4147, term4147.getClass(), "type", 0);
        setField(term4147, term4147.getClass(), "next", null);
        setField(term4147, term4147.getClass(), "first", null);
        setField(term4147, term4147.getClass(), "last", null);
        setField(term4147, term4147.getClass(), "propListHead", null);
        setIntField(term4147, term4147.getClass(), "sourcePosition", 0);
        setField(term4147, term4147.getClass(), "jsType", null);
        setField(term4147, term4147.getClass(), "parent", null);
        setField(term4141, term4141.getClass(), "first", term4147);
        setIntField(term4148, term4148.getClass(), "type", 0);
        setField(term4148, term4148.getClass(), "next", null);
        setField(term4148, term4148.getClass(), "first", null);
        setField(term4148, term4148.getClass(), "last", null);
        setField(term4148, term4148.getClass(), "propListHead", null);
        setIntField(term4148, term4148.getClass(), "sourcePosition", 0);
        setField(term4148, term4148.getClass(), "jsType", null);
        setField(term4148, term4148.getClass(), "parent", null);
        setField(term4141, term4141.getClass(), "last", term4148);
        setField(term4149, term4149.getClass(), "next", null);
        setIntField(term4149, term4149.getClass(), "type", 0);
        setIntField(term4149, term4149.getClass(), "intValue", 0);
        setField(term4149, term4149.getClass(), "objectValue", null);
        setField(term4141, term4141.getClass(), "propListHead", term4149);
        setIntField(term4141, term4141.getClass(), "sourcePosition", 444029505);
        setField(term4141, term4141.getClass(), "jsType", null);
        setField(term4141, term4141.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term213;
        Object retValue = callMethod(klass, "isEmptyBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term213, term4141));
        assertTrue(recursiveEquals(retValue, false));
    }

};


