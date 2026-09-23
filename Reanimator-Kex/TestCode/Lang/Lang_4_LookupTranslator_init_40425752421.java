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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang3.text.translate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LookupTranslator_init_40425752421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3466;

    public LookupTranslator_init_40425752421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3629 = newInstance(Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(term3629, term3629.getClass(), "lookupMap", null);
        term3466 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.CharSequence"), 0).getClass(), 1);
        Object[] term3467 = (Object[]) newArray("java.lang.CharSequence", 0);
        setElement(term3466, 0, term3467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.CharSequence"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3466;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


