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

public class PosixParser_gobble_93728277025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6156;
     Object term6288;
     Object term6295;
     Object term6296;

    public PosixParser_gobble_93728277025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6156 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term6156, term6156.getClass(), "eatTheRest", true);
        term6288 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        term6295 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term6295, term6295.getClass(), "tokens", null);
        setBooleanField(term6295, term6295.getClass(), "eatTheRest", true);
        setField(term6295, term6295.getClass(), "options", null);
        setField(term6295, term6295.getClass(), "cmd", null);
        setField(term6295, term6295.getClass(), "requiredOptions", null);
        term6296 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        setField(term6296, term6296.getClass(), "this$0", null);
        setField(term6296, term6296.getClass(), "lastReturned", null);
        setField(term6296, term6296.getClass(), "next", null);
        setField(term6296, term6296.getClass(), "fenceKey", null);
        setIntField(term6296, term6296.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term6288;
        callMethod(klass, "gobble", argTypes, term6156, args);
        assertTrue(recursiveEquals(term6156, term6295));
        assertTrue(recursiveEquals(term6288, term6296));
    }

};


