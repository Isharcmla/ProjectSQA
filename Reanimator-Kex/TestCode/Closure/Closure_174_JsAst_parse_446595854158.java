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
import java.lang.String;

public class JsAst_parse_446595854158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163455;
     Object term163677;

    public JsAst_parse_446595854158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163455 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term163559 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term163559, term163559.getClass(), "code", null);
        setField(term163559, term163559.getClass(), "fileName", "");
        setField(term163455, term163455.getClass(), "sourceFile", term163559);
        Class<? extends Object> term164079 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term164078 = ((Class) term164079).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term164078).setAccessible(true);
        Object enum37 = ((Field) term164078).get((Object) null);
        term163677 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term163769 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term164033 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.ErrorCollector"));
        setField(term163769, term163769.getClass(), "languageMode", enum37);
        setBooleanField(term163769, term163769.getClass(), "isIdeMode", false);
        setField(term163677, term163677.getClass(), "parserConfig", term163769);
        setField(term163677, term163677.getClass(), "defaultErrorReporter", term164033);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term163677;
        callMethod(klass, "parse", argTypes, term163455, args);
    }

};


