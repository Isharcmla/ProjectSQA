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
import java.lang.String;
import java.lang.Object;

public class CodePrinter_toSource_19778363069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum18;
     Object enum19;

    public CodePrinter_toSource_19778363069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20569 = Class.forName((String) "com.google.javascript.jscomp.CodePrinter$Format");
        Field term20568 = ((Class) term20569).getDeclaredField((String) "COMPACT");
        ((Field) term20568).setAccessible(true);
        enum18 = ((Field) term20568).get((Object) null);
        Class<? extends Object> term20832 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term20831 = ((Class) term20832).getDeclaredField((String) "ALL");
        ((Field) term20831).setAccessible(true);
        enum19 = ((Field) term20831).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("com.google.javascript.jscomp.SourceMap");
        argTypes[6] = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        argTypes[7] = Class.forName("java.nio.charset.Charset");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = null;
        args[1] = enum18;
        args[2] = false;
        args[3] = false;
        args[4] = 0;
        args[5] = null;
        args[6] = enum19;
        args[7] = null;
        args[8] = false;
        try {
            callMethod(klass, "toSource", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


