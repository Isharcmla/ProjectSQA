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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_containsValue_204122359159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33833;

    public MultiValueMap_containsValue_204122359159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33833 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term33935 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term34037 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term34139 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term34037, term34037.getClass(), "map", term34139);
        setField(term33935, term33935.getClass(), "map", term34037);
        setField(term33833, term33833.getClass(), "map", term33935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "containsValue", argTypes, term33833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


