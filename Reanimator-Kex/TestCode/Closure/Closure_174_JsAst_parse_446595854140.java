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

public class JsAst_parse_446595854140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128824;
     Object term129008;

    public JsAst_parse_446595854140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128824 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term128928 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term128928, term128928.getClass(), "code", null);
        setField(term128824, term128824.getClass(), "sourceFile", term128928);
        term129008 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term129100 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term129256 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term129008, term129008.getClass(), "parserConfig", term129100);
        setField(term129008, term129008.getClass(), "defaultErrorReporter", term129256);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term129008;
        try {
            callMethod(klass, "parse", argTypes, term128824, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


