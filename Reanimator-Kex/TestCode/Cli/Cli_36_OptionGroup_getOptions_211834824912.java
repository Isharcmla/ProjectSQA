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
     Object term266;
     Object term871;
     Object term851;

    public OptionGroup_getOptions_211834824912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term267 = new HashMap();
        term266 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term266, term266.getClass(), "optionMap", term267);
        setField(term266, term266.getClass(), "selected", "uuaPigETmJ");
        setBooleanField(term266, term266.getClass(), "required", true);
        HashMap term872 = new HashMap();
        term871 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term871, term871.getClass(), "optionMap", term872);
        setField(term871, term871.getClass(), "selected", "uuaPigETmJ");
        setBooleanField(term871, term871.getClass(), "required", true);
        HashMap term852 = new HashMap();
        term851 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term851, term851.getClass(), "this$0", term852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptions", argTypes, term266, args);
        assertTrue(recursiveEquals(term266, term871));
        assertTrue(recursiveEquals(retValue, term851));
    }

};


