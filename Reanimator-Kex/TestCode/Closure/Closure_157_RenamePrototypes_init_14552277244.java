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
import java.lang.Boolean;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RenamePrototypes_init_14552277244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term9;
     Object term434;
     Object term451;
     Object term452;

    public RenamePrototypes_init_14552277244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term3 = (char[]) newCharArray(5);
        setCharElement(term3, 0, 'P');
        setCharElement(term3, 1, 'A');
        setCharElement(term3, 2, 'E');
        setCharElement(term3, 3, 'B');
        setCharElement(term3, 4, 't');
        HashMap term10 = new HashMap();
        HashMap term20 = new HashMap();
        term9 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term9, term9.getClass(), "map", term10);
        setField(term9, term9.getClass(), "reverseMap", term20);
        HashMap term437 = new HashMap();
        HashMap term438 = new HashMap();
        HashMap term440 = new HashMap();
        Set<Object> term465 =  ((Map) term440).keySet();
        HashSet term439 = new HashSet((Collection<? extends Object>) term465);
        HashMap term441 = new HashMap();
        HashMap term443 = new HashMap();
        Set<Object> term466 =  ((Map) term443).keySet();
        HashSet term442 = new HashSet((Collection<? extends Object>) term466);
        HashMap term450 = new HashMap();
        Set<Object> term467 =  ((Map) term450).keySet();
        HashSet term449 = new HashSet((Collection<? extends Object>) term467);
        term434 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        char[] term435 = (char[]) newCharArray(5);
        Object term436 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term434, term434.getClass(), "compiler", null);
        setBooleanField(term434, term434.getClass(), "aggressiveRenaming", false);
        setCharElement(term435, 0, 'P');
        setCharElement(term435, 1, 'A');
        setCharElement(term435, 2, 'E');
        setCharElement(term435, 3, 'B');
        setCharElement(term435, 4, 't');
        setField(term434, term434.getClass(), "reservedCharacters", term435);
        setField(term436, term436.getClass(), "map", term437);
        setField(term436, term436.getClass(), "reverseMap", term438);
        setField(term434, term434.getClass(), "prevUsedRenameMap", term436);
        setField(term434, term434.getClass(), "stringNodes", term439);
        setField(term434, term434.getClass(), "properties", term441);
        setField(term434, term434.getClass(), "reservedNames", term442);
        setField(term434, term434.getClass(), "prototypeObjLits", term449);
        term451 = (char[]) newCharArray(5);
        setCharElement(term451, 0, 'P');
        setCharElement(term451, 1, 'A');
        setCharElement(term451, 2, 'E');
        setCharElement(term451, 3, 'B');
        setCharElement(term451, 4, 't');
        HashMap term453 = new HashMap();
        HashMap term454 = new HashMap();
        term452 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term452, term452.getClass(), "map", term453);
        setField(term452, term452.getClass(), "reverseMap", term454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = boolean.class;
        argTypes[2] = Array.newInstance(char.class, 0).getClass();
        argTypes[3] = Class.forName("com.google.javascript.jscomp.VariableMap");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term1;
        args[2] = term3;
        args[3] = term9;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term434));
        assertTrue(recursiveEquals(term1, false));
        assertTrue(recursiveEquals(term3, term451));
        assertTrue(recursiveEquals(term9, term452));
    }

};


