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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27306;
     Object term27376;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27306 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27516, term27516.getClass(), "next", term27586);
        setIntField(term27516, term27516.getClass(), "type", 98);
        setField(term27446, term27446.getClass(), "next", term27516);
        setIntField(term27446, term27446.getClass(), "type", 4);
        setField(term27376, term27376.getClass(), "first", term27446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27376;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term27306, args);
    }

};


