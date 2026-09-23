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

public class JsAst_setSourceFile_123525446270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13935;
     Object term14077;

    public JsAst_setSourceFile_123525446270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13935 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        setField(term13935, term13935.getClass(), "fileName", "");
        term14077 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term14077, term14077.getClass(), "fileName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = term14077;
        try {
            callMethod(klass, "setSourceFile", argTypes, term13935, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


