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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505397;
     Object term505483;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term505397 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term505483 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term505569 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term505655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term505741 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term505827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term505913 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term505999 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506171 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506257 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506343 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506429 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506515 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506687 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506773 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term506913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term506999 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term507085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term507171 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term507257 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term507343 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term507429 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term507515 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term507601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term507687 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term505569, term505569.getClass(), "next", term505655);
        setIntField(term505569, term505569.getClass(), "type", 85);
        setIntField(term505741, term505741.getClass(), "type", 85);
        setIntField(term505827, term505827.getClass(), "type", 85);
        setIntField(term505913, term505913.getClass(), "type", 85);
        setIntField(term505999, term505999.getClass(), "type", 85);
        setIntField(term506085, term506085.getClass(), "type", 85);
        setIntField(term506171, term506171.getClass(), "type", 85);
        setIntField(term506257, term506257.getClass(), "type", 85);
        setIntField(term506343, term506343.getClass(), "type", 85);
        setIntField(term506429, term506429.getClass(), "type", 85);
        setIntField(term506515, term506515.getClass(), "type", 85);
        setIntField(term506601, term506601.getClass(), "type", 85);
        setIntField(term506687, term506687.getClass(), "type", 85);
        setIntField(term506773, term506773.getClass(), "type", 85);
        setIntField(term506843, term506843.getClass(), "type", 85);
        setIntField(term506913, term506913.getClass(), "type", 85);
        setIntField(term506999, term506999.getClass(), "type", 85);
        setIntField(term507085, term507085.getClass(), "type", 85);
        setIntField(term507171, term507171.getClass(), "type", 85);
        setIntField(term507257, term507257.getClass(), "type", 85);
        setIntField(term507343, term507343.getClass(), "type", 85);
        setIntField(term507429, term507429.getClass(), "type", 85);
        setIntField(term507515, term507515.getClass(), "type", 85);
        setIntField(term507601, term507601.getClass(), "type", 85);
        setField(term507601, term507601.getClass(), "last", term507687);
        setField(term507515, term507515.getClass(), "last", term507601);
        setField(term507429, term507429.getClass(), "last", term507515);
        setField(term507343, term507343.getClass(), "last", term507429);
        setField(term507257, term507257.getClass(), "last", term507343);
        setField(term507171, term507171.getClass(), "last", term507257);
        setField(term507085, term507085.getClass(), "last", term507171);
        setField(term506999, term506999.getClass(), "last", term507085);
        setField(term506913, term506913.getClass(), "last", term506999);
        setField(term506843, term506843.getClass(), "last", term506913);
        setField(term506773, term506773.getClass(), "last", term506843);
        setField(term506687, term506687.getClass(), "last", term506773);
        setField(term506601, term506601.getClass(), "last", term506687);
        setField(term506515, term506515.getClass(), "last", term506601);
        setField(term506429, term506429.getClass(), "last", term506515);
        setField(term506343, term506343.getClass(), "last", term506429);
        setField(term506257, term506257.getClass(), "last", term506343);
        setField(term506171, term506171.getClass(), "last", term506257);
        setField(term506085, term506085.getClass(), "last", term506171);
        setField(term505999, term505999.getClass(), "last", term506085);
        setField(term505913, term505913.getClass(), "last", term505999);
        setField(term505827, term505827.getClass(), "last", term505913);
        setField(term505741, term505741.getClass(), "last", term505827);
        setField(term505569, term505569.getClass(), "last", term505741);
        setField(term505483, term505483.getClass(), "first", term505569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term505483;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term505397, args);
    }

};


