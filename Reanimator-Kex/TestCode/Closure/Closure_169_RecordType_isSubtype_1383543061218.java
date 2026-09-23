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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecordType_isSubtype_1383543061218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190940;
     Object term191152;

    public RecordType_isSubtype_1383543061218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term191044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term190940, term190940.getClass(), "unknown", true);
        setField(term190940, term190940.getClass(), "registry", term191044);
        term191152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term191256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term191152, term191152.getClass(), "unknown", true);
        setBooleanField(term191256, term191256.getClass(), "nativeType", false);
        setBooleanField(term191256, term191256.getClass(), "unknown", false);
        setField(term191152, term191152.getClass(), "implicitPrototypeFallback", term191256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term191152;
        try {
            callMethod(klass, "isSubtype", argTypes, term190940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


