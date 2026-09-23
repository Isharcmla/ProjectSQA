package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class Flat3Map_put_1944740725773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197761;
     Object term198311;

    public Flat3Map_put_1944740725773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term198404 = new HashMap();
        Collection<Object> term198121_OuterSet = ((HashMap) term198404).values();
        Iterator<Object> term198121 = ((Collection) term198121_OuterSet).iterator();
        term197761 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term197853 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term197945 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term198045 = newInstance(Class.forName("org.apache.commons.collections.map.ReferenceMap"));
        Object term198219 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term197761, term197761.getClass(), "delegateMap", null);
        setIntField(term197761, term197761.getClass(), "size", 3);
        setIntField(term197761, term197761.getClass(), "hash3", -1955348992);
        setField(term197853, term197853.getClass(), "delegateMap", null);
        setIntField(term197853, term197853.getClass(), "size", 3);
        setField(term197945, term197945.getClass(), "delegateMap", null);
        setIntField(term197945, term197945.getClass(), "size", 0);
        setField(term197853, term197853.getClass(), "key3", term197945);
        setField(term197853, term197853.getClass(), "key2", null);
        setField(term197853, term197853.getClass(), "value2", null);
        setIntField(term197853, term197853.getClass(), "hash3", -1810420716);
        setIntField(term198045, term198045.getClass(), "size", 0);
        setField(term197853, term197853.getClass(), "value3", term198045);
        setIntField(term197853, term197853.getClass(), "hash2", 15101056);
        setIntField(term197853, term197853.getClass(), "hash1", 391157760);
        setField(term197853, term197853.getClass(), "value1", null);
        setField(term197761, term197761.getClass(), "key3", term197853);
        setIntField(term197761, term197761.getClass(), "hash2", 1955348991);
        setIntField(term197761, term197761.getClass(), "hash1", -1955348992);
        setField(term197761, term197761.getClass(), "key1", null);
        setField(term197761, term197761.getClass(), "value3", term198121);
        setField(term197761, term197761.getClass(), "key2", null);
        setField(term197761, term197761.getClass(), "value2", null);
        setField(term197761, term197761.getClass(), "value1", term198219);
        term198311 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term198403 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term198311, term198311.getClass(), "delegateMap", null);
        setIntField(term198311, term198311.getClass(), "size", 3);
        setIntField(term198311, term198311.getClass(), "hash3", -412494272);
        setField(term198311, term198311.getClass(), "value3", null);
        setIntField(term198311, term198311.getClass(), "hash2", 1074339840);
        setField(term198311, term198311.getClass(), "value2", null);
        setIntField(term198311, term198311.getClass(), "hash1", 1677772736);
        setField(term198311, term198311.getClass(), "value1", null);
        setField(term198311, term198311.getClass(), "key3", null);
        setField(term198403, term198403.getClass(), "delegateMap", null);
        setIntField(term198403, term198403.getClass(), "size", 0);
        setField(term198311, term198311.getClass(), "key2", term198403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term198311;
        args[1] = null;
        callMethod(klass, "put", argTypes, term197761, args);
    }

};


