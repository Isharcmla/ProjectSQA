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

public class Option_hashCode_151345301782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3719;
     Object term11299;

    public Option_hashCode_151345301782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3771 = new ArrayList();
        term3719 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3719, term3719.getClass(), "opt", "XkIoWJRNwN");
        setField(term3719, term3719.getClass(), "longOpt", "aNWLJdrZMq");
        setField(term3719, term3719.getClass(), "argName", "HHmNoYxIGj");
        setField(term3719, term3719.getClass(), "description", "PtirvZmsGt");
        setBooleanField(term3719, term3719.getClass(), "required", false);
        setBooleanField(term3719, term3719.getClass(), "optionalArg", false);
        setIntField(term3719, term3719.getClass(), "numberOfArgs", -469968304);
        setField(term3719, term3719.getClass(), "type", null);
        setField(term3719, term3719.getClass(), "values", term3771);
        setCharField(term3719, term3719.getClass(), "valuesep", 'D');
        ArrayList term11308 = new ArrayList();
        term11299 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term11299, term11299.getClass(), "opt", "XkIoWJRNwN");
        setField(term11299, term11299.getClass(), "longOpt", "aNWLJdrZMq");
        setField(term11299, term11299.getClass(), "argName", "HHmNoYxIGj");
        setField(term11299, term11299.getClass(), "description", "PtirvZmsGt");
        setBooleanField(term11299, term11299.getClass(), "required", false);
        setBooleanField(term11299, term11299.getClass(), "optionalArg", false);
        setIntField(term11299, term11299.getClass(), "numberOfArgs", -469968304);
        setField(term11299, term11299.getClass(), "type", null);
        setField(term11299, term11299.getClass(), "values", term11308);
        setCharField(term11299, term11299.getClass(), "valuesep", 'D');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3719, args);
        assertTrue(recursiveEquals(term3719, term11299));
        assertTrue(recursiveEquals(retValue, 1529732137));
    }

};


