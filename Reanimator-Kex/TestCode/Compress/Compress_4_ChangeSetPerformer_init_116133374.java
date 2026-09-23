package org.apache.commons.compress.changes;

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
import static org.apache.commons.compress.changes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.changes.EqualityUtils.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class ChangeSetPerformer_init_116133374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term65;
     Object term68;

    public ChangeSetPerformer_init_116133374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3 = new LinkedHashMap();
        Set<Object> term72 =  ((Map) term3).keySet();
        LinkedHashSet term2 = new LinkedHashSet((Collection<? extends Object>) term72);
        term1 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSet"));
        setField(term1, term1.getClass(), "changes", term2);
        LinkedHashMap term67 = new LinkedHashMap();
        Set<Object> term73 =  ((Map) term67).keySet();
        LinkedHashSet term66 = new LinkedHashSet((Collection<? extends Object>) term73);
        term65 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        setField(term65, term65.getClass(), "changes", term66);
        LinkedHashMap term70 = new LinkedHashMap();
        Set<Object> term74 =  ((Map) term70).keySet();
        LinkedHashSet term69 = new LinkedHashSet((Collection<? extends Object>) term74);
        term68 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSet"));
        setField(term68, term68.getClass(), "changes", term69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.changes.ChangeSet");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term65));
        assertTrue(recursiveEquals(term1, term68));
    }

};


