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

public class PosixParser_gobble_93728277057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23869;
     Object term23955;
     Object term23963;
     Object term23964;

    public PosixParser_gobble_93728277057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23869 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term23869, term23869.getClass(), "eatTheRest", true);
        term23955 = newInstance(Class.forName("java.util.RegularEnumSet$EnumSetIterator"));
        term23963 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term23963, term23963.getClass(), "tokens", null);
        setBooleanField(term23963, term23963.getClass(), "eatTheRest", true);
        setField(term23963, term23963.getClass(), "currentOption", null);
        setField(term23963, term23963.getClass(), "options", null);
        setField(term23963, term23963.getClass(), "cmd", null);
        setField(term23963, term23963.getClass(), "requiredOptions", null);
        term23964 = newInstance(Class.forName("java.util.RegularEnumSet$EnumSetIterator"));
        setLongField(term23964, term23964.getClass(), "unseen", 0L);
        setLongField(term23964, term23964.getClass(), "lastReturned", 0L);
        setField(term23964, term23964.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term23955;
        callMethod(klass, "gobble", argTypes, term23869, args);
        assertTrue(recursiveEquals(term23869, term23963));
        assertTrue(recursiveEquals(term23955, term23964));
    }

};


