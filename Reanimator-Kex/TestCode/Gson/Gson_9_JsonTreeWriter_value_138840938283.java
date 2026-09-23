package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Double;

public class JsonTreeWriter_value_138840938283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13253;
     Object term13334;
     Object term13307;

    public JsonTreeWriter_value_138840938283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13305 = new ArrayList();
        term13253 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setBooleanField(term13253, term13253.getClass(), "lenient", false);
        setField(term13253, term13253.getClass(), "pendingName", null);
        setField(term13253, term13253.getClass(), "stack", term13305);
        ArrayList term13335 = new ArrayList();
        Double term13338 = new Double(-3.337610787760802E-308);
        term13334 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term13337 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term13334, term13334.getClass(), "stack", term13335);
        setField(term13334, term13334.getClass(), "pendingName", null);
        setField(term13337, term13337.getClass(), "value", term13338);
        setField(term13334, term13334.getClass(), "product", term13337);
        setField(term13334, term13334.getClass(), "out", null);
        setField(term13334, term13334.getClass(), "stack", null);
        setIntField(term13334, term13334.getClass(), "stackSize", 0);
        setField(term13334, term13334.getClass(), "indent", null);
        setField(term13334, term13334.getClass(), "separator", null);
        setBooleanField(term13334, term13334.getClass(), "lenient", false);
        setBooleanField(term13334, term13334.getClass(), "htmlSafe", false);
        setField(term13334, term13334.getClass(), "deferredName", null);
        setBooleanField(term13334, term13334.getClass(), "serializeNulls", false);
        ArrayList term13308 = new ArrayList();
        Double term13313 = new Double(-3.337610787760802E-308);
        term13307 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term13312 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term13307, term13307.getClass(), "stack", term13308);
        setField(term13307, term13307.getClass(), "pendingName", null);
        setField(term13312, term13312.getClass(), "value", term13313);
        setField(term13307, term13307.getClass(), "product", term13312);
        setField(term13307, term13307.getClass(), "out", null);
        setField(term13307, term13307.getClass(), "stack", null);
        setIntField(term13307, term13307.getClass(), "stackSize", 0);
        setField(term13307, term13307.getClass(), "indent", null);
        setField(term13307, term13307.getClass(), "separator", null);
        setBooleanField(term13307, term13307.getClass(), "lenient", false);
        setBooleanField(term13307, term13307.getClass(), "htmlSafe", false);
        setField(term13307, term13307.getClass(), "deferredName", null);
        setBooleanField(term13307, term13307.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -3.337610787760802E-308;
        Object retValue = callMethod(klass, "value", argTypes, term13253, args);
        assertTrue(recursiveEquals(term13253, term13334));
        assertTrue(recursiveEquals(retValue, term13307));
    }

};


