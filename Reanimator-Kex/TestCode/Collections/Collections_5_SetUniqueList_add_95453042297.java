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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class SetUniqueList_add_95453042297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22908;
     Object term23133;

    public SetUniqueList_add_95453042297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term22956 = new HashSet();
        ArrayList term23056 = new ArrayList();
        term22908 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term22908, term22908.getClass(), "set", term22956);
        setField(term22908, term22908.getClass(), "collection", term23056);
        HashMap term23135 = new HashMap();
        Set<Object> term23140 =  ((Map) term23135).keySet();
        HashSet term23134 = new HashSet((Collection<? extends Object>) term23140);
        ArrayList term23138 = new ArrayList();
        ((ArrayList) term23138).add((Object)null);
        term23133 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term23133, term23133.getClass(), "set", term23134);
        setField(term23133, term23133.getClass(), "collection", term23138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        callMethod(klass, "add", argTypes, term22908, args);
        assertTrue(recursiveEquals(term22908, term23133));
    }

};


