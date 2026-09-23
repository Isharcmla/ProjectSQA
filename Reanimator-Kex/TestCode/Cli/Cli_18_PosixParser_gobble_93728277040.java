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

public class PosixParser_gobble_93728277040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11617;
     Object term11701;
     Object term12739;
     Object term12740;

    public PosixParser_gobble_93728277040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11617 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term11617, term11617.getClass(), "eatTheRest", true);
        term11701 = newInstance(Class.forName("java.util.ArrayDeque$DescendingIterator"));
        term12739 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term12739, term12739.getClass(), "tokens", null);
        setBooleanField(term12739, term12739.getClass(), "eatTheRest", true);
        setField(term12739, term12739.getClass(), "currentOption", null);
        setField(term12739, term12739.getClass(), "options", null);
        setField(term12739, term12739.getClass(), "cmd", null);
        setField(term12739, term12739.getClass(), "requiredOptions", null);
        term12740 = newInstance(Class.forName("java.util.ArrayDeque$DescendingIterator"));
        setField(term12740, term12740.getClass(), "this$0", null);
        setIntField(term12740, term12740.getClass(), "cursor", 0);
        setIntField(term12740, term12740.getClass(), "remaining", 0);
        setIntField(term12740, term12740.getClass(), "lastRet", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term11701;
        callMethod(klass, "gobble", argTypes, term11617, args);
        assertTrue(recursiveEquals(term11617, term12739));
        assertTrue(recursiveEquals(term11701, term12740));
    }

};


