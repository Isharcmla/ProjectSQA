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

public class OptionGroup_getOptions_211834824912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;
     Object term625;
     Object term605;

    public OptionGroup_getOptions_211834824912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term158 = new HashMap();
        term157 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term157, term157.getClass(), "optionMap", term158);
        setField(term157, term157.getClass(), "selected", "SzjVpOQTyS");
        setBooleanField(term157, term157.getClass(), "required", true);
        HashMap term626 = new HashMap();
        term625 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term625, term625.getClass(), "optionMap", term626);
        setField(term625, term625.getClass(), "selected", "SzjVpOQTyS");
        setBooleanField(term625, term625.getClass(), "required", true);
        HashMap term606 = new HashMap();
        term605 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term605, term605.getClass(), "this$0", term606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptions", argTypes, term157, args);
        assertTrue(recursiveEquals(term157, term625));
        assertTrue(recursiveEquals(retValue, term605));
    }

};


