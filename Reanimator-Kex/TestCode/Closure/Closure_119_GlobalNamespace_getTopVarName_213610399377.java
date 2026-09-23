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

public class GlobalNamespace_getTopVarName_213610399377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14909;
     Object term23755;

    public GlobalNamespace_getTopVarName_213610399377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14909 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        term23755 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term23755, term23755.getClass(), "compiler", null);
        setField(term23755, term23755.getClass(), "root", null);
        setField(term23755, term23755.getClass(), "externsRoot", null);
        setBooleanField(term23755, term23755.getClass(), "inExterns", false);
        setField(term23755, term23755.getClass(), "externsScope", null);
        setBooleanField(term23755, term23755.getClass(), "generated", false);
        setIntField(term23755, term23755.getClass(), "currentPreOrderIndex", 0);
        setField(term23755, term23755.getClass(), "globalNames", null);
        setField(term23755, term23755.getClass(), "nameMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getTopVarName", argTypes, term14909, args);
        assertTrue(recursiveEquals(term14909, term23755));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


