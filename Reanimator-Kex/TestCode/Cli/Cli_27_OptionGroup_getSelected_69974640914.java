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

public class OptionGroup_getSelected_69974640914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;
     Object term1753;

    public OptionGroup_getSelected_69974640914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term314 = new HashMap();
        term313 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term313, term313.getClass(), "optionMap", term314);
        setField(term313, term313.getClass(), "selected", "MxlszYVzRf");
        setBooleanField(term313, term313.getClass(), "required", false);
        HashMap term1754 = new HashMap();
        term1753 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term1753, term1753.getClass(), "optionMap", term1754);
        setField(term1753, term1753.getClass(), "selected", "MxlszYVzRf");
        setBooleanField(term1753, term1753.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSelected", argTypes, term313, args);
        assertTrue(recursiveEquals(term313, term1753));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};


