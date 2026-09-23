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

public class SetUniqueList_setUniqueList_172920916491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22290;
     Object term22367;
     Object term22360;

    public SetUniqueList_setUniqueList_172920916491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22290 = new LinkedList();
        term22367 = new LinkedList();
        HashMap term22362 = new HashMap();
        Set<Object> term22368 =  ((Map) term22362).keySet();
        HashSet term22361 = new HashSet((Collection<? extends Object>) term22368);
        LinkedList term22356 = new LinkedList();
        term22360 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term22360, term22360.getClass(), "set", term22361);
        setField(term22360, term22360.getClass(), "collection", term22356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term22290;
        Object retValue = callMethod(klass, "setUniqueList", argTypes, null, args);
        assertTrue(recursiveEquals(term22290, term22367));
        assertTrue(recursiveEquals(retValue, term22360));
    }

};


