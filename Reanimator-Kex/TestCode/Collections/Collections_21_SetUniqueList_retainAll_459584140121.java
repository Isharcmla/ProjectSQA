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
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class SetUniqueList_retainAll_459584140121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29549;
     Object term29649;
     Object term29738;
     Object term29741;

    public SetUniqueList_retainAll_459584140121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term29597 = new HashSet();
        term29549 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term29549, term29549.getClass(), "set", term29597);
        ArrayList term29701 = new ArrayList();
        term29649 = new ArrayList();
        ((ArrayList) term29649).add(term29701);
        ((ArrayList) term29649).add((Object)null);
        ((ArrayList) term29649).add((Object)null);
        ((ArrayList) term29649).add((Object)null);
        ((ArrayList) term29649).add((Object)null);
        ((ArrayList) term29649).add((Object)null);
        ((ArrayList) term29649).add((Object)null);
        ((ArrayList) term29649).add((Object)null);
        ((ArrayList) term29649).add((Object)null);
        HashMap term29740 = new HashMap();
        Set<Object> term29746 =  ((Map) term29740).keySet();
        HashSet term29739 = new HashSet((Collection<? extends Object>) term29746);
        term29738 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term29738, term29738.getClass(), "set", term29739);
        setField(term29738, term29738.getClass(), "collection", null);
        ArrayList term29743 = new ArrayList();
        term29741 = new ArrayList();
        ((ArrayList) term29741).add(term29743);
        ((ArrayList) term29741).add((Object)null);
        ((ArrayList) term29741).add((Object)null);
        ((ArrayList) term29741).add((Object)null);
        ((ArrayList) term29741).add((Object)null);
        ((ArrayList) term29741).add((Object)null);
        ((ArrayList) term29741).add((Object)null);
        ((ArrayList) term29741).add((Object)null);
        ((ArrayList) term29741).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term29649;
        Object retValue = callMethod(klass, "retainAll", argTypes, term29549, args);
        assertTrue(recursiveEquals(term29549, term29738));
        assertTrue(recursiveEquals(term29649, term29741));
        assertTrue(recursiveEquals(retValue, false));
    }

};


