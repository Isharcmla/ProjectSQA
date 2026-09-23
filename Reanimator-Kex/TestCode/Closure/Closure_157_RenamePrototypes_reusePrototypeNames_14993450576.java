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

public class RenamePrototypes_reusePrototypeNames_14993450576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;
     Object term250;
     Object term779;
     Object term791;

    public RenamePrototypes_reusePrototypeNames_14993450576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term176 = new HashMap();
        HashMap term184 = new HashMap();
        HashMap term193 = new HashMap();
        Set<Object> term800 =  ((Map) term193).keySet();
        HashSet term192 = new HashSet((Collection<? extends Object>) term800);
        HashMap term203 = new HashMap();
        HashMap term217 = new HashMap();
        Set<Object> term801 =  ((Map) term217).keySet();
        HashSet term216 = new HashSet((Collection<? extends Object>) term801);
        HashMap term236 = new HashMap();
        Set<Object> term802 =  ((Map) term236).keySet();
        HashSet term235 = new HashSet((Collection<? extends Object>) term802);
        term166 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        char[] term168 = (char[]) newCharArray(6);
        Object term175 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term166, term166.getClass(), "compiler", null);
        setBooleanField(term166, term166.getClass(), "aggressiveRenaming", false);
        setCharElement(term168, 0, 'D');
        setCharElement(term168, 1, 's');
        setCharElement(term168, 2, 'j');
        setCharElement(term168, 3, 'l');
        setCharElement(term168, 4, 'J');
        setCharElement(term168, 5, 'A');
        setField(term166, term166.getClass(), "reservedCharacters", term168);
        setField(term175, term175.getClass(), "map", term176);
        setField(term175, term175.getClass(), "reverseMap", term184);
        setField(term166, term166.getClass(), "prevUsedRenameMap", term175);
        setField(term166, term166.getClass(), "stringNodes", term192);
        setField(term166, term166.getClass(), "properties", term203);
        setField(term166, term166.getClass(), "reservedNames", term216);
        setField(term166, term166.getClass(), "prototypeObjLits", term235);
        HashMap term251 = new HashMap();
        Set<Object> term803 =  ((Map) term251).keySet();
        term250 = new HashSet((Collection<? extends Object>) term803);
        HashMap term782 = new HashMap();
        HashMap term783 = new HashMap();
        HashMap term785 = new HashMap();
        Set<Object> term810 =  ((Map) term785).keySet();
        HashSet term784 = new HashSet((Collection<? extends Object>) term810);
        HashMap term786 = new HashMap();
        HashMap term788 = new HashMap();
        Set<Object> term811 =  ((Map) term788).keySet();
        HashSet term787 = new HashSet((Collection<? extends Object>) term811);
        HashMap term790 = new HashMap();
        Set<Object> term812 =  ((Map) term790).keySet();
        HashSet term789 = new HashSet((Collection<? extends Object>) term812);
        term779 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        char[] term780 = (char[]) newCharArray(6);
        Object term781 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term779, term779.getClass(), "compiler", null);
        setBooleanField(term779, term779.getClass(), "aggressiveRenaming", false);
        setCharElement(term780, 0, 'D');
        setCharElement(term780, 1, 's');
        setCharElement(term780, 2, 'j');
        setCharElement(term780, 3, 'l');
        setCharElement(term780, 4, 'J');
        setCharElement(term780, 5, 'A');
        setField(term779, term779.getClass(), "reservedCharacters", term780);
        setField(term781, term781.getClass(), "map", term782);
        setField(term781, term781.getClass(), "reverseMap", term783);
        setField(term779, term779.getClass(), "prevUsedRenameMap", term781);
        setField(term779, term779.getClass(), "stringNodes", term784);
        setField(term779, term779.getClass(), "properties", term786);
        setField(term779, term779.getClass(), "reservedNames", term787);
        setField(term779, term779.getClass(), "prototypeObjLits", term789);
        HashMap term792 = new HashMap();
        Set<Object> term813 =  ((Map) term792).keySet();
        term791 = new HashSet((Collection<? extends Object>) term813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term250;
        callMethod(klass, "reusePrototypeNames", argTypes, term166, args);
        assertTrue(recursiveEquals(term166, term779));
        assertTrue(recursiveEquals(term250, term791));
    }

};


