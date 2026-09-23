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

public class RenameVars_getPseudoName_166687519325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15637;
     Object term16487;

    public RenameVars_getPseudoName_166687519325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15637 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        setBooleanField(term15637, term15637.getClass(), "generatePseudoNames", true);
        term16487 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        setField(term16487, term16487.getClass(), "compiler", null);
        setField(term16487, term16487.getClass(), "globalNameNodes", null);
        setField(term16487, term16487.getClass(), "localNameNodes", null);
        setField(term16487, term16487.getClass(), "localTempNames", null);
        setField(term16487, term16487.getClass(), "externNames", null);
        setField(term16487, term16487.getClass(), "reservedNames", null);
        setField(term16487, term16487.getClass(), "renameMap", null);
        setField(term16487, term16487.getClass(), "prevUsedRenameMap", null);
        setField(term16487, term16487.getClass(), "prefix", null);
        setIntField(term16487, term16487.getClass(), "assignmentCount", 0);
        setField(term16487, term16487.getClass(), "assignmentLog", null);
        setField(term16487, term16487.getClass(), "assignments", null);
        setBooleanField(term16487, term16487.getClass(), "localRenamingOnly", false);
        setBooleanField(term16487, term16487.getClass(), "preserveAnonymousFunctionNames", false);
        setBooleanField(term16487, term16487.getClass(), "generatePseudoNames", true);
        setField(term16487, term16487.getClass(), "reservedCharacters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getPseudoName", argTypes, term15637, args);
        assertTrue(recursiveEquals(term15637, term16487));
        assertTrue(recursiveEquals(retValue, "$null$$"));
    }

};


