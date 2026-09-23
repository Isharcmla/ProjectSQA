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
     Object term402;
     Object term1899;

    public OptionGroup_toString_126656942217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term403 = new HashMap();
        term402 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term402, term402.getClass(), "optionMap", term403);
        setField(term402, term402.getClass(), "selected", "aJlieCFVtF");
        setBooleanField(term402, term402.getClass(), "required", false);
        HashMap term1900 = new HashMap();
        term1899 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term1899, term1899.getClass(), "optionMap", term1900);
        setField(term1899, term1899.getClass(), "selected", "aJlieCFVtF");
        setBooleanField(term1899, term1899.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term402, args);
        assertTrue(recursiveEquals(term402, term1899));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


