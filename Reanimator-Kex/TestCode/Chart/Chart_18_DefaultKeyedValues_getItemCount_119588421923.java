package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultKeyedValues_getItemCount_119588421923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term393;

    public DefaultKeyedValues_getItemCount_119588421923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        ArrayList term6 = new ArrayList();
        HashMap term10 = new HashMap();
        term1 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term1, term1.getClass(), "keys", term2);
        setField(term1, term1.getClass(), "values", term6);
        setField(term1, term1.getClass(), "indexMap", term10);
        ArrayList term394 = new ArrayList();
        ArrayList term396 = new ArrayList();
        HashMap term398 = new HashMap();
        term393 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term393, term393.getClass(), "keys", term394);
        setField(term393, term393.getClass(), "values", term396);
        setField(term393, term393.getClass(), "indexMap", term398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getItemCount", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term393));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


