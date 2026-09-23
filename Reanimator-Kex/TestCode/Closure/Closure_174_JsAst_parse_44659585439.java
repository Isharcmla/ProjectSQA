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

public class JsAst_parse_44659585439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5747;

    public JsAst_parse_44659585439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5747 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term5851 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term5747, term5747.getClass(), "sourceFile", term5851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parse", argTypes, term5747, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


