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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryConvertOperandsToNumber_21063566197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17634;
     Object term17704;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_21063566197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17634 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term17704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17704, term17704.getClass(), "first", term17704);
        setField(term17704, term17704.getClass(), "next", term17774);
        setIntField(term17704, term17704.getClass(), "type", 101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17704;
        try {
            callMethod(klass, "tryConvertOperandsToNumber", argTypes, term17634, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


