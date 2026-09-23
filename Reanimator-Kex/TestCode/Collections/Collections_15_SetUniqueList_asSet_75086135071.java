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

public class SetUniqueList_asSet_75086135071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15131;
     Object term15204;
     Object term15196;

    public SetUniqueList_asSet_75086135071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term15179 = new HashSet();
        term15131 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term15131, term15131.getClass(), "set", term15179);
        HashMap term15206 = new HashMap();
        Set<Object> term15207 =  ((Map) term15206).keySet();
        HashSet term15205 = new HashSet((Collection<? extends Object>) term15207);
        term15204 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term15204, term15204.getClass(), "set", term15205);
        setField(term15204, term15204.getClass(), "collection", null);
        HashMap term15198 = new HashMap();
        Set<Object> term15208 =  ((Map) term15198).keySet();
        HashSet term15197 = new HashSet((Collection<? extends Object>) term15208);
        term15196 = newInstance(Class.forName("org.apache.commons.collections.set.UnmodifiableSet"));
        setField(term15196, term15196.getClass(), "collection", term15197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asSet", argTypes, term15131, args);
        assertTrue(recursiveEquals(term15131, term15204));
        assertTrue(recursiveEquals(retValue, term15196));
    }

};


