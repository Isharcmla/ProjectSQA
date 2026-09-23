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

public class NodeUtil_isSwitchCase_1170575017150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192;
     Object term8140;

    public NodeUtil_isSwitchCase_1170575017150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1215 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1192, term1192.getClass(), "type", -20614472);
        setIntField(term1194, term1194.getClass(), "type", 1207142014);
        setIntField(term1196, term1196.getClass(), "type", 0);
        setField(term1196, term1196.getClass(), "next", null);
        setField(term1196, term1196.getClass(), "first", null);
        setField(term1196, term1196.getClass(), "last", null);
        setField(term1196, term1196.getClass(), "propListHead", null);
        setIntField(term1196, term1196.getClass(), "sourcePosition", 0);
        setField(term1196, term1196.getClass(), "jsType", null);
        setField(term1196, term1196.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "next", term1196);
        setIntField(term1199, term1199.getClass(), "type", 0);
        setField(term1199, term1199.getClass(), "next", null);
        setField(term1199, term1199.getClass(), "first", null);
        setField(term1199, term1199.getClass(), "last", null);
        setField(term1199, term1199.getClass(), "propListHead", null);
        setIntField(term1199, term1199.getClass(), "sourcePosition", 0);
        setField(term1199, term1199.getClass(), "jsType", null);
        setField(term1199, term1199.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "first", term1199);
        setIntField(term1202, term1202.getClass(), "type", 0);
        setField(term1202, term1202.getClass(), "next", null);
        setField(term1202, term1202.getClass(), "first", null);
        setField(term1202, term1202.getClass(), "last", null);
        setField(term1202, term1202.getClass(), "propListHead", null);
        setIntField(term1202, term1202.getClass(), "sourcePosition", 0);
        setField(term1202, term1202.getClass(), "jsType", null);
        setField(term1202, term1202.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "last", term1202);
        setField(term1205, term1205.getClass(), "next", null);
        setIntField(term1205, term1205.getClass(), "type", 0);
        setIntField(term1205, term1205.getClass(), "intValue", 0);
        setField(term1205, term1205.getClass(), "objectValue", null);
        setField(term1194, term1194.getClass(), "propListHead", term1205);
        setIntField(term1194, term1194.getClass(), "sourcePosition", 330043745);
        setField(term1194, term1194.getClass(), "jsType", null);
        setField(term1194, term1194.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "next", term1194);
        setIntField(term1209, term1209.getClass(), "type", 0);
        setField(term1209, term1209.getClass(), "next", null);
        setField(term1209, term1209.getClass(), "first", null);
        setField(term1209, term1209.getClass(), "last", null);
        setField(term1209, term1209.getClass(), "propListHead", null);
        setIntField(term1209, term1209.getClass(), "sourcePosition", 0);
        setField(term1209, term1209.getClass(), "jsType", null);
        setField(term1209, term1209.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "first", term1209);
        setIntField(term1212, term1212.getClass(), "type", 0);
        setField(term1212, term1212.getClass(), "next", null);
        setField(term1212, term1212.getClass(), "first", null);
        setField(term1212, term1212.getClass(), "last", null);
        setField(term1212, term1212.getClass(), "propListHead", null);
        setIntField(term1212, term1212.getClass(), "sourcePosition", 0);
        setField(term1212, term1212.getClass(), "jsType", null);
        setField(term1212, term1212.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "last", term1212);
        setField(term1215, term1215.getClass(), "next", null);
        setIntField(term1215, term1215.getClass(), "type", 0);
        setIntField(term1215, term1215.getClass(), "intValue", 0);
        setField(term1215, term1215.getClass(), "objectValue", null);
        setField(term1192, term1192.getClass(), "propListHead", term1215);
        setIntField(term1192, term1192.getClass(), "sourcePosition", -509349195);
        setField(term1192, term1192.getClass(), "jsType", null);
        setField(term1192, term1192.getClass(), "parent", null);
        term8140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8145 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8148 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8140, term8140.getClass(), "type", -20614472);
        setIntField(term8141, term8141.getClass(), "type", 1207142014);
        setIntField(term8142, term8142.getClass(), "type", 0);
        setField(term8142, term8142.getClass(), "next", null);
        setField(term8142, term8142.getClass(), "first", null);
        setField(term8142, term8142.getClass(), "last", null);
        setField(term8142, term8142.getClass(), "propListHead", null);
        setIntField(term8142, term8142.getClass(), "sourcePosition", 0);
        setField(term8142, term8142.getClass(), "jsType", null);
        setField(term8142, term8142.getClass(), "parent", null);
        setField(term8141, term8141.getClass(), "next", term8142);
        setIntField(term8143, term8143.getClass(), "type", 0);
        setField(term8143, term8143.getClass(), "next", null);
        setField(term8143, term8143.getClass(), "first", null);
        setField(term8143, term8143.getClass(), "last", null);
        setField(term8143, term8143.getClass(), "propListHead", null);
        setIntField(term8143, term8143.getClass(), "sourcePosition", 0);
        setField(term8143, term8143.getClass(), "jsType", null);
        setField(term8143, term8143.getClass(), "parent", null);
        setField(term8141, term8141.getClass(), "first", term8143);
        setIntField(term8144, term8144.getClass(), "type", 0);
        setField(term8144, term8144.getClass(), "next", null);
        setField(term8144, term8144.getClass(), "first", null);
        setField(term8144, term8144.getClass(), "last", null);
        setField(term8144, term8144.getClass(), "propListHead", null);
        setIntField(term8144, term8144.getClass(), "sourcePosition", 0);
        setField(term8144, term8144.getClass(), "jsType", null);
        setField(term8144, term8144.getClass(), "parent", null);
        setField(term8141, term8141.getClass(), "last", term8144);
        setField(term8145, term8145.getClass(), "next", null);
        setIntField(term8145, term8145.getClass(), "type", 0);
        setIntField(term8145, term8145.getClass(), "intValue", 0);
        setField(term8145, term8145.getClass(), "objectValue", null);
        setField(term8141, term8141.getClass(), "propListHead", term8145);
        setIntField(term8141, term8141.getClass(), "sourcePosition", 330043745);
        setField(term8141, term8141.getClass(), "jsType", null);
        setField(term8141, term8141.getClass(), "parent", null);
        setField(term8140, term8140.getClass(), "next", term8141);
        setIntField(term8146, term8146.getClass(), "type", 0);
        setField(term8146, term8146.getClass(), "next", null);
        setField(term8146, term8146.getClass(), "first", null);
        setField(term8146, term8146.getClass(), "last", null);
        setField(term8146, term8146.getClass(), "propListHead", null);
        setIntField(term8146, term8146.getClass(), "sourcePosition", 0);
        setField(term8146, term8146.getClass(), "jsType", null);
        setField(term8146, term8146.getClass(), "parent", null);
        setField(term8140, term8140.getClass(), "first", term8146);
        setIntField(term8147, term8147.getClass(), "type", 0);
        setField(term8147, term8147.getClass(), "next", null);
        setField(term8147, term8147.getClass(), "first", null);
        setField(term8147, term8147.getClass(), "last", null);
        setField(term8147, term8147.getClass(), "propListHead", null);
        setIntField(term8147, term8147.getClass(), "sourcePosition", 0);
        setField(term8147, term8147.getClass(), "jsType", null);
        setField(term8147, term8147.getClass(), "parent", null);
        setField(term8140, term8140.getClass(), "last", term8147);
        setField(term8148, term8148.getClass(), "next", null);
        setIntField(term8148, term8148.getClass(), "type", 0);
        setIntField(term8148, term8148.getClass(), "intValue", 0);
        setField(term8148, term8148.getClass(), "objectValue", null);
        setField(term8140, term8140.getClass(), "propListHead", term8148);
        setIntField(term8140, term8140.getClass(), "sourcePosition", -509349195);
        setField(term8140, term8140.getClass(), "jsType", null);
        setField(term8140, term8140.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1192;
        Object retValue = callMethod(klass, "isSwitchCase", argTypes, null, args);
        assertTrue(recursiveEquals(term1192, term8140));
        assertTrue(recursiveEquals(retValue, false));
    }

};


