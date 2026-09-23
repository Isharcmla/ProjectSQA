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

public class AbstractCommandLineRunner_writeOutput_190951543593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155850;
     Object term155922;

    public AbstractCommandLineRunner_writeOutput_190951543593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155850 = newInstance(Class.forName("org.apache.tools.mail.MailPrintStream"));
        term155922 = newInstance(Class.forName("org.apache.tools.mail.MailPrintStream"));
        setIntField(term155922, term155922.getClass(), "lastChar", 0);
        setBooleanField(term155922, term155922.getClass(), "autoFlush", false);
        setBooleanField(term155922, term155922.getClass(), "trouble", true);
        setField(term155922, term155922.getClass(), "formatter", null);
        setField(term155922, term155922.getClass(), "textOut", null);
        setField(term155922, term155922.getClass(), "charOut", null);
        setBooleanField(term155922, term155922.getClass(), "closing", false);
        setField(term155922, term155922.getClass(), "out", null);
        setBooleanField(term155922, term155922.getClass(), "closed", false);
        setField(term155922, term155922.getClass(), "closeLock", null);
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
        args[0] = term155850;
        args[1] = null;
        args[2] = null;
        args[3] = "";
        args[4] = "";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term155850, term155922));
    }

};


