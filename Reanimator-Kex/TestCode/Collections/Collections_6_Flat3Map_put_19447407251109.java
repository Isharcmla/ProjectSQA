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
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_put_19447407251109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330808;
     Object term331206;
     Object term331736;
     Object term331742;

    public Flat3Map_put_19447407251109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330808 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term330900 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term330938 = newInstance(Class.forName("java.lang.Object"));
        Object term330976 = newInstance(Class.forName("java.lang.Object"));
        term331206 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331252 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term330808, term330808.getClass(), "delegateMap", null);
        setIntField(term330808, term330808.getClass(), "size", 3);
        setIntField(term330808, term330808.getClass(), "hash3", 0);
        setField(term330900, term330900.getClass(), "delegateMap", null);
        setIntField(term330900, term330900.getClass(), "size", 3);
        setField(term330900, term330900.getClass(), "key3", term330938);
        setField(term330900, term330900.getClass(), "key2", null);
        setField(term330900, term330900.getClass(), "value2", null);
        setIntField(term330900, term330900.getClass(), "hash3", 0);
        setIntField(term330900, term330900.getClass(), "hash2", 0);
        setIntField(term330900, term330900.getClass(), "hash1", 0);
        setField(term330900, term330900.getClass(), "key1", term330976);
        setField(term330808, term330808.getClass(), "key3", term330900);
        setIntField(term330808, term330808.getClass(), "hash2", -1);
        setIntField(term330808, term330808.getClass(), "hash1", 0);
        setField(term331206, term331206.getClass(), "delegateMap", null);
        setIntField(term331206, term331206.getClass(), "size", 3);
        setIntField(term331206, term331206.getClass(), "hash3", 0);
        setField(term331206, term331206.getClass(), "value3", null);
        setIntField(term331206, term331206.getClass(), "hash2", 0);
        setField(term331206, term331206.getClass(), "value2", null);
        setIntField(term331206, term331206.getClass(), "hash1", 0);
        setField(term331206, term331206.getClass(), "value1", null);
        setField(term331206, term331206.getClass(), "key3", null);
        setField(term331252, term331252.getClass(), "delegateMap", null);
        setIntField(term331252, term331252.getClass(), "size", 2);
        setIntField(term331252, term331252.getClass(), "hash2", 0);
        setField(term331252, term331252.getClass(), "value2", null);
        setIntField(term331252, term331252.getClass(), "hash1", 0);
        setField(term331252, term331252.getClass(), "value1", null);
        setField(term331206, term331206.getClass(), "key2", term331252);
        setField(term330808, term330808.getClass(), "key1", term331206);
        term331736 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331737 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331738 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331739 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331740 = newInstance(Class.forName("java.lang.Object"));
        Object term331741 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term331736, term331736.getClass(), "size", 3);
        setIntField(term331736, term331736.getClass(), "hash1", 0);
        setIntField(term331736, term331736.getClass(), "hash2", -1);
        setIntField(term331736, term331736.getClass(), "hash3", 0);
        setIntField(term331737, term331737.getClass(), "size", 3);
        setIntField(term331737, term331737.getClass(), "hash1", 0);
        setIntField(term331737, term331737.getClass(), "hash2", 0);
        setIntField(term331737, term331737.getClass(), "hash3", 0);
        setField(term331737, term331737.getClass(), "key1", null);
        setIntField(term331738, term331738.getClass(), "size", 2);
        setIntField(term331738, term331738.getClass(), "hash1", 0);
        setIntField(term331738, term331738.getClass(), "hash2", 0);
        setIntField(term331738, term331738.getClass(), "hash3", 0);
        setField(term331738, term331738.getClass(), "key1", null);
        setField(term331738, term331738.getClass(), "key2", null);
        setField(term331738, term331738.getClass(), "key3", null);
        setField(term331738, term331738.getClass(), "value1", null);
        setField(term331738, term331738.getClass(), "value2", null);
        setField(term331738, term331738.getClass(), "value3", null);
        setField(term331738, term331738.getClass(), "delegateMap", null);
        setField(term331737, term331737.getClass(), "key2", term331738);
        setField(term331737, term331737.getClass(), "key3", null);
        setField(term331737, term331737.getClass(), "value1", null);
        setField(term331737, term331737.getClass(), "value2", null);
        setField(term331737, term331737.getClass(), "value3", null);
        setField(term331737, term331737.getClass(), "delegateMap", null);
        setField(term331736, term331736.getClass(), "key1", term331737);
        setField(term331736, term331736.getClass(), "key2", null);
        setIntField(term331739, term331739.getClass(), "size", 3);
        setIntField(term331739, term331739.getClass(), "hash1", 0);
        setIntField(term331739, term331739.getClass(), "hash2", 0);
        setIntField(term331739, term331739.getClass(), "hash3", 0);
        setField(term331739, term331739.getClass(), "key1", term331740);
        setField(term331739, term331739.getClass(), "key2", null);
        setField(term331739, term331739.getClass(), "key3", term331741);
        setField(term331739, term331739.getClass(), "value1", null);
        setField(term331739, term331739.getClass(), "value2", null);
        setField(term331739, term331739.getClass(), "value3", null);
        setField(term331739, term331739.getClass(), "delegateMap", null);
        setField(term331736, term331736.getClass(), "key3", term331739);
        setField(term331736, term331736.getClass(), "value1", null);
        setField(term331736, term331736.getClass(), "value2", null);
        setField(term331736, term331736.getClass(), "value3", null);
        setField(term331736, term331736.getClass(), "delegateMap", null);
        term331742 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331743 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term331742, term331742.getClass(), "size", 3);
        setIntField(term331742, term331742.getClass(), "hash1", 0);
        setIntField(term331742, term331742.getClass(), "hash2", 0);
        setIntField(term331742, term331742.getClass(), "hash3", 0);
        setField(term331742, term331742.getClass(), "key1", null);
        setIntField(term331743, term331743.getClass(), "size", 2);
        setIntField(term331743, term331743.getClass(), "hash1", 0);
        setIntField(term331743, term331743.getClass(), "hash2", 0);
        setIntField(term331743, term331743.getClass(), "hash3", 0);
        setField(term331743, term331743.getClass(), "key1", null);
        setField(term331743, term331743.getClass(), "key2", null);
        setField(term331743, term331743.getClass(), "key3", null);
        setField(term331743, term331743.getClass(), "value1", null);
        setField(term331743, term331743.getClass(), "value2", null);
        setField(term331743, term331743.getClass(), "value3", null);
        setField(term331743, term331743.getClass(), "delegateMap", null);
        setField(term331742, term331742.getClass(), "key2", term331743);
        setField(term331742, term331742.getClass(), "key3", null);
        setField(term331742, term331742.getClass(), "value1", null);
        setField(term331742, term331742.getClass(), "value2", null);
        setField(term331742, term331742.getClass(), "value3", null);
        setField(term331742, term331742.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term331206;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term330808, args);
        assertTrue(recursiveEquals(term330808, term331736));
        assertTrue(recursiveEquals(term331206, term331742));
        assertTrue(recursiveEquals(retValue, null));
    }

};


