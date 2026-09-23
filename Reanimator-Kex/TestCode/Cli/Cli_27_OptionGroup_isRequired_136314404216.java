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

public class OptionGroup_isRequired_136314404216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;
     Object term1844;

    public OptionGroup_isRequired_136314404216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term374 = new HashMap();
        term373 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term373, term373.getClass(), "optionMap", term374);
        setField(term373, term373.getClass(), "selected", "oVcInYnLWB");
        setBooleanField(term373, term373.getClass(), "required", true);
        HashMap term1845 = new HashMap();
        term1844 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term1844, term1844.getClass(), "optionMap", term1845);
        setField(term1844, term1844.getClass(), "selected", "oVcInYnLWB");
        setBooleanField(term1844, term1844.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRequired", argTypes, term373, args);
        assertTrue(recursiveEquals(term373, term1844));
    }

};


