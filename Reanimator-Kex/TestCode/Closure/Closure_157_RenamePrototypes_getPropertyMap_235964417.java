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

public class RenamePrototypes_getPropertyMap_235964417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304;
     Object term868;
     Object term815;

    public RenamePrototypes_getPropertyMap_235964417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term311 = new HashMap();
        HashMap term319 = new HashMap();
        HashMap term328 = new HashMap();
        Set<Object> term884 =  ((Map) term328).keySet();
        HashSet term327 = new HashSet((Collection<? extends Object>) term884);
        HashMap term342 = new HashMap();
        HashMap term356 = new HashMap();
        Set<Object> term885 =  ((Map) term356).keySet();
        HashSet term355 = new HashSet((Collection<? extends Object>) term885);
        HashMap term362 = new HashMap();
        Set<Object> term886 =  ((Map) term362).keySet();
        HashSet term361 = new HashSet((Collection<? extends Object>) term886);
        term304 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        char[] term306 = (char[]) newCharArray(3);
        Object term310 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term304, term304.getClass(), "compiler", null);
        setBooleanField(term304, term304.getClass(), "aggressiveRenaming", false);
        setCharElement(term306, 0, 'E');
        setCharElement(term306, 1, 't');
        setCharElement(term306, 2, 'R');
        setField(term304, term304.getClass(), "reservedCharacters", term306);
        setField(term310, term310.getClass(), "map", term311);
        setField(term310, term310.getClass(), "reverseMap", term319);
        setField(term304, term304.getClass(), "prevUsedRenameMap", term310);
        setField(term304, term304.getClass(), "stringNodes", term327);
        setField(term304, term304.getClass(), "properties", term342);
        setField(term304, term304.getClass(), "reservedNames", term355);
        setField(term304, term304.getClass(), "prototypeObjLits", term361);
        HashMap term871 = new HashMap();
        HashMap term872 = new HashMap();
        HashMap term874 = new HashMap();
        Set<Object> term890 =  ((Map) term874).keySet();
        HashSet term873 = new HashSet((Collection<? extends Object>) term890);
        HashMap term875 = new HashMap();
        HashMap term878 = new HashMap();
        Set<Object> term891 =  ((Map) term878).keySet();
        HashSet term877 = new HashSet((Collection<? extends Object>) term891);
        HashMap term880 = new HashMap();
        Set<Object> term892 =  ((Map) term880).keySet();
        HashSet term879 = new HashSet((Collection<? extends Object>) term892);
        term868 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        char[] term869 = (char[]) newCharArray(3);
        Object term870 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term868, term868.getClass(), "compiler", null);
        setBooleanField(term868, term868.getClass(), "aggressiveRenaming", false);
        setCharElement(term869, 0, 'E');
        setCharElement(term869, 1, 't');
        setCharElement(term869, 2, 'R');
        setField(term868, term868.getClass(), "reservedCharacters", term869);
        setField(term870, term870.getClass(), "map", term871);
        setField(term870, term870.getClass(), "reverseMap", term872);
        setField(term868, term868.getClass(), "prevUsedRenameMap", term870);
        setField(term868, term868.getClass(), "stringNodes", term873);
        setField(term868, term868.getClass(), "properties", term875);
        setField(term868, term868.getClass(), "reservedNames", term877);
        setField(term868, term868.getClass(), "prototypeObjLits", term879);
        HashMap term817 = new HashMap();
        term815 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        Object term816 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term816, term816.getClass(), "m", term817);
        setField(term816, term816.getClass(), "keySet", null);
        setField(term816, term816.getClass(), "entrySet", null);
        setField(term816, term816.getClass(), "values", null);
        setField(term815, term815.getClass(), "map", term816);
        setField(term815, term815.getClass(), "reverseMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPropertyMap", argTypes, term304, args);
        assertTrue(recursiveEquals(term304, term868));
        assertTrue(recursiveEquals(retValue, term815));
    }

};


