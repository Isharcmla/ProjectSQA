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
import java.util.LinkedList;
import java.util.ArrayList;

public class CommandLineRunner_tokenizeKeepingQuotedStrings_93134344931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171100;
     Object term171154;
     Object term171265;
     Object term171266;
     Object term171252;

    public CommandLineRunner_tokenizeKeepingQuotedStrings_93134344931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171100 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        term171154 = new LinkedList();
        ((LinkedList) term171154).add("");
        term171265 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        setField(term171265, term171265.getClass(), "flags", null);
        setBooleanField(term171265, term171265.getClass(), "isConfigValid", false);
        setField(term171265, term171265.getClass(), "config", null);
        setField(term171265, term171265.getClass(), "defaultJsOutput", null);
        setField(term171265, term171265.getClass(), "err", null);
        setField(term171265, term171265.getClass(), "compiler", null);
        setField(term171265, term171265.getClass(), "inputCharset", null);
        setField(term171265, term171265.getClass(), "outputCharset2", null);
        setField(term171265, term171265.getClass(), "legacyOutputCharset", null);
        setBooleanField(term171265, term171265.getClass(), "testMode", false);
        setField(term171265, term171265.getClass(), "externsSupplierForTesting", null);
        setField(term171265, term171265.getClass(), "inputsSupplierForTesting", null);
        setField(term171265, term171265.getClass(), "modulesSupplierForTesting", null);
        setField(term171265, term171265.getClass(), "exitCodeReceiverForTesting", null);
        setField(term171265, term171265.getClass(), "rootRelativePathsMap", null);
        setField(term171265, term171265.getClass(), "parsedModuleWrappers", null);
        term171266 = new LinkedList();
        ((LinkedList) term171266).add("");
        term171252 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term171154;
        Object retValue = callMethod(klass, "tokenizeKeepingQuotedStrings", argTypes, term171100, args);
        assertTrue(recursiveEquals(term171100, term171265));
        assertTrue(recursiveEquals(term171154, term171266));
        assertTrue(recursiveEquals(retValue, term171252));
    }

};


