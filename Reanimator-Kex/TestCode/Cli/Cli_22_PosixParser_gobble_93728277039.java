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

public class PosixParser_gobble_93728277039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8844;
     Object term8914;
     Object term8926;
     Object term8927;

    public PosixParser_gobble_93728277039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8844 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term8844, term8844.getClass(), "eatTheRest", true);
        LinkedList term8915 = new LinkedList();
        term8914 = ((AbstractList) term8915).listIterator();
        term8926 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term8926, term8926.getClass(), "tokens", null);
        setBooleanField(term8926, term8926.getClass(), "eatTheRest", true);
        setField(term8926, term8926.getClass(), "options", null);
        setField(term8926, term8926.getClass(), "cmd", null);
        setField(term8926, term8926.getClass(), "requiredOptions", null);
        LinkedList term8928 = new LinkedList();
        term8927 = newInstance(Class.forName("java.util.LinkedList$ListItr"));
        setField(term8927, term8927.getClass(), "lastReturned", null);
        setField(term8927, term8927.getClass(), "next", null);
        setIntField(term8927, term8927.getClass(), "nextIndex", 0);
        setIntField(term8927, term8927.getClass(), "expectedModCount", 0);
        setField(term8927, term8927.getClass(), "this$0", term8928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term8914;
        callMethod(klass, "gobble", argTypes, term8844, args);
        assertTrue(recursiveEquals(term8844, term8926));
        assertTrue(recursiveEquals(term8914, term8927));
    }

};


