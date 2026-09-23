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

public class Node_copyInformationFromForTree_136952912775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84481;

    public Node_copyInformationFromForTree_136952912775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84535 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term84535, term84535.getClass(), "propType", -41);
        setField(term84535, term84535.getClass(), "next", null);
        setField(term84481, term84481.getClass(), "propListHead", term84535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term84481;
        callMethod(klass, "copyInformationFromForTree", argTypes, term84481, args);
    }

};


