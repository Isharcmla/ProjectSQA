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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_isIndirectEval_8291314679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642;
     Object term653;

    public CodeGenerator_isIndirectEval_8291314679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term643 = new HashMap();
        term642 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term642, term642.getClass(), "ESCAPED_JS_STRINGS", term643);
        setField(term642, term642.getClass(), "cc", null);
        setField(term642, term642.getClass(), "outputCharsetEncoder", null);
        term653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term666 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term676 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term653, term653.getClass(), "type", 865208305);
        setIntField(term655, term655.getClass(), "type", -1179120542);
        setIntField(term657, term657.getClass(), "type", 0);
        setField(term657, term657.getClass(), "next", null);
        setField(term657, term657.getClass(), "first", null);
        setField(term657, term657.getClass(), "last", null);
        setField(term657, term657.getClass(), "propListHead", null);
        setIntField(term657, term657.getClass(), "sourcePosition", 0);
        setField(term657, term657.getClass(), "jsType", null);
        setField(term657, term657.getClass(), "parent", null);
        setField(term655, term655.getClass(), "next", term657);
        setIntField(term660, term660.getClass(), "type", 0);
        setField(term660, term660.getClass(), "next", null);
        setField(term660, term660.getClass(), "first", null);
        setField(term660, term660.getClass(), "last", null);
        setField(term660, term660.getClass(), "propListHead", null);
        setIntField(term660, term660.getClass(), "sourcePosition", 0);
        setField(term660, term660.getClass(), "jsType", null);
        setField(term660, term660.getClass(), "parent", null);
        setField(term655, term655.getClass(), "first", term660);
        setIntField(term663, term663.getClass(), "type", 0);
        setField(term663, term663.getClass(), "next", null);
        setField(term663, term663.getClass(), "first", null);
        setField(term663, term663.getClass(), "last", null);
        setField(term663, term663.getClass(), "propListHead", null);
        setIntField(term663, term663.getClass(), "sourcePosition", 0);
        setField(term663, term663.getClass(), "jsType", null);
        setField(term663, term663.getClass(), "parent", null);
        setField(term655, term655.getClass(), "last", term663);
        setField(term666, term666.getClass(), "next", null);
        setIntField(term666, term666.getClass(), "type", 0);
        setIntField(term666, term666.getClass(), "intValue", 0);
        setField(term666, term666.getClass(), "objectValue", null);
        setField(term655, term655.getClass(), "propListHead", term666);
        setIntField(term655, term655.getClass(), "sourcePosition", 1193880199);
        setField(term655, term655.getClass(), "jsType", null);
        setField(term655, term655.getClass(), "parent", null);
        setField(term653, term653.getClass(), "next", term655);
        setIntField(term670, term670.getClass(), "type", 0);
        setField(term670, term670.getClass(), "next", null);
        setField(term670, term670.getClass(), "first", null);
        setField(term670, term670.getClass(), "last", null);
        setField(term670, term670.getClass(), "propListHead", null);
        setIntField(term670, term670.getClass(), "sourcePosition", 0);
        setField(term670, term670.getClass(), "jsType", null);
        setField(term670, term670.getClass(), "parent", null);
        setField(term653, term653.getClass(), "first", term670);
        setIntField(term673, term673.getClass(), "type", 0);
        setField(term673, term673.getClass(), "next", null);
        setField(term673, term673.getClass(), "first", null);
        setField(term673, term673.getClass(), "last", null);
        setField(term673, term673.getClass(), "propListHead", null);
        setIntField(term673, term673.getClass(), "sourcePosition", 0);
        setField(term673, term673.getClass(), "jsType", null);
        setField(term673, term673.getClass(), "parent", null);
        setField(term653, term653.getClass(), "last", term673);
        setField(term676, term676.getClass(), "next", null);
        setIntField(term676, term676.getClass(), "type", 0);
        setIntField(term676, term676.getClass(), "intValue", 0);
        setField(term676, term676.getClass(), "objectValue", null);
        setField(term653, term653.getClass(), "propListHead", term676);
        setIntField(term653, term653.getClass(), "sourcePosition", -1087774327);
        setField(term653, term653.getClass(), "jsType", null);
        setField(term653, term653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term653;
        callMethod(klass, "isIndirectEval", argTypes, term642, args);
    }

};


