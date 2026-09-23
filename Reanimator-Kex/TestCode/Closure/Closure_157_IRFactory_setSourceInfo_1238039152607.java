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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IRFactory_setSourceInfo_1238039152607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128769;
     Object term128877;
     Object term128995;

    public IRFactory_setSourceInfo_1238039152607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128769 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term128769, term128769.getClass(), "sourceString", "");
        term128877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term128877, term128877.getClass(), "type", -106);
        setIntField(term128877, term128877.getClass(), "sourcePosition", -1);
        term128995 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.XmlString"));
        setIntField(term128995, term128995.getClass(), "lineno", 0);
        setIntField(term128995, term128995.getClass(), "position", 0);
        setField(term128995, term128995.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[2];
        args[0] = term128877;
        args[1] = term128995;
        callMethod(klass, "setSourceInfo", argTypes, term128769, args);
    }

};


