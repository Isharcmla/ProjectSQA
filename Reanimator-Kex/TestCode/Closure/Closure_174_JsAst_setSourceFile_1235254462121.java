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

public class JsAst_setSourceFile_1235254462121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99169;
     Object term99305;
     Object term99336;
     Object term99342;

    public JsAst_setSourceFile_1235254462121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99169 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        setField(term99169, term99169.getClass(), "fileName", "");
        term99305 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term99305, term99305.getClass(), "fileName", "");
        term99336 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term99337 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term99336, term99336.getClass(), "inputId", null);
        setField(term99337, term99337.getClass(), "file", null);
        setField(term99337, term99337.getClass(), "inputCharset", null);
        setField(term99337, term99337.getClass(), "fileName", "");
        setBooleanField(term99337, term99337.getClass(), "isExternFile", false);
        setField(term99337, term99337.getClass(), "originalPath", null);
        setField(term99337, term99337.getClass(), "lineOffsets", null);
        setField(term99337, term99337.getClass(), "code", null);
        setField(term99336, term99336.getClass(), "sourceFile", term99337);
        setField(term99336, term99336.getClass(), "fileName", "");
        setField(term99336, term99336.getClass(), "root", null);
        term99342 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term99342, term99342.getClass(), "file", null);
        setField(term99342, term99342.getClass(), "inputCharset", null);
        setField(term99342, term99342.getClass(), "fileName", "");
        setBooleanField(term99342, term99342.getClass(), "isExternFile", false);
        setField(term99342, term99342.getClass(), "originalPath", null);
        setField(term99342, term99342.getClass(), "lineOffsets", null);
        setField(term99342, term99342.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = term99305;
        callMethod(klass, "setSourceFile", argTypes, term99169, args);
        assertTrue(recursiveEquals(term99169, term99336));
        assertTrue(recursiveEquals(term99305, term99342));
    }

};


