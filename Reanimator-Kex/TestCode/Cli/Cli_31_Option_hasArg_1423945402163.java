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

public class Option_hasArg_1423945402163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23771;
     Object term23782;

    public Option_hasArg_1423945402163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23771 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term23771, term23771.getClass(), "numberOfArgs", 0);
        term23782 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23782, term23782.getClass(), "opt", null);
        setField(term23782, term23782.getClass(), "longOpt", null);
        setField(term23782, term23782.getClass(), "argName", null);
        setField(term23782, term23782.getClass(), "description", null);
        setBooleanField(term23782, term23782.getClass(), "required", false);
        setBooleanField(term23782, term23782.getClass(), "optionalArg", false);
        setIntField(term23782, term23782.getClass(), "numberOfArgs", 0);
        setField(term23782, term23782.getClass(), "type", null);
        setField(term23782, term23782.getClass(), "values", null);
        setCharField(term23782, term23782.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArg", argTypes, term23771, args);
        assertTrue(recursiveEquals(term23771, term23782));
        assertTrue(recursiveEquals(retValue, false));
    }

};


