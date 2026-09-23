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

public class DefaultKeyedValues_rebuildIndex_166396699835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;
     Object term3257;

    public DefaultKeyedValues_rebuildIndex_166396699835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term184 = new ArrayList();
        ArrayList term188 = new ArrayList();
        HashMap term192 = new HashMap();
        term183 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term183, term183.getClass(), "keys", term184);
        setField(term183, term183.getClass(), "values", term188);
        setField(term183, term183.getClass(), "indexMap", term192);
        ArrayList term3258 = new ArrayList();
        ArrayList term3260 = new ArrayList();
        HashMap term3262 = new HashMap();
        term3257 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term3257, term3257.getClass(), "keys", term3258);
        setField(term3257, term3257.getClass(), "values", term3260);
        setField(term3257, term3257.getClass(), "indexMap", term3262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rebuildIndex", argTypes, term183, args);
        assertTrue(recursiveEquals(term183, term3257));
    }

};


