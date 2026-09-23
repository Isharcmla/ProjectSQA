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

public class PosixParser_gobble_93728277079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38021;
     Object term38103;
     Object term38111;
     Object term38112;

    public PosixParser_gobble_93728277079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38021 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term38021, term38021.getClass(), "eatTheRest", true);
        term38103 = newInstance(Class.forName("java.util.zip.ZipFile$ZipEntryIterator"));
        term38111 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term38111, term38111.getClass(), "tokens", null);
        setBooleanField(term38111, term38111.getClass(), "eatTheRest", true);
        setField(term38111, term38111.getClass(), "currentOption", null);
        setField(term38111, term38111.getClass(), "options", null);
        setField(term38111, term38111.getClass(), "cmd", null);
        setField(term38111, term38111.getClass(), "requiredOptions", null);
        term38112 = newInstance(Class.forName("java.util.zip.ZipFile$ZipEntryIterator"));
        setIntField(term38112, term38112.getClass(), "i", 0);
        setIntField(term38112, term38112.getClass(), "entryCount", 0);
        setField(term38112, term38112.getClass(), "gen", null);
        setField(term38112, term38112.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term38103;
        callMethod(klass, "gobble", argTypes, term38021, args);
        assertTrue(recursiveEquals(term38021, term38111));
        assertTrue(recursiveEquals(term38103, term38112));
    }

};


