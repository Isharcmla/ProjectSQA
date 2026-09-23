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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class RenameVars_assignNames_17546192541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43768;
     Object term43902;
     Object term44298;
     Object term44303;

    public RenameVars_assignNames_17546192541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term43816 = new HashSet();
        term43768 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        setField(term43768, term43768.getClass(), "reservedNames", term43816);
        setField(term43768, term43768.getClass(), "prefix", "");
        setField(term43768, term43768.getClass(), "reservedCharacters", null);
        term43902 = new HashSet();
        HashMap term44300 = new HashMap();
        Set<Object> term44306 =  ((Map) term44300).keySet();
        HashSet term44299 = new HashSet((Collection<? extends Object>) term44306);
        term44298 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        setField(term44298, term44298.getClass(), "compiler", null);
        setField(term44298, term44298.getClass(), "globalNameNodes", null);
        setField(term44298, term44298.getClass(), "localNameNodes", null);
        setField(term44298, term44298.getClass(), "localTempNames", null);
        setField(term44298, term44298.getClass(), "externNames", null);
        setField(term44298, term44298.getClass(), "reservedNames", term44299);
        setField(term44298, term44298.getClass(), "renameMap", null);
        setField(term44298, term44298.getClass(), "prevUsedRenameMap", null);
        setField(term44298, term44298.getClass(), "prefix", "");
        setIntField(term44298, term44298.getClass(), "assignmentCount", 0);
        setField(term44298, term44298.getClass(), "assignmentLog", null);
        setField(term44298, term44298.getClass(), "assignments", null);
        setBooleanField(term44298, term44298.getClass(), "localRenamingOnly", false);
        setBooleanField(term44298, term44298.getClass(), "preserveAnonymousFunctionNames", false);
        setBooleanField(term44298, term44298.getClass(), "generatePseudoNames", false);
        setField(term44298, term44298.getClass(), "reservedCharacters", null);
        HashMap term44304 = new HashMap();
        Set<Object> term44307 =  ((Map) term44304).keySet();
        term44303 = new HashSet((Collection<? extends Object>) term44307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term43902;
        callMethod(klass, "assignNames", argTypes, term43768, args);
        assertTrue(recursiveEquals(term43768, term44298));
        assertTrue(recursiveEquals(term43902, term44303));
    }

};


