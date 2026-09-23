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

public class PosixParser_gobble_93728277041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442598;
     Object term442726;
     Object term442733;
     Object term442734;

    public PosixParser_gobble_93728277041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442598 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term442598, term442598.getClass(), "eatTheRest", true);
        term442726 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapKeyIterator"));
        term442733 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term442733, term442733.getClass(), "tokens", null);
        setBooleanField(term442733, term442733.getClass(), "eatTheRest", true);
        setField(term442733, term442733.getClass(), "currentOption", null);
        setField(term442733, term442733.getClass(), "options", null);
        setField(term442733, term442733.getClass(), "cmd", null);
        setField(term442733, term442733.getClass(), "requiredOptions", null);
        term442734 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapKeyIterator"));
        setField(term442734, term442734.getClass(), "this$0", null);
        setField(term442734, term442734.getClass(), "lastReturned", null);
        setField(term442734, term442734.getClass(), "next", null);
        setField(term442734, term442734.getClass(), "fenceKey", null);
        setIntField(term442734, term442734.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term442726;
        callMethod(klass, "gobble", argTypes, term442598, args);
        assertTrue(recursiveEquals(term442598, term442733));
        assertTrue(recursiveEquals(term442726, term442734));
    }

};


