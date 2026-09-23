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

public class PosixParser_gobble_93728277049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14429;
     Object term14511;
     Object term14777;
     Object term14778;

    public PosixParser_gobble_93728277049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14429 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term14429, term14429.getClass(), "eatTheRest", true);
        term14511 = newInstance(Class.forName("java.util.zip.ZipFile$ZipEntryIterator"));
        term14777 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term14777, term14777.getClass(), "tokens", null);
        setBooleanField(term14777, term14777.getClass(), "eatTheRest", true);
        setField(term14777, term14777.getClass(), "currentOption", null);
        setField(term14777, term14777.getClass(), "options", null);
        setField(term14777, term14777.getClass(), "cmd", null);
        setField(term14777, term14777.getClass(), "requiredOptions", null);
        term14778 = newInstance(Class.forName("java.util.zip.ZipFile$ZipEntryIterator"));
        setIntField(term14778, term14778.getClass(), "i", 0);
        setIntField(term14778, term14778.getClass(), "entryCount", 0);
        setField(term14778, term14778.getClass(), "gen", null);
        setField(term14778, term14778.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term14511;
        callMethod(klass, "gobble", argTypes, term14429, args);
        assertTrue(recursiveEquals(term14429, term14777));
        assertTrue(recursiveEquals(term14511, term14778));
    }

};


