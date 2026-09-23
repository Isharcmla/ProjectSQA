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

public class Option_hasArgs_521147701249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54693;
     Object term54702;

    public Option_hasArgs_521147701249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54693 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term54693, term54693.getClass(), "numberOfArgs", -2);
        term54702 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term54702, term54702.getClass(), "opt", null);
        setField(term54702, term54702.getClass(), "longOpt", null);
        setField(term54702, term54702.getClass(), "argName", null);
        setField(term54702, term54702.getClass(), "description", null);
        setBooleanField(term54702, term54702.getClass(), "required", false);
        setBooleanField(term54702, term54702.getClass(), "optionalArg", false);
        setIntField(term54702, term54702.getClass(), "numberOfArgs", -2);
        setField(term54702, term54702.getClass(), "type", null);
        setField(term54702, term54702.getClass(), "values", null);
        setCharField(term54702, term54702.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgs", argTypes, term54693, args);
        assertTrue(recursiveEquals(term54693, term54702));
        assertTrue(recursiveEquals(retValue, true));
    }

};


