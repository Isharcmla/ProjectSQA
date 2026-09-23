package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class CaseInsensitiveMap_clone_10037198625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375;

    public CaseInsensitiveMap_clone_10037198625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term503 = new HashMap();
        Set<Object> term611 =  ((Map) term503).keySet();
        HashSet term502 = new HashSet((Collection<? extends Object>) term611);
        ArrayList term508 = new ArrayList();
        term375 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term378 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term379 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term407 = newInstance(Class.forName("java.lang.Object"));
        Object term408 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term436 = newInstance(Class.forName("java.lang.Object"));
        Object term437 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term438 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term440 = newInstance(Class.forName("java.lang.Object"));
        Object term468 = newInstance(Class.forName("java.lang.Object"));
        Object term469 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term496 = newInstance(Class.forName("java.lang.Object"));
        Object term499 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$EntrySet"));
        Object term500 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$KeySet"));
        Object term501 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        setFloatField(term375, term375.getClass(), "loadFactor", 0.75F);
        setIntField(term375, term375.getClass(), "size", -1922583785);
        setField(term379, term379.getClass(), "next", null);
        setField(term379, term379.getClass(), "key", "java.lang.object@6f077129");
        setField(term379, term379.getClass(), "value", term407);
        setElement(term378, 1, term379);
        setField(term408, term408.getClass(), "next", null);
        setField(term408, term408.getClass(), "key", "java.lang.object@4609d1eb");
        setField(term408, term408.getClass(), "value", term436);
        setElement(term378, 9, term408);
        setField(term438, term438.getClass(), "next", null);
        setField(term438, term438.getClass(), "key", "");
        setField(term438, term438.getClass(), "value", term440);
        setField(term437, term437.getClass(), "next", term438);
        setField(term437, term437.getClass(), "key", "java.lang.object@62934468");
        setField(term437, term437.getClass(), "value", term468);
        setElement(term378, 10, term437);
        setField(term469, term469.getClass(), "next", null);
        setField(term469, term469.getClass(), "key", "java.lang.object@d3c629c");
        setField(term469, term469.getClass(), "value", term496);
        setElement(term378, 11, term469);
        setField(term375, term375.getClass(), "data", term378);
        setIntField(term375, term375.getClass(), "threshold", 12);
        setIntField(term375, term375.getClass(), "modCount", -616727349);
        setField(term499, term499.getClass(), "parent", null);
        setField(term375, term375.getClass(), "entrySet", term499);
        setField(term500, term500.getClass(), "parent", null);
        setField(term375, term375.getClass(), "keySet", term500);
        setField(term501, term501.getClass(), "parent", null);
        setField(term375, term375.getClass(), "values", term501);
        setField(term375, term375.getClass(), "keySet", term502);
        setField(term375, term375.getClass(), "values", term508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term375, args);
    }

};


