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
     Object term15380;
     Object term15464;
     Object term15473;
     Object term15474;

    public PosixParser_gobble_93728277053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15380 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term15380, term15380.getClass(), "eatTheRest", true);
        term15464 = newInstance(Class.forName("java.util.ArrayDeque$DescendingIterator"));
        term15473 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term15473, term15473.getClass(), "tokens", null);
        setBooleanField(term15473, term15473.getClass(), "eatTheRest", true);
        setField(term15473, term15473.getClass(), "currentOption", null);
        setField(term15473, term15473.getClass(), "options", null);
        setField(term15473, term15473.getClass(), "cmd", null);
        setField(term15473, term15473.getClass(), "requiredOptions", null);
        term15474 = newInstance(Class.forName("java.util.ArrayDeque$DescendingIterator"));
        setField(term15474, term15474.getClass(), "this$0", null);
        setIntField(term15474, term15474.getClass(), "cursor", 0);
        setIntField(term15474, term15474.getClass(), "remaining", 0);
        setIntField(term15474, term15474.getClass(), "lastRet", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term15464;
        callMethod(klass, "gobble", argTypes, term15380, args);
        assertTrue(recursiveEquals(term15380, term15473));
        assertTrue(recursiveEquals(term15464, term15474));
    }

};


