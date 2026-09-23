package org.apache.commons.collections.list;

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
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SetUniqueList_removeAll_177008809127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31279;
     Object term31383;

    public SetUniqueList_removeAll_177008809127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31279 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31473 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term31435 = new ArrayList();
        ((ArrayList) term31435).add(term31473);
        ((ArrayList) term31435).add(term31473);
        ((ArrayList) term31435).add(term31473);
        ((ArrayList) term31435).add(term31473);
        ((ArrayList) term31435).add(term31473);
        ((ArrayList) term31435).add(term31473);
        ((ArrayList) term31435).add(term31473);
        ((ArrayList) term31435).add(term31473);
        ((ArrayList) term31435).add(term31473);
        ((ArrayList) term31435).add(term31473);
        term31383 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term31383, term31383.getClass(), "collection", term31435);
        setField(term31383, term31383.getClass(), "set", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term31383;
        try {
            callMethod(klass, "removeAll", argTypes, term31279, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


