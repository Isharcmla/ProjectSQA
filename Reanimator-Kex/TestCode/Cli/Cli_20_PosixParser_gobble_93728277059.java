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
     Object term24175;
     Object term24239;
     Object term24246;
     Object term24247;

    public PosixParser_gobble_93728277059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24175 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term24175, term24175.getClass(), "eatTheRest", true);
        term24239 = newInstance(Class.forName("java.util.TreeMap$KeyIterator"));
        term24246 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term24246, term24246.getClass(), "tokens", null);
        setBooleanField(term24246, term24246.getClass(), "eatTheRest", true);
        setField(term24246, term24246.getClass(), "currentOption", null);
        setField(term24246, term24246.getClass(), "options", null);
        setField(term24246, term24246.getClass(), "cmd", null);
        setField(term24246, term24246.getClass(), "requiredOptions", null);
        term24247 = newInstance(Class.forName("java.util.TreeMap$KeyIterator"));
        setField(term24247, term24247.getClass(), "this$0", null);
        setField(term24247, term24247.getClass(), "next", null);
        setField(term24247, term24247.getClass(), "lastReturned", null);
        setIntField(term24247, term24247.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term24239;
        callMethod(klass, "gobble", argTypes, term24175, args);
        assertTrue(recursiveEquals(term24175, term24246));
        assertTrue(recursiveEquals(term24239, term24247));
    }

};


