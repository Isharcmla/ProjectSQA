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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class CommandLineRunner_tokenizeKeepingQuotedStrings_93134344927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167341;
     Object term167395;

    public CommandLineRunner_tokenizeKeepingQuotedStrings_93134344927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167341 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object[] term167113 = (Object[]) newArray("java.lang.Object", 0);
        term167395 = new LinkedList();
        ((LinkedList) term167395).add((Object)term167113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term167395;
        try {
            callMethod(klass, "tokenizeKeepingQuotedStrings", argTypes, term167341, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


