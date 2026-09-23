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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23251;
     Object term23341;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23251 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term23341 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term23437 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term23527 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term23437, term23437.getClass(), "type", 29);
        setField(term23437, term23437.getClass(), "objectValue", null);
        setField(term23341, term23341.getClass(), "propListHead", term23437);
        setField(term23341, term23341.getClass(), "parent", term23527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23341;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term23251, args);
    }

};


