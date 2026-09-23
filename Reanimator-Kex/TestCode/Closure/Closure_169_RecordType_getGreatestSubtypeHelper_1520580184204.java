package com.google.javascript.rhino.jstype;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecordType_getGreatestSubtypeHelper_1520580184204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88983;
     Object term89185;

    public RecordType_getGreatestSubtypeHelper_1520580184204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term89087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term88521 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term89087, term89087.getClass(), "nativeTypes", term88521);
        setField(term88983, term88983.getClass(), "registry", term89087);
        term89185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term89289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term89185, term89185.getClass(), "referencedType", term89289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term89185;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term88983, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


