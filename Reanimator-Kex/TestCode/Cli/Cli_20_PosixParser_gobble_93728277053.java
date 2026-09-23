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
     Object term23179;
     Object term23293;
     Object term23299;
     Object term23300;

    public PosixParser_gobble_93728277053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23179 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term23179, term23179.getClass(), "eatTheRest", true);
        term23293 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$KeyIterator"));
        term23299 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term23299, term23299.getClass(), "tokens", null);
        setBooleanField(term23299, term23299.getClass(), "eatTheRest", true);
        setField(term23299, term23299.getClass(), "currentOption", null);
        setField(term23299, term23299.getClass(), "options", null);
        setField(term23299, term23299.getClass(), "cmd", null);
        setField(term23299, term23299.getClass(), "requiredOptions", null);
        term23300 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$KeyIterator"));
        setField(term23300, term23300.getClass(), "this$0", null);
        setField(term23300, term23300.getClass(), "lastReturned", null);
        setField(term23300, term23300.getClass(), "next", null);
        setField(term23300, term23300.getClass(), "nextValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term23293;
        callMethod(klass, "gobble", argTypes, term23179, args);
        assertTrue(recursiveEquals(term23179, term23299));
        assertTrue(recursiveEquals(term23293, term23300));
    }

};


