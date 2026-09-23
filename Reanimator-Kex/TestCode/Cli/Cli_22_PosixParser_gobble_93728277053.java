package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;

public class PosixParser_gobble_93728277053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15297;
     Object term15407;
     Object term15417;
     Object term15418;

    public PosixParser_gobble_93728277053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15297 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term15297, term15297.getClass(), "eatTheRest", true);
        term15407 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$EntryIterator"));
        term15417 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term15417, term15417.getClass(), "tokens", null);
        setBooleanField(term15417, term15417.getClass(), "eatTheRest", true);
        setField(term15417, term15417.getClass(), "options", null);
        setField(term15417, term15417.getClass(), "cmd", null);
        setField(term15417, term15417.getClass(), "requiredOptions", null);
        term15418 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$EntryIterator"));
        setField(term15418, term15418.getClass(), "map", null);
        setField(term15418, term15418.getClass(), "lastReturned", null);
        setField(term15418, term15418.getClass(), "tab", null);
        setField(term15418, term15418.getClass(), "next", null);
        setField(term15418, term15418.getClass(), "stack", null);
        setField(term15418, term15418.getClass(), "spare", null);
        setIntField(term15418, term15418.getClass(), "index", 0);
        setIntField(term15418, term15418.getClass(), "baseIndex", 0);
        setIntField(term15418, term15418.getClass(), "baseLimit", 0);
        setIntField(term15418, term15418.getClass(), "baseSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term15407;
        callMethod(klass, "gobble", argTypes, term15297, args);
        assertTrue(recursiveEquals(term15297, term15417));
        assertTrue(recursiveEquals(term15407, term15418));
    }

};


