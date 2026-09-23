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

public class OptionGroup_getNames_119536567911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128;
     Object term580;
     Object term560;

    public OptionGroup_getNames_119536567911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term129 = new HashMap();
        term128 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term128, term128.getClass(), "optionMap", term129);
        setField(term128, term128.getClass(), "selected", "EGtDIRbSSb");
        setBooleanField(term128, term128.getClass(), "required", false);
        HashMap term581 = new HashMap();
        term580 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term580, term580.getClass(), "optionMap", term581);
        setField(term580, term580.getClass(), "selected", "EGtDIRbSSb");
        setBooleanField(term580, term580.getClass(), "required", false);
        HashMap term561 = new HashMap();
        term560 = newInstance(Class.forName("java.util.HashMap$KeySet"));
        setField(term560, term560.getClass(), "this$0", term561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNames", argTypes, term128, args);
        assertTrue(recursiveEquals(term128, term580));
        assertTrue(recursiveEquals(retValue, term560));
    }

};


