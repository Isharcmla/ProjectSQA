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

public class Option_setType_200695129351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551;
     Object term609;
     Object term5689;
     Object term5701;

    public Option_setType_200695129351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term604 = new ArrayList();
        term551 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term603 = newInstance(Class.forName("java.lang.Object"));
        setField(term551, term551.getClass(), "opt", "eZFUvlxvGV");
        setField(term551, term551.getClass(), "longOpt", "BYqFIqCKAV");
        setField(term551, term551.getClass(), "argName", "vrQLuWIDJX");
        setField(term551, term551.getClass(), "description", "flxyYxBRtu");
        setBooleanField(term551, term551.getClass(), "required", false);
        setBooleanField(term551, term551.getClass(), "optionalArg", true);
        setIntField(term551, term551.getClass(), "numberOfArgs", -1922583790);
        setField(term551, term551.getClass(), "type", term603);
        setField(term551, term551.getClass(), "values", term604);
        setCharField(term551, term551.getClass(), "valuesep", 't');
        term609 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5699 = new ArrayList();
        term5689 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term5698 = newInstance(Class.forName("java.lang.Object"));
        setField(term5689, term5689.getClass(), "opt", "eZFUvlxvGV");
        setField(term5689, term5689.getClass(), "longOpt", "BYqFIqCKAV");
        setField(term5689, term5689.getClass(), "argName", "vrQLuWIDJX");
        setField(term5689, term5689.getClass(), "description", "flxyYxBRtu");
        setBooleanField(term5689, term5689.getClass(), "required", false);
        setBooleanField(term5689, term5689.getClass(), "optionalArg", true);
        setIntField(term5689, term5689.getClass(), "numberOfArgs", -1922583790);
        setField(term5689, term5689.getClass(), "type", term5698);
        setField(term5689, term5689.getClass(), "values", term5699);
        setCharField(term5689, term5689.getClass(), "valuesep", 't');
        term5701 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term609;
        callMethod(klass, "setType", argTypes, term551, args);
        assertTrue(recursiveEquals(term551, term5689));
        assertTrue(recursiveEquals(term609, term5701));
    }

};


