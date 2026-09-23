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
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SetUniqueList_decorate_176823377641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6820;
     Object term6845;
     Object term6838;

    public SetUniqueList_decorate_176823377641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6820 = new LinkedList();
        term6845 = new LinkedList();
        HashMap term6840 = new HashMap();
        Set<Object> term6846 =  ((Map) term6840).keySet();
        HashSet term6839 = new HashSet((Collection<? extends Object>) term6846);
        LinkedList term6834 = new LinkedList();
        term6838 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term6838, term6838.getClass(), "set", term6839);
        setField(term6838, term6838.getClass(), "collection", term6834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term6820;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term6820, term6845));
        assertTrue(recursiveEquals(retValue, term6838));
    }

};


