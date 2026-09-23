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

public class RecordType_getGreatestSubtypeHelper_1520580184160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68685;
     Object term68783;

    public RecordType_getGreatestSubtypeHelper_1520580184160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term68783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term68883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term68993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term68883, term68883.getClass(), "referencedType", term68993);
        setField(term68783, term68783.getClass(), "referencedType", term68883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term68783;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term68685, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


