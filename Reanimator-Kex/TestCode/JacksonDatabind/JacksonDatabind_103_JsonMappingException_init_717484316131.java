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

public class JsonMappingException_init_717484316131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258175;
     Object term258257;

    public JsonMappingException_init_717484316131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term257845 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term257889 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term257692 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term258011 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonLocation"));
        Object term258069 = newInstance(Class.forName("java.io.Console$LineReader"));
        setField(term257845, term257845.getClass(), "cause", term257889);
        setField(term257845, term257845.getClass(), "stackTrace", term257692);
        setField(term257845, term257845.getClass(), "suppressedExceptions", null);
        setField(term257845, term257845.getClass(), "detailMessage", "");
        setField(term257845, term257845.getClass(), "_location", term258011);
        setField(term257845, term257845.getClass(), "_processor", term258069);
        term258175 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        term258257 = newInstance(Class.forName("java.lang.Throwable"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term258175;
        args[1] = "";
        args[2] = term258257;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


