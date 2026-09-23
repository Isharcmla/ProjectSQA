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

public class IRFactory_setSourceInfo_1238039152593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123347;
     Object term123417;
     Object term123535;

    public IRFactory_setSourceInfo_1238039152593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123347 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term123417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123417, term123417.getClass(), "type", -106);
        setIntField(term123417, term123417.getClass(), "sourcePosition", -1);
        term123535 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.XmlString"));
        setIntField(term123535, term123535.getClass(), "lineno", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[2];
        args[0] = term123417;
        args[1] = term123535;
        try {
            callMethod(klass, "setSourceInfo", argTypes, term123347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


