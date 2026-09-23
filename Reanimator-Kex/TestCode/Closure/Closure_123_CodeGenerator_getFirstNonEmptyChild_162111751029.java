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
     Object term15698;

    public CodeGenerator_getFirstNonEmptyChild_162111751029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15698, term15698.getClass(), "type", 1598895173);
        setIntField(term15700, term15700.getClass(), "type", 1830648570);
        setIntField(term15702, term15702.getClass(), "type", -227365013);
        setIntField(term15704, term15704.getClass(), "type", 11724947);
        setIntField(term15706, term15706.getClass(), "type", 1953277050);
        setField(term15706, term15706.getClass(), "next", null);
        setField(term15706, term15706.getClass(), "first", null);
        setField(term15706, term15706.getClass(), "last", null);
        setField(term15706, term15706.getClass(), "propListHead", null);
        setIntField(term15706, term15706.getClass(), "sourcePosition", 0);
        setField(term15706, term15706.getClass(), "jsType", null);
        setField(term15706, term15706.getClass(), "parent", null);
        setField(term15704, term15704.getClass(), "next", term15706);
        setIntField(term15709, term15709.getClass(), "type", 1283079251);
        setField(term15709, term15709.getClass(), "next", null);
        setField(term15709, term15709.getClass(), "first", null);
        setField(term15709, term15709.getClass(), "last", term15706);
        setField(term15709, term15709.getClass(), "propListHead", null);
        setIntField(term15709, term15709.getClass(), "sourcePosition", 0);
        setField(term15709, term15709.getClass(), "jsType", null);
        setField(term15709, term15709.getClass(), "parent", null);
        setField(term15704, term15704.getClass(), "first", term15709);
        setField(term15704, term15704.getClass(), "last", term15702);
        setField(term15704, term15704.getClass(), "propListHead", null);
        setIntField(term15704, term15704.getClass(), "sourcePosition", 0);
        setField(term15704, term15704.getClass(), "jsType", null);
        setField(term15704, term15704.getClass(), "parent", null);
        setField(term15702, term15702.getClass(), "next", term15704);
        setField(term15702, term15702.getClass(), "first", term15706);
        setIntField(term15713, term15713.getClass(), "type", 1398204340);
        setIntField(term15715, term15715.getClass(), "type", 229204365);
        setField(term15715, term15715.getClass(), "next", null);
        setField(term15715, term15715.getClass(), "first", term15709);
        setField(term15715, term15715.getClass(), "last", term15704);
        setField(term15715, term15715.getClass(), "propListHead", null);
        setIntField(term15715, term15715.getClass(), "sourcePosition", 0);
        setField(term15715, term15715.getClass(), "jsType", null);
        setField(term15715, term15715.getClass(), "parent", null);
        setField(term15713, term15713.getClass(), "next", term15715);
        setField(term15713, term15713.getClass(), "first", term15700);
        setField(term15713, term15713.getClass(), "last", term15700);
        setField(term15713, term15713.getClass(), "propListHead", null);
        setIntField(term15713, term15713.getClass(), "sourcePosition", 0);
        setField(term15713, term15713.getClass(), "jsType", null);
        setField(term15713, term15713.getClass(), "parent", null);
        setField(term15702, term15702.getClass(), "last", term15713);
        setField(term15702, term15702.getClass(), "propListHead", null);
        setIntField(term15702, term15702.getClass(), "sourcePosition", 0);
        setField(term15702, term15702.getClass(), "jsType", null);
        setField(term15702, term15702.getClass(), "parent", null);
        setField(term15700, term15700.getClass(), "next", term15702);
        setIntField(term15720, term15720.getClass(), "type", -461771056);
        setField(term15720, term15720.getClass(), "next", term15713);
        setField(term15720, term15720.getClass(), "first", term15715);
        setField(term15720, term15720.getClass(), "last", term15698);
        setField(term15720, term15720.getClass(), "propListHead", null);
        setIntField(term15720, term15720.getClass(), "sourcePosition", 0);
        setField(term15720, term15720.getClass(), "jsType", null);
        setField(term15720, term15720.getClass(), "parent", null);
        setField(term15700, term15700.getClass(), "first", term15720);
        setField(term15700, term15700.getClass(), "last", term15720);
        setField(term15700, term15700.getClass(), "propListHead", null);
        setIntField(term15700, term15700.getClass(), "sourcePosition", 0);
        setField(term15700, term15700.getClass(), "jsType", null);
        setField(term15700, term15700.getClass(), "parent", null);
        setField(term15698, term15698.getClass(), "next", term15700);
        setField(term15698, term15698.getClass(), "first", term15704);
        setField(term15698, term15698.getClass(), "last", term15706);
        setField(term15698, term15698.getClass(), "propListHead", null);
        setIntField(term15698, term15698.getClass(), "sourcePosition", 0);
        setField(term15698, term15698.getClass(), "jsType", null);
        setField(term15698, term15698.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15698;
        callMethod(klass, "getFirstNonEmptyChild", argTypes, null, args);
    }

};


