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

public class RecordType_getGreatestSubtypeHelper_1520580184226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230776;
     Object term230978;

    public RecordType_getGreatestSubtypeHelper_1520580184226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term230880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term230776, term230776.getClass(), "registry", term230880);
        term230978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term231078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term231184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term231078, term231078.getClass(), "referencedType", term231184);
        setField(term230978, term230978.getClass(), "referencedType", term231078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term230978;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term230776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


