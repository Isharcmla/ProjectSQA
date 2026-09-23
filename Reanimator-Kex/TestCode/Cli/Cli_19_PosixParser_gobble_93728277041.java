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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Set;

public class PosixParser_gobble_93728277041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26119;
     Object term26215;
     Object term26230;
     Object term26231;

    public PosixParser_gobble_93728277041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26119 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term26119, term26119.getClass(), "eatTheRest", true);
        LinkedHashMap term26216 = new LinkedHashMap();
        Set<Object> term26215_OuterSet = ((LinkedHashMap) term26216).keySet();
        term26215 = ((Set) term26215_OuterSet).iterator();
        term26230 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term26230, term26230.getClass(), "tokens", null);
        setBooleanField(term26230, term26230.getClass(), "eatTheRest", true);
        setField(term26230, term26230.getClass(), "currentOption", null);
        setField(term26230, term26230.getClass(), "options", null);
        setField(term26230, term26230.getClass(), "cmd", null);
        setField(term26230, term26230.getClass(), "requiredOptions", null);
        LinkedHashMap term26232 = new LinkedHashMap();
        term26231 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedKeyIterator"));
        setField(term26231, term26231.getClass(), "this$0", term26232);
        setField(term26231, term26231.getClass(), "next", null);
        setField(term26231, term26231.getClass(), "current", null);
        setIntField(term26231, term26231.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term26215;
        callMethod(klass, "gobble", argTypes, term26119, args);
        assertTrue(recursiveEquals(term26119, term26230));
        assertTrue(recursiveEquals(term26215, term26231));
    }

};


