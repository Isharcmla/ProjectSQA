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

public class PosixParser_gobble_93728277074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35758;
     Object term35890;
     Object term35897;
     Object term35898;

    public PosixParser_gobble_93728277074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35758 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term35758, term35758.getClass(), "eatTheRest", true);
        term35890 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        term35897 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term35897, term35897.getClass(), "tokens", null);
        setBooleanField(term35897, term35897.getClass(), "eatTheRest", true);
        setField(term35897, term35897.getClass(), "currentOption", null);
        setField(term35897, term35897.getClass(), "options", null);
        setField(term35897, term35897.getClass(), "cmd", null);
        setField(term35897, term35897.getClass(), "requiredOptions", null);
        term35898 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        setField(term35898, term35898.getClass(), "this$0", null);
        setField(term35898, term35898.getClass(), "lastReturned", null);
        setField(term35898, term35898.getClass(), "next", null);
        setField(term35898, term35898.getClass(), "fenceKey", null);
        setIntField(term35898, term35898.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term35890;
        callMethod(klass, "gobble", argTypes, term35758, args);
        assertTrue(recursiveEquals(term35758, term35897));
        assertTrue(recursiveEquals(term35890, term35898));
    }

};


