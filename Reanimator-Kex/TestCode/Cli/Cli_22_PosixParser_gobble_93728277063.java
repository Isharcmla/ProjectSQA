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

public class PosixParser_gobble_93728277063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17044;
     Object term17162;
     Object term17168;
     Object term17169;

    public PosixParser_gobble_93728277063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17044 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term17044, term17044.getClass(), "eatTheRest", true);
        term17162 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$DescendingItr"));
        term17168 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term17168, term17168.getClass(), "tokens", null);
        setBooleanField(term17168, term17168.getClass(), "eatTheRest", true);
        setField(term17168, term17168.getClass(), "options", null);
        setField(term17168, term17168.getClass(), "cmd", null);
        setField(term17168, term17168.getClass(), "requiredOptions", null);
        term17169 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$DescendingItr"));
        setField(term17169, term17169.getClass(), "this$0", null);
        setField(term17169, term17169.getClass(), "nextNode", null);
        setField(term17169, term17169.getClass(), "nextItem", null);
        setField(term17169, term17169.getClass(), "lastRet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term17162;
        callMethod(klass, "gobble", argTypes, term17044, args);
        assertTrue(recursiveEquals(term17044, term17168));
        assertTrue(recursiveEquals(term17162, term17169));
    }

};


