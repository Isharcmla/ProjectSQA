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

public class PosixParser_gobble_93728277039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17260;
     Object term17374;
     Object term17380;
     Object term17381;

    public PosixParser_gobble_93728277039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17260 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term17260, term17260.getClass(), "eatTheRest", true);
        term17374 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$KeyIterator"));
        term17380 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term17380, term17380.getClass(), "tokens", null);
        setBooleanField(term17380, term17380.getClass(), "eatTheRest", true);
        setField(term17380, term17380.getClass(), "currentOption", null);
        setField(term17380, term17380.getClass(), "options", null);
        setField(term17380, term17380.getClass(), "cmd", null);
        setField(term17380, term17380.getClass(), "requiredOptions", null);
        term17381 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$KeyIterator"));
        setField(term17381, term17381.getClass(), "this$0", null);
        setField(term17381, term17381.getClass(), "lastReturned", null);
        setField(term17381, term17381.getClass(), "next", null);
        setField(term17381, term17381.getClass(), "nextValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term17374;
        callMethod(klass, "gobble", argTypes, term17260, args);
        assertTrue(recursiveEquals(term17260, term17380));
        assertTrue(recursiveEquals(term17374, term17381));
    }

};


