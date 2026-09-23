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

public class DeserializationContext_reportBadTypeDefinition_253080648149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6087;

    public DeserializationContext_reportBadTypeDefinition_253080648149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6087 = (Object[]) newArray("java.lang.Object", 1);
        Object term6088 = newInstance(Class.forName("java.lang.Object"));
        setElement(term6087, 0, term6088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "vrQLuWIDJX";
        args[2] = term6087;
        try {
            callMethod(klass, "reportBadTypeDefinition", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


