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
import java.util.LinkedList;
import java.util.AbstractList;

public class PosixParser_gobble_93728277027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6443;
     Object term6513;
     Object term6525;
     Object term6526;

    public PosixParser_gobble_93728277027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6443 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term6443, term6443.getClass(), "eatTheRest", true);
        LinkedList term6514 = new LinkedList();
        term6513 = ((AbstractList) term6514).listIterator();
        term6525 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term6525, term6525.getClass(), "tokens", null);
        setBooleanField(term6525, term6525.getClass(), "eatTheRest", true);
        setField(term6525, term6525.getClass(), "options", null);
        setField(term6525, term6525.getClass(), "cmd", null);
        setField(term6525, term6525.getClass(), "requiredOptions", null);
        LinkedList term6527 = new LinkedList();
        term6526 = newInstance(Class.forName("java.util.LinkedList$ListItr"));
        setField(term6526, term6526.getClass(), "lastReturned", null);
        setField(term6526, term6526.getClass(), "next", null);
        setIntField(term6526, term6526.getClass(), "nextIndex", 0);
        setIntField(term6526, term6526.getClass(), "expectedModCount", 0);
        setField(term6526, term6526.getClass(), "this$0", term6527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term6513;
        callMethod(klass, "gobble", argTypes, term6443, args);
        assertTrue(recursiveEquals(term6443, term6525));
        assertTrue(recursiveEquals(term6513, term6526));
    }

};


