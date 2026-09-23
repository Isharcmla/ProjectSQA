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

public class SetUniqueList_createSetBasedOnList_85260900075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13093;
     Object term13117;
     Object term13169;
     Object term13188;
     Object term13189;
     Object term13191;
     Object term13171;

    public SetUniqueList_createSetBasedOnList_85260900075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13093 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        term13117 = new HashSet();
        term13169 = new ArrayList();
        term13188 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term13188, term13188.getClass(), "set", null);
        setField(term13188, term13188.getClass(), "collection", null);
        HashMap term13190 = new HashMap();
        Set<Object> term13193 =  ((Map) term13190).keySet();
        term13189 = new HashSet((Collection<? extends Object>) term13193);
        term13191 = new ArrayList();
        HashMap term13172 = new HashMap();
        Set<Object> term13194 =  ((Map) term13172).keySet();
        term13171 = new HashSet((Collection<? extends Object>) term13194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term13117;
        args[1] = term13169;
        Object retValue = callMethod(klass, "createSetBasedOnList", argTypes, term13093, args);
        assertTrue(recursiveEquals(term13093, term13188));
        assertTrue(recursiveEquals(term13117, term13189));
        assertTrue(recursiveEquals(term13169, term13191));
        assertTrue(recursiveEquals(retValue, term13171));
    }

};


