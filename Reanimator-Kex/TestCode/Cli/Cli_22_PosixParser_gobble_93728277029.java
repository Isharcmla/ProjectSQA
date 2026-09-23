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

public class PosixParser_gobble_93728277029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6680;
     Object term6762;
     Object term6771;
     Object term6772;

    public PosixParser_gobble_93728277029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6680 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term6680, term6680.getClass(), "eatTheRest", true);
        term6762 = newInstance(Class.forName("java.util.ImmutableCollections$ListItr"));
        term6771 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term6771, term6771.getClass(), "tokens", null);
        setBooleanField(term6771, term6771.getClass(), "eatTheRest", true);
        setField(term6771, term6771.getClass(), "options", null);
        setField(term6771, term6771.getClass(), "cmd", null);
        setField(term6771, term6771.getClass(), "requiredOptions", null);
        term6772 = newInstance(Class.forName("java.util.ImmutableCollections$ListItr"));
        setField(term6772, term6772.getClass(), "list", null);
        setIntField(term6772, term6772.getClass(), "size", 0);
        setBooleanField(term6772, term6772.getClass(), "isListIterator", false);
        setIntField(term6772, term6772.getClass(), "cursor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term6762;
        callMethod(klass, "gobble", argTypes, term6680, args);
        assertTrue(recursiveEquals(term6680, term6771));
        assertTrue(recursiveEquals(term6762, term6772));
    }

};


