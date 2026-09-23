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
     Object term509;
     Object term2038;

    public OptionGroup_getSelected_69974640914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term510 = new HashMap();
        term509 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term509, term509.getClass(), "optionMap", term510);
        setField(term509, term509.getClass(), "selected", "RkybSrpybU");
        setBooleanField(term509, term509.getClass(), "required", false);
        HashMap term2039 = new HashMap();
        term2038 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term2038, term2038.getClass(), "optionMap", term2039);
        setField(term2038, term2038.getClass(), "selected", "RkybSrpybU");
        setBooleanField(term2038, term2038.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSelected", argTypes, term509, args);
        assertTrue(recursiveEquals(term509, term2038));
        assertTrue(recursiveEquals(retValue, "RkybSrpybU"));
    }

};


