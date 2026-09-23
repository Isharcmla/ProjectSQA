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

public class PosixParser_gobble_93728277037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8608;
     Object term8718;
     Object term8728;
     Object term8729;

    public PosixParser_gobble_93728277037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8608 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term8608, term8608.getClass(), "eatTheRest", true);
        term8718 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$EntryIterator"));
        term8728 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term8728, term8728.getClass(), "tokens", null);
        setBooleanField(term8728, term8728.getClass(), "eatTheRest", true);
        setField(term8728, term8728.getClass(), "options", null);
        setField(term8728, term8728.getClass(), "cmd", null);
        setField(term8728, term8728.getClass(), "requiredOptions", null);
        term8729 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$EntryIterator"));
        setField(term8729, term8729.getClass(), "map", null);
        setField(term8729, term8729.getClass(), "lastReturned", null);
        setField(term8729, term8729.getClass(), "tab", null);
        setField(term8729, term8729.getClass(), "next", null);
        setField(term8729, term8729.getClass(), "stack", null);
        setField(term8729, term8729.getClass(), "spare", null);
        setIntField(term8729, term8729.getClass(), "index", 0);
        setIntField(term8729, term8729.getClass(), "baseIndex", 0);
        setIntField(term8729, term8729.getClass(), "baseLimit", 0);
        setIntField(term8729, term8729.getClass(), "baseSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term8718;
        callMethod(klass, "gobble", argTypes, term8608, args);
        assertTrue(recursiveEquals(term8608, term8728));
        assertTrue(recursiveEquals(term8718, term8729));
    }

};


