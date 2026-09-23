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

public class IRFactory_setSourceInfo_1238039152522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102431;
     Object term102501;
     Object term102619;

    public IRFactory_setSourceInfo_1238039152522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102431 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term102501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term102501, term102501.getClass(), "type", -106);
        setIntField(term102501, term102501.getClass(), "sourcePosition", -1);
        term102619 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.XmlString"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[2];
        args[0] = term102501;
        args[1] = term102619;
        try {
            callMethod(klass, "setSourceInfo", argTypes, term102431, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


