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
import java.lang.Object;
import java.util.ArrayList;

public class PosixParser_process_168465003947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27303;
     Object term27445;

    public PosixParser_process_168465003947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27419 = new ArrayList();
        term27303 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term27367 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term27367, term27367.getClass(), "numberOfArgs", 0);
        setField(term27303, term27303.getClass(), "currentOption", term27367);
        setBooleanField(term27303, term27303.getClass(), "eatTheRest", false);
        setField(term27303, term27303.getClass(), "tokens", term27419);
        ArrayList term27446 = new ArrayList();
        ((ArrayList) term27446).add("--");
        ((ArrayList) term27446).add((Object)null);
        term27445 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term27450 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term27445, term27445.getClass(), "tokens", term27446);
        setBooleanField(term27445, term27445.getClass(), "eatTheRest", true);
        setField(term27450, term27450.getClass(), "opt", null);
        setField(term27450, term27450.getClass(), "longOpt", null);
        setField(term27450, term27450.getClass(), "argName", null);
        setField(term27450, term27450.getClass(), "description", null);
        setBooleanField(term27450, term27450.getClass(), "required", false);
        setBooleanField(term27450, term27450.getClass(), "optionalArg", false);
        setIntField(term27450, term27450.getClass(), "numberOfArgs", 0);
        setField(term27450, term27450.getClass(), "type", null);
        setField(term27450, term27450.getClass(), "values", null);
        setCharField(term27450, term27450.getClass(), "valuesep", (char) 0);
        setField(term27445, term27445.getClass(), "currentOption", term27450);
        setField(term27445, term27445.getClass(), "options", null);
        setField(term27445, term27445.getClass(), "cmd", null);
        setField(term27445, term27445.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term27303, args);
        assertTrue(recursiveEquals(term27303, term27445));
    }

};


