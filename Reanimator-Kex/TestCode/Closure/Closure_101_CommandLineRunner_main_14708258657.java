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

public class CommandLineRunner_main_14708258657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7317;

    public CommandLineRunner_main_14708258657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7317 = (Object[]) newArray("java.lang.String", 8);
        setElement(term7317, 0, "eZFUvlxvGV");
        setElement(term7317, 1, "BYqFIqCKAV");
        setElement(term7317, 2, "vrQLuWIDJX");
        setElement(term7317, 3, "flxyYxBRtu");
        setElement(term7317, 4, "OclPbYPkcH");
        setElement(term7317, 5, "IoAlmYsBwc");
        setElement(term7317, 6, "TEParAifyi");
        setElement(term7317, 7, "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7317;
        callMethod(klass, "main", argTypes, null, args);
    }

};


