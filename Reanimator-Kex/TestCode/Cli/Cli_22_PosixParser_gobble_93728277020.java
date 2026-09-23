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

public class PosixParser_gobble_93728277020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2991;
     Object term3123;
     Object term5305;
     Object term5306;

    public PosixParser_gobble_93728277020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2991 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term2991, term2991.getClass(), "eatTheRest", true);
        term3123 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        term5305 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term5305, term5305.getClass(), "tokens", null);
        setBooleanField(term5305, term5305.getClass(), "eatTheRest", true);
        setField(term5305, term5305.getClass(), "options", null);
        setField(term5305, term5305.getClass(), "cmd", null);
        setField(term5305, term5305.getClass(), "requiredOptions", null);
        term5306 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        setField(term5306, term5306.getClass(), "this$0", null);
        setField(term5306, term5306.getClass(), "lastReturned", null);
        setField(term5306, term5306.getClass(), "next", null);
        setField(term5306, term5306.getClass(), "fenceKey", null);
        setIntField(term5306, term5306.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term3123;
        callMethod(klass, "gobble", argTypes, term2991, args);
        assertTrue(recursiveEquals(term2991, term5305));
        assertTrue(recursiveEquals(term3123, term5306));
    }

};


