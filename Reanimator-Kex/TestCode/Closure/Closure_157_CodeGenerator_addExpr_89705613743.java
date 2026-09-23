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

public class CodeGenerator_addExpr_89705613743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310;
     Object term1311;
     Object term1338;

    public CodeGenerator_addExpr_89705613743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1310 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1310, term1310.getClass(), "cc", null);
        setField(term1310, term1310.getClass(), "outputCharsetEncoder", null);
        term1311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1324 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1334 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1311, term1311.getClass(), "type", -2027534003);
        setIntField(term1313, term1313.getClass(), "type", 972867650);
        setIntField(term1315, term1315.getClass(), "type", 0);
        setField(term1315, term1315.getClass(), "next", null);
        setField(term1315, term1315.getClass(), "first", null);
        setField(term1315, term1315.getClass(), "last", null);
        setField(term1315, term1315.getClass(), "propListHead", null);
        setIntField(term1315, term1315.getClass(), "sourcePosition", 0);
        setField(term1315, term1315.getClass(), "jsType", null);
        setField(term1315, term1315.getClass(), "parent", null);
        setField(term1313, term1313.getClass(), "next", term1315);
        setIntField(term1318, term1318.getClass(), "type", 0);
        setField(term1318, term1318.getClass(), "next", null);
        setField(term1318, term1318.getClass(), "first", null);
        setField(term1318, term1318.getClass(), "last", null);
        setField(term1318, term1318.getClass(), "propListHead", null);
        setIntField(term1318, term1318.getClass(), "sourcePosition", 0);
        setField(term1318, term1318.getClass(), "jsType", null);
        setField(term1318, term1318.getClass(), "parent", null);
        setField(term1313, term1313.getClass(), "first", term1318);
        setIntField(term1321, term1321.getClass(), "type", 0);
        setField(term1321, term1321.getClass(), "next", null);
        setField(term1321, term1321.getClass(), "first", null);
        setField(term1321, term1321.getClass(), "last", null);
        setField(term1321, term1321.getClass(), "propListHead", null);
        setIntField(term1321, term1321.getClass(), "sourcePosition", 0);
        setField(term1321, term1321.getClass(), "jsType", null);
        setField(term1321, term1321.getClass(), "parent", null);
        setField(term1313, term1313.getClass(), "last", term1321);
        setField(term1324, term1324.getClass(), "next", null);
        setIntField(term1324, term1324.getClass(), "type", 0);
        setIntField(term1324, term1324.getClass(), "intValue", 0);
        setField(term1324, term1324.getClass(), "objectValue", null);
        setField(term1313, term1313.getClass(), "propListHead", term1324);
        setIntField(term1313, term1313.getClass(), "sourcePosition", 1240914516);
        setField(term1313, term1313.getClass(), "jsType", null);
        setField(term1313, term1313.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "next", term1313);
        setIntField(term1328, term1328.getClass(), "type", 0);
        setField(term1328, term1328.getClass(), "next", null);
        setField(term1328, term1328.getClass(), "first", null);
        setField(term1328, term1328.getClass(), "last", null);
        setField(term1328, term1328.getClass(), "propListHead", null);
        setIntField(term1328, term1328.getClass(), "sourcePosition", 0);
        setField(term1328, term1328.getClass(), "jsType", null);
        setField(term1328, term1328.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "first", term1328);
        setIntField(term1331, term1331.getClass(), "type", 0);
        setField(term1331, term1331.getClass(), "next", null);
        setField(term1331, term1331.getClass(), "first", null);
        setField(term1331, term1331.getClass(), "last", null);
        setField(term1331, term1331.getClass(), "propListHead", null);
        setIntField(term1331, term1331.getClass(), "sourcePosition", 0);
        setField(term1331, term1331.getClass(), "jsType", null);
        setField(term1331, term1331.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "last", term1331);
        setField(term1334, term1334.getClass(), "next", null);
        setIntField(term1334, term1334.getClass(), "type", 0);
        setIntField(term1334, term1334.getClass(), "intValue", 0);
        setField(term1334, term1334.getClass(), "objectValue", null);
        setField(term1311, term1311.getClass(), "propListHead", term1334);
        setIntField(term1311, term1311.getClass(), "sourcePosition", -1465035361);
        setField(term1311, term1311.getClass(), "jsType", null);
        setField(term1311, term1311.getClass(), "parent", null);
        term1338 = new Integer(1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1311;
        args[1] = term1338;
        try {
            callMethod(klass, "addExpr", argTypes, term1310, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


