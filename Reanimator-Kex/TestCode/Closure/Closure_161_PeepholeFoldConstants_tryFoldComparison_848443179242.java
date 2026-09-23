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

public class PeepholeFoldConstants_tryFoldComparison_848443179242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38987;
     Object term39057;
     Object term39127;

    public PeepholeFoldConstants_tryFoldComparison_848443179242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38987 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term39057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39057, term39057.getClass(), "type", 14);
        term39127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39127, term39127.getClass(), "type", 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term39057;
        args[1] = term39127;
        args[2] = null;
        callMethod(klass, "tryFoldComparison", argTypes, term38987, args);
    }

};


