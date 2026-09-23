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
import java.util.ArrayList;

public class Option_addValueForProcessing_170509990927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2561;

    public Option_addValueForProcessing_170509990927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2613 = new ArrayList();
        term2561 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2561, term2561.getClass(), "opt", "xBsXSDjXYK");
        setField(term2561, term2561.getClass(), "longOpt", "sEnIVFtZuQ");
        setField(term2561, term2561.getClass(), "argName", "ZVecLZMLHF");
        setField(term2561, term2561.getClass(), "description", "fztQhjqwdP");
        setBooleanField(term2561, term2561.getClass(), "required", true);
        setBooleanField(term2561, term2561.getClass(), "optionalArg", false);
        setIntField(term2561, term2561.getClass(), "numberOfArgs", 1135664017);
        setField(term2561, term2561.getClass(), "type", null);
        setField(term2561, term2561.getClass(), "values", term2613);
        setCharField(term2561, term2561.getClass(), "valuesep", 'Q');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVpkWxjuki";
        callMethod(klass, "addValueForProcessing", argTypes, term2561, args);
    }

};


