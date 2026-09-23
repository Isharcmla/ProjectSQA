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

public class OptionGroup_toString_126656942217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598;
     Object term2191;

    public OptionGroup_toString_126656942217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term599 = new HashMap();
        term598 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term598, term598.getClass(), "optionMap", term599);
        setField(term598, term598.getClass(), "selected", "BYqFIqCKAV");
        setBooleanField(term598, term598.getClass(), "required", false);
        HashMap term2192 = new HashMap();
        term2191 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term2191, term2191.getClass(), "optionMap", term2192);
        setField(term2191, term2191.getClass(), "selected", "BYqFIqCKAV");
        setBooleanField(term2191, term2191.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term598, args);
        assertTrue(recursiveEquals(term598, term2191));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


