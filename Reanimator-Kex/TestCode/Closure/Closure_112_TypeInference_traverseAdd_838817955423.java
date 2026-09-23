package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAdd_838817955423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1316454;
     Object term1316524;

    public TypeInference_traverseAdd_838817955423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1316454 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1316524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1316594, term1316594.getClass(), "next", term1316664);
        setIntField(term1316594, term1316594.getClass(), "type", 14);
        setIntField(term1316734, term1316734.getClass(), "type", 14);
        setIntField(term1316804, term1316804.getClass(), "type", 14);
        setIntField(term1316874, term1316874.getClass(), "type", 14);
        setIntField(term1316944, term1316944.getClass(), "type", 14);
        setIntField(term1317014, term1317014.getClass(), "type", 14);
        setIntField(term1317084, term1317084.getClass(), "type", 14);
        setIntField(term1317154, term1317154.getClass(), "type", 14);
        setIntField(term1317224, term1317224.getClass(), "type", 14);
        setIntField(term1317294, term1317294.getClass(), "type", 14);
        setIntField(term1317364, term1317364.getClass(), "type", 14);
        setIntField(term1317434, term1317434.getClass(), "type", 14);
        setIntField(term1317504, term1317504.getClass(), "type", 14);
        setIntField(term1317574, term1317574.getClass(), "type", 14);
        setIntField(term1317644, term1317644.getClass(), "type", 14);
        setIntField(term1317714, term1317714.getClass(), "type", 68);
        setField(term1317644, term1317644.getClass(), "first", term1317714);
        setField(term1317574, term1317574.getClass(), "first", term1317644);
        setField(term1317504, term1317504.getClass(), "first", term1317574);
        setField(term1317434, term1317434.getClass(), "first", term1317504);
        setField(term1317364, term1317364.getClass(), "first", term1317434);
        setField(term1317294, term1317294.getClass(), "first", term1317364);
        setField(term1317224, term1317224.getClass(), "first", term1317294);
        setField(term1317154, term1317154.getClass(), "first", term1317224);
        setField(term1317084, term1317084.getClass(), "first", term1317154);
        setField(term1317014, term1317014.getClass(), "first", term1317084);
        setField(term1316944, term1316944.getClass(), "first", term1317014);
        setField(term1316874, term1316874.getClass(), "first", term1316944);
        setField(term1316804, term1316804.getClass(), "first", term1316874);
        setField(term1316734, term1316734.getClass(), "first", term1316804);
        setField(term1316594, term1316594.getClass(), "first", term1316734);
        setField(term1316524, term1316524.getClass(), "first", term1316594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1316524;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1316454, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


