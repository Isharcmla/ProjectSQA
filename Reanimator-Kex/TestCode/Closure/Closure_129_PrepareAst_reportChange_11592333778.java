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

public class PrepareAst_reportChange_11592333778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term130;

    public PrepareAst_reportChange_11592333778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("com.google.javascript.jscomp.PrepareAst"));
        setField(term3, term3.getClass(), "compiler", null);
        setBooleanField(term3, term3.getClass(), "checkOnly", false);
        term130 = newInstance(Class.forName("com.google.javascript.jscomp.PrepareAst"));
        setField(term130, term130.getClass(), "compiler", null);
        setBooleanField(term130, term130.getClass(), "checkOnly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reportChange", argTypes, term3, args);
        assertTrue(recursiveEquals(term3, term130));
    }

};


