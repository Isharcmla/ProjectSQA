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

public class CodeGenerator_addLeftExpr_164961673842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term947;
     Object term948;
     Object term975;
     Object enum10;

    public CodeGenerator_addLeftExpr_164961673842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term947 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term947, term947.getClass(), "cc", null);
        setField(term947, term947.getClass(), "outputCharsetEncoder", null);
        term948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term948, term948.getClass(), "type", -2095575670);
        setIntField(term950, term950.getClass(), "type", -93135961);
        setIntField(term952, term952.getClass(), "type", 0);
        setField(term952, term952.getClass(), "next", null);
        setField(term952, term952.getClass(), "first", null);
        setField(term952, term952.getClass(), "last", null);
        setField(term952, term952.getClass(), "propListHead", null);
        setIntField(term952, term952.getClass(), "sourcePosition", 0);
        setField(term952, term952.getClass(), "jsType", null);
        setField(term952, term952.getClass(), "parent", null);
        setField(term950, term950.getClass(), "next", term952);
        setIntField(term955, term955.getClass(), "type", 0);
        setField(term955, term955.getClass(), "next", null);
        setField(term955, term955.getClass(), "first", null);
        setField(term955, term955.getClass(), "last", null);
        setField(term955, term955.getClass(), "propListHead", null);
        setIntField(term955, term955.getClass(), "sourcePosition", 0);
        setField(term955, term955.getClass(), "jsType", null);
        setField(term955, term955.getClass(), "parent", null);
        setField(term950, term950.getClass(), "first", term955);
        setIntField(term958, term958.getClass(), "type", 0);
        setField(term958, term958.getClass(), "next", null);
        setField(term958, term958.getClass(), "first", null);
        setField(term958, term958.getClass(), "last", null);
        setField(term958, term958.getClass(), "propListHead", null);
        setIntField(term958, term958.getClass(), "sourcePosition", 0);
        setField(term958, term958.getClass(), "jsType", null);
        setField(term958, term958.getClass(), "parent", null);
        setField(term950, term950.getClass(), "last", term958);
        setField(term961, term961.getClass(), "next", null);
        setIntField(term961, term961.getClass(), "type", 0);
        setIntField(term961, term961.getClass(), "intValue", 0);
        setField(term961, term961.getClass(), "objectValue", null);
        setField(term950, term950.getClass(), "propListHead", term961);
        setIntField(term950, term950.getClass(), "sourcePosition", 287287233);
        setField(term950, term950.getClass(), "jsType", null);
        setField(term950, term950.getClass(), "parent", null);
        setField(term948, term948.getClass(), "next", term950);
        setIntField(term965, term965.getClass(), "type", 0);
        setField(term965, term965.getClass(), "next", null);
        setField(term965, term965.getClass(), "first", null);
        setField(term965, term965.getClass(), "last", null);
        setField(term965, term965.getClass(), "propListHead", null);
        setIntField(term965, term965.getClass(), "sourcePosition", 0);
        setField(term965, term965.getClass(), "jsType", null);
        setField(term965, term965.getClass(), "parent", null);
        setField(term948, term948.getClass(), "first", term965);
        setIntField(term968, term968.getClass(), "type", 0);
        setField(term968, term968.getClass(), "next", null);
        setField(term968, term968.getClass(), "first", null);
        setField(term968, term968.getClass(), "last", null);
        setField(term968, term968.getClass(), "propListHead", null);
        setIntField(term968, term968.getClass(), "sourcePosition", 0);
        setField(term968, term968.getClass(), "jsType", null);
        setField(term968, term968.getClass(), "parent", null);
        setField(term948, term948.getClass(), "last", term968);
        setField(term971, term971.getClass(), "next", null);
        setIntField(term971, term971.getClass(), "type", 0);
        setIntField(term971, term971.getClass(), "intValue", 0);
        setField(term971, term971.getClass(), "objectValue", null);
        setField(term948, term948.getClass(), "propListHead", term971);
        setIntField(term948, term948.getClass(), "sourcePosition", 962840079);
        setField(term948, term948.getClass(), "jsType", null);
        setField(term948, term948.getClass(), "parent", null);
        term975 = new Integer(1540719661);
        Class<? extends Object> term6101 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term6100 = ((Class) term6101).getDeclaredField((String) "IN_FOR_INIT_CLAUSE");
        ((Field) term6100).setAccessible(true);
        enum10 = ((Field) term6100).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term948;
        args[1] = term975;
        args[2] = enum10;
        try {
            callMethod(klass, "addLeftExpr", argTypes, term947, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


