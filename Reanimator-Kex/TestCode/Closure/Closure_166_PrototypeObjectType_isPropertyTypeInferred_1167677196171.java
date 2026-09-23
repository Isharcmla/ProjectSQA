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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_isPropertyTypeInferred_1167677196171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36238;

    public PrototypeObjectType_isPropertyTypeInferred_1167677196171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term36286 = new HashMap();
        term36238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term36486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term36238, term36238.getClass(), "properties", term36286);
        setField(term36238, term36238.getClass(), "implicitPrototypeFallback", term36486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isPropertyTypeInferred", argTypes, term36238, args);
    }

};


