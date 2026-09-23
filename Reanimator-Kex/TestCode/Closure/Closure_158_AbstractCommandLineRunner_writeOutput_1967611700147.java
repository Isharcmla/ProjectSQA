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
import java.lang.StringBuffer;
import java.lang.Object;

public class AbstractCommandLineRunner_writeOutput_1967611700147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129841;
     Object term129921;

    public AbstractCommandLineRunner_writeOutput_1967611700147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129841 = new StringBuffer();
        term129921 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term130003 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term129921, term129921.getClass(), "sourceMap", term130003);
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
        args[0] = term129841;
        args[1] = term129921;
        args[2] = null;
        args[3] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        try {
            callMethod(klass, "writeOutput", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


