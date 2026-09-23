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

public class NodeUtil_isObjectCallMethod_1353612968249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1981;
     Object term14662;

    public NodeUtil_isObjectCallMethod_1353612968249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1981, term1981.getClass(), "type", -608830309);
        setIntField(term1983, term1983.getClass(), "type", 696225243);
        setIntField(term1985, term1985.getClass(), "type", 0);
        setField(term1985, term1985.getClass(), "next", null);
        setField(term1985, term1985.getClass(), "first", null);
        setField(term1985, term1985.getClass(), "last", null);
        setField(term1985, term1985.getClass(), "propListHead", null);
        setIntField(term1985, term1985.getClass(), "sourcePosition", 0);
        setField(term1985, term1985.getClass(), "jsType", null);
        setField(term1985, term1985.getClass(), "parent", null);
        setField(term1983, term1983.getClass(), "next", term1985);
        setIntField(term1988, term1988.getClass(), "type", 0);
        setField(term1988, term1988.getClass(), "next", null);
        setField(term1988, term1988.getClass(), "first", null);
        setField(term1988, term1988.getClass(), "last", null);
        setField(term1988, term1988.getClass(), "propListHead", null);
        setIntField(term1988, term1988.getClass(), "sourcePosition", 0);
        setField(term1988, term1988.getClass(), "jsType", null);
        setField(term1988, term1988.getClass(), "parent", null);
        setField(term1983, term1983.getClass(), "first", term1988);
        setIntField(term1991, term1991.getClass(), "type", 0);
        setField(term1991, term1991.getClass(), "next", null);
        setField(term1991, term1991.getClass(), "first", null);
        setField(term1991, term1991.getClass(), "last", null);
        setField(term1991, term1991.getClass(), "propListHead", null);
        setIntField(term1991, term1991.getClass(), "sourcePosition", 0);
        setField(term1991, term1991.getClass(), "jsType", null);
        setField(term1991, term1991.getClass(), "parent", null);
        setField(term1983, term1983.getClass(), "last", term1991);
        setField(term1983, term1983.getClass(), "propListHead", null);
        setIntField(term1983, term1983.getClass(), "sourcePosition", 0);
        setField(term1983, term1983.getClass(), "jsType", null);
        setField(term1983, term1983.getClass(), "parent", null);
        setField(term1981, term1981.getClass(), "next", term1983);
        setIntField(term1995, term1995.getClass(), "type", 0);
        setField(term1995, term1995.getClass(), "next", null);
        setField(term1995, term1995.getClass(), "first", null);
        setField(term1995, term1995.getClass(), "last", null);
        setField(term1995, term1995.getClass(), "propListHead", null);
        setIntField(term1995, term1995.getClass(), "sourcePosition", 0);
        setField(term1995, term1995.getClass(), "jsType", null);
        setField(term1995, term1995.getClass(), "parent", null);
        setField(term1981, term1981.getClass(), "first", term1995);
        setIntField(term1998, term1998.getClass(), "type", 0);
        setField(term1998, term1998.getClass(), "next", null);
        setField(term1998, term1998.getClass(), "first", null);
        setField(term1998, term1998.getClass(), "last", null);
        setField(term1998, term1998.getClass(), "propListHead", null);
        setIntField(term1998, term1998.getClass(), "sourcePosition", 0);
        setField(term1998, term1998.getClass(), "jsType", null);
        setField(term1998, term1998.getClass(), "parent", null);
        setField(term1981, term1981.getClass(), "last", term1998);
        setField(term1981, term1981.getClass(), "propListHead", null);
        setIntField(term1981, term1981.getClass(), "sourcePosition", 0);
        setField(term1981, term1981.getClass(), "jsType", null);
        setField(term1981, term1981.getClass(), "parent", null);
        term14662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14662, term14662.getClass(), "type", -608830309);
        setIntField(term14663, term14663.getClass(), "type", 696225243);
        setIntField(term14664, term14664.getClass(), "type", 0);
        setField(term14664, term14664.getClass(), "next", null);
        setField(term14664, term14664.getClass(), "first", null);
        setField(term14664, term14664.getClass(), "last", null);
        setField(term14664, term14664.getClass(), "propListHead", null);
        setIntField(term14664, term14664.getClass(), "sourcePosition", 0);
        setField(term14664, term14664.getClass(), "jsType", null);
        setField(term14664, term14664.getClass(), "parent", null);
        setField(term14663, term14663.getClass(), "next", term14664);
        setIntField(term14665, term14665.getClass(), "type", 0);
        setField(term14665, term14665.getClass(), "next", null);
        setField(term14665, term14665.getClass(), "first", null);
        setField(term14665, term14665.getClass(), "last", null);
        setField(term14665, term14665.getClass(), "propListHead", null);
        setIntField(term14665, term14665.getClass(), "sourcePosition", 0);
        setField(term14665, term14665.getClass(), "jsType", null);
        setField(term14665, term14665.getClass(), "parent", null);
        setField(term14663, term14663.getClass(), "first", term14665);
        setIntField(term14666, term14666.getClass(), "type", 0);
        setField(term14666, term14666.getClass(), "next", null);
        setField(term14666, term14666.getClass(), "first", null);
        setField(term14666, term14666.getClass(), "last", null);
        setField(term14666, term14666.getClass(), "propListHead", null);
        setIntField(term14666, term14666.getClass(), "sourcePosition", 0);
        setField(term14666, term14666.getClass(), "jsType", null);
        setField(term14666, term14666.getClass(), "parent", null);
        setField(term14663, term14663.getClass(), "last", term14666);
        setField(term14663, term14663.getClass(), "propListHead", null);
        setIntField(term14663, term14663.getClass(), "sourcePosition", 0);
        setField(term14663, term14663.getClass(), "jsType", null);
        setField(term14663, term14663.getClass(), "parent", null);
        setField(term14662, term14662.getClass(), "next", term14663);
        setIntField(term14667, term14667.getClass(), "type", 0);
        setField(term14667, term14667.getClass(), "next", null);
        setField(term14667, term14667.getClass(), "first", null);
        setField(term14667, term14667.getClass(), "last", null);
        setField(term14667, term14667.getClass(), "propListHead", null);
        setIntField(term14667, term14667.getClass(), "sourcePosition", 0);
        setField(term14667, term14667.getClass(), "jsType", null);
        setField(term14667, term14667.getClass(), "parent", null);
        setField(term14662, term14662.getClass(), "first", term14667);
        setIntField(term14668, term14668.getClass(), "type", 0);
        setField(term14668, term14668.getClass(), "next", null);
        setField(term14668, term14668.getClass(), "first", null);
        setField(term14668, term14668.getClass(), "last", null);
        setField(term14668, term14668.getClass(), "propListHead", null);
        setIntField(term14668, term14668.getClass(), "sourcePosition", 0);
        setField(term14668, term14668.getClass(), "jsType", null);
        setField(term14668, term14668.getClass(), "parent", null);
        setField(term14662, term14662.getClass(), "last", term14668);
        setField(term14662, term14662.getClass(), "propListHead", null);
        setIntField(term14662, term14662.getClass(), "sourcePosition", 0);
        setField(term14662, term14662.getClass(), "jsType", null);
        setField(term14662, term14662.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1981;
        args[1] = "LQFpaHEwXR";
        callMethod(klass, "isObjectCallMethod", argTypes, null, args);
        assertTrue(recursiveEquals(term1981, term14662));
    }

};


