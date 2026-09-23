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
import java.lang.Integer;

public class NodeUtil_getArgumentForFunction_5209754310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4746;
     Object term4773;

    public NodeUtil_getArgumentForFunction_5209754310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4746, term4746.getClass(), "type", 448061908);
        setIntField(term4748, term4748.getClass(), "type", -1268483887);
        setIntField(term4750, term4750.getClass(), "type", -1929689681);
        setIntField(term4752, term4752.getClass(), "type", -91240911);
        setIntField(term4754, term4754.getClass(), "type", -321227954);
        setField(term4754, term4754.getClass(), "next", null);
        setField(term4754, term4754.getClass(), "first", null);
        setField(term4754, term4754.getClass(), "last", null);
        setField(term4754, term4754.getClass(), "propListHead", null);
        setIntField(term4754, term4754.getClass(), "sourcePosition", 0);
        setField(term4754, term4754.getClass(), "jsType", null);
        setField(term4754, term4754.getClass(), "parent", null);
        setField(term4752, term4752.getClass(), "next", term4754);
        setIntField(term4757, term4757.getClass(), "type", 373810833);
        setField(term4757, term4757.getClass(), "next", null);
        setField(term4757, term4757.getClass(), "first", null);
        setField(term4757, term4757.getClass(), "last", term4754);
        setField(term4757, term4757.getClass(), "propListHead", null);
        setIntField(term4757, term4757.getClass(), "sourcePosition", 0);
        setField(term4757, term4757.getClass(), "jsType", null);
        setField(term4757, term4757.getClass(), "parent", null);
        setField(term4752, term4752.getClass(), "first", term4757);
        setField(term4752, term4752.getClass(), "last", term4750);
        setField(term4752, term4752.getClass(), "propListHead", null);
        setIntField(term4752, term4752.getClass(), "sourcePosition", 0);
        setField(term4752, term4752.getClass(), "jsType", null);
        setField(term4752, term4752.getClass(), "parent", null);
        setField(term4750, term4750.getClass(), "next", term4752);
        setField(term4750, term4750.getClass(), "first", term4754);
        setIntField(term4761, term4761.getClass(), "type", -19567889);
        setIntField(term4763, term4763.getClass(), "type", 693500318);
        setField(term4763, term4763.getClass(), "next", null);
        setField(term4763, term4763.getClass(), "first", term4757);
        setField(term4763, term4763.getClass(), "last", term4752);
        setField(term4763, term4763.getClass(), "propListHead", null);
        setIntField(term4763, term4763.getClass(), "sourcePosition", 0);
        setField(term4763, term4763.getClass(), "jsType", null);
        setField(term4763, term4763.getClass(), "parent", null);
        setField(term4761, term4761.getClass(), "next", term4763);
        setField(term4761, term4761.getClass(), "first", term4748);
        setField(term4761, term4761.getClass(), "last", term4748);
        setField(term4761, term4761.getClass(), "propListHead", null);
        setIntField(term4761, term4761.getClass(), "sourcePosition", 0);
        setField(term4761, term4761.getClass(), "jsType", null);
        setField(term4761, term4761.getClass(), "parent", null);
        setField(term4750, term4750.getClass(), "last", term4761);
        setField(term4750, term4750.getClass(), "propListHead", null);
        setIntField(term4750, term4750.getClass(), "sourcePosition", 0);
        setField(term4750, term4750.getClass(), "jsType", null);
        setField(term4750, term4750.getClass(), "parent", null);
        setField(term4748, term4748.getClass(), "next", term4750);
        setIntField(term4768, term4768.getClass(), "type", 1702404702);
        setField(term4768, term4768.getClass(), "next", term4761);
        setField(term4768, term4768.getClass(), "first", term4763);
        setField(term4768, term4768.getClass(), "last", term4746);
        setField(term4768, term4768.getClass(), "propListHead", null);
        setIntField(term4768, term4768.getClass(), "sourcePosition", 0);
        setField(term4768, term4768.getClass(), "jsType", null);
        setField(term4768, term4768.getClass(), "parent", null);
        setField(term4748, term4748.getClass(), "first", term4768);
        setField(term4748, term4748.getClass(), "last", term4768);
        setField(term4748, term4748.getClass(), "propListHead", null);
        setIntField(term4748, term4748.getClass(), "sourcePosition", 0);
        setField(term4748, term4748.getClass(), "jsType", null);
        setField(term4748, term4748.getClass(), "parent", null);
        setField(term4746, term4746.getClass(), "next", term4748);
        setField(term4746, term4746.getClass(), "first", term4752);
        setField(term4746, term4746.getClass(), "last", term4754);
        setField(term4746, term4746.getClass(), "propListHead", null);
        setIntField(term4746, term4746.getClass(), "sourcePosition", 0);
        setField(term4746, term4746.getClass(), "jsType", null);
        setField(term4746, term4746.getClass(), "parent", null);
        term4773 = new Integer(1141592999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4746;
        args[1] = term4773;
        try {
            callMethod(klass, "getArgumentForFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


