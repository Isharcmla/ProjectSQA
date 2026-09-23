package org.apache.commons.lang3.text.translate;

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
import static org.apache.commons.lang3.text.translate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.text.translate.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class LookupTranslator_init_4042575245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637;
     Object term860;
     Object term862;

    public LookupTranslator_init_4042575245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term848 = new HashMap();
        Object term800 = newInstance(Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(term800, term800.getClass(), "lookupMap", term848);
        term637 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.CharSequence"), 0).getClass(), 0);
        HashMap term861 = new HashMap();
        term860 = newInstance(Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(term860, term860.getClass(), "lookupMap", term861);
        setIntField(term860, term860.getClass(), "shortest", 2147483647);
        setIntField(term860, term860.getClass(), "longest", 0);
        term862 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.CharSequence"), 0).getClass(), 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.CharSequence"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term637;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term860));
        assertTrue(recursiveEquals(term637, term862));
    }

};


