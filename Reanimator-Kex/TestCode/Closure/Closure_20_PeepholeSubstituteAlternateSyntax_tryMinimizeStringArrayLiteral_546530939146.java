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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22738;
     Object term22808;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22738 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term22738, term22738.getClass(), "late", true);
        term22808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22948, term22948.getClass(), "next", term22948);
        setField(term22878, term22878.getClass(), "next", term22948);
        setField(term22808, term22808.getClass(), "first", term22878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22808;
        callMethod(klass, "tryMinimizeStringArrayLiteral", argTypes, term22738, args);
    }

};


