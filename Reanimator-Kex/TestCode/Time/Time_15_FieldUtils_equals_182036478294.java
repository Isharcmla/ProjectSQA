package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;

public class FieldUtils_equals_182036478294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7386;
     Object term7472;
     Object term7485;
     Object term7486;

    public FieldUtils_equals_182036478294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7386 = newInstance(Class.forName("java.util.stream.Nodes$ToArrayTask$OfInt"));
        term7472 = newInstance(Class.forName("java.util.stream.Nodes$ToArrayTask$OfInt"));
        term7485 = newInstance(Class.forName("java.util.stream.Nodes$ToArrayTask$OfInt"));
        setField(term7485, term7485.getClass(), "array", null);
        setField(term7485, term7485.getClass(), "node", null);
        setIntField(term7485, term7485.getClass(), "offset", 0);
        setField(term7485, term7485.getClass(), "completer", null);
        setIntField(term7485, term7485.getClass(), "pending", 0);
        setIntField(term7485, term7485.getClass(), "status", 0);
        term7486 = newInstance(Class.forName("java.util.stream.Nodes$ToArrayTask$OfInt"));
        setField(term7486, term7486.getClass(), "array", null);
        setField(term7486, term7486.getClass(), "node", null);
        setIntField(term7486, term7486.getClass(), "offset", 0);
        setField(term7486, term7486.getClass(), "completer", null);
        setIntField(term7486, term7486.getClass(), "pending", 0);
        setIntField(term7486, term7486.getClass(), "status", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.FieldUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term7386;
        args[1] = term7472;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term7386, term7485));
        assertTrue(recursiveEquals(term7472, term7486));
        assertTrue(recursiveEquals(retValue, false));
    }

};


