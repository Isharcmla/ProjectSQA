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
     Object term237;
     Object term826;
     Object term806;

    public OptionGroup_getNames_119536567911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term238 = new HashMap();
        term237 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term237, term237.getClass(), "optionMap", term238);
        setField(term237, term237.getClass(), "selected", "NRdvgJlhkX");
        setBooleanField(term237, term237.getClass(), "required", false);
        HashMap term827 = new HashMap();
        term826 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term826, term826.getClass(), "optionMap", term827);
        setField(term826, term826.getClass(), "selected", "NRdvgJlhkX");
        setBooleanField(term826, term826.getClass(), "required", false);
        HashMap term807 = new HashMap();
        term806 = newInstance(Class.forName("java.util.HashMap$KeySet"));
        setField(term806, term806.getClass(), "this$0", term807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNames", argTypes, term237, args);
        assertTrue(recursiveEquals(term237, term826));
        assertTrue(recursiveEquals(retValue, term806));
    }

};


