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

public class SetUniqueList_add_954530422111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25939;
     Object term26164;

    public SetUniqueList_add_954530422111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term25987 = new HashSet();
        ArrayList term26087 = new ArrayList();
        term25939 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term25939, term25939.getClass(), "set", term25987);
        setField(term25939, term25939.getClass(), "collection", term26087);
        HashMap term26166 = new HashMap();
        Set<Object> term26171 =  ((Map) term26166).keySet();
        HashSet term26165 = new HashSet((Collection<? extends Object>) term26171);
        ArrayList term26169 = new ArrayList();
        ((ArrayList) term26169).add((Object)null);
        term26164 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term26164, term26164.getClass(), "set", term26165);
        setField(term26164, term26164.getClass(), "collection", term26169);
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
        callMethod(klass, "add", argTypes, term25939, args);
        assertTrue(recursiveEquals(term25939, term26164));
    }

};


