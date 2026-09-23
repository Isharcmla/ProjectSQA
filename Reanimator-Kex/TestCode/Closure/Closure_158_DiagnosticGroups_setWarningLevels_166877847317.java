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

public class DiagnosticGroups_setWarningLevels_166877847317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24448;
     Object term24502;
     Object term24560;
     Object term24561;

    public DiagnosticGroups_setWarningLevels_166877847317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24448 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroups"));
        term24502 = new LinkedList();
        term24560 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroups"));
        term24561 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DiagnosticGroups");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term24502;
        args[2] = null;
        callMethod(klass, "setWarningLevels", argTypes, term24448, args);
        assertTrue(recursiveEquals(term24448, term24560));
        assertTrue(recursiveEquals(term24502, term24561));
    }

};


