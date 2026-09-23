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

public class CodeGenerator_getFirstNonEmptyChild_162111751028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2963;

    public CodeGenerator_getFirstNonEmptyChild_162111751028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2963, term2963.getClass(), "type", 1598895173);
        setIntField(term2965, term2965.getClass(), "type", 1830648570);
        setIntField(term2967, term2967.getClass(), "type", -227365013);
        setIntField(term2969, term2969.getClass(), "type", 11724947);
        setIntField(term2971, term2971.getClass(), "type", 1953277050);
        setField(term2971, term2971.getClass(), "next", null);
        setField(term2971, term2971.getClass(), "first", null);
        setField(term2971, term2971.getClass(), "last", null);
        setField(term2971, term2971.getClass(), "propListHead", null);
        setIntField(term2971, term2971.getClass(), "sourcePosition", 0);
        setField(term2971, term2971.getClass(), "jsType", null);
        setField(term2971, term2971.getClass(), "parent", null);
        setField(term2969, term2969.getClass(), "next", term2971);
        setIntField(term2974, term2974.getClass(), "type", 1283079251);
        setField(term2974, term2974.getClass(), "next", null);
        setField(term2974, term2974.getClass(), "first", null);
        setField(term2974, term2974.getClass(), "last", term2971);
        setField(term2974, term2974.getClass(), "propListHead", null);
        setIntField(term2974, term2974.getClass(), "sourcePosition", 0);
        setField(term2974, term2974.getClass(), "jsType", null);
        setField(term2974, term2974.getClass(), "parent", null);
        setField(term2969, term2969.getClass(), "first", term2974);
        setField(term2969, term2969.getClass(), "last", term2967);
        setField(term2969, term2969.getClass(), "propListHead", null);
        setIntField(term2969, term2969.getClass(), "sourcePosition", 0);
        setField(term2969, term2969.getClass(), "jsType", null);
        setField(term2969, term2969.getClass(), "parent", null);
        setField(term2967, term2967.getClass(), "next", term2969);
        setField(term2967, term2967.getClass(), "first", term2971);
        setIntField(term2978, term2978.getClass(), "type", 1398204340);
        setIntField(term2980, term2980.getClass(), "type", 229204365);
        setField(term2980, term2980.getClass(), "next", null);
        setField(term2980, term2980.getClass(), "first", term2974);
        setField(term2980, term2980.getClass(), "last", term2969);
        setField(term2980, term2980.getClass(), "propListHead", null);
        setIntField(term2980, term2980.getClass(), "sourcePosition", 0);
        setField(term2980, term2980.getClass(), "jsType", null);
        setField(term2980, term2980.getClass(), "parent", null);
        setField(term2978, term2978.getClass(), "next", term2980);
        setField(term2978, term2978.getClass(), "first", term2965);
        setField(term2978, term2978.getClass(), "last", term2965);
        setField(term2978, term2978.getClass(), "propListHead", null);
        setIntField(term2978, term2978.getClass(), "sourcePosition", 0);
        setField(term2978, term2978.getClass(), "jsType", null);
        setField(term2978, term2978.getClass(), "parent", null);
        setField(term2967, term2967.getClass(), "last", term2978);
        setField(term2967, term2967.getClass(), "propListHead", null);
        setIntField(term2967, term2967.getClass(), "sourcePosition", 0);
        setField(term2967, term2967.getClass(), "jsType", null);
        setField(term2967, term2967.getClass(), "parent", null);
        setField(term2965, term2965.getClass(), "next", term2967);
        setIntField(term2985, term2985.getClass(), "type", -461771056);
        setField(term2985, term2985.getClass(), "next", term2978);
        setField(term2985, term2985.getClass(), "first", term2980);
        setField(term2985, term2985.getClass(), "last", term2963);
        setField(term2985, term2985.getClass(), "propListHead", null);
        setIntField(term2985, term2985.getClass(), "sourcePosition", 0);
        setField(term2985, term2985.getClass(), "jsType", null);
        setField(term2985, term2985.getClass(), "parent", null);
        setField(term2965, term2965.getClass(), "first", term2985);
        setField(term2965, term2965.getClass(), "last", term2985);
        setField(term2965, term2965.getClass(), "propListHead", null);
        setIntField(term2965, term2965.getClass(), "sourcePosition", 0);
        setField(term2965, term2965.getClass(), "jsType", null);
        setField(term2965, term2965.getClass(), "parent", null);
        setField(term2963, term2963.getClass(), "next", term2965);
        setField(term2963, term2963.getClass(), "first", term2969);
        setField(term2963, term2963.getClass(), "last", term2971);
        setField(term2963, term2963.getClass(), "propListHead", null);
        setIntField(term2963, term2963.getClass(), "sourcePosition", 0);
        setField(term2963, term2963.getClass(), "jsType", null);
        setField(term2963, term2963.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2963;
        callMethod(klass, "getFirstNonEmptyChild", argTypes, null, args);
    }

};


