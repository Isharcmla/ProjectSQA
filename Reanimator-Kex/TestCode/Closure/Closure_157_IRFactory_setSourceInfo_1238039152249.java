package com.google.javascript.jscomp.parsing;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IRFactory_setSourceInfo_1238039152249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44175;
     Object term44245;

    public IRFactory_setSourceInfo_1238039152249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44175 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term44245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44245, term44245.getClass(), "type", -106);
        setIntField(term44245, term44245.getClass(), "sourcePosition", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[2];
        args[0] = term44245;
        args[1] = null;
        try {
            callMethod(klass, "setSourceInfo", argTypes, term44175, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


