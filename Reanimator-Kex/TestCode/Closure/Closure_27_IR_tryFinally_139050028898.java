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

public class IR_tryFinally_139050028898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term970;
     Object term997;

    public IR_tryFinally_139050028898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term970, term970.getClass(), "type", -1332748804);
        setIntField(term972, term972.getClass(), "type", 1774507971);
        setIntField(term974, term974.getClass(), "type", -1420269858);
        setIntField(term976, term976.getClass(), "type", -2119545015);
        setIntField(term978, term978.getClass(), "type", 1272542218);
        setField(term978, term978.getClass(), "next", null);
        setField(term978, term978.getClass(), "first", null);
        setField(term978, term978.getClass(), "last", null);
        setField(term978, term978.getClass(), "propListHead", null);
        setIntField(term978, term978.getClass(), "sourcePosition", 0);
        setField(term978, term978.getClass(), "jsType", null);
        setField(term978, term978.getClass(), "parent", null);
        setField(term976, term976.getClass(), "next", term978);
        setIntField(term981, term981.getClass(), "type", 1209799204);
        setField(term981, term981.getClass(), "next", null);
        setField(term981, term981.getClass(), "first", null);
        setField(term981, term981.getClass(), "last", term978);
        setField(term981, term981.getClass(), "propListHead", null);
        setIntField(term981, term981.getClass(), "sourcePosition", 0);
        setField(term981, term981.getClass(), "jsType", null);
        setField(term981, term981.getClass(), "parent", null);
        setField(term976, term976.getClass(), "first", term981);
        setField(term976, term976.getClass(), "last", term974);
        setField(term976, term976.getClass(), "propListHead", null);
        setIntField(term976, term976.getClass(), "sourcePosition", 0);
        setField(term976, term976.getClass(), "jsType", null);
        setField(term976, term976.getClass(), "parent", null);
        setField(term974, term974.getClass(), "next", term976);
        setField(term974, term974.getClass(), "first", term978);
        setIntField(term985, term985.getClass(), "type", 844222656);
        setIntField(term987, term987.getClass(), "type", -18216811);
        setField(term987, term987.getClass(), "next", null);
        setField(term987, term987.getClass(), "first", term981);
        setField(term987, term987.getClass(), "last", term976);
        setField(term987, term987.getClass(), "propListHead", null);
        setIntField(term987, term987.getClass(), "sourcePosition", 0);
        setField(term987, term987.getClass(), "jsType", null);
        setField(term987, term987.getClass(), "parent", null);
        setField(term985, term985.getClass(), "next", term987);
        setField(term985, term985.getClass(), "first", term972);
        setField(term985, term985.getClass(), "last", term972);
        setField(term985, term985.getClass(), "propListHead", null);
        setIntField(term985, term985.getClass(), "sourcePosition", 0);
        setField(term985, term985.getClass(), "jsType", null);
        setField(term985, term985.getClass(), "parent", null);
        setField(term974, term974.getClass(), "last", term985);
        setField(term974, term974.getClass(), "propListHead", null);
        setIntField(term974, term974.getClass(), "sourcePosition", 0);
        setField(term974, term974.getClass(), "jsType", null);
        setField(term974, term974.getClass(), "parent", null);
        setField(term972, term972.getClass(), "next", term974);
        setIntField(term992, term992.getClass(), "type", -1813280137);
        setField(term992, term992.getClass(), "next", term985);
        setField(term992, term992.getClass(), "first", term987);
        setField(term992, term992.getClass(), "last", term970);
        setField(term992, term992.getClass(), "propListHead", null);
        setIntField(term992, term992.getClass(), "sourcePosition", 0);
        setField(term992, term992.getClass(), "jsType", null);
        setField(term992, term992.getClass(), "parent", null);
        setField(term972, term972.getClass(), "first", term992);
        setField(term972, term972.getClass(), "last", term992);
        setField(term972, term972.getClass(), "propListHead", null);
        setIntField(term972, term972.getClass(), "sourcePosition", 0);
        setField(term972, term972.getClass(), "jsType", null);
        setField(term972, term972.getClass(), "parent", null);
        setField(term970, term970.getClass(), "next", term972);
        setField(term970, term970.getClass(), "first", term976);
        setField(term970, term970.getClass(), "last", term978);
        setField(term970, term970.getClass(), "propListHead", null);
        setIntField(term970, term970.getClass(), "sourcePosition", 0);
        setField(term970, term970.getClass(), "jsType", null);
        setField(term970, term970.getClass(), "parent", null);
        term997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term997, term997.getClass(), "type", 719656595);
        setIntField(term999, term999.getClass(), "type", -1516995753);
        setIntField(term1001, term1001.getClass(), "type", -390501023);
        setIntField(term1003, term1003.getClass(), "type", -1667482829);
        setIntField(term1005, term1005.getClass(), "type", 1116576792);
        setField(term1005, term1005.getClass(), "next", null);
        setField(term1005, term1005.getClass(), "first", null);
        setField(term1005, term1005.getClass(), "last", null);
        setField(term1005, term1005.getClass(), "propListHead", null);
        setIntField(term1005, term1005.getClass(), "sourcePosition", 0);
        setField(term1005, term1005.getClass(), "jsType", null);
        setField(term1005, term1005.getClass(), "parent", null);
        setField(term1003, term1003.getClass(), "next", term1005);
        setIntField(term1008, term1008.getClass(), "type", -942194446);
        setField(term1008, term1008.getClass(), "next", null);
        setField(term1008, term1008.getClass(), "first", null);
        setField(term1008, term1008.getClass(), "last", term1005);
        setField(term1008, term1008.getClass(), "propListHead", null);
        setIntField(term1008, term1008.getClass(), "sourcePosition", 0);
        setField(term1008, term1008.getClass(), "jsType", null);
        setField(term1008, term1008.getClass(), "parent", null);
        setField(term1003, term1003.getClass(), "first", term1008);
        setField(term1003, term1003.getClass(), "last", term1001);
        setField(term1003, term1003.getClass(), "propListHead", null);
        setIntField(term1003, term1003.getClass(), "sourcePosition", 0);
        setField(term1003, term1003.getClass(), "jsType", null);
        setField(term1003, term1003.getClass(), "parent", null);
        setField(term1001, term1001.getClass(), "next", term1003);
        setField(term1001, term1001.getClass(), "first", term1005);
        setIntField(term1012, term1012.getClass(), "type", 1242676024);
        setIntField(term1014, term1014.getClass(), "type", -1865023308);
        setField(term1014, term1014.getClass(), "next", null);
        setField(term1014, term1014.getClass(), "first", term1008);
        setField(term1014, term1014.getClass(), "last", term1003);
        setField(term1014, term1014.getClass(), "propListHead", null);
        setIntField(term1014, term1014.getClass(), "sourcePosition", 0);
        setField(term1014, term1014.getClass(), "jsType", null);
        setField(term1014, term1014.getClass(), "parent", null);
        setField(term1012, term1012.getClass(), "next", term1014);
        setField(term1012, term1012.getClass(), "first", term999);
        setField(term1012, term1012.getClass(), "last", term999);
        setField(term1012, term1012.getClass(), "propListHead", null);
        setIntField(term1012, term1012.getClass(), "sourcePosition", 0);
        setField(term1012, term1012.getClass(), "jsType", null);
        setField(term1012, term1012.getClass(), "parent", null);
        setField(term1001, term1001.getClass(), "last", term1012);
        setField(term1001, term1001.getClass(), "propListHead", null);
        setIntField(term1001, term1001.getClass(), "sourcePosition", 0);
        setField(term1001, term1001.getClass(), "jsType", null);
        setField(term1001, term1001.getClass(), "parent", null);
        setField(term999, term999.getClass(), "next", term1001);
        setIntField(term1019, term1019.getClass(), "type", 1698510819);
        setField(term1019, term1019.getClass(), "next", term1012);
        setField(term1019, term1019.getClass(), "first", term1014);
        setField(term1019, term1019.getClass(), "last", term997);
        setField(term1019, term1019.getClass(), "propListHead", null);
        setIntField(term1019, term1019.getClass(), "sourcePosition", 0);
        setField(term1019, term1019.getClass(), "jsType", null);
        setField(term1019, term1019.getClass(), "parent", null);
        setField(term999, term999.getClass(), "first", term1019);
        setField(term999, term999.getClass(), "last", term1019);
        setField(term999, term999.getClass(), "propListHead", null);
        setIntField(term999, term999.getClass(), "sourcePosition", 0);
        setField(term999, term999.getClass(), "jsType", null);
        setField(term999, term999.getClass(), "parent", null);
        setField(term997, term997.getClass(), "next", term999);
        setField(term997, term997.getClass(), "first", term1003);
        setField(term997, term997.getClass(), "last", term1005);
        setField(term997, term997.getClass(), "propListHead", null);
        setIntField(term997, term997.getClass(), "sourcePosition", 0);
        setField(term997, term997.getClass(), "jsType", null);
        setField(term997, term997.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term970;
        args[1] = term997;
        try {
            callMethod(klass, "tryFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


