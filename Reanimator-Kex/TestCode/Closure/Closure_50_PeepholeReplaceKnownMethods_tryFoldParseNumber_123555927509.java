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

public class PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3489589;
     Object term3489659;
     Object term3489767;

    public PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3489589 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3489659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3489659, term3489659.getClass(), "type", 37);
        term3489767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3489767, term3489767.getClass(), "next", null);
        setIntField(term3489767, term3489767.getClass(), "type", 41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term3489659;
        args[1] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ";
        args[2] = term3489767;
        callMethod(klass, "tryFoldParseNumber", argTypes, term3489589, args);
    }

};


