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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Option_toString_1002693327186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30940;

    public Option_toString_1002693327186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30976 = Class.forName((String) "java.util.stream.PipelineHelper");
        term30940 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term30940, term30940.getClass(), "opt", null);
        setField(term30940, term30940.getClass(), "longOpt", null);
        setIntField(term30940, term30940.getClass(), "numberOfArgs", 0);
        setField(term30940, term30940.getClass(), "description", null);
        setField(term30940, term30940.getClass(), "type", term30976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term30940, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


