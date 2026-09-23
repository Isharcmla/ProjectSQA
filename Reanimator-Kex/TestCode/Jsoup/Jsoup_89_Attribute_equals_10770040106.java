package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class Attribute_equals_10770040106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153272;
     Object term153386;
     Object term153789;
     Object term153790;

    public Attribute_equals_10770040106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153272 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term153386 = newInstance(Class.forName("java.lang.invoke.VarHandleShorts$FieldInstanceReadOnly"));
        term153789 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term153789, term153789.getClass(), "key", null);
        setField(term153789, term153789.getClass(), "val", null);
        setField(term153789, term153789.getClass(), "parent", null);
        term153790 = newInstance(Class.forName("java.lang.invoke.VarHandleShorts$FieldInstanceReadOnly"));
        setLongField(term153790, term153790.getClass(), "fieldOffset", 0L);
        setField(term153790, term153790.getClass(), "receiverType", null);
        setField(term153790, term153790.getClass(), "vform", null);
        setField(term153790, term153790.getClass(), "typesAndInvokers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term153386;
        Object retValue = callMethod(klass, "equals", argTypes, term153272, args);
        assertTrue(recursiveEquals(term153272, term153789));
        assertTrue(recursiveEquals(term153386, term153790));
        assertTrue(recursiveEquals(retValue, false));
    }

};


