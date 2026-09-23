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

public class AbstractCommandLineRunner_writeOutput_1967611700111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191411;

    public AbstractCommandLineRunner_writeOutput_1967611700111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191411 = newInstance(Class.forName("com.google.common.base.UnicodeEscaper$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term191411;
        args[1] = null;
        args[2] = "";
        args[3] = "";
        args[4] = "";
        callMethod(klass, "writeOutput", argTypes, null, args);
    }

};


