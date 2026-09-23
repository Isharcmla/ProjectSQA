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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseReturn_1142297770578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1896813;
     Object term1896883;

    public TypeInference_traverseReturn_1142297770578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1896813 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1896883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1896953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1899053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1899123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1899193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1899263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1899333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1899403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1896953, term1896953.getClass(), "type", 92);
        setIntField(term1897023, term1897023.getClass(), "type", 92);
        setIntField(term1897093, term1897093.getClass(), "type", 92);
        setIntField(term1897163, term1897163.getClass(), "type", 92);
        setIntField(term1897233, term1897233.getClass(), "type", 92);
        setIntField(term1897303, term1897303.getClass(), "type", 92);
        setIntField(term1897373, term1897373.getClass(), "type", 92);
        setIntField(term1897443, term1897443.getClass(), "type", 92);
        setIntField(term1897513, term1897513.getClass(), "type", 92);
        setIntField(term1897583, term1897583.getClass(), "type", 92);
        setIntField(term1897653, term1897653.getClass(), "type", 92);
        setIntField(term1897723, term1897723.getClass(), "type", 92);
        setIntField(term1897793, term1897793.getClass(), "type", 92);
        setIntField(term1897863, term1897863.getClass(), "type", 92);
        setIntField(term1897933, term1897933.getClass(), "type", 92);
        setIntField(term1898003, term1898003.getClass(), "type", 92);
        setIntField(term1898073, term1898073.getClass(), "type", 92);
        setIntField(term1898143, term1898143.getClass(), "type", 92);
        setIntField(term1898213, term1898213.getClass(), "type", 92);
        setIntField(term1898283, term1898283.getClass(), "type", 92);
        setIntField(term1898353, term1898353.getClass(), "type", 92);
        setIntField(term1898423, term1898423.getClass(), "type", 92);
        setIntField(term1898493, term1898493.getClass(), "type", 92);
        setIntField(term1898563, term1898563.getClass(), "type", 92);
        setIntField(term1898633, term1898633.getClass(), "type", 92);
        setIntField(term1898703, term1898703.getClass(), "type", 92);
        setIntField(term1898773, term1898773.getClass(), "type", 92);
        setIntField(term1898843, term1898843.getClass(), "type", 92);
        setIntField(term1898913, term1898913.getClass(), "type", 92);
        setIntField(term1898983, term1898983.getClass(), "type", 92);
        setIntField(term1899053, term1899053.getClass(), "type", 92);
        setIntField(term1899123, term1899123.getClass(), "type", 92);
        setIntField(term1899193, term1899193.getClass(), "type", 92);
        setIntField(term1899263, term1899263.getClass(), "type", 92);
        setIntField(term1899333, term1899333.getClass(), "type", 92);
        setIntField(term1899403, term1899403.getClass(), "type", 114);
        setField(term1899333, term1899333.getClass(), "first", term1899403);
        setField(term1899263, term1899263.getClass(), "first", term1899333);
        setField(term1899193, term1899193.getClass(), "first", term1899263);
        setField(term1899123, term1899123.getClass(), "first", term1899193);
        setField(term1899053, term1899053.getClass(), "first", term1899123);
        setField(term1898983, term1898983.getClass(), "first", term1899053);
        setField(term1898913, term1898913.getClass(), "first", term1898983);
        setField(term1898843, term1898843.getClass(), "first", term1898913);
        setField(term1898773, term1898773.getClass(), "first", term1898843);
        setField(term1898703, term1898703.getClass(), "first", term1898773);
        setField(term1898633, term1898633.getClass(), "first", term1898703);
        setField(term1898563, term1898563.getClass(), "first", term1898633);
        setField(term1898493, term1898493.getClass(), "first", term1898563);
        setField(term1898423, term1898423.getClass(), "first", term1898493);
        setField(term1898353, term1898353.getClass(), "first", term1898423);
        setField(term1898283, term1898283.getClass(), "first", term1898353);
        setField(term1898213, term1898213.getClass(), "first", term1898283);
        setField(term1898143, term1898143.getClass(), "first", term1898213);
        setField(term1898073, term1898073.getClass(), "first", term1898143);
        setField(term1898003, term1898003.getClass(), "first", term1898073);
        setField(term1897933, term1897933.getClass(), "first", term1898003);
        setField(term1897863, term1897863.getClass(), "first", term1897933);
        setField(term1897793, term1897793.getClass(), "first", term1897863);
        setField(term1897723, term1897723.getClass(), "first", term1897793);
        setField(term1897653, term1897653.getClass(), "first", term1897723);
        setField(term1897583, term1897583.getClass(), "first", term1897653);
        setField(term1897513, term1897513.getClass(), "first", term1897583);
        setField(term1897443, term1897443.getClass(), "first", term1897513);
        setField(term1897373, term1897373.getClass(), "first", term1897443);
        setField(term1897303, term1897303.getClass(), "first", term1897373);
        setField(term1897233, term1897233.getClass(), "first", term1897303);
        setField(term1897163, term1897163.getClass(), "first", term1897233);
        setField(term1897093, term1897093.getClass(), "first", term1897163);
        setField(term1897023, term1897023.getClass(), "first", term1897093);
        setField(term1896953, term1896953.getClass(), "first", term1897023);
        setField(term1896883, term1896883.getClass(), "first", term1896953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1896883;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1896813, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


