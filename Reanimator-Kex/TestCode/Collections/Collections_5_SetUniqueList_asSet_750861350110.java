package org.apache.commons.collections.list;

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
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.list.EqualityUtils.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class SetUniqueList_asSet_750861350110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26788;
     Object term27294;
     Object term27286;

    public SetUniqueList_asSet_750861350110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term26836 = new HashSet();
        term26788 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term26788, term26788.getClass(), "set", term26836);
        HashMap term27296 = new HashMap();
        Set<Object> term27297 =  ((Map) term27296).keySet();
        HashSet term27295 = new HashSet((Collection<? extends Object>) term27297);
        term27294 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term27294, term27294.getClass(), "set", term27295);
        setField(term27294, term27294.getClass(), "collection", null);
        HashMap term27288 = new HashMap();
        Set<Object> term27298 =  ((Map) term27288).keySet();
        HashSet term27287 = new HashSet((Collection<? extends Object>) term27298);
        term27286 = newInstance(Class.forName("org.apache.commons.collections.set.UnmodifiableSet"));
        setField(term27286, term27286.getClass(), "collection", term27287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asSet", argTypes, term26788, args);
        assertTrue(recursiveEquals(term26788, term27294));
        assertTrue(recursiveEquals(retValue, term27286));
    }

};


