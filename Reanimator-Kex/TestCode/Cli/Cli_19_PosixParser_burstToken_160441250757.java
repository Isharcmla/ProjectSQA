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

public class PosixParser_burstToken_160441250757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30906;
     Object term30951;

    public PosixParser_burstToken_160441250757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30906 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        term30951 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term30951, term30951.getClass(), "tokens", null);
        setBooleanField(term30951, term30951.getClass(), "eatTheRest", false);
        setField(term30951, term30951.getClass(), "currentOption", null);
        setField(term30951, term30951.getClass(), "options", null);
        setField(term30951, term30951.getClass(), "cmd", null);
        setField(term30951, term30951.getClass(), "requiredOptions", null);
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
        callMethod(klass, "burstToken", argTypes, term30906, args);
        assertTrue(recursiveEquals(term30906, term30951));
    }

};


