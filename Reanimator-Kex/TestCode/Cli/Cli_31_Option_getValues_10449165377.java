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

public class Option_getValues_10449165377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3264;
     Object term10556;

    public Option_getValues_10449165377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3317 = new ArrayList();
        term3264 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3316 = newInstance(Class.forName("java.lang.Object"));
        setField(term3264, term3264.getClass(), "opt", "gCWtLVKVVe");
        setField(term3264, term3264.getClass(), "longOpt", "fWKJoSoCwE");
        setField(term3264, term3264.getClass(), "argName", "wfaXBpWAUH");
        setField(term3264, term3264.getClass(), "description", "VMeAzAHwZj");
        setBooleanField(term3264, term3264.getClass(), "required", false);
        setBooleanField(term3264, term3264.getClass(), "optionalArg", false);
        setIntField(term3264, term3264.getClass(), "numberOfArgs", -73683645);
        setField(term3264, term3264.getClass(), "type", term3316);
        setField(term3264, term3264.getClass(), "values", term3317);
        setCharField(term3264, term3264.getClass(), "valuesep", 'x');
        ArrayList term10566 = new ArrayList();
        term10556 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term10565 = newInstance(Class.forName("java.lang.Object"));
        setField(term10556, term10556.getClass(), "opt", "gCWtLVKVVe");
        setField(term10556, term10556.getClass(), "longOpt", "fWKJoSoCwE");
        setField(term10556, term10556.getClass(), "argName", "wfaXBpWAUH");
        setField(term10556, term10556.getClass(), "description", "VMeAzAHwZj");
        setBooleanField(term10556, term10556.getClass(), "required", false);
        setBooleanField(term10556, term10556.getClass(), "optionalArg", false);
        setIntField(term10556, term10556.getClass(), "numberOfArgs", -73683645);
        setField(term10556, term10556.getClass(), "type", term10565);
        setField(term10556, term10556.getClass(), "values", term10566);
        setCharField(term10556, term10556.getClass(), "valuesep", 'x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValues", argTypes, term3264, args);
        assertTrue(recursiveEquals(term3264, term10556));
        assertTrue(recursiveEquals(retValue, null));
    }

};


