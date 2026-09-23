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

public class PosixParser_gobble_93728277047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444846;
     Object term444942;
     Object term444957;
     Object term444958;

    public PosixParser_gobble_93728277047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term444846 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term444846, term444846.getClass(), "eatTheRest", true);
        LinkedHashMap term444943 = new LinkedHashMap();
        Set<Object> term444942_OuterSet = ((LinkedHashMap) term444943).keySet();
        term444942 = ((Set) term444942_OuterSet).iterator();
        term444957 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term444957, term444957.getClass(), "tokens", null);
        setBooleanField(term444957, term444957.getClass(), "eatTheRest", true);
        setField(term444957, term444957.getClass(), "currentOption", null);
        setField(term444957, term444957.getClass(), "options", null);
        setField(term444957, term444957.getClass(), "cmd", null);
        setField(term444957, term444957.getClass(), "requiredOptions", null);
        LinkedHashMap term444959 = new LinkedHashMap();
        term444958 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedKeyIterator"));
        setField(term444958, term444958.getClass(), "this$0", term444959);
        setField(term444958, term444958.getClass(), "next", null);
        setField(term444958, term444958.getClass(), "current", null);
        setIntField(term444958, term444958.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term444942;
        callMethod(klass, "gobble", argTypes, term444846, args);
        assertTrue(recursiveEquals(term444846, term444957));
        assertTrue(recursiveEquals(term444942, term444958));
    }

};


