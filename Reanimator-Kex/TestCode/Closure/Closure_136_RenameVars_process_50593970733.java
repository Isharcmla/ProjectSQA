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
import java.util.HashSet;
import java.lang.Object;

public class RenameVars_process_50593970733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32353;
     Object term32780;

    public RenameVars_process_50593970733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term32401 = new HashSet();
        term32353 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term32441 = newInstance(Class.forName("java.util.TreeSet"));
        Object term32481 = newInstance(Class.forName("java.util.TreeMap"));
        Object term32567 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term32353, term32353.getClass(), "assignmentLog", null);
        setField(term32353, term32353.getClass(), "compiler", null);
        setField(term32353, term32353.getClass(), "reservedNames", term32401);
        setField(term32353, term32353.getClass(), "externNames", term32441);
        setField(term32353, term32353.getClass(), "assignments", term32481);
        setField(term32353, term32353.getClass(), "prevUsedRenameMap", term32567);
        setField(term32353, term32353.getClass(), "prefix", "");
        setField(term32353, term32353.getClass(), "reservedCharacters", null);
        term32780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32780, term32780.getClass(), "type", 0);
        setField(term32815, term32815.getClass(), "next", null);
        setIntField(term32815, term32815.getClass(), "type", 0);
        setField(term32815, term32815.getClass(), "first", null);
        setField(term32780, term32780.getClass(), "first", term32815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term32780;
        args[1] = term32780;
        try {
            callMethod(klass, "process", argTypes, term32353, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


