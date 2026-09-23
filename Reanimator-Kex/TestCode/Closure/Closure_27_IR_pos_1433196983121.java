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

public class IR_pos_1433196983121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1966;

    public IR_pos_1433196983121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1966, term1966.getClass(), "type", -1212399479);
        setIntField(term1968, term1968.getClass(), "type", 2107679041);
        setIntField(term1970, term1970.getClass(), "type", 2040965507);
        setIntField(term1972, term1972.getClass(), "type", -1281083262);
        setIntField(term1974, term1974.getClass(), "type", 1059930704);
        setField(term1974, term1974.getClass(), "next", null);
        setField(term1974, term1974.getClass(), "first", null);
        setField(term1974, term1974.getClass(), "last", null);
        setField(term1974, term1974.getClass(), "propListHead", null);
        setIntField(term1974, term1974.getClass(), "sourcePosition", 0);
        setField(term1974, term1974.getClass(), "jsType", null);
        setField(term1974, term1974.getClass(), "parent", null);
        setField(term1972, term1972.getClass(), "next", term1974);
        setIntField(term1977, term1977.getClass(), "type", -1967153290);
        setField(term1977, term1977.getClass(), "next", null);
        setField(term1977, term1977.getClass(), "first", null);
        setField(term1977, term1977.getClass(), "last", term1974);
        setField(term1977, term1977.getClass(), "propListHead", null);
        setIntField(term1977, term1977.getClass(), "sourcePosition", 0);
        setField(term1977, term1977.getClass(), "jsType", null);
        setField(term1977, term1977.getClass(), "parent", null);
        setField(term1972, term1972.getClass(), "first", term1977);
        setField(term1972, term1972.getClass(), "last", term1970);
        setField(term1972, term1972.getClass(), "propListHead", null);
        setIntField(term1972, term1972.getClass(), "sourcePosition", 0);
        setField(term1972, term1972.getClass(), "jsType", null);
        setField(term1972, term1972.getClass(), "parent", null);
        setField(term1970, term1970.getClass(), "next", term1972);
        setField(term1970, term1970.getClass(), "first", term1974);
        setIntField(term1981, term1981.getClass(), "type", -796934571);
        setIntField(term1983, term1983.getClass(), "type", 405295896);
        setField(term1983, term1983.getClass(), "next", null);
        setField(term1983, term1983.getClass(), "first", term1977);
        setField(term1983, term1983.getClass(), "last", term1972);
        setField(term1983, term1983.getClass(), "propListHead", null);
        setIntField(term1983, term1983.getClass(), "sourcePosition", 0);
        setField(term1983, term1983.getClass(), "jsType", null);
        setField(term1983, term1983.getClass(), "parent", null);
        setField(term1981, term1981.getClass(), "next", term1983);
        setField(term1981, term1981.getClass(), "first", term1968);
        setField(term1981, term1981.getClass(), "last", term1968);
        setField(term1981, term1981.getClass(), "propListHead", null);
        setIntField(term1981, term1981.getClass(), "sourcePosition", 0);
        setField(term1981, term1981.getClass(), "jsType", null);
        setField(term1981, term1981.getClass(), "parent", null);
        setField(term1970, term1970.getClass(), "last", term1981);
        setField(term1970, term1970.getClass(), "propListHead", null);
        setIntField(term1970, term1970.getClass(), "sourcePosition", 0);
        setField(term1970, term1970.getClass(), "jsType", null);
        setField(term1970, term1970.getClass(), "parent", null);
        setField(term1968, term1968.getClass(), "next", term1970);
        setIntField(term1988, term1988.getClass(), "type", -814977075);
        setField(term1988, term1988.getClass(), "next", term1981);
        setField(term1988, term1988.getClass(), "first", term1983);
        setField(term1988, term1988.getClass(), "last", term1966);
        setField(term1988, term1988.getClass(), "propListHead", null);
        setIntField(term1988, term1988.getClass(), "sourcePosition", 0);
        setField(term1988, term1988.getClass(), "jsType", null);
        setField(term1988, term1988.getClass(), "parent", null);
        setField(term1968, term1968.getClass(), "first", term1988);
        setField(term1968, term1968.getClass(), "last", term1988);
        setField(term1968, term1968.getClass(), "propListHead", null);
        setIntField(term1968, term1968.getClass(), "sourcePosition", 0);
        setField(term1968, term1968.getClass(), "jsType", null);
        setField(term1968, term1968.getClass(), "parent", null);
        setField(term1966, term1966.getClass(), "next", term1968);
        setField(term1966, term1966.getClass(), "first", term1972);
        setField(term1966, term1966.getClass(), "last", term1974);
        setField(term1966, term1966.getClass(), "propListHead", null);
        setIntField(term1966, term1966.getClass(), "sourcePosition", 0);
        setField(term1966, term1966.getClass(), "jsType", null);
        setField(term1966, term1966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1966;
        try {
            callMethod(klass, "pos", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


