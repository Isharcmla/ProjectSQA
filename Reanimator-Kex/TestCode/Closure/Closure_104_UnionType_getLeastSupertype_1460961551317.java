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
import java.util.HashSet;
import java.lang.Object;

public class UnionType_getLeastSupertype_1460961551317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115200;
     Object term115358;

    public UnionType_getLeastSupertype_1460961551317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term115248 = new HashSet();
        term115200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term115200, term115200.getClass(), "alternates", term115248);
        term115358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term115446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term115446, term115446.getClass(), "unknown", false);
        setField(term115358, term115358.getClass(), "referencedType", term115446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term115358;
        callMethod(klass, "getLeastSupertype", argTypes, term115200, args);
    }

};


