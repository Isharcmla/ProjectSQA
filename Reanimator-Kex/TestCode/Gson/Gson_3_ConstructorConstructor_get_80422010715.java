package com.google.gson.internal;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;

public class ConstructorConstructor_get_80422010715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3825;
     Object term4133;

    public ConstructorConstructor_get_80422010715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class term4151 =  Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$OfInt");
        HashMap term3873 = new HashMap();
        ((HashMap) term3873).put(term4151, term4151);
        term3825 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term3825, term3825.getClass(), "instanceCreators", term3873);
        term4133 = newInstance(Class.forName("com.google.gson.reflect.TypeToken"));
        setField(term4133, term4133.getClass(), "type", term4151);
        setField(term4133, term4133.getClass(), "rawType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.reflect.TypeToken");
        Object[] args = new Object[1];
        args[0] = term4133;
        try {
            callMethod(klass, "get", argTypes, term3825, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


