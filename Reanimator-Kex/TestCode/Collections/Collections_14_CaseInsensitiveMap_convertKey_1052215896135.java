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

public class CaseInsensitiveMap_convertKey_1052215896135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24741;
     Object term24813;
     Object term24865;
     Object term24866;

    public CaseInsensitiveMap_convertKey_1052215896135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24741 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term24813 = newInstance(Class.forName("java.util.stream.LongPipeline$3$1"));
        term24865 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term24865, term24865.getClass(), "loadFactor", 0.0F);
        setIntField(term24865, term24865.getClass(), "size", 0);
        setField(term24865, term24865.getClass(), "data", null);
        setIntField(term24865, term24865.getClass(), "threshold", 0);
        setIntField(term24865, term24865.getClass(), "modCount", 0);
        setField(term24865, term24865.getClass(), "entrySet", null);
        setField(term24865, term24865.getClass(), "keySet", null);
        setField(term24865, term24865.getClass(), "values", null);
        setField(term24865, term24865.getClass(), "keySet", null);
        setField(term24865, term24865.getClass(), "values", null);
        term24866 = newInstance(Class.forName("java.util.stream.LongPipeline$3$1"));
        setField(term24866, term24866.getClass(), "this$1", null);
        setField(term24866, term24866.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24813;
        Object retValue = callMethod(klass, "convertKey", argTypes, term24741, args);
        assertTrue(recursiveEquals(term24741, term24865));
        assertTrue(recursiveEquals(term24813, term24866));
        assertTrue(recursiveEquals(retValue, "java.util.stream.longpipeline$3$1@3fa8da7b"));
    }

};


