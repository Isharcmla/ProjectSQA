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
import java.lang.String;
import java.util.HashMap;

public class RenamePrototypes_process_531819914193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269799;
     Object term270287;
     Object term270379;

    public RenamePrototypes_process_531819914193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term271687 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term271686 = ((Class) term271687).getDeclaredField((String) "NORMALIZED");
        ((Field) term271686).setAccessible(true);
        Object enum245 = ((Field) term271686).get((Object) null);
        HashMap term270091 = new HashMap();
        term269799 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term269879 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term269879, term269879.getClass(), "stage", enum245);
        setField(term269799, term269799.getClass(), "compiler", term269879);
        setField(term269799, term269799.getClass(), "properties", term270091);
        setField(term269799, term269799.getClass(), "prevUsedRenameMap", null);
        setField(term269799, term269799.getClass(), "reservedNames", null);
        setField(term269799, term269799.getClass(), "reservedCharacters", null);
        term270287 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term270287, term270287.getClass(), "type", 0);
        setField(term270287, term270287.getClass(), "first", null);
        term270379 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term270379, term270379.getClass(), "type", 0);
        setField(term270379, term270379.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term270287;
        args[1] = term270379;
        try {
            callMethod(klass, "process", argTypes, term269799, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


