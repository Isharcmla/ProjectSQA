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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.text.translate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LookupTranslator_init_4042575242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public LookupTranslator_init_4042575242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.CharSequence"), 0).getClass(), 5);
        Object[] term2 = (Object[]) newArray("java.lang.CharSequence", 4);
        Object[] term3 = (Object[]) newArray("java.lang.CharSequence", 3);
        Object[] term4 = (Object[]) newArray("java.lang.CharSequence", 4);
        Object[] term5 = (Object[]) newArray("java.lang.CharSequence", 1);
        Object[] term6 = (Object[]) newArray("java.lang.CharSequence", 6);
        setElement(term1, 0, term2);
        setElement(term1, 1, term3);
        setElement(term1, 2, term4);
        setElement(term1, 3, term5);
        setElement(term1, 4, term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.CharSequence"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


