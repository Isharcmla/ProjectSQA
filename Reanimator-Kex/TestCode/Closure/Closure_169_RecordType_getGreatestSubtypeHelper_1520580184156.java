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

public class RecordType_getGreatestSubtypeHelper_1520580184156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67313;
     Object term67411;

    public RecordType_getGreatestSubtypeHelper_1520580184156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term67411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term67511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term67607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term67511, term67511.getClass(), "referencedType", term67607);
        setField(term67411, term67411.getClass(), "referencedType", term67511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term67411;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term67313, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


