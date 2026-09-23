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

public class GlobalNamespace_scanNewNodes_87186497075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14587;
     Object term14641;
     Object term23738;
     Object term23739;

    public GlobalNamespace_scanNewNodes_87186497075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14587 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        term14641 = new LinkedList();
        term23738 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term23738, term23738.getClass(), "compiler", null);
        setField(term23738, term23738.getClass(), "root", null);
        setField(term23738, term23738.getClass(), "externsRoot", null);
        setBooleanField(term23738, term23738.getClass(), "inExterns", false);
        setField(term23738, term23738.getClass(), "externsScope", null);
        setBooleanField(term23738, term23738.getClass(), "generated", false);
        setIntField(term23738, term23738.getClass(), "currentPreOrderIndex", 0);
        setField(term23738, term23738.getClass(), "globalNames", null);
        setField(term23738, term23738.getClass(), "nameMap", null);
        term23739 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term14641;
        callMethod(klass, "scanNewNodes", argTypes, term14587, args);
        assertTrue(recursiveEquals(term14587, term23738));
        assertTrue(recursiveEquals(term14641, term23739));
    }

};


