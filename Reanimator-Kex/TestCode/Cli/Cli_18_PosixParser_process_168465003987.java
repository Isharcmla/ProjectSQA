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

public class PosixParser_process_168465003987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40778;
     Object term40842;

    public PosixParser_process_168465003987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term40830 = new ArrayList();
        term40778 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term40778, term40778.getClass(), "currentOption", null);
        setBooleanField(term40778, term40778.getClass(), "eatTheRest", false);
        setField(term40778, term40778.getClass(), "tokens", term40830);
        ArrayList term40843 = new ArrayList();
        ((ArrayList) term40843).add("--");
        ((ArrayList) term40843).add((Object)null);
        term40842 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term40842, term40842.getClass(), "tokens", term40843);
        setBooleanField(term40842, term40842.getClass(), "eatTheRest", true);
        setField(term40842, term40842.getClass(), "currentOption", null);
        setField(term40842, term40842.getClass(), "options", null);
        setField(term40842, term40842.getClass(), "cmd", null);
        setField(term40842, term40842.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term40778, args);
        assertTrue(recursiveEquals(term40778, term40842));
    }

};


