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

public class RenameVars_reusePreviouslyUsedVariableMap_185263154326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15743;
     Object term16505;

    public RenameVars_reusePreviouslyUsedVariableMap_185263154326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15743 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term15783 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term15743, term15743.getClass(), "assignments", term15783);
        term16505 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term16506 = newInstance(Class.forName("java.util.TreeMap"));
        Object term16507 = newInstance(Class.forName("java.util.TreeMap$Values"));
        setField(term16505, term16505.getClass(), "compiler", null);
        setField(term16505, term16505.getClass(), "globalNameNodes", null);
        setField(term16505, term16505.getClass(), "localNameNodes", null);
        setField(term16505, term16505.getClass(), "localTempNames", null);
        setField(term16505, term16505.getClass(), "externNames", null);
        setField(term16505, term16505.getClass(), "reservedNames", null);
        setField(term16505, term16505.getClass(), "renameMap", null);
        setField(term16505, term16505.getClass(), "prevUsedRenameMap", null);
        setField(term16505, term16505.getClass(), "prefix", null);
        setIntField(term16505, term16505.getClass(), "assignmentCount", 0);
        setField(term16505, term16505.getClass(), "assignmentLog", null);
        setField(term16506, term16506.getClass(), "comparator", null);
        setField(term16506, term16506.getClass(), "root", null);
        setIntField(term16506, term16506.getClass(), "size", 0);
        setIntField(term16506, term16506.getClass(), "modCount", 0);
        setField(term16506, term16506.getClass(), "entrySet", null);
        setField(term16506, term16506.getClass(), "navigableKeySet", null);
        setField(term16506, term16506.getClass(), "descendingMap", null);
        setField(term16506, term16506.getClass(), "keySet", null);
        setField(term16507, term16507.getClass(), "this$0", term16506);
        setField(term16506, term16506.getClass(), "values", term16507);
        setField(term16505, term16505.getClass(), "assignments", term16506);
        setBooleanField(term16505, term16505.getClass(), "localRenamingOnly", false);
        setBooleanField(term16505, term16505.getClass(), "preserveAnonymousFunctionNames", false);
        setBooleanField(term16505, term16505.getClass(), "generatePseudoNames", false);
        setField(term16505, term16505.getClass(), "reservedCharacters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reusePreviouslyUsedVariableMap", argTypes, term15743, args);
        assertTrue(recursiveEquals(term15743, term16505));
    }

};


