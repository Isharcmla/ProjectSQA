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

public class FlowSensitiveInlineVariables_checkRightOf_146623795643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7443;
     Object term7583;
     Object enum0;

    public FlowSensitiveInlineVariables_checkRightOf_146623795643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7443, term7443.getClass(), "next", term7513);
        term7583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Class<? extends Object> term7713 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term7712 = ((Class) term7713).getDeclaredField((String) "ALL");
        ((Field) term7712).setAccessible(true);
        enum0 = ((Field) term7712).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term7443;
        args[1] = term7583;
        args[2] = enum0;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


