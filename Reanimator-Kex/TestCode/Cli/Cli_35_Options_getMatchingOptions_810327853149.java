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
import java.util.HashMap;
import java.util.ArrayList;

public class Options_getMatchingOptions_810327853149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48445;
     Object term48507;
     Object term48496;

    public Options_getMatchingOptions_810327853149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term48493 = new HashMap();
        term48445 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term48445, term48445.getClass(), "longOpts", term48493);
        HashMap term48508 = new HashMap();
        term48507 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term48507, term48507.getClass(), "shortOpts", null);
        setField(term48507, term48507.getClass(), "longOpts", term48508);
        setField(term48507, term48507.getClass(), "requiredOpts", null);
        setField(term48507, term48507.getClass(), "optionGroups", null);
        term48496 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getMatchingOptions", argTypes, term48445, args);
        assertTrue(recursiveEquals(term48445, term48507));
        assertTrue(recursiveEquals(retValue, term48496));
    }

};


