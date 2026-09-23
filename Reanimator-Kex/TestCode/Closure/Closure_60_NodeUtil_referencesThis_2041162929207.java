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

public class NodeUtil_referencesThis_2041162929207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1036;
     Object term10627;

    public NodeUtil_referencesThis_2041162929207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1036, term1036.getClass(), "type", -370828664);
        setIntField(term1038, term1038.getClass(), "type", -1867239125);
        setIntField(term1040, term1040.getClass(), "type", 0);
        setField(term1040, term1040.getClass(), "next", null);
        setField(term1040, term1040.getClass(), "first", null);
        setField(term1040, term1040.getClass(), "last", null);
        setField(term1040, term1040.getClass(), "propListHead", null);
        setIntField(term1040, term1040.getClass(), "sourcePosition", 0);
        setField(term1040, term1040.getClass(), "jsType", null);
        setField(term1040, term1040.getClass(), "parent", null);
        setField(term1038, term1038.getClass(), "next", term1040);
        setIntField(term1043, term1043.getClass(), "type", 0);
        setField(term1043, term1043.getClass(), "next", null);
        setField(term1043, term1043.getClass(), "first", null);
        setField(term1043, term1043.getClass(), "last", null);
        setField(term1043, term1043.getClass(), "propListHead", null);
        setIntField(term1043, term1043.getClass(), "sourcePosition", 0);
        setField(term1043, term1043.getClass(), "jsType", null);
        setField(term1043, term1043.getClass(), "parent", null);
        setField(term1038, term1038.getClass(), "first", term1043);
        setIntField(term1046, term1046.getClass(), "type", 0);
        setField(term1046, term1046.getClass(), "next", null);
        setField(term1046, term1046.getClass(), "first", null);
        setField(term1046, term1046.getClass(), "last", null);
        setField(term1046, term1046.getClass(), "propListHead", null);
        setIntField(term1046, term1046.getClass(), "sourcePosition", 0);
        setField(term1046, term1046.getClass(), "jsType", null);
        setField(term1046, term1046.getClass(), "parent", null);
        setField(term1038, term1038.getClass(), "last", term1046);
        setField(term1038, term1038.getClass(), "propListHead", null);
        setIntField(term1038, term1038.getClass(), "sourcePosition", 0);
        setField(term1038, term1038.getClass(), "jsType", null);
        setField(term1038, term1038.getClass(), "parent", null);
        setField(term1036, term1036.getClass(), "next", term1038);
        setIntField(term1050, term1050.getClass(), "type", 0);
        setField(term1050, term1050.getClass(), "next", null);
        setField(term1050, term1050.getClass(), "first", null);
        setField(term1050, term1050.getClass(), "last", null);
        setField(term1050, term1050.getClass(), "propListHead", null);
        setIntField(term1050, term1050.getClass(), "sourcePosition", 0);
        setField(term1050, term1050.getClass(), "jsType", null);
        setField(term1050, term1050.getClass(), "parent", null);
        setField(term1036, term1036.getClass(), "first", term1050);
        setIntField(term1053, term1053.getClass(), "type", 0);
        setField(term1053, term1053.getClass(), "next", null);
        setField(term1053, term1053.getClass(), "first", null);
        setField(term1053, term1053.getClass(), "last", null);
        setField(term1053, term1053.getClass(), "propListHead", null);
        setIntField(term1053, term1053.getClass(), "sourcePosition", 0);
        setField(term1053, term1053.getClass(), "jsType", null);
        setField(term1053, term1053.getClass(), "parent", null);
        setField(term1036, term1036.getClass(), "last", term1053);
        setField(term1036, term1036.getClass(), "propListHead", null);
        setIntField(term1036, term1036.getClass(), "sourcePosition", 0);
        setField(term1036, term1036.getClass(), "jsType", null);
        setField(term1036, term1036.getClass(), "parent", null);
        term10627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10627, term10627.getClass(), "type", -370828664);
        setIntField(term10628, term10628.getClass(), "type", -1867239125);
        setIntField(term10629, term10629.getClass(), "type", 0);
        setField(term10629, term10629.getClass(), "next", null);
        setField(term10629, term10629.getClass(), "first", null);
        setField(term10629, term10629.getClass(), "last", null);
        setField(term10629, term10629.getClass(), "propListHead", null);
        setIntField(term10629, term10629.getClass(), "sourcePosition", 0);
        setField(term10629, term10629.getClass(), "jsType", null);
        setField(term10629, term10629.getClass(), "parent", null);
        setField(term10628, term10628.getClass(), "next", term10629);
        setIntField(term10630, term10630.getClass(), "type", 0);
        setField(term10630, term10630.getClass(), "next", null);
        setField(term10630, term10630.getClass(), "first", null);
        setField(term10630, term10630.getClass(), "last", null);
        setField(term10630, term10630.getClass(), "propListHead", null);
        setIntField(term10630, term10630.getClass(), "sourcePosition", 0);
        setField(term10630, term10630.getClass(), "jsType", null);
        setField(term10630, term10630.getClass(), "parent", null);
        setField(term10628, term10628.getClass(), "first", term10630);
        setIntField(term10631, term10631.getClass(), "type", 0);
        setField(term10631, term10631.getClass(), "next", null);
        setField(term10631, term10631.getClass(), "first", null);
        setField(term10631, term10631.getClass(), "last", null);
        setField(term10631, term10631.getClass(), "propListHead", null);
        setIntField(term10631, term10631.getClass(), "sourcePosition", 0);
        setField(term10631, term10631.getClass(), "jsType", null);
        setField(term10631, term10631.getClass(), "parent", null);
        setField(term10628, term10628.getClass(), "last", term10631);
        setField(term10628, term10628.getClass(), "propListHead", null);
        setIntField(term10628, term10628.getClass(), "sourcePosition", 0);
        setField(term10628, term10628.getClass(), "jsType", null);
        setField(term10628, term10628.getClass(), "parent", null);
        setField(term10627, term10627.getClass(), "next", term10628);
        setIntField(term10632, term10632.getClass(), "type", 0);
        setField(term10632, term10632.getClass(), "next", null);
        setField(term10632, term10632.getClass(), "first", null);
        setField(term10632, term10632.getClass(), "last", null);
        setField(term10632, term10632.getClass(), "propListHead", null);
        setIntField(term10632, term10632.getClass(), "sourcePosition", 0);
        setField(term10632, term10632.getClass(), "jsType", null);
        setField(term10632, term10632.getClass(), "parent", null);
        setField(term10627, term10627.getClass(), "first", term10632);
        setIntField(term10633, term10633.getClass(), "type", 0);
        setField(term10633, term10633.getClass(), "next", null);
        setField(term10633, term10633.getClass(), "first", null);
        setField(term10633, term10633.getClass(), "last", null);
        setField(term10633, term10633.getClass(), "propListHead", null);
        setIntField(term10633, term10633.getClass(), "sourcePosition", 0);
        setField(term10633, term10633.getClass(), "jsType", null);
        setField(term10633, term10633.getClass(), "parent", null);
        setField(term10627, term10627.getClass(), "last", term10633);
        setField(term10627, term10627.getClass(), "propListHead", null);
        setIntField(term10627, term10627.getClass(), "sourcePosition", 0);
        setField(term10627, term10627.getClass(), "jsType", null);
        setField(term10627, term10627.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1036;
        callMethod(klass, "referencesThis", argTypes, null, args);
        assertTrue(recursiveEquals(term1036, term10627));
    }

};


