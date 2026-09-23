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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CollapseProperties_inlineAliasIfPossible_2101120170114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68977;
     Object term69079;

    public CollapseProperties_inlineAliasIfPossible_2101120170114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68977 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term69079 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term69149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69219, term69219.getClass(), "type", 38);
        setField(term69149, term69149.getClass(), "parent", term69219);
        setField(term69079, term69079.getClass(), "node", term69149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Object[] args = new Object[2];
        args[0] = term69079;
        args[1] = null;
        try {
            callMethod(klass, "inlineAliasIfPossible", argTypes, term68977, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


