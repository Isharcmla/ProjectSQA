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
import java.lang.Object;

public class CodeGenerator_isIndirectEval_8291314677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548;
     Object term549;

    public CodeGenerator_isIndirectEval_8291314677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term548, term548.getClass(), "cc", null);
        setField(term548, term548.getClass(), "outputCharsetEncoder", null);
        term549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term562 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term572 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term549, term549.getClass(), "type", 865208305);
        setIntField(term551, term551.getClass(), "type", -1179120542);
        setIntField(term553, term553.getClass(), "type", 0);
        setField(term553, term553.getClass(), "next", null);
        setField(term553, term553.getClass(), "first", null);
        setField(term553, term553.getClass(), "last", null);
        setField(term553, term553.getClass(), "propListHead", null);
        setIntField(term553, term553.getClass(), "sourcePosition", 0);
        setField(term553, term553.getClass(), "jsType", null);
        setField(term553, term553.getClass(), "parent", null);
        setField(term551, term551.getClass(), "next", term553);
        setIntField(term556, term556.getClass(), "type", 0);
        setField(term556, term556.getClass(), "next", null);
        setField(term556, term556.getClass(), "first", null);
        setField(term556, term556.getClass(), "last", null);
        setField(term556, term556.getClass(), "propListHead", null);
        setIntField(term556, term556.getClass(), "sourcePosition", 0);
        setField(term556, term556.getClass(), "jsType", null);
        setField(term556, term556.getClass(), "parent", null);
        setField(term551, term551.getClass(), "first", term556);
        setIntField(term559, term559.getClass(), "type", 0);
        setField(term559, term559.getClass(), "next", null);
        setField(term559, term559.getClass(), "first", null);
        setField(term559, term559.getClass(), "last", null);
        setField(term559, term559.getClass(), "propListHead", null);
        setIntField(term559, term559.getClass(), "sourcePosition", 0);
        setField(term559, term559.getClass(), "jsType", null);
        setField(term559, term559.getClass(), "parent", null);
        setField(term551, term551.getClass(), "last", term559);
        setField(term562, term562.getClass(), "next", null);
        setIntField(term562, term562.getClass(), "type", 0);
        setIntField(term562, term562.getClass(), "intValue", 0);
        setField(term562, term562.getClass(), "objectValue", null);
        setField(term551, term551.getClass(), "propListHead", term562);
        setIntField(term551, term551.getClass(), "sourcePosition", 1193880199);
        setField(term551, term551.getClass(), "jsType", null);
        setField(term551, term551.getClass(), "parent", null);
        setField(term549, term549.getClass(), "next", term551);
        setIntField(term566, term566.getClass(), "type", 0);
        setField(term566, term566.getClass(), "next", null);
        setField(term566, term566.getClass(), "first", null);
        setField(term566, term566.getClass(), "last", null);
        setField(term566, term566.getClass(), "propListHead", null);
        setIntField(term566, term566.getClass(), "sourcePosition", 0);
        setField(term566, term566.getClass(), "jsType", null);
        setField(term566, term566.getClass(), "parent", null);
        setField(term549, term549.getClass(), "first", term566);
        setIntField(term569, term569.getClass(), "type", 0);
        setField(term569, term569.getClass(), "next", null);
        setField(term569, term569.getClass(), "first", null);
        setField(term569, term569.getClass(), "last", null);
        setField(term569, term569.getClass(), "propListHead", null);
        setIntField(term569, term569.getClass(), "sourcePosition", 0);
        setField(term569, term569.getClass(), "jsType", null);
        setField(term569, term569.getClass(), "parent", null);
        setField(term549, term549.getClass(), "last", term569);
        setField(term572, term572.getClass(), "next", null);
        setIntField(term572, term572.getClass(), "type", 0);
        setIntField(term572, term572.getClass(), "intValue", 0);
        setField(term572, term572.getClass(), "objectValue", null);
        setField(term549, term549.getClass(), "propListHead", term572);
        setIntField(term549, term549.getClass(), "sourcePosition", -1087774327);
        setField(term549, term549.getClass(), "jsType", null);
        setField(term549, term549.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term549;
        callMethod(klass, "isIndirectEval", argTypes, term548, args);
    }

};


