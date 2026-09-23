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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_isAssignmentTarget_171416006367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1658;
     Object term1660;

    public PeepholeFoldConstants_isAssignmentTarget_171416006367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1658 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term1658, term1658.getClass(), "late", true);
        setField(term1658, term1658.getClass(), "compiler", null);
        term1660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1660, term1660.getClass(), "type", 1292332296);
        setIntField(term1662, term1662.getClass(), "type", -1415256843);
        setIntField(term1664, term1664.getClass(), "type", 612177768);
        setIntField(term1666, term1666.getClass(), "type", -1626451656);
        setIntField(term1668, term1668.getClass(), "type", 173952451);
        setField(term1668, term1668.getClass(), "next", null);
        setField(term1668, term1668.getClass(), "first", null);
        setField(term1668, term1668.getClass(), "last", null);
        setField(term1668, term1668.getClass(), "propListHead", null);
        setIntField(term1668, term1668.getClass(), "sourcePosition", 0);
        setField(term1668, term1668.getClass(), "jsType", null);
        setField(term1668, term1668.getClass(), "parent", null);
        setField(term1666, term1666.getClass(), "next", term1668);
        setIntField(term1671, term1671.getClass(), "type", -1972033388);
        setField(term1671, term1671.getClass(), "next", null);
        setField(term1671, term1671.getClass(), "first", null);
        setField(term1671, term1671.getClass(), "last", term1668);
        setField(term1671, term1671.getClass(), "propListHead", null);
        setIntField(term1671, term1671.getClass(), "sourcePosition", 0);
        setField(term1671, term1671.getClass(), "jsType", null);
        setField(term1671, term1671.getClass(), "parent", null);
        setField(term1666, term1666.getClass(), "first", term1671);
        setField(term1666, term1666.getClass(), "last", term1664);
        setField(term1666, term1666.getClass(), "propListHead", null);
        setIntField(term1666, term1666.getClass(), "sourcePosition", 0);
        setField(term1666, term1666.getClass(), "jsType", null);
        setField(term1666, term1666.getClass(), "parent", null);
        setField(term1664, term1664.getClass(), "next", term1666);
        setField(term1664, term1664.getClass(), "first", term1668);
        setIntField(term1675, term1675.getClass(), "type", 2634669);
        setIntField(term1677, term1677.getClass(), "type", -1912429941);
        setField(term1677, term1677.getClass(), "next", null);
        setField(term1677, term1677.getClass(), "first", term1671);
        setField(term1677, term1677.getClass(), "last", term1666);
        setField(term1677, term1677.getClass(), "propListHead", null);
        setIntField(term1677, term1677.getClass(), "sourcePosition", 0);
        setField(term1677, term1677.getClass(), "jsType", null);
        setField(term1677, term1677.getClass(), "parent", null);
        setField(term1675, term1675.getClass(), "next", term1677);
        setField(term1675, term1675.getClass(), "first", term1662);
        setField(term1675, term1675.getClass(), "last", term1662);
        setField(term1675, term1675.getClass(), "propListHead", null);
        setIntField(term1675, term1675.getClass(), "sourcePosition", 0);
        setField(term1675, term1675.getClass(), "jsType", null);
        setField(term1675, term1675.getClass(), "parent", null);
        setField(term1664, term1664.getClass(), "last", term1675);
        setField(term1664, term1664.getClass(), "propListHead", null);
        setIntField(term1664, term1664.getClass(), "sourcePosition", 0);
        setField(term1664, term1664.getClass(), "jsType", null);
        setField(term1664, term1664.getClass(), "parent", null);
        setField(term1662, term1662.getClass(), "next", term1664);
        setIntField(term1682, term1682.getClass(), "type", 1801052257);
        setField(term1682, term1682.getClass(), "next", term1675);
        setField(term1682, term1682.getClass(), "first", term1677);
        setField(term1682, term1682.getClass(), "last", term1660);
        setField(term1682, term1682.getClass(), "propListHead", null);
        setIntField(term1682, term1682.getClass(), "sourcePosition", 0);
        setField(term1682, term1682.getClass(), "jsType", null);
        setField(term1682, term1682.getClass(), "parent", null);
        setField(term1662, term1662.getClass(), "first", term1682);
        setField(term1662, term1662.getClass(), "last", term1682);
        setField(term1662, term1662.getClass(), "propListHead", null);
        setIntField(term1662, term1662.getClass(), "sourcePosition", 0);
        setField(term1662, term1662.getClass(), "jsType", null);
        setField(term1662, term1662.getClass(), "parent", null);
        setField(term1660, term1660.getClass(), "next", term1662);
        setField(term1660, term1660.getClass(), "first", term1666);
        setField(term1660, term1660.getClass(), "last", term1668);
        setField(term1660, term1660.getClass(), "propListHead", null);
        setIntField(term1660, term1660.getClass(), "sourcePosition", 0);
        setField(term1660, term1660.getClass(), "jsType", null);
        setField(term1660, term1660.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1660;
        try {
            callMethod(klass, "isAssignmentTarget", argTypes, term1658, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


