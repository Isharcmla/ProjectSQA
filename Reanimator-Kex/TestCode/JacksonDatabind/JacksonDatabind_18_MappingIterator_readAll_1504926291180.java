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

public class MappingIterator_readAll_1504926291180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132790;

    public MappingIterator_readAll_1504926291180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132790 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term132896 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term133002 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term133036 = newInstance(Class.forName("java.lang.invoke.VarHandleBytes"));
        Object term133107 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(term132896, term132896.getClass(), "delegate", term133002);
        setField(term132790, term132790.getClass(), "_parser", term132896);
        setBooleanField(term132790, term132790.getClass(), "_hasNextChecked", true);
        setField(term132790, term132790.getClass(), "_updatedValue", term133036);
        setField(term132790, term132790.getClass(), "_deserializer", term133107);
        setField(term132790, term132790.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term132790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


