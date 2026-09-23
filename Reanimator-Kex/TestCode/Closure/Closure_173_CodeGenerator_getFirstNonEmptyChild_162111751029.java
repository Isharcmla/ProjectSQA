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

public class CodeGenerator_getFirstNonEmptyChild_162111751029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15701;

    public CodeGenerator_getFirstNonEmptyChild_162111751029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15701, term15701.getClass(), "type", 1598895173);
        setIntField(term15703, term15703.getClass(), "type", 1830648570);
        setIntField(term15705, term15705.getClass(), "type", -227365013);
        setIntField(term15707, term15707.getClass(), "type", 11724947);
        setIntField(term15709, term15709.getClass(), "type", 1953277050);
        setField(term15709, term15709.getClass(), "next", null);
        setField(term15709, term15709.getClass(), "first", null);
        setField(term15709, term15709.getClass(), "last", null);
        setField(term15709, term15709.getClass(), "propListHead", null);
        setIntField(term15709, term15709.getClass(), "sourcePosition", 0);
        setField(term15709, term15709.getClass(), "jsType", null);
        setField(term15709, term15709.getClass(), "parent", null);
        setField(term15707, term15707.getClass(), "next", term15709);
        setIntField(term15712, term15712.getClass(), "type", 1283079251);
        setField(term15712, term15712.getClass(), "next", null);
        setField(term15712, term15712.getClass(), "first", null);
        setField(term15712, term15712.getClass(), "last", term15709);
        setField(term15712, term15712.getClass(), "propListHead", null);
        setIntField(term15712, term15712.getClass(), "sourcePosition", 0);
        setField(term15712, term15712.getClass(), "jsType", null);
        setField(term15712, term15712.getClass(), "parent", null);
        setField(term15707, term15707.getClass(), "first", term15712);
        setField(term15707, term15707.getClass(), "last", term15705);
        setField(term15707, term15707.getClass(), "propListHead", null);
        setIntField(term15707, term15707.getClass(), "sourcePosition", 0);
        setField(term15707, term15707.getClass(), "jsType", null);
        setField(term15707, term15707.getClass(), "parent", null);
        setField(term15705, term15705.getClass(), "next", term15707);
        setField(term15705, term15705.getClass(), "first", term15709);
        setIntField(term15716, term15716.getClass(), "type", 1398204340);
        setIntField(term15718, term15718.getClass(), "type", 229204365);
        setField(term15718, term15718.getClass(), "next", null);
        setField(term15718, term15718.getClass(), "first", term15712);
        setField(term15718, term15718.getClass(), "last", term15707);
        setField(term15718, term15718.getClass(), "propListHead", null);
        setIntField(term15718, term15718.getClass(), "sourcePosition", 0);
        setField(term15718, term15718.getClass(), "jsType", null);
        setField(term15718, term15718.getClass(), "parent", null);
        setField(term15716, term15716.getClass(), "next", term15718);
        setField(term15716, term15716.getClass(), "first", term15703);
        setField(term15716, term15716.getClass(), "last", term15703);
        setField(term15716, term15716.getClass(), "propListHead", null);
        setIntField(term15716, term15716.getClass(), "sourcePosition", 0);
        setField(term15716, term15716.getClass(), "jsType", null);
        setField(term15716, term15716.getClass(), "parent", null);
        setField(term15705, term15705.getClass(), "last", term15716);
        setField(term15705, term15705.getClass(), "propListHead", null);
        setIntField(term15705, term15705.getClass(), "sourcePosition", 0);
        setField(term15705, term15705.getClass(), "jsType", null);
        setField(term15705, term15705.getClass(), "parent", null);
        setField(term15703, term15703.getClass(), "next", term15705);
        setIntField(term15723, term15723.getClass(), "type", -461771056);
        setField(term15723, term15723.getClass(), "next", term15716);
        setField(term15723, term15723.getClass(), "first", term15718);
        setField(term15723, term15723.getClass(), "last", term15701);
        setField(term15723, term15723.getClass(), "propListHead", null);
        setIntField(term15723, term15723.getClass(), "sourcePosition", 0);
        setField(term15723, term15723.getClass(), "jsType", null);
        setField(term15723, term15723.getClass(), "parent", null);
        setField(term15703, term15703.getClass(), "first", term15723);
        setField(term15703, term15703.getClass(), "last", term15723);
        setField(term15703, term15703.getClass(), "propListHead", null);
        setIntField(term15703, term15703.getClass(), "sourcePosition", 0);
        setField(term15703, term15703.getClass(), "jsType", null);
        setField(term15703, term15703.getClass(), "parent", null);
        setField(term15701, term15701.getClass(), "next", term15703);
        setField(term15701, term15701.getClass(), "first", term15707);
        setField(term15701, term15701.getClass(), "last", term15709);
        setField(term15701, term15701.getClass(), "propListHead", null);
        setIntField(term15701, term15701.getClass(), "sourcePosition", 0);
        setField(term15701, term15701.getClass(), "jsType", null);
        setField(term15701, term15701.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15701;
        callMethod(klass, "getFirstNonEmptyChild", argTypes, null, args);
    }

};


