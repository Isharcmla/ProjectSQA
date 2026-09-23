package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DeserializationContext_reportBadPropertyDefinition_1023834414150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6111;

    public DeserializationContext_reportBadPropertyDefinition_1023834414150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6111 = (Object[]) newArray("java.lang.Object", 8);
        Object term6112 = newInstance(Class.forName("java.lang.Object"));
        Object term6113 = newInstance(Class.forName("java.lang.Object"));
        Object term6114 = newInstance(Class.forName("java.lang.Object"));
        Object term6115 = newInstance(Class.forName("java.lang.Object"));
        Object term6116 = newInstance(Class.forName("java.lang.Object"));
        Object term6117 = newInstance(Class.forName("java.lang.Object"));
        Object term6118 = newInstance(Class.forName("java.lang.Object"));
        Object term6119 = newInstance(Class.forName("java.lang.Object"));
        setElement(term6111, 0, term6112);
        setElement(term6111, 1, term6113);
        setElement(term6111, 2, term6114);
        setElement(term6111, 3, term6115);
        setElement(term6111, 4, term6116);
        setElement(term6111, 5, term6117);
        setElement(term6111, 6, term6118);
        setElement(term6111, 7, term6119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = "flxyYxBRtu";
        args[3] = term6111;
        try {
            callMethod(klass, "reportBadPropertyDefinition", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


