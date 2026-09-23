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

public class PosixParser_gobble_93728277094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45300;
     Object term45432;
     Object term45439;
     Object term45440;

    public PosixParser_gobble_93728277094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45300 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term45300, term45300.getClass(), "eatTheRest", true);
        term45432 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        term45439 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term45439, term45439.getClass(), "tokens", null);
        setBooleanField(term45439, term45439.getClass(), "eatTheRest", true);
        setField(term45439, term45439.getClass(), "currentOption", null);
        setField(term45439, term45439.getClass(), "options", null);
        setField(term45439, term45439.getClass(), "cmd", null);
        setField(term45439, term45439.getClass(), "requiredOptions", null);
        term45440 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        setField(term45440, term45440.getClass(), "this$0", null);
        setField(term45440, term45440.getClass(), "lastReturned", null);
        setField(term45440, term45440.getClass(), "next", null);
        setField(term45440, term45440.getClass(), "fenceKey", null);
        setIntField(term45440, term45440.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term45432;
        callMethod(klass, "gobble", argTypes, term45300, args);
        assertTrue(recursiveEquals(term45300, term45439));
        assertTrue(recursiveEquals(term45432, term45440));
    }

};


