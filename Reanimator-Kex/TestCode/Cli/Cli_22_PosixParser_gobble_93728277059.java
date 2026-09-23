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

public class PosixParser_gobble_93728277059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16486;
     Object term16604;
     Object term16610;
     Object term16611;

    public PosixParser_gobble_93728277059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16486 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term16486, term16486.getClass(), "eatTheRest", true);
        term16604 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$DescendingItr"));
        term16610 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term16610, term16610.getClass(), "tokens", null);
        setBooleanField(term16610, term16610.getClass(), "eatTheRest", true);
        setField(term16610, term16610.getClass(), "options", null);
        setField(term16610, term16610.getClass(), "cmd", null);
        setField(term16610, term16610.getClass(), "requiredOptions", null);
        term16611 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$DescendingItr"));
        setField(term16611, term16611.getClass(), "this$0", null);
        setField(term16611, term16611.getClass(), "nextNode", null);
        setField(term16611, term16611.getClass(), "nextItem", null);
        setField(term16611, term16611.getClass(), "lastRet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term16604;
        callMethod(klass, "gobble", argTypes, term16486, args);
        assertTrue(recursiveEquals(term16486, term16610));
        assertTrue(recursiveEquals(term16604, term16611));
    }

};


