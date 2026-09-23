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

public class NodeUtil_isConstantByConvention_1985733150293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4133;
     Object term4160;

    public NodeUtil_isConstantByConvention_1985733150293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4146 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4156 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4133, term4133.getClass(), "type", 200150950);
        setIntField(term4135, term4135.getClass(), "type", 1233186320);
        setIntField(term4137, term4137.getClass(), "type", 0);
        setField(term4137, term4137.getClass(), "next", null);
        setField(term4137, term4137.getClass(), "first", null);
        setField(term4137, term4137.getClass(), "last", null);
        setField(term4137, term4137.getClass(), "propListHead", null);
        setIntField(term4137, term4137.getClass(), "sourcePosition", 0);
        setField(term4137, term4137.getClass(), "jsType", null);
        setField(term4137, term4137.getClass(), "parent", null);
        setField(term4135, term4135.getClass(), "next", term4137);
        setIntField(term4140, term4140.getClass(), "type", 0);
        setField(term4140, term4140.getClass(), "next", null);
        setField(term4140, term4140.getClass(), "first", null);
        setField(term4140, term4140.getClass(), "last", null);
        setField(term4140, term4140.getClass(), "propListHead", null);
        setIntField(term4140, term4140.getClass(), "sourcePosition", 0);
        setField(term4140, term4140.getClass(), "jsType", null);
        setField(term4140, term4140.getClass(), "parent", null);
        setField(term4135, term4135.getClass(), "first", term4140);
        setIntField(term4143, term4143.getClass(), "type", 0);
        setField(term4143, term4143.getClass(), "next", null);
        setField(term4143, term4143.getClass(), "first", null);
        setField(term4143, term4143.getClass(), "last", null);
        setField(term4143, term4143.getClass(), "propListHead", null);
        setIntField(term4143, term4143.getClass(), "sourcePosition", 0);
        setField(term4143, term4143.getClass(), "jsType", null);
        setField(term4143, term4143.getClass(), "parent", null);
        setField(term4135, term4135.getClass(), "last", term4143);
        setField(term4146, term4146.getClass(), "next", null);
        setIntField(term4146, term4146.getClass(), "type", 0);
        setIntField(term4146, term4146.getClass(), "intValue", 0);
        setField(term4146, term4146.getClass(), "objectValue", null);
        setField(term4135, term4135.getClass(), "propListHead", term4146);
        setIntField(term4135, term4135.getClass(), "sourcePosition", 1437618365);
        setField(term4135, term4135.getClass(), "jsType", null);
        setField(term4135, term4135.getClass(), "parent", null);
        setField(term4133, term4133.getClass(), "next", term4135);
        setIntField(term4150, term4150.getClass(), "type", 0);
        setField(term4150, term4150.getClass(), "next", null);
        setField(term4150, term4150.getClass(), "first", null);
        setField(term4150, term4150.getClass(), "last", null);
        setField(term4150, term4150.getClass(), "propListHead", null);
        setIntField(term4150, term4150.getClass(), "sourcePosition", 0);
        setField(term4150, term4150.getClass(), "jsType", null);
        setField(term4150, term4150.getClass(), "parent", null);
        setField(term4133, term4133.getClass(), "first", term4150);
        setIntField(term4153, term4153.getClass(), "type", 0);
        setField(term4153, term4153.getClass(), "next", null);
        setField(term4153, term4153.getClass(), "first", null);
        setField(term4153, term4153.getClass(), "last", null);
        setField(term4153, term4153.getClass(), "propListHead", null);
        setIntField(term4153, term4153.getClass(), "sourcePosition", 0);
        setField(term4153, term4153.getClass(), "jsType", null);
        setField(term4153, term4153.getClass(), "parent", null);
        setField(term4133, term4133.getClass(), "last", term4153);
        setField(term4156, term4156.getClass(), "next", null);
        setIntField(term4156, term4156.getClass(), "type", 0);
        setIntField(term4156, term4156.getClass(), "intValue", 0);
        setField(term4156, term4156.getClass(), "objectValue", null);
        setField(term4133, term4133.getClass(), "propListHead", term4156);
        setIntField(term4133, term4133.getClass(), "sourcePosition", 1122535239);
        setField(term4133, term4133.getClass(), "jsType", null);
        setField(term4133, term4133.getClass(), "parent", null);
        term4160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4173 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4183 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4160, term4160.getClass(), "type", 1355471365);
        setIntField(term4162, term4162.getClass(), "type", -750603024);
        setIntField(term4164, term4164.getClass(), "type", 0);
        setField(term4164, term4164.getClass(), "next", null);
        setField(term4164, term4164.getClass(), "first", null);
        setField(term4164, term4164.getClass(), "last", null);
        setField(term4164, term4164.getClass(), "propListHead", null);
        setIntField(term4164, term4164.getClass(), "sourcePosition", 0);
        setField(term4164, term4164.getClass(), "jsType", null);
        setField(term4164, term4164.getClass(), "parent", null);
        setField(term4162, term4162.getClass(), "next", term4164);
        setIntField(term4167, term4167.getClass(), "type", 0);
        setField(term4167, term4167.getClass(), "next", null);
        setField(term4167, term4167.getClass(), "first", null);
        setField(term4167, term4167.getClass(), "last", null);
        setField(term4167, term4167.getClass(), "propListHead", null);
        setIntField(term4167, term4167.getClass(), "sourcePosition", 0);
        setField(term4167, term4167.getClass(), "jsType", null);
        setField(term4167, term4167.getClass(), "parent", null);
        setField(term4162, term4162.getClass(), "first", term4167);
        setIntField(term4170, term4170.getClass(), "type", 0);
        setField(term4170, term4170.getClass(), "next", null);
        setField(term4170, term4170.getClass(), "first", null);
        setField(term4170, term4170.getClass(), "last", null);
        setField(term4170, term4170.getClass(), "propListHead", null);
        setIntField(term4170, term4170.getClass(), "sourcePosition", 0);
        setField(term4170, term4170.getClass(), "jsType", null);
        setField(term4170, term4170.getClass(), "parent", null);
        setField(term4162, term4162.getClass(), "last", term4170);
        setField(term4173, term4173.getClass(), "next", null);
        setIntField(term4173, term4173.getClass(), "type", 0);
        setIntField(term4173, term4173.getClass(), "intValue", 0);
        setField(term4173, term4173.getClass(), "objectValue", null);
        setField(term4162, term4162.getClass(), "propListHead", term4173);
        setIntField(term4162, term4162.getClass(), "sourcePosition", 1703103733);
        setField(term4162, term4162.getClass(), "jsType", null);
        setField(term4162, term4162.getClass(), "parent", null);
        setField(term4160, term4160.getClass(), "next", term4162);
        setIntField(term4177, term4177.getClass(), "type", 0);
        setField(term4177, term4177.getClass(), "next", null);
        setField(term4177, term4177.getClass(), "first", null);
        setField(term4177, term4177.getClass(), "last", null);
        setField(term4177, term4177.getClass(), "propListHead", null);
        setIntField(term4177, term4177.getClass(), "sourcePosition", 0);
        setField(term4177, term4177.getClass(), "jsType", null);
        setField(term4177, term4177.getClass(), "parent", null);
        setField(term4160, term4160.getClass(), "first", term4177);
        setIntField(term4180, term4180.getClass(), "type", 0);
        setField(term4180, term4180.getClass(), "next", null);
        setField(term4180, term4180.getClass(), "first", null);
        setField(term4180, term4180.getClass(), "last", null);
        setField(term4180, term4180.getClass(), "propListHead", null);
        setIntField(term4180, term4180.getClass(), "sourcePosition", 0);
        setField(term4180, term4180.getClass(), "jsType", null);
        setField(term4180, term4180.getClass(), "parent", null);
        setField(term4160, term4160.getClass(), "last", term4180);
        setField(term4183, term4183.getClass(), "next", null);
        setIntField(term4183, term4183.getClass(), "type", 0);
        setIntField(term4183, term4183.getClass(), "intValue", 0);
        setField(term4183, term4183.getClass(), "objectValue", null);
        setField(term4160, term4160.getClass(), "propListHead", term4183);
        setIntField(term4160, term4160.getClass(), "sourcePosition", 1057562436);
        setField(term4160, term4160.getClass(), "jsType", null);
        setField(term4160, term4160.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term4133;
        args[2] = term4160;
        try {
            callMethod(klass, "isConstantByConvention", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


