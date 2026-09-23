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

public class PosixParser_burstToken_160441250735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8181;
     Object term8486;

    public PosixParser_burstToken_160441250735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8181 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        term8486 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term8486, term8486.getClass(), "tokens", null);
        setBooleanField(term8486, term8486.getClass(), "eatTheRest", false);
        setField(term8486, term8486.getClass(), "options", null);
        setField(term8486, term8486.getClass(), "cmd", null);
        setField(term8486, term8486.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        callMethod(klass, "burstToken", argTypes, term8181, args);
        assertTrue(recursiveEquals(term8181, term8486));
    }

};


