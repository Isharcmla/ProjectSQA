package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_containsValue_1640184670152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50641;

    public MultiValueMap_containsValue_1640184670152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50641 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term50745 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term50849 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term50953 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term50849, term50849.getClass(), "map", term50953);
        setField(term50745, term50745.getClass(), "map", term50849);
        setField(term50641, term50641.getClass(), "map", term50745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsValue", argTypes, term50641, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


