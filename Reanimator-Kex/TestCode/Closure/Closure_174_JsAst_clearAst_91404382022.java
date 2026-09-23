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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class JsAst_clearAst_91404382022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3703;
     Object term3990;

    public JsAst_clearAst_91404382022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3703 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term3801 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term3703, term3703.getClass(), "root", null);
        setField(term3703, term3703.getClass(), "sourceFile", term3801);
        term3990 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term3991 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term3990, term3990.getClass(), "inputId", null);
        setField(term3991, term3991.getClass(), "file", null);
        setField(term3991, term3991.getClass(), "inputCharset", null);
        setField(term3991, term3991.getClass(), "fileName", null);
        setBooleanField(term3991, term3991.getClass(), "isExternFile", false);
        setField(term3991, term3991.getClass(), "originalPath", null);
        setField(term3991, term3991.getClass(), "lineOffsets", null);
        setField(term3991, term3991.getClass(), "code", null);
        setField(term3990, term3990.getClass(), "sourceFile", term3991);
        setField(term3990, term3990.getClass(), "fileName", null);
        setField(term3990, term3990.getClass(), "root", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearAst", argTypes, term3703, args);
        assertTrue(recursiveEquals(term3703, term3990));
    }

};


