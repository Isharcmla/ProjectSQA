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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RenameLabels_init_16013943533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694;

    public RenameLabels_init_16013943533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term698 = new HashMap();
        Set<Object> term703 =  ((Map) term698).keySet();
        HashSet term697 = new HashSet((Collection<? extends Object>) term703);
        term694 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term695 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels$DefaultNameSupplier"));
        Object term696 = newInstance(Class.forName("com.google.javascript.jscomp.NameGenerator"));
        char[] term701 = (char[]) newCharArray(53);
        char[] term702 = (char[]) newCharArray(64);
        setField(term694, term694.getClass(), "compiler", null);
        setField(term696, term696.getClass(), "reservedNames", term697);
        setField(term696, term696.getClass(), "prefix", "");
        setIntField(term696, term696.getClass(), "nameCount", 0);
        setCharElement(term701, 0, 'a');
        setCharElement(term701, 1, 'b');
        setCharElement(term701, 2, 'c');
        setCharElement(term701, 3, 'd');
        setCharElement(term701, 4, 'e');
        setCharElement(term701, 5, 'f');
        setCharElement(term701, 6, 'g');
        setCharElement(term701, 7, 'h');
        setCharElement(term701, 8, 'i');
        setCharElement(term701, 9, 'j');
        setCharElement(term701, 10, 'k');
        setCharElement(term701, 11, 'l');
        setCharElement(term701, 12, 'm');
        setCharElement(term701, 13, 'n');
        setCharElement(term701, 14, 'o');
        setCharElement(term701, 15, 'p');
        setCharElement(term701, 16, 'q');
        setCharElement(term701, 17, 'r');
        setCharElement(term701, 18, 's');
        setCharElement(term701, 19, 't');
        setCharElement(term701, 20, 'u');
        setCharElement(term701, 21, 'v');
        setCharElement(term701, 22, 'w');
        setCharElement(term701, 23, 'x');
        setCharElement(term701, 24, 'y');
        setCharElement(term701, 25, 'z');
        setCharElement(term701, 26, 'A');
        setCharElement(term701, 27, 'B');
        setCharElement(term701, 28, 'C');
        setCharElement(term701, 29, 'D');
        setCharElement(term701, 30, 'E');
        setCharElement(term701, 31, 'F');
        setCharElement(term701, 32, 'G');
        setCharElement(term701, 33, 'H');
        setCharElement(term701, 34, 'I');
        setCharElement(term701, 35, 'J');
        setCharElement(term701, 36, 'K');
        setCharElement(term701, 37, 'L');
        setCharElement(term701, 38, 'M');
        setCharElement(term701, 39, 'N');
        setCharElement(term701, 40, 'O');
        setCharElement(term701, 41, 'P');
        setCharElement(term701, 42, 'Q');
        setCharElement(term701, 43, 'R');
        setCharElement(term701, 44, 'S');
        setCharElement(term701, 45, 'T');
        setCharElement(term701, 46, 'U');
        setCharElement(term701, 47, 'V');
        setCharElement(term701, 48, 'W');
        setCharElement(term701, 49, 'X');
        setCharElement(term701, 50, 'Y');
        setCharElement(term701, 51, 'Z');
        setCharElement(term701, 52, (char) 36);
        setField(term696, term696.getClass(), "firstChars", term701);
        setCharElement(term702, 0, 'a');
        setCharElement(term702, 1, 'b');
        setCharElement(term702, 2, 'c');
        setCharElement(term702, 3, 'd');
        setCharElement(term702, 4, 'e');
        setCharElement(term702, 5, 'f');
        setCharElement(term702, 6, 'g');
        setCharElement(term702, 7, 'h');
        setCharElement(term702, 8, 'i');
        setCharElement(term702, 9, 'j');
        setCharElement(term702, 10, 'k');
        setCharElement(term702, 11, 'l');
        setCharElement(term702, 12, 'm');
        setCharElement(term702, 13, 'n');
        setCharElement(term702, 14, 'o');
        setCharElement(term702, 15, 'p');
        setCharElement(term702, 16, 'q');
        setCharElement(term702, 17, 'r');
        setCharElement(term702, 18, 's');
        setCharElement(term702, 19, 't');
        setCharElement(term702, 20, 'u');
        setCharElement(term702, 21, 'v');
        setCharElement(term702, 22, 'w');
        setCharElement(term702, 23, 'x');
        setCharElement(term702, 24, 'y');
        setCharElement(term702, 25, 'z');
        setCharElement(term702, 26, 'A');
        setCharElement(term702, 27, 'B');
        setCharElement(term702, 28, 'C');
        setCharElement(term702, 29, 'D');
        setCharElement(term702, 30, 'E');
        setCharElement(term702, 31, 'F');
        setCharElement(term702, 32, 'G');
        setCharElement(term702, 33, 'H');
        setCharElement(term702, 34, 'I');
        setCharElement(term702, 35, 'J');
        setCharElement(term702, 36, 'K');
        setCharElement(term702, 37, 'L');
        setCharElement(term702, 38, 'M');
        setCharElement(term702, 39, 'N');
        setCharElement(term702, 40, 'O');
        setCharElement(term702, 41, 'P');
        setCharElement(term702, 42, 'Q');
        setCharElement(term702, 43, 'R');
        setCharElement(term702, 44, 'S');
        setCharElement(term702, 45, 'T');
        setCharElement(term702, 46, 'U');
        setCharElement(term702, 47, 'V');
        setCharElement(term702, 48, 'W');
        setCharElement(term702, 49, 'X');
        setCharElement(term702, 50, 'Y');
        setCharElement(term702, 51, 'Z');
        setCharElement(term702, 52, (char) 95);
        setCharElement(term702, 53, (char) 48);
        setCharElement(term702, 54, (char) 49);
        setCharElement(term702, 55, (char) 50);
        setCharElement(term702, 56, (char) 51);
        setCharElement(term702, 57, (char) 52);
        setCharElement(term702, 58, (char) 53);
        setCharElement(term702, 59, (char) 54);
        setCharElement(term702, 60, (char) 55);
        setCharElement(term702, 61, (char) 56);
        setCharElement(term702, 62, (char) 57);
        setCharElement(term702, 63, (char) 36);
        setField(term696, term696.getClass(), "nonFirstChars", term702);
        setField(term695, term695.getClass(), "nameGenerator", term696);
        setField(term694, term694.getClass(), "nameSupplier", term695);
        setBooleanField(term694, term694.getClass(), "removeUnused", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term694));
    }

};


