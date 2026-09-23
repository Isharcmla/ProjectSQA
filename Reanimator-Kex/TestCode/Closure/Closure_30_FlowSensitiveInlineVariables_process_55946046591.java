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

public class FlowSensitiveInlineVariables_process_55946046591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28589;
     Object term28659;

    public FlowSensitiveInlineVariables_process_55946046591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28589 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term28589, term28589.getClass(), "compiler", null);
        term28659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28659, term28659.getClass(), "type", 0);
        setIntField(term28729, term28729.getClass(), "type", 0);
        setField(term28729, term28729.getClass(), "parent", null);
        setField(term28659, term28659.getClass(), "parent", term28729);
        setField(term28659, term28659.getClass(), "first", term28799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28659;
        callMethod(klass, "process", argTypes, term28589, args);
    }

};


