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

public class PosixParser_gobble_93728277043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20988;
     Object term21074;
     Object term21082;
     Object term21083;

    public PosixParser_gobble_93728277043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20988 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term20988, term20988.getClass(), "eatTheRest", true);
        term21074 = newInstance(Class.forName("java.util.RegularEnumSet$EnumSetIterator"));
        term21082 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term21082, term21082.getClass(), "tokens", null);
        setBooleanField(term21082, term21082.getClass(), "eatTheRest", true);
        setField(term21082, term21082.getClass(), "currentOption", null);
        setField(term21082, term21082.getClass(), "options", null);
        setField(term21082, term21082.getClass(), "cmd", null);
        setField(term21082, term21082.getClass(), "requiredOptions", null);
        term21083 = newInstance(Class.forName("java.util.RegularEnumSet$EnumSetIterator"));
        setLongField(term21083, term21083.getClass(), "unseen", 0L);
        setLongField(term21083, term21083.getClass(), "lastReturned", 0L);
        setField(term21083, term21083.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term21074;
        callMethod(klass, "gobble", argTypes, term20988, args);
        assertTrue(recursiveEquals(term20988, term21082));
        assertTrue(recursiveEquals(term21074, term21083));
    }

};


