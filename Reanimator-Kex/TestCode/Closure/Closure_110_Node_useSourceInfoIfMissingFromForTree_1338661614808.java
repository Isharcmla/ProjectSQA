package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_useSourceInfoIfMissingFromForTree_1338661614808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91622;
     Object term91692;

    public Node_useSourceInfoIfMissingFromForTree_1338661614808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term91622, term91622.getClass(), "propListHead", null);
        term91692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91800 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term91800, term91800.getClass(), "propType", 40);
        setField(term91692, term91692.getClass(), "propListHead", term91800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term91692;
        callMethod(klass, "useSourceInfoIfMissingFromForTree", argTypes, term91622, args);
    }

};


