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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_addLeftExpr_164961673846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991;
     Object term992;
     Object term1019;
     Object enum10;

    public CodeGenerator_addLeftExpr_164961673846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term991 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term991, term991.getClass(), "cc", null);
        setField(term991, term991.getClass(), "outputCharsetEncoder", null);
        term992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1005 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1015 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term992, term992.getClass(), "type", -2095575670);
        setIntField(term994, term994.getClass(), "type", -93135961);
        setIntField(term996, term996.getClass(), "type", 0);
        setField(term996, term996.getClass(), "next", null);
        setField(term996, term996.getClass(), "first", null);
        setField(term996, term996.getClass(), "last", null);
        setField(term996, term996.getClass(), "propListHead", null);
        setIntField(term996, term996.getClass(), "sourcePosition", 0);
        setField(term996, term996.getClass(), "jsType", null);
        setField(term996, term996.getClass(), "parent", null);
        setField(term994, term994.getClass(), "next", term996);
        setIntField(term999, term999.getClass(), "type", 0);
        setField(term999, term999.getClass(), "next", null);
        setField(term999, term999.getClass(), "first", null);
        setField(term999, term999.getClass(), "last", null);
        setField(term999, term999.getClass(), "propListHead", null);
        setIntField(term999, term999.getClass(), "sourcePosition", 0);
        setField(term999, term999.getClass(), "jsType", null);
        setField(term999, term999.getClass(), "parent", null);
        setField(term994, term994.getClass(), "first", term999);
        setIntField(term1002, term1002.getClass(), "type", 0);
        setField(term1002, term1002.getClass(), "next", null);
        setField(term1002, term1002.getClass(), "first", null);
        setField(term1002, term1002.getClass(), "last", null);
        setField(term1002, term1002.getClass(), "propListHead", null);
        setIntField(term1002, term1002.getClass(), "sourcePosition", 0);
        setField(term1002, term1002.getClass(), "jsType", null);
        setField(term1002, term1002.getClass(), "parent", null);
        setField(term994, term994.getClass(), "last", term1002);
        setField(term1005, term1005.getClass(), "next", null);
        setIntField(term1005, term1005.getClass(), "type", 0);
        setIntField(term1005, term1005.getClass(), "intValue", 0);
        setField(term1005, term1005.getClass(), "objectValue", null);
        setField(term994, term994.getClass(), "propListHead", term1005);
        setIntField(term994, term994.getClass(), "sourcePosition", 287287233);
        setField(term994, term994.getClass(), "jsType", null);
        setField(term994, term994.getClass(), "parent", null);
        setField(term992, term992.getClass(), "next", term994);
        setIntField(term1009, term1009.getClass(), "type", 0);
        setField(term1009, term1009.getClass(), "next", null);
        setField(term1009, term1009.getClass(), "first", null);
        setField(term1009, term1009.getClass(), "last", null);
        setField(term1009, term1009.getClass(), "propListHead", null);
        setIntField(term1009, term1009.getClass(), "sourcePosition", 0);
        setField(term1009, term1009.getClass(), "jsType", null);
        setField(term1009, term1009.getClass(), "parent", null);
        setField(term992, term992.getClass(), "first", term1009);
        setIntField(term1012, term1012.getClass(), "type", 0);
        setField(term1012, term1012.getClass(), "next", null);
        setField(term1012, term1012.getClass(), "first", null);
        setField(term1012, term1012.getClass(), "last", null);
        setField(term1012, term1012.getClass(), "propListHead", null);
        setIntField(term1012, term1012.getClass(), "sourcePosition", 0);
        setField(term1012, term1012.getClass(), "jsType", null);
        setField(term1012, term1012.getClass(), "parent", null);
        setField(term992, term992.getClass(), "last", term1012);
        setField(term1015, term1015.getClass(), "next", null);
        setIntField(term1015, term1015.getClass(), "type", 0);
        setIntField(term1015, term1015.getClass(), "intValue", 0);
        setField(term1015, term1015.getClass(), "objectValue", null);
        setField(term992, term992.getClass(), "propListHead", term1015);
        setIntField(term992, term992.getClass(), "sourcePosition", 962840079);
        setField(term992, term992.getClass(), "jsType", null);
        setField(term992, term992.getClass(), "parent", null);
        term1019 = new Integer(1540719661);
        Class<? extends Object> term6183 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term6182 = ((Class) term6183).getDeclaredField((String) "IN_FOR_INIT_CLAUSE");
        ((Field) term6182).setAccessible(true);
        enum10 = ((Field) term6182).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term992;
        args[1] = term1019;
        args[2] = enum10;
        try {
            callMethod(klass, "addLeftExpr", argTypes, term991, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


