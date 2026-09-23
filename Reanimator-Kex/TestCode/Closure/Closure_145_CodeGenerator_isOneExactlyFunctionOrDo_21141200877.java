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

public class CodeGenerator_isOneExactlyFunctionOrDo_21141200877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890;
     Object term891;

    public CodeGenerator_isOneExactlyFunctionOrDo_21141200877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term890, term890.getClass(), "cc", null);
        setField(term890, term890.getClass(), "outputCharsetEncoder", null);
        term891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term904 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term914 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term891, term891.getClass(), "type", 679763016);
        setIntField(term893, term893.getClass(), "type", -157887805);
        setIntField(term895, term895.getClass(), "type", 0);
        setField(term895, term895.getClass(), "next", null);
        setField(term895, term895.getClass(), "first", null);
        setField(term895, term895.getClass(), "last", null);
        setField(term895, term895.getClass(), "propListHead", null);
        setIntField(term895, term895.getClass(), "sourcePosition", 0);
        setField(term895, term895.getClass(), "jsType", null);
        setField(term895, term895.getClass(), "parent", null);
        setField(term893, term893.getClass(), "next", term895);
        setIntField(term898, term898.getClass(), "type", 0);
        setField(term898, term898.getClass(), "next", null);
        setField(term898, term898.getClass(), "first", null);
        setField(term898, term898.getClass(), "last", null);
        setField(term898, term898.getClass(), "propListHead", null);
        setIntField(term898, term898.getClass(), "sourcePosition", 0);
        setField(term898, term898.getClass(), "jsType", null);
        setField(term898, term898.getClass(), "parent", null);
        setField(term893, term893.getClass(), "first", term898);
        setIntField(term901, term901.getClass(), "type", 0);
        setField(term901, term901.getClass(), "next", null);
        setField(term901, term901.getClass(), "first", null);
        setField(term901, term901.getClass(), "last", null);
        setField(term901, term901.getClass(), "propListHead", null);
        setIntField(term901, term901.getClass(), "sourcePosition", 0);
        setField(term901, term901.getClass(), "jsType", null);
        setField(term901, term901.getClass(), "parent", null);
        setField(term893, term893.getClass(), "last", term901);
        setField(term904, term904.getClass(), "next", null);
        setIntField(term904, term904.getClass(), "type", 0);
        setIntField(term904, term904.getClass(), "intValue", 0);
        setField(term904, term904.getClass(), "objectValue", null);
        setField(term893, term893.getClass(), "propListHead", term904);
        setIntField(term893, term893.getClass(), "sourcePosition", -1016503459);
        setField(term893, term893.getClass(), "jsType", null);
        setField(term893, term893.getClass(), "parent", null);
        setField(term891, term891.getClass(), "next", term893);
        setIntField(term908, term908.getClass(), "type", 0);
        setField(term908, term908.getClass(), "next", null);
        setField(term908, term908.getClass(), "first", null);
        setField(term908, term908.getClass(), "last", null);
        setField(term908, term908.getClass(), "propListHead", null);
        setIntField(term908, term908.getClass(), "sourcePosition", 0);
        setField(term908, term908.getClass(), "jsType", null);
        setField(term908, term908.getClass(), "parent", null);
        setField(term891, term891.getClass(), "first", term908);
        setIntField(term911, term911.getClass(), "type", 0);
        setField(term911, term911.getClass(), "next", null);
        setField(term911, term911.getClass(), "first", null);
        setField(term911, term911.getClass(), "last", null);
        setField(term911, term911.getClass(), "propListHead", null);
        setIntField(term911, term911.getClass(), "sourcePosition", 0);
        setField(term911, term911.getClass(), "jsType", null);
        setField(term911, term911.getClass(), "parent", null);
        setField(term891, term891.getClass(), "last", term911);
        setField(term914, term914.getClass(), "next", null);
        setIntField(term914, term914.getClass(), "type", 0);
        setIntField(term914, term914.getClass(), "intValue", 0);
        setField(term914, term914.getClass(), "objectValue", null);
        setField(term891, term891.getClass(), "propListHead", term914);
        setIntField(term891, term891.getClass(), "sourcePosition", -1968847291);
        setField(term891, term891.getClass(), "jsType", null);
        setField(term891, term891.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term891;
        callMethod(klass, "isOneExactlyFunctionOrDo", argTypes, term890, args);
    }

};


