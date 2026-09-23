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
import java.util.HashMap;
import java.lang.Object;

public class RenamePrototypes_getPropertyMap_235964419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1066;
     Object term1240;
     Object term1220;

    public RenamePrototypes_getPropertyMap_235964419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1114 = new HashMap();
        term1066 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        setField(term1066, term1066.getClass(), "properties", term1114);
        HashMap term1241 = new HashMap();
        term1240 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        setField(term1240, term1240.getClass(), "compiler", null);
        setBooleanField(term1240, term1240.getClass(), "aggressiveRenaming", false);
        setField(term1240, term1240.getClass(), "reservedCharacters", null);
        setField(term1240, term1240.getClass(), "prevUsedRenameMap", null);
        setField(term1240, term1240.getClass(), "stringNodes", null);
        setField(term1240, term1240.getClass(), "properties", term1241);
        setField(term1240, term1240.getClass(), "reservedNames", null);
        setField(term1240, term1240.getClass(), "prototypeObjLits", null);
        HashMap term1222 = new HashMap();
        term1220 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        Object term1221 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term1221, term1221.getClass(), "m", term1222);
        setField(term1221, term1221.getClass(), "keySet", null);
        setField(term1221, term1221.getClass(), "entrySet", null);
        setField(term1221, term1221.getClass(), "values", null);
        setField(term1220, term1220.getClass(), "map", term1221);
        setField(term1220, term1220.getClass(), "reverseMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPropertyMap", argTypes, term1066, args);
        assertTrue(recursiveEquals(term1066, term1240));
        assertTrue(recursiveEquals(retValue, term1220));
    }

};


