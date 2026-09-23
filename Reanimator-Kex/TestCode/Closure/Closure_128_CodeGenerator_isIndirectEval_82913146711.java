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

public class CodeGenerator_isIndirectEval_82913146711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5968;
     Object term5981;

    public CodeGenerator_isIndirectEval_82913146711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5969 = new HashMap();
        term5968 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term5968, term5968.getClass(), "ESCAPED_JS_STRINGS", term5969);
        setField(term5968, term5968.getClass(), "cc", null);
        setField(term5968, term5968.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term5968, term5968.getClass(), "preferSingleQuotes", true);
        setBooleanField(term5968, term5968.getClass(), "trustedStrings", true);
        term5981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5981, term5981.getClass(), "type", -226514366);
        setIntField(term5983, term5983.getClass(), "type", 1193880199);
        setIntField(term5985, term5985.getClass(), "type", -1087774327);
        setIntField(term5987, term5987.getClass(), "type", -1530420153);
        setIntField(term5989, term5989.getClass(), "type", -469968304);
        setField(term5989, term5989.getClass(), "next", null);
        setField(term5989, term5989.getClass(), "first", null);
        setField(term5989, term5989.getClass(), "last", null);
        setField(term5989, term5989.getClass(), "propListHead", null);
        setIntField(term5989, term5989.getClass(), "sourcePosition", 0);
        setField(term5989, term5989.getClass(), "jsType", null);
        setField(term5989, term5989.getClass(), "parent", null);
        setField(term5987, term5987.getClass(), "next", term5989);
        setIntField(term5992, term5992.getClass(), "type", -1145578966);
        setField(term5992, term5992.getClass(), "next", null);
        setField(term5992, term5992.getClass(), "first", null);
        setField(term5992, term5992.getClass(), "last", term5989);
        setField(term5992, term5992.getClass(), "propListHead", null);
        setIntField(term5992, term5992.getClass(), "sourcePosition", 0);
        setField(term5992, term5992.getClass(), "jsType", null);
        setField(term5992, term5992.getClass(), "parent", null);
        setField(term5987, term5987.getClass(), "first", term5992);
        setField(term5987, term5987.getClass(), "last", term5985);
        setField(term5987, term5987.getClass(), "propListHead", null);
        setIntField(term5987, term5987.getClass(), "sourcePosition", 0);
        setField(term5987, term5987.getClass(), "jsType", null);
        setField(term5987, term5987.getClass(), "parent", null);
        setField(term5985, term5985.getClass(), "next", term5987);
        setField(term5985, term5985.getClass(), "first", term5989);
        setIntField(term5996, term5996.getClass(), "type", 1962444399);
        setIntField(term5998, term5998.getClass(), "type", 767834723);
        setField(term5998, term5998.getClass(), "next", null);
        setField(term5998, term5998.getClass(), "first", term5992);
        setField(term5998, term5998.getClass(), "last", term5987);
        setField(term5998, term5998.getClass(), "propListHead", null);
        setIntField(term5998, term5998.getClass(), "sourcePosition", 0);
        setField(term5998, term5998.getClass(), "jsType", null);
        setField(term5998, term5998.getClass(), "parent", null);
        setField(term5996, term5996.getClass(), "next", term5998);
        setField(term5996, term5996.getClass(), "first", term5983);
        setField(term5996, term5996.getClass(), "last", term5983);
        setField(term5996, term5996.getClass(), "propListHead", null);
        setIntField(term5996, term5996.getClass(), "sourcePosition", 0);
        setField(term5996, term5996.getClass(), "jsType", null);
        setField(term5996, term5996.getClass(), "parent", null);
        setField(term5985, term5985.getClass(), "last", term5996);
        setField(term5985, term5985.getClass(), "propListHead", null);
        setIntField(term5985, term5985.getClass(), "sourcePosition", 0);
        setField(term5985, term5985.getClass(), "jsType", null);
        setField(term5985, term5985.getClass(), "parent", null);
        setField(term5983, term5983.getClass(), "next", term5985);
        setIntField(term6003, term6003.getClass(), "type", -602026508);
        setField(term6003, term6003.getClass(), "next", term5996);
        setField(term6003, term6003.getClass(), "first", term5998);
        setField(term6003, term6003.getClass(), "last", term5981);
        setField(term6003, term6003.getClass(), "propListHead", null);
        setIntField(term6003, term6003.getClass(), "sourcePosition", 0);
        setField(term6003, term6003.getClass(), "jsType", null);
        setField(term6003, term6003.getClass(), "parent", null);
        setField(term5983, term5983.getClass(), "first", term6003);
        setField(term5983, term5983.getClass(), "last", term6003);
        setField(term5983, term5983.getClass(), "propListHead", null);
        setIntField(term5983, term5983.getClass(), "sourcePosition", 0);
        setField(term5983, term5983.getClass(), "jsType", null);
        setField(term5983, term5983.getClass(), "parent", null);
        setField(term5981, term5981.getClass(), "next", term5983);
        setField(term5981, term5981.getClass(), "first", term5987);
        setField(term5981, term5981.getClass(), "last", term5989);
        setField(term5981, term5981.getClass(), "propListHead", null);
        setIntField(term5981, term5981.getClass(), "sourcePosition", 0);
        setField(term5981, term5981.getClass(), "jsType", null);
        setField(term5981, term5981.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5981;
        callMethod(klass, "isIndirectEval", argTypes, term5968, args);
    }

};


