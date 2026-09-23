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

public class IRFactory_handlePossibleFileOverviewJsDoc_2034771075220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69316;
     Object term69426;

    public IRFactory_handlePossibleFileOverviewJsDoc_2034771075220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69316 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term69316, term69316.getClass(), "fileOverviewInfo", null);
        term69426 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Object[] args = new Object[1];
        args[0] = term69426;
        callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term69316, args);
    }

};


