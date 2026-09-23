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
import static com.google.javascript.rhino.EqualityUtils.*;

public class Node_isLabelName_1617393053618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54478;
     Object term54510;

    public Node_isLabelName_1617393053618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54478, term54478.getClass(), "type", 153);
        term54510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54510, term54510.getClass(), "type", 153);
        setField(term54510, term54510.getClass(), "next", null);
        setField(term54510, term54510.getClass(), "first", null);
        setField(term54510, term54510.getClass(), "last", null);
        setField(term54510, term54510.getClass(), "propListHead", null);
        setIntField(term54510, term54510.getClass(), "sourcePosition", 0);
        setField(term54510, term54510.getClass(), "jsType", null);
        setField(term54510, term54510.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLabelName", argTypes, term54478, args);
        assertTrue(recursiveEquals(term54478, term54510));
        assertTrue(recursiveEquals(retValue, true));
    }

};


