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
     Object term9050;
     Object term9132;
     Object term9141;
     Object term9142;

    public PosixParser_gobble_93728277041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9050 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term9050, term9050.getClass(), "eatTheRest", true);
        term9132 = newInstance(Class.forName("java.util.ImmutableCollections$ListItr"));
        term9141 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term9141, term9141.getClass(), "tokens", null);
        setBooleanField(term9141, term9141.getClass(), "eatTheRest", true);
        setField(term9141, term9141.getClass(), "options", null);
        setField(term9141, term9141.getClass(), "cmd", null);
        setField(term9141, term9141.getClass(), "requiredOptions", null);
        term9142 = newInstance(Class.forName("java.util.ImmutableCollections$ListItr"));
        setField(term9142, term9142.getClass(), "list", null);
        setIntField(term9142, term9142.getClass(), "size", 0);
        setBooleanField(term9142, term9142.getClass(), "isListIterator", false);
        setIntField(term9142, term9142.getClass(), "cursor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term9132;
        callMethod(klass, "gobble", argTypes, term9050, args);
        assertTrue(recursiveEquals(term9050, term9141));
        assertTrue(recursiveEquals(term9132, term9142));
    }

};


