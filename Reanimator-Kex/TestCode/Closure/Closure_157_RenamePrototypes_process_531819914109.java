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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class RenamePrototypes_process_531819914109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114736;
     Object term115050;

    public RenamePrototypes_process_531819914109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term116321 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term116320 = ((Class) term116321).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term116320).setAccessible(true);
        Object enum119 = ((Field) term116320).get((Object) null);
        term114736 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term114816 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term114816, term114816.getClass(), "stage", enum119);
        setField(term114736, term114736.getClass(), "compiler", term114816);
        term115050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115050, term115050.getClass(), "type", 35);
        setField(term115050, term115050.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term115050;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term114736, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


