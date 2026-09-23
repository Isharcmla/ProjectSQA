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

public class RemoveUnusedVars_isRemovableVar_206319811875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16687;
     Object term17077;

    public RemoveUnusedVars_isRemovableVar_206319811875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term16735 = new HashSet();
        term16687 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object term16995 = newInstance(Class.forName("com.google.javascript.jscomp.GoogleCodingConvention"));
        setBooleanField(term16687, term16687.getClass(), "removeGlobals", true);
        setField(term16687, term16687.getClass(), "referenced", term16735);
        setField(term16687, term16687.getClass(), "codingConvention", term16995);
        term17077 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term17077, term17077.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term17077;
        try {
            callMethod(klass, "isRemovableVar", argTypes, term16687, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


