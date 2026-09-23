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

public class NodeUtil_isVar_896854502157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978;
     Object term8733;

    public NodeUtil_isVar_896854502157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term991 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1001 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term978, term978.getClass(), "type", 765731371);
        setIntField(term980, term980.getClass(), "type", -1941343035);
        setIntField(term982, term982.getClass(), "type", 0);
        setField(term982, term982.getClass(), "next", null);
        setField(term982, term982.getClass(), "first", null);
        setField(term982, term982.getClass(), "last", null);
        setField(term982, term982.getClass(), "propListHead", null);
        setIntField(term982, term982.getClass(), "sourcePosition", 0);
        setField(term982, term982.getClass(), "jsType", null);
        setField(term982, term982.getClass(), "parent", null);
        setField(term980, term980.getClass(), "next", term982);
        setIntField(term985, term985.getClass(), "type", 0);
        setField(term985, term985.getClass(), "next", null);
        setField(term985, term985.getClass(), "first", null);
        setField(term985, term985.getClass(), "last", null);
        setField(term985, term985.getClass(), "propListHead", null);
        setIntField(term985, term985.getClass(), "sourcePosition", 0);
        setField(term985, term985.getClass(), "jsType", null);
        setField(term985, term985.getClass(), "parent", null);
        setField(term980, term980.getClass(), "first", term985);
        setIntField(term988, term988.getClass(), "type", 0);
        setField(term988, term988.getClass(), "next", null);
        setField(term988, term988.getClass(), "first", null);
        setField(term988, term988.getClass(), "last", null);
        setField(term988, term988.getClass(), "propListHead", null);
        setIntField(term988, term988.getClass(), "sourcePosition", 0);
        setField(term988, term988.getClass(), "jsType", null);
        setField(term988, term988.getClass(), "parent", null);
        setField(term980, term980.getClass(), "last", term988);
        setField(term991, term991.getClass(), "next", null);
        setIntField(term991, term991.getClass(), "type", 0);
        setIntField(term991, term991.getClass(), "intValue", 0);
        setField(term991, term991.getClass(), "objectValue", null);
        setField(term980, term980.getClass(), "propListHead", term991);
        setIntField(term980, term980.getClass(), "sourcePosition", -1748391876);
        setField(term980, term980.getClass(), "jsType", null);
        setField(term980, term980.getClass(), "parent", null);
        setField(term978, term978.getClass(), "next", term980);
        setIntField(term995, term995.getClass(), "type", 0);
        setField(term995, term995.getClass(), "next", null);
        setField(term995, term995.getClass(), "first", null);
        setField(term995, term995.getClass(), "last", null);
        setField(term995, term995.getClass(), "propListHead", null);
        setIntField(term995, term995.getClass(), "sourcePosition", 0);
        setField(term995, term995.getClass(), "jsType", null);
        setField(term995, term995.getClass(), "parent", null);
        setField(term978, term978.getClass(), "first", term995);
        setIntField(term998, term998.getClass(), "type", 0);
        setField(term998, term998.getClass(), "next", null);
        setField(term998, term998.getClass(), "first", null);
        setField(term998, term998.getClass(), "last", null);
        setField(term998, term998.getClass(), "propListHead", null);
        setIntField(term998, term998.getClass(), "sourcePosition", 0);
        setField(term998, term998.getClass(), "jsType", null);
        setField(term998, term998.getClass(), "parent", null);
        setField(term978, term978.getClass(), "last", term998);
        setField(term1001, term1001.getClass(), "next", null);
        setIntField(term1001, term1001.getClass(), "type", 0);
        setIntField(term1001, term1001.getClass(), "intValue", 0);
        setField(term1001, term1001.getClass(), "objectValue", null);
        setField(term978, term978.getClass(), "propListHead", term1001);
        setIntField(term978, term978.getClass(), "sourcePosition", 43258317);
        setField(term978, term978.getClass(), "jsType", null);
        setField(term978, term978.getClass(), "parent", null);
        term8733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8738 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8741 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8733, term8733.getClass(), "type", 765731371);
        setIntField(term8734, term8734.getClass(), "type", -1941343035);
        setIntField(term8735, term8735.getClass(), "type", 0);
        setField(term8735, term8735.getClass(), "next", null);
        setField(term8735, term8735.getClass(), "first", null);
        setField(term8735, term8735.getClass(), "last", null);
        setField(term8735, term8735.getClass(), "propListHead", null);
        setIntField(term8735, term8735.getClass(), "sourcePosition", 0);
        setField(term8735, term8735.getClass(), "jsType", null);
        setField(term8735, term8735.getClass(), "parent", null);
        setField(term8734, term8734.getClass(), "next", term8735);
        setIntField(term8736, term8736.getClass(), "type", 0);
        setField(term8736, term8736.getClass(), "next", null);
        setField(term8736, term8736.getClass(), "first", null);
        setField(term8736, term8736.getClass(), "last", null);
        setField(term8736, term8736.getClass(), "propListHead", null);
        setIntField(term8736, term8736.getClass(), "sourcePosition", 0);
        setField(term8736, term8736.getClass(), "jsType", null);
        setField(term8736, term8736.getClass(), "parent", null);
        setField(term8734, term8734.getClass(), "first", term8736);
        setIntField(term8737, term8737.getClass(), "type", 0);
        setField(term8737, term8737.getClass(), "next", null);
        setField(term8737, term8737.getClass(), "first", null);
        setField(term8737, term8737.getClass(), "last", null);
        setField(term8737, term8737.getClass(), "propListHead", null);
        setIntField(term8737, term8737.getClass(), "sourcePosition", 0);
        setField(term8737, term8737.getClass(), "jsType", null);
        setField(term8737, term8737.getClass(), "parent", null);
        setField(term8734, term8734.getClass(), "last", term8737);
        setField(term8738, term8738.getClass(), "next", null);
        setIntField(term8738, term8738.getClass(), "type", 0);
        setIntField(term8738, term8738.getClass(), "intValue", 0);
        setField(term8738, term8738.getClass(), "objectValue", null);
        setField(term8734, term8734.getClass(), "propListHead", term8738);
        setIntField(term8734, term8734.getClass(), "sourcePosition", -1748391876);
        setField(term8734, term8734.getClass(), "jsType", null);
        setField(term8734, term8734.getClass(), "parent", null);
        setField(term8733, term8733.getClass(), "next", term8734);
        setIntField(term8739, term8739.getClass(), "type", 0);
        setField(term8739, term8739.getClass(), "next", null);
        setField(term8739, term8739.getClass(), "first", null);
        setField(term8739, term8739.getClass(), "last", null);
        setField(term8739, term8739.getClass(), "propListHead", null);
        setIntField(term8739, term8739.getClass(), "sourcePosition", 0);
        setField(term8739, term8739.getClass(), "jsType", null);
        setField(term8739, term8739.getClass(), "parent", null);
        setField(term8733, term8733.getClass(), "first", term8739);
        setIntField(term8740, term8740.getClass(), "type", 0);
        setField(term8740, term8740.getClass(), "next", null);
        setField(term8740, term8740.getClass(), "first", null);
        setField(term8740, term8740.getClass(), "last", null);
        setField(term8740, term8740.getClass(), "propListHead", null);
        setIntField(term8740, term8740.getClass(), "sourcePosition", 0);
        setField(term8740, term8740.getClass(), "jsType", null);
        setField(term8740, term8740.getClass(), "parent", null);
        setField(term8733, term8733.getClass(), "last", term8740);
        setField(term8741, term8741.getClass(), "next", null);
        setIntField(term8741, term8741.getClass(), "type", 0);
        setIntField(term8741, term8741.getClass(), "intValue", 0);
        setField(term8741, term8741.getClass(), "objectValue", null);
        setField(term8733, term8733.getClass(), "propListHead", term8741);
        setIntField(term8733, term8733.getClass(), "sourcePosition", 43258317);
        setField(term8733, term8733.getClass(), "jsType", null);
        setField(term8733, term8733.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term978;
        Object retValue = callMethod(klass, "isVar", argTypes, null, args);
        assertTrue(recursiveEquals(term978, term8733));
        assertTrue(recursiveEquals(retValue, false));
    }

};


