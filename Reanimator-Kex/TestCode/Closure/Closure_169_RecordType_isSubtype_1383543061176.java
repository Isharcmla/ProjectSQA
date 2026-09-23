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

public class RecordType_isSubtype_1383543061176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78372;
     Object term78564;

    public RecordType_isSubtype_1383543061176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term78476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term77886 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setBooleanField(term78372, term78372.getClass(), "unknown", true);
        setField(term78476, term78476.getClass(), "nativeTypes", term77886);
        setField(term78372, term78372.getClass(), "registry", term78476);
        term78564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term78564, term78564.getClass(), "unknown", true);
        setField(term78564, term78564.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term78564;
        try {
            callMethod(klass, "isSubtype", argTypes, term78372, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


