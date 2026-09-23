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
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class RenameVars_init_156486529810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term15;
     Object term17;
     Object term19;
     Object term40;
     Object term46;
     Object term2909;
     Object term2928;
     Object term2933;
     Object term2936;

    public RenameVars_init_156486529810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Boolean(false);
        term15 = new Boolean(false);
        term17 = new Boolean(false);
        HashMap term20 = new HashMap();
        HashMap term30 = new HashMap();
        term19 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term19, term19.getClass(), "map", term20);
        setField(term19, term19.getClass(), "reverseMap", term30);
        term40 = (char[]) newCharArray(5);
        setCharElement(term40, 0, 'P');
        setCharElement(term40, 1, 'A');
        setCharElement(term40, 2, 'E');
        setCharElement(term40, 3, 'B');
        setCharElement(term40, 4, 't');
        HashMap term47 = new HashMap();
        Set<Object> term2952 =  ((Map) term47).keySet();
        term46 = new HashSet((Collection<? extends Object>) term2952);
        ArrayList term2910 = new ArrayList();
        ArrayList term2912 = new ArrayList();
        ArrayList term2914 = new ArrayList();
        HashMap term2917 = new HashMap();
        Set<Object> term2953 =  ((Map) term2917).keySet();
        HashSet term2916 = new HashSet((Collection<? extends Object>) term2953);
        HashMap term2919 = new HashMap();
        Set<Object> term2954 =  ((Map) term2919).keySet();
        HashSet term2918 = new HashSet((Collection<? extends Object>) term2954);
        HashMap term2920 = new HashMap();
        HashMap term2922 = new HashMap();
        HashMap term2923 = new HashMap();
        term2909 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term2921 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        Object term2926 = newInstance(Class.forName("java.util.TreeMap"));
        char[] term2927 = (char[]) newCharArray(5);
        setField(term2909, term2909.getClass(), "compiler", null);
        setField(term2909, term2909.getClass(), "globalNameNodes", term2910);
        setField(term2909, term2909.getClass(), "localNameNodes", term2912);
        setField(term2909, term2909.getClass(), "localTempNames", term2914);
        setField(term2909, term2909.getClass(), "externNames", term2916);
        setField(term2909, term2909.getClass(), "reservedNames", term2918);
        setField(term2909, term2909.getClass(), "renameMap", term2920);
        setField(term2921, term2921.getClass(), "map", term2922);
        setField(term2921, term2921.getClass(), "reverseMap", term2923);
        setField(term2909, term2909.getClass(), "prevUsedRenameMap", term2921);
        setField(term2909, term2909.getClass(), "prefix", "PAEBtnZtTD");
        setIntField(term2909, term2909.getClass(), "assignmentCount", 0);
        setField(term2909, term2909.getClass(), "assignmentLog", null);
        setField(term2926, term2926.getClass(), "comparator", null);
        setField(term2926, term2926.getClass(), "root", null);
        setIntField(term2926, term2926.getClass(), "size", 0);
        setIntField(term2926, term2926.getClass(), "modCount", 0);
        setField(term2926, term2926.getClass(), "entrySet", null);
        setField(term2926, term2926.getClass(), "navigableKeySet", null);
        setField(term2926, term2926.getClass(), "descendingMap", null);
        setField(term2926, term2926.getClass(), "keySet", null);
        setField(term2926, term2926.getClass(), "values", null);
        setField(term2909, term2909.getClass(), "assignments", term2926);
        setBooleanField(term2909, term2909.getClass(), "localRenamingOnly", false);
        setBooleanField(term2909, term2909.getClass(), "preserveAnonymousFunctionNames", false);
        setBooleanField(term2909, term2909.getClass(), "generatePseudoNames", false);
        setCharElement(term2927, 0, 'P');
        setCharElement(term2927, 1, 'A');
        setCharElement(term2927, 2, 'E');
        setCharElement(term2927, 3, 'B');
        setCharElement(term2927, 4, 't');
        setField(term2909, term2909.getClass(), "reservedCharacters", term2927);
        HashMap term2929 = new HashMap();
        Set<Object> term2970 =  ((Map) term2929).keySet();
        term2928 = new HashSet((Collection<? extends Object>) term2970);
        HashMap term2934 = new HashMap();
        HashMap term2935 = new HashMap();
        term2933 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term2933, term2933.getClass(), "map", term2934);
        setField(term2933, term2933.getClass(), "reverseMap", term2935);
        term2936 = (char[]) newCharArray(5);
        setCharElement(term2936, 0, 'P');
        setCharElement(term2936, 1, 'A');
        setCharElement(term2936, 2, 'E');
        setCharElement(term2936, 3, 'B');
        setCharElement(term2936, 4, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = Class.forName("com.google.javascript.jscomp.VariableMap");
        argTypes[6] = Array.newInstance(char.class, 0).getClass();
        argTypes[7] = Class.forName("java.util.Set");
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        args[2] = term13;
        args[3] = term15;
        args[4] = term17;
        args[5] = term19;
        args[6] = term40;
        args[7] = term46;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2909));
        assertTrue(recursiveEquals(term13, "PAEBtnZtTD"));
        assertTrue(recursiveEquals(term15, false));
        assertTrue(recursiveEquals(term17, false));
        assertTrue(recursiveEquals(term19, false));
        assertTrue(recursiveEquals(term40, term2933));
        assertTrue(recursiveEquals(term46, term2936));
    }

};


