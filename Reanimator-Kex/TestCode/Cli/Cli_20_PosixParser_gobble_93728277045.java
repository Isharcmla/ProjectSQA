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

public class PosixParser_gobble_93728277045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21194;
     Object term21278;
     Object term21287;
     Object term21288;

    public PosixParser_gobble_93728277045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21194 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term21194, term21194.getClass(), "eatTheRest", true);
        term21278 = newInstance(Class.forName("java.util.ArrayDeque$DescendingIterator"));
        term21287 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term21287, term21287.getClass(), "tokens", null);
        setBooleanField(term21287, term21287.getClass(), "eatTheRest", true);
        setField(term21287, term21287.getClass(), "currentOption", null);
        setField(term21287, term21287.getClass(), "options", null);
        setField(term21287, term21287.getClass(), "cmd", null);
        setField(term21287, term21287.getClass(), "requiredOptions", null);
        term21288 = newInstance(Class.forName("java.util.ArrayDeque$DescendingIterator"));
        setField(term21288, term21288.getClass(), "this$0", null);
        setIntField(term21288, term21288.getClass(), "cursor", 0);
        setIntField(term21288, term21288.getClass(), "remaining", 0);
        setIntField(term21288, term21288.getClass(), "lastRet", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term21278;
        callMethod(klass, "gobble", argTypes, term21194, args);
        assertTrue(recursiveEquals(term21194, term21287));
        assertTrue(recursiveEquals(term21278, term21288));
    }

};


