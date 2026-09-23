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

public class RecordType_getGreatestSubtypeHelper_1520580184229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231585;
     Object term231683;

    public RecordType_getGreatestSubtypeHelper_1520580184229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term231683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term231781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term231871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term231781, term231781.getClass(), "referencedType", term231871);
        setField(term231683, term231683.getClass(), "referencedType", term231781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term231683;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term231585, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


