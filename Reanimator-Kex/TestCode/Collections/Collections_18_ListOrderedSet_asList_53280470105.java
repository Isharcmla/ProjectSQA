package org.apache.commons.collections.set;

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
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.set.EqualityUtils.*;
import java.util.ArrayList;

public class ListOrderedSet_asList_53280470105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16522;
     Object term16873;
     Object term16867;

    public ListOrderedSet_asList_53280470105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16574 = new ArrayList();
        term16522 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term16522, term16522.getClass(), "setOrder", term16574);
        ArrayList term16874 = new ArrayList();
        term16873 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term16873, term16873.getClass(), "setOrder", term16874);
        setField(term16873, term16873.getClass(), "collection", null);
        ArrayList term16868 = new ArrayList();
        term16867 = newInstance(Class.forName("org.apache.commons.collections.list.UnmodifiableList"));
        setField(term16867, term16867.getClass(), "collection", term16868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asList", argTypes, term16522, args);
        assertTrue(recursiveEquals(term16522, term16873));
        assertTrue(recursiveEquals(retValue, term16867));
    }

};


