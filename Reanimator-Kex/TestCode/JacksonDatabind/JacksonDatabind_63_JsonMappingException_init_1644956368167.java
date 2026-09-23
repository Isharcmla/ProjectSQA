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

public class JsonMappingException_init_1644956368167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291675;

    public JsonMappingException_init_1644956368167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term291369 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term291413 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term291225 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term291555 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(term291369, term291369.getClass(), "cause", term291413);
        setField(term291369, term291369.getClass(), "stackTrace", term291225);
        setField(term291369, term291369.getClass(), "suppressedExceptions", null);
        setField(term291369, term291369.getClass(), "detailMessage", "");
        setField(term291369, term291369.getClass(), "_processor", term291555);
        term291675 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term291791 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(term291675, term291675.getClass(), "delegate", term291791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term291675;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


