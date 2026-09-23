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
import java.util.ArrayList;

public class Option_getOpt_118953974449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353;
     Object term5302;

    public Option_getOpt_118953974449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term405 = new ArrayList();
        term353 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term353, term353.getClass(), "opt", "aJlieCFVtF");
        setField(term353, term353.getClass(), "longOpt", "ZiaGIbnzTs");
        setField(term353, term353.getClass(), "argName", "tbcdzjIfER");
        setField(term353, term353.getClass(), "description", "HyxfbSQYBe");
        setBooleanField(term353, term353.getClass(), "required", true);
        setBooleanField(term353, term353.getClass(), "optionalArg", true);
        setIntField(term353, term353.getClass(), "numberOfArgs", 1484323161);
        setField(term353, term353.getClass(), "type", null);
        setField(term353, term353.getClass(), "values", term405);
        setCharField(term353, term353.getClass(), "valuesep", 'E');
        ArrayList term5311 = new ArrayList();
        term5302 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term5302, term5302.getClass(), "opt", "aJlieCFVtF");
        setField(term5302, term5302.getClass(), "longOpt", "ZiaGIbnzTs");
        setField(term5302, term5302.getClass(), "argName", "tbcdzjIfER");
        setField(term5302, term5302.getClass(), "description", "HyxfbSQYBe");
        setBooleanField(term5302, term5302.getClass(), "required", true);
        setBooleanField(term5302, term5302.getClass(), "optionalArg", true);
        setIntField(term5302, term5302.getClass(), "numberOfArgs", 1484323161);
        setField(term5302, term5302.getClass(), "type", null);
        setField(term5302, term5302.getClass(), "values", term5311);
        setCharField(term5302, term5302.getClass(), "valuesep", 'E');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOpt", argTypes, term353, args);
        assertTrue(recursiveEquals(term353, term5302));
        assertTrue(recursiveEquals(retValue, "aJlieCFVtF"));
    }

};


