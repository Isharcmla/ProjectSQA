package org.apache.commons.collections4.list;

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
import static org.apache.commons.collections4.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.list.EqualityUtils.*;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SetUniqueList_setUniqueList_172920916445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5682;
     Object term5771;
     Object term5764;

    public SetUniqueList_setUniqueList_172920916445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5682 = new LinkedList();
        term5771 = new LinkedList();
        HashMap term5766 = new HashMap();
        Set<Object> term5772 =  ((Map) term5766).keySet();
        HashSet term5765 = new HashSet((Collection<? extends Object>) term5772);
        LinkedList term5760 = new LinkedList();
        term5764 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term5764, term5764.getClass(), "set", term5765);
        setField(term5764, term5764.getClass(), "collection", term5760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5682;
        Object retValue = callMethod(klass, "setUniqueList", argTypes, null, args);
        assertTrue(recursiveEquals(term5682, term5771));
        assertTrue(recursiveEquals(retValue, term5764));
    }

};


