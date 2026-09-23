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

public class RenameLabels_process_15092268061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29675;
     Object term29825;

    public RenameLabels_process_15092268061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29675 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term29755 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term29675, term29675.getClass(), "compiler", term29755);
        term29825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29825, term29825.getClass(), "type", 105);
        setField(term29825, term29825.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29825;
        callMethod(klass, "process", argTypes, term29675, args);
    }

};


