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

public class TypeCheck_ensureTyped_103120306351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97339;
     Object term97409;
     Object term97633;
     Object term97634;

    public TypeCheck_ensureTyped_103120306351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97339 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term97409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97505 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term97601 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term97409, term97409.getClass(), "type", -106);
        setIntField(term97505, term97505.getClass(), "type", -30);
        setIntField(term97601, term97601.getClass(), "type", 29);
        setField(term97505, term97505.getClass(), "next", term97601);
        setField(term97409, term97409.getClass(), "propListHead", term97505);
        term97633 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term97633, term97633.getClass(), "compiler", null);
        setField(term97633, term97633.getClass(), "validator", null);
        setField(term97633, term97633.getClass(), "reverseInterpreter", null);
        setField(term97633, term97633.getClass(), "typeRegistry", null);
        setField(term97633, term97633.getClass(), "topScope", null);
        setField(term97633, term97633.getClass(), "scopeCreator", null);
        setField(term97633, term97633.getClass(), "reportMissingOverride", null);
        setField(term97633, term97633.getClass(), "reportUnknownTypes", null);
        setBooleanField(term97633, term97633.getClass(), "reportMissingProperties", false);
        setField(term97633, term97633.getClass(), "inferJSDocInfo", null);
        setIntField(term97633, term97633.getClass(), "typedCount", 0);
        setIntField(term97633, term97633.getClass(), "nullCount", 0);
        setIntField(term97633, term97633.getClass(), "unknownCount", 0);
        setBooleanField(term97633, term97633.getClass(), "inExterns", false);
        setIntField(term97633, term97633.getClass(), "noTypeCheckSection", 0);
        term97634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97635 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term97636 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term97634, term97634.getClass(), "type", -106);
        setField(term97634, term97634.getClass(), "next", null);
        setField(term97634, term97634.getClass(), "first", null);
        setField(term97634, term97634.getClass(), "last", null);
        setField(term97636, term97636.getClass(), "next", null);
        setIntField(term97636, term97636.getClass(), "type", 29);
        setIntField(term97636, term97636.getClass(), "intValue", 0);
        setField(term97636, term97636.getClass(), "objectValue", null);
        setField(term97635, term97635.getClass(), "next", term97636);
        setIntField(term97635, term97635.getClass(), "type", -30);
        setIntField(term97635, term97635.getClass(), "intValue", 0);
        setField(term97635, term97635.getClass(), "objectValue", null);
        setField(term97634, term97634.getClass(), "propListHead", term97635);
        setIntField(term97634, term97634.getClass(), "sourcePosition", 0);
        setField(term97634, term97634.getClass(), "jsType", null);
        setField(term97634, term97634.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term97409;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term97339, args);
        assertTrue(recursiveEquals(term97339, term97633));
        assertTrue(recursiveEquals(term97409, null));
    }

};


