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
import java.lang.Object;
import java.util.HashSet;

public class RenameVars_process_50593970743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46195;
     Object term46567;
     Object term46707;

    public RenameVars_process_50593970743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term46323 = new HashSet();
        HashSet term46371 = new HashSet();
        term46195 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term46275 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term46411 = newInstance(Class.forName("java.util.TreeMap"));
        Object term46497 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        char[] term45771 = (char[]) newCharArray(9);
        setField(term46195, term46195.getClass(), "assignmentLog", null);
        setField(term46195, term46195.getClass(), "compiler", term46275);
        setField(term46195, term46195.getClass(), "reservedNames", term46323);
        setField(term46195, term46195.getClass(), "externNames", term46371);
        setField(term46195, term46195.getClass(), "assignments", term46411);
        setField(term46195, term46195.getClass(), "prevUsedRenameMap", term46497);
        setField(term46195, term46195.getClass(), "prefix", null);
        setField(term46195, term46195.getClass(), "reservedCharacters", term45771);
        term46567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46567, term46567.getClass(), "type", 0);
        setField(term46637, term46637.getClass(), "next", null);
        setIntField(term46637, term46637.getClass(), "type", 0);
        setField(term46637, term46637.getClass(), "first", null);
        setField(term46567, term46567.getClass(), "first", term46637);
        term46707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46707, term46707.getClass(), "type", 0);
        setField(term46777, term46777.getClass(), "next", null);
        setIntField(term46777, term46777.getClass(), "type", 0);
        setField(term46777, term46777.getClass(), "first", null);
        setField(term46707, term46707.getClass(), "first", term46777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term46567;
        args[1] = term46707;
        try {
            callMethod(klass, "process", argTypes, term46195, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


