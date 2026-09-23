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
import java.util.ArrayList;
import java.lang.Object;

public class PosixParser_process_168465003991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44750;
     Object term44814;

    public PosixParser_process_168465003991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44802 = new ArrayList();
        term44750 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term44750, term44750.getClass(), "currentOption", null);
        setBooleanField(term44750, term44750.getClass(), "eatTheRest", false);
        setField(term44750, term44750.getClass(), "tokens", term44802);
        ArrayList term44815 = new ArrayList();
        ((ArrayList) term44815).add("--");
        ((ArrayList) term44815).add((Object)null);
        term44814 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term44814, term44814.getClass(), "tokens", term44815);
        setBooleanField(term44814, term44814.getClass(), "eatTheRest", true);
        setField(term44814, term44814.getClass(), "currentOption", null);
        setField(term44814, term44814.getClass(), "options", null);
        setField(term44814, term44814.getClass(), "cmd", null);
        setField(term44814, term44814.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term44750, args);
        assertTrue(recursiveEquals(term44750, term44814));
    }

};


