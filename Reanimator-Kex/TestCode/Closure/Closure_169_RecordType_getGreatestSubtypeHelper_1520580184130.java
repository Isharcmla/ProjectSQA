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

public class RecordType_getGreatestSubtypeHelper_1520580184130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46818;
     Object term46916;

    public RecordType_getGreatestSubtypeHelper_1520580184130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term46916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term47016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term47112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setField(term47016, term47016.getClass(), "referencedType", term47112);
        setField(term46916, term46916.getClass(), "referencedType", term47016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term46916;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term46818, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


