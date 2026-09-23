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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class AbstractCommandLineRunner_writeOutput_1909515435105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166697;
     Object term169872;

    public AbstractCommandLineRunner_writeOutput_1909515435105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166697 = newInstance(Class.forName("org.apache.tools.mail.MailPrintStream"));
        term169872 = newInstance(Class.forName("org.apache.tools.mail.MailPrintStream"));
        setIntField(term169872, term169872.getClass(), "lastChar", 0);
        setBooleanField(term169872, term169872.getClass(), "autoFlush", false);
        setBooleanField(term169872, term169872.getClass(), "trouble", true);
        setField(term169872, term169872.getClass(), "formatter", null);
        setField(term169872, term169872.getClass(), "textOut", null);
        setField(term169872, term169872.getClass(), "charOut", null);
        setBooleanField(term169872, term169872.getClass(), "closing", false);
        setField(term169872, term169872.getClass(), "out", null);
        setBooleanField(term169872, term169872.getClass(), "closed", false);
        setField(term169872, term169872.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.io.PrintStream");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term166697;
        args[1] = null;
        args[2] = null;
        args[3] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term166697, term169872));
    }

};


