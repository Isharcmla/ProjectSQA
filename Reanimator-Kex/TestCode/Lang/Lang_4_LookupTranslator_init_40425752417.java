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

public class LookupTranslator_init_40425752417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2887;

    public LookupTranslator_init_40425752417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2877 = new HashMap();
        Object term2829 = newInstance(Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(term2829, term2829.getClass(), "lookupMap", term2877);
        HashMap term2888 = new HashMap();
        term2887 = newInstance(Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(term2887, term2887.getClass(), "lookupMap", term2888);
        setIntField(term2887, term2887.getClass(), "shortest", 2147483647);
        setIntField(term2887, term2887.getClass(), "longest", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.CharSequence"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2887));
    }

};


