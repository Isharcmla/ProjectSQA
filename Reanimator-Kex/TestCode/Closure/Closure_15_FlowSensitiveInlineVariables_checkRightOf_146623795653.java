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

public class FlowSensitiveInlineVariables_checkRightOf_146623795653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11767;
     Object term11907;
     Object term12015;

    public FlowSensitiveInlineVariables_checkRightOf_146623795653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11837, term11837.getClass(), "type", -39);
        setField(term11837, term11837.getClass(), "next", term11767);
        setField(term11767, term11767.getClass(), "next", term11837);
        term11907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term12015 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNameNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term11767;
        args[1] = term11907;
        args[2] = term12015;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


